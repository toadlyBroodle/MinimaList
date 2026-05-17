package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* JADX INFO: renamed from: com.google.android.gms.internal.oc */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1793oc implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ JsPromptResult f11209a;

    DialogInterfaceOnClickListenerC1793oc(JsPromptResult jsPromptResult) {
        this.f11209a = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f11209a.cancel();
    }
}
