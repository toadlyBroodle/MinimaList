package com.google.android.gms.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class agt implements Runnable {

    /* JADX INFO: renamed from: a */
    private final aqd f6739a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ agl f6740b;

    agt(agl aglVar, aqd aqdVar) {
        this.f6740b = aglVar;
        this.f6739a = aqdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aqs aqsVarM8146c = this.f6739a.m8140b().m8146c();
        arb arbVarM8141c = this.f6739a.m8141c();
        boolean z = this.f6740b.f6727l == null;
        this.f6740b.f6727l = this.f6740b.f6720e.m7999a(aqsVarM8146c, arbVarM8141c);
        this.f6740b.f6728m = 2;
        String str = this.f6740b.f6717b;
        ahs.m7947d(new StringBuilder(String.valueOf(str).length() + 48).append("Container ").append(str).append(" loaded during runtime initialization.").toString());
        if (this.f6740b.f6729n != null) {
            for (aha ahaVar : this.f6740b.f6729n) {
                String strValueOf = String.valueOf(ahaVar.m7905d());
                ahs.m7947d(strValueOf.length() != 0 ? "Evaluating tags for pending event ".concat(strValueOf) : new String("Evaluating tags for pending event "));
                this.f6740b.f6727l.m7996a(ahaVar);
            }
            agl.m7857a(this.f6740b, (List) null);
        }
        this.f6740b.f6727l.m7995a();
        String strValueOf2 = String.valueOf(this.f6740b.f6717b);
        ahs.m7947d(strValueOf2.length() != 0 ? "Runtime initialized successfully for container ".concat(strValueOf2) : new String("Runtime initialized successfully for container "));
        long jM8147d = this.f6739a.m8140b().m8147d() + this.f6740b.f6726k.m7880a();
        if (z && this.f6740b.f6731p && this.f6739a.m8142d() == 1 && jM8147d < this.f6740b.f6725j.mo7252a()) {
            this.f6740b.m7858a(this.f6740b.f6726k.m7882c());
        } else {
            this.f6740b.m7858a(Math.max(900000L, jM8147d - this.f6740b.f6725j.mo7252a()));
        }
    }
}
