package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.p045b.AbstractC0666c;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cdb extends AbstractC0666c.b {

    /* JADX INFO: renamed from: a */
    private final ccy f9855a;

    /* JADX INFO: renamed from: b */
    private final Drawable f9856b;

    /* JADX INFO: renamed from: c */
    private final Uri f9857c;

    /* JADX INFO: renamed from: d */
    private final double f9858d;

    public cdb(ccy ccyVar) {
        InterfaceC0652a interfaceC0652aMo10604a;
        Uri uriMo10605b = null;
        this.f9855a = ccyVar;
        try {
            interfaceC0652aMo10604a = this.f9855a.mo10604a();
        } catch (RemoteException e) {
            C1668jm.m11611b("Failed to get drawable.", e);
        }
        Drawable drawable = interfaceC0652aMo10604a != null ? (Drawable) BinderC0654c.m5330a(interfaceC0652aMo10604a) : null;
        this.f9856b = drawable;
        try {
            uriMo10605b = this.f9855a.mo10605b();
        } catch (RemoteException e2) {
            C1668jm.m11611b("Failed to get uri.", e2);
        }
        this.f9857c = uriMo10605b;
        double dMo10606c = 1.0d;
        try {
            dMo10606c = this.f9855a.mo10606c();
        } catch (RemoteException e3) {
            C1668jm.m11611b("Failed to get scale.", e3);
        }
        this.f9858d = dMo10606c;
    }

    @Override // com.google.android.gms.ads.p045b.AbstractC0666c.b
    /* JADX INFO: renamed from: a */
    public final Drawable mo5344a() {
        return this.f9856b;
    }

    @Override // com.google.android.gms.ads.p045b.AbstractC0666c.b
    /* JADX INFO: renamed from: b */
    public final Uri mo5345b() {
        return this.f9857c;
    }

    @Override // com.google.android.gms.ads.p045b.AbstractC0666c.b
    /* JADX INFO: renamed from: c */
    public final double mo5346c() {
        return this.f9858d;
    }
}
