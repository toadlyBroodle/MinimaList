package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.C0710au;

/* JADX INFO: renamed from: com.google.android.gms.internal.hr */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1619hr implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f10750a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1617hp f10751b;

    DialogInterfaceOnClickListenerC1619hr(C1617hp c1617hp, String str) {
        this.f10751b = c1617hp;
        this.f10750a = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0710au.m5569e();
        C1596gv.m11390a(this.f10751b.f10736a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", this.f10750a), "Share via"));
    }
}
