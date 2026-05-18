package ca.toadlybroodledev.sublist;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import ca.toadlybroodledev.sublist.model.OutlineRow;

import static org.junit.Assert.*;

// Phase 4.5 imports (new classes being tested)
import android.content.Context;

/**
 * Structural tests for Phase 4.4 root-package port.
 * Verifies class hierarchy, key members, and rename-map correctness without requiring
 * a device (all assertions use reflection against the compiled class graph).
 */
public class RootPackagePortTest {

    // ---- OutlineRow: getListOfEntSers (deferred from 4.2) --------------------

    @Test
    public void outlineRowHasGetListOfEntSers() throws Exception {
        Method m = OutlineRow.class.getDeclaredMethod("getListOfEntSers", java.util.ArrayList.class);
        assertTrue("getListOfEntSers must be static", Modifier.isStatic(m.getModifiers()));
        assertEquals("getListOfEntSers must return ArrayList",
                java.util.ArrayList.class, m.getReturnType());
    }

    // ---- Clipboard -----------------------------------------------------------

    @Test
    public void clipboardClassExists() {
        assertEquals("ca.toadlybroodledev.sublist.Clipboard",
                Clipboard.class.getName());
    }

    @Test
    public void clipboardIsAbstract() {
        assertTrue(Modifier.isAbstract(Clipboard.class.getModifiers()));
    }

    @Test
    public void clipboardHasStaticGetRows() throws Exception {
        Method m = Clipboard.class.getDeclaredMethod("m4917a");
        assertTrue(Modifier.isStatic(m.getModifiers()));
    }

    @Test
    public void clipboardHasStaticGetSourceName() throws Exception {
        Method m = Clipboard.class.getDeclaredMethod("m4924b");
        assertTrue(Modifier.isStatic(m.getModifiers()));
    }

    @Test
    public void clipboardHasStaticGetCutRows() throws Exception {
        Method m = Clipboard.class.getDeclaredMethod("m4925c");
        assertTrue(Modifier.isStatic(m.getModifiers()));
    }

    // ---- AppSettings ---------------------------------------------------------

    @Test
    public void appSettingsClassExists() {
        assertEquals("ca.toadlybroodledev.sublist.AppSettings",
                AppSettings.class.getName());
    }

    @Test
    public void appSettingsHasKeyboardActionEnum() {
        Class<?>[] inner = AppSettings.class.getDeclaredClasses();
        boolean found = Arrays.stream(inner).anyMatch(c -> c.getSimpleName().equals("KeyboardAction")
                || c.getSimpleName().equals("a"));
        assertTrue("AppSettings must declare a keyboard-action inner enum", found);
    }

    @Test
    public void appSettingsHasSavePrefs() throws Exception {
        Method m = AppSettings.class.getDeclaredMethod("m4947l");
        assertTrue(Modifier.isStatic(m.getModifiers()));
    }

    // ---- OutlineStore --------------------------------------------------------

    @Test
    public void outlineStoreExtendsAppSettings() {
        assertEquals(AppSettings.class, OutlineStore.class.getSuperclass());
    }

    @Test
    public void outlineStoreHasSaveJson() throws Exception {
        Method m = OutlineStore.class.getDeclaredMethod("m4976a", boolean.class, boolean.class);
        assertFalse(Modifier.isStatic(m.getModifiers()));
    }

    @Test
    public void outlineStoreHasLoadJson() throws Exception {
        Method m = OutlineStore.class.getDeclaredMethod("m4977b", boolean.class, boolean.class);
        assertFalse(Modifier.isStatic(m.getModifiers()));
    }

    // ---- OutlineTree ---------------------------------------------------------

    @Test
    public void outlineTreeClassExists() {
        assertEquals("ca.toadlybroodledev.sublist.OutlineTree",
                OutlineTree.class.getName());
    }

    @Test
    public void outlineTreeHasRowList() throws Exception {
        Field f = OutlineTree.class.getDeclaredField("f3987b");
        assertEquals(java.util.ArrayList.class, f.getType());
    }

    @Test
    public void outlineTreeHasGetRows() throws Exception {
        Method m = OutlineTree.class.getDeclaredMethod("m4988a");
        assertEquals(java.util.ArrayList.class, m.getReturnType());
    }

    @Test
    public void outlineTreeHasChildren() throws Exception {
        Method m = OutlineTree.class.getDeclaredMethod("m5004h", OutlineRowView.class);
        assertEquals(java.util.ArrayList.class, m.getReturnType());
    }

    // ---- OutlineRowView ------------------------------------------------------

    @Test
    public void outlineRowViewClassExists() {
        assertEquals("ca.toadlybroodledev.sublist.OutlineRowView",
                OutlineRowView.class.getName());
    }

    @Test
    public void outlineRowViewHasGetIndent() throws Exception {
        Method m = OutlineRowView.class.getDeclaredMethod("m4859a");
        assertEquals(int.class, m.getReturnType());
    }

    @Test
    public void outlineRowViewHasCompleteFlag() throws Exception {
        Field f = OutlineRowView.class.getDeclaredField("f3823f");
        assertEquals(boolean.class, f.getType());
    }

    @Test
    public void outlineRowViewHasCollapsedFlag() throws Exception {
        Field f = OutlineRowView.class.getDeclaredField("f3824g");
        assertEquals(boolean.class, f.getType());
    }

    // ---- IndentManager -------------------------------------------------------

    @Test
    public void indentManagerClassExists() {
        assertEquals("ca.toadlybroodledev.sublist.IndentManager",
                IndentManager.class.getName());
    }

    @Test
    public void indentManagerHasRenderMethod() throws Exception {
        Method m = IndentManager.class.getDeclaredMethod("m4983a", SublistFragment.class);
        assertNotNull(m);
    }

    // ---- SublistRenderer -----------------------------------------------------

    @Test
    public void sublistRendererClassExists() {
        assertEquals("ca.toadlybroodledev.sublist.SublistRenderer",
                SublistRenderer.class.getName());
    }

    @Test
    public void sublistRendererHasRenderMethod() throws Exception {
        Method m = SublistRenderer.class.getDeclaredMethod("m4979a", java.util.ArrayList.class);
        assertNotNull(m);
    }

    // ---- StringArraySpinnerAdapter -------------------------------------------

    @Test
    public void stringArraySpinnerAdapterExtendsBaseAdapter() {
        assertEquals(android.widget.BaseAdapter.class,
                StringArraySpinnerAdapter.class.getSuperclass());
    }

    // ---- DateTimeUtil --------------------------------------------------------

    @Test
    public void dateTimeUtilClassExists() {
        assertEquals("ca.toadlybroodledev.sublist.DateTimeUtil",
                DateTimeUtil.class.getName());
    }

    @Test
    public void dateTimeUtilHasEpochNow() throws Exception {
        Method m = DateTimeUtil.class.getDeclaredMethod("m5014c");
        assertTrue(Modifier.isStatic(m.getModifiers()));
        assertEquals(long.class, m.getReturnType());
    }

    @Test
    public void dateTimeUtilHasFormatTimestamp() throws Exception {
        Method m = DateTimeUtil.class.getDeclaredMethod("m5008a", long.class);
        assertTrue(Modifier.isStatic(m.getModifiers()));
        assertEquals(String.class, m.getReturnType());
    }

    // ---- NewSublistDialog ----------------------------------------------------

    @Test
    public void newSublistDialogClassExists() {
        assertEquals("ca.toadlybroodledev.sublist.NewSublistDialog",
                NewSublistDialog.class.getName());
    }

    // ---- DrawerToggle --------------------------------------------------------

    @Test
    public void drawerToggleClassExists() {
        assertEquals("ca.toadlybroodledev.sublist.DrawerToggle",
                DrawerToggle.class.getName());
    }

    @Test
    public void drawerToggleExtendsActionBarDrawerToggle() {
        assertEquals("androidx.appcompat.app.ActionBarDrawerToggle",
                DrawerToggle.class.getSuperclass().getName());
    }

    // ---- SublistFragment -----------------------------------------------------

    @Test
    public void sublistFragmentClassExists() {
        assertEquals("ca.toadlybroodledev.sublist.SublistFragment",
                SublistFragment.class.getName());
    }

    @Test
    public void sublistFragmentImplementsOutlineHost() {
        Set<String> ifaces = Arrays.stream(SublistFragment.class.getInterfaces())
                .map(Class::getName)
                .collect(Collectors.toSet());
        assertTrue("SublistFragment must implement OutlineHost",
                ifaces.contains("ca.toadlybroodledev.sublist.iface.OutlineHost"));
    }

    // ---- WelcomeSublistFragment ----------------------------------------------

    @Test
    public void welcomeSublistFragmentExtendsSublistFragment() {
        assertEquals(SublistFragment.class, WelcomeSublistFragment.class.getSuperclass());
    }

    // ---- SettingsDialog ------------------------------------------------------

    @Test
    public void settingsDialogClassExists() {
        assertEquals("ca.toadlybroodledev.sublist.SettingsDialog",
                SettingsDialog.class.getName());
    }

    // ---- ProfileFragment: removed in Phase 10.4 (cloud profile retired) -----

    // ---- SearchSublistFragment -----------------------------------------------

    @Test
    public void searchSublistFragmentExtendsSublistFragment() {
        assertEquals(SublistFragment.class, SearchSublistFragment.class.getSuperclass());
    }

    @Test
    public void searchSublistFragmentImplementsFragmentHost() {
        Set<String> ifaces = Arrays.stream(SearchSublistFragment.class.getInterfaces())
                .map(Class::getName)
                .collect(Collectors.toSet());
        assertTrue("SearchSublistFragment must implement FragmentHost",
                ifaces.contains("ca.toadlybroodledev.sublist.iface.FragmentHost"));
    }

    // ---- SettingsFragment ----------------------------------------------------

    @Test
    public void settingsFragmentClassExists() {
        assertEquals("ca.toadlybroodledev.sublist.SettingsFragment",
                SettingsFragment.class.getName());
    }

    // ---- DrawerCustomLayout (Phase 4.5 full port) --------------------------------

    @Test
    public void drawerCustomLayoutExtendsDrawerLayout() {
        assertEquals("androidx.drawerlayout.widget.DrawerLayout",
                DrawerCustomLayout.class.getSuperclass().getName());
    }

    @Test
    public void drawerCustomLayoutHasNavView() throws Exception {
        Field f = DrawerCustomLayout.class.getDeclaredField("f3729e");
        assertNotNull(f);
    }

    @Test
    public void drawerCustomLayoutHasAddSublistMethod() throws Exception {
        Method m = DrawerCustomLayout.class.getDeclaredMethod("m4798a", SublistFragment.class);
        assertNotNull(m);
    }

    // ---- OutlineFab (Phase 4.5 full port) ----------------------------------------

    @Test
    public void outlineFabExtendsFloatingActionButton() {
        assertEquals("com.google.android.material.floatingactionbutton.FloatingActionButton",
                OutlineFab.class.getSuperclass().getName());
    }

    @Test
    public void outlineFabHasShowHideMethod() throws Exception {
        Method m = OutlineFab.class.getDeclaredMethod("m4800a", boolean.class, boolean.class);
        assertNotNull(m);
    }

    // ---- MainActivity (Phase 4.5) ------------------------------------------------

    @Test
    public void mainActivityExtendsAppCompatActivity() {
        assertEquals("androidx.appcompat.app.AppCompatActivity",
                MainActivity.class.getSuperclass().getName());
    }

    @Test
    public void mainActivityImplementsHostContract() {
        Set<String> ifaces = Arrays.stream(MainActivity.class.getInterfaces())
                .map(Class::getName).collect(Collectors.toSet());
        assertTrue("MainActivity must implement HostContract",
                ifaces.contains("ca.toadlybroodledev.sublist.iface.HostContract"));
    }

    @Test
    public void mainActivityImplementsRowActionListener() {
        Set<String> ifaces = Arrays.stream(MainActivity.class.getInterfaces())
                .map(Class::getName).collect(Collectors.toSet());
        assertTrue("MainActivity must implement RowActionListener",
                ifaces.contains("ca.toadlybroodledev.sublist.iface.RowActionListener"));
    }

    @Test
    public void mainActivityHasStaticFabField() throws Exception {
        Field f = MainActivity.class.getDeclaredField("f3694m");
        assertTrue(Modifier.isStatic(f.getModifiers()));
        assertEquals(OutlineFab.class, f.getType());
    }

    @Test
    public void mainActivityHasDpToPxHelper() throws Exception {
        Method m = MainActivity.class.getDeclaredMethod("m4749a", Context.class, float.class);
        assertTrue(Modifier.isStatic(m.getModifiers()));
        assertEquals(float.class, m.getReturnType());
    }

    // ---- AppMain (Phase 4.5) -----------------------------------------------------

    @Test
    public void appMainExtendsApplication() {
        assertEquals("android.app.Application",
                AppMain.class.getSuperclass().getName());
    }

    // ---- WidgetProvider (Phase 4.5) ----------------------------------------------

    @Test
    public void widgetProviderExtendsAppWidgetProvider() {
        assertEquals("android.appwidget.AppWidgetProvider",
                WidgetProvider.class.getSuperclass().getName());
    }

    @Test
    public void widgetProviderHasOnUpdate() throws Exception {
        Method m = WidgetProvider.class.getDeclaredMethod("onUpdate",
                android.content.Context.class,
                android.appwidget.AppWidgetManager.class,
                int[].class);
        assertNotNull(m);
    }

    // ---- [should-fix] MainActivity.onRequestPermissionsResult super call -----
    // Behavioral check (super call dispatches to FragmentManager) requires Android runtime;
    // verified at Phase 4.7 device smoke test.

    @Test
    public void mainActivityDeclares_onRequestPermissionsResult() throws Exception {
        Method m = MainActivity.class.getDeclaredMethod(
                "onRequestPermissionsResult", int.class, String[].class, int[].class);
        assertTrue("override must be public", Modifier.isPublic(m.getModifiers()));
        assertEquals(void.class, m.getReturnType());
    }

    // ---- [should-fix] OutlineFab.m4800a(true,true) must call show() ---------
    // Behavioral check (setVisibility vs show()) requires Android runtime;
    // verified at Phase 4.7 device smoke test.

    @Test
    public void outlineFabShowHideMethod_returnsVoidAndIsNotStatic() throws Exception {
        Method m = OutlineFab.class.getDeclaredMethod("m4800a", boolean.class, boolean.class);
        assertFalse("m4800a must not be static", Modifier.isStatic(m.getModifiers()));
        assertEquals(void.class, m.getReturnType());
    }

    // ---- helpers -------------------------------------------------------------

    private Set<String> fieldNames(Class<?> cls) {
        return Arrays.stream(cls.getDeclaredFields())
                .map(Field::getName)
                .collect(Collectors.toSet());
    }
}
