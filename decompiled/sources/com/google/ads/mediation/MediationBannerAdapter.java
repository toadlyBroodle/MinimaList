package com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import com.google.ads.C0632b;
import com.google.ads.mediation.C0648e;
import com.google.ads.mediation.InterfaceC0649f;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface MediationBannerAdapter<ADDITIONAL_PARAMETERS extends InterfaceC0649f, SERVER_PARAMETERS extends C0648e> extends InterfaceC0639b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    View getBannerView();

    void requestBannerAd(InterfaceC0640c interfaceC0640c, Activity activity, SERVER_PARAMETERS server_parameters, C0632b c0632b, C0638a c0638a, ADDITIONAL_PARAMETERS additional_parameters);
}
