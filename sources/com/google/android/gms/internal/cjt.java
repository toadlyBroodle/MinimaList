package com.google.android.gms.internal;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
final class cjt implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ cjr f10192a;

    cjt(cjr cjrVar) {
        this.f10192a = cjrVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10192a.m11061a("Operation denied by user.");
    }
}
