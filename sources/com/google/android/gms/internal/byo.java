package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
public final class byo extends bnr implements bym {
    byo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.bym
    public final bxy createAdLoaderBuilder(InterfaceC0652a interfaceC0652a, String str, cii ciiVar, int i) {
        bxy byaVar;
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        parcelM9733o_.writeString(str);
        bnt.m9735a(parcelM9733o_, ciiVar);
        parcelM9733o_.writeInt(i);
        Parcel parcelM9730a = m9730a(3, parcelM9733o_);
        IBinder strongBinder = parcelM9730a.readStrongBinder();
        if (strongBinder == null) {
            byaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            byaVar = iInterfaceQueryLocalInterface instanceof bxy ? (bxy) iInterfaceQueryLocalInterface : new bya(strongBinder);
        }
        parcelM9730a.recycle();
        return byaVar;
    }

    @Override // com.google.android.gms.internal.bym
    public final cki createAdOverlay(InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        Parcel parcelM9730a = m9730a(8, parcelM9733o_);
        cki ckiVarM11066a = ckj.m11066a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return ckiVarM11066a;
    }

    @Override // com.google.android.gms.internal.bym
    public final byd createBannerAdManager(InterfaceC0652a interfaceC0652a, bxb bxbVar, String str, cii ciiVar, int i) {
        byd byfVar;
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9736a(parcelM9733o_, bxbVar);
        parcelM9733o_.writeString(str);
        bnt.m9735a(parcelM9733o_, ciiVar);
        parcelM9733o_.writeInt(i);
        Parcel parcelM9730a = m9730a(1, parcelM9733o_);
        IBinder strongBinder = parcelM9730a.readStrongBinder();
        if (strongBinder == null) {
            byfVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            byfVar = iInterfaceQueryLocalInterface instanceof byd ? (byd) iInterfaceQueryLocalInterface : new byf(strongBinder);
        }
        parcelM9730a.recycle();
        return byfVar;
    }

    @Override // com.google.android.gms.internal.bym
    public final cks createInAppPurchaseManager(InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        Parcel parcelM9730a = m9730a(7, parcelM9733o_);
        cks cksVarM11070a = ckt.m11070a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return cksVarM11070a;
    }

    @Override // com.google.android.gms.internal.bym
    public final byd createInterstitialAdManager(InterfaceC0652a interfaceC0652a, bxb bxbVar, String str, cii ciiVar, int i) {
        byd byfVar;
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9736a(parcelM9733o_, bxbVar);
        parcelM9733o_.writeString(str);
        bnt.m9735a(parcelM9733o_, ciiVar);
        parcelM9733o_.writeInt(i);
        Parcel parcelM9730a = m9730a(2, parcelM9733o_);
        IBinder strongBinder = parcelM9730a.readStrongBinder();
        if (strongBinder == null) {
            byfVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            byfVar = iInterfaceQueryLocalInterface instanceof byd ? (byd) iInterfaceQueryLocalInterface : new byf(strongBinder);
        }
        parcelM9730a.recycle();
        return byfVar;
    }

    @Override // com.google.android.gms.internal.bym
    public final cdc createNativeAdViewDelegate(InterfaceC0652a interfaceC0652a, InterfaceC0652a interfaceC0652a2) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9735a(parcelM9733o_, interfaceC0652a2);
        Parcel parcelM9730a = m9730a(5, parcelM9733o_);
        cdc cdcVarM10739a = cdd.m10739a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return cdcVarM10739a;
    }

    @Override // com.google.android.gms.internal.bym
    public final cdh createNativeAdViewHolderDelegate(InterfaceC0652a interfaceC0652a, InterfaceC0652a interfaceC0652a2, InterfaceC0652a interfaceC0652a3) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9735a(parcelM9733o_, interfaceC0652a2);
        bnt.m9735a(parcelM9733o_, interfaceC0652a3);
        Parcel parcelM9730a = m9730a(11, parcelM9733o_);
        cdh cdhVarM10740a = cdj.m10740a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return cdhVarM10740a;
    }

    @Override // com.google.android.gms.internal.bym
    public final InterfaceC1482cp createRewardedVideoAd(InterfaceC0652a interfaceC0652a, cii ciiVar, int i) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9735a(parcelM9733o_, ciiVar);
        parcelM9733o_.writeInt(i);
        Parcel parcelM9730a = m9730a(6, parcelM9733o_);
        InterfaceC1482cp interfaceC1482cpM11154a = AbstractBinderC1483cq.m11154a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC1482cpM11154a;
    }

    @Override // com.google.android.gms.internal.bym
    public final byd createSearchAdManager(InterfaceC0652a interfaceC0652a, bxb bxbVar, String str, int i) {
        byd byfVar;
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9736a(parcelM9733o_, bxbVar);
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeInt(i);
        Parcel parcelM9730a = m9730a(10, parcelM9733o_);
        IBinder strongBinder = parcelM9730a.readStrongBinder();
        if (strongBinder == null) {
            byfVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            byfVar = iInterfaceQueryLocalInterface instanceof byd ? (byd) iInterfaceQueryLocalInterface : new byf(strongBinder);
        }
        parcelM9730a.recycle();
        return byfVar;
    }

    @Override // com.google.android.gms.internal.bym
    public final bys getMobileAdsSettingsManager(InterfaceC0652a interfaceC0652a) {
        bys byuVar;
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        Parcel parcelM9730a = m9730a(4, parcelM9733o_);
        IBinder strongBinder = parcelM9730a.readStrongBinder();
        if (strongBinder == null) {
            byuVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            byuVar = iInterfaceQueryLocalInterface instanceof bys ? (bys) iInterfaceQueryLocalInterface : new byu(strongBinder);
        }
        parcelM9730a.recycle();
        return byuVar;
    }

    @Override // com.google.android.gms.internal.bym
    public final bys getMobileAdsSettingsManagerWithClientJarVersion(InterfaceC0652a interfaceC0652a, int i) {
        bys byuVar;
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        parcelM9733o_.writeInt(i);
        Parcel parcelM9730a = m9730a(9, parcelM9733o_);
        IBinder strongBinder = parcelM9730a.readStrongBinder();
        if (strongBinder == null) {
            byuVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            byuVar = iInterfaceQueryLocalInterface instanceof bys ? (bys) iInterfaceQueryLocalInterface : new byu(strongBinder);
        }
        parcelM9730a.recycle();
        return byuVar;
    }
}
