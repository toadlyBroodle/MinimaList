package ca.toadlybroodledev.sublist;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;

import static org.junit.Assert.assertTrue;

/**
 * Phase 9.3 review follow-up: lifecycle guard in SettingsFragment import callbacks.
 *
 * doImportReplace and doImportMerge each dispatch IO work via AppMain.io().execute() and
 * post results back to the main thread. If the activity is destroyed (rotation, back-press)
 * between the IO dispatch and the main.post() callback firing, the lambda runs on a dead
 * fragment: this.f3881an.mo4769a(map) silently applies imported data to the old activity
 * instance; the new activity retains the pre-import state and the user's import is lost.
 *
 * Fix: add "if (!isAdded() || getActivity() == null) return;" at the top of each
 * main.post() success lambda in both doImportReplace and doImportMerge.
 *
 * Tests use occurrence-count checks (>= 2) so that removing the guard from either method
 * alone fails the test — bare src.contains() is insufficient because a single occurrence in
 * the other method would still return true.
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
            "app/src/main/java/ca/toadlybroodledev/sublist/SettingsFragment.java";

    @Test
    public void bothImportMethodsHaveIsAddedGuard() {
        String src = readSource(SETTINGS_FRAGMENT);
        assertTrue(
                "Both doImportReplace and doImportMerge must call isAdded() in their " +
                "main.post() success lambdas (expected >= 2 occurrences, one per method). " +
                "A single occurrence means one method's guard was removed, re-opening the " +
                "data-loss hazard on rotation during IO.",
                countOccurrences(src, "isAdded()") >= 2);
    }

    @Test
    public void bothImportMethodsHaveGetActivityGuard() {
        String src = readSource(SETTINGS_FRAGMENT);
        assertTrue(
                "Both doImportReplace and doImportMerge must check getActivity() == null in " +
                "their main.post() success lambdas (expected >= 2 occurrences, one per method). " +
                "A single occurrence means one method's guard was removed.",
                countOccurrences(src, "getActivity() == null") >= 2);
    }
}
