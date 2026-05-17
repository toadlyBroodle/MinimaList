package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.C0631a;
import com.google.ads.mediation.C0648e;
import com.google.ads.mediation.InterfaceC0640c;
import com.google.ads.mediation.InterfaceC0647d;
import com.google.ads.mediation.InterfaceC0649f;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cjj<NETWORK_EXTRAS extends InterfaceC0649f, SERVER_PARAMETERS extends C0648e> implements InterfaceC0640c, InterfaceC0647d {

    /* JADX INFO: renamed from: a */
    private final cip f10170a;

    public cjj(cip cipVar) {
        this.f10170a = cipVar;
    }

    @Override // com.google.ads.mediation.InterfaceC0640c
    /* JADX INFO: renamed from: a */
    public final void mo5314a(MediationBannerAdapter<?, ?> mediationBannerAdapter, C0631a.a aVar) {
        String strValueOf = String.valueOf(aVar);
        C1668jm.m11610b(new StringBuilder(String.valueOf(strValueOf).length() + 47).append("Adapter called onFailedToReceiveAd with error. ").append(strValueOf).toString());
        bxm.m10404a();
        if (!C1657jb.m11573b()) {
            C1668jm.m11615e("onFailedToReceiveAd must be called on the main UI thread.");
            C1657jb.f10832a.post(new cjl(this, aVar));
        } else {
            try {
                this.f10170a.mo10869a(cjn.m11028a(aVar));
            } catch (RemoteException e) {
                C1668jm.m11613c("Could not call onAdFailedToLoad.", e);
            }
        }
    }

    @Override // com.google.ads.mediation.InterfaceC0647d
    /* JADX INFO: renamed from: a */
    public final void mo5317a(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, C0631a.a aVar) {
        String strValueOf = String.valueOf(aVar);
        C1668jm.m11610b(new StringBuilder(String.valueOf(strValueOf).length() + 47).append("Adapter called onFailedToReceiveAd with error ").append(strValueOf).append(".").toString());
        bxm.m10404a();
        if (!C1657jb.m11573b()) {
            C1668jm.m11615e("onFailedToReceiveAd must be called on the main UI thread.");
            C1657jb.f10832a.post(new cjm(this, aVar));
        } else {
            try {
                this.f10170a.mo10869a(cjn.m11028a(aVar));
            } catch (RemoteException e) {
                C1668jm.m11613c("Could not call onAdFailedToLoad.", e);
            }
        }
    }
}
