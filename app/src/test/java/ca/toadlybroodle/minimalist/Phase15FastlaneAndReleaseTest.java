package ca.toadlybroodle.minimalist;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Phase 15.2 + 15.4 + 15.5: fastlane metadata, v107 release tag/docs, fdroiddata YAML draft.
 */
public class Phase15FastlaneAndReleaseTest {

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
            return new String(Files.readAllBytes(new File(projectRoot(), rel).toPath())).trim();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private byte[] readBytes(String rel) {
        try {
            return Files.readAllBytes(new File(projectRoot(), rel).toPath());
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    // ── 15.2: fastlane metadata ────────────────────────────────────────────

    @Test
    public void fastlaneDirExists() {
        assertTrue("fastlane/metadata/android/en-US/ must exist",
                new File(projectRoot(), "fastlane/metadata/android/en-US").isDirectory());
    }

    @Test
    public void shortDescriptionExists() {
        assertTrue("fastlane/.../short_description.txt must exist",
                new File(projectRoot(), "fastlane/metadata/android/en-US/short_description.txt").exists());
    }

    @Test
    public void shortDescriptionWithin80Chars() {
        String s = read("fastlane/metadata/android/en-US/short_description.txt");
        assertTrue("short_description.txt must be ≤ 80 chars, got " + s.length(), s.length() <= 80);
        assertTrue("short_description.txt must not be empty", s.length() > 0);
    }

    @Test
    public void fullDescriptionExists() {
        assertTrue("fastlane/.../full_description.txt must exist",
                new File(projectRoot(), "fastlane/metadata/android/en-US/full_description.txt").exists());
    }

    @Test
    public void fullDescriptionWithin4000Chars() {
        String s = read("fastlane/metadata/android/en-US/full_description.txt");
        assertTrue("full_description.txt must be ≤ 4000 chars, got " + s.length(), s.length() <= 4000);
        assertTrue("full_description.txt must not be empty", s.length() > 0);
    }

    @Test
    public void titleExists() {
        assertTrue("fastlane/.../title.txt must exist",
                new File(projectRoot(), "fastlane/metadata/android/en-US/title.txt").exists());
    }

    @Test
    public void titleWithin50Chars() {
        String s = read("fastlane/metadata/android/en-US/title.txt");
        assertTrue("title.txt must be ≤ 50 chars, got " + s.length(), s.length() <= 50);
        assertTrue("title.txt must not be empty", s.length() > 0);
    }

    @Test
    public void changelog107Exists() {
        assertTrue("fastlane/.../changelogs/107.txt must exist",
                new File(projectRoot(), "fastlane/metadata/android/en-US/changelogs/107.txt").exists());
    }

    @Test
    public void changelog107Within500Chars() {
        String s = read("fastlane/metadata/android/en-US/changelogs/107.txt");
        assertTrue("changelogs/107.txt must be ≤ 500 chars, got " + s.length(), s.length() <= 500);
        assertTrue("changelogs/107.txt must not be empty", s.length() > 0);
    }

    @Test
    public void iconPngExists() {
        assertTrue("fastlane/.../images/icon.png must exist",
                new File(projectRoot(), "fastlane/metadata/android/en-US/images/icon.png").exists());
    }

    @Test
    public void iconPngIs512x512() {
        byte[] b = readBytes("fastlane/metadata/android/en-US/images/icon.png");
        // PNG IHDR: bytes 16-19 = width, bytes 20-23 = height (big-endian)
        assertTrue("icon.png must be a valid PNG (≥ 24 bytes)", b.length >= 24);
        int w = ((b[16] & 0xFF) << 24) | ((b[17] & 0xFF) << 16) | ((b[18] & 0xFF) << 8) | (b[19] & 0xFF);
        int h = ((b[20] & 0xFF) << 24) | ((b[21] & 0xFF) << 16) | ((b[22] & 0xFF) << 8) | (b[23] & 0xFF);
        assertEquals("icon.png width must be 512", 512, w);
        assertEquals("icon.png height must be 512", 512, h);
    }

    @Test
    public void fdroidMdStep2BoxesTicked() {
        String doc = read("docs/FDROID.md");
        assertTrue("FDROID.md Step 2 'short_description.txt' checkbox must be [x]",
                doc.contains("[x] Write `short_description.txt`"));
        assertTrue("FDROID.md Step 2 'full_description.txt' checkbox must be [x]",
                doc.contains("[x] Write `full_description.txt`"));
        assertTrue("FDROID.md Step 2 'changelogs/107.txt' checkbox must be [x]",
                doc.contains("[x] Add `changelogs/107.txt`"));
        assertTrue("FDROID.md Step 2 'icon.png' checkbox must be [x]",
                doc.contains("[x] Add `icon.png`"));
    }

    @Test
    public void fdroidMdPrerequisitesFastlaneRowShowsDone() {
        String doc = read("docs/FDROID.md");
        assertTrue("FDROID.md Prerequisites table must show fastlane metadata row as Done",
                doc.contains("| Fastlane metadata directory | **Done**"));
    }

    // ── 15.4: v107 release tag + GitHub release ────────────────────────────

    @Test
    public void signedApkExistsAtRepoRoot() {
        assertTrue("minimalist-v107-release.apk must exist at repo root (used for GitHub release)",
                new File(projectRoot(), "minimalist-v107-release.apk").exists());
    }

    @Test
    public void fdroidMdStep5BoxesTicked() {
        String doc = read("docs/FDROID.md");
        assertTrue("FDROID.md Step 5 'Create a signed git tag' checkbox must be [x]",
                doc.contains("[x] Create a signed git tag"));
        assertTrue("FDROID.md Step 5 'Push the tag to GitHub' checkbox must be [x]",
                doc.contains("[x] Push the tag to GitHub"));
    }

    @Test
    public void fdroidMdPrerequisitesGithubTagRowShowsDone() {
        String doc = read("docs/FDROID.md");
        assertTrue("FDROID.md Prerequisites table must show GitHub release tag row as Done",
                doc.contains("| GitHub release tag (`v107`) | **Done**"));
    }

    // ── 15.5: fdroiddata YAML draft ────────────────────────────────────────

    @Test
    public void fdroidYamlExists() {
        assertTrue("docs/fdroid/ca.toadlybroodle.minimalist.yml must exist",
                new File(projectRoot(), "docs/fdroid/ca.toadlybroodle.minimalist.yml").exists());
    }

    @Test
    public void fdroidYamlHasRequiredFields() {
        String yaml = read("docs/fdroid/ca.toadlybroodle.minimalist.yml");
        assertTrue("YAML must have License field", yaml.contains("License:"));
        assertTrue("YAML must have SourceCode field", yaml.contains("SourceCode:"));
        assertTrue("YAML must have Name field", yaml.contains("Name:"));
        assertTrue("YAML must have Builds section", yaml.contains("Builds:"));
        assertTrue("YAML must have AutoUpdateMode field", yaml.contains("AutoUpdateMode:"));
        assertTrue("YAML must have UpdateCheckMode field", yaml.contains("UpdateCheckMode:"));
    }

    @Test
    public void fdroidYamlReferencesV107Tag() {
        String yaml = read("docs/fdroid/ca.toadlybroodle.minimalist.yml");
        assertTrue("YAML must reference the v107 commit tag", yaml.contains("v107"));
        assertTrue("YAML must reference versionCode 107", yaml.contains("107"));
    }

    @Test
    public void fdroidYamlHasMinimaListPackageId() {
        String yaml = read("docs/fdroid/ca.toadlybroodle.minimalist.yml");
        assertTrue("YAML must reference ca.toadlybroodle.minimalist package",
                yaml.contains("ca.toadlybroodle.minimalist") || yaml.contains("MinimaList"));
    }

    @Test
    public void fdroidMdStep6LintBoxTicked() {
        String doc = read("docs/FDROID.md");
        assertTrue("FDROID.md Step 6 fdroid lint checkbox must be [x]",
                doc.contains("[x] Run `fdroid lint"));
    }

    @Test
    public void fdroidMdPrerequisitesYamlRowShowsDone() {
        String doc = read("docs/FDROID.md");
        assertTrue("FDROID.md Prerequisites table must show F-Droid YAML row as Done",
                doc.contains("| F-Droid YAML in fdroiddata fork | **Done**"));
    }
}
