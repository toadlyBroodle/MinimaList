package ca.toadlybroodledev.sublist.p030a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.a.f */
/* JADX INFO: loaded from: classes.dex */
public class C0544f {

    /* JADX INFO: renamed from: a */
    Map<String, C0547i> f3781a = new HashMap();

    /* JADX INFO: renamed from: b */
    Map<String, C0545g> f3782b = new HashMap();

    C0544f() {
    }

    /* JADX INFO: renamed from: a */
    void m4832a(C0545g c0545g) {
        this.f3782b.put(c0545g.m4837b(), c0545g);
    }

    /* JADX INFO: renamed from: a */
    void m4833a(C0547i c0547i) {
        this.f3781a.put(c0547i.m4842a(), c0547i);
    }

    /* JADX INFO: renamed from: a */
    public boolean m4834a(String str) {
        return this.f3782b.containsKey(str);
    }

    /* JADX INFO: renamed from: b */
    List<String> m4835b(String str) {
        ArrayList arrayList = new ArrayList();
        for (C0545g c0545g : this.f3782b.values()) {
            if (c0545g.m4836a().equals(str)) {
                arrayList.add(c0545g.m4837b());
            }
        }
        return arrayList;
    }
}
