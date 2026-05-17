package com.google.android.gms.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class agr implements Runnable {

    /* JADX INFO: renamed from: a */
    private final aha f6736a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ agl f6737b;

    public agr(agl aglVar, aha ahaVar) {
        this.f6737b = aglVar;
        this.f6736a = ahaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6737b.f6728m == 2) {
            String strValueOf = String.valueOf(this.f6736a.m7905d());
            ahs.m7947d(strValueOf.length() != 0 ? "Evaluating tags for event ".concat(strValueOf) : new String("Evaluating tags for event "));
            this.f6737b.f6727l.m7996a(this.f6736a);
            return;
        }
        if (this.f6737b.f6728m == 1) {
            this.f6737b.f6729n.add(this.f6736a);
            String strM7905d = this.f6736a.m7905d();
            ahs.m7947d(new StringBuilder(String.valueOf(strM7905d).length() + 30).append("Added event ").append(strM7905d).append(" to pending queue.").toString());
        } else if (this.f6737b.f6728m == 3) {
            String strM7905d2 = this.f6736a.m7905d();
            ahs.m7947d(new StringBuilder(String.valueOf(strM7905d2).length() + 61).append("Failed to evaluate tags for event ").append(strM7905d2).append(" (container failed to load)").toString());
            if (!this.f6736a.m7909h()) {
                String strValueOf2 = String.valueOf(this.f6736a.m7905d());
                ahs.m7947d(strValueOf2.length() != 0 ? "Discarded non-passthrough event ".concat(strValueOf2) : new String("Discarded non-passthrough event "));
                return;
            }
            try {
                this.f6737b.f6724i.mo12818a("app", this.f6736a.m7905d(), this.f6736a.m7906e(), this.f6736a.mo7252a());
                String strM7905d3 = this.f6736a.m7905d();
                ahs.m7947d(new StringBuilder(String.valueOf(strM7905d3).length() + 38).append("Logged passthrough event ").append(strM7905d3).append(" to Firebase.").toString());
            } catch (RemoteException e) {
                agw.m7887a("Error logging event with measurement proxy:", e, this.f6737b.f6716a);
            }
        }
    }
}
