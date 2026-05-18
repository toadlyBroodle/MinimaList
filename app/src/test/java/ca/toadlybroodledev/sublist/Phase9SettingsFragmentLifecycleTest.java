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

    private static final String SETTINGS_FRAGMENT =
            "app/src/main/java/ca/toadlybroodledev/sublist/SettingsFragment.java";

    @Test
    public void doImportReplaceHasFragmentAttachedGuard() {
        String src = readSource(SETTINGS_FRAGMENT);
        // The success main.post() lambda inside doImportReplace must guard against the fragment
        // being detached before it runs.
        assertTrue(
                "doImportReplace's main.post success lambda must call isAdded() to guard " +
                "against fragment detachment (rotation during IO)",
                src.contains("isAdded()"));
    }

    @Test
    public void doImportMergeHasFragmentAttachedGuard() {
        String src = readSource(SETTINGS_FRAGMENT);
        // Same guard required in doImportMerge.
        assertTrue(
                "doImportMerge's main.post success lambda must call isAdded() to guard " +
                "against fragment detachment (rotation during IO)",
                src.contains("isAdded()"));
    }

    @Test
    public void doImportReplaceGuardChecksGetActivity() {
        String src = readSource(SETTINGS_FRAGMENT);
        assertTrue(
                "doImportReplace's lifecycle guard must also check getActivity() == null " +
                "to cover the brief window after detach before isAdded() returns false",
                src.contains("getActivity() == null"));
    }

    @Test
    public void doImportMergeGuardChecksGetActivity() {
        String src = readSource(SETTINGS_FRAGMENT);
        assertTrue(
                "doImportMerge's lifecycle guard must also check getActivity() == null",
                src.contains("getActivity() == null"));
    }
}
