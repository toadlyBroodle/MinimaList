package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.C0681d;

/* JADX INFO: loaded from: classes.dex */
public interface MediationBannerAdapter extends InterfaceC0861b {
    View getBannerView();

    void requestBannerAd(Context context, InterfaceC0862c interfaceC0862c, Bundle bundle, C0681d c0681d, InterfaceC0860a interfaceC0860a, Bundle bundle2);
}
