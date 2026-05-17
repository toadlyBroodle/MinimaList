package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: renamed from: com.google.android.gms.internal.ny */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnCancelListenerC1788ny implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ JsResult f11205a;

    DialogInterfaceOnCancelListenerC1788ny(JsResult jsResult) {
        this.f11205a = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f11205a.cancel();
    }
}
