package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.C0681d;
import com.google.android.gms.ads.mediation.InterfaceC0860a;
import com.google.android.gms.ads.mediation.InterfaceC0862c;
import com.google.android.gms.ads.mediation.InterfaceC0871d;
import com.google.android.gms.ads.mediation.InterfaceC0872e;
import com.google.android.gms.ads.mediation.InterfaceC0876i;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.C1668jm;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* JADX INFO: renamed from: a */
    private View f4872a;

    /* JADX INFO: renamed from: b */
    private CustomEventBanner f4873b;

    /* JADX INFO: renamed from: c */
    private CustomEventInterstitial f4874c;

    /* JADX INFO: renamed from: d */
    private CustomEventNative f4875d;

    /* JADX INFO: renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$a */
    static final class C0863a implements InterfaceC0867b {

        /* JADX INFO: renamed from: a */
        private final CustomEventAdapter f4876a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC0862c f4877b;

        public C0863a(CustomEventAdapter customEventAdapter, InterfaceC0862c interfaceC0862c) {
            this.f4876a = customEventAdapter;
            this.f4877b = interfaceC0862c;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$b */
    class C0864b implements InterfaceC0869d {

        /* JADX INFO: renamed from: a */
        private final CustomEventAdapter f4878a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC0871d f4879b;

        public C0864b(CustomEventAdapter customEventAdapter, InterfaceC0871d interfaceC0871d) {
            this.f4878a = customEventAdapter;
            this.f4879b = interfaceC0871d;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$c */
    static class C0865c implements InterfaceC0870e {

        /* JADX INFO: renamed from: a */
        private final CustomEventAdapter f4881a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC0872e f4882b;

        public C0865c(CustomEventAdapter customEventAdapter, InterfaceC0872e interfaceC0872e) {
            this.f4881a = customEventAdapter;
            this.f4882b = interfaceC0872e;
        }
    }

    /* JADX INFO: renamed from: a */
    private static <T> T m5849a(String str) {
        try {
            return (T) Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            C1668jm.m11615e(new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length()).append("Could not instantiate custom event adapter: ").append(str).append(". ").append(message).toString());
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public final View getBannerView() {
        return this.f4872a;
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0861b
    public final void onDestroy() {
        if (this.f4873b != null) {
            this.f4873b.m5850a();
        }
        if (this.f4874c != null) {
            this.f4874c.m5850a();
        }
        if (this.f4875d != null) {
            this.f4875d.m5850a();
        }
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0861b
    public final void onPause() {
        if (this.f4873b != null) {
            this.f4873b.m5851b();
        }
        if (this.f4874c != null) {
            this.f4874c.m5851b();
        }
        if (this.f4875d != null) {
            this.f4875d.m5851b();
        }
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0861b
    public final void onResume() {
        if (this.f4873b != null) {
            this.f4873b.m5852c();
        }
        if (this.f4874c != null) {
            this.f4874c.m5852c();
        }
        if (this.f4875d != null) {
            this.f4875d.m5852c();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public final void requestBannerAd(Context context, InterfaceC0862c interfaceC0862c, Bundle bundle, C0681d c0681d, InterfaceC0860a interfaceC0860a, Bundle bundle2) {
        this.f4873b = (CustomEventBanner) m5849a(bundle.getString("class_name"));
        if (this.f4873b == null) {
            interfaceC0862c.mo5843a(this, 0);
        } else {
            this.f4873b.requestBannerAd(context, new C0863a(this, interfaceC0862c), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), c0681d, interfaceC0860a, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, InterfaceC0871d interfaceC0871d, Bundle bundle, InterfaceC0860a interfaceC0860a, Bundle bundle2) {
        this.f4874c = (CustomEventInterstitial) m5849a(bundle.getString("class_name"));
        if (this.f4874c == null) {
            interfaceC0871d.mo5855a(this, 0);
        } else {
            this.f4874c.requestInterstitialAd(context, new C0864b(this, interfaceC0871d), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), interfaceC0860a, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void requestNativeAd(Context context, InterfaceC0872e interfaceC0872e, Bundle bundle, InterfaceC0876i interfaceC0876i, Bundle bundle2) {
        this.f4875d = (CustomEventNative) m5849a(bundle.getString("class_name"));
        if (this.f4875d == null) {
            interfaceC0872e.mo5861a(this, 0);
        } else {
            this.f4875d.requestNativeAd(context, new C0865c(this, interfaceC0872e), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), interfaceC0876i, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        this.f4874c.showInterstitial();
    }
}
