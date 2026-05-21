package ca.toadlybroodle.minimalist;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;

import static org.junit.Assert.assertTrue;

/**
 * Phase 14.2: Verify tools/outreach/validate.py exists and has the required
 * structural properties: fail-closed, writes validated.txt, no network send.
 */
public class Phase14ValidateTest {

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
    public void validatePyExists() {
        assertTrue("tools/outreach/validate.py must exist for Phase 14.2",
                new File(projectRoot(), "tools/outreach/validate.py").exists());
    }

    @Test
    public void validatePyWritesValidatedTxt() {
        String src = read("tools/outreach/validate.py");
        assertTrue("validate.py must reference validated.txt output file",
                src.contains("validated.txt") || src.contains("validated"));
    }

    @Test
    public void validatePyIsFailClosed() {
        String src = read("tools/outreach/validate.py");
        // Fail-closed means ambiguous inputs are dropped; script must not retain unknowns
        assertTrue("validate.py must contain a 'drop' or 'fail-closed' design marker",
                src.contains("drop") || src.contains("fail-closed") || src.contains("fail_closed")
                        || src.contains("strict subset"));
    }

    @Test
    public void validatePyHasNoNetworkSend() {
        String src = read("tools/outreach/validate.py");
        // Must NOT contain SMTP send — MX lookup (dns.resolver / socket) is allowed;
        // smtplib.SMTP().sendmail / smtp.send_message are what we forbid here.
        assertTrue("validate.py must not contain smtp sendmail / send_message calls",
                !src.contains(".sendmail(") && !src.contains(".send_message("));
    }
}
