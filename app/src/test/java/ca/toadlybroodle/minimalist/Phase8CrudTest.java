package ca.toadlybroodle.minimalist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import android.content.Context;

import ca.toadlybroodle.minimalist.iface.HostContract;
import ca.toadlybroodle.minimalist.iface.OutlineHost;
import ca.toadlybroodle.minimalist.model.OutlineRow;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import java.util.ArrayList;

/**
 * Phase 8.1 acceptance — behavioral coverage of the OutlineTree CRUD engine.
 *
 * The outline tree's create / delete / indent / collapse / complete operations
 * have been carried verbatim through the jadx port (Phase 4) and every rename
 * since, but never had a behavioral test — only source-scan and port-presence
 * checks. These tests exercise the real {@link OutlineTree} against real
 * {@link OutlineRowView} instances (Robolectric inflates the per-row layout
 * off-device); the host interfaces are Mockito mocks because the tree only
 * needs a Context from them for view inflation.
 *
 * Each test asserts a concrete post-condition (list membership, indent value,
 * complete/collapsed flag) so a regression in the engine would fail it.
 */
@RunWith(RobolectricTestRunner.class)
@Config(sdk = 34)
public class Phase8CrudTest {

    private HostContract host;
    private OutlineHost outlineHost;
    private OutlineTree tree;

    @Before
    public void setUp() {
        Context ctx = RuntimeEnvironment.getApplication();
        host = mock(HostContract.class);
        when(host.mo4775m()).thenReturn(ctx);
        outlineHost = mock(OutlineHost.class);
        tree = new OutlineTree(host, outlineHost, null);
        // Engine-behaviour flags are static; default them to a known state so
        // tests that don't care about cascading aren't affected by ordering.
        AppSettings.f3951n = false; // auto-complete children
        AppSettings.f3952o = false; // auto-delete children
    }

    @After
    public void tearDown() {
        AppSettings.f3951n = false;
        AppSettings.f3952o = false;
    }

    /** Appends a row to the tree's full list and returns the created view. */
    private OutlineRowView addRow(int indent, String text, boolean complete, boolean collapsed) {
        int before = tree.m4988a().size();
        tree.m4991a(new OutlineRow(indent, text, complete, collapsed, 0L, false));
        return tree.m4988a().get(before);
    }

    private OutlineRowView detachedRow(int indent, String text) {
        return new OutlineRowView(host, outlineHost,
                new OutlineRow(indent, text, false, false, 0L, false));
    }

    // --- create ---

    @Test
    public void createRow_appendsRowWithItsTextAndIndent() {
        OutlineRowView rv = addRow(0, "Buy milk", false, false);
        assertEquals(1, tree.m4988a().size());
        assertEquals("Buy milk", rv.f3822e.getText().toString());
        assertEquals(0, rv.m4859a());
    }

    @Test
    public void createEmptyRow_viaNullArgument_addsBlankRootRow() {
        tree.m4991a((OutlineRow) null);
        assertEquals(1, tree.m4988a().size());
        OutlineRowView rv = tree.m4988a().get(0);
        assertEquals("", rv.f3822e.getText().toString());
        assertEquals(0, rv.m4859a());
    }

    @Test
    public void createRows_preserveInsertionOrder() {
        addRow(0, "first", false, false);
        addRow(0, "second", false, false);
        addRow(0, "third", false, false);
        assertEquals("first", tree.m4988a().get(0).f3822e.getText().toString());
        assertEquals("second", tree.m4988a().get(1).f3822e.getText().toString());
        assertEquals("third", tree.m4988a().get(2).f3822e.getText().toString());
    }

    // --- delete ---

    @Test
    public void deleteRow_removesOnlyThatRow() {
        addRow(0, "A", false, false);
        OutlineRowView b = addRow(0, "B", false, false);
        addRow(0, "C", false, false);
        tree.m4992a(b);
        assertEquals(2, tree.m4988a().size());
        assertFalse(tree.m4988a().contains(b));
        assertEquals("A", tree.m4988a().get(0).f3822e.getText().toString());
        assertEquals("C", tree.m4988a().get(1).f3822e.getText().toString());
    }

    @Test
    public void deleteRow_autoDeleteChildrenOn_removesEntireSubtree() {
        AppSettings.f3952o = true;
        OutlineRowView parent = addRow(0, "Parent", false, false);
        addRow(1, "Child 1", false, false);
        addRow(1, "Child 2", false, false);
        addRow(0, "Sibling", false, false);
        tree.m4992a(parent);
        assertEquals(1, tree.m4988a().size());
        assertEquals("Sibling", tree.m4988a().get(0).f3822e.getText().toString());
    }

    @Test
    public void deleteRow_autoDeleteChildrenOff_keepsChildren() {
        AppSettings.f3952o = false;
        OutlineRowView parent = addRow(0, "Parent", false, false);
        OutlineRowView child = addRow(1, "Child", false, false);
        tree.m4992a(parent);
        assertEquals(1, tree.m4988a().size());
        assertSame(child, tree.m4988a().get(0));
    }

    @Test
    public void deleteRow_notInTree_isNoOp() {
        addRow(0, "A", false, false);
        OutlineRowView ghost = detachedRow(0, "ghost");
        tree.m4992a(ghost);
        assertEquals(1, tree.m4988a().size());
    }

    @Test
    public void deleteCompleted_removesOnlyCompletedRows() {
        addRow(0, "done-A", true, false);
        addRow(0, "open-B", false, false);
        addRow(0, "done-C", true, false);
        tree.m4998c();
        assertEquals(1, tree.m4988a().size());
        assertEquals("open-B", tree.m4988a().get(0).f3822e.getText().toString());
    }

    // --- indent / outdent ---

    @Test
    public void indentRow_increasesIndentOfRowAndItsDescendants() {
        OutlineRowView parent = addRow(0, "Parent", false, false);
        OutlineRowView child = addRow(1, "Child", false, false);
        tree.m4993a(parent, 1);
        assertEquals(1, parent.m4859a());
        assertEquals(2, child.m4859a());
    }

    @Test
    public void outdentRow_decreasesIndentOfRowAndItsDescendants() {
        OutlineRowView parent = addRow(2, "Parent", false, false);
        OutlineRowView child = addRow(3, "Child", false, false);
        tree.m4993a(parent, -1);
        assertEquals(1, parent.m4859a());
        assertEquals(2, child.m4859a());
    }

    @Test
    public void indentLeafRow_leavesUnrelatedSiblingUntouched() {
        OutlineRowView a = addRow(0, "A", false, false);
        OutlineRowView b = addRow(0, "B", false, false);
        tree.m4993a(a, 1);
        assertEquals(1, a.m4859a());
        assertEquals(0, b.m4859a());
    }

    // --- nesting / children query ---

    @Test
    public void getChildren_returnsContiguousDeeperRowsUntilShallowerSibling() {
        OutlineRowView a = addRow(0, "A", false, false);
        OutlineRowView b = addRow(1, "B", false, false);
        OutlineRowView c = addRow(2, "C", false, false);
        OutlineRowView d = addRow(1, "D", false, false);
        addRow(0, "E", false, false);
        ArrayList<OutlineRowView> childrenOfA = tree.m5004h(a);
        assertEquals(3, childrenOfA.size());
        assertTrue(childrenOfA.contains(b));
        assertTrue(childrenOfA.contains(c));
        assertTrue(childrenOfA.contains(d));
        ArrayList<OutlineRowView> childrenOfB = tree.m5004h(b);
        assertEquals(1, childrenOfB.size());
        assertSame(c, childrenOfB.get(0));
    }

    @Test
    public void getChildren_leafRow_returnsEmptyList() {
        OutlineRowView leaf = addRow(0, "leaf", false, false);
        assertEquals(0, tree.m5004h(leaf).size());
    }

    @Test
    public void getChildren_nullRow_returnsEmptyList() {
        assertEquals(0, tree.m5004h(null).size());
    }

    // --- collapse ---

    @Test
    public void collapseRow_setsCollapsedFlagWhenRowHasChildren() {
        OutlineRowView parent = addRow(0, "Parent", false, false);
        addRow(1, "Child", false, false);
        assertFalse(parent.f3824g);
        tree.m4994a(parent, true);
        assertTrue(parent.f3824g);
        tree.m4994a(parent, false);
        assertFalse(parent.f3824g);
    }

    @Test
    public void collapseRow_noOpWhenRowHasNoChildren() {
        OutlineRowView leaf = addRow(0, "leaf", false, false);
        tree.m4994a(leaf, true);
        assertFalse("collapsing a childless row must not set the flag", leaf.f3824g);
    }

    // --- complete ---

    @Test
    public void completeRow_setsCompleteFlag() {
        OutlineRowView rv = addRow(0, "task", false, false);
        tree.m4996b(rv, true);
        assertTrue(rv.f3823f);
        tree.m4996b(rv, false);
        assertFalse(rv.f3823f);
    }

    @Test
    public void completeRow_autoCompleteChildrenOn_cascadesToDescendants() {
        AppSettings.f3951n = true;
        OutlineRowView parent = addRow(0, "Parent", false, false);
        OutlineRowView child = addRow(1, "Child", false, false);
        tree.m4996b(parent, true);
        assertTrue(parent.f3823f);
        assertTrue(child.f3823f);
    }

    @Test
    public void completeRow_autoCompleteChildrenOff_leavesChildrenUntouched() {
        AppSettings.f3951n = false;
        OutlineRowView parent = addRow(0, "Parent", false, false);
        OutlineRowView child = addRow(1, "Child", false, false);
        tree.m4996b(parent, true);
        assertTrue(parent.f3823f);
        assertFalse(child.f3823f);
    }

    // --- collapsed / complete state persistence (across app restart) ---

    @Test
    public void rowState_survivesRoundTripThroughOutlineRowModel() {
        // The in-memory tree is serialised to OutlineRow POJOs before being
        // handed to OutlineRepository / Room (and JSON backup). If indent,
        // complete or collapsed were dropped here, the user's state would not
        // survive an app restart. Assert every persisted field round-trips.
        addRow(2, "Nested done collapsed", true, true);
        addRow(0, "Root open expanded", false, false);
        ArrayList<OutlineRow> serialised = OutlineRow.getListOfEntSers(tree.m4988a());
        assertEquals(2, serialised.size());

        OutlineRow first = serialised.get(0);
        assertEquals(2, first.indent);
        assertEquals("Nested done collapsed", first.text);
        assertTrue(first.complete);
        assertTrue(first.collapsed);

        OutlineRow second = serialised.get(1);
        assertEquals(0, second.indent);
        assertEquals("Root open expanded", second.text);
        assertFalse(second.complete);
        assertFalse(second.collapsed);
    }

    @Test
    public void collapseThenSerialise_persistsTheCollapsedFlag() {
        OutlineRowView parent = addRow(0, "Parent", false, false);
        addRow(1, "Child", false, false);
        tree.m4994a(parent, true);
        ArrayList<OutlineRow> serialised = OutlineRow.getListOfEntSers(tree.m4988a());
        assertTrue("collapsed flag set on the tree must reach the persisted model",
                serialised.get(0).collapsed);
    }
}
