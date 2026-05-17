package ca.toadlybroodledev.sublist.p032c;

import ca.toadlybroodledev.sublist.C0557d;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.c.a */
/* JADX INFO: loaded from: classes.dex */
// Phase 3.1: removed @com.google.firebase.database.IgnoreExtraProperties (jadx: @InterfaceC2270h)
public class C0554a implements Serializable {
    public boolean collapsed;
    public boolean complete;
    public int indent;

    // Phase 3.1: removed @com.google.firebase.database.Exclude (jadx: @InterfaceC2267e)
    public boolean isInstr;
    public long reminder;
    public String text;

    public C0554a() {
    }

    public C0554a(int i, String str, boolean z, boolean z2, long j, boolean z3) {
        this.indent = i;
        this.text = str;
        this.complete = z;
        this.collapsed = z2;
        this.reminder = j;
        this.isInstr = z3;
    }

    public static ArrayList<C0554a> getListOfEntSers(ArrayList<C0557d> arrayList) {
        ArrayList<C0554a> arrayList2 = new ArrayList<>();
        for (C0557d c0557d : arrayList) {
            arrayList2.add(new C0554a(c0557d.m4859a(), c0557d.f3822e.getText().toString(), c0557d.f3823f, c0557d.f3824g, c0557d.f3825h, false));
        }
        return arrayList2;
    }
}
