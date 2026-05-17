package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.google.android.gms.internal.fv */
/* JADX INFO: loaded from: classes.dex */
final class C1569fv extends AbstractC1588gn {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f10666a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f10667b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ long f10668c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1569fv(Context context, String str, long j) {
        super(null);
        this.f10666a = context;
        this.f10667b = str;
        this.f10668c = j;
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        SharedPreferences.Editor editorEdit = this.f10666a.getSharedPreferences("admob", 0).edit();
        editorEdit.putString("app_settings_json", this.f10667b);
        editorEdit.putLong("app_settings_last_update_ms", this.f10668c);
        editorEdit.apply();
    }
}
