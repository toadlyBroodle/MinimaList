package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.google.android.gms.internal.gl */
/* JADX INFO: loaded from: classes.dex */
final class C1586gl extends AbstractC1588gn {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f10697a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f10698b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1586gl(Context context, String str) {
        super(null);
        this.f10697a = context;
        this.f10698b = str;
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        SharedPreferences.Editor editorEdit = this.f10697a.getSharedPreferences("admob", 0).edit();
        editorEdit.putString("content_url_hashes", this.f10698b);
        editorEdit.apply();
    }
}
