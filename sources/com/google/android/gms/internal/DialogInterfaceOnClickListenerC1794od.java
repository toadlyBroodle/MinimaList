package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* JADX INFO: renamed from: com.google.android.gms.internal.od */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1794od implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ JsPromptResult f11210a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ EditText f11211b;

    DialogInterfaceOnClickListenerC1794od(JsPromptResult jsPromptResult, EditText editText) {
        this.f11210a = jsPromptResult;
        this.f11211b = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f11210a.confirm(this.f11211b.getText().toString());
    }
}
