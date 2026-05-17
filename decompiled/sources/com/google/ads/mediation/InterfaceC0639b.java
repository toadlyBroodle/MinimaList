package com.google.ads.mediation;

import com.google.ads.mediation.C0648e;

/* JADX INFO: renamed from: com.google.ads.mediation.b */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface InterfaceC0639b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS extends C0648e> {
    void destroy();

    Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    Class<SERVER_PARAMETERS> getServerParametersType();
}
