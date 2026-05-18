package ca.toadlybroodledev.sublist;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Phase 6.2 notification-channel invariants.
 *
 * channelConstantExists: AppMain must declare a public static final CHANNEL_REMINDERS String.
 * channelConstantNonEmpty: CHANNEL_REMINDERS value must be non-empty.
 * appMainRegistersChannel: AppMain.java source must call createNotificationChannel.
 * receiverNotificationUsesChannelConstant: source must reference AppMain.CHANNEL_REMINDERS
 *   (not context.getPackageName()) as the NotificationCompat.Builder channel arg.
 * mainActivityUsesChannelConstant: source must reference AppMain.CHANNEL_REMINDERS
 *   (not getPackageName()) as the NotificationCompat.Builder channel arg in mo4759F.
 */
public class Phase6NotificationChannelTest {

    private File projectRoot() {
        File dir = new File(System.getProperty("user.dir"));
        while (dir != null) {
            if (new File(dir, "settings.gradle.kts").exists()) return dir;
            dir = dir.getParentFile();
        }
        throw new IllegalStateException("Cannot find project root from: " + System.getProperty("user.dir"));
    }

    private String readSource(String relativePath) {
        try {
            File f = new File(projectRoot(), relativePath);
            return new String(Files.readAllBytes(f.toPath()));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Test
    public void channelConstantExists() throws Exception {
        Field f = AppMain.class.getDeclaredField("CHANNEL_REMINDERS");
        assertTrue("CHANNEL_REMINDERS must be public", Modifier.isPublic(f.getModifiers()));
        assertTrue("CHANNEL_REMINDERS must be static", Modifier.isStatic(f.getModifiers()));
        assertTrue("CHANNEL_REMINDERS must be final", Modifier.isFinal(f.getModifiers()));
        assertEquals("CHANNEL_REMINDERS must be a String", String.class, f.getType());
    }

    @Test
    public void channelConstantNonEmpty() throws Exception {
        Field f = AppMain.class.getDeclaredField("CHANNEL_REMINDERS");
        f.setAccessible(true);
        String value = (String) f.get(null);
        assertNotNull("CHANNEL_REMINDERS must not be null", value);
        assertFalse("CHANNEL_REMINDERS must not be empty", value.isEmpty());
    }

    @Test
    public void appMainRegistersChannel() {
        String src = readSource("app/src/main/java/ca/toadlybroodledev/sublist/AppMain.java");
        assertTrue("AppMain.java must call createNotificationChannel to register CHANNEL_REMINDERS",
                src.contains("createNotificationChannel"));
    }

    @Test
    public void receiverNotificationUsesChannelConstant() {
        String src = readSource("app/src/main/java/ca/toadlybroodledev/sublist/ReceiverNotification.java");
        assertTrue("ReceiverNotification must reference AppMain.CHANNEL_REMINDERS as channel ID",
                src.contains("AppMain.CHANNEL_REMINDERS"));
        assertFalse("ReceiverNotification must not use getPackageName() as channel ID in NotificationCompat.Builder",
                src.contains("context.getPackageName()"));
    }

    @Test
    public void mainActivityUsesChannelConstant() {
        String src = readSource("app/src/main/java/ca/toadlybroodledev/sublist/MainActivity.java");
        assertTrue("MainActivity must reference AppMain.CHANNEL_REMINDERS as channel ID in mo4759F",
                src.contains("AppMain.CHANNEL_REMINDERS"));
        // Ensure the old getPackageName() channel-ID pattern is gone from the notification builder
        assertFalse("MainActivity must not use getPackageName() as notification channel ID",
                src.contains("new NotificationCompat.Builder(this, getPackageName())"));
    }

    private static void assertEquals(String message, Class<?> expected, Class<?> actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError(message + " expected:<" + expected + "> but was:<" + actual + ">");
        }
    }
}
