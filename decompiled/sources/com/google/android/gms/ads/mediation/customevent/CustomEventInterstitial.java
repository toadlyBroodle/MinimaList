package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.InterfaceC0860a;

/* JADX INFO: loaded from: classes.dex */
public interface CustomEventInterstitial extends InterfaceC0866a {
    void requestInterstitialAd(Context context, InterfaceC0869d interfaceC0869d, String str, InterfaceC0860a interfaceC0860a, Bundle bundle);

    void showInterstitial();
}
