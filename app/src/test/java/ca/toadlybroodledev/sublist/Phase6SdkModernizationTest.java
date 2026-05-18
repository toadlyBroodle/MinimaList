package ca.toadlybroodledev.sublist;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Phase 6.1/6.3/6.4/6.5 SDK modernization invariants.
 *
 * manifestHasQueriesBlock: manifest must declare a <queries> block for mailto: / ACTION_SENDTO
 *   so that resolveActivity() works on API 30+ without false negatives.
 * noWriteExternalStoragePermissionRequest: MainActivity must not call
 *   requestPermissions(WRITE_EXTERNAL_STORAGE) — permission is absent from the manifest
 *   and is non-grantable on API 30+ regardless.
 * externalStoragePathUsesAppScopedDir: OutlineStore must not call
 *   getExternalStoragePublicDirectory (requires WRITE_EXTERNAL_STORAGE on API <29);
 *   must use getExternalFilesDir (no permission needed, scoped to the app).
 * pendingIntentsFlagImmutableWidgetProvider: WidgetProvider's PendingIntent must include FLAG_IMMUTABLE.
 * pendingIntentsFlagImmutableOutlineRowView: OutlineRowView's PendingIntent calls must include FLAG_IMMUTABLE.
 * pendingIntentsFlagImmutableMainActivity: MainActivity's mo4759F PendingIntent must include FLAG_IMMUTABLE.
 * pendingIntentsFlagImmutableReceiverNotification: ReceiverNotification's TaskStackBuilder
 *   getPendingIntent must include FLAG_IMMUTABLE.
 */
public class Phase6SdkModernizationTest {

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

    private String readXml(String relativePath) {
        try {
            File f = new File(projectRoot(), relativePath);
            return new String(Files.readAllBytes(f.toPath()));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private List<String> allLayoutXmls() {
        List<String> paths = new ArrayList<>();
        for (String dir : new String[]{"app/src/main/res/layout", "app/src/main/res/layout-large"}) {
            File d = new File(projectRoot(), dir);
            if (!d.isDirectory()) continue;
            for (File f : d.listFiles()) {
                if (f.getName().endsWith(".xml")) paths.add(dir + "/" + f.getName());
            }
        }
        return paths;
    }

    // --- 6.1-lint-fix-a ---

    @Test
    public void mainActivityOnBackPressedCallsSuper() {
        String src = readSource("app/src/main/java/ca/toadlybroodledev/sublist/MainActivity.java");
        assertTrue("MainActivity.onBackPressed() must call super.onBackPressed() (MissingSuperCall lint error;"
                + " omitting super breaks predictive-back gesture on API 33+)",
                src.contains("super.onBackPressed()"));
    }

    // --- 6.1-lint-fix-b ---

    @Test
    public void noFabClassReferenceInLayouts() {
        for (String path : allLayoutXmls()) {
            String xml = readXml(path);
            assertFalse("Layout " + path + " must not reference ca.toadlybroodledev.sublist.Fab"
                    + " (class does not exist; use OutlineFab — MissingClass lint error causes runtime crash)",
                    xml.contains("ca.toadlybroodledev.sublist.Fab"));
        }
    }

    // --- 6.3 ---

    @Test
    public void manifestHasQueriesBlock() {
        String manifest = readSource("app/src/main/AndroidManifest.xml");
        assertTrue("AndroidManifest.xml must contain a <queries> block (required for resolveActivity on API 30+)",
                manifest.contains("<queries>"));
        assertTrue("AndroidManifest.xml <queries> block must declare mailto: scheme for ACTION_SENDTO",
                manifest.contains("mailto"));
    }

    // --- 6.4 ---

    @Test
    public void noWriteExternalStoragePermissionRequest() {
        String src = readSource("app/src/main/java/ca/toadlybroodledev/sublist/MainActivity.java");
        assertFalse("MainActivity must not request WRITE_EXTERNAL_STORAGE at runtime"
                + " (not declared in manifest; non-grantable on API 30+)",
                src.contains("WRITE_EXTERNAL_STORAGE"));
    }

    @Test
    public void externalStoragePathUsesAppScopedDir() {
        String src = readSource("app/src/main/java/ca/toadlybroodledev/sublist/OutlineStore.java");
        assertFalse("OutlineStore must not call getExternalStoragePublicDirectory"
                + " (requires WRITE_EXTERNAL_STORAGE on API <29; use getExternalFilesDir instead)",
                src.contains("getExternalStoragePublicDirectory"));
        assertTrue("OutlineStore must call getExternalFilesDir for app-scoped external path"
                + " (no permission required on any API level)",
                src.contains("getExternalFilesDir"));
    }

    // --- 6.5 ---

    @Test
    public void pendingIntentsFlagImmutableWidgetProvider() {
        String src = readSource("app/src/main/java/ca/toadlybroodledev/sublist/WidgetProvider.java");
        assertTrue("WidgetProvider PendingIntent must include FLAG_IMMUTABLE (required API 31+)",
                src.contains("FLAG_IMMUTABLE"));
    }

    @Test
    public void pendingIntentsFlagImmutableOutlineRowView() {
        String src = readSource("app/src/main/java/ca/toadlybroodledev/sublist/OutlineRowView.java");
        assertTrue("OutlineRowView PendingIntent.getBroadcast calls must include FLAG_IMMUTABLE",
                src.contains("FLAG_IMMUTABLE"));
    }

    @Test
    public void pendingIntentsFlagImmutableMainActivity() {
        String src = readSource("app/src/main/java/ca/toadlybroodledev/sublist/MainActivity.java");
        assertTrue("MainActivity PendingIntent in mo4759F must include FLAG_IMMUTABLE",
                src.contains("FLAG_IMMUTABLE"));
    }

    @Test
    public void pendingIntentsFlagImmutableReceiverNotification() {
        String src = readSource("app/src/main/java/ca/toadlybroodledev/sublist/ReceiverNotification.java");
        assertTrue("ReceiverNotification TaskStackBuilder.getPendingIntent must include FLAG_IMMUTABLE",
                src.contains("FLAG_IMMUTABLE"));
    }

    // --- 6.1-lint-fix-c: WrongConstant ---

    @Test
    public void noRawGetSystemServiceStrings() {
        String mainSrc = readSource("app/src/main/java/ca/toadlybroodledev/sublist/MainActivity.java");
        String rcvSrc = readSource("app/src/main/java/ca/toadlybroodledev/sublist/ReceiverNotification.java");
        assertFalse("MainActivity must not pass \"notification\" string literal to getSystemService;"
                + " use Context.NOTIFICATION_SERVICE",
                mainSrc.contains("getSystemService(\"notification\")"));
        assertFalse("MainActivity must not pass \"input_method\" string literal to getSystemService;"
                + " use Context.INPUT_METHOD_SERVICE",
                mainSrc.contains("getSystemService(\"input_method\")"));
        assertFalse("ReceiverNotification must not pass \"notification\" string literal to getSystemService;"
                + " use Context.NOTIFICATION_SERVICE",
                rcvSrc.contains("getSystemService(\"notification\")"));
    }

    @Test
    public void noRawToastDurationInts() {
        for (String path : new String[]{
                "app/src/main/java/ca/toadlybroodledev/sublist/MainActivity.java",
                "app/src/main/java/ca/toadlybroodledev/sublist/NewSublistDialog.java",
                "app/src/main/java/ca/toadlybroodledev/sublist/SettingsFragment.java"
        }) {
            String src = readSource(path);
            assertFalse(path + " must not use raw int as Toast duration (use Toast.LENGTH_SHORT or LONG)",
                    src.contains(", 0).show()"));
        }
    }

    @Test
    public void drawerLayoutUsesNamedLockModeConstants() {
        String drawerToggleSrc = readSource(
                "app/src/main/java/ca/toadlybroodledev/sublist/DrawerToggle.java");
        String mainSrc = readSource(
                "app/src/main/java/ca/toadlybroodledev/sublist/MainActivity.java");
        assertFalse("DrawerToggle must not pass raw int 1 to setDrawerLockMode;"
                + " use DrawerLayout.LOCK_MODE_LOCKED_CLOSED",
                drawerToggleSrc.contains("setDrawerLockMode(1)"));
        assertTrue("DrawerToggle must use DrawerLayout.LOCK_MODE_LOCKED_CLOSED",
                drawerToggleSrc.contains("LOCK_MODE_LOCKED_CLOSED"));
        assertFalse("MainActivity must not pass raw int 1 to setDrawerLockMode;"
                + " use DrawerLayout.LOCK_MODE_LOCKED_CLOSED",
                mainSrc.contains("setDrawerLockMode(1)"));
        assertFalse("MainActivity must not pass raw int 0 to setDrawerLockMode;"
                + " use DrawerLayout.LOCK_MODE_UNLOCKED",
                mainSrc.contains("setDrawerLockMode(0)"));
    }

    @Test
    public void mainActivityDrawerUsesGravityCompat() {
        String src = readSource("app/src/main/java/ca/toadlybroodledev/sublist/MainActivity.java");
        assertFalse("MainActivity must not pass raw int 8388611 to drawer methods; use GravityCompat.START",
                src.contains("8388611"));
        assertTrue("MainActivity drawer toggle must use GravityCompat.START",
                src.contains("GravityCompat.START"));
    }

    @Test
    public void outlineRowViewUsesAlarmManagerRtcWakeup() {
        String src = readSource("app/src/main/java/ca/toadlybroodledev/sublist/OutlineRowView.java");
        assertFalse("OutlineRowView must not pass raw int 0 to AlarmManager.set();"
                + " use AlarmManager.RTC_WAKEUP",
                src.contains("am.set(0,"));
        assertTrue("OutlineRowView must use AlarmManager.RTC_WAKEUP as the alarm type",
                src.contains("AlarmManager.RTC_WAKEUP"));
    }

    @Test
    public void mainActivityUsesComplexUnitDip() {
        String src = readSource("app/src/main/java/ca/toadlybroodledev/sublist/MainActivity.java");
        assertFalse("MainActivity must not pass raw int 1 to TypedValue.applyDimension();"
                + " use TypedValue.COMPLEX_UNIT_DIP",
                src.contains("applyDimension(1,"));
        assertTrue("MainActivity must use TypedValue.COMPLEX_UNIT_DIP in applyDimension()",
                src.contains("COMPLEX_UNIT_DIP"));
    }

    @Test
    public void mainActivityToggleSoftInputUsesNamedFlag() {
        String src = readSource("app/src/main/java/ca/toadlybroodledev/sublist/MainActivity.java");
        assertFalse("MainActivity.toggleSoftInput must not use raw int 2 as showFlags;"
                + " use InputMethodManager.SHOW_FORCED",
                src.contains("toggleSoftInput(2,"));
        assertTrue("MainActivity.toggleSoftInput must use a named InputMethodManager show-flag constant",
                src.contains("toggleSoftInput(InputMethodManager.SHOW_"));
    }

    // --- 6.1-lint-fix-d: NotificationPermission ---

    @Test
    public void postNotificationsPermissionGuardMainActivity() {
        String src = readSource("app/src/main/java/ca/toadlybroodledev/sublist/MainActivity.java");
        assertTrue("MainActivity.mo4759F() must check POST_NOTIFICATIONS permission before calling notify()"
                + " on API 33+ (NotificationPermission lint error — silent drop otherwise)",
                src.contains("POST_NOTIFICATIONS"));
    }

    @Test
    public void postNotificationsPermissionGuardReceiverNotification() {
        String src = readSource("app/src/main/java/ca/toadlybroodledev/sublist/ReceiverNotification.java");
        assertTrue("ReceiverNotification.onReceive() must check POST_NOTIFICATIONS permission before calling notify()"
                + " on API 33+ (NotificationPermission lint error — silent drop otherwise)",
                src.contains("POST_NOTIFICATIONS"));
    }
}
