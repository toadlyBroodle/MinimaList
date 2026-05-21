package ca.toadlybroodle.minimalist;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;

import static org.junit.Assert.assertTrue;

/**
 * Phase 14.1: Import legacy email list into gitignored data/outreach/;
 * add provenance stub to docs/PROMOTION_PLAN.md.
 *
 * The raw email list is PII and is never committed. These tests verify:
 * (a) .gitignore covers data/ so the raw file cannot be accidentally staged;
 * (b) docs/PROMOTION_PLAN.md exists and carries the required provenance stub.
 */
public class Phase14OutreachSetupTest {

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
    public void gitignoreCoversDataDir() {
        String src = read(".gitignore");
        assertTrue(".gitignore must contain 'data/' so the raw email list and outreach files are never staged",
                src.contains("data/"));
    }

    @Test
    public void promotionPlanExists() {
        File plan = new File(projectRoot(), "docs/PROMOTION_PLAN.md");
        assertTrue("docs/PROMOTION_PLAN.md must exist with a provenance stub before 14.2 validation work begins",
                plan.exists());
    }

    @Test
    public void promotionPlanHasProvenanceStub() {
        File plan = new File(projectRoot(), "docs/PROMOTION_PLAN.md");
        assertTrue("docs/PROMOTION_PLAN.md must exist", plan.exists());
        String src = read("docs/PROMOTION_PLAN.md");
        assertTrue("provenance stub must record the original Play Store package name",
                src.contains("ca.toadlybroodledev.sublist"));
        assertTrue("provenance stub must note that developer-account access is lost",
                src.toLowerCase().contains("developer") || src.toLowerCase().contains("account"));
        assertTrue("provenance stub must reference the outreach data directory",
                src.contains("data/outreach") || src.contains("emails"));
    }
}
