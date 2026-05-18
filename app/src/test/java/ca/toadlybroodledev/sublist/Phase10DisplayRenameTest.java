package ca.toadlybroodledev.sublist;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Phase 10.1: display rename residuals.
 *
 * Verifies that the remaining forward-looking "sublist" → "MinimaList" renames are applied:
 *  - info_save_loc backup filename pattern in strings.xml
 *  - Document titles in SPEC.md, RENAME-MAP.md, and TODO.md
 */
public class Phase10DisplayRenameTest {

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

    // ---- strings.xml: info_save_loc backup filename -------------------------

    @Test
    public void infoSaveLocUsesMinimalistBackupName() {
        String xml = read("app/src/main/res/values/strings.xml");
        assertFalse("info_save_loc must not contain old sublist_collection_backup pattern (Phase 10.1)",
                xml.contains("sublist_collection_backup"));
        assertTrue("info_save_loc must use MinimaList_collection_backup pattern (Phase 10.1)",
                xml.contains("MinimaList_collection_backup"));
    }

    // ---- document title sweeps ----------------------------------------------

    @Test
    public void specDocTitleIsMinimalist() {
        String spec = read("docs/SPEC.md");
        assertTrue("SPEC.md must open with '# MinimaList SPEC' (Phase 10.1)",
                spec.startsWith("# MinimaList SPEC"));
    }

    @Test
    public void renameMapDocTitleIsMinimalist() {
        String map = read("docs/RENAME-MAP.md");
        assertTrue("RENAME-MAP.md must open with '# MinimaList' (Phase 10.1)",
                map.startsWith("# MinimaList"));
    }

    @Test
    public void todoDocTitleIsMinimalist() {
        String todo = read("docs/TODO.md");
        assertTrue("TODO.md must open with '# MinimaList TODO' (Phase 10.1)",
                todo.startsWith("# MinimaList TODO"));
    }
}
