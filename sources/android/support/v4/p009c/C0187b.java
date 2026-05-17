package android.support.v4.p009c;

import android.graphics.Path;
import android.support.design.C0025a;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: renamed from: android.support.v4.c.b */
/* JADX INFO: loaded from: classes.dex */
public class C0187b {

    /* JADX INFO: renamed from: android.support.v4.c.b$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        int f1137a;

        /* JADX INFO: renamed from: b */
        boolean f1138b;

        a() {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.c.b$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public char f1139a;

        /* JADX INFO: renamed from: b */
        public float[] f1140b;

        b(char c, float[] fArr) {
            this.f1139a = c;
            this.f1140b = fArr;
        }

        b(b bVar) {
            this.f1139a = bVar.f1139a;
            this.f1140b = C0187b.m1416a(bVar.f1140b, 0, bVar.f1140b.length);
        }

        /* JADX INFO: renamed from: a */
        private static void m1421a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            int iCeil = (int) Math.ceil(Math.abs((4.0d * d9) / 3.141592653589793d));
            double dCos = Math.cos(d7);
            double dSin = Math.sin(d7);
            double dCos2 = Math.cos(d8);
            double dSin2 = Math.sin(d8);
            double d10 = (((-d3) * dCos) * dSin2) - ((d4 * dSin) * dCos2);
            double d11 = d9 / ((double) iCeil);
            int i = 0;
            double d12 = (dSin2 * (-d3) * dSin) + (dCos2 * d4 * dCos);
            double d13 = d10;
            while (i < iCeil) {
                double d14 = d8 + d11;
                double dSin3 = Math.sin(d14);
                double dCos3 = Math.cos(d14);
                double d15 = (((d3 * dCos) * dCos3) + d) - ((d4 * dSin) * dSin3);
                double d16 = (d4 * dCos * dSin3) + (d3 * dSin * dCos3) + d2;
                double d17 = (((-d3) * dCos) * dSin3) - ((d4 * dSin) * dCos3);
                double d18 = (dCos3 * d4 * dCos) + (dSin3 * (-d3) * dSin);
                double dTan = Math.tan((d14 - d8) / 2.0d);
                double dSqrt = ((Math.sqrt((dTan * (3.0d * dTan)) + 4.0d) - 1.0d) * Math.sin(d14 - d8)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d13 * dSqrt) + d5), (float) (d6 + (d12 * dSqrt)), (float) (d15 - (dSqrt * d17)), (float) (d16 - (dSqrt * d18)), (float) d15, (float) d16);
                i++;
                d13 = d17;
                d8 = d14;
                d6 = d16;
                d5 = d15;
                d12 = d18;
            }
        }

        /* JADX INFO: renamed from: a */
        private static void m1422a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            double radians = Math.toRadians(f7);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d3 = ((((double) f) * dCos) + (((double) f2) * dSin)) / ((double) f5);
            double d4 = ((((double) (-f)) * dSin) + (((double) f2) * dCos)) / ((double) f6);
            double d5 = ((((double) f3) * dCos) + (((double) f4) * dSin)) / ((double) f5);
            double d6 = ((((double) (-f3)) * dSin) + (((double) f4) * dCos)) / ((double) f6);
            double d7 = d3 - d5;
            double d8 = d4 - d6;
            double d9 = (d3 + d5) / 2.0d;
            double d10 = (d4 + d6) / 2.0d;
            double d11 = (d7 * d7) + (d8 * d8);
            if (d11 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d12 = (1.0d / d11) - 0.25d;
            if (d12 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d11);
                float fSqrt = (float) (Math.sqrt(d11) / 1.99999d);
                m1422a(path, f, f2, f3, f4, f5 * fSqrt, f6 * fSqrt, f7, z, z2);
                return;
            }
            double dSqrt = Math.sqrt(d12);
            double d13 = d7 * dSqrt;
            double d14 = d8 * dSqrt;
            if (z == z2) {
                d = d9 - d14;
                d2 = d13 + d10;
            } else {
                d = d14 + d9;
                d2 = d10 - d13;
            }
            double dAtan2 = Math.atan2(d4 - d2, d3 - d);
            double dAtan22 = Math.atan2(d6 - d2, d5 - d) - dAtan2;
            if (z2 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d15 = ((double) f5) * d;
            double d16 = d2 * ((double) f6);
            m1421a(path, (d15 * dCos) - (d16 * dSin), (d15 * dSin) + (d16 * dCos), f5, f6, f, f2, radians, dAtan2, dAtan22);
        }

        /* JADX INFO: renamed from: a */
        private static void m1423a(Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int i;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr[2];
            float f16 = fArr[3];
            float f17 = fArr[4];
            float f18 = fArr[5];
            switch (c2) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case C0025a.j.AppCompatTheme_windowNoTitle /* 118 */:
                    i = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case C0025a.j.AppCompatTheme_windowActionBar /* 109 */:
                case C0025a.j.AppCompatTheme_windowMinWidthMajor /* 116 */:
                    i = 2;
                    break;
                case 'Q':
                case 'S':
                case C0025a.j.AppCompatTheme_windowFixedHeightMinor /* 113 */:
                case C0025a.j.AppCompatTheme_windowFixedWidthMinor /* 115 */:
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f17, f18);
                    f16 = f18;
                    f15 = f17;
                    f14 = f18;
                    f13 = f17;
                    i = 2;
                    break;
                default:
                    i = 2;
                    break;
            }
            int i2 = 0;
            float f19 = f18;
            float f20 = f17;
            float f21 = f14;
            float f22 = f13;
            while (i2 < fArr2.length) {
                switch (c2) {
                    case 'A':
                        m1422a(path, f22, f21, fArr2[i2 + 5], fArr2[i2 + 6], fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != 0.0f, fArr2[i2 + 4] != 0.0f);
                        float f23 = fArr2[i2 + 5];
                        float f24 = fArr2[i2 + 6];
                        f = f19;
                        f2 = f20;
                        f3 = f23;
                        f4 = f24;
                        f5 = f23;
                        f6 = f24;
                        break;
                    case 'C':
                        path.cubicTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3], fArr2[i2 + 4], fArr2[i2 + 5]);
                        float f25 = fArr2[i2 + 4];
                        float f26 = fArr2[i2 + 5];
                        f3 = fArr2[i2 + 2];
                        f4 = f26;
                        f5 = f25;
                        f = f19;
                        f2 = f20;
                        f6 = fArr2[i2 + 3];
                        break;
                    case 'H':
                        path.lineTo(fArr2[i2 + 0], f21);
                        f = f19;
                        f3 = f15;
                        f4 = f21;
                        f5 = fArr2[i2 + 0];
                        f6 = f16;
                        f2 = f20;
                        break;
                    case 'L':
                        path.lineTo(fArr2[i2 + 0], fArr2[i2 + 1]);
                        float f27 = fArr2[i2 + 0];
                        f3 = f15;
                        f4 = fArr2[i2 + 1];
                        f5 = f27;
                        f = f19;
                        f2 = f20;
                        f6 = f16;
                        break;
                    case 'M':
                        f2 = fArr2[i2 + 0];
                        f = fArr2[i2 + 1];
                        if (i2 <= 0) {
                            path.moveTo(fArr2[i2 + 0], fArr2[i2 + 1]);
                            f3 = f15;
                            f4 = f;
                            f5 = f2;
                            f6 = f16;
                        } else {
                            path.lineTo(fArr2[i2 + 0], fArr2[i2 + 1]);
                            f3 = f15;
                            f4 = f;
                            f5 = f2;
                            f = f19;
                            f2 = f20;
                            f6 = f16;
                        }
                        break;
                    case 'Q':
                        path.quadTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3]);
                        float f28 = fArr2[i2 + 0];
                        float f29 = fArr2[i2 + 1];
                        float f30 = fArr2[i2 + 2];
                        f3 = f28;
                        f4 = fArr2[i2 + 3];
                        f5 = f30;
                        f = f19;
                        f2 = f20;
                        f6 = f29;
                        break;
                    case 'S':
                        if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                            f9 = (2.0f * f22) - f15;
                            f10 = (2.0f * f21) - f16;
                        } else {
                            f10 = f21;
                            f9 = f22;
                        }
                        path.cubicTo(f9, f10, fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3]);
                        float f31 = fArr2[i2 + 0];
                        float f32 = fArr2[i2 + 1];
                        float f33 = fArr2[i2 + 2];
                        f3 = f31;
                        f4 = fArr2[i2 + 3];
                        f5 = f33;
                        f = f19;
                        f2 = f20;
                        f6 = f32;
                        break;
                    case 'T':
                        if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                            f22 = (2.0f * f22) - f15;
                            f21 = (2.0f * f21) - f16;
                        }
                        path.quadTo(f22, f21, fArr2[i2 + 0], fArr2[i2 + 1]);
                        float f34 = fArr2[i2 + 0];
                        f6 = f21;
                        f3 = f22;
                        f4 = fArr2[i2 + 1];
                        f5 = f34;
                        f = f19;
                        f2 = f20;
                        break;
                    case 'V':
                        path.lineTo(f22, fArr2[i2 + 0]);
                        f2 = f20;
                        f3 = f15;
                        f4 = fArr2[i2 + 0];
                        f5 = f22;
                        f6 = f16;
                        f = f19;
                        break;
                    case 'a':
                        m1422a(path, f22, f21, fArr2[i2 + 5] + f22, fArr2[i2 + 6] + f21, fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != 0.0f, fArr2[i2 + 4] != 0.0f);
                        float f35 = f22 + fArr2[i2 + 5];
                        float f36 = fArr2[i2 + 6] + f21;
                        f = f19;
                        f2 = f20;
                        f3 = f35;
                        f4 = f36;
                        f5 = f35;
                        f6 = f36;
                        break;
                    case 'c':
                        path.rCubicTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3], fArr2[i2 + 4], fArr2[i2 + 5]);
                        float f37 = f22 + fArr2[i2 + 2];
                        float f38 = fArr2[i2 + 3] + f21;
                        float f39 = f22 + fArr2[i2 + 4];
                        f3 = f37;
                        f4 = fArr2[i2 + 5] + f21;
                        f5 = f39;
                        f = f19;
                        f2 = f20;
                        f6 = f38;
                        break;
                    case 'h':
                        path.rLineTo(fArr2[i2 + 0], 0.0f);
                        f = f19;
                        f3 = f15;
                        f4 = f21;
                        f5 = f22 + fArr2[i2 + 0];
                        f6 = f16;
                        f2 = f20;
                        break;
                    case 'l':
                        path.rLineTo(fArr2[i2 + 0], fArr2[i2 + 1]);
                        float f40 = f22 + fArr2[i2 + 0];
                        f3 = f15;
                        f4 = fArr2[i2 + 1] + f21;
                        f5 = f40;
                        f = f19;
                        f2 = f20;
                        f6 = f16;
                        break;
                    case C0025a.j.AppCompatTheme_windowActionBar /* 109 */:
                        f2 = f22 + fArr2[i2 + 0];
                        f = fArr2[i2 + 1] + f21;
                        if (i2 <= 0) {
                            path.rMoveTo(fArr2[i2 + 0], fArr2[i2 + 1]);
                            f3 = f15;
                            f4 = f;
                            f5 = f2;
                            f6 = f16;
                        } else {
                            path.rLineTo(fArr2[i2 + 0], fArr2[i2 + 1]);
                            f3 = f15;
                            f4 = f;
                            f5 = f2;
                            f = f19;
                            f2 = f20;
                            f6 = f16;
                        }
                        break;
                    case C0025a.j.AppCompatTheme_windowFixedHeightMinor /* 113 */:
                        path.rQuadTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3]);
                        float f41 = f22 + fArr2[i2 + 0];
                        float f42 = fArr2[i2 + 1] + f21;
                        float f43 = f22 + fArr2[i2 + 2];
                        f3 = f41;
                        f4 = fArr2[i2 + 3] + f21;
                        f5 = f43;
                        f = f19;
                        f2 = f20;
                        f6 = f42;
                        break;
                    case C0025a.j.AppCompatTheme_windowFixedWidthMinor /* 115 */:
                        if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                            f11 = f22 - f15;
                            f12 = f21 - f16;
                        } else {
                            f12 = 0.0f;
                            f11 = 0.0f;
                        }
                        path.rCubicTo(f11, f12, fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3]);
                        float f44 = f22 + fArr2[i2 + 0];
                        float f45 = fArr2[i2 + 1] + f21;
                        float f46 = f22 + fArr2[i2 + 2];
                        f3 = f44;
                        f4 = fArr2[i2 + 3] + f21;
                        f5 = f46;
                        f = f19;
                        f2 = f20;
                        f6 = f45;
                        break;
                    case C0025a.j.AppCompatTheme_windowMinWidthMajor /* 116 */:
                        if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                            f7 = f22 - f15;
                            f8 = f21 - f16;
                        } else {
                            f8 = 0.0f;
                            f7 = 0.0f;
                        }
                        path.rQuadTo(f7, f8, fArr2[i2 + 0], fArr2[i2 + 1]);
                        float f47 = f22 + fArr2[i2 + 0];
                        f3 = f22 + f7;
                        f4 = fArr2[i2 + 1] + f21;
                        f5 = f47;
                        f = f19;
                        f2 = f20;
                        f6 = f8 + f21;
                        break;
                    case C0025a.j.AppCompatTheme_windowNoTitle /* 118 */:
                        path.rLineTo(0.0f, fArr2[i2 + 0]);
                        f2 = f20;
                        f3 = f15;
                        f4 = fArr2[i2 + 0] + f21;
                        f5 = f22;
                        f6 = f16;
                        f = f19;
                        break;
                    default:
                        f = f19;
                        f2 = f20;
                        f3 = f15;
                        f4 = f21;
                        f5 = f22;
                        f6 = f16;
                        break;
                }
                i2 += i;
                f19 = f;
                f20 = f2;
                f21 = f4;
                f22 = f5;
                c = c2;
                f16 = f6;
                f15 = f3;
            }
            fArr[0] = f22;
            fArr[1] = f21;
            fArr[2] = f15;
            fArr[3] = f16;
            fArr[4] = f20;
            fArr[5] = f19;
        }

        /* JADX INFO: renamed from: a */
        public static void m1424a(b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c = 'm';
            for (int i = 0; i < bVarArr.length; i++) {
                m1423a(path, fArr, c, bVarArr[i].f1139a, bVarArr[i].f1140b);
                c = bVarArr[i].f1139a;
            }
        }

        /* JADX INFO: renamed from: a */
        public void m1425a(b bVar, b bVar2, float f) {
            for (int i = 0; i < bVar.f1140b.length; i++) {
                this.f1140b[i] = (bVar.f1140b[i] * (1.0f - f)) + (bVar2.f1140b[i] * f);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m1411a(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static Path m1412a(String str) {
        Path path = new Path();
        b[] bVarArrM1419b = m1419b(str);
        if (bVarArrM1419b == null) {
            return null;
        }
        try {
            b.m1424a(bVarArrM1419b, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing " + str, e);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1413a(String str, int i, a aVar) {
        aVar.f1138b = false;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = i; i2 < str.length(); i2++) {
            switch (str.charAt(i2)) {
                case ' ':
                case ',':
                    z = false;
                    z3 = true;
                    break;
                case '-':
                    if (i2 == i || z) {
                        z = false;
                    } else {
                        aVar.f1138b = true;
                        z = false;
                        z3 = true;
                    }
                    break;
                case '.':
                    if (z2) {
                        aVar.f1138b = true;
                        z = false;
                        z3 = true;
                    } else {
                        z = false;
                        z2 = true;
                    }
                    break;
                case 'E':
                case 'e':
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z3) {
                aVar.f1137a = i2;
            }
        }
        aVar.f1137a = i2;
    }

    /* JADX INFO: renamed from: a */
    private static void m1414a(ArrayList<b> arrayList, char c, float[] fArr) {
        arrayList.add(new b(c, fArr));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1415a(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i = 0; i < bVarArr.length; i++) {
            if (bVarArr[i].f1139a != bVarArr2[i].f1139a || bVarArr[i].f1140b.length != bVarArr2[i].f1140b.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    static float[] m1416a(float[] fArr, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        int iMin = Math.min(i3, length - i);
        float[] fArr2 = new float[i3];
        System.arraycopy(fArr, i, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX INFO: renamed from: a */
    public static b[] m1417a(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            bVarArr2[i] = new b(bVarArr[i]);
        }
        return bVarArr2;
    }

    /* JADX INFO: renamed from: b */
    public static void m1418b(b[] bVarArr, b[] bVarArr2) {
        for (int i = 0; i < bVarArr2.length; i++) {
            bVarArr[i].f1139a = bVarArr2[i].f1139a;
            for (int i2 = 0; i2 < bVarArr2[i].f1140b.length; i2++) {
                bVarArr[i].f1140b[i2] = bVarArr2[i].f1140b[i2];
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static b[] m1419b(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int iM1411a = m1411a(str, i);
            String strTrim = str.substring(i2, iM1411a).trim();
            if (strTrim.length() > 0) {
                m1414a((ArrayList<b>) arrayList, strTrim.charAt(0), m1420c(strTrim));
            }
            i = iM1411a + 1;
            i2 = iM1411a;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            m1414a((ArrayList<b>) arrayList, str.charAt(i2), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    /* JADX INFO: renamed from: c */
    private static float[] m1420c(String str) {
        int i;
        int i2 = 0;
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i3 = 1;
            while (i3 < length) {
                m1413a(str, i3, aVar);
                int i4 = aVar.f1137a;
                if (i3 < i4) {
                    i = i2 + 1;
                    fArr[i2] = Float.parseFloat(str.substring(i3, i4));
                } else {
                    i = i2;
                }
                if (aVar.f1138b) {
                    i3 = i4;
                    i2 = i;
                } else {
                    i3 = i4 + 1;
                    i2 = i;
                }
            }
            return m1416a(fArr, 0, i2);
        } catch (NumberFormatException e) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e);
        }
    }
}
