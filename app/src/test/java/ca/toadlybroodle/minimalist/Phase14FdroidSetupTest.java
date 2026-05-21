package ca.toadlybroodle.minimalist;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;

import static org.junit.Assert.assertTrue;

/**
 * Phase 14.4: Verify docs/FDROID.md exists and covers the required checklist
 * for submitting MinimaList to the F-Droid catalog.
 */
public class Phase14FdroidSetupTest {

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

    @Test
    public void fdroidMdExists() {
        assertTrue("docs/FDROID.md must exist for Phase 14.4",
                new File(projectRoot(), "docs/FDROID.md").exists());
    }

    @Test
    public void fdroidMdCoversMetadataFormat() {
        String src = read("docs/FDROID.md");
        assertTrue("FDROID.md must cover the fdroiddata metadata format",
                src.contains("fdroiddata") || src.contains("metadata"));
    }

    @Test
    public void fdroidMdCoversReproducibleBuilds() {
        String src = read("docs/FDROID.md");
        assertTrue("FDROID.md must address reproducible builds requirement",
                src.toLowerCase().contains("reproducible"));
    }

    @Test
    public void fdroidMdCoversSubmissionPath() {
        String src = read("docs/FDROID.md");
        // Must mention either RFP (Request For Packaging) or merge request path
        assertTrue("FDROID.md must describe the submission path (RFP or merge request)",
                src.contains("RFP") || src.contains("merge request") || src.contains("pull request")
                        || src.contains("Request for Packaging") || src.contains("fdroid/fdroiddata"));
    }

    @Test
    public void fdroidMdHasPrerequisitesList() {
        String src = read("docs/FDROID.md");
        // Must list what's still missing / needs to change before submission
        assertTrue("FDROID.md must include a prerequisites or missing-items section",
                src.toLowerCase().contains("prerequisite") || src.toLowerCase().contains("missing")
                        || src.toLowerCase().contains("checklist") || src.toLowerCase().contains("todo"));
    }
}
