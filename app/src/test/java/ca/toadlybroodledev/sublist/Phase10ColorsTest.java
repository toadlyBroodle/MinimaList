package ca.toadlybroodledev.sublist;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Phase 10.3: Modernize res/values/colors.xml with a muted Material 3
 * neutral palette. All 66 color-resource names are preserved so AppTheme
 * and ThemeOverlay.My* styles require no attribute changes.
 */
public class Phase10ColorsTest {

    private static final String COLORS_PATH = "app/src/main/res/values/colors.xml";

    private File projectRoot() {
        File dir = new File(System.getProperty("user.dir"));
        while (dir != null) {
            if (new File(dir, "settings.gradle.kts").exists()) return dir;
            dir = dir.getParentFile();
        }
        throw new IllegalStateException("Cannot find project root");
    }

    private String readColors() {
        try {
            return new String(Files.readAllBytes(
                    new File(projectRoot(), COLORS_PATH).toPath()));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Test
    public void appAccentColorIsMutedTeal() {
        String xml = readColors();
        assertTrue("colorAccent must be #80CBC4 (muted teal accent, Phase 10.3)",
                xml.contains("name=\"colorAccent\">#80CBC4</color>")
                        || xml.contains("name=\"colorAccent\">#80cbc4</color>"));
    }

    @Test
    public void appPrimaryColorIsMutedBlueGrey() {
        String xml = readColors();
        assertTrue("colorPrimary must be #455A64 (Blue Grey 700, Phase 10.3)",
                xml.contains("name=\"colorPrimary\">#455A64</color>")
                        || xml.contains("name=\"colorPrimary\">#455a64</color>"));
    }

    @Test
    public void appPrimaryDarkColorIsMutedDark() {
        String xml = readColors();
        assertTrue("colorPrimaryDark must be #263238 (Blue Grey 900, Phase 10.3)",
                xml.contains("name=\"colorPrimaryDark\">#263238</color>"));
    }

    @Test
    public void highSaturationFirebaseColorsReplaced() {
        String xml = readColors();
        assertFalse("firebaseColorAccent #ffa000 (high-saturation amber) must be gone (10.3)",
                xml.contains("#ffa000") || xml.contains("#FFA000"));
        assertFalse("firebaseColorPrimary #039be5 (saturated blue) must be gone (10.3)",
                xml.contains("#039be5") || xml.contains("#039BE5"));
        assertFalse("firebaseColorPrimaryDark #0288d1 must be gone (10.3)",
                xml.contains("#0288d1") || xml.contains("#0288D1"));
    }

    @Test
    public void boldTealSoftened() {
        String xml = readColors();
        // material_deep_teal_500 was #ff009688 (bold teal); must be softened
        assertFalse("material_deep_teal_500 #ff009688 (bold teal) must be replaced (10.3)",
                xml.contains("#ff009688") || xml.contains("#FF009688"));
    }

    @Test
    public void allColorNamesPreserved() {
        String xml = readColors();
        String[] names = {
                "accent_material_dark", "accent_material_light",
                "background_floating_material_dark", "background_floating_material_light",
                "background_material_dark", "background_material_light",
                "bright_foreground_disabled_material_dark", "bright_foreground_disabled_material_light",
                "bright_foreground_inverse_material_dark", "bright_foreground_inverse_material_light",
                "bright_foreground_material_dark", "bright_foreground_material_light",
                "button_material_dark", "button_material_light",
                "colorAccent", "colorPrimary", "colorPrimaryDark",
                "colorTextWhite", "colorTextWhiteCompleted",
                "dim_foreground_disabled_material_dark", "dim_foreground_disabled_material_light",
                "dim_foreground_material_dark", "dim_foreground_material_light",
                "error_color_material",
                "firebaseColorAccent", "firebaseColorPrimary", "firebaseColorPrimaryDark",
                "foreground_material_dark", "foreground_material_light",
                "grey_100", "grey_300",
                "highlighted_text_material_dark", "highlighted_text_material_light",
                "material_blue_grey_800", "material_blue_grey_900", "material_blue_grey_950",
                "material_deep_teal_200", "material_deep_teal_500",
                "material_grey_100", "material_grey_300", "material_grey_50",
                "material_grey_600", "material_grey_800", "material_grey_850", "material_grey_900",
                "notification_action_color_filter", "notification_icon_bg_color",
                "notification_material_background_media_default_color",
                "primary_dark_material_dark", "primary_dark_material_light",
                "primary_material_dark", "primary_material_light",
                "primary_text_default_material_dark", "primary_text_default_material_light",
                "primary_text_disabled_material_dark", "primary_text_disabled_material_light",
                "ripple_material_dark", "ripple_material_light",
                "secondary_text_default_material_dark", "secondary_text_default_material_light",
                "secondary_text_disabled_material_dark", "secondary_text_disabled_material_light",
                "switch_thumb_disabled_material_dark", "switch_thumb_disabled_material_light",
                "switch_thumb_normal_material_dark", "switch_thumb_normal_material_light",
        };
        for (String name : names) {
            assertTrue("colors.xml must still declare " + name + " (Phase 10.3 preserves all names)",
                    xml.contains("name=\"" + name + "\""));
        }
    }
}
