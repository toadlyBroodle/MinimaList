package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.C0710au;

/* JADX INFO: renamed from: com.google.android.gms.internal.hx */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1625hx implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ RunnableC1624hw f10763a;

    DialogInterfaceOnClickListenerC1625hx(RunnableC1624hw runnableC1624hw) {
        this.f10763a = runnableC1624hw;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0710au.m5569e();
        C1596gv.m11391a(this.f10763a.f10759a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
