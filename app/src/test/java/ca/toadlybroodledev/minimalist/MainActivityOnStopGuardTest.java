package ca.toadlybroodledev.minimalist;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;

import static org.junit.Assert.assertTrue;

/**
 * Guards the MainActivity.onStop fix for ArrayIndexOutOfBoundsException on fresh installs.
 *
 * On first launch with no sublists, or when f3941d == -1 (default SharedPrefs value),
 * calling f3702F.get(AppSettings.f3941d) inside onStop throws AIOOBE. The try/catch only
 * prints the stack trace — it doesn't prevent logcat noise and confuses crash analysis.
 * The fix adds an early-return guard before the OutlineStore.m4962a call.
 */
public class MainActivityOnStopGuardTest {

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
    public void onStopGuardsEmptyListBeforeOutlineStoreCall() {
        String src = readSource(MAIN_ACTIVITY);
        // The guard must check that f3702F is non-empty before indexing into it.
        assertTrue(
                "onStop must guard against empty f3702F before calling OutlineStore.m4962a",
                src.contains("f3702F.isEmpty()"));
    }

    @Test
    public void onStopGuardsNegativeIndexBeforeOutlineStoreCall() {
        String src = readSource(MAIN_ACTIVITY);
        // f3941d defaults to -1 on fresh install; guard requires it to be >= 0 before indexing.
        assertTrue(
                "onStop must guard against a negative AppSettings.f3941d before calling OutlineStore.m4962a",
                src.contains("f3941d >= 0") || src.contains("f3941d < 0") || src.contains("f3941d == -1"));
    }

    @Test
    public void onStopGuardsOutOfRangeIndex() {
        String src = readSource(MAIN_ACTIVITY);
        // Stale saved index can exceed the current list size after sublists are deleted.
        assertTrue(
                "onStop must guard against out-of-range AppSettings.f3941d before calling OutlineStore.m4962a",
                src.contains("f3941d < this.f3702F.size()") ||
                src.contains("f3941d < f3702F.size()") ||
                src.contains("AppSettings.f3941d < this.f3702F.size()") ||
                src.contains("AppSettings.f3941d < f3702F.size()") ||
                src.contains("f3941d >= this.f3702F.size()") ||
                src.contains("f3941d >= f3702F.size()") ||
                src.contains("AppSettings.f3941d >= this.f3702F.size()") ||
                src.contains("AppSettings.f3941d >= f3702F.size()"));
    }
}
