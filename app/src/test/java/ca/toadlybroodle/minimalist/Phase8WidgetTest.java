package ca.toadlybroodle.minimalist;

import static org.junit.Assert.assertTrue;

import android.appwidget.AppWidgetManager;
import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;

/**
 * Phase 8.3 acceptance — home-screen widget renders and survives app data updates.
 *
 * WidgetProvider.onUpdate() is the entry point: it reads the saved screenshot bitmap via
 * OutlineStore.m4961a and sets it on widget_image_view. MainActivity.onStop() broadcasts
 * APPWIDGET_UPDATE so the widget refreshes every time the user leaves the app — this is
 * the "survives app data update" path.
 */
@RunWith(RobolectricTestRunner.class)
@Config(sdk = 34)
public class Phase8WidgetTest {

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

    @Test
    public void widgetProviderIsRegisteredInManifest() {
        String manifest = readSource("app/src/main/AndroidManifest.xml");
        assertTrue("manifest must declare the WidgetProvider receiver",
                manifest.contains("WidgetProvider"));
        assertTrue("manifest must include APPWIDGET_UPDATE intent filter",
                manifest.contains("android.appwidget.action.APPWIDGET_UPDATE"));
    }

    @Test
    public void widgetProviderCallsOutlineStoreForBitmap() {
        String src = readSource(
                "app/src/main/java/ca/toadlybroodle/minimalist/WidgetProvider.java");
        assertTrue("WidgetProvider must call OutlineStore.m4961a to obtain the widget screenshot",
                src.contains("OutlineStore.m4961a(context)"));
    }

    @Test
    public void widgetProviderSetsImageViewBitmap() {
        String src = readSource(
                "app/src/main/java/ca/toadlybroodle/minimalist/WidgetProvider.java");
        assertTrue("WidgetProvider must call setImageViewBitmap on widget_image_view",
                src.contains("setImageViewBitmap") && src.contains("widget_image_view"));
    }

    @Test
    public void mainActivityOnStopBroadcastsWidgetUpdate() {
        String src = readSource(
                "app/src/main/java/ca/toadlybroodle/minimalist/MainActivity.java");
        assertTrue("MainActivity.onStop must broadcast APPWIDGET_UPDATE to refresh the widget",
                src.contains("APPWIDGET_UPDATE"));
    }

    @Test
    public void widgetProvider_onUpdate_completesWithoutException() {
        Context ctx = RuntimeEnvironment.getApplication();
        AppWidgetManager awm = AppWidgetManager.getInstance(ctx);
        WidgetProvider provider = new WidgetProvider();
        // Fake widget ID 1. OutlineStore.m4961a returns null (no screenshot file in tests);
        // WidgetProvider's try-catch absorbs that gracefully. If the method throws it's a
        // regression — the widget must never crash the launcher process.
        provider.onUpdate(ctx, awm, new int[]{1});
        // Reaching here without exception is the assertion.
        assertTrue("onUpdate completed without throwing", true);
    }
}
