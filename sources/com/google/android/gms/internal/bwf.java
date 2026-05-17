package com.google.android.gms.internal;

import com.google.android.gms.internal.bwh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bwf {

    /* JADX INFO: renamed from: a */
    private final bwk f9153a;

    /* JADX INFO: renamed from: b */
    private final bwq f9154b;

    /* JADX INFO: renamed from: c */
    private final boolean f9155c;

    private bwf() {
        this.f9155c = false;
        this.f9153a = new bwk();
        this.f9154b = new bwq();
        m10353b();
    }

    public bwf(bwk bwkVar, boolean z) {
        this.f9153a = bwkVar;
        this.f9155c = z;
        this.f9154b = new bwq();
        m10353b();
    }

    /* JADX INFO: renamed from: a */
    public static bwf m10352a() {
        return new bwf();
    }

    /* JADX INFO: renamed from: b */
    private final synchronized void m10353b() {
        this.f9154b.f9201d = new bwo();
        this.f9154b.f9200c = new bwp();
    }

    /* JADX INFO: renamed from: c */
    private static long[] m10354c() {
        int i = 0;
        List<String> listM10551b = can.m10551b();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listM10551b.iterator();
        while (it.hasNext()) {
            for (String str : it.next().split(",")) {
                try {
                    arrayList.add(Long.valueOf(str));
                } catch (NumberFormatException e) {
                    C1560fm.m11343a("Experiment ID is not a number");
                }
            }
        }
        long[] jArr = new long[arrayList.size()];
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            jArr[i2] = ((Long) obj).longValue();
            i2++;
        }
        return jArr;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m10355a(bwg bwgVar) {
        if (this.f9155c) {
            bwgVar.mo5605a(this.f9154b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m10356a(bwh.C1461a.b bVar) {
        if (this.f9155c) {
            this.f9154b.f9199b = m10354c();
            this.f9153a.m10358a(bsc.m10164a(this.f9154b)).m10361b(bVar.mo8430a()).m10360a();
            String strValueOf = String.valueOf(Integer.toString(bVar.mo8430a(), 10));
            C1560fm.m11343a(strValueOf.length() != 0 ? "Logging Event with event code : ".concat(strValueOf) : new String("Logging Event with event code : "));
        }
    }
}
