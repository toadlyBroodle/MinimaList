package com.google.android.gms.ads.reward.mediation;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.InterfaceC0860a;
import com.google.android.gms.ads.mediation.InterfaceC0861b;

/* JADX INFO: loaded from: classes.dex */
public interface MediationRewardedVideoAdAdapter extends InterfaceC0861b {
    public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";

    void initialize(Context context, InterfaceC0860a interfaceC0860a, String str, InterfaceC0882a interfaceC0882a, Bundle bundle, Bundle bundle2);

    boolean isInitialized();

    void loadAd(InterfaceC0860a interfaceC0860a, Bundle bundle, Bundle bundle2);

    void showVideo();
}
