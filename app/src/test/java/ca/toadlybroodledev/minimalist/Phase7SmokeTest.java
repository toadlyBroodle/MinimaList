package ca.toadlybroodledev.minimalist;

import org.junit.Test;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import static org.junit.Assert.*;

/**
 * Phase 7 smoke-test regression guards. These verify fixes found during the first
 * actual device run:
 *
 * (a) activity_main.xml was a bare FrameLayout stub — MainActivity.onCreate crashed on
 *     null findViewByIds. Fixed by populating the full DrawerCustomLayout + toolbar +
 *     fragment-container + FAB layout.
 *
 * (b) arrays.xml used <array> for color palettes. AAPT stores hex-color items
 *     (e.g. "#d32f2f") as TYPE_INT_COLOR, and getStringArray() returns null for those
 *     items on API 30. Fixed by switching to <string-array>.
 *
 * (c) OutlineFragment.onAttach did not initialize the static f3901c host reference.
 *     Clicking a row in WelcomeFragment before the async m4755B callback fired
 *     caused NPE on f3901c. Fixed by adding the assignment in onAttach.
 */
public class Phase7SmokeTest {

    private static String readFile(String relativePath) throws Exception {
        return new String(Files.readAllBytes(Paths.get(relativePath)));
    }

    // ── (a) activity_main layout has the views MainActivity.onCreate depends on ──────

    @Test
    public void activityMainLayoutHasPlaceholderForFragments() throws Exception {
        String xml = readFile("src/main/res/layout/activity_main.xml");
        assertTrue("activity_main.xml must declare placeholder_for_fragments",
                xml.contains("placeholder_for_fragments"));
    }

    @Test
    public void activityMainLayoutHasDrawerLayout() throws Exception {
        String xml = readFile("src/main/res/layout/activity_main.xml");
        assertTrue("activity_main.xml must declare drawer_layout",
                xml.contains("drawer_layout"));
    }

    @Test
    public void activityMainLayoutHasFab() throws Exception {
        String xml = readFile("src/main/res/layout/activity_main.xml");
        assertTrue("activity_main.xml must declare fab",
                xml.contains("\"@+id/fab\"") || xml.contains("\"@id/fab\""));
    }

    @Test
    public void activityMainLayoutUsesAndroidxCoordinatorLayout() throws Exception {
        String xml = readFile("src/main/res/layout/activity_main.xml");
        assertTrue("activity_main.xml must use AndroidX CoordinatorLayout, not support library",
                xml.contains("androidx.coordinatorlayout.widget.CoordinatorLayout"));
        assertFalse("activity_main.xml must not reference android.support.*",
                xml.contains("android.support."));
    }

    @Test
    public void activityMainLargeLayoutUsesAndroidxCoordinatorLayout() throws Exception {
        String xml = readFile("src/main/res/layout-large/activity_main.xml");
        assertTrue("layout-large/activity_main.xml must use AndroidX CoordinatorLayout",
                xml.contains("androidx.coordinatorlayout.widget.CoordinatorLayout"));
        assertFalse("layout-large/activity_main.xml must not reference android.support.*",
                xml.contains("android.support."));
    }

    // ── (b) color arrays must use <string-array> so AAPT stores items as TYPE_STRING ─

    @Test
    public void colorArraysUseStringArrayNotArray() throws Exception {
        String xml = readFile("src/main/res/values/arrays.xml");
        // Verify color arrays are declared as string-array, not the ambiguous <array>
        // type that causes AAPT to store hex-color items as TYPE_INT_COLOR.
        for (String name : new String[]{
                "colors_300_array", "colors_500_array", "colors_700_array",
                "colors_a400_array", "colors_text_array", "colors_text_compl_array"}) {
            assertTrue("arrays.xml: " + name + " must be <string-array>",
                    xml.contains("string-array name=\"" + name + "\""));
            assertFalse("arrays.xml: " + name + " must not use bare <array>",
                    xml.contains("<array name=\"" + name + "\""));
        }
    }

    // ── (c) OutlineFragment.onAttach initializes f3901c before interaction fires ────

    @Test
    public void sublistFragmentOnAttachInitializesHostContract() throws Exception {
        String src = readFile(
                "src/main/java/ca/toadlybroodledev/minimalist/OutlineFragment.java");
        // onAttach must assign f3901c so that WelcomeFragment rows can be
        // safely clicked before m4755B's async callback fires.
        int onAttachIdx = src.indexOf("public void onAttach(Context context)");
        assertTrue("OutlineFragment must have onAttach(Context)", onAttachIdx >= 0);
        String onAttachBody = src.substring(onAttachIdx,
                src.indexOf("}", onAttachIdx) + 1);
        assertTrue("OutlineFragment.onAttach must assign f3901c = (HostContract) context",
                onAttachBody.contains("f3901c") && onAttachBody.contains("HostContract"));
    }
}
