package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Keep;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.BinderC0829d;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.BinderC1475ci;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.C1670jo;
import com.google.android.gms.internal.InterfaceC1482cp;
import com.google.android.gms.internal.bxb;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.bxy;
import com.google.android.gms.internal.byd;
import com.google.android.gms.internal.byn;
import com.google.android.gms.internal.bys;
import com.google.android.gms.internal.can;
import com.google.android.gms.internal.cco;
import com.google.android.gms.internal.ccr;
import com.google.android.gms.internal.cdc;
import com.google.android.gms.internal.cdh;
import com.google.android.gms.internal.cgv;
import com.google.android.gms.internal.cii;
import com.google.android.gms.internal.cki;
import com.google.android.gms.internal.cks;
import com.google.android.gms.internal.cnb;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
@cnb
@Keep
@DynamiteApi
public class ClientApi extends byn {
    @Override // com.google.android.gms.internal.bym
    public bxy createAdLoaderBuilder(InterfaceC0652a interfaceC0652a, String str, cii ciiVar, int i) {
        Context context = (Context) BinderC0654c.m5330a(interfaceC0652a);
        C0710au.m5569e();
        return new BinderC0821k(context, str, ciiVar, new C1670jo(11910000, i, true, C1596gv.m11435m(context)), C0733bq.m5641a(context));
    }

    @Override // com.google.android.gms.internal.bym
    public cki createAdOverlay(InterfaceC0652a interfaceC0652a) {
        return new BinderC0829d((Activity) BinderC0654c.m5330a(interfaceC0652a));
    }

    @Override // com.google.android.gms.internal.bym
    public byd createBannerAdManager(InterfaceC0652a interfaceC0652a, bxb bxbVar, String str, cii ciiVar, int i) {
        Context context = (Context) BinderC0654c.m5330a(interfaceC0652a);
        C0710au.m5569e();
        return new ViewTreeObserverOnGlobalLayoutListenerC0735bs(context, bxbVar, str, ciiVar, new C1670jo(11910000, i, true, C1596gv.m11435m(context)), C0733bq.m5641a(context));
    }

    @Override // com.google.android.gms.internal.bym
    public cks createInAppPurchaseManager(InterfaceC0652a interfaceC0652a) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    @Override // com.google.android.gms.internal.bym
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byd createInterstitialAdManager(InterfaceC0652a interfaceC0652a, bxb bxbVar, String str, cii ciiVar, int i) {
        boolean z;
        Context context = (Context) BinderC0654c.m5330a(interfaceC0652a);
        can.m10549a(context);
        C0710au.m5569e();
        C1670jo c1670jo = new C1670jo(11910000, i, true, C1596gv.m11435m(context));
        boolean zEquals = "reward_mb".equals(bxbVar.f9247a);
        if (!zEquals) {
            if (!((Boolean) bxm.m10409f().m10546a(can.f9433aF)).booleanValue()) {
                if (zEquals) {
                    z = ((Boolean) bxm.m10409f().m10546a(can.f9434aG)).booleanValue();
                }
            }
        }
        return z ? new cgv(context, str, ciiVar, c1670jo, C0733bq.m5641a(context)) : new BinderC0822l(context, bxbVar, str, ciiVar, c1670jo, C0733bq.m5641a(context));
    }

    @Override // com.google.android.gms.internal.bym
    public cdc createNativeAdViewDelegate(InterfaceC0652a interfaceC0652a, InterfaceC0652a interfaceC0652a2) {
        return new cco((FrameLayout) BinderC0654c.m5330a(interfaceC0652a), (FrameLayout) BinderC0654c.m5330a(interfaceC0652a2));
    }

    @Override // com.google.android.gms.internal.bym
    public cdh createNativeAdViewHolderDelegate(InterfaceC0652a interfaceC0652a, InterfaceC0652a interfaceC0652a2, InterfaceC0652a interfaceC0652a3) {
        return new ccr((View) BinderC0654c.m5330a(interfaceC0652a), (HashMap) BinderC0654c.m5330a(interfaceC0652a2), (HashMap) BinderC0654c.m5330a(interfaceC0652a3));
    }

    @Override // com.google.android.gms.internal.bym
    public InterfaceC1482cp createRewardedVideoAd(InterfaceC0652a interfaceC0652a, cii ciiVar, int i) {
        Context context = (Context) BinderC0654c.m5330a(interfaceC0652a);
        C0710au.m5569e();
        return new BinderC1475ci(context, C0733bq.m5641a(context), ciiVar, new C1670jo(11910000, i, true, C1596gv.m11435m(context)));
    }

    @Override // com.google.android.gms.internal.bym
    public byd createSearchAdManager(InterfaceC0652a interfaceC0652a, bxb bxbVar, String str, int i) {
        Context context = (Context) BinderC0654c.m5330a(interfaceC0652a);
        C0710au.m5569e();
        return new BinderC0704ao(context, bxbVar, str, new C1670jo(11910000, i, true, C1596gv.m11435m(context)));
    }

    @Override // com.google.android.gms.internal.bym
    public bys getMobileAdsSettingsManager(InterfaceC0652a interfaceC0652a) {
        return null;
    }

    @Override // com.google.android.gms.internal.bym
    public bys getMobileAdsSettingsManagerWithClientJarVersion(InterfaceC0652a interfaceC0652a, int i) {
        Context context = (Context) BinderC0654c.m5330a(interfaceC0652a);
        C0710au.m5569e();
        return BinderC0854x.m5820a(context, new C1670jo(11910000, i, true, C1596gv.m11435m(context)));
    }
}
