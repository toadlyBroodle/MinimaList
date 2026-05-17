package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.google.android.gms.internal.fp */
/* JADX INFO: loaded from: classes.dex */
final class C1563fp extends AbstractC1588gn {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f10654a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ boolean f10655b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1563fp(Context context, boolean z) {
        super(null);
        this.f10654a = context;
        this.f10655b = z;
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        SharedPreferences.Editor editorEdit = this.f10654a.getSharedPreferences("admob", 0).edit();
        editorEdit.putBoolean("use_https", this.f10655b);
        editorEdit.apply();
    }
}
