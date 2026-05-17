package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.C0631a;
import com.google.ads.C0632b;
import com.google.ads.mediation.C0638a;
import com.google.ads.mediation.InterfaceC0640c;
import com.google.ads.mediation.InterfaceC0647d;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.customevent.C0868c;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.C1668jm;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter<C0868c, C0646d>, MediationInterstitialAdapter<C0868c, C0646d> {

    /* JADX INFO: renamed from: a */
    private View f4315a;

    /* JADX INFO: renamed from: b */
    private CustomEventBanner f4316b;

    /* JADX INFO: renamed from: c */
    private CustomEventInterstitial f4317c;

    /* JADX INFO: renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$a */
    static final class C0641a implements InterfaceC0644b {

        /* JADX INFO: renamed from: a */
        private final CustomEventAdapter f4318a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC0640c f4319b;

        public C0641a(CustomEventAdapter customEventAdapter, InterfaceC0640c interfaceC0640c) {
            this.f4318a = customEventAdapter;
            this.f4319b = interfaceC0640c;
        }
    }

    /* JADX INFO: renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$b */
    class C0642b implements InterfaceC0645c {

        /* JADX INFO: renamed from: a */
        private final CustomEventAdapter f4320a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC0647d f4321b;

        public C0642b(CustomEventAdapter customEventAdapter, InterfaceC0647d interfaceC0647d) {
            this.f4320a = customEventAdapter;
            this.f4321b = interfaceC0647d;
        }
    }

    /* JADX INFO: renamed from: a */
    private static <T> T m5315a(String str) {
        try {
            return (T) Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            C1668jm.m11615e(new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length()).append("Could not instantiate custom event adapter: ").append(str).append(". ").append(message).toString());
            return null;
        }
    }

    @Override // com.google.ads.mediation.InterfaceC0639b
    public final void destroy() {
        if (this.f4316b != null) {
            this.f4316b.m5316a();
        }
        if (this.f4317c != null) {
            this.f4317c.m5316a();
        }
    }

    @Override // com.google.ads.mediation.InterfaceC0639b
    public final Class<C0868c> getAdditionalParametersType() {
        return C0868c.class;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    public final View getBannerView() {
        return this.f4315a;
    }

    @Override // com.google.ads.mediation.InterfaceC0639b
    public final Class<C0646d> getServerParametersType() {
        return C0646d.class;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    public final void requestBannerAd(InterfaceC0640c interfaceC0640c, Activity activity, C0646d c0646d, C0632b c0632b, C0638a c0638a, C0868c c0868c) {
        this.f4316b = (CustomEventBanner) m5315a(c0646d.f4324b);
        if (this.f4316b == null) {
            interfaceC0640c.mo5314a(this, C0631a.a.INTERNAL_ERROR);
        } else {
            this.f4316b.requestBannerAd(new C0641a(this, interfaceC0640c), activity, c0646d.f4323a, c0646d.f4325c, c0632b, c0638a, c0868c == null ? null : c0868c.m5853a(c0646d.f4323a));
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(InterfaceC0647d interfaceC0647d, Activity activity, C0646d c0646d, C0638a c0638a, C0868c c0868c) {
        this.f4317c = (CustomEventInterstitial) m5315a(c0646d.f4324b);
        if (this.f4317c == null) {
            interfaceC0647d.mo5317a(this, C0631a.a.INTERNAL_ERROR);
        } else {
            this.f4317c.requestInterstitialAd(new C0642b(this, interfaceC0647d), activity, c0646d.f4323a, c0646d.f4325c, c0638a, c0868c == null ? null : c0868c.m5853a(c0646d.f4323a));
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        this.f4317c.showInterstitial();
    }
}
