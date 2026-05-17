package com.google.android.gms.internal;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class ccq implements cbx {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ View f9835a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ cco f9836b;

    ccq(cco ccoVar, View view) {
        this.f9836b = ccoVar;
        this.f9835a = view;
    }

    @Override // com.google.android.gms.internal.cbx
    /* JADX INFO: renamed from: a */
    public final void mo10661a() {
        this.f9836b.onClick(this.f9835a);
    }

    @Override // com.google.android.gms.internal.cbx
    /* JADX INFO: renamed from: a */
    public final void mo10662a(MotionEvent motionEvent) {
        this.f9836b.onTouch(null, motionEvent);
    }
}
