package ca.toadlybroodle.minimalist;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Phase 13.1–13.4: UI polish (round 2).
 *
 * 13.1 — Settings page buttons (Export / Import / Contribute) showed black text
 *        against the accent background when a light palette entry was selected
 *        (contrastingTextColor returned 0xFF1A1C1F for luma > 140 accents like
 *        #98ABB8). Fix: Settings buttons always receive white text (0xFFF4F4F2),
 *        bypassing the luma computation entirely.
 *
 * 13.2 — Settings and Search pages had no per-page logo + title header in their
 *        fragment layouts; toolbar title alone was left-justified. Fix: add a
 *        horizontally-centered header block (ImageView logo + TextView title) to
 *        fragment_settings.xml, layout-large/fragment_settings.xml,
 *        fragment_search.xml, and layout-large/fragment_search.xml.
 *
 * 13.3 — Nav-drawer header icon (Phase 11.1 vector drawable) used filled-circle
 *        bullets and rounded strokeLineCap on the horizontal rules. Fix: hollow
 *        circles (transparent fill + white stroke) and butt strokeLineCap.
 *
 * 13.4 — After Phase 11.2's reset-loop fix, the active sublist title was still
 *        showing in the default text color (light grey on the dark nav background)
 *        because setChecked(true) alone does not force a NavigationView text-color
 *        refresh against the runtime accent (which differs from the static XML
 *        colorAccent when the user picks a palette entry). Fix: DrawerCustomLayout
 *        calls setItemTextColor / setItemIconTint with a fresh ColorStateList using
 *        AppSettings.m4939e() after each selection; MainActivity.mo4772b() calls
 *        applyDrawerAccentColors() so the accent color updates when the user picks
 *        a new palette in Settings.
 */
public class Phase13UiPolishTest {

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

    // ---- 13.1: Settings buttons always white text ---------------------------

    @Test
    public void settingsButtonsHardcodeWhiteText() {
        String src = read(
                "app/src/main/java/ca/toadlybroodle/minimalist/MainActivity.java");
        assertFalse(
                "Settings button text must NOT be computed via contrastingTextColor(accent) — "
                        + "that returns black for many palette entries (Phase 13.1)",
                src.contains("btnText = StringArraySpinnerAdapter.contrastingTextColor(accent)"));
        assertTrue(
                "Settings buttons must use hardcoded white text (0xFFF4F4F2) (Phase 13.1)",
                src.contains("btnText = 0xFFF4F4F2"));
    }

    // ---- 13.2: centered logo + title in Settings / Search fragment layouts --

    @Test
    public void settingsFragmentHasCenteredLogoHeader() {
        for (String variant : new String[]{"layout", "layout-large"}) {
            String xml = read("app/src/main/res/" + variant + "/fragment_settings.xml");
            assertTrue(
                    variant + "/fragment_settings.xml must contain gravity=\"center\" "
                            + "for the logo+title header LinearLayout (Phase 13.2)",
                    xml.contains("gravity=\"center\""));
            assertTrue(
                    variant + "/fragment_settings.xml must reference "
                            + "@drawable/minimalist_nav_drawer_logo in the header (Phase 13.2)",
                    xml.contains("@drawable/minimalist_nav_drawer_logo"));
        }
    }

    @Test
    public void searchFragmentHasCenteredLogoHeader() {
        for (String variant : new String[]{"layout", "layout-large"}) {
            String xml = read("app/src/main/res/" + variant + "/fragment_search.xml");
            assertTrue(
                    variant + "/fragment_search.xml must contain gravity=\"center\" "
                            + "for the logo+title header LinearLayout (Phase 13.2)",
                    xml.contains("gravity=\"center\""));
            assertTrue(
                    variant + "/fragment_search.xml must reference "
                            + "@drawable/minimalist_nav_drawer_logo in the header (Phase 13.2)",
                    xml.contains("@drawable/minimalist_nav_drawer_logo"));
        }
    }

    // ---- 13.3: hollow circles + butt line caps in vector logo ---------------

    @Test
    public void navDrawerLogoHasHollowCircles() {
        String xml = read("app/src/main/res/drawable/minimalist_nav_drawer_logo.xml");
        assertFalse(
                "minimalist_nav_drawer_logo.xml must NOT have solid-white filled circles "
                        + "(android:fillColor=\"#FFFFFF\" on a path) — circles must be hollow (Phase 13.3)",
                xml.contains("android:fillColor=\"#FFFFFF\""));
        assertTrue(
                "minimalist_nav_drawer_logo.xml must have android:strokeColor=\"#FFFFFF\" "
                        + "to outline the hollow circles (Phase 13.3)",
                xml.contains("android:strokeColor=\"#FFFFFF\""));
    }

    @Test
    public void navDrawerLogoHasButtLineCaps() {
        String xml = read("app/src/main/res/drawable/minimalist_nav_drawer_logo.xml");
        assertFalse(
                "minimalist_nav_drawer_logo.xml must NOT use strokeLineCap=\"round\" — "
                        + "rule ends must be square (Phase 13.3)",
                xml.contains("strokeLineCap=\"round\""));
        assertTrue(
                "minimalist_nav_drawer_logo.xml must use strokeLineCap=\"butt\" (Phase 13.3)",
                xml.contains("strokeLineCap=\"butt\""));
    }

    // ---- 13.4: drawer active item rendered in dynamic accent color ----------

    @Test
    public void drawerSetsItemTextColorDynamically() {
        String src = read(
                "app/src/main/java/ca/toadlybroodle/minimalist/DrawerCustomLayout.java");
        assertTrue(
                "DrawerCustomLayout must call setItemTextColor to apply the runtime accent "
                        + "to the active sublist entry (Phase 13.4)",
                src.contains("setItemTextColor"));
        assertTrue(
                "DrawerCustomLayout must call setItemIconTintList to tint icons with the "
                        + "same runtime accent ColorStateList (Phase 13.4)",
                src.contains("setItemIconTintList"));
        assertTrue(
                "DrawerCustomLayout must build a ColorStateList for the checked/default "
                        + "text-color states (Phase 13.4)",
                src.contains("ColorStateList"));
    }

    @Test
    public void mainActivityRefreshesDrawerAccentColors() {
        String src = read(
                "app/src/main/java/ca/toadlybroodle/minimalist/MainActivity.java");
        assertTrue(
                "MainActivity.mo4772b must call applyDrawerAccentColors() so the drawer "
                        + "refreshes when the user picks a new accent (Phase 13.4)",
                src.contains("applyDrawerAccentColors"));
    }
}
