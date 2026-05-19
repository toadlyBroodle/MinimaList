package ca.toadlybroodle.minimalist;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;

import static org.junit.Assert.assertTrue;

/**
 * Guards OutlineTree.m4995b against ArrayIndexOutOfBoundsException when the visible-rows
 * list (f3987b) is empty.
 *
 * m4995b is the "add a new row at the end of the search-filtered visible list" path,
 * invoked from OutlineFragment.mo4851al when f3898ao != -1 (search mode) and no row is
 * focused. The unguarded implementation reads f3987b.get(0) and f3987b.get(size-1) — both
 * crash IOOBE when the search has narrowed the visible set to zero rows. This is the same
 * shape as the MainActivity.onStop AIOOBE fix shipped in bd4b8ac; happens during CRUD
 * acceptance in search mode on a freshly-loaded outline.
 *
 * Fix: when f3987b is empty, fall back to m4991a(null) (the non-search add-new path) so
 * the user still gets a row added; otherwise proceed as before.
 */
public class OutlineTreeAddNewSearchGuardTest {

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

    private static final String OUTLINE_TREE =
            "app/src/main/java/ca/toadlybroodle/minimalist/OutlineTree.java";

    private String m4995bBody(String src) {
        int start = src.indexOf("void m4995b()");
        assertTrue("m4995b method must exist in OutlineTree", start >= 0);
        int braceStart = src.indexOf('{', start);
        int depth = 0;
        int i = braceStart;
        while (i < src.length()) {
            char c = src.charAt(i);
            if (c == '{') depth++;
            else if (c == '}') {
                depth--;
                if (depth == 0) return src.substring(braceStart, i + 1);
            }
            i++;
        }
        throw new IllegalStateException("Could not find end of m4995b method body");
    }

    @Test
    public void m4995bGuardsEmptyVisibleRows() {
        String body = m4995bBody(readSource(OUTLINE_TREE));
        // The guard must check that f3987b is non-empty before indexing into it.
        assertTrue(
                "m4995b must guard against empty f3987b before calling get(0) / get(size-1)",
                body.contains("f3987b.isEmpty()"));
    }

    @Test
    public void m4995bFallsBackToRootAddOnEmpty() {
        String body = m4995bBody(readSource(OUTLINE_TREE));
        // When f3987b is empty the implementation should reuse the non-search add-new path
        // (m4991a) so the user still gets a row appended.
        assertTrue(
                "m4995b empty-fallback should call m4991a((OutlineRow) null) instead of crashing",
                body.contains("m4991a((OutlineRow) null)") || body.contains("m4991a(null)"));
    }
}
