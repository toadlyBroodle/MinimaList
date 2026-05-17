package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1221aj;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class agq implements apu, Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ agl f6735a;

    private agq(agl aglVar) {
        this.f6735a = aglVar;
    }

    /* synthetic */ agq(agl aglVar, agn agnVar) {
        this(aglVar);
    }

    @Override // com.google.android.gms.internal.apu
    /* JADX INFO: renamed from: a */
    public final void mo7876a(aqd aqdVar) {
        if (aqdVar.mo6094a() == Status.f5451a) {
            this.f6735a.f6722g.execute(new agt(this.f6735a, aqdVar));
        } else {
            this.f6735a.f6722g.execute(new agp(this.f6735a, null));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1221aj.m7070a(this.f6735a.f6728m == 1);
        ArrayList arrayList = new ArrayList();
        this.f6735a.f6731p = false;
        if (aia.m7973a().m7974a(this.f6735a.f6717b)) {
            arrayList.add(0);
        } else {
            this.f6735a.f6731p = this.f6735a.f6726k.m7883d();
            if (this.f6735a.f6731p) {
                arrayList.add(1);
                arrayList.add(0);
            } else {
                arrayList.add(0);
                arrayList.add(1);
            }
            arrayList.add(2);
        }
        this.f6735a.f6721f.m8131a(this.f6735a.f6717b, this.f6735a.f6719d, this.f6735a.f6718c, arrayList, this, this.f6735a.f6726k);
    }
}
