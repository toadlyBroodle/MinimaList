package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1221aj;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class ags implements apu, Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ agl f6738a;

    private ags(agl aglVar) {
        this.f6738a = aglVar;
    }

    /* synthetic */ ags(agl aglVar, agn agnVar) {
        this(aglVar);
    }

    @Override // com.google.android.gms.internal.apu
    /* JADX INFO: renamed from: a */
    public final void mo7876a(aqd aqdVar) {
        if (aqdVar.mo6094a() != Status.f5451a) {
            this.f6738a.m7858a(this.f6738a.f6726k.m7881b());
            return;
        }
        String str = this.f6738a.f6717b;
        ahs.m7947d(new StringBuilder(String.valueOf(str).length() + 47).append("Refreshed container ").append(str).append(". Reinitializing runtime...").toString());
        this.f6738a.f6722g.execute(new agt(this.f6738a, aqdVar));
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1221aj.m7070a(this.f6738a.f6728m == 2);
        if (aia.m7973a().m7974a(this.f6738a.f6717b)) {
            return;
        }
        String str = this.f6738a.f6717b;
        ahs.m7947d(new StringBuilder(String.valueOf(str).length() + 24).append("Refreshing container ").append(str).append("...").toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        this.f6738a.f6721f.m8131a(this.f6738a.f6717b, this.f6738a.f6719d, this.f6738a.f6718c, arrayList, this, this.f6738a.f6726k);
    }
}
