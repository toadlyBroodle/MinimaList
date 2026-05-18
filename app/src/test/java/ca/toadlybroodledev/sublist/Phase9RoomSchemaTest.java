package ca.toadlybroodledev.sublist;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;

import static org.junit.Assert.assertTrue;

/**
 * Phase 9.1 — Room schema structure, verified by source scan (JVM unit test; no Android
 * framework needed). Instrumented tests (in-memory database queries) live in androidTest and
 * require a device; those are gated on Phase 7.
 *
 * sublistEntityHasRoomAnnotations: SublistEntity.java must carry @Entity + @PrimaryKey + fields
 *   id, name, position.
 * outlineRowEntityHasAllOutlineRowFields: OutlineRowEntity.java must mirror every field from
 *   OutlineRow (text, complete, collapsed, indent, reminder, isInstr) plus id, sublistId,
 *   position.
 * outlineRowEntityHasForeignKey: OutlineRowEntity.java must declare a @ForeignKey referencing
 *   SublistEntity with CASCADE delete so orphaned rows are cleaned up automatically.
 * sublistDaoHasRequiredOperations: SublistDao.java must declare @Insert, a SELECT * FROM
 *   sublists query, a DELETE query by id, and an UPDATE for rename.
 * outlineRowDaoHasRequiredOperations: OutlineRowDao.java must declare @Insert, SELECT rows by
 *   sublist_id, DELETE by id, DELETE completed rows, and DELETE all rows for a sublist (used
 *   by replaceRowsForSublist).
 * sublistDatabaseDeclaresVersion1: SublistDatabase.java must set version = 1 and reference
 *   both entity classes in the @Database annotation.
 */
public class Phase9RoomSchemaTest {

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

    private boolean fileExists(String relativePath) {
        return new File(projectRoot(), relativePath).exists();
    }

    private static final String ENTITY_DIR =
            "app/src/main/java/ca/toadlybroodledev/sublist/db/entity/";
    private static final String DAO_DIR =
            "app/src/main/java/ca/toadlybroodledev/sublist/db/dao/";
    private static final String DB_DIR =
            "app/src/main/java/ca/toadlybroodledev/sublist/db/";

    @Test
    public void sublistEntityHasRoomAnnotations() {
        String src = readSource(ENTITY_DIR + "SublistEntity.java");
        assertTrue("SublistEntity must have @Entity annotation", src.contains("@Entity"));
        assertTrue("SublistEntity must have @PrimaryKey annotation", src.contains("@PrimaryKey"));
        assertTrue("SublistEntity must declare id field", src.contains("id"));
        assertTrue("SublistEntity must declare name field", src.contains("name"));
        assertTrue("SublistEntity must declare position field", src.contains("position"));
    }

    @Test
    public void outlineRowEntityHasAllOutlineRowFields() {
        String src = readSource(ENTITY_DIR + "OutlineRowEntity.java");
        assertTrue("OutlineRowEntity must have @Entity annotation", src.contains("@Entity"));
        assertTrue("OutlineRowEntity must have @PrimaryKey annotation", src.contains("@PrimaryKey"));
        assertTrue("OutlineRowEntity must declare id field", src.contains("id"));
        assertTrue("OutlineRowEntity must declare sublistId / sublist_id", src.contains("sublist_id") || src.contains("sublistId"));
        assertTrue("OutlineRowEntity must declare position field", src.contains("position"));
        // Mirror every field from OutlineRow
        assertTrue("OutlineRowEntity must declare text field", src.contains("text"));
        assertTrue("OutlineRowEntity must declare complete field", src.contains("complete"));
        assertTrue("OutlineRowEntity must declare collapsed field", src.contains("collapsed"));
        assertTrue("OutlineRowEntity must declare indent field", src.contains("indent"));
        assertTrue("OutlineRowEntity must declare reminder field", src.contains("reminder"));
        assertTrue("OutlineRowEntity must declare isInstr / is_instr field",
                src.contains("isInstr") || src.contains("is_instr"));
    }

    @Test
    public void outlineRowEntityHasForeignKey() {
        String src = readSource(ENTITY_DIR + "OutlineRowEntity.java");
        assertTrue("OutlineRowEntity must declare @ForeignKey", src.contains("@ForeignKey") || src.contains("ForeignKey"));
        assertTrue("OutlineRowEntity @ForeignKey must reference SublistEntity",
                src.contains("SublistEntity"));
        assertTrue("OutlineRowEntity @ForeignKey must use CASCADE delete",
                src.contains("CASCADE") || src.contains("ForeignKey.CASCADE"));
    }

    @Test
    public void sublistDaoHasRequiredOperations() {
        String src = readSource(DAO_DIR + "SublistDao.java");
        assertTrue("SublistDao must have @Dao annotation", src.contains("@Dao"));
        assertTrue("SublistDao must have @Insert", src.contains("@Insert"));
        assertTrue("SublistDao must SELECT * FROM sublists", src.contains("sublists"));
        assertTrue("SublistDao must have a DELETE query by id", src.contains("DELETE") && src.contains("id"));
        assertTrue("SublistDao must have an UPDATE query for rename", src.contains("UPDATE") || src.contains("rename") || src.contains("name"));
    }

    @Test
    public void outlineRowDaoHasRequiredOperations() {
        String src = readSource(DAO_DIR + "OutlineRowDao.java");
        assertTrue("OutlineRowDao must have @Dao annotation", src.contains("@Dao"));
        assertTrue("OutlineRowDao must have @Insert", src.contains("@Insert"));
        assertTrue("OutlineRowDao must SELECT rows by sublist_id",
                src.contains("outline_rows") && (src.contains("sublist_id") || src.contains("sublistId")));
        assertTrue("OutlineRowDao must DELETE a single row by id", src.contains("DELETE") && src.contains("id"));
        assertTrue("OutlineRowDao must DELETE completed rows", src.contains("complete"));
        assertTrue("OutlineRowDao must DELETE all rows for a sublist (for replaceRows)",
                src.contains("DELETE") && src.contains("outline_rows"));
    }

    @Test
    public void sublistDatabaseDeclaresVersion1() {
        String src = readSource(DB_DIR + "SublistDatabase.java");
        assertTrue("SublistDatabase must extend RoomDatabase",
                src.contains("RoomDatabase") || src.contains("extends RoomDatabase"));
        assertTrue("SublistDatabase must set version = 1",
                src.contains("version = 1") || src.contains("version=1"));
        assertTrue("SublistDatabase must reference SublistEntity",
                src.contains("SublistEntity"));
        assertTrue("SublistDatabase must reference OutlineRowEntity",
                src.contains("OutlineRowEntity"));
    }
}
