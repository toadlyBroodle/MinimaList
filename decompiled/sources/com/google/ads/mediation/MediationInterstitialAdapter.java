package com.google.ads.mediation;

import android.app.Activity;
import com.google.ads.mediation.C0648e;
import com.google.ads.mediation.InterfaceC0649f;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface MediationInterstitialAdapter<ADDITIONAL_PARAMETERS extends InterfaceC0649f, SERVER_PARAMETERS extends C0648e> extends InterfaceC0639b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    void requestInterstitialAd(InterfaceC0647d interfaceC0647d, Activity activity, SERVER_PARAMETERS server_parameters, C0638a c0638a, ADDITIONAL_PARAMETERS additional_parameters);

    void showInterstitial();
}
