package com.google.android.gms.internal;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.C0710au;

/* JADX INFO: renamed from: com.google.android.gms.internal.hm */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(21)
public final class C1614hm extends C1613hl {
    @Override // com.google.android.gms.internal.C1606he, com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: a */
    public final C1759mw mo11461a(InterfaceC1758mv interfaceC1758mv, boolean z) {
        return new C1799oi(interfaceC1758mv, z);
    }

    @Override // com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: c */
    public final CookieManager mo11476c(Context context) {
        if (m11458e()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            C1560fm.m11611b("Failed to obtain CookieManager.", th);
            C0710au.m5573i().m11292a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.C1608hg, com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: f */
    public final int mo11480f() {
        return R.style.Theme.Material.Dialog.Alert;
    }
}
