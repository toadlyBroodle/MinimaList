package com.google.android.gms.internal;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bsa {

    /* JADX INFO: renamed from: a */
    protected static final Charset f8810a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c */
    private static Charset f8812c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: b */
    public static final Object f8811b = new Object();

    /* JADX INFO: renamed from: a */
    public static int m10153a(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(jArr);
    }

    /* JADX INFO: renamed from: a */
    public static int m10154a(Object[] objArr) {
        int iHashCode = 0;
        int length = objArr == null ? 0 : objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (obj != null) {
                iHashCode = (iHashCode * 31) + obj.hashCode();
            }
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: a */
    public static void m10155a(brw brwVar, brw brwVar2) {
        if (brwVar.f8769X != null) {
            brwVar2.f8769X = (bry) brwVar.f8769X.clone();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m10156a(long[] jArr, long[] jArr2) {
        return (jArr == null || jArr.length == 0) ? jArr2 == null || jArr2.length == 0 : Arrays.equals(jArr, jArr2);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m10157a(Object[] objArr, Object[] objArr2) {
        int length = objArr == null ? 0 : objArr.length;
        int length2 = objArr2 == null ? 0 : objArr2.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length || objArr[i2] != null) {
                int i3 = i;
                while (i3 < length2 && objArr2[i3] == null) {
                    i3++;
                }
                boolean z = i2 >= length;
                boolean z2 = i3 >= length2;
                if (z && z2) {
                    return true;
                }
                if (z != z2 || !objArr[i2].equals(objArr2[i3])) {
                    return false;
                }
                i = i3 + 1;
                i2++;
            } else {
                i2++;
            }
        }
    }
}
