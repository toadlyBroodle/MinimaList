package com.google.android.gms.internal;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
final class cjz implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ cjx f10221a;

    cjz(cjx cjxVar) {
        this.f10221a = cjxVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10221a.m11061a("User canceled the download.");
    }
}
