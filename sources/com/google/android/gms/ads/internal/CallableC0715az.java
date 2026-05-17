package com.google.android.gms.ads.internal;

import android.webkit.CookieManager;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.can;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.az */
/* JADX INFO: loaded from: classes.dex */
final class CallableC0715az implements Callable<String> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AbstractBinderC0714ay f4547a;

    CallableC0715az(AbstractBinderC0714ay abstractBinderC0714ay) {
        this.f4547a = abstractBinderC0714ay;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        CookieManager cookieManagerMo11476c;
        return (!((Boolean) bxm.m10409f().m10546a(can.f9572cm)).booleanValue() || (cookieManagerMo11476c = C0710au.m5571g().mo11476c(this.f4547a.f4405e.f4517c)) == null) ? "" : cookieManagerMo11476c.getCookie("googleads.g.doubleclick.net");
    }
}
