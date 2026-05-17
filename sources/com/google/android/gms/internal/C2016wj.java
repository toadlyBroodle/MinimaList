package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.internal.wj */
/* JADX INFO: loaded from: classes.dex */
public final class C2016wj {
    /* JADX INFO: renamed from: a */
    public static <T extends InterfaceC2015wi> T m12538a(Intent intent, String str, Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) m12539a(byteArrayExtra, creator);
    }

    /* JADX INFO: renamed from: a */
    public static <T extends InterfaceC2015wi> T m12539a(byte[] bArr, Parcelable.Creator<T> creator) {
        C1221aj.m7065a(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        T tCreateFromParcel = creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return tCreateFromParcel;
    }
}
