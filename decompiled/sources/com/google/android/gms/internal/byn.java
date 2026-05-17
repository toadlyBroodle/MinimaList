package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
public abstract class byn extends bns implements bym {
    public byn() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    public static bym asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
        return iInterfaceQueryLocalInterface instanceof bym ? (bym) iInterfaceQueryLocalInterface : new byo(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                byd bydVarCreateBannerAdManager = createBannerAdManager(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()), (bxb) bnt.m9734a(parcel, bxb.CREATOR), parcel.readString(), cij.m10937a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                bnt.m9735a(parcel2, bydVarCreateBannerAdManager);
                break;
            case 2:
                byd bydVarCreateInterstitialAdManager = createInterstitialAdManager(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()), (bxb) bnt.m9734a(parcel, bxb.CREATOR), parcel.readString(), cij.m10937a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                bnt.m9735a(parcel2, bydVarCreateInterstitialAdManager);
                break;
            case 3:
                bxy bxyVarCreateAdLoaderBuilder = createAdLoaderBuilder(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()), parcel.readString(), cij.m10937a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                bnt.m9735a(parcel2, bxyVarCreateAdLoaderBuilder);
                break;
            case 4:
                bys mobileAdsSettingsManager = getMobileAdsSettingsManager(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                bnt.m9735a(parcel2, mobileAdsSettingsManager);
                break;
            case 5:
                cdc cdcVarCreateNativeAdViewDelegate = createNativeAdViewDelegate(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()), InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                bnt.m9735a(parcel2, cdcVarCreateNativeAdViewDelegate);
                break;
            case 6:
                InterfaceC1482cp interfaceC1482cpCreateRewardedVideoAd = createRewardedVideoAd(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()), cij.m10937a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                bnt.m9735a(parcel2, interfaceC1482cpCreateRewardedVideoAd);
                break;
            case 7:
                cks cksVarCreateInAppPurchaseManager = createInAppPurchaseManager(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                bnt.m9735a(parcel2, cksVarCreateInAppPurchaseManager);
                break;
            case 8:
                cki ckiVarCreateAdOverlay = createAdOverlay(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                bnt.m9735a(parcel2, ckiVarCreateAdOverlay);
                break;
            case 9:
                bys mobileAdsSettingsManagerWithClientJarVersion = getMobileAdsSettingsManagerWithClientJarVersion(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                bnt.m9735a(parcel2, mobileAdsSettingsManagerWithClientJarVersion);
                break;
            case 10:
                byd bydVarCreateSearchAdManager = createSearchAdManager(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()), (bxb) bnt.m9734a(parcel, bxb.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                bnt.m9735a(parcel2, bydVarCreateSearchAdManager);
                break;
            case 11:
                cdh cdhVarCreateNativeAdViewHolderDelegate = createNativeAdViewHolderDelegate(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()), InterfaceC0652a.a.m5328a(parcel.readStrongBinder()), InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                bnt.m9735a(parcel2, cdhVarCreateNativeAdViewHolderDelegate);
                break;
            default:
                return false;
        }
        return true;
    }
}
