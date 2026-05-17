package com.google.android.gms.internal;

import android.os.IInterface;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
public interface bym extends IInterface {
    bxy createAdLoaderBuilder(InterfaceC0652a interfaceC0652a, String str, cii ciiVar, int i);

    cki createAdOverlay(InterfaceC0652a interfaceC0652a);

    byd createBannerAdManager(InterfaceC0652a interfaceC0652a, bxb bxbVar, String str, cii ciiVar, int i);

    cks createInAppPurchaseManager(InterfaceC0652a interfaceC0652a);

    byd createInterstitialAdManager(InterfaceC0652a interfaceC0652a, bxb bxbVar, String str, cii ciiVar, int i);

    cdc createNativeAdViewDelegate(InterfaceC0652a interfaceC0652a, InterfaceC0652a interfaceC0652a2);

    cdh createNativeAdViewHolderDelegate(InterfaceC0652a interfaceC0652a, InterfaceC0652a interfaceC0652a2, InterfaceC0652a interfaceC0652a3);

    InterfaceC1482cp createRewardedVideoAd(InterfaceC0652a interfaceC0652a, cii ciiVar, int i);

    byd createSearchAdManager(InterfaceC0652a interfaceC0652a, bxb bxbVar, String str, int i);

    bys getMobileAdsSettingsManager(InterfaceC0652a interfaceC0652a);

    bys getMobileAdsSettingsManagerWithClientJarVersion(InterfaceC0652a interfaceC0652a, int i);
}
