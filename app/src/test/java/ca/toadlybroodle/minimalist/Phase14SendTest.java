package ca.toadlybroodle.minimalist;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;

import static org.junit.Assert.assertTrue;

/**
 * Phase 14.5 + 14.6: Verify docs/PROMOTION_PLAN.md covers all five required
 * sections and tools/outreach/send.py has the required safety properties.
 */
public class Phase14SendTest {

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

    // --- PROMOTION_PLAN.md section coverage ---

    @Test
    public void promotionPlanHasSenderSetupSection() {
        String src = read("docs/PROMOTION_PLAN.md");
        assertTrue("PROMOTION_PLAN.md must have a sender setup section covering SPF/DKIM/DMARC",
                src.contains("SPF") && src.contains("DKIM") && src.contains("DMARC"));
    }

    @Test
    public void promotionPlanHasLegalFramingSection() {
        String src = read("docs/PROMOTION_PLAN.md");
        assertTrue("PROMOTION_PLAN.md must address legal framing (CAN-SPAM or equivalent)",
                src.toLowerCase().contains("can-spam") || src.toLowerCase().contains("legal"));
    }

    @Test
    public void promotionPlanHasVolumePlanSection() {
        String src = read("docs/PROMOTION_PLAN.md");
        assertTrue("PROMOTION_PLAN.md must include a volume / warmup plan",
                src.toLowerCase().contains("warmup") || src.toLowerCase().contains("warm-up")
                        || src.toLowerCase().contains("volume"));
    }

    @Test
    public void promotionPlanHasContentDraftSection() {
        String src = read("docs/PROMOTION_PLAN.md");
        assertTrue("PROMOTION_PLAN.md must contain a plain-text content draft",
                src.toLowerCase().contains("content") || src.toLowerCase().contains("subject")
                        || src.toLowerCase().contains("body"));
    }

    @Test
    public void promotionPlanHasMonitoringSection() {
        String src = read("docs/PROMOTION_PLAN.md");
        assertTrue("PROMOTION_PLAN.md must describe a monitoring / kill-switch",
                src.toLowerCase().contains("monitor") || src.toLowerCase().contains("kill-switch")
                        || src.toLowerCase().contains("pause"));
    }

    @Test
    public void promotionPlanStatesNoSendScheduled() {
        String src = read("docs/PROMOTION_PLAN.md");
        assertTrue("PROMOTION_PLAN.md must state explicitly that no send is scheduled / requires user approval",
                src.contains("user") && (src.contains("approval") || src.contains("direct") || src.contains("no send")));
    }

    // --- send.py structural properties ---

    @Test
    public void sendPyExists() {
        assertTrue("tools/outreach/send.py must exist for Phase 14.6",
                new File(projectRoot(), "tools/outreach/send.py").exists());
    }

    @Test
    public void sendPyHasDryRunGate() {
        String src = read("tools/outreach/send.py");
        assertTrue("send.py must have a DRY_RUN constant defaulting to True",
                src.contains("DRY_RUN") && (src.contains("True") || src.contains("true")));
    }

    @Test
    public void sendPyReadsFromActiveTxt() {
        String src = read("tools/outreach/send.py");
        assertTrue("send.py must read recipients only from data/outreach/active.txt",
                src.contains("active.txt"));
    }

    @Test
    public void sendPyHasSendLog() {
        String src = read("tools/outreach/send.py");
        assertTrue("send.py must maintain a per-recipient send log",
                src.contains("send_log") || src.contains("log_path") || src.contains("send_log.csv"));
    }

    @Test
    public void sendPyHasUnsubscribeSuppression() {
        String src = read("tools/outreach/send.py");
        assertTrue("send.py must suppress unsubscribed addresses",
                src.contains("unsubscribed") || src.contains("unsubscribe"));
    }

    @Test
    public void sendPyHasListUnsubscribeHeader() {
        String src = read("tools/outreach/send.py");
        assertTrue("send.py must set the List-Unsubscribe header on composed messages",
                src.contains("List-Unsubscribe"));
    }

    @Test
    public void sendPyBodyTemplateHasMailingAddressPlaceholder() {
        String src = read("tools/outreach/send.py");
        assertTrue("BODY_TEMPLATE must contain [mailing address] placeholder (CAN-SPAM requirement)",
                src.contains("[mailing address]"));
    }
}
