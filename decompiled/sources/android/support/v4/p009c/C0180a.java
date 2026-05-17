package android.support.v4.p009c;

import android.graphics.Color;

/* JADX INFO: renamed from: android.support.v4.c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0180a {

    /* JADX INFO: renamed from: a */
    private static final ThreadLocal<double[]> f1120a = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public static double m1377a(int i) {
        double[] dArrM1382a = m1382a();
        m1381a(i, dArrM1382a);
        return dArrM1382a[1] / 100.0d;
    }

    /* JADX INFO: renamed from: a */
    public static int m1378a(int i, int i2) {
        int iAlpha = Color.alpha(i2);
        int iAlpha2 = Color.alpha(i);
        int iM1385d = m1385d(iAlpha2, iAlpha);
        return Color.argb(iM1385d, m1379a(Color.red(i), iAlpha2, Color.red(i2), iAlpha, iM1385d), m1379a(Color.green(i), iAlpha2, Color.green(i2), iAlpha, iM1385d), m1379a(Color.blue(i), iAlpha2, Color.blue(i2), iAlpha, iM1385d));
    }

    /* JADX INFO: renamed from: a */
    private static int m1379a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    /* JADX INFO: renamed from: a */
    public static void m1380a(int i, int i2, int i3, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = ((double) i) / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = ((double) i2) / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) i3) / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = 100.0d * ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3));
        dArr[1] = 100.0d * ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3));
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
    }

    /* JADX INFO: renamed from: a */
    public static void m1381a(int i, double[] dArr) {
        m1380a(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    /* JADX INFO: renamed from: a */
    private static double[] m1382a() {
        double[] dArr = f1120a.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        f1120a.set(dArr2);
        return dArr2;
    }

    /* JADX INFO: renamed from: b */
    public static double m1383b(int i, int i2) {
        if (Color.alpha(i2) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
        }
        if (Color.alpha(i) < 255) {
            i = m1378a(i, i2);
        }
        double dM1377a = m1377a(i) + 0.05d;
        double dM1377a2 = m1377a(i2) + 0.05d;
        return Math.max(dM1377a, dM1377a2) / Math.min(dM1377a, dM1377a2);
    }

    /* JADX INFO: renamed from: c */
    public static int m1384c(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (16777215 & i) | (i2 << 24);
    }

    /* JADX INFO: renamed from: d */
    private static int m1385d(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }
}
