package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C0688i;
import com.google.android.gms.ads.mediation.C0873f;
import com.google.android.gms.ads.mediation.InterfaceC0862c;
import com.google.android.gms.ads.mediation.InterfaceC0871d;
import com.google.android.gms.ads.mediation.InterfaceC0872e;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.p045b.InterfaceC0672i;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cje implements InterfaceC0862c, InterfaceC0871d, InterfaceC0872e {

    /* JADX INFO: renamed from: a */
    private final cip f10153a;

    /* JADX INFO: renamed from: b */
    private C0873f f10154b;

    /* JADX INFO: renamed from: c */
    private InterfaceC0672i f10155c;

    public cje(cip cipVar) {
        this.f10153a = cipVar;
    }

    /* JADX INFO: renamed from: a */
    public final C0873f m11021a() {
        return this.f10154b;
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0862c
    /* JADX INFO: renamed from: a */
    public final void mo5842a(MediationBannerAdapter mediationBannerAdapter) {
        C1221aj.m7073b("onAdLoaded must be called on the main UI thread.");
        C1668jm.m11610b("Adapter called onAdLoaded.");
        try {
            this.f10153a.mo10878e();
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAdLoaded.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0862c
    /* JADX INFO: renamed from: a */
    public final void mo5843a(MediationBannerAdapter mediationBannerAdapter, int i) {
        C1221aj.m7073b("onAdFailedToLoad must be called on the main UI thread.");
        C1668jm.m11610b(new StringBuilder(55).append("Adapter called onAdFailedToLoad with error. ").append(i).toString());
        try {
            this.f10153a.mo10869a(i);
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAdFailedToLoad.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0862c
    /* JADX INFO: renamed from: a */
    public final void mo5844a(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        C1221aj.m7073b("onAppEvent must be called on the main UI thread.");
        C1668jm.m11610b("Adapter called onAppEvent.");
        try {
            this.f10153a.mo10874a(str, str2);
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAppEvent.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0871d
    /* JADX INFO: renamed from: a */
    public final void mo5854a(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C1221aj.m7073b("onAdLoaded must be called on the main UI thread.");
        C1668jm.m11610b("Adapter called onAdLoaded.");
        try {
            this.f10153a.mo10878e();
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAdLoaded.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0871d
    /* JADX INFO: renamed from: a */
    public final void mo5855a(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        C1221aj.m7073b("onAdFailedToLoad must be called on the main UI thread.");
        C1668jm.m11610b(new StringBuilder(55).append("Adapter called onAdFailedToLoad with error ").append(i).append(".").toString());
        try {
            this.f10153a.mo10869a(i);
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAdFailedToLoad.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0872e
    /* JADX INFO: renamed from: a */
    public final void mo5860a(MediationNativeAdapter mediationNativeAdapter) {
        C1221aj.m7073b("onAdOpened must be called on the main UI thread.");
        C1668jm.m11610b("Adapter called onAdOpened.");
        try {
            this.f10153a.mo10877d();
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAdOpened.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0872e
    /* JADX INFO: renamed from: a */
    public final void mo5861a(MediationNativeAdapter mediationNativeAdapter, int i) {
        C1221aj.m7073b("onAdFailedToLoad must be called on the main UI thread.");
        C1668jm.m11610b(new StringBuilder(55).append("Adapter called onAdFailedToLoad with error ").append(i).append(".").toString());
        try {
            this.f10153a.mo10869a(i);
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAdFailedToLoad.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0872e
    /* JADX INFO: renamed from: a */
    public final void mo5862a(MediationNativeAdapter mediationNativeAdapter, InterfaceC0672i interfaceC0672i) {
        C1221aj.m7073b("onAdLoaded must be called on the main UI thread.");
        String strValueOf = String.valueOf(interfaceC0672i.mo5382a());
        C1668jm.m11610b(strValueOf.length() != 0 ? "Adapter called onAdLoaded with template id ".concat(strValueOf) : new String("Adapter called onAdLoaded with template id "));
        this.f10155c = interfaceC0672i;
        try {
            this.f10153a.mo10878e();
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAdLoaded.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0872e
    /* JADX INFO: renamed from: a */
    public final void mo5863a(MediationNativeAdapter mediationNativeAdapter, InterfaceC0672i interfaceC0672i, String str) {
        if (!(interfaceC0672i instanceof cdy)) {
            C1668jm.m11615e("Unexpected native custom template ad type.");
            return;
        }
        try {
            this.f10153a.mo10870a(((cdy) interfaceC0672i).m10745b(), str);
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onCustomClick.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0872e
    /* JADX INFO: renamed from: a */
    public final void mo5864a(MediationNativeAdapter mediationNativeAdapter, C0873f c0873f) {
        C1221aj.m7073b("onAdLoaded must be called on the main UI thread.");
        C1668jm.m11610b("Adapter called onAdLoaded.");
        this.f10154b = c0873f;
        if (!(mediationNativeAdapter instanceof AdMobAdapter) && c0873f.m5881h()) {
            C0688i c0688i = new C0688i();
            c0688i.m5435a(new cjb());
            this.f10154b.m5869a(c0688i);
        }
        try {
            this.f10153a.mo10878e();
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAdLoaded.", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0672i m11022b() {
        return this.f10155c;
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0862c
    /* JADX INFO: renamed from: b */
    public final void mo5845b(MediationBannerAdapter mediationBannerAdapter) {
        C1221aj.m7073b("onAdOpened must be called on the main UI thread.");
        C1668jm.m11610b("Adapter called onAdOpened.");
        try {
            this.f10153a.mo10877d();
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAdOpened.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0871d
    /* JADX INFO: renamed from: b */
    public final void mo5856b(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C1221aj.m7073b("onAdOpened must be called on the main UI thread.");
        C1668jm.m11610b("Adapter called onAdOpened.");
        try {
            this.f10153a.mo10877d();
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAdOpened.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0872e
    /* JADX INFO: renamed from: b */
    public final void mo5865b(MediationNativeAdapter mediationNativeAdapter) {
        C1221aj.m7073b("onAdClosed must be called on the main UI thread.");
        C1668jm.m11610b("Adapter called onAdClosed.");
        try {
            this.f10153a.mo10875b();
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAdClosed.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0862c
    /* JADX INFO: renamed from: c */
    public final void mo5846c(MediationBannerAdapter mediationBannerAdapter) {
        C1221aj.m7073b("onAdClosed must be called on the main UI thread.");
        C1668jm.m11610b("Adapter called onAdClosed.");
        try {
            this.f10153a.mo10875b();
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAdClosed.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0871d
    /* JADX INFO: renamed from: c */
    public final void mo5857c(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C1221aj.m7073b("onAdClosed must be called on the main UI thread.");
        C1668jm.m11610b("Adapter called onAdClosed.");
        try {
            this.f10153a.mo10875b();
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAdClosed.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0872e
    /* JADX INFO: renamed from: c */
    public final void mo5866c(MediationNativeAdapter mediationNativeAdapter) {
        C1221aj.m7073b("onAdLeftApplication must be called on the main UI thread.");
        C1668jm.m11610b("Adapter called onAdLeftApplication.");
        try {
            this.f10153a.mo10876c();
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAdLeftApplication.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0862c
    /* JADX INFO: renamed from: d */
    public final void mo5847d(MediationBannerAdapter mediationBannerAdapter) {
        C1221aj.m7073b("onAdLeftApplication must be called on the main UI thread.");
        C1668jm.m11610b("Adapter called onAdLeftApplication.");
        try {
            this.f10153a.mo10876c();
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAdLeftApplication.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0871d
    /* JADX INFO: renamed from: d */
    public final void mo5858d(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C1221aj.m7073b("onAdLeftApplication must be called on the main UI thread.");
        C1668jm.m11610b("Adapter called onAdLeftApplication.");
        try {
            this.f10153a.mo10876c();
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAdLeftApplication.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0872e
    /* JADX INFO: renamed from: d */
    public final void mo5867d(MediationNativeAdapter mediationNativeAdapter) {
        C1221aj.m7073b("onAdClicked must be called on the main UI thread.");
        C0873f c0873f = this.f10154b;
        if (this.f10155c == null) {
            if (c0873f == null) {
                C1668jm.m11615e("Could not call onAdClicked since NativeAdMapper is null.");
                return;
            } else if (!c0873f.m5874b()) {
                C1668jm.m11610b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        C1668jm.m11610b("Adapter called onAdClicked.");
        try {
            this.f10153a.mo10868a();
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAdClicked.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0862c
    /* JADX INFO: renamed from: e */
    public final void mo5848e(MediationBannerAdapter mediationBannerAdapter) {
        C1221aj.m7073b("onAdClicked must be called on the main UI thread.");
        C1668jm.m11610b("Adapter called onAdClicked.");
        try {
            this.f10153a.mo10868a();
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAdClicked.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0871d
    /* JADX INFO: renamed from: e */
    public final void mo5859e(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C1221aj.m7073b("onAdClicked must be called on the main UI thread.");
        C1668jm.m11610b("Adapter called onAdClicked.");
        try {
            this.f10153a.mo10868a();
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAdClicked.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0872e
    /* JADX INFO: renamed from: e */
    public final void mo5868e(MediationNativeAdapter mediationNativeAdapter) {
        C1221aj.m7073b("onAdImpression must be called on the main UI thread.");
        C0873f c0873f = this.f10154b;
        if (this.f10155c == null) {
            if (c0873f == null) {
                C1668jm.m11615e("Could not call onAdImpression since NativeAdMapper is null. ");
                return;
            } else if (!c0873f.m5871a()) {
                C1668jm.m11610b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        C1668jm.m11610b("Adapter called onAdImpression.");
        try {
            this.f10153a.mo10879f();
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAdImpression.", e);
        }
    }
}
