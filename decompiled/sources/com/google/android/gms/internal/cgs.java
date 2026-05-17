package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
@cnb
final class cgs {

    /* JADX INFO: renamed from: a */
    private final LinkedList<cgt> f9955a;

    /* JADX INFO: renamed from: b */
    private bwx f9956b;

    /* JADX INFO: renamed from: c */
    private final String f9957c;

    /* JADX INFO: renamed from: d */
    private final int f9958d;

    /* JADX INFO: renamed from: e */
    private boolean f9959e;

    cgs(bwx bwxVar, String str, int i) {
        C1221aj.m7065a(bwxVar);
        C1221aj.m7065a(str);
        this.f9955a = new LinkedList<>();
        this.f9956b = bwxVar;
        this.f9957c = str;
        this.f9958d = i;
    }

    /* JADX INFO: renamed from: a */
    final bwx m10822a() {
        return this.f9956b;
    }

    /* JADX INFO: renamed from: a */
    final cgt m10823a(bwx bwxVar) {
        if (bwxVar != null) {
            this.f9956b = bwxVar;
        }
        return this.f9955a.remove();
    }

    /* JADX INFO: renamed from: a */
    final void m10824a(cfm cfmVar, bwx bwxVar) {
        this.f9955a.add(new cgt(this, cfmVar, bwxVar));
    }

    /* JADX INFO: renamed from: a */
    final boolean m10825a(cfm cfmVar) {
        cgt cgtVar = new cgt(this, cfmVar);
        this.f9955a.add(cgtVar);
        return cgtVar.m10833a();
    }

    /* JADX INFO: renamed from: b */
    final int m10826b() {
        return this.f9958d;
    }

    /* JADX INFO: renamed from: c */
    final String m10827c() {
        return this.f9957c;
    }

    /* JADX INFO: renamed from: d */
    final int m10828d() {
        return this.f9955a.size();
    }

    /* JADX INFO: renamed from: e */
    final int m10829e() {
        int i = 0;
        Iterator<cgt> it = this.f9955a.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            i = it.next().f9964e ? i2 + 1 : i2;
        }
    }

    /* JADX INFO: renamed from: f */
    final int m10830f() {
        int i = 0;
        Iterator<cgt> it = this.f9955a.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            i = it.next().m10833a() ? i2 + 1 : i2;
        }
    }

    /* JADX INFO: renamed from: g */
    final void m10831g() {
        this.f9959e = true;
    }

    /* JADX INFO: renamed from: h */
    final boolean m10832h() {
        return this.f9959e;
    }
}
