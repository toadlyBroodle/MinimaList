package android.support.v7.p023b.p024a;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: android.support.v7.b.a.c */
/* JADX INFO: loaded from: classes.dex */
final class C0367c {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ boolean f2117a;

    static {
        f2117a = !C0367c.class.desiredAssertionStatus();
    }

    private C0367c() {
    }

    /* JADX INFO: renamed from: a */
    public static int m2794a(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }

    /* JADX INFO: renamed from: a */
    public static int[] m2795a(int[] iArr, int i, int i2) {
        if (!f2117a && i > iArr.length) {
            throw new AssertionError();
        }
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[m2794a(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }

    /* JADX INFO: renamed from: a */
    public static <T> T[] m2796a(T[] tArr, int i, T t) {
        T[] tArr2;
        if (!f2117a && i > tArr.length) {
            throw new AssertionError();
        }
        if (i + 1 > tArr.length) {
            tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), m2794a(i)));
            System.arraycopy(tArr, 0, tArr2, 0, i);
        } else {
            tArr2 = tArr;
        }
        tArr2[i] = t;
        return tArr2;
    }
}
