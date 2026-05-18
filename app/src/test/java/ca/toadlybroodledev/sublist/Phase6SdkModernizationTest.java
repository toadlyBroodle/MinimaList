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
}
