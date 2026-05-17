package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* JADX INFO: renamed from: com.google.android.gms.internal.ob */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnCancelListenerC1792ob implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ JsPromptResult f11208a;

    DialogInterfaceOnCancelListenerC1792ob(JsPromptResult jsPromptResult) {
        this.f11208a = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f11208a.cancel();
    }
}
