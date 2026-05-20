package ca.toadlybroodle.minimalist;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Phase 11.1 + 11.2: drawer UI polish.
 *
 * 11.1 — Replace the low-res density-bucketed PNGs for the nav-drawer header icon
 *        (minimalist_nav_drawer_logo) with a single vector drawable in res/drawable/.
 *        The source PNGs were 50dp-source images (50×50px at mdpi, 200×200px at
 *        xxxhdpi) displayed in a 150dp×150dp ImageView, so Android upscaled them
 *        ~3× on every density, causing visible blur on higher-density screens.
 *        A vector drawable scales perfectly at any density with no upscaling artefact.
 *
 * 11.2 — Fix drawer sublist accent-color accumulation. When the user opens sublists
 *        A → B → C via the drawer, all three retain the accent color because
 *        DrawerCustomLayout.onNavigationItemSelected reset loop iterates only the
 *        top-level Menu items — it does not descend into the SubMenu that holds the
 *        dynamically-added sublist entries. Fix: add a hasSubMenu() branch that
 *        also unchecks every item inside the SubMenu before checking the newly
 *        selected item.
 */
public class Phase11DrawerPolishTest {

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

    private boolean exists(String rel) {
        return new File(projectRoot(), rel).exists();
    }

    // ---- 11.1: vector drawable replaces density-bucketed PNGs ---------------

    @Test
    public void vectorDrawableExists() {
        assertTrue("res/drawable/minimalist_nav_drawer_logo.xml must exist (Phase 11.1)",
                exists("app/src/main/res/drawable/minimalist_nav_drawer_logo.xml"));
    }

    @Test
    public void vectorDrawableIsWellFormed() {
        String xml = read("app/src/main/res/drawable/minimalist_nav_drawer_logo.xml");
        assertTrue("minimalist_nav_drawer_logo.xml must be a VectorDrawable (<vector tag) (Phase 11.1)",
                xml.contains("<vector"));
        assertTrue("vector must declare android:viewportWidth (Phase 11.1)",
                xml.contains("android:viewportWidth"));
        assertTrue("vector must declare android:viewportHeight (Phase 11.1)",
                xml.contains("android:viewportHeight"));
        assertTrue("vector must contain at least one <path element (Phase 11.1)",
                xml.contains("<path"));
    }

    @Test
    public void densityBucketedPngsRemoved() {
        String[] densities = {"mdpi", "hdpi", "xhdpi", "xxhdpi", "xxxhdpi"};
        for (String d : densities) {
            assertFalse(
                    "drawable-" + d + "/minimalist_nav_drawer_logo.png must be removed — "
                            + "vector in drawable/ takes precedence only when density-bucketed "
                            + "PNGs are absent (Phase 11.1)",
                    exists("app/src/main/res/drawable-" + d + "/minimalist_nav_drawer_logo.png"));
        }
    }

    @Test
    public void navHeaderLayoutReferencesDrawableLogo() {
        for (String variant : new String[]{"layout", "layout-large"}) {
            String xml = read("app/src/main/res/" + variant + "/nav_header.xml");
            assertTrue(variant + "/nav_header.xml must reference @drawable/minimalist_nav_drawer_logo (Phase 11.1)",
                    xml.contains("@drawable/minimalist_nav_drawer_logo"));
        }
    }

    // ---- 11.2: drawer accent-color accumulation fix -------------------------

    @Test
    public void drawerResetLoopDescendsIntoSubMenu() {
        String src = read(
                "app/src/main/java/ca/toadlybroodle/minimalist/DrawerCustomLayout.java");
        // The onNavigationItemSelected reset loop must iterate SubMenu items.
        // Require hasSubMenu() (the guard) + getSubMenu() (the descent).
        assertTrue("DrawerCustomLayout must call hasSubMenu() in the reset loop (Phase 11.2)",
                src.contains("hasSubMenu()"));
        assertTrue("DrawerCustomLayout must call getSubMenu() to reach sublist items (Phase 11.2)",
                src.contains("getSubMenu()"));
    }

    @Test
    public void drawerResetLoopUnchecksSubMenuItems() {
        String src = read(
                "app/src/main/java/ca/toadlybroodle/minimalist/DrawerCustomLayout.java");
        // The sub-loop must call setChecked(false) on SubMenu items, not just
        // top-level items. The string "setChecked(false)" must appear MORE THAN ONCE
        // — once for the top-level loop and once (at minimum) inside the sub-loop.
        int count = 0;
        int idx = 0;
        while ((idx = src.indexOf("setChecked(false)", idx)) >= 0) {
            count++;
            idx++;
        }
        assertTrue("DrawerCustomLayout must call setChecked(false) at least twice — "
                + "once for top-level items, once for SubMenu items (Phase 11.2); found " + count,
                count >= 2);
    }
}
