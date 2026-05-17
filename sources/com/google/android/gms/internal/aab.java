package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC1233av;
import com.google.android.gms.common.internal.InterfaceC1235ax;
import com.google.android.gms.common.internal.InterfaceC1236ay;

/* JADX INFO: loaded from: classes.dex */
public final class aab extends AbstractC1233av<InterfaceC2108zu> {
    public aab(Context context, Looper looper, InterfaceC1235ax interfaceC1235ax, InterfaceC1236ay interfaceC1236ay) {
        super(context, looper, 93, interfaceC1235ax, interfaceC1236ay, null);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ IInterface mo6166a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2108zu ? (InterfaceC2108zu) iInterfaceQueryLocalInterface : new C2110zw(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: b */
    protected final String mo6167b() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: j_ */
    protected final String mo6171j_() {
        return "com.google.android.gms.measurement.START";
    }
}
