package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ccw extends bnr implements ccu {
    ccw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ccu
    /* JADX INFO: renamed from: a */
    public final String mo10595a() {
        Parcel parcelM9730a = m9730a(2, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ccu
    /* JADX INFO: renamed from: b */
    public final List<ccy> mo10596b() {
        Parcel parcelM9730a = m9730a(3, m9733o_());
        ArrayList arrayListM9739b = bnt.m9739b(parcelM9730a);
        parcelM9730a.recycle();
        return arrayListM9739b;
    }
}
