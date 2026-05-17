package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.appinvite.C0912e;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.internal.sg */
/* JADX INFO: loaded from: classes.dex */
final class BinderC1905sg extends BinderC1902sd {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1904sf f11513a;

    BinderC1905sg(C1904sf c1904sf) {
        this.f11513a = c1904sf;
    }

    @Override // com.google.android.gms.internal.BinderC1902sd, com.google.android.gms.internal.InterfaceC1909sk
    /* JADX INFO: renamed from: a */
    public final void mo12304a(Status status, Intent intent) {
        Activity activity;
        this.f11513a.m6708a(new C1908sj(status, intent));
        if (!C0912e.m6096a(intent) || !this.f11513a.f11511c || this.f11513a.f11510a == null || (activity = (Activity) this.f11513a.f11510a.get()) == null) {
            return;
        }
        activity.startActivity(intent);
    }
}
