package android.support.v4.p018i;

import java.io.PrintWriter;

/* JADX INFO: renamed from: android.support.v4.i.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0221o {

    /* JADX INFO: renamed from: a */
    private static final Object f1279a = new Object();

    /* JADX INFO: renamed from: b */
    private static char[] f1280b = new char[24];

    /* JADX INFO: renamed from: a */
    private static int m1599a(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private static int m1600a(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (f1280b.length < i) {
            f1280b = new char[i];
        }
        char[] cArr = f1280b;
        if (j == 0) {
            int i7 = i - 1;
            while (0 < i7) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j > 0) {
            c = '+';
        } else {
            j = -j;
            c = '-';
        }
        int i8 = (int) (j % 1000);
        int iFloor = (int) Math.floor(j / 1000);
        int i9 = 0;
        if (iFloor > 86400) {
            i9 = iFloor / 86400;
            iFloor -= 86400 * i9;
        }
        if (iFloor > 3600) {
            int i10 = iFloor / 3600;
            i2 = i10;
            i3 = iFloor - (i10 * 3600);
        } else {
            i2 = 0;
            i3 = iFloor;
        }
        if (i3 > 60) {
            int i11 = i3 / 60;
            i4 = i11;
            i5 = i3 - (i11 * 60);
        } else {
            i4 = 0;
            i5 = i3;
        }
        if (i != 0) {
            int iM1599a = m1599a(i9, 1, false, 0);
            int iM1599a2 = iM1599a + m1599a(i2, 1, iM1599a > 0, 2);
            int iM1599a3 = iM1599a2 + m1599a(i4, 1, iM1599a2 > 0, 2);
            int iM1599a4 = iM1599a3 + m1599a(i5, 1, iM1599a3 > 0, 2);
            i6 = 0;
            int iM1599a5 = m1599a(i8, 2, true, iM1599a4 > 0 ? 3 : 0) + 1 + iM1599a4;
            while (iM1599a5 < i) {
                cArr[i6] = ' ';
                iM1599a5++;
                i6++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c;
        int i12 = i6 + 1;
        boolean z = i != 0;
        int iM1601a = m1601a(cArr, i9, 'd', i12, false, 0);
        int iM1601a2 = m1601a(cArr, i2, 'h', iM1601a, iM1601a != i12, z ? 2 : 0);
        int iM1601a3 = m1601a(cArr, i4, 'm', iM1601a2, iM1601a2 != i12, z ? 2 : 0);
        int iM1601a4 = m1601a(cArr, i5, 's', iM1601a3, iM1601a3 != i12, z ? 2 : 0);
        int iM1601a5 = m1601a(cArr, i8, 'm', iM1601a4, true, (!z || iM1601a4 == i12) ? 0 : 3);
        cArr[iM1601a5] = 's';
        return iM1601a5 + 1;
    }

    /* JADX INFO: renamed from: a */
    private static int m1601a(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        int i5;
        if (!z && i <= 0) {
            return i2;
        }
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
            i5 = i;
        } else {
            int i6 = i / 100;
            cArr[i2] = (char) (i6 + 48);
            i4 = i2 + 1;
            i5 = i - (i6 * 100);
        }
        if ((z && i3 >= 2) || i5 > 9 || i2 != i4) {
            int i7 = i5 / 10;
            cArr[i4] = (char) (i7 + 48);
            i4++;
            i5 -= i7 * 10;
        }
        cArr[i4] = (char) (i5 + 48);
        int i8 = i4 + 1;
        cArr[i8] = c;
        return i8 + 1;
    }

    /* JADX INFO: renamed from: a */
    public static void m1602a(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            m1604a(j - j2, printWriter, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1603a(long j, PrintWriter printWriter) {
        m1604a(j, printWriter, 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m1604a(long j, PrintWriter printWriter, int i) {
        synchronized (f1279a) {
            printWriter.print(new String(f1280b, 0, m1600a(j, i)));
        }
    }
}
