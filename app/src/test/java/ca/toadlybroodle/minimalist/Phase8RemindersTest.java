package ca.toadlybroodle.minimalist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.Manifest;
import android.app.AlarmManager;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;

import ca.toadlybroodle.minimalist.db.OutlineRepository;
import ca.toadlybroodle.minimalist.db.entity.OutlineRowEntity;
import ca.toadlybroodle.minimalist.iface.HostContract;
import ca.toadlybroodle.minimalist.iface.OutlineHost;
import ca.toadlybroodle.minimalist.model.OutlineRow;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.Shadows;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowAlarmManager;
import org.robolectric.shadows.ShadowApplication;
import org.robolectric.shadows.ShadowNotificationManager;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.util.Collections;

/**
 * Phase 8.2 acceptance — reminder alarm scheduling, cancellation, notification delivery,
 * and boot-time rescheduling.
 *
 * Covers OutlineRowView.m4861b (schedule) and m4862c (cancel), ReceiverNotification.onReceive
 * (notification delivery and BOOT_COMPLETED rescheduling), and the AndroidManifest declarations
 * required for the RECEIVE_BOOT_COMPLETED permission and intent filter.
 */
@RunWith(RobolectricTestRunner.class)
@Config(sdk = 34)
public class Phase8RemindersTest {

    private HostContract host;
    private OutlineHost outlineHost;
    private OutlineRowView rowView;
    private Context ctx;
    private ShadowAlarmManager shadowAlarmManager;

    @Before
    public void setUp() {
        ctx = RuntimeEnvironment.getApplication();
        host = mock(HostContract.class);
        when(host.mo4775m()).thenReturn(ctx);
        when(host.mo4779q()).thenReturn(mock(OutlineStore.class));
        when(host.mo4770b(any(Integer.class))).thenReturn("");
        outlineHost = mock(OutlineHost.class);

        OutlineRow row = new OutlineRow(0, "Reminder task", false, false, 0L, false);
        rowView = new OutlineRowView(host, outlineHost, row);

        // Grant POST_NOTIFICATIONS so ReceiverNotification can post on API 33+.
        ShadowApplication shadowApp = Shadows.shadowOf((Application) ctx);
        shadowApp.grantPermissions(Manifest.permission.POST_NOTIFICATIONS);

        AlarmManager am = (AlarmManager) ctx.getSystemService(Context.ALARM_SERVICE);
        shadowAlarmManager = Shadows.shadowOf(am);
    }

    @After
    public void tearDown() {
        DateTimeUtil.f3991a = 0L;
    }

    // --- schedule ---

    @Test
    public void scheduleReminder_futureTimestamp_setsAlarmAndRecordsEpoch() {
        long futureMs = System.currentTimeMillis() + 3_600_000;
        DateTimeUtil.f3991a = futureMs;
        rowView.m4861b();
        assertEquals("f3825h must record the scheduled time", futureMs, rowView.f3825h);
        assertFalse("AlarmManager must have a scheduled alarm",
                shadowAlarmManager.getScheduledAlarms().isEmpty());
        verify(outlineHost).mo4852am();
    }

    @Test
    public void scheduleReminder_pastTimestamp_doesNotScheduleAlarm() {
        DateTimeUtil.f3991a = System.currentTimeMillis() - 60_000;
        long fieldBefore = rowView.f3825h;
        rowView.m4861b();
        assertEquals("f3825h must not change for a past timestamp", fieldBefore, rowView.f3825h);
        assertTrue("AlarmManager must NOT have any scheduled alarm for a past timestamp",
                shadowAlarmManager.getScheduledAlarms().isEmpty());
    }

    // --- cancel ---

    @Test
    public void cancelReminder_afterScheduled_clearsFlagToZero() {
        long futureMs = System.currentTimeMillis() + 3_600_000;
        DateTimeUtil.f3991a = futureMs;
        rowView.m4861b();
        assertEquals(futureMs, rowView.f3825h); // precondition
        rowView.m4862c();
        assertEquals("f3825h must be zeroed after cancel", 0L, rowView.f3825h);
    }

    @Test
    public void cancelReminder_withNoExistingReminder_leavesFieldAtZero() {
        rowView.f3825h = 0L;
        rowView.m4862c();
        assertEquals("f3825h must remain 0 after cancel on an unscheduled row", 0L, rowView.f3825h);
    }

    // --- notification delivery ---

    @Test
    public void receiverNotification_withExtra_postsNotification() {
        Intent intent = new Intent();
        intent.putExtra("notification", (CharSequence) "Buy milk");
        new ReceiverNotification().onReceive(ctx, intent);
        NotificationManager nm = (NotificationManager) ctx.getSystemService(Context.NOTIFICATION_SERVICE);
        ShadowNotificationManager shadowNm = Shadows.shadowOf(nm);
        assertFalse("a notification must be posted when the extra is present",
                shadowNm.getAllNotifications().isEmpty());
    }

    @Test
    public void receiverNotification_withoutExtra_postsNotificationWithEmptyText() {
        new ReceiverNotification().onReceive(ctx, new Intent());
        NotificationManager nm = (NotificationManager) ctx.getSystemService(Context.NOTIFICATION_SERVICE);
        ShadowNotificationManager shadowNm = Shadows.shadowOf(nm);
        assertFalse("a notification must be posted even when the extra is absent",
                shadowNm.getAllNotifications().isEmpty());
    }

    // --- boot rescheduling: source-scan ---

    @Test
    public void manifestHasReceiveBootCompletedPermission() {
        assertTrue("manifest must declare RECEIVE_BOOT_COMPLETED permission",
                readSource("app/src/main/AndroidManifest.xml")
                        .contains("android.permission.RECEIVE_BOOT_COMPLETED"));
    }

    @Test
    public void manifestReceiverHasBootCompletedIntentFilter() {
        assertTrue("manifest must include BOOT_COMPLETED intent filter for ReceiverNotification",
                readSource("app/src/main/AndroidManifest.xml")
                        .contains("android.intent.action.BOOT_COMPLETED"));
    }

    @Test
    public void receiverHandlesBootCompletedActionInCode() {
        String src = readSource(
                "app/src/main/java/ca/toadlybroodle/minimalist/ReceiverNotification.java");
        assertTrue("ReceiverNotification must check for BOOT_COMPLETED action",
                src.contains("ACTION_BOOT_COMPLETED") || src.contains("BOOT_COMPLETED"));
        assertTrue("ReceiverNotification must call getRowsWithFutureReminders after boot",
                src.contains("getRowsWithFutureReminders"));
    }

    // --- boot rescheduling: behavioral ---

    @Test
    public void bootCompleted_reschedulesRowsWithFutureReminders() throws Exception {
        OutlineRowEntity futureRow = new OutlineRowEntity();
        futureRow.id = 42L;
        futureRow.text = "Buy groceries";
        futureRow.reminder = System.currentTimeMillis() + 7_200_000;

        OutlineRepository mockRepo = mock(OutlineRepository.class);
        when(mockRepo.getRowsWithFutureReminders(anyLong()))
                .thenReturn(Collections.singletonList(futureRow));

        Field repoField = AppMain.class.getDeclaredField("REPOSITORY");
        repoField.setAccessible(true);
        Field executorField = AppMain.class.getDeclaredField("EXECUTOR");
        executorField.setAccessible(true);
        Object originalRepo = repoField.get(null);
        Object originalExecutor = executorField.get(null);
        try {
            repoField.set(null, mockRepo);
            // Inject a synchronous executor so the async dispatch completes before assertion.
            executorField.set(null, (java.util.concurrent.Executor) Runnable::run);
            new ReceiverNotification().onReceive(ctx,
                    new Intent(Intent.ACTION_BOOT_COMPLETED));
            assertFalse("AlarmManager must have a rescheduled alarm after BOOT_COMPLETED",
                    shadowAlarmManager.getScheduledAlarms().isEmpty());
        } finally {
            repoField.set(null, originalRepo);
            executorField.set(null, originalExecutor);
        }
    }

    @Test
    public void bootRescheduling_usesGoAsyncToAvoidMainThreadRoomQuery() {
        String src = readSource(
                "app/src/main/java/ca/toadlybroodle/minimalist/ReceiverNotification.java");
        assertTrue("rescheduleAlarmsAfterBoot must call goAsync() to extend the receiver lifetime",
                src.contains("goAsync()"));
        assertTrue("rescheduleAlarmsAfterBoot must dispatch to AppMain.io() to avoid main-thread Room query",
                src.contains("AppMain.io()"));
    }

    // --- alarm request-code stability ---

    @Test
    public void scheduleReminder_usesRowIdAsRequestCode() {
        OutlineRow row = new OutlineRow(0, "Task with id", false, false, 0L, false);
        row.id = 42L;
        OutlineRowView view = new OutlineRowView(host, outlineHost, row);
        long futureMs = System.currentTimeMillis() + 3_600_000;
        DateTimeUtil.f3991a = futureMs;
        view.m4861b();
        assertFalse("alarm must be scheduled", shadowAlarmManager.getScheduledAlarms().isEmpty());
        int requestCode = Shadows.shadowOf(
                shadowAlarmManager.getScheduledAlarms().get(0).operation).getRequestCode();
        assertEquals("PendingIntent request code must equal row.id, not hashCode()", 42, requestCode);
    }

    @Test
    public void alarmSites_doNotUseHashCodeAsRequestCode() {
        String src = readSource(
                "app/src/main/java/ca/toadlybroodle/minimalist/OutlineRowView.java");
        assertFalse("m4861b and m4862c must not use object hashCode() as alarm request code",
                src.contains("getBroadcast(ctx, hashCode()"));
        assertTrue("OutlineRowView must store row.id in a field used as alarm request code",
                src.contains("f3829l"));
    }

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
}
