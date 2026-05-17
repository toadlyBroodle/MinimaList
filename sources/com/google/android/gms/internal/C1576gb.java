package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.google.android.gms.internal.gb */
/* JADX INFO: loaded from: classes.dex */
final class C1576gb extends AbstractC1588gn {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f10679a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ long f10680b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1576gb(Context context, long j) {
        super(null);
        this.f10679a = context;
        this.f10680b = j;
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        SharedPreferences.Editor editorEdit = this.f10679a.getSharedPreferences("admob", 0).edit();
        editorEdit.putLong("app_last_background_time_ms", this.f10680b);
        editorEdit.apply();
    }
}
