package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.google.android.gms.internal.gj */
/* JADX INFO: loaded from: classes.dex */
final class C1584gj extends AbstractC1588gn {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f10693a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ boolean f10694b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1584gj(Context context, boolean z) {
        super(null);
        this.f10693a = context;
        this.f10694b = z;
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        SharedPreferences.Editor editorEdit = this.f10693a.getSharedPreferences("admob", 0).edit();
        editorEdit.putBoolean("content_url_opted_out", this.f10694b);
        editorEdit.apply();
    }
}
