package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: renamed from: com.google.android.gms.internal.oa */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1791oa implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ JsResult f11207a;

    DialogInterfaceOnClickListenerC1791oa(JsResult jsResult) {
        this.f11207a = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f11207a.confirm();
    }
}
