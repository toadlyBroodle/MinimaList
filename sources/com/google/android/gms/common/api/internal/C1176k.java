package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.InterfaceC1193k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.internal.C1230as;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1176k implements InterfaceC1093ah {

    /* JADX INFO: renamed from: a */
    private final C1094ai f5777a;

    /* JADX INFO: renamed from: b */
    private boolean f5778b = false;

    public C1176k(C1094ai c1094ai) {
        this.f5777a = c1094ai;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1093ah
    /* JADX INFO: renamed from: a */
    public final <A extends C1074a.c, R extends InterfaceC1193k, T extends AbstractC1155cp<R, A>> T mo6749a(T t) {
        return (T) mo6754b(t);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1093ah
    /* JADX INFO: renamed from: a */
    public final void mo6750a() {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1093ah
    /* JADX INFO: renamed from: a */
    public final void mo6751a(int i) {
        this.f5777a.m6761a((C1071a) null);
        this.f5777a.f5561e.mo6740a(i, this.f5778b);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1093ah
    /* JADX INFO: renamed from: a */
    public final void mo6752a(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1093ah
    /* JADX INFO: renamed from: a */
    public final void mo6753a(C1071a c1071a, C1074a<?> c1074a, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1093ah
    /* JADX INFO: renamed from: b */
    public final <A extends C1074a.c, T extends AbstractC1155cp<? extends InterfaceC1193k, A>> T mo6754b(T t) {
        try {
            this.f5777a.f5560d.f5525e.m6921a(t);
            C1086aa c1086aa = this.f5777a.f5560d;
            C1074a.f fVar = c1086aa.f5522b.get(t.m6948g());
            C1221aj.m7066a(fVar, "Appropriate Api was not requested.");
            if (fVar.m6641g() || !this.f5777a.f5558b.containsKey(t.m6948g())) {
                boolean z = fVar instanceof C1230as;
                A aM7086e = fVar;
                if (z) {
                    aM7086e = C1230as.m7086e();
                }
                t.m6947b(aM7086e);
            } else {
                t.m6946b(new Status(17));
            }
        } catch (DeadObjectException e) {
            this.f5777a.m6763a(new C1177l(this, this));
        }
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1093ah
    /* JADX INFO: renamed from: b */
    public final boolean mo6755b() {
        if (this.f5778b) {
            return false;
        }
        if (!this.f5777a.f5560d.m6744m()) {
            this.f5777a.m6761a((C1071a) null);
            return true;
        }
        this.f5778b = true;
        Iterator<C1138bz> it = this.f5777a.f5560d.f5524d.iterator();
        while (it.hasNext()) {
            it.next().m6918a();
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1093ah
    /* JADX INFO: renamed from: c */
    public final void mo6756c() {
        if (this.f5778b) {
            this.f5778b = false;
            this.f5777a.m6763a(new C1178m(this, this));
        }
    }

    /* JADX INFO: renamed from: d */
    final void m6992d() {
        if (this.f5778b) {
            this.f5778b = false;
            this.f5777a.f5560d.f5525e.m6920a();
            mo6755b();
        }
    }
}
