package com.google.android.gms.internal;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class cct implements cbx {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ View f9850a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ ccr f9851b;

    cct(ccr ccrVar, View view) {
        this.f9851b = ccrVar;
        this.f9850a = view;
    }

    @Override // com.google.android.gms.internal.cbx
    /* JADX INFO: renamed from: a */
    public final void mo10661a() {
        if (this.f9851b.m10733a(ccr.f9837a)) {
            this.f9851b.onClick(this.f9850a);
        }
    }

    @Override // com.google.android.gms.internal.cbx
    /* JADX INFO: renamed from: a */
    public final void mo10662a(MotionEvent motionEvent) {
        this.f9851b.onTouch(null, motionEvent);
    }
}
