package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ia */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1629ia {

    /* JADX INFO: renamed from: a */
    private final String[] f10766a;

    /* JADX INFO: renamed from: b */
    private final double[] f10767b;

    /* JADX INFO: renamed from: c */
    private final double[] f10768c;

    /* JADX INFO: renamed from: d */
    private final int[] f10769d;

    /* JADX INFO: renamed from: e */
    private int f10770e;

    private C1629ia(C1632id c1632id) {
        int size = c1632id.f10777b.size();
        this.f10766a = (String[]) c1632id.f10776a.toArray(new String[size]);
        this.f10767b = m11520a((List<Double>) c1632id.f10777b);
        this.f10768c = m11520a((List<Double>) c1632id.f10778c);
        this.f10769d = new int[size];
        this.f10770e = 0;
    }

    /* JADX INFO: renamed from: a */
    private static double[] m11520a(List<Double> list) {
        double[] dArr = new double[list.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= dArr.length) {
                return dArr;
            }
            dArr[i2] = list.get(i2).doubleValue();
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public final List<C1631ic> m11521a() {
        ArrayList arrayList = new ArrayList(this.f10766a.length);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f10766a.length) {
                return arrayList;
            }
            arrayList.add(new C1631ic(this.f10766a[i2], this.f10768c[i2], this.f10767b[i2], ((double) this.f10769d[i2]) / ((double) this.f10770e), this.f10769d[i2]));
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11522a(double d) {
        this.f10770e++;
        for (int i = 0; i < this.f10768c.length; i++) {
            if (this.f10768c[i] <= d && d < this.f10767b[i]) {
                int[] iArr = this.f10769d;
                iArr[i] = iArr[i] + 1;
            }
            if (d < this.f10768c[i]) {
                return;
            }
        }
    }
}
