package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.tagmanager.AbstractBinderC2132l;

/* JADX INFO: loaded from: classes.dex */
final class ajb extends AbstractBinderC2132l {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ aix f6911a;

    ajb(aix aixVar) {
        this.f6911a = aixVar;
    }

    @Override // com.google.android.gms.tagmanager.InterfaceC2131k
    /* JADX INFO: renamed from: a */
    public final void mo8053a(String str, String str2, Bundle bundle, long j) {
        if (str.endsWith("+gtm")) {
            return;
        }
        this.f6911a.f6890g.execute(new ajc(this, str2, bundle, new StringBuilder(String.valueOf(str).length() + 4).append(str).append("+gtm").toString(), j, str));
    }
}
