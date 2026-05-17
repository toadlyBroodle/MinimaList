package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.wf */
/* JADX INFO: loaded from: classes.dex */
public final class C2012wf {
    /* JADX INFO: renamed from: a */
    public static int m12486a(Parcel parcel) {
        int i = parcel.readInt();
        int iM12487a = m12487a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if ((65535 & i) != 20293) {
            String strValueOf = String.valueOf(Integer.toHexString(i));
            throw new C2013wg(strValueOf.length() != 0 ? "Expected object header. Got 0x".concat(strValueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i2 = iDataPosition + iM12487a;
        if (i2 < iDataPosition || i2 > parcel.dataSize()) {
            throw new C2013wg(new StringBuilder(54).append("Size read is invalid start=").append(iDataPosition).append(" end=").append(i2).toString(), parcel);
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public static int m12487a(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    /* JADX INFO: renamed from: a */
    public static <T extends Parcelable> T m12488a(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int iM12487a = m12487a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM12487a == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iM12487a + iDataPosition);
        return tCreateFromParcel;
    }

    /* JADX INFO: renamed from: a */
    private static void m12489a(Parcel parcel, int i, int i2) {
        int iM12487a = m12487a(parcel, i);
        if (iM12487a != i2) {
            String hexString = Integer.toHexString(iM12487a);
            throw new C2013wg(new StringBuilder(String.valueOf(hexString).length() + 46).append("Expected size ").append(i2).append(" got ").append(iM12487a).append(" (0x").append(hexString).append(")").toString(), parcel);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m12490a(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            throw new C2013wg(new StringBuilder(String.valueOf(hexString).length() + 46).append("Expected size ").append(i3).append(" got ").append(i2).append(" (0x").append(hexString).append(")").toString(), parcel);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m12491b(Parcel parcel, int i) {
        parcel.setDataPosition(m12487a(parcel, i) + parcel.dataPosition());
    }

    /* JADX INFO: renamed from: b */
    public static <T> T[] m12492b(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int iM12487a = m12487a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM12487a == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iM12487a + iDataPosition);
        return tArr;
    }

    /* JADX INFO: renamed from: c */
    public static <T> ArrayList<T> m12493c(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int iM12487a = m12487a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM12487a == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iM12487a + iDataPosition);
        return arrayListCreateTypedArrayList;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m12494c(Parcel parcel, int i) {
        m12489a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* JADX INFO: renamed from: d */
    public static int m12495d(Parcel parcel, int i) {
        m12489a(parcel, i, 4);
        return parcel.readInt();
    }

    /* JADX INFO: renamed from: e */
    public static long m12496e(Parcel parcel, int i) {
        m12489a(parcel, i, 8);
        return parcel.readLong();
    }

    /* JADX INFO: renamed from: f */
    public static Long m12497f(Parcel parcel, int i) {
        int iM12487a = m12487a(parcel, i);
        if (iM12487a == 0) {
            return null;
        }
        m12490a(parcel, i, iM12487a, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* JADX INFO: renamed from: g */
    public static float m12498g(Parcel parcel, int i) {
        m12489a(parcel, i, 4);
        return parcel.readFloat();
    }

    /* JADX INFO: renamed from: h */
    public static Float m12499h(Parcel parcel, int i) {
        int iM12487a = m12487a(parcel, i);
        if (iM12487a == 0) {
            return null;
        }
        m12490a(parcel, i, iM12487a, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* JADX INFO: renamed from: i */
    public static double m12500i(Parcel parcel, int i) {
        m12489a(parcel, i, 8);
        return parcel.readDouble();
    }

    /* JADX INFO: renamed from: j */
    public static Double m12501j(Parcel parcel, int i) {
        int iM12487a = m12487a(parcel, i);
        if (iM12487a == 0) {
            return null;
        }
        m12490a(parcel, i, iM12487a, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* JADX INFO: renamed from: k */
    public static String m12502k(Parcel parcel, int i) {
        int iM12487a = m12487a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM12487a == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iM12487a + iDataPosition);
        return string;
    }

    /* JADX INFO: renamed from: l */
    public static IBinder m12503l(Parcel parcel, int i) {
        int iM12487a = m12487a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM12487a == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iM12487a + iDataPosition);
        return strongBinder;
    }

    /* JADX INFO: renamed from: m */
    public static Bundle m12504m(Parcel parcel, int i) {
        int iM12487a = m12487a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM12487a == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iM12487a + iDataPosition);
        return bundle;
    }

    /* JADX INFO: renamed from: n */
    public static byte[] m12505n(Parcel parcel, int i) {
        int iM12487a = m12487a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM12487a == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iM12487a + iDataPosition);
        return bArrCreateByteArray;
    }

    /* JADX INFO: renamed from: o */
    public static int[] m12506o(Parcel parcel, int i) {
        int iM12487a = m12487a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM12487a == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iM12487a + iDataPosition);
        return iArrCreateIntArray;
    }

    /* JADX INFO: renamed from: p */
    public static long[] m12507p(Parcel parcel, int i) {
        int iM12487a = m12487a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM12487a == 0) {
            return null;
        }
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(iM12487a + iDataPosition);
        return jArrCreateLongArray;
    }

    /* JADX INFO: renamed from: q */
    public static String[] m12508q(Parcel parcel, int i) {
        int iM12487a = m12487a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM12487a == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iM12487a + iDataPosition);
        return strArrCreateStringArray;
    }

    /* JADX INFO: renamed from: r */
    public static ArrayList<Integer> m12509r(Parcel parcel, int i) {
        int iM12487a = m12487a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM12487a == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iM12487a);
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public static ArrayList<String> m12510s(Parcel parcel, int i) {
        int iM12487a = m12487a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM12487a == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iM12487a + iDataPosition);
        return arrayListCreateStringArrayList;
    }

    /* JADX INFO: renamed from: t */
    public static void m12511t(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new C2013wg(new StringBuilder(37).append("Overread allowed size end=").append(i).toString(), parcel);
        }
    }
}
