package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.internal.InterfaceC0741f;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cbb extends cbe {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0741f f9705a;

    /* JADX INFO: renamed from: b */
    private final String f9706b;

    /* JADX INFO: renamed from: c */
    private final String f9707c;

    public cbb(InterfaceC0741f interfaceC0741f, String str, String str2) {
        this.f9705a = interfaceC0741f;
        this.f9706b = str;
        this.f9707c = str2;
    }

    @Override // com.google.android.gms.internal.cbd
    /* JADX INFO: renamed from: a */
    public final String mo10585a() {
        return this.f9706b;
    }

    @Override // com.google.android.gms.internal.cbd
    /* JADX INFO: renamed from: a */
    public final void mo10586a(InterfaceC0652a interfaceC0652a) {
        if (interfaceC0652a == null) {
            return;
        }
        this.f9705a.mo5628a_((View) BinderC0654c.m5330a(interfaceC0652a));
    }

    @Override // com.google.android.gms.internal.cbd
    /* JADX INFO: renamed from: b */
    public final String mo10587b() {
        return this.f9707c;
    }

    @Override // com.google.android.gms.internal.cbd
    /* JADX INFO: renamed from: c */
    public final void mo10588c() {
        this.f9705a.mo5630d_();
    }

    @Override // com.google.android.gms.internal.cbd
    /* JADX INFO: renamed from: d */
    public final void mo10589d() {
        this.f9705a.mo5631e_();
    }
}
