package ca.toadlybroodledev.sublist.model;

import org.junit.Test;

import java.io.Serializable;

import static org.junit.Assert.*;

public class OutlineRowTest {

    @Test
    public void defaultConstructorCreatesEmptyRow() {
        OutlineRow row = new OutlineRow();
        assertEquals(0, row.indent);
        assertNull(row.text);
        assertFalse(row.complete);
        assertFalse(row.collapsed);
        assertEquals(0L, row.reminder);
        assertFalse(row.isInstr);
    }

    @Test
    public void parameterizedConstructorSetsAllFields() {
        OutlineRow row = new OutlineRow(2, "Buy milk", true, false, 1234567890L, false);
        assertEquals(2, row.indent);
        assertEquals("Buy milk", row.text);
        assertTrue(row.complete);
        assertFalse(row.collapsed);
        assertEquals(1234567890L, row.reminder);
        assertFalse(row.isInstr);
    }

    @Test
    public void isSerializable() {
        OutlineRow row = new OutlineRow();
        assertTrue(row instanceof Serializable);
    }

    @Test
    public void instrFlagRoundTrips() {
        OutlineRow row = new OutlineRow(0, "header", false, true, 0L, true);
        assertTrue(row.isInstr);
        assertTrue(row.collapsed);
    }
}
