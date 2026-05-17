package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.google.android.gms.internal.fx */
/* JADX INFO: loaded from: classes.dex */
final class C1571fx extends AbstractC1588gn {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f10671a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f10672b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1571fx(Context context, String str) {
        super(null);
        this.f10671a = context;
        this.f10672b = str;
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        SharedPreferences.Editor editorEdit = this.f10671a.getSharedPreferences("admob", 0).edit();
        editorEdit.putString("native_advanced_settings", this.f10672b);
        editorEdit.apply();
    }
}
