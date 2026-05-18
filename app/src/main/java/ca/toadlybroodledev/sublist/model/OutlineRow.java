package ca.toadlybroodledev.sublist.model;

import java.io.Serializable;

// Ported from decompiled p032c/C0554a. Plain POJO — Firebase annotations stripped in Phase 3.1.
// getListOfEntSers(ArrayList<OutlineRowView>) omitted here; restored in Phase 4.4 when
// OutlineRowView (C0557d) is ported into the active tree.
public class OutlineRow implements Serializable {
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
}
