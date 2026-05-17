package com.google.android.gms.internal;

import android.webkit.ValueCallback;

/* JADX INFO: loaded from: classes.dex */
final class buz implements ValueCallback<String> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ buy f9098a;

    buz(buy buyVar) {
        this.f9098a = buyVar;
    }

    @Override // android.webkit.ValueCallback
    public final /* synthetic */ void onReceiveValue(String str) {
        this.f9098a.f9096d.m10306a(this.f9098a.f9093a, this.f9098a.f9094b, str, this.f9098a.f9095c);
    }
}
