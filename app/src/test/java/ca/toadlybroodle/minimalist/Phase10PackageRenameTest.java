package ca.toadlybroodle.minimalist;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Package-rename guard. Phase 10.2 moved `ca.toadlybroodledev.sublist` →
 * `ca.toadlybroodledev.minimalist`; Phase 12 then dropped the vanity `dev`
 * segment, landing on `ca.toadlybroodle.minimalist`. Assertions below track the
 * current expected package; the negative checks still pin the original
 * `ca.toadlybroodledev.sublist` as gone.
 *
 * Covers four surfaces:
 *
 *  (a) build.gradle.kts namespace + applicationId
 *  (b) source-tree relocation: every file under app/src/main/java/ca/toadlybroodle/minimalist/
 *      (and the test counterpart); the old .../sublist/ directory must be gone
 *  (c) app-referring class renames per the spec list — SublistDatabase → MinimaListDatabase,
 *      SublistFragment → OutlineFragment, WelcomeSublistFragment → WelcomeFragment,
 *      SearchSublistFragment → SearchFragment — while domain types stay (SublistEntity,
 *      SublistDao, SublistRenderer)
 *  (d) layout custom-view tag prefixes + AndroidManifest references switched to .minimalist
 *  (e) legacy-package data-migration stub exists in AppMain (or a co-located helper) and
 *      references the old applicationId so a future shared-UID or adb-pull workflow has a hook
 */
public class Phase10PackageRenameTest {

    private File projectRoot() {
        File dir = new File(System.getProperty("user.dir"));
        while (dir != null) {
            if (new File(dir, "settings.gradle.kts").exists()) return dir;
            dir = dir.getParentFile();
        }
        throw new IllegalStateException("Cannot find project root");
    }

    private String read(String rel) {
        try {
            return new String(Files.readAllBytes(new File(projectRoot(), rel).toPath()));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private boolean exists(String rel) {
        return new File(projectRoot(), rel).exists();
    }

    // ---- (a) build.gradle.kts -----------------------------------------------

    @Test
    public void appBuildGradleUsesMinimalistNamespaceAndApplicationId() {
        String src = read("app/build.gradle.kts");
        assertTrue("namespace must be ca.toadlybroodle.minimalist (Phase 12)",
                src.contains("namespace = \"ca.toadlybroodle.minimalist\""));
        assertTrue("applicationId must be ca.toadlybroodle.minimalist (Phase 12)",
                src.contains("applicationId = \"ca.toadlybroodle.minimalist\""));
        assertFalse("build.gradle.kts must not still reference the old sublist namespace",
                src.contains("namespace = \"ca.toadlybroodledev.sublist\""));
        assertFalse("build.gradle.kts must not still reference the old sublist applicationId",
                src.contains("applicationId = \"ca.toadlybroodledev.sublist\""));
        // Debug suffix preserved per scaffold rule.
        assertTrue("debug applicationIdSuffix must still be .dev (scaffold contract)",
                src.contains("applicationIdSuffix = \".dev\""));
    }

    // ---- (b) source-tree relocation -----------------------------------------

    @Test
    public void mainSourceDirectoryRelocated() {
        assertTrue("new main src dir app/src/main/java/ca/toadlybroodle/minimalist/ must exist",
                exists("app/src/main/java/ca/toadlybroodle/minimalist"));
        assertFalse("old main src dir app/src/main/java/ca/toadlybroodledev/sublist/ must be gone",
                exists("app/src/main/java/ca/toadlybroodledev/sublist"));
    }

    @Test
    public void testSourceDirectoryRelocated() {
        assertTrue("new test src dir app/src/test/java/ca/toadlybroodle/minimalist/ must exist",
                exists("app/src/test/java/ca/toadlybroodle/minimalist"));
        assertFalse("old test src dir app/src/test/java/ca/toadlybroodledev/sublist/ must be gone",
                exists("app/src/test/java/ca/toadlybroodledev/sublist"));
    }

    @Test
    public void mainSourceFilesDeclareMinimalistPackages() {
        // Every Java file in the active main tree must declare a `package ca.toadlybroodle.minimalist*` line.
        File mainRoot = new File(projectRoot(),
                "app/src/main/java/ca/toadlybroodle/minimalist");
        walkAndAssertPackage(mainRoot, "ca.toadlybroodle.minimalist");
    }

    @Test
    public void testSourceFilesDeclareMinimalistPackages() {
        File testRoot = new File(projectRoot(),
                "app/src/test/java/ca/toadlybroodle/minimalist");
        walkAndAssertPackage(testRoot, "ca.toadlybroodle.minimalist");
    }

    private void walkAndAssertPackage(File dir, String expectedPrefix) {
        assertTrue("source root must exist: " + dir, dir.isDirectory());
        File[] kids = dir.listFiles();
        if (kids == null) return;
        // Legacy package literal built via concatenation so this test's own source
        // does not contain the substring as a single span — keeps a future
        // sed-style bulk-rename from accidentally rewriting these negative checks.
        final String legacyPkg = "ca.toadlybroodledev." + "sublist";
        for (File f : kids) {
            if (f.isDirectory()) {
                walkAndAssertPackage(f, expectedPrefix);
            } else if (f.getName().endsWith(".java")) {
                // Skip this test file — it intentionally references the legacy
                // package name in negative-check string literals.
                if (f.getName().equals("Phase10PackageRenameTest.java")) continue;
                String body;
                try {
                    body = new String(Files.readAllBytes(f.toPath()));
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
                assertTrue(f + " must declare a package under " + expectedPrefix,
                        body.contains("package " + expectedPrefix));
                assertFalse(f + " must not retain a legacy package declaration",
                        body.contains("package " + legacyPkg));
                assertFalse(f + " must not retain a legacy import reference",
                        body.contains("import " + legacyPkg + "."));
            }
        }
    }

    // ---- (c) class renames --------------------------------------------------

    @Test
    public void sublistDatabaseRenamedToMinimaListDatabase() {
        assertTrue("MinimaListDatabase.java must exist under db/",
                exists("app/src/main/java/ca/toadlybroodle/minimalist/db/MinimaListDatabase.java"));
        assertFalse("SublistDatabase.java must be gone (renamed)",
                exists("app/src/main/java/ca/toadlybroodle/minimalist/db/SublistDatabase.java"));
        String src = read(
                "app/src/main/java/ca/toadlybroodle/minimalist/db/MinimaListDatabase.java");
        assertTrue("MinimaListDatabase must declare class MinimaListDatabase",
                src.contains("class MinimaListDatabase"));
        assertFalse("MinimaListDatabase must not still declare class SublistDatabase",
                src.contains("class SublistDatabase"));
    }

    @Test
    public void sublistFragmentRenamedToOutlineFragment() {
        assertTrue("OutlineFragment.java must exist at the new path",
                exists("app/src/main/java/ca/toadlybroodle/minimalist/OutlineFragment.java"));
        assertFalse("SublistFragment.java must be gone (renamed to OutlineFragment)",
                exists("app/src/main/java/ca/toadlybroodle/minimalist/SublistFragment.java"));
        String src = read(
                "app/src/main/java/ca/toadlybroodle/minimalist/OutlineFragment.java");
        assertTrue("OutlineFragment must declare class OutlineFragment",
                src.contains("class OutlineFragment"));
    }

    @Test
    public void welcomeSublistFragmentRenamedToWelcomeFragment() {
        assertTrue("WelcomeFragment.java must exist at the new path",
                exists("app/src/main/java/ca/toadlybroodle/minimalist/WelcomeFragment.java"));
        assertFalse("WelcomeSublistFragment.java must be gone (renamed)",
                exists(
                  "app/src/main/java/ca/toadlybroodle/minimalist/WelcomeSublistFragment.java"));
        String src = read(
                "app/src/main/java/ca/toadlybroodle/minimalist/WelcomeFragment.java");
        assertTrue("WelcomeFragment must extend OutlineFragment",
                src.contains("extends OutlineFragment"));
    }

    @Test
    public void searchSublistFragmentRenamedToSearchFragment() {
        assertTrue("SearchFragment.java must exist at the new path",
                exists("app/src/main/java/ca/toadlybroodle/minimalist/SearchFragment.java"));
        assertFalse("SearchSublistFragment.java must be gone (renamed)",
                exists(
                  "app/src/main/java/ca/toadlybroodle/minimalist/SearchSublistFragment.java"));
        String src = read(
                "app/src/main/java/ca/toadlybroodle/minimalist/SearchFragment.java");
        assertTrue("SearchFragment must extend OutlineFragment",
                src.contains("extends OutlineFragment"));
    }

    @Test
    public void domainSublistTypesPreserved() {
        // The spec explicitly carves out Sublist* names that refer to the domain
        // object (a "sublist" is still a named outline within MinimaList).
        assertTrue("SublistEntity.java must still exist (domain type)",
                exists(
                  "app/src/main/java/ca/toadlybroodle/minimalist/db/entity/SublistEntity.java"));
        assertTrue("SublistDao.java must still exist (domain type)",
                exists(
                  "app/src/main/java/ca/toadlybroodle/minimalist/db/dao/SublistDao.java"));
        assertTrue("SublistRenderer.java must still exist (domain type)",
                exists(
                  "app/src/main/java/ca/toadlybroodle/minimalist/SublistRenderer.java"));
        // NewSublistDialog creates a domain sublist; keep too.
        assertTrue("NewSublistDialog.java must still exist (domain creator)",
                exists(
                  "app/src/main/java/ca/toadlybroodle/minimalist/NewSublistDialog.java"));
    }

    // ---- (d) layout custom-view tag prefixes + manifest --------------------

    @Test
    public void layoutMainUsesMinimalistViewTags() {
        String xml = read("app/src/main/res/layout/activity_main.xml");
        assertTrue("activity_main.xml must reference minimalist.DrawerCustomLayout",
                xml.contains("ca.toadlybroodle.minimalist.DrawerCustomLayout"));
        assertTrue("activity_main.xml must reference minimalist.OutlineFab",
                xml.contains("ca.toadlybroodle.minimalist.OutlineFab"));
        assertFalse("activity_main.xml must not reference the old sublist package prefix",
                xml.contains("ca.toadlybroodledev.sublist."));
    }

    @Test
    public void layoutLargeMainUsesMinimalistViewTags() {
        String xml = read("app/src/main/res/layout-large/activity_main.xml");
        assertTrue("layout-large activity_main.xml must reference minimalist.DrawerCustomLayout",
                xml.contains("ca.toadlybroodle.minimalist.DrawerCustomLayout"));
        assertTrue("layout-large activity_main.xml must reference minimalist.OutlineFab",
                xml.contains("ca.toadlybroodle.minimalist.OutlineFab"));
        assertFalse(
                "layout-large activity_main.xml must not reference the old sublist package prefix",
                xml.contains("ca.toadlybroodledev.sublist."));
    }

    @Test
    public void androidManifestDoesNotReferenceOldSublistPackage() {
        String xml = read("app/src/main/AndroidManifest.xml");
        assertFalse("AndroidManifest.xml body must not retain ca.toadlybroodledev.sublist references",
                xml.contains("ca.toadlybroodledev.sublist"));
    }

    // ---- (e) legacy-package data-migration stub -----------------------------

    @Test
    public void appMainExposesLegacyPackageMigrationStub() {
        String src = read("app/src/main/java/ca/toadlybroodle/minimalist/AppMain.java");
        // The migration is best-effort under standard Android sandboxing, but the
        // hook must exist and must name the old applicationId so a future shared-UID
        // or adb-pull workflow knows where to look.
        assertTrue(
                "AppMain must reference the old applicationId so the legacy-package " +
                        "migration stub is wired in (Phase 10.2)",
                src.contains("ca.toadlybroodledev.sublist"));
        assertTrue("AppMain must declare a migrateLegacyPackage method or call site",
                src.contains("migrateLegacyPackage") || src.contains("legacyPackage"));
    }

    @Test
    public void renameMapDocumentsPhase102Targets() {
        String map = read("docs/RENAME-MAP.md");
        // The Phase 2 names were jadx-assigned; Phase 10.2 supersedes the four
        // app-referring fragment / database names. The rename map must record the
        // new bindings so the historical record stays consistent.
        assertTrue("RENAME-MAP.md must document SublistDatabase → MinimaListDatabase",
                map.contains("MinimaListDatabase"));
        assertTrue("RENAME-MAP.md must document SublistFragment → OutlineFragment",
                map.contains("OutlineFragment"));
    }
}
