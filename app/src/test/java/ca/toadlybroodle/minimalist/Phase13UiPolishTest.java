package ca.toadlybroodle.minimalist;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Phase 13.1–13.4: UI polish (round 2), with the 13.2 / 13.4 follow-up corrections.
 *
 * 13.1 — Settings page buttons (Export / Import / Contribute) showed black text
 *        against the accent background when a light palette entry was selected
 *        (contrastingTextColor returned 0xFF1A1C1F for luma > 140 accents). Fix:
 *        Settings buttons always receive white text (0xFFF4F4F2). The Location /
 *        Format spinner pickers had the same black-text problem and were given
 *        the same hardcoded white in StringArraySpinnerAdapter's plain-label branch.
 *
 * 13.2 — The first 13.2 pass added a per-fragment logo+title header to the Settings
 *        and Search layouts; that duplicated the toolbar title. Corrected: the
 *        in-fragment headers were removed, and the real fix is applied on the
 *        toolbar — its inner LinearLayout's gravity goes from "center" to
 *        "center_vertical" so the fragment title bar is left-justified.
 *
 * 13.3 — Nav-drawer header icon (Phase 11.1 vector drawable) used filled-circle
 *        bullets and rounded strokeLineCap on the horizontal rules. Fix: hollow
 *        circles (transparent fill + white stroke) and butt strokeLineCap.
 *
 * 13.4 — The active sublist title stayed default white. setItemTextColor's
 *        ColorStateList only resolves the state_checked branch when the menu item
 *        is checkable, and the dynamically-added sublist entries were not. Fix:
 *        DrawerCustomLayout marks every navigable leaf item checkable (at add time
 *        in m4798a and defensively in applyDrawerAccentColors) before applying the
 *        AppSettings.m4939e() accent ColorStateList.
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

    // ---- 13.1: Settings buttons + plain-label spinners always white text ----

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

    @Test
    public void colorChangeRefreshesAllSettingsSpinners() {
        String main = read(
                "app/src/main/java/ca/toadlybroodle/minimalist/MainActivity.java");
        String settings = read(
                "app/src/main/java/ca/toadlybroodle/minimalist/SettingsFragment.java");
        assertTrue(
                "MainActivity.mo4772b must call refreshSpinners() so a colour change "
                        + "repaints every spinner background, not only the touched one "
                        + "(Phase 13.1 follow-up)",
                main.contains("refreshSpinners"));
        assertTrue(
                "SettingsFragment.refreshSpinners must notifyDataSetChanged on the spinner "
                        + "adapters to force a collapsed-view re-render (Phase 13.1 follow-up)",
                settings.contains("void refreshSpinners()")
                        && settings.contains("notifyDataSetChanged"));
    }

    @Test
    public void spinnerPlainLabelsUseWhiteText() {
        String src = read(
                "app/src/main/java/ca/toadlybroodle/minimalist/StringArraySpinnerAdapter.java");
        assertTrue(
                "StringArraySpinnerAdapter's plain-label branch must paint white text "
                        + "(0xFFF4F4F2) on the accent background, matching the Settings buttons "
                        + "(Phase 13.1 follow-up)",
                src.contains("textView.setTextColor(0xFFF4F4F2)"));
    }

    // ---- 13.2: no duplicate in-fragment header; toolbar title left-justified -

    @Test
    public void settingsAndSearchFragmentsHaveNoDuplicateLogoHeader() {
        for (String variant : new String[]{"layout", "layout-large"}) {
            for (String frag : new String[]{"fragment_settings.xml", "fragment_search.xml"}) {
                String xml = read("app/src/main/res/" + variant + "/" + frag);
                assertFalse(
                        variant + "/" + frag + " must NOT carry an in-fragment logo header — "
                                + "it duplicates the toolbar title (Phase 13.2 correction)",
                        xml.contains("@drawable/minimalist_nav_drawer_logo"));
            }
        }
    }

    @Test
    public void toolbarTitleBarIsLeftJustified() {
        for (String variant : new String[]{"layout", "layout-large"}) {
            String xml = read("app/src/main/res/" + variant + "/activity_main.xml");
            assertFalse(
                    variant + "/activity_main.xml toolbar LinearLayout must NOT use "
                            + "gravity=\"center\" — the title bar must be left-justified "
                            + "(Phase 13.2 correction)",
                    xml.contains("android:gravity=\"center\""));
            assertTrue(
                    variant + "/activity_main.xml toolbar LinearLayout must use "
                            + "gravity=\"center_vertical\" (Phase 13.2 correction)",
                    xml.contains("android:gravity=\"center_vertical\""));
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
    public void drawerMarksMenuItemsCheckable() {
        String src = read(
                "app/src/main/java/ca/toadlybroodle/minimalist/DrawerCustomLayout.java");
        assertTrue(
                "DrawerCustomLayout must call setCheckable(true) on drawer items — "
                        + "NavigationView only reports state_checked for checkable items, so the "
                        + "accent ColorStateList never resolves otherwise (Phase 13.4 correction)",
                src.contains("setCheckable(true)"));
    }

    @Test
    public void drawerSetsItemColorsDynamically() {
        String src = read(
                "app/src/main/java/ca/toadlybroodle/minimalist/DrawerCustomLayout.java");
        assertTrue(
                "DrawerCustomLayout must call setItemBackground with a checked-state drawable "
                        + "so the active row's background is the chosen accent, not the default "
                        + "grey (Phase 13.4 correction)",
                src.contains("setItemBackground") && src.contains("StateListDrawable"));
        assertTrue(
                "DrawerCustomLayout must call setItemTextColor / setItemIconTintList with a "
                        + "ColorStateList for the checked/default states (Phase 13.4)",
                src.contains("setItemTextColor") && src.contains("setItemIconTintList")
                        && src.contains("ColorStateList"));
        assertTrue(
                "The drawer highlight must read the Settings accent picker (m4945j) and the "
                        + "chosen text colour (m4943h) (Phase 13.4 colour-source correction)",
                src.contains("m4945j()") && src.contains("m4943h()"));
        assertFalse(
                "applyDrawerAccentColors must NOT source the highlight from m4939e() — that "
                        + "pref is the background-hue tint, unaffected by the accent picker "
                        + "(Phase 13.4 colour-source fix)",
                src.contains("AppSettings.m4939e()"));
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
