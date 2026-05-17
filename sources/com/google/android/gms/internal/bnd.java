package com.google.android.gms.internal;

import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class bnd {

    /* JADX INFO: renamed from: a */
    private static final Random f8462a = new Random();

    /* JADX INFO: renamed from: b */
    private static long f8463b = 0;

    /* JADX INFO: renamed from: c */
    private static final int[] f8464c = new int[12];

    /* JADX INFO: renamed from: a */
    public static synchronized String m9689a(long j) {
        String string;
        synchronized (bnd.class) {
            boolean z = j == f8463b;
            f8463b = j;
            char[] cArr = new char[8];
            StringBuilder sb = new StringBuilder(20);
            for (int i = 7; i >= 0; i--) {
                cArr[i] = "-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt((int) (j % 64));
                j /= 64;
            }
            sb.append(cArr);
            if (z) {
                m9690a();
            } else {
                for (int i2 = 0; i2 < 12; i2++) {
                    f8464c[i2] = f8462a.nextInt(64);
                }
            }
            for (int i3 = 0; i3 < 12; i3++) {
                sb.append("-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt(f8464c[i3]));
            }
            string = sb.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: a */
    private static void m9690a() {
        for (int i = 11; i >= 0; i--) {
            if (f8464c[i] != 63) {
                f8464c[i] = f8464c[i] + 1;
                return;
            }
            f8464c[i] = 0;
        }
    }
}
