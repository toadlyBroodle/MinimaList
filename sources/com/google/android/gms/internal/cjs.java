package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.C0710au;

/* JADX INFO: loaded from: classes.dex */
final class cjs implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ cjr f10191a;

    cjs(cjr cjrVar) {
        this.f10191a = cjrVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intentM11035b = this.f10191a.m11035b();
        C0710au.m5569e();
        C1596gv.m11390a(this.f10191a.f10185b, intentM11035b);
    }
}
