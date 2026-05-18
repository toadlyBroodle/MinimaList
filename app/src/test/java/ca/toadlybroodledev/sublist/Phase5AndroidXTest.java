package ca.toadlybroodledev.sublist;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Phase 5 AndroidX migration invariants.
 *
 * gradlePropertiesFlags: fails until android.enableJetifier=false is added.
 * noAndroidSupportImports: confirms 5.2/5.3 are N/A — no android.support.* import
 *   statements exist in source (only a comment reference in RowActionListener.java).
 */
public class Phase5AndroidXTest {

    private File projectRoot() {
        File dir = new File(System.getProperty("user.dir"));
        while (dir != null) {
            if (new File(dir, "settings.gradle.kts").exists()) return dir;
            dir = dir.getParentFile();
        }
        throw new IllegalStateException("Cannot find project root from: " + System.getProperty("user.dir"));
    }

    @Test
    public void gradlePropertiesHasBothAndroidXFlags() throws IOException {
        File props = new File(projectRoot(), "gradle.properties");
        String content = new String(Files.readAllBytes(props.toPath()));
        assertTrue("gradle.properties must contain android.useAndroidX=true",
                content.contains("android.useAndroidX=true"));
        assertTrue("gradle.properties must contain android.enableJetifier=false",
                content.contains("android.enableJetifier=false"));
    }

    @Test
    public void noAndroidSupportImportStatementsInSource() throws IOException {
        File srcRoot = new File(projectRoot(), "app/src/main/java");
        List<String> violations = new ArrayList<>();
        collectJavaFiles(srcRoot).forEach(f -> {
            try {
                List<String> lines = Files.readAllLines(f.toPath());
                for (int i = 0; i < lines.size(); i++) {
                    String line = lines.get(i).trim();
                    if (line.startsWith("import android.support.")) {
                        violations.add(f.getName() + ":" + (i + 1) + " — " + line);
                    }
                }
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        });
        assertTrue("android.support.* import statements found (Phase 5 regression):\n"
                + String.join("\n", violations), violations.isEmpty());
    }

    private List<File> collectJavaFiles(File dir) {
        List<File> out = new ArrayList<>();
        if (!dir.isDirectory()) return out;
        File[] entries = dir.listFiles();
        if (entries == null) return out;
        for (File f : entries) {
            if (f.isDirectory()) out.addAll(collectJavaFiles(f));
            else if (f.getName().endsWith(".java")) out.add(f);
        }
        return out;
    }
}
