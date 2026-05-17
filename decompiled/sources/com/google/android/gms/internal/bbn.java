package com.google.android.gms.internal;

import com.google.firebase.C2213b;

/* JADX INFO: loaded from: classes.dex */
final class bbn implements C2213b.b {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bdd f7740a;

    bbn(bbk bbkVar, bdd bddVar) {
        this.f7740a = bddVar;
    }

    @Override // com.google.firebase.C2213b.b
    /* JADX INFO: renamed from: a */
    public final void mo8815a(boolean z) {
        if (z) {
            this.f7740a.mo8972d("app_in_background");
        } else {
            this.f7740a.mo8973e("app_in_background");
        }
    }
}
