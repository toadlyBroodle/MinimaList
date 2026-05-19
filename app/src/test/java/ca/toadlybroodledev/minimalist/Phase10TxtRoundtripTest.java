package ca.toadlybroodledev.minimalist;

import org.junit.Test;

import java.util.ArrayList;

import ca.toadlybroodledev.minimalist.model.OutlineRow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Phase 10.8 — pure-JVM behavioral tests for OutlineStore.parseTxtRows.
 *
 * The TXT import's row-parser is a data-integrity path: a bug here causes silent row loss.
 * These tests drive parseTxtRows directly (package-private static method) to verify
 * field values on each resulting OutlineRow, and to confirm correct handling of edge inputs.
 *
 * Export format (written by OutlineStore.exportTxtToDir per row):
 *   "\n" + <indent-count spaces> + (complete ? "x-" : " -") + <text>
 * So root-incomplete: " -text", root-complete: "x-text",
 *    indent-1-incomplete: "  -text", indent-1-complete: " x-text", etc.
 */
public class Phase10TxtRoundtripTest {

    // ---- empty / degenerate inputs ----

    @Test
    public void emptyStringReturnsEmptyList() {
        ArrayList<OutlineRow> rows = OutlineStore.parseTxtRows("");
        assertNotNull(rows);
        assertTrue("Empty string must produce empty row list", rows.isEmpty());
    }

    @Test
    public void onlyNewlinesReturnsEmptyList() {
        ArrayList<OutlineRow> rows = OutlineStore.parseTxtRows("\n\n\n");
        assertNotNull(rows);
        assertTrue("Input of only newlines must produce empty row list", rows.isEmpty());
    }

    @Test
    public void allMalformedLinesReturnsEmptyList() {
        // Lines that start with '-' at indent=0 are malformed (no leading space before '-').
        // Lines that are only spaces are also skipped.
        String txt = "-no leading space\n   \n-another bad line";
        ArrayList<OutlineRow> rows = OutlineStore.parseTxtRows(txt);
        assertNotNull(rows);
        assertTrue("All-malformed input must produce empty row list", rows.isEmpty());
    }

    @Test
    public void consecutiveEmptyLinesAreSkipped() {
        // Two valid rows separated by several blank lines.
        String txt = " -first\n\n\n x-second";
        ArrayList<OutlineRow> rows = OutlineStore.parseTxtRows(txt);
        assertEquals("Consecutive empty lines must be skipped; 2 rows expected", 2, rows.size());
        assertEquals("Row 0 text", "first", rows.get(0).text);
        assertEquals("Row 1 text", "second", rows.get(1).text);
    }

    // ---- root-level rows (indent = 0) ----

    @Test
    public void rootIncompleteRow() {
        // Export format: " -text" (1 leading space + '-' + text)
        ArrayList<OutlineRow> rows = OutlineStore.parseTxtRows(" -Hello");
        assertEquals("One row parsed", 1, rows.size());
        OutlineRow r = rows.get(0);
        assertEquals("indent must be 0", 0, r.indent);
        assertFalse("complete must be false", r.complete);
        assertEquals("text preserved", "Hello", r.text);
    }

    @Test
    public void rootCompleteRow() {
        // Export format: "x-text" (no leading space, 'x-' marker, then text)
        ArrayList<OutlineRow> rows = OutlineStore.parseTxtRows("x-Done");
        assertEquals("One row parsed", 1, rows.size());
        OutlineRow r = rows.get(0);
        assertEquals("indent must be 0", 0, r.indent);
        assertTrue("complete must be true", r.complete);
        assertEquals("text preserved", "Done", r.text);
    }

    @Test
    public void rootIncompleteEmptyText() {
        // Marker present, but no text after it: " -"
        ArrayList<OutlineRow> rows = OutlineStore.parseTxtRows(" -");
        assertEquals("One row parsed", 1, rows.size());
        assertEquals("indent must be 0", 0, rows.get(0).indent);
        assertFalse("complete must be false", rows.get(0).complete);
        assertEquals("text must be empty string", "", rows.get(0).text);
    }

    @Test
    public void rootCompleteEmptyText() {
        // Marker present, but no text after it: "x-"
        ArrayList<OutlineRow> rows = OutlineStore.parseTxtRows("x-");
        assertEquals("One row parsed", 1, rows.size());
        assertEquals("indent must be 0", 0, rows.get(0).indent);
        assertTrue("complete must be true", rows.get(0).complete);
        assertEquals("text must be empty string", "", rows.get(0).text);
    }

    // ---- nested rows (indent > 0) ----

    @Test
    public void nestedIncompleteRowIndent1() {
        // Export format: "  -text" (2 leading spaces then '-' then text)
        ArrayList<OutlineRow> rows = OutlineStore.parseTxtRows("  -Child");
        assertEquals("One row parsed", 1, rows.size());
        OutlineRow r = rows.get(0);
        assertEquals("indent must be 1", 1, r.indent);
        assertFalse("complete must be false", r.complete);
        assertEquals("text preserved", "Child", r.text);
    }

    @Test
    public void nestedCompleteRowIndent1() {
        // Export format: " x-text" (1 leading space then 'x-' then text)
        ArrayList<OutlineRow> rows = OutlineStore.parseTxtRows(" x-Done child");
        assertEquals("One row parsed", 1, rows.size());
        OutlineRow r = rows.get(0);
        assertEquals("indent must be 1", 1, r.indent);
        assertTrue("complete must be true", r.complete);
        assertEquals("text preserved", "Done child", r.text);
    }

    @Test
    public void nestedIncompleteRowIndent2() {
        // Export format: "   -text" (3 leading spaces then '-' then text)
        ArrayList<OutlineRow> rows = OutlineStore.parseTxtRows("   -Deep item");
        assertEquals("One row parsed", 1, rows.size());
        OutlineRow r = rows.get(0);
        assertEquals("indent must be 2", 2, r.indent);
        assertFalse("complete must be false", r.complete);
        assertEquals("text preserved", "Deep item", r.text);
    }

    @Test
    public void nestedCompleteRowIndent2() {
        // Export format: "  x-text" (2 leading spaces then 'x-' then text)
        ArrayList<OutlineRow> rows = OutlineStore.parseTxtRows("  x-Deep done");
        assertEquals("One row parsed", 1, rows.size());
        OutlineRow r = rows.get(0);
        assertEquals("indent must be 2", 2, r.indent);
        assertTrue("complete must be true", r.complete);
        assertEquals("text preserved", "Deep done", r.text);
    }

    // ---- realistic multi-row block ----

    @Test
    public void realisticExportedBlock() {
        // Mirrors what exportTxtToDir writes for a mixed outline.
        // Each line prepended with '\n' by the exporter, producing a leading empty element
        // when split — that empty element is skipped by parseTxtRows.
        String txt = "\n -Buy milk"
                + "\n x-Organic"
                + "\n  -Whole"
                + "\nx-Submit report"
                + "\n   -Appendix draft";
        ArrayList<OutlineRow> rows = OutlineStore.parseTxtRows(txt);
        assertEquals("Five rows in realistic block", 5, rows.size());

        OutlineRow r0 = rows.get(0);
        assertEquals("r0 indent", 0, r0.indent);
        assertFalse("r0 not complete", r0.complete);
        assertEquals("r0 text", "Buy milk", r0.text);

        OutlineRow r1 = rows.get(1);
        assertEquals("r1 indent", 1, r1.indent);
        assertTrue("r1 complete", r1.complete);
        assertEquals("r1 text", "Organic", r1.text);

        OutlineRow r2 = rows.get(2);
        assertEquals("r2 indent", 1, r2.indent);
        assertFalse("r2 not complete", r2.complete);
        assertEquals("r2 text", "Whole", r2.text);

        OutlineRow r3 = rows.get(3);
        assertEquals("r3 indent", 0, r3.indent);
        assertTrue("r3 complete", r3.complete);
        assertEquals("r3 text", "Submit report", r3.text);

        OutlineRow r4 = rows.get(4);
        assertEquals("r4 indent", 2, r4.indent);
        assertFalse("r4 not complete", r4.complete);
        assertEquals("r4 text", "Appendix draft", r4.text);
    }

    @Test
    public void textWithSpacesPreserved() {
        // The parser does not trim text — internal spacing in the row label is preserved.
        ArrayList<OutlineRow> rows = OutlineStore.parseTxtRows(" -Hello   world  ");
        assertEquals("One row", 1, rows.size());
        assertEquals("text with internal spaces preserved", "Hello   world  ", rows.get(0).text);
    }

    @Test
    public void windowsLineEndingsHandled() {
        // exportTxtToDir uses '\n' only, but imported files may have CRLF endings.
        String txt = " -First\r\nx-Second";
        ArrayList<OutlineRow> rows = OutlineStore.parseTxtRows(txt);
        assertEquals("Two rows with CRLF line endings", 2, rows.size());
        assertEquals("r0 text", "First", rows.get(0).text);
        assertEquals("r1 text", "Second", rows.get(1).text);
        assertFalse("r0 not complete", rows.get(0).complete);
        assertTrue("r1 complete", rows.get(1).complete);
    }

    // helpers — avoid overloaded assertEquals ambiguity
    private static void assertEquals(String msg, int expected, int actual) {
        if (expected != actual)
            throw new AssertionError(msg + " expected:<" + expected + "> but was:<" + actual + ">");
    }

    private static void assertEquals(String msg, String expected, String actual) {
        if (!expected.equals(actual))
            throw new AssertionError(msg + " expected:<" + expected + "> but was:<" + actual + ">");
    }
}
