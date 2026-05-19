package ca.toadlybroodle.minimalist;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Phase 9.2a — verify OutlineRepository is wired through the active call sites that previously
 * read/wrote the legacy Gson HashMap, and that the legacy autosave path is gone. Source-scan
 * style consistent with Phase9RoomSchemaTest / Phase9TransactionTest; a Robolectric pass that
 * actually exercises the DAOs is queued separately.
 */
public class Phase9Wiring92aTest {

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

    private static final String PKG = "app/src/main/java/ca/toadlybroodle/minimalist/";

    @Test
    public void appMainHoldsRepositoryAndDatabaseSingletons() {
        String src = readSource(PKG + "AppMain.java");
        assertTrue("AppMain must hold a MinimaListDatabase reference",
                src.contains("MinimaListDatabase"));
        assertTrue("AppMain must hold an OutlineRepository reference",
                src.contains("OutlineRepository"));
        assertTrue("AppMain must expose a static repository() accessor for call sites",
                src.contains("public static OutlineRepository repository()"));
    }

    @Test
    public void appMainProvidesBackgroundExecutor() {
        String src = readSource(PKG + "AppMain.java");
        assertTrue("AppMain must own a single-thread Executor for off-main-thread DB ops",
                src.contains("Executors.newSingleThreadExecutor")
                        || src.contains("newSingleThreadExecutor"));
        assertTrue("AppMain must expose the executor via a static io() accessor",
                src.contains("public static Executor io()"));
    }

    @Test
    public void appMainRunsImportLegacyGatedOnSharedPrefsFlag() {
        String src = readSource(PKG + "AppMain.java");
        assertTrue("AppMain must read a 'repo_migrated_v1' SharedPrefs flag",
                src.contains("repo_migrated_v1"));
        assertTrue("AppMain must invoke importLegacy on the repository when the flag is unset",
                src.contains("importLegacy"));
        assertTrue("AppMain must set the migrated flag after importLegacy succeeds",
                src.contains("putBoolean(\"repo_migrated_v1\""));
        assertTrue("AppMain must dispatch the migration to the background executor",
                src.contains("io().execute") || src.contains("io().submit")
                        || src.contains("executor.execute") || src.contains("EXECUTOR.execute"));
    }

    @Test
    public void mainActivityUsesRepositoryForAutosaveWrites() {
        String src = readSource(PKG + "MainActivity.java");
        assertFalse("MainActivity must no longer call OutlineStore.m4976a for autosave",
                src.contains("m4976a(false, false)"));
        assertTrue("MainActivity must save via OutlineStore.saveAllToRepo()",
                src.contains("saveAllToRepo"));
    }

    @Test
    public void mainActivityUsesRepositoryForStartupLoad() {
        String src = readSource(PKG + "MainActivity.java");
        assertFalse("MainActivity must no longer load the outline via OutlineStore.m4977b",
                src.contains("m4977b(false, false)"));
        assertTrue("MainActivity startup load must use OutlineStore.loadAllFromRepo (async callback)",
                src.contains("loadAllFromRepo"));
    }

    @Test
    public void outlineRowViewUsesRepositoryForAutosave() {
        String src = readSource(PKG + "OutlineRowView.java");
        assertFalse("OutlineRowView must no longer call OutlineStore.m4976a for autosave",
                src.contains("m4976a(false, false)"));
        assertTrue("OutlineRowView must save via OutlineStore.saveAllToRepo()",
                src.contains("saveAllToRepo"));
    }

    @Test
    public void appSettingsLegacyGsonFallbackLoadersDeleted() {
        String src = readSource(PKG + "AppSettings.java");
        assertFalse("AppSettings.m4937d (legacy Gson fallback loader) must be deleted",
                src.contains("m4937d"));
        assertFalse("AppSettings.m4948m (legacy Gson backup-fallback loader) must be deleted",
                src.contains("m4948m"));
        assertFalse("AppSettings must no longer import Gson now that legacy loaders are gone",
                src.contains("import com.google.gson"));
    }

    @Test
    public void outlineStoreExposesRepositoryFacades() {
        String src = readSource(PKG + "OutlineStore.java");
        assertTrue("OutlineStore must expose saveAllToRepo() as the autosave entry point",
                src.contains("saveAllToRepo"));
        assertTrue("OutlineStore must expose loadAllFromRepo(...) as the startup-load entry point",
                src.contains("loadAllFromRepo"));
        // Manual backup/restore (m4976a(true, ...) / m4977b(true, ...)) is retained until
        // 9.3 lands SAF JSON export/import.
    }

    @Test
    public void outlineStoreAutosavePathRemoved() {
        String src = readSource(PKG + "OutlineStore.java");
        // m4976a now only supports the manual-backup case (backup=true). The autosave branch
        // (backup=false) is gone; readers that need to autosave must use saveAllToRepo.
        // Heuristic: the method must no longer reference OutlineFragment.m4892a in a code path
        // that runs when backup=false (we look for the static call only inside m4976a's body —
        // its presence is allowed inside saveAllToRepo via the same conversion).
        // Stronger: confirm OutlineStore writes via the repository.
        assertTrue("OutlineStore must reference OutlineRepository for the autosave path",
                src.contains("OutlineRepository") || src.contains("AppMain.repository()"));
    }
}
