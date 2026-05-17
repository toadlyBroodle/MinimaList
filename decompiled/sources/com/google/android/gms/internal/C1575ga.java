package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.google.android.gms.internal.ga */
/* JADX INFO: loaded from: classes.dex */
final class C1575ga extends AbstractC1588gn {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f10678a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1575ga(Context context) {
        super(null);
        this.f10678a = context;
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        SharedPreferences.Editor editorEdit = this.f10678a.getSharedPreferences("admob", 0).edit();
        editorEdit.remove("native_advanced_settings");
        editorEdit.apply();
    }
}
