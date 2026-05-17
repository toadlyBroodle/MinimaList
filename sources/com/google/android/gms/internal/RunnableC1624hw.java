package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: renamed from: com.google.android.gms.internal.hw */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1624hw implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f10759a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f10760b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ boolean f10761c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ boolean f10762d;

    RunnableC1624hw(C1623hv c1623hv, Context context, String str, boolean z, boolean z2) {
        this.f10759a = context;
        this.f10760b = str;
        this.f10761c = z;
        this.f10762d = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f10759a);
        builder.setMessage(this.f10760b);
        if (this.f10761c) {
            builder.setTitle("Error");
        } else {
            builder.setTitle("Info");
        }
        if (this.f10762d) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new DialogInterfaceOnClickListenerC1625hx(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
