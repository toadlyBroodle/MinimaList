package ca.toadlybroodledev.minimalist;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Guards against the two `catch (Error e)` sites inherited from the jadx-decompiled source.
 *
 * java.lang.Error does NOT catch RuntimeException / IndexOutOfBoundsException, so the two
 * blocks were dead code for their advertised hazard:
 *
 *   - OutlineFragment.onCreateOptionsMenu reads f3910ak.m4988a().get(f3898ao). If f3898ao
 *     was persisted from a session with a larger outline, get() throws IOOBE; the
 *     `catch (Error e)` doesn't catch it and the app crashes at menu inflate. Sister site
 *     onViewCreated already uses `catch (Exception e)` correctly.
 *   - MainActivity.onPause calls mo4761a(findViewById(...), false) to hide the IME. The
 *     surrounding `catch (Error e)` was clearly meant to swallow a null-view / IME-not-up
 *     RuntimeException — also missed by an Error-only catch.
 *
 * Same shape as a8e34de (OutlineTree.m4995b empty f3987b guard) and bd4b8ac
 * (MainActivity.onStop AIOOBE guard) — CRUD-audit prep before the hard 8.1 acceptance.
 */
public class CatchErrorAuditTest {

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

    private static final String OUTLINE_FRAGMENT =
            "app/src/main/java/ca/toadlybroodledev/minimalist/OutlineFragment.java";
    private static final String MAIN_ACTIVITY =
            "app/src/main/java/ca/toadlybroodledev/minimalist/MainActivity.java";

    @Test
    public void outlineFragmentMenuCatchesException() {
        String src = readSource(OUTLINE_FRAGMENT);
        // The onCreateOptionsMenu try/catch around m4988a().get(f3898ao) must catch
        // Exception, not Error, so IndexOutOfBoundsException is actually handled.
        int start = src.indexOf("onCreateOptionsMenu");
        assertTrue("onCreateOptionsMenu method must exist", start >= 0);
        int end = src.indexOf("public void onViewCreated", start);
        assertTrue("onViewCreated should appear after onCreateOptionsMenu", end > start);
        String methodBody = src.substring(start, end);
        assertTrue(
                "onCreateOptionsMenu must catch Exception (not Error) around the stale-index get()",
                methodBody.contains("catch (Exception"));
        assertFalse(
                "onCreateOptionsMenu must not retain the inherited catch (Error e) block",
                methodBody.contains("catch (Error"));
    }

    @Test
    public void mainActivityOnPauseCatchesException() {
        String src = readSource(MAIN_ACTIVITY);
        int start = src.indexOf("public void onPause()");
        assertTrue("onPause method must exist", start >= 0);
        int end = src.indexOf("protected void onPostCreate", start);
        assertTrue("onPostCreate should appear after onPause", end > start);
        String methodBody = src.substring(start, end);
        assertTrue(
                "onPause must catch Exception (not Error) around the IME-hide call",
                methodBody.contains("catch (Exception"));
        assertFalse(
                "onPause must not retain the inherited catch (Error e) block",
                methodBody.contains("catch (Error"));
    }
}
