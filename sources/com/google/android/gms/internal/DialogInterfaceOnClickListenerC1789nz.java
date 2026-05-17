package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: renamed from: com.google.android.gms.internal.nz */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1789nz implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ JsResult f11206a;

    DialogInterfaceOnClickListenerC1789nz(JsResult jsResult) {
        this.f11206a = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f11206a.cancel();
    }
}
