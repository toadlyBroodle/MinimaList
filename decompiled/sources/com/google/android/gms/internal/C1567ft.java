package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.google.android.gms.internal.ft */
/* JADX INFO: loaded from: classes.dex */
final class C1567ft extends AbstractC1588gn {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f10662a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ int f10663b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1567ft(Context context, int i) {
        super(null);
        this.f10662a = context;
        this.f10663b = i;
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        SharedPreferences.Editor editorEdit = this.f10662a.getSharedPreferences("admob", 0).edit();
        editorEdit.putInt("version_code", this.f10663b);
        editorEdit.apply();
    }
}
