package com.google.android.gms.internal;

import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class agp implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ agl f6734a;

    private agp(agl aglVar) {
        this.f6734a = aglVar;
    }

    /* synthetic */ agp(agl aglVar, agn agnVar) {
        this(aglVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6734a.f6728m = 3;
        String str = this.f6734a.f6717b;
        ahs.m7944b(new StringBuilder(String.valueOf(str).length() + 26).append("Container ").append(str).append(" loading failed.").toString());
        if (this.f6734a.f6729n != null) {
            for (aha ahaVar : this.f6734a.f6729n) {
                if (ahaVar.m7909h()) {
                    try {
                        this.f6734a.f6724i.mo12818a("app", ahaVar.m7905d(), ahaVar.m7906e(), ahaVar.mo7252a());
                        String strM7905d = ahaVar.m7905d();
                        ahs.m7947d(new StringBuilder(String.valueOf(strM7905d).length() + 50).append("Logged event ").append(strM7905d).append(" to Firebase (marked as passthrough).").toString());
                    } catch (RemoteException e) {
                        agw.m7887a("Error logging event with measurement proxy:", e, this.f6734a.f6716a);
                    }
                } else {
                    String strM7905d2 = ahaVar.m7905d();
                    ahs.m7947d(new StringBuilder(String.valueOf(strM7905d2).length() + 45).append("Discarded event ").append(strM7905d2).append(" (marked as non-passthrough).").toString());
                }
            }
            agl.m7857a(this.f6734a, (List) null);
        }
    }
}
