package com.google.android.gms.internal;

import android.app.Activity;
import com.google.android.gms.appinvite.InterfaceC0909b;
import com.google.android.gms.appinvite.InterfaceC0911d;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.AbstractC1080g;

/* JADX INFO: renamed from: com.google.android.gms.internal.sc */
/* JADX INFO: loaded from: classes.dex */
public final class C1901sc implements InterfaceC0909b {
    @Override // com.google.android.gms.appinvite.InterfaceC0909b
    /* JADX INFO: renamed from: a */
    public final AbstractC1080g<InterfaceC0911d> mo6085a(AbstractC1079f abstractC1079f, Activity activity, boolean z) {
        return abstractC1079f.mo6667a(new C1904sf(this, abstractC1079f, activity, z));
    }
}
