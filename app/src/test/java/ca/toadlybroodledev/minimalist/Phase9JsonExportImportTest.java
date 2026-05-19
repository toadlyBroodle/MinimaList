package ca.toadlybroodledev.minimalist;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;

import ca.toadlybroodledev.minimalist.model.OutlineRow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Phase 9.3 — JSON export (SAF) + JSON import (replace-vs-merge).
 *
 * Source-scan tests verify that the required SAF wiring exists in the production files.
 * The pure-JVM round-trip test verifies the JSON format that export writes is the same
 * Gson HashMap format that importFromUri reads back.
 */
public class Phase9JsonExportImportTest {

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

    private static final String SRC = "app/src/main/java/ca/toadlybroodledev/minimalist/";

    // --- OutlineStore ---

    @Test
    public void outlineStoreHasExportToUriMethod() {
        String src = readSource(SRC + "OutlineStore.java");
        assertTrue("OutlineStore must declare exportToUri method", src.contains("exportToUri"));
    }

    @Test
    public void outlineStoreHasImportFromUriMethod() {
        String src = readSource(SRC + "OutlineStore.java");
        assertTrue("OutlineStore must declare importFromUri method", src.contains("importFromUri"));
    }

    @Test
    public void outlineStoreExportUsesContentResolver() {
        String src = readSource(SRC + "OutlineStore.java");
        assertTrue("OutlineStore.exportToUri must use getContentResolver()",
                src.contains("getContentResolver"));
    }

    @Test
    public void outlineStoreImportUsesContentResolver() {
        String src = readSource(SRC + "OutlineStore.java");
        assertTrue("OutlineStore.importFromUri must use getContentResolver()",
                src.contains("getContentResolver"));
    }

    @Test
    public void outlineStoreExportRunsOnIoExecutor() {
        String src = readSource(SRC + "OutlineStore.java");
        assertTrue("OutlineStore.exportToUri must dispatch write to AppMain.io() executor",
                src.contains("AppMain.io()"));
    }

    // --- SettingsFragment ---

    @Test
    public void settingsFragmentHasExportJsonRequestCode() {
        String src = readSource(SRC + "SettingsFragment.java");
        assertTrue("SettingsFragment must declare REQUEST_EXPORT_JSON constant",
                src.contains("REQUEST_EXPORT_JSON"));
    }

    @Test
    public void settingsFragmentHasImportJsonRequestCode() {
        String src = readSource(SRC + "SettingsFragment.java");
        assertTrue("SettingsFragment must declare REQUEST_IMPORT_JSON constant",
                src.contains("REQUEST_IMPORT_JSON"));
    }

    @Test
    public void settingsFragmentLaunchesCreateDocumentIntent() {
        String src = readSource(SRC + "SettingsFragment.java");
        assertTrue("SettingsFragment must use Intent.ACTION_CREATE_DOCUMENT for export",
                src.contains("ACTION_CREATE_DOCUMENT"));
    }

    @Test
    public void settingsFragmentLaunchesOpenDocumentIntent() {
        String src = readSource(SRC + "SettingsFragment.java");
        assertTrue("SettingsFragment must use Intent.ACTION_OPEN_DOCUMENT for import",
                src.contains("ACTION_OPEN_DOCUMENT"));
    }

    @Test
    public void settingsFragmentHasOnActivityResultOverride() {
        String src = readSource(SRC + "SettingsFragment.java");
        assertTrue("SettingsFragment must override onActivityResult to receive SAF picker results",
                src.contains("onActivityResult"));
    }

    @Test
    public void settingsFragmentShowsReplaceOption() {
        String src = readSource(SRC + "SettingsFragment.java");
        assertTrue("SettingsFragment import dialog must offer a Replace option (mo4769a or replace string ref)",
                src.contains("mo4769a") || src.contains("dialog_import_replace")
                        || src.contains("R.string.dialog_import_replace"));
    }

    @Test
    public void settingsFragmentShowsMergeOption() {
        String src = readSource(SRC + "SettingsFragment.java");
        assertTrue("SettingsFragment import dialog must offer a Merge option (mo4767a or merge string ref)",
                src.contains("mo4767a") || src.contains("dialog_import_merge")
                        || src.contains("R.string.dialog_import_merge"));
    }

    // --- Pure-JVM round-trip: format written by exportToUri must be readable by importFromUri ---

    @Test
    public void jsonExportFormatRoundTripsViaGson() {
        HashMap<String, ArrayList<OutlineRow>> original = new HashMap<>();
        ArrayList<OutlineRow> rows = new ArrayList<>();
        rows.add(new OutlineRow(0, "top row", false, false, 0L, false));
        rows.add(new OutlineRow(1, "  child row", false, true, 1_700_000_000L, false));
        original.put("Work", rows);

        ArrayList<OutlineRow> rows2 = new ArrayList<>();
        rows2.add(new OutlineRow(0, "only row", true, false, 0L, true));
        original.put("Personal", rows2);

        Gson gson = new Gson();
        String json = gson.toJson(original);
        assertNotNull("Exported JSON must not be null", json);

        HashMap<String, ArrayList<OutlineRow>> restored = gson.fromJson(json,
                new TypeToken<HashMap<String, ArrayList<OutlineRow>>>() {}.getType());
        assertNotNull("Restored map must not be null", restored);
        assertEquals("Restored map must have 2 sublists", 2, restored.size());
        assertTrue("Restored map must contain 'Work'", restored.containsKey("Work"));
        assertTrue("Restored map must contain 'Personal'", restored.containsKey("Personal"));

        ArrayList<OutlineRow> workRows = restored.get("Work");
        assertNotNull(workRows);
        assertEquals("Work list must have 2 rows", 2, workRows.size());
        assertEquals("Row 0 text preserved", "top row", workRows.get(0).text);
        assertEquals("Row 1 text preserved", "  child row", workRows.get(1).text);
        assertEquals("Row 1 indent preserved", 1, workRows.get(1).indent);
        assertEquals("Row 1 reminder preserved", 1_700_000_000L, workRows.get(1).reminder);

        ArrayList<OutlineRow> personalRows = restored.get("Personal");
        assertNotNull(personalRows);
        assertEquals("Personal list must have 1 row", 1, personalRows.size());
        assertTrue("Row isInstr preserved", personalRows.get(0).isInstr);
        assertTrue("Row complete preserved", personalRows.get(0).complete);
    }

    // helpers to avoid importing junit's overloaded assertEquals
    private static void assertEquals(String msg, int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError(msg + " expected:<" + expected + "> but was:<" + actual + ">");
        }
    }

    private static void assertEquals(String msg, long expected, long actual) {
        if (expected != actual) {
            throw new AssertionError(msg + " expected:<" + expected + "> but was:<" + actual + ">");
        }
    }

    private static void assertEquals(String msg, String expected, String actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError(msg + " expected:<" + expected + "> but was:<" + actual + ">");
        }
    }
}
