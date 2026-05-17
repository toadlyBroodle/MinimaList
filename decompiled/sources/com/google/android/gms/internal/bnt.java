package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class bnt {

    /* JADX INFO: renamed from: a */
    private static final ClassLoader f8501a = bnt.class.getClassLoader();

    private bnt() {
    }

    /* JADX INFO: renamed from: a */
    public static <T extends Parcelable> T m9734a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: a */
    public static void m9735a(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m9736a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m9737a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m9738a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m9739b(Parcel parcel) {
        return parcel.readArrayList(f8501a);
    }

    /* JADX INFO: renamed from: b */
    public static void m9740b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static HashMap m9741c(Parcel parcel) {
        return parcel.readHashMap(f8501a);
    }
}
