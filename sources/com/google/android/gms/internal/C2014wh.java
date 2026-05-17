package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.wh */
/* JADX INFO: loaded from: classes.dex */
public final class C2014wh {
    /* JADX INFO: renamed from: a */
    public static int m12512a(Parcel parcel) {
        return m12533b(parcel, 20293);
    }

    /* JADX INFO: renamed from: a */
    public static void m12513a(Parcel parcel, int i) {
        m12536c(parcel, i);
    }

    /* JADX INFO: renamed from: a */
    public static void m12514a(Parcel parcel, int i, double d) {
        m12534b(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* JADX INFO: renamed from: a */
    public static void m12515a(Parcel parcel, int i, float f) {
        m12534b(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* JADX INFO: renamed from: a */
    public static void m12516a(Parcel parcel, int i, int i2) {
        m12534b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* JADX INFO: renamed from: a */
    public static void m12517a(Parcel parcel, int i, long j) {
        m12534b(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* JADX INFO: renamed from: a */
    public static void m12518a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle == null) {
            return;
        }
        int iM12533b = m12533b(parcel, i);
        parcel.writeBundle(bundle);
        m12536c(parcel, iM12533b);
    }

    /* JADX INFO: renamed from: a */
    public static void m12519a(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            return;
        }
        int iM12533b = m12533b(parcel, i);
        parcel.writeStrongBinder(iBinder);
        m12536c(parcel, iM12533b);
    }

    /* JADX INFO: renamed from: a */
    public static void m12520a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                m12534b(parcel, i, 0);
            }
        } else {
            int iM12533b = m12533b(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m12536c(parcel, iM12533b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12521a(Parcel parcel, int i, Double d, boolean z) {
        if (d == null) {
            return;
        }
        m12534b(parcel, i, 8);
        parcel.writeDouble(d.doubleValue());
    }

    /* JADX INFO: renamed from: a */
    public static void m12522a(Parcel parcel, int i, Float f, boolean z) {
        if (f == null) {
            return;
        }
        m12534b(parcel, i, 4);
        parcel.writeFloat(f.floatValue());
    }

    /* JADX INFO: renamed from: a */
    public static void m12523a(Parcel parcel, int i, Long l, boolean z) {
        if (l == null) {
            return;
        }
        m12534b(parcel, i, 8);
        parcel.writeLong(l.longValue());
    }

    /* JADX INFO: renamed from: a */
    public static void m12524a(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                m12534b(parcel, i, 0);
            }
        } else {
            int iM12533b = m12533b(parcel, i);
            parcel.writeString(str);
            m12536c(parcel, iM12533b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12525a(Parcel parcel, int i, List<Integer> list, boolean z) {
        if (list == null) {
            return;
        }
        int iM12533b = m12533b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(list.get(i2).intValue());
        }
        m12536c(parcel, iM12533b);
    }

    /* JADX INFO: renamed from: a */
    public static void m12526a(Parcel parcel, int i, boolean z) {
        m12534b(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m12527a(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                m12534b(parcel, i, 0);
            }
        } else {
            int iM12533b = m12533b(parcel, i);
            parcel.writeByteArray(bArr);
            m12536c(parcel, iM12533b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12528a(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr == null) {
            return;
        }
        int iM12533b = m12533b(parcel, i);
        parcel.writeIntArray(iArr);
        m12536c(parcel, iM12533b);
    }

    /* JADX INFO: renamed from: a */
    public static void m12529a(Parcel parcel, int i, long[] jArr, boolean z) {
        if (jArr == null) {
            return;
        }
        int iM12533b = m12533b(parcel, i);
        parcel.writeLongArray(jArr);
        m12536c(parcel, iM12533b);
    }

    /* JADX INFO: renamed from: a */
    public static <T extends Parcelable> void m12530a(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr == null) {
            return;
        }
        int iM12533b = m12533b(parcel, i);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m12532a(parcel, t, i2);
            }
        }
        m12536c(parcel, iM12533b);
    }

    /* JADX INFO: renamed from: a */
    public static void m12531a(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr == null) {
            return;
        }
        int iM12533b = m12533b(parcel, i);
        parcel.writeStringArray(strArr);
        m12536c(parcel, iM12533b);
    }

    /* JADX INFO: renamed from: a */
    private static <T extends Parcelable> void m12532a(Parcel parcel, T t, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    /* JADX INFO: renamed from: b */
    private static int m12533b(Parcel parcel, int i) {
        parcel.writeInt((-65536) | i);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* JADX INFO: renamed from: b */
    private static void m12534b(Parcel parcel, int i, int i2) {
        if (i2 < 65535) {
            parcel.writeInt((i2 << 16) | i);
        } else {
            parcel.writeInt((-65536) | i);
            parcel.writeInt(i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m12535b(Parcel parcel, int i, List<String> list, boolean z) {
        if (list == null) {
            return;
        }
        int iM12533b = m12533b(parcel, i);
        parcel.writeStringList(list);
        m12536c(parcel, iM12533b);
    }

    /* JADX INFO: renamed from: c */
    private static void m12536c(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    /* JADX INFO: renamed from: c */
    public static <T extends Parcelable> void m12537c(Parcel parcel, int i, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                m12534b(parcel, i, 0);
                return;
            }
            return;
        }
        int iM12533b = m12533b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m12532a(parcel, t, 0);
            }
        }
        m12536c(parcel, iM12533b);
    }
}
