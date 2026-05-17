package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C0828c;
import com.google.android.gms.ads.mediation.InterfaceC0860a;
import com.google.android.gms.ads.mediation.InterfaceC0871d;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.common.util.C1310n;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class zzwl implements MediationInterstitialAdapter {

    /* JADX INFO: renamed from: a */
    private Activity f12750a;

    /* JADX INFO: renamed from: b */
    private InterfaceC0871d f12751b;

    /* JADX INFO: renamed from: c */
    private Uri f12752c;

    @Override // com.google.android.gms.ads.mediation.InterfaceC0861b
    public final void onDestroy() {
        C1668jm.m11610b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0861b
    public final void onPause() {
        C1668jm.m11610b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0861b
    public final void onResume() {
        C1668jm.m11610b("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, InterfaceC0871d interfaceC0871d, Bundle bundle, InterfaceC0860a interfaceC0860a, Bundle bundle2) {
        this.f12751b = interfaceC0871d;
        if (this.f12751b == null) {
            C1668jm.m11615e("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            C1668jm.m11615e("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f12751b.mo5855a(this, 0);
            return;
        }
        if (!(C1310n.m7278a() && cbl.m10592a(context))) {
            C1668jm.m11615e("Default browser does not support custom tabs. Bailing out.");
            this.f12751b.mo5855a(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            C1668jm.m11615e("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.f12751b.mo5855a(this, 0);
        } else {
            this.f12750a = (Activity) context;
            this.f12752c = Uri.parse(string);
            this.f12751b.mo5854a(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().build();
        customTabsIntentBuild.intent.setData(this.f12752c);
        C1596gv.f10711a.post(new cjq(this, new AdOverlayInfoParcel(new C0828c(customTabsIntentBuild.intent), null, new cjp(this), null, new C1670jo(0, 0, false))));
        C0710au.m5573i().m11315q();
    }
}
