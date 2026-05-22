package ca.toadlybroodle.minimalist;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;

import static org.junit.Assert.assertTrue;

/**
 * Phase 15.1 + 15.3: LICENSE file at repo root + buildToolsVersion pin in app/build.gradle.kts.
 */
public class Phase15FdroidPrepTest {

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

    // --- 15.1: LICENSE file ---

    @Test
    public void licenseFileExistsAtRepoRoot() {
        assertTrue("LICENSE file must exist at the repo root",
                new File(projectRoot(), "LICENSE").exists());
    }

    @Test
    public void licenseFileContainsMitIdentifier() {
        String content = read("LICENSE");
        assertTrue("LICENSE must contain MIT license text",
                content.contains("MIT License") || content.contains("MIT"));
    }

    @Test
    public void licenseFileContainsPermissionGrant() {
        String content = read("LICENSE");
        // Standard MIT permission grant
        assertTrue("LICENSE must contain the MIT permission-grant text",
                content.contains("Permission is hereby granted") ||
                content.contains("permission is hereby granted"));
    }

    @Test
    public void licenseFileContainsCopyrightLine() {
        String content = read("LICENSE");
        assertTrue("LICENSE must contain a copyright statement",
                content.toLowerCase().contains("copyright"));
    }

    // --- 15.3: buildToolsVersion pin ---

    @Test
    public void buildGradleKtsPinsBuildToolsVersion() {
        String src = read("app/build.gradle.kts");
        assertTrue("app/build.gradle.kts must pin buildToolsVersion",
                src.contains("buildToolsVersion"));
    }

    @Test
    public void buildToolsVersionIsNonEmpty() {
        String src = read("app/build.gradle.kts");
        // Must be an actual version string, e.g. "34.0.0" or "35.0.0"
        assertTrue("buildToolsVersion must specify a concrete version",
                src.matches("(?s).*buildToolsVersion\\s*=\\s*\"[0-9]+\\.[0-9]+\\.[0-9]+\".*"));
    }

    // --- FDROID.md checkbox follow-up: Step 1 and Step 4 must be ticked after 15.1 + 15.3 shipped ---

    @Test
    public void fdroidMdStep1ChooseLicenseBoxTicked() {
        String doc = read("docs/FDROID.md");
        assertTrue("FDROID.md Step 1 'Choose a license' checkbox must be [x]",
                doc.contains("[x] Choose a license"));
    }

    @Test
    public void fdroidMdStep1AddLicenseFileBoxTicked() {
        String doc = read("docs/FDROID.md");
        assertTrue("FDROID.md Step 1 'Add LICENSE file' checkbox must be [x]",
                doc.contains("[x] Add `LICENSE` file at repo root"));
    }

    @Test
    public void fdroidMdStep4BuildToolsVersionBoxTicked() {
        String doc = read("docs/FDROID.md");
        assertTrue("FDROID.md Step 4 buildToolsVersion checkbox must be [x]",
                doc.matches("(?s).*\\[x\\] Add `buildToolsVersion.*"));
    }

    @Test
    public void fdroidMdPrerequisitesLicenseRowShowsDone() {
        String doc = read("docs/FDROID.md");
        // Exact table row must contain Done, not MISSING
        assertTrue("FDROID.md Prerequisites table must show LICENSE row as Done",
                doc.contains("| `LICENSE` file at repo root | **Done**"));
        assertTrue("FDROID.md Prerequisites table must not show LICENSE row as MISSING",
                !doc.contains("| `LICENSE` file at repo root | **MISSING**"));
    }

    @Test
    public void fdroidMdPrerequisitesBuildToolsVersionRowShowsDone() {
        String doc = read("docs/FDROID.md");
        // Exact table row must contain Done, not MISSING
        assertTrue("FDROID.md Prerequisites table must show buildToolsVersion row as Done",
                doc.contains("| `buildToolsVersion` pin | **Done**"));
        assertTrue("FDROID.md Prerequisites table must not show buildToolsVersion row as MISSING",
                !doc.contains("| `buildToolsVersion` pin | **MISSING**"));
    }
}
