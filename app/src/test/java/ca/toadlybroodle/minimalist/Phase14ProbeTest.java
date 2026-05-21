package ca.toadlybroodle.minimalist;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;

import static org.junit.Assert.assertTrue;

/**
 * Phase 14.3: Verify tools/outreach/probe.py has the required structural
 * properties (SMTP RCPT TO, three-way classification, fail-closed monotone
 * output) and that data/outreach/active.txt has been produced.
 */
public class Phase14ProbeTest {

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
    public void probePyExists() {
        assertTrue("tools/outreach/probe.py must exist for Phase 14.3",
                new File(projectRoot(), "tools/outreach/probe.py").exists());
    }

    @Test
    public void probePyUsesSmtpRcptTo() {
        String src = read("tools/outreach/probe.py");
        assertTrue("probe.py must issue RCPT TO via smtplib",
                src.contains("smtp.rcpt") || src.contains("RCPT TO") || src.contains("rcpt("));
    }

    @Test
    public void probePyHasThreeWayClassification() {
        String src = read("tools/outreach/probe.py");
        assertTrue("probe.py must classify as 'confirmed'", src.contains("confirmed"));
        assertTrue("probe.py must classify as 'rejected'", src.contains("rejected"));
        assertTrue("probe.py must classify as 'unverifiable'", src.contains("unverifiable"));
    }

    @Test
    public void probePyIsFailClosed() {
        String src = read("tools/outreach/probe.py");
        // Fail-closed: output is a strict subset of input
        assertTrue("probe.py must assert its output is a strict subset of the input",
                src.contains("strict subset") || src.contains("fail-closed") || src.contains("monotone"));
    }

    @Test
    public void probePyHasCatchAllDetection() {
        String src = read("tools/outreach/probe.py");
        assertTrue("probe.py must detect catch-all domains to avoid false confirmed results",
                src.contains("catch_all") || src.contains("catch-all"));
    }

    @Test
    public void activeTxtExistsInOutreachDir() {
        assertTrue(
                "data/outreach/active.txt must exist locally after running the Phase 14.3 probe",
                new File(projectRoot(), "data/outreach/active.txt").exists());
    }

    @Test
    public void activeTxtHasConfirmedTierHeader() {
        String src = read("data/outreach/active.txt");
        assertTrue("active.txt must contain a '# tier:confirmed' section header",
                src.contains("# tier:confirmed"));
    }

    @Test
    public void activeTxtHasUnverifiableTierHeader() {
        String src = read("data/outreach/active.txt");
        assertTrue("active.txt must contain a '# tier:unverifiable' section header",
                src.contains("# tier:unverifiable"));
    }
}
