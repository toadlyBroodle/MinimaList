package com.google.android.gms.internal;

import android.support.v4.p018i.C0219m;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cbu extends cdw implements ccb {

    /* JADX INFO: renamed from: a */
    private final cbn f9763a;

    /* JADX INFO: renamed from: b */
    private final String f9764b;

    /* JADX INFO: renamed from: c */
    private final C0219m<String, cbp> f9765c;

    /* JADX INFO: renamed from: d */
    private final C0219m<String, String> f9766d;

    /* JADX INFO: renamed from: e */
    private byx f9767e;

    /* JADX INFO: renamed from: f */
    private View f9768f;

    /* JADX INFO: renamed from: g */
    private final Object f9769g = new Object();

    /* JADX INFO: renamed from: h */
    private cbz f9770h;

    public cbu(String str, C0219m<String, cbp> c0219m, C0219m<String, String> c0219m2, cbn cbnVar, byx byxVar, View view) {
        this.f9764b = str;
        this.f9765c = c0219m;
        this.f9766d = c0219m2;
        this.f9763a = cbnVar;
        this.f9767e = byxVar;
        this.f9768f = view;
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ cbz m10650a(cbu cbuVar, cbz cbzVar) {
        cbuVar.f9770h = null;
        return null;
    }

    @Override // com.google.android.gms.internal.cdv
    /* JADX INFO: renamed from: a */
    public final String mo10651a(String str) {
        return this.f9766d.get(str);
    }

    @Override // com.google.android.gms.internal.cdv
    /* JADX INFO: renamed from: a */
    public final List<String> mo10652a() {
        int i = 0;
        String[] strArr = new String[this.f9765c.size() + this.f9766d.size()];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f9765c.size(); i3++) {
            strArr[i2] = this.f9765c.m1583b(i3);
            i2++;
        }
        while (i < this.f9766d.size()) {
            strArr[i2] = this.f9766d.m1583b(i);
            i++;
            i2++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ccb
    /* JADX INFO: renamed from: a */
    public final void mo10611a(cbz cbzVar) {
        synchronized (this.f9769g) {
            this.f9770h = cbzVar;
        }
    }

    @Override // com.google.android.gms.internal.cdv
    /* JADX INFO: renamed from: a */
    public final boolean mo10653a(InterfaceC0652a interfaceC0652a) {
        if (this.f9770h == null) {
            C1668jm.m11612c("Attempt to call renderVideoInMediaView before ad initialized.");
            return false;
        }
        if (this.f9768f == null) {
            return false;
        }
        cbv cbvVar = new cbv(this);
        this.f9770h.mo10678a((FrameLayout) BinderC0654c.m5330a(interfaceC0652a), cbvVar);
        return true;
    }

    @Override // com.google.android.gms.internal.cdv
    /* JADX INFO: renamed from: b */
    public final InterfaceC0652a mo10654b() {
        return BinderC0654c.m5329a(this.f9770h);
    }

    @Override // com.google.android.gms.internal.cdv
    /* JADX INFO: renamed from: b */
    public final ccy mo10655b(String str) {
        return this.f9765c.get(str);
    }

    @Override // com.google.android.gms.internal.cdv
    /* JADX INFO: renamed from: c */
    public final byx mo10656c() {
        return this.f9767e;
    }

    @Override // com.google.android.gms.internal.cdv
    /* JADX INFO: renamed from: c */
    public final void mo10657c(String str) {
        synchronized (this.f9769g) {
            if (this.f9770h == null) {
                C1668jm.m11612c("Attempt to call performClick before ad initialized.");
            } else {
                this.f9770h.mo10679a(null, str, null, null, null);
            }
        }
    }

    @Override // com.google.android.gms.internal.cdv
    /* JADX INFO: renamed from: d */
    public final void mo10658d() {
        synchronized (this.f9769g) {
            if (this.f9770h == null) {
                C1668jm.m11612c("Attempt to perform recordImpression before ad initialized.");
            } else {
                this.f9770h.mo10664a((View) null, (Map<String, WeakReference<View>>) null);
            }
        }
    }

    @Override // com.google.android.gms.internal.cdv
    /* JADX INFO: renamed from: e */
    public final InterfaceC0652a mo10659e() {
        return BinderC0654c.m5329a(this.f9770h.mo10686i().getApplicationContext());
    }

    @Override // com.google.android.gms.internal.cdv
    /* JADX INFO: renamed from: f */
    public final void mo10660f() {
        C1596gv.f10711a.post(new cbw(this));
        this.f9767e = null;
        this.f9768f = null;
    }

    @Override // com.google.android.gms.internal.ccb
    /* JADX INFO: renamed from: k */
    public final String mo10623k() {
        return "3";
    }

    @Override // com.google.android.gms.internal.cdv, com.google.android.gms.internal.ccb
    /* JADX INFO: renamed from: l */
    public final String mo10624l() {
        return this.f9764b;
    }

    @Override // com.google.android.gms.internal.ccb
    /* JADX INFO: renamed from: m */
    public final cbn mo10625m() {
        return this.f9763a;
    }

    @Override // com.google.android.gms.internal.ccb
    /* JADX INFO: renamed from: o */
    public final View mo10627o() {
        return this.f9768f;
    }
}
