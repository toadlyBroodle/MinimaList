package ca.toadlybroodle.minimalist.model;

import java.io.Serializable;
import java.util.ArrayList;

// Ported from decompiled p032c/C0554a. Plain POJO — Firebase annotations stripped in Phase 3.1.
public class OutlineRow implements Serializable {
    public long id;    // DB-assigned row ID; 0 for in-memory rows not yet persisted
    public int indent;
    public String text;
    public boolean complete;
    public boolean collapsed;
    public long reminder;
    public boolean isInstr;

    public OutlineRow() {
    }

    public OutlineRow(int indent, String text, boolean complete, boolean collapsed,
                      long reminder, boolean isInstr) {
        this.indent = indent;
        this.text = text;
        this.complete = complete;
        this.collapsed = collapsed;
        this.reminder = reminder;
        this.isInstr = isInstr;
    }

    // Deferred from 4.2 (needed OutlineRowView to exist). Serializes the visible row
    // view list to plain data objects for JSON backup.
    public static ArrayList<OutlineRow> getListOfEntSers(ArrayList<ca.toadlybroodle.minimalist.OutlineRowView> rows) {
        ArrayList<OutlineRow> result = new ArrayList<>();
        for (ca.toadlybroodle.minimalist.OutlineRowView rv : rows) {
            result.add(new OutlineRow(rv.m4859a(), rv.f3822e.getText().toString(),
                    rv.f3823f, rv.f3824g, rv.f3825h, rv.f3826i));
        }
        return result;
    }
}
