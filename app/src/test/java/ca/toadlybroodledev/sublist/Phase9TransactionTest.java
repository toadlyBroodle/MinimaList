package ca.toadlybroodledev.sublist;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;

import static org.junit.Assert.assertTrue;

/**
 * Phase 9 transaction-safety follow-ups (review of 909c804).
 *
 * outlineRowDaoHasTransactionalReplaceMethod: OutlineRowDao must have a @Transaction-annotated
 *   default method named replaceForSublist so the delete-then-insert is atomic under Room.
 *
 * repositoryImplReplaceRowsDelegatesToTransactionalDaoMethod: OutlineRepositoryImpl
 *   replaceRowsForSublist must delegate to the DAO's replaceForSublist, not call
 *   delete+insert as two separate operations.
 *
 * repositoryImplImportLegacyWrapsInTransaction: OutlineRepositoryImpl importLegacy must
 *   use runInTransaction so a mid-loop failure doesn't leave partial data.
 *
 * repositoryImplHoldsDatabaseReference: OutlineRepositoryImpl must hold a SublistDatabase
 *   reference (needed to call db.runInTransaction).
 */
public class Phase9TransactionTest {

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

    private static final String DAO_DIR =
            "app/src/main/java/ca/toadlybroodledev/sublist/db/dao/";
    private static final String DB_DIR =
            "app/src/main/java/ca/toadlybroodledev/sublist/db/";

    @Test
    public void outlineRowDaoHasTransactionalReplaceMethod() {
        String src = readSource(DAO_DIR + "OutlineRowDao.java");
        assertTrue("OutlineRowDao must have @Transaction annotation for atomic replace",
                src.contains("@Transaction"));
        assertTrue("OutlineRowDao must have a replaceForSublist method",
                src.contains("replaceForSublist"));
    }

    @Test
    public void repositoryImplReplaceRowsDelegatesToTransactionalDaoMethod() {
        String src = readSource(DB_DIR + "OutlineRepositoryImpl.java");
        assertTrue("OutlineRepositoryImpl.replaceRowsForSublist must delegate to the " +
                "DAO's transactional replaceForSublist instead of calling delete+insert directly",
                src.contains("replaceForSublist"));
    }

    @Test
    public void repositoryImplImportLegacyWrapsInTransaction() {
        String src = readSource(DB_DIR + "OutlineRepositoryImpl.java");
        assertTrue("OutlineRepositoryImpl.importLegacy must use runInTransaction for " +
                "all-or-nothing migration atomicity",
                src.contains("runInTransaction"));
    }

    @Test
    public void repositoryImplHoldsDatabaseReference() {
        String src = readSource(DB_DIR + "OutlineRepositoryImpl.java");
        assertTrue("OutlineRepositoryImpl must hold a SublistDatabase reference " +
                "to enable runInTransaction wrapping",
                src.contains("SublistDatabase"));
    }
}
