package ca.toadlybroodle.minimalist;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;

import static org.junit.Assert.assertTrue;

/**
 * Phase 10.8 supersedes the Phase 9.3 lifecycle guard.
 *
 * Old (Phase 9.3) pattern: guard each main.post() lambda with
 *   if (!isAdded() || getActivity() == null) return;
 * That guard is INSUFFICIENT for the SAF round-trip: opening an
 * ACTION_OPEN_DOCUMENT picker triggers MainActivity.onStop, which calls
 * mo4764a → mo4771b and detaches every current fragment. When the picker
 * returns and the import IO completes, isAdded() is false because
 * SettingsFragment is no longer the attached fragment — the import was
 * silently dropped.
 *
 * New (Phase 10.8) pattern: each of doImportReplace, doImportMerge, doImportTxt
 * captures `final HostContract host = this.f3881an;` BEFORE going async and
 * guards `if (host == null) return;` inside the main.post() lambda. The
 * captured host reference (the MainActivity) outlives the fragment detach,
 * so the import lands either way.
 *
 * Tests assert >= 3 occurrences of both lines — one per import method.
 * Removing the capture-and-guard from any one method drops the count below
 * 3 and fails the assertion. Counted with occurrence-counting (not
 * src.contains()) so a single occurrence in any one method would not give
 * a false pass.
 */
public class Phase9SettingsFragmentLifecycleTest {

    private File projectRoot() {
        File dir = new File(System.getProperty("user.dir"));
        while (dir != null) {
            if (new File(dir, "settings.gradle.kts").exists()) return dir;
            dir = dir.getParentFile();
        }
        throw new IllegalStateException("Cannot find project root");
    }

    private String readSource(String relativePath) {
        try {
            return new String(Files.readAllBytes(new File(projectRoot(), relativePath).toPath()));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private static int countOccurrences(String haystack, String needle) {
        int count = 0;
        int idx = 0;
        while ((idx = haystack.indexOf(needle, idx)) != -1) {
            count++;
            idx += needle.length();
        }
        return count;
    }

    private static final String SETTINGS_FRAGMENT =
            "app/src/main/java/ca/toadlybroodle/minimalist/SettingsFragment.java";

    @Test
    public void allImportMethodsCaptureHostBeforeAsync() {
        String src = readSource(SETTINGS_FRAGMENT);
        assertTrue(
                "doImportReplace, doImportMerge, and doImportTxt must each capture " +
                "`final HostContract host = this.f3881an;` BEFORE going async " +
                "(expected >= 3 occurrences). The captured reference is what " +
                "survives the SAF picker's onStop fragment detach.",
                countOccurrences(src, "final HostContract host = this.f3881an;") >= 3);
    }

    @Test
    public void allImportMethodsGuardHostInLambda() {
        String src = readSource(SETTINGS_FRAGMENT);
        assertTrue(
                "doImportReplace, doImportMerge, and doImportTxt must each guard " +
                "`if (host == null) return;` inside their main.post() success " +
                "lambda (expected >= 3 occurrences). Drops below 3 means one " +
                "method's guard was removed, re-opening the SAF-round-trip " +
                "data-loss hazard.",
                countOccurrences(src, "if (host == null) return;") >= 3);
    }
}
