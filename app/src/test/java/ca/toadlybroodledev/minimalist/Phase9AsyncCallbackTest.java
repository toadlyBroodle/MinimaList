package ca.toadlybroodledev.minimalist;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;

import static org.junit.Assert.assertTrue;

/**
 * Phase 9 async callback lifecycle safety (review of 3022088).
 *
 * mainActivityAsyncCallbackGuardedAgainstSavedState: m4755B's loadAllFromRepo callback
 *   runs on the main thread after a background Room query. If the activity is finishing,
 *   destroyed, or its fragment back-stack state has already been saved when the callback
 *   fires (rotation / backgrounding during first-launch importLegacy), calling
 *   FragmentTransaction.commit() throws IllegalStateException. The callback must check
 *   at least one of: isFinishing(), isDestroyed(), or FragmentManager.isStateSaved()
 *   before touching the fragment back-stack.
 */
public class Phase9AsyncCallbackTest {

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

    private static final String MAIN_ACTIVITY =
            "app/src/main/java/ca/toadlybroodledev/minimalist/MainActivity.java";

    @Test
    public void mainActivityAsyncCallbackGuardedAgainstSavedState() {
        String src = readSource(MAIN_ACTIVITY);
        assertTrue(
                "m4755B's loadAllFromRepo callback must guard against post-onSaveInstanceState " +
                "state via isFinishing(), isDestroyed(), or FragmentManager.isStateSaved() " +
                "before committing a FragmentTransaction",
                src.contains("isFinishing()") || src.contains("isStateSaved()") || src.contains("isDestroyed()"));
    }
}
