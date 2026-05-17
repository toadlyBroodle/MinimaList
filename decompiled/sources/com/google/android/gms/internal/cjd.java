package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C0859l;
import com.google.android.gms.ads.mediation.C0873f;
import com.google.android.gms.ads.mediation.C0874g;
import com.google.android.gms.ads.mediation.C0875h;
import com.google.android.gms.ads.mediation.InterfaceC0861b;
import com.google.android.gms.ads.mediation.InterfaceC0877j;
import com.google.android.gms.ads.mediation.InterfaceC0878k;
import com.google.android.gms.ads.mediation.InterfaceC0879l;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.p045b.InterfaceC0672i;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cjd extends cin {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0861b f10151a;

    /* JADX INFO: renamed from: b */
    private cje f10152b;

    public cjd(InterfaceC0861b interfaceC0861b) {
        this.f10151a = interfaceC0861b;
    }

    /* JADX INFO: renamed from: a */
    private final Bundle m11019a(String str, bwx bwxVar, String str2) throws RemoteException {
        String strValueOf = String.valueOf(str);
        C1668jm.m11615e(strValueOf.length() != 0 ? "Server parameters: ".concat(strValueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f10151a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (bwxVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", bwxVar.f9213g);
                }
            }
            return bundle;
        } catch (Throwable th) {
            C1668jm.m11613c("Could not get Server Parameters Bundle.", th);
            throw new RemoteException();
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m11020a(bwx bwxVar) {
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
        if (!(this.f10151a instanceof MediationBannerAdapter)) {
            String strValueOf = String.valueOf(this.f10151a.getClass().getCanonicalName());
            C1668jm.m11615e(strValueOf.length() != 0 ? "MediationAdapter is not a MediationBannerAdapter: ".concat(strValueOf) : new String("MediationAdapter is not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return BinderC0654c.m5329a(((MediationBannerAdapter) this.f10151a).getBannerView());
        } catch (Throwable th) {
            C1668jm.m11613c("Could not get banner view from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10942a(InterfaceC0652a interfaceC0652a) {
        try {
            ((InterfaceC0877j) this.f10151a).m5915a((Context) BinderC0654c.m5330a(interfaceC0652a));
        } catch (Throwable th) {
            C1668jm.m11608a("Could not inform adapter of changed context", th);
        }
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10943a(InterfaceC0652a interfaceC0652a, bwx bwxVar, String str, cip cipVar) throws RemoteException {
        mo10945a(interfaceC0652a, bwxVar, str, (String) null, cipVar);
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10944a(InterfaceC0652a interfaceC0652a, bwx bwxVar, String str, InterfaceC1511dr interfaceC1511dr, String str2) throws RemoteException {
        Bundle bundle;
        cjc cjcVar;
        if (!(this.f10151a instanceof MediationRewardedVideoAdAdapter)) {
            String strValueOf = String.valueOf(this.f10151a.getClass().getCanonicalName());
            C1668jm.m11615e(strValueOf.length() != 0 ? "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(strValueOf) : new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        C1668jm.m11610b("Initialize rewarded video adapter.");
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f10151a;
            Bundle bundleM11019a = m11019a(str2, bwxVar, (String) null);
            if (bwxVar != null) {
                cjc cjcVar2 = new cjc(bwxVar.f9208b == -1 ? null : new Date(bwxVar.f9208b), bwxVar.f9210d, bwxVar.f9211e != null ? new HashSet(bwxVar.f9211e) : null, bwxVar.f9217k, m11020a(bwxVar), bwxVar.f9213g, bwxVar.f9224r);
                if (bwxVar.f9219m != null) {
                    bundle = bwxVar.f9219m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
                    cjcVar = cjcVar2;
                } else {
                    bundle = null;
                    cjcVar = cjcVar2;
                }
            } else {
                bundle = null;
                cjcVar = null;
            }
            mediationRewardedVideoAdAdapter.initialize((Context) BinderC0654c.m5330a(interfaceC0652a), cjcVar, str, new C1514du(interfaceC1511dr), bundleM11019a, bundle);
        } catch (Throwable th) {
            C1668jm.m11613c("Could not initialize rewarded video adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10945a(InterfaceC0652a interfaceC0652a, bwx bwxVar, String str, String str2, cip cipVar) throws RemoteException {
        if (!(this.f10151a instanceof MediationInterstitialAdapter)) {
            String strValueOf = String.valueOf(this.f10151a.getClass().getCanonicalName());
            C1668jm.m11615e(strValueOf.length() != 0 ? "MediationAdapter is not a MediationInterstitialAdapter: ".concat(strValueOf) : new String("MediationAdapter is not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        C1668jm.m11610b("Requesting interstitial ad from adapter.");
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.f10151a;
            mediationInterstitialAdapter.requestInterstitialAd((Context) BinderC0654c.m5330a(interfaceC0652a), new cje(cipVar), m11019a(str, bwxVar, str2), new cjc(bwxVar.f9208b == -1 ? null : new Date(bwxVar.f9208b), bwxVar.f9210d, bwxVar.f9211e != null ? new HashSet(bwxVar.f9211e) : null, bwxVar.f9217k, m11020a(bwxVar), bwxVar.f9213g, bwxVar.f9224r), bwxVar.f9219m != null ? bwxVar.f9219m.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th) {
            C1668jm.m11613c("Could not request interstitial ad from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10946a(InterfaceC0652a interfaceC0652a, bwx bwxVar, String str, String str2, cip cipVar, ccm ccmVar, List<String> list) throws RemoteException {
        if (!(this.f10151a instanceof MediationNativeAdapter)) {
            String strValueOf = String.valueOf(this.f10151a.getClass().getCanonicalName());
            C1668jm.m11615e(strValueOf.length() != 0 ? "MediationAdapter is not a MediationNativeAdapter: ".concat(strValueOf) : new String("MediationAdapter is not a MediationNativeAdapter: "));
            throw new RemoteException();
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) this.f10151a;
            cjh cjhVar = new cjh(bwxVar.f9208b == -1 ? null : new Date(bwxVar.f9208b), bwxVar.f9210d, bwxVar.f9211e != null ? new HashSet(bwxVar.f9211e) : null, bwxVar.f9217k, m11020a(bwxVar), bwxVar.f9213g, ccmVar, list, bwxVar.f9224r);
            Bundle bundle = bwxVar.f9219m != null ? bwxVar.f9219m.getBundle(mediationNativeAdapter.getClass().getName()) : null;
            this.f10152b = new cje(cipVar);
            mediationNativeAdapter.requestNativeAd((Context) BinderC0654c.m5330a(interfaceC0652a), this.f10152b, m11019a(str, bwxVar, str2), cjhVar, bundle);
        } catch (Throwable th) {
            C1668jm.m11613c("Could not request native ad from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10947a(InterfaceC0652a interfaceC0652a, bxb bxbVar, bwx bwxVar, String str, cip cipVar) throws RemoteException {
        mo10948a(interfaceC0652a, bxbVar, bwxVar, str, null, cipVar);
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10948a(InterfaceC0652a interfaceC0652a, bxb bxbVar, bwx bwxVar, String str, String str2, cip cipVar) throws RemoteException {
        if (!(this.f10151a instanceof MediationBannerAdapter)) {
            String strValueOf = String.valueOf(this.f10151a.getClass().getCanonicalName());
            C1668jm.m11615e(strValueOf.length() != 0 ? "MediationAdapter is not a MediationBannerAdapter: ".concat(strValueOf) : new String("MediationAdapter is not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        C1668jm.m11610b("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f10151a;
            mediationBannerAdapter.requestBannerAd((Context) BinderC0654c.m5330a(interfaceC0652a), new cje(cipVar), m11019a(str, bwxVar, str2), C0859l.m5832a(bxbVar.f9251e, bxbVar.f9248b, bxbVar.f9247a), new cjc(bwxVar.f9208b == -1 ? null : new Date(bwxVar.f9208b), bwxVar.f9210d, bwxVar.f9211e != null ? new HashSet(bwxVar.f9211e) : null, bwxVar.f9217k, m11020a(bwxVar), bwxVar.f9213g, bwxVar.f9224r), bwxVar.f9219m != null ? bwxVar.f9219m.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th) {
            C1668jm.m11613c("Could not request banner ad from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10949a(InterfaceC0652a interfaceC0652a, InterfaceC1511dr interfaceC1511dr, List<String> list) throws RemoteException {
        if (!(this.f10151a instanceof InitializableMediationRewardedVideoAdAdapter)) {
            String strValueOf = String.valueOf(this.f10151a.getClass().getCanonicalName());
            C1668jm.m11615e(strValueOf.length() != 0 ? "MediationAdapter is not an InitializableMediationRewardedVideoAdAdapter: ".concat(strValueOf) : new String("MediationAdapter is not an InitializableMediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        C1668jm.m11610b("Initialize rewarded video adapter.");
        try {
            InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.f10151a;
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m11019a(it.next(), (bwx) null, (String) null));
            }
            initializableMediationRewardedVideoAdAdapter.initialize((Context) BinderC0654c.m5330a(interfaceC0652a), new C1514du(interfaceC1511dr), arrayList);
        } catch (Throwable th) {
            C1668jm.m11613c("Could not initialize rewarded video adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10950a(bwx bwxVar, String str) throws RemoteException {
        mo10951a(bwxVar, str, (String) null);
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10951a(bwx bwxVar, String str, String str2) throws RemoteException {
        if (!(this.f10151a instanceof MediationRewardedVideoAdAdapter)) {
            String strValueOf = String.valueOf(this.f10151a.getClass().getCanonicalName());
            C1668jm.m11615e(strValueOf.length() != 0 ? "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(strValueOf) : new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        C1668jm.m11610b("Requesting rewarded video ad from adapter.");
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f10151a;
            mediationRewardedVideoAdAdapter.loadAd(new cjc(bwxVar.f9208b == -1 ? null : new Date(bwxVar.f9208b), bwxVar.f9210d, bwxVar.f9211e != null ? new HashSet(bwxVar.f9211e) : null, bwxVar.f9217k, m11020a(bwxVar), bwxVar.f9213g, bwxVar.f9224r), m11019a(str, bwxVar, str2), bwxVar.f9219m != null ? bwxVar.f9219m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null);
        } catch (Throwable th) {
            C1668jm.m11613c("Could not load rewarded video ad from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10952a(boolean z) {
        if (!(this.f10151a instanceof InterfaceC0878k)) {
            String strValueOf = String.valueOf(this.f10151a.getClass().getCanonicalName());
            C1668jm.m11614d(strValueOf.length() != 0 ? "MediationAdapter is not an OnImmersiveModeUpdatedListener: ".concat(strValueOf) : new String("MediationAdapter is not an OnImmersiveModeUpdatedListener: "));
        } else {
            try {
                ((InterfaceC0878k) this.f10151a).onImmersiveModeUpdated(z);
            } catch (Throwable th) {
                C1668jm.m11613c("Could not set immersive mode.", th);
            }
        }
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: b */
    public final void mo10953b() throws RemoteException {
        if (!(this.f10151a instanceof MediationInterstitialAdapter)) {
            String strValueOf = String.valueOf(this.f10151a.getClass().getCanonicalName());
            C1668jm.m11615e(strValueOf.length() != 0 ? "MediationAdapter is not a MediationInterstitialAdapter: ".concat(strValueOf) : new String("MediationAdapter is not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        C1668jm.m11610b("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f10151a).showInterstitial();
        } catch (Throwable th) {
            C1668jm.m11613c("Could not show interstitial from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: c */
    public final void mo10954c() throws RemoteException {
        try {
            this.f10151a.onDestroy();
        } catch (Throwable th) {
            C1668jm.m11613c("Could not destroy adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: d */
    public final void mo10955d() throws RemoteException {
        try {
            this.f10151a.onPause();
        } catch (Throwable th) {
            C1668jm.m11613c("Could not pause adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: e */
    public final void mo10956e() throws RemoteException {
        try {
            this.f10151a.onResume();
        } catch (Throwable th) {
            C1668jm.m11613c("Could not resume adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: f */
    public final void mo10957f() throws RemoteException {
        if (!(this.f10151a instanceof MediationRewardedVideoAdAdapter)) {
            String strValueOf = String.valueOf(this.f10151a.getClass().getCanonicalName());
            C1668jm.m11615e(strValueOf.length() != 0 ? "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(strValueOf) : new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        C1668jm.m11610b("Show rewarded video ad from adapter.");
        try {
            ((MediationRewardedVideoAdAdapter) this.f10151a).showVideo();
        } catch (Throwable th) {
            C1668jm.m11613c("Could not show rewarded video ad from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: g */
    public final boolean mo10958g() throws RemoteException {
        if (!(this.f10151a instanceof MediationRewardedVideoAdAdapter)) {
            String strValueOf = String.valueOf(this.f10151a.getClass().getCanonicalName());
            C1668jm.m11615e(strValueOf.length() != 0 ? "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(strValueOf) : new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        C1668jm.m11610b("Check if adapter is initialized.");
        try {
            return ((MediationRewardedVideoAdAdapter) this.f10151a).isInitialized();
        } catch (Throwable th) {
            C1668jm.m11613c("Could not check if adapter is initialized.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: h */
    public final civ mo10959h() {
        C0873f c0873fM11021a = this.f10152b.m11021a();
        if (c0873fM11021a instanceof C0874g) {
            return new cjf((C0874g) c0873fM11021a);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: i */
    public final ciy mo10960i() {
        C0873f c0873fM11021a = this.f10152b.m11021a();
        if (c0873fM11021a instanceof C0875h) {
            return new cjg((C0875h) c0873fM11021a);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: j */
    public final Bundle mo10961j() {
        if (this.f10151a instanceof zzapb) {
            return ((zzapb) this.f10151a).zzmg();
        }
        String strValueOf = String.valueOf(this.f10151a.getClass().getCanonicalName());
        C1668jm.m11615e(strValueOf.length() != 0 ? "MediationAdapter is not a v2 MediationBannerAdapter: ".concat(strValueOf) : new String("MediationAdapter is not a v2 MediationBannerAdapter: "));
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: k */
    public final Bundle mo10962k() {
        if (this.f10151a instanceof zzapc) {
            return ((zzapc) this.f10151a).getInterstitialAdapterInfo();
        }
        String strValueOf = String.valueOf(this.f10151a.getClass().getCanonicalName());
        C1668jm.m11615e(strValueOf.length() != 0 ? "MediationAdapter is not a v2 MediationInterstitialAdapter: ".concat(strValueOf) : new String("MediationAdapter is not a v2 MediationInterstitialAdapter: "));
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
        return this.f10151a instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: n */
    public final cdv mo10965n() {
        InterfaceC0672i interfaceC0672iM11022b = this.f10152b.m11022b();
        if (interfaceC0672iM11022b instanceof cdy) {
            return ((cdy) interfaceC0672iM11022b).m10745b();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: o */
    public final byx mo10966o() {
        if (!(this.f10151a instanceof InterfaceC0879l)) {
            return null;
        }
        try {
            return ((InterfaceC0879l) this.f10151a).getVideoController();
        } catch (Throwable th) {
            C1668jm.m11613c("Could not get video controller.", th);
            return null;
        }
    }
}
