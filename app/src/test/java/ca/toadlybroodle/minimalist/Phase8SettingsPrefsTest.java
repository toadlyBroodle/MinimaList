package ca.toadlybroodle.minimalist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import android.content.Context;
import android.content.SharedPreferences;

import ca.toadlybroodle.minimalist.iface.HostContract;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

/**
 * Phase 8.4 acceptance — drawer / settings / appearance toggles are wired to
 * real persisted preferences.
 *
 * {@link AppSettings} is the preference layer behind every settings toggle and
 * the appearance pickers (background / text / accent colour, text size,
 * keyboard-enter behaviour, the def_* booleans). These tests construct the real
 * {@code AppSettings} against a Robolectric Context, drive each setter, and then
 * either re-read a fresh instance ({@code reload()} re-runs the load path and
 * overwrites the static fields from storage) or read the raw SharedPreferences
 * directly — proving the value reached real storage under its documented key
 * rather than only living in memory.
 */
@RunWith(RobolectricTestRunner.class)
@Config(sdk = 34)
public class Phase8SettingsPrefsTest {

    private static final String PREFS_FILE = "SublistPrefsFile";

    private HostContract host;
    private Context ctx;

    @Before
    public void setUp() {
        ctx = RuntimeEnvironment.getApplication();
        host = mock(HostContract.class);
        when(host.mo4775m()).thenReturn(ctx);
        // Start every test from a clean preference store so a default-value
        // assertion cannot pass on leakage from a prior test.
        ctx.getSharedPreferences(PREFS_FILE, 0).edit().clear().commit();
    }

    /** Re-runs the AppSettings load path, overwriting the static fields from storage. */
    private void reload() {
        new AppSettings(host);
    }

    private SharedPreferences prefs() {
        return ctx.getSharedPreferences(PREFS_FILE, 0);
    }

    // --- defaults ---

    @Test
    public void freshInstall_loadsDocumentedDefaults() {
        reload();
        assertTrue("show_completed defaults on", AppSettings.m4929a());
        assertEquals("backup format defaults to JSON", 0, AppSettings.getBackupFormatIndex());
        assertEquals("backup location defaults to local", 0, AppSettings.getBackupLocationIndex());
        assertTrue("auto-complete-children defaults on", AppSettings.f3951n);
        assertEquals("enter key defaults to NEW_LINE",
                AppSettings.KeyboardAction.NEW_LINE.m4960a(), AppSettings.f3950m);
    }

    // --- show-completed toggle ---

    @Test
    public void showCompletedToggle_roundTripsThroughSharedPreferences() {
        reload();
        AppSettings.m4928a(false);
        reload();
        assertFalse("toggled-off value must survive a reload", AppSettings.m4929a());

        AppSettings.m4928a(true);
        reload();
        assertTrue("toggled-on value must survive a reload", AppSettings.m4929a());
    }

    @Test
    public void showCompletedToggle_writesNamedKeyToPrefsFile() {
        reload();
        AppSettings.m4928a(false);
        assertFalse("toggle must persist under its real SharedPreferences key",
                prefs().getBoolean("show_completed", true));
    }

    // --- backup location / format spinners ---

    @Test
    public void backupLocationIndex_roundTrips() {
        reload();
        AppSettings.setBackupLocationIndex(1);
        reload();
        assertEquals(1, AppSettings.getBackupLocationIndex());

        AppSettings.setBackupLocationIndex(0);
        reload();
        assertEquals(0, AppSettings.getBackupLocationIndex());
    }

    @Test
    public void backupFormatIndex_roundTrips() {
        reload();
        AppSettings.setBackupFormatIndex(1);
        reload();
        assertEquals(1, AppSettings.getBackupFormatIndex());
    }

    // --- appearance: colour pickers ---

    @Test
    public void textColorIndex_writesToPrefs() {
        reload();
        AppSettings.m4934c(3);
        assertEquals("text colour picker must persist color_text index",
                3, prefs().getInt("color_text", -1));
    }

    @Test
    public void accentColorIndex_writesToPrefs() {
        reload();
        AppSettings.m4938d(9);
        assertEquals("accent colour picker must persist color_accent index",
                9, prefs().getInt("color_accent", -1));
    }

    @Test
    public void backgroundColorIndex_writesToPrefs() {
        reload();
        AppSettings.m4927a(4);
        assertEquals("background colour picker must persist color_bg index",
                4, prefs().getInt("color_bg", -1));
    }

    // --- appearance: text size (write + reload-resolved value) ---

    @Test
    public void textSizeIndex_roundTrips() {
        reload();
        AppSettings.m4930b(1);
        assertEquals("text size picker must persist size_text index",
                1, prefs().getInt("size_text", -1));
        reload();
        String expected = ctx.getResources().getStringArray(R.array.size_text_array)[1];
        assertEquals("reloaded text size must resolve to the persisted slot",
                expected, AppSettings.m4941f());
    }

    // --- keyboard-enter behaviour ---

    @Test
    public void keyboardActionPref_roundTrips() {
        reload();
        AppSettings.f3950m = AppSettings.KeyboardAction.CLOSE_KEYS.m4960a();
        AppSettings.m4947l();
        reload();
        assertEquals(AppSettings.KeyboardAction.CLOSE_KEYS.m4960a(), AppSettings.f3950m);
    }

    // --- def_* behaviour toggles ---

    @Test
    public void autoCompleteChildrenToggle_roundTrips() {
        reload();
        AppSettings.f3951n = false;
        AppSettings.m4947l();
        reload();
        assertFalse(AppSettings.f3951n);
    }

    @Test
    public void singleLineEntriesToggle_roundTrips() {
        reload();
        AppSettings.f3949l = true;
        AppSettings.m4947l();
        reload();
        assertTrue(AppSettings.f3949l);
    }

    @Test
    public void persistWritesEveryToggleKeyToNamedPrefsFile() {
        reload();
        AppSettings.m4947l();
        SharedPreferences p = prefs();
        // A persist pass must write the full settings key-set, not a subset.
        assertTrue(p.contains("show_completed"));
        assertTrue(p.contains("backup_location_sd"));
        assertTrue(p.contains("backup_format_index"));
        assertTrue(p.contains("def_enter_key"));
        assertTrue(p.contains("color_accent"));
        assertTrue(p.contains("size_text"));
        assertTrue(p.contains("def_auto_compl_children"));
        assertTrue(p.contains("def_sing_line_ents"));
    }
}
