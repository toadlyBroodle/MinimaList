package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.google.android.gms.internal.gd */
/* JADX INFO: loaded from: classes.dex */
final class C1578gd extends AbstractC1588gn {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f10683a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ int f10684b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1578gd(Context context, int i) {
        super(null);
        this.f10683a = context;
        this.f10684b = i;
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        SharedPreferences.Editor editorEdit = this.f10683a.getSharedPreferences("admob", 0).edit();
        editorEdit.putInt("request_in_session_count", this.f10684b);
        editorEdit.apply();
    }
}
