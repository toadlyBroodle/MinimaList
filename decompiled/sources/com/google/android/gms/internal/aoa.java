package com.google.android.gms.internal;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class aoa implements ajz {

    /* JADX INFO: renamed from: a */
    private final Context f6990a;

    public aoa(Context context) {
        this.f6990a = (Context) C1221aj.m7065a(context);
    }

    @Override // com.google.android.gms.internal.ajz
    /* JADX INFO: renamed from: b */
    public final arh<?> mo8076b(aii aiiVar, arh<?>... arhVarArr) {
        String networkOperatorName;
        C1221aj.m7074b(arhVarArr != null);
        C1221aj.m7074b(arhVarArr.length == 0);
        TelephonyManager telephonyManager = (TelephonyManager) this.f6990a.getSystemService("phone");
        return (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) ? arn.f7154e : new art(networkOperatorName);
    }
}
