package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.C1218ag;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.common.util.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1297a {
    /* JADX INFO: renamed from: a */
    public static <T> T[] m7248a(T[] tArr, T... tArr2) {
        int i;
        int i2;
        int i3;
        if (tArr == null) {
            return null;
        }
        if (tArr2.length == 0) {
            return (T[]) Arrays.copyOf(tArr, tArr.length);
        }
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr2.getClass().getComponentType(), tArr.length));
        if (tArr2.length == 1) {
            int length = tArr.length;
            int i4 = 0;
            i = 0;
            while (i4 < length) {
                T t = tArr[i4];
                if (C1218ag.m7063a(tArr2[0], t)) {
                    i3 = i;
                } else {
                    i3 = i + 1;
                    tArr3[i] = t;
                }
                i4++;
                i = i3;
            }
        } else {
            int length2 = tArr.length;
            int i5 = 0;
            i = 0;
            while (i5 < length2) {
                T t2 = tArr[i5];
                int length3 = tArr2.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length3) {
                        i6 = -1;
                        break;
                    }
                    if (C1218ag.m7063a(tArr2[i6], t2)) {
                        break;
                    }
                    i6++;
                }
                if (i6 >= 0) {
                    i2 = i;
                } else {
                    i2 = i + 1;
                    tArr3[i] = t2;
                }
                i5++;
                i = i2;
            }
        }
        if (tArr3 == null) {
            return null;
        }
        return i != tArr3.length ? (T[]) Arrays.copyOf(tArr3, i) : tArr3;
    }
}
