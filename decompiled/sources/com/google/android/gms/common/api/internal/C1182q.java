package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.api.C1074a;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.q */
/* JADX INFO: loaded from: classes.dex */
final class C1182q extends AbstractRunnableC1189x {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1179n f5806a;

    /* JADX INFO: renamed from: b */
    private final Map<C1074a.f, C1181p> f5807b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1182q(C1179n c1179n, Map<C1074a.f, C1181p> map) {
        super(c1179n, null);
        this.f5806a = c1179n;
        this.f5807b = map;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractRunnableC1189x
    /* JADX INFO: renamed from: a */
    public final void mo7023a() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        Iterator<C1074a.f> it = this.f5807b.keySet().iterator();
        boolean z5 = true;
        boolean z6 = false;
        while (true) {
            if (!it.hasNext()) {
                z4 = z6;
                z = false;
                break;
            }
            C1074a.f next = it.next();
            if (!next.mo6644j()) {
                z2 = false;
                z3 = z6;
            } else if (!this.f5807b.get(next).f5805c) {
                z = true;
                break;
            } else {
                z2 = z5;
                z3 = true;
            }
            z6 = z3;
            z5 = z2;
        }
        int iMo7040a = z4 ? this.f5806a.f5784d.mo7040a(this.f5806a.f5783c) : 0;
        if (iMo7040a != 0 && (z || z5)) {
            this.f5806a.f5781a.m6763a(new C1183r(this, this.f5806a, new C1071a(iMo7040a, null)));
            return;
        }
        if (this.f5806a.f5793m) {
            this.f5806a.f5791k.mo7821m();
        }
        for (C1074a.f fVar : this.f5807b.keySet()) {
            C1181p c1181p = this.f5807b.get(fVar);
            if (!fVar.mo6644j() || iMo7040a == 0) {
                fVar.m6636a(c1181p);
            } else {
                this.f5806a.f5781a.m6763a(new C1184s(this, this.f5806a, c1181p));
            }
        }
    }
}
