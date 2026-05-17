package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.google.android.gms.internal.fr */
/* JADX INFO: loaded from: classes.dex */
final class C1565fr extends AbstractC1588gn {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f10658a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ boolean f10659b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1565fr(Context context, boolean z) {
        super(null);
        this.f10658a = context;
        this.f10659b = z;
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        SharedPreferences.Editor editorEdit = this.f10658a.getSharedPreferences("admob", 0).edit();
        editorEdit.putBoolean("auto_collect_location", this.f10659b);
        editorEdit.apply();
    }
}
