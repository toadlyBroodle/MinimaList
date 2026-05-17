package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.appinvite.C0912e;
import com.google.android.gms.appinvite.InterfaceC0911d;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.InterfaceC1193k;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.sf */
/* JADX INFO: loaded from: classes.dex */
final class C1904sf extends AbstractC1903se<InterfaceC0911d> {

    /* JADX INFO: renamed from: a */
    private final WeakReference<Activity> f11510a;

    /* JADX INFO: renamed from: c */
    private final boolean f11511c;

    /* JADX INFO: renamed from: d */
    private final Intent f11512d;

    public C1904sf(C1901sc c1901sc, AbstractC1079f abstractC1079f, Activity activity, boolean z) {
        super(abstractC1079f);
        this.f11511c = z;
        this.f11510a = new WeakReference<>(activity);
        this.f11512d = activity != null ? activity.getIntent() : null;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ InterfaceC1193k mo6177a(Status status) {
        return new C1908sj(status, new Intent());
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1155cp
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ void mo6178a(C1074a.c cVar) {
        C1907si c1907si = (C1907si) cVar;
        if (!C0912e.m6096a(this.f11512d)) {
            c1907si.m12308a((InterfaceC1909sk) new BinderC1905sg(this));
        } else {
            m6708a(new C1908sj(Status.f5451a, this.f11512d));
            c1907si.m12308a((InterfaceC1909sk) null);
        }
    }
}
