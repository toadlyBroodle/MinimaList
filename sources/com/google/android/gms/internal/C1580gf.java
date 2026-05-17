package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.google.android.gms.internal.gf */
/* JADX INFO: loaded from: classes.dex */
final class C1580gf extends AbstractC1588gn {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f10687a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ long f10688b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1580gf(Context context, long j) {
        super(null);
        this.f10687a = context;
        this.f10688b = j;
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        SharedPreferences.Editor editorEdit = this.f10687a.getSharedPreferences("admob", 0).edit();
        editorEdit.putLong("first_ad_req_time_ms", this.f10688b);
        editorEdit.apply();
    }
}
