package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractBinderC1273t;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.common.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1296u extends AbstractC2011we {
    public static final Parcelable.Creator<C1296u> CREATOR = new C1318v();

    /* JADX INFO: renamed from: a */
    private final String f6026a;

    /* JADX INFO: renamed from: b */
    private final AbstractBinderC1285o f6027b;

    /* JADX INFO: renamed from: c */
    private final boolean f6028c;

    C1296u(String str, IBinder iBinder, boolean z) {
        this.f6026a = str;
        this.f6027b = m7247a(iBinder);
        this.f6028c = z;
    }

    C1296u(String str, AbstractBinderC1285o abstractBinderC1285o, boolean z) {
        this.f6026a = str;
        this.f6027b = abstractBinderC1285o;
        this.f6028c = z;
    }

    /* JADX INFO: renamed from: a */
    private static AbstractBinderC1285o m7247a(IBinder iBinder) {
        BinderC1286p binderC1286p;
        if (iBinder == null) {
            return null;
        }
        try {
            InterfaceC0652a interfaceC0652aMo7215a = AbstractBinderC1273t.m7217a(iBinder).mo7215a();
            byte[] bArr = interfaceC0652aMo7215a == null ? null : (byte[]) BinderC0654c.m5330a(interfaceC0652aMo7215a);
            if (bArr != null) {
                binderC1286p = new BinderC1286p(bArr);
            } else {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                binderC1286p = null;
            }
            return binderC1286p;
        } catch (RemoteException e) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinderAsBinder;
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 1, this.f6026a, false);
        if (this.f6027b == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = this.f6027b.asBinder();
        }
        C2014wh.m12519a(parcel, 2, iBinderAsBinder, false);
        C2014wh.m12526a(parcel, 3, this.f6028c);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
