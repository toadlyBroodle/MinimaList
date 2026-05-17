package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.InterfaceC0880a;
import com.google.android.gms.ads.reward.mediation.InterfaceC0882a;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.p043a.BinderC0654c;

/* JADX INFO: renamed from: com.google.android.gms.internal.du */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1514du implements InterfaceC0882a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1511dr f10474a;

    public C1514du(InterfaceC1511dr interfaceC1511dr) {
        this.f10474a = interfaceC1511dr;
    }

    @Override // com.google.android.gms.ads.reward.mediation.InterfaceC0882a
    /* JADX INFO: renamed from: a */
    public final void mo5918a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C1221aj.m7073b("onInitializationSucceeded must be called on the main UI thread.");
        C1668jm.m11610b("Adapter called onInitializationSucceeded.");
        try {
            this.f10474a.mo11184a(BinderC0654c.m5329a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onInitializationSucceeded.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.InterfaceC0882a
    /* JADX INFO: renamed from: a */
    public final void mo5919a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        C1221aj.m7073b("onAdFailedToLoad must be called on the main UI thread.");
        C1668jm.m11610b("Adapter called onAdFailedToLoad.");
        try {
            this.f10474a.mo11190b(BinderC0654c.m5329a(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAdFailedToLoad.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.InterfaceC0882a
    /* JADX INFO: renamed from: a */
    public final void mo5920a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, InterfaceC0880a interfaceC0880a) {
        C1221aj.m7073b("onRewarded must be called on the main UI thread.");
        C1668jm.m11610b("Adapter called onRewarded.");
        try {
            if (interfaceC0880a != null) {
                this.f10474a.mo11186a(BinderC0654c.m5329a(mediationRewardedVideoAdAdapter), new C1515dv(interfaceC0880a));
            } else {
                this.f10474a.mo11186a(BinderC0654c.m5329a(mediationRewardedVideoAdAdapter), new C1515dv("", 1));
            }
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onRewarded.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.InterfaceC0882a
    /* JADX INFO: renamed from: b */
    public final void mo5921b(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C1221aj.m7073b("onAdLoaded must be called on the main UI thread.");
        C1668jm.m11610b("Adapter called onAdLoaded.");
        try {
            this.f10474a.mo11189b(BinderC0654c.m5329a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAdLoaded.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.InterfaceC0882a
    /* JADX INFO: renamed from: c */
    public final void mo5922c(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C1221aj.m7073b("onAdOpened must be called on the main UI thread.");
        C1668jm.m11610b("Adapter called onAdOpened.");
        try {
            this.f10474a.mo11191c(BinderC0654c.m5329a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAdOpened.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.InterfaceC0882a
    /* JADX INFO: renamed from: d */
    public final void mo5923d(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C1221aj.m7073b("onVideoStarted must be called on the main UI thread.");
        C1668jm.m11610b("Adapter called onVideoStarted.");
        try {
            this.f10474a.mo11192d(BinderC0654c.m5329a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onVideoStarted.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.InterfaceC0882a
    /* JADX INFO: renamed from: e */
    public final void mo5924e(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C1221aj.m7073b("onAdClosed must be called on the main UI thread.");
        C1668jm.m11610b("Adapter called onAdClosed.");
        try {
            this.f10474a.mo11193e(BinderC0654c.m5329a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAdClosed.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.InterfaceC0882a
    /* JADX INFO: renamed from: f */
    public final void mo5925f(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C1221aj.m7073b("onAdLeftApplication must be called on the main UI thread.");
        C1668jm.m11610b("Adapter called onAdLeftApplication.");
        try {
            this.f10474a.mo11195g(BinderC0654c.m5329a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAdLeftApplication.", e);
        }
    }
}
