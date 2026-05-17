package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.appinvite.InterfaceC0911d;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.internal.sj */
/* JADX INFO: loaded from: classes.dex */
public final class C1908sj implements InterfaceC0911d {

    /* JADX INFO: renamed from: a */
    private final Status f11516a;

    /* JADX INFO: renamed from: b */
    private final Intent f11517b;

    public C1908sj(Status status, Intent intent) {
        this.f11516a = status;
        this.f11517b = intent;
    }

    @Override // com.google.android.gms.appinvite.InterfaceC0911d, com.google.android.gms.common.api.InterfaceC1193k
    /* JADX INFO: renamed from: a */
    public final Status mo6094a() {
        return this.f11516a;
    }

    @Override // com.google.android.gms.appinvite.InterfaceC0911d
    /* JADX INFO: renamed from: b */
    public final Intent mo6095b() {
        return this.f11517b;
    }
}
