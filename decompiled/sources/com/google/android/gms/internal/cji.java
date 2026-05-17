package com.google.android.gms.internal;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.C0648e;
import com.google.ads.mediation.InterfaceC0639b;
import com.google.ads.mediation.InterfaceC0649f;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cji<NETWORK_EXTRAS extends InterfaceC0649f, SERVER_PARAMETERS extends C0648e> extends cin {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0639b<NETWORK_EXTRAS, SERVER_PARAMETERS> f10168a;

    /* JADX INFO: renamed from: b */
    private final NETWORK_EXTRAS f10169b;

    public cji(InterfaceC0639b<NETWORK_EXTRAS, SERVER_PARAMETERS> interfaceC0639b, NETWORK_EXTRAS network_extras) {
        this.f10168a = interfaceC0639b;
        this.f10169b = network_extras;
    }

    /* JADX INFO: renamed from: a */
    private final SERVER_PARAMETERS m11023a(String str, int i, String str2) throws RemoteException {
        HashMap map;
        try {
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                map = new HashMap(jSONObject.length());
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.getString(next));
                }
            } else {
                map = new HashMap(0);
            }
            Class<SERVER_PARAMETERS> serverParametersType = this.f10168a.getServerParametersType();
            if (serverParametersType == null) {
                return null;
            }
            SERVER_PARAMETERS server_parametersNewInstance = serverParametersType.newInstance();
            server_parametersNewInstance.m5318a(map);
            return server_parametersNewInstance;
        } catch (Throwable th) {
            C1668jm.m11613c("Could not get MediationServerParameters.", th);
            throw new RemoteException();
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m11024a(bwx bwxVar) {
        if (!bwxVar.f9212f) {
            bxm.m10404a();
            if (!C1657jb.m11569a()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final InterfaceC0652a mo10941a() throws RemoteException {
        if (!(this.f10168a instanceof MediationBannerAdapter)) {
            String strValueOf = String.valueOf(this.f10168a.getClass().getCanonicalName());
            C1668jm.m11615e(strValueOf.length() != 0 ? "MediationAdapter is not a MediationBannerAdapter: ".concat(strValueOf) : new String("MediationAdapter is not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return BinderC0654c.m5329a(((MediationBannerAdapter) this.f10168a).getBannerView());
        } catch (Throwable th) {
            C1668jm.m11613c("Could not get banner view from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10942a(InterfaceC0652a interfaceC0652a) {
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10943a(InterfaceC0652a interfaceC0652a, bwx bwxVar, String str, cip cipVar) throws RemoteException {
        mo10945a(interfaceC0652a, bwxVar, str, (String) null, cipVar);
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10944a(InterfaceC0652a interfaceC0652a, bwx bwxVar, String str, InterfaceC1511dr interfaceC1511dr, String str2) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10945a(InterfaceC0652a interfaceC0652a, bwx bwxVar, String str, String str2, cip cipVar) throws RemoteException {
        if (!(this.f10168a instanceof MediationInterstitialAdapter)) {
            String strValueOf = String.valueOf(this.f10168a.getClass().getCanonicalName());
            C1668jm.m11615e(strValueOf.length() != 0 ? "MediationAdapter is not a MediationInterstitialAdapter: ".concat(strValueOf) : new String("MediationAdapter is not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        C1668jm.m11610b("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f10168a).requestInterstitialAd(new cjj(cipVar), (Activity) BinderC0654c.m5330a(interfaceC0652a), m11023a(str, bwxVar.f9213g, str2), cjn.m11030a(bwxVar, m11024a(bwxVar)), this.f10169b);
        } catch (Throwable th) {
            C1668jm.m11613c("Could not request interstitial ad from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10946a(InterfaceC0652a interfaceC0652a, bwx bwxVar, String str, String str2, cip cipVar, ccm ccmVar, List<String> list) {
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10947a(InterfaceC0652a interfaceC0652a, bxb bxbVar, bwx bwxVar, String str, cip cipVar) throws RemoteException {
        mo10948a(interfaceC0652a, bxbVar, bwxVar, str, null, cipVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10948a(InterfaceC0652a interfaceC0652a, bxb bxbVar, bwx bwxVar, String str, String str2, cip cipVar) throws RemoteException {
        if (!(this.f10168a instanceof MediationBannerAdapter)) {
            String strValueOf = String.valueOf(this.f10168a.getClass().getCanonicalName());
            C1668jm.m11615e(strValueOf.length() != 0 ? "MediationAdapter is not a MediationBannerAdapter: ".concat(strValueOf) : new String("MediationAdapter is not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        C1668jm.m11610b("Requesting banner ad from adapter.");
        try {
            ((MediationBannerAdapter) this.f10168a).requestBannerAd(new cjj(cipVar), (Activity) BinderC0654c.m5330a(interfaceC0652a), m11023a(str, bwxVar.f9213g, str2), cjn.m11029a(bxbVar), cjn.m11030a(bwxVar, m11024a(bwxVar)), this.f10169b);
        } catch (Throwable th) {
            C1668jm.m11613c("Could not request banner ad from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10949a(InterfaceC0652a interfaceC0652a, InterfaceC1511dr interfaceC1511dr, List<String> list) {
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10950a(bwx bwxVar, String str) {
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10951a(bwx bwxVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10952a(boolean z) {
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: b */
    public final void mo10953b() throws RemoteException {
        if (!(this.f10168a instanceof MediationInterstitialAdapter)) {
            String strValueOf = String.valueOf(this.f10168a.getClass().getCanonicalName());
            C1668jm.m11615e(strValueOf.length() != 0 ? "MediationAdapter is not a MediationInterstitialAdapter: ".concat(strValueOf) : new String("MediationAdapter is not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        C1668jm.m11610b("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f10168a).showInterstitial();
        } catch (Throwable th) {
            C1668jm.m11613c("Could not show interstitial from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: c */
    public final void mo10954c() throws RemoteException {
        try {
            this.f10168a.destroy();
        } catch (Throwable th) {
            C1668jm.m11613c("Could not destroy adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: d */
    public final void mo10955d() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: e */
    public final void mo10956e() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: f */
    public final void mo10957f() {
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: g */
    public final boolean mo10958g() {
        return true;
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: h */
    public final civ mo10959h() {
        return null;
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: i */
    public final ciy mo10960i() {
        return null;
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: j */
    public final Bundle mo10961j() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: k */
    public final Bundle mo10962k() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: l */
    public final Bundle mo10963l() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: m */
    public final boolean mo10964m() {
        return false;
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: n */
    public final cdv mo10965n() {
        return null;
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: o */
    public final byx mo10966o() {
        return null;
    }
}
