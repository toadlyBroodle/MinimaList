package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.google.android.gms.internal.fq */
/* JADX INFO: loaded from: classes.dex */
final class C1564fq extends AbstractC1588gn {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f10656a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f10657b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1564fq(Context context, String str) {
        super(null);
        this.f10656a = context;
        this.f10657b = str;
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        SharedPreferences.Editor editorEdit = this.f10656a.getSharedPreferences("admob", 0).edit();
        editorEdit.putString("content_vertical_hashes", this.f10657b);
        editorEdit.apply();
    }
}
