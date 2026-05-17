package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.tagmanager.AbstractBinderC2135o;

/* JADX INFO: loaded from: classes.dex */
final class aiz extends AbstractBinderC2135o {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ aix f6903a;

    aiz(aix aixVar) {
        this.f6903a = aixVar;
    }

    @Override // com.google.android.gms.tagmanager.InterfaceC2134n
    /* JADX INFO: renamed from: a */
    public final void mo8052a(String str, String str2, Bundle bundle, long j) {
        this.f6903a.f6890g.execute(new aja(this, str2, bundle, new StringBuilder(String.valueOf(str).length() + 4).append(str).append("+gtm").toString(), j, str));
    }
}
