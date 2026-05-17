package android.support.p003b.p004a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.v4.p007b.p008a.C0174c;
import android.support.v4.p009c.C0187b;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: android.support.b.a.g */
/* JADX INFO: loaded from: classes.dex */
public class InterpolatorC0018g implements Interpolator {

    /* JADX INFO: renamed from: a */
    private float[] f66a;

    /* JADX INFO: renamed from: b */
    private float[] f67b;

    public InterpolatorC0018g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public InterpolatorC0018g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayM1330a = C0174c.m1330a(resources, theme, attributeSet, C0012a.f50l);
        m73a(typedArrayM1330a, xmlPullParser);
        typedArrayM1330a.recycle();
    }

    /* JADX INFO: renamed from: a */
    private void m71a(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        m74a(path);
    }

    /* JADX INFO: renamed from: a */
    private void m72a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        m74a(path);
    }

    /* JADX INFO: renamed from: a */
    private void m73a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C0174c.m1333a(xmlPullParser, "pathData")) {
            String strM1331a = C0174c.m1331a(typedArray, xmlPullParser, "pathData", 4);
            Path pathM1412a = C0187b.m1412a(strM1331a);
            if (pathM1412a == null) {
                throw new InflateException("The path is null, which is created from " + strM1331a);
            }
            m74a(pathM1412a);
            return;
        }
        if (!C0174c.m1333a(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
        if (!C0174c.m1333a(xmlPullParser, "controlY1")) {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        float fM1328a = C0174c.m1328a(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
        float fM1328a2 = C0174c.m1328a(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
        boolean zM1333a = C0174c.m1333a(xmlPullParser, "controlX2");
        if (zM1333a != C0174c.m1333a(xmlPullParser, "controlY2")) {
            throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
        }
        if (zM1333a) {
            m72a(fM1328a, fM1328a2, C0174c.m1328a(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C0174c.m1328a(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
        } else {
            m71a(fM1328a, fM1328a2);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m74a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int iMin = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (iMin <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f66a = new float[iMin];
        this.f67b = new float[iMin];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < iMin; i2++) {
            pathMeasure.getPosTan((i2 * length) / (iMin - 1), fArr, null);
            this.f66a[i2] = fArr[0];
            this.f67b[i2] = fArr[1];
        }
        if (Math.abs(this.f66a[0]) > 1.0E-5d || Math.abs(this.f67b[0]) > 1.0E-5d || Math.abs(this.f66a[iMin - 1] - 1.0f) > 1.0E-5d || Math.abs(this.f67b[iMin - 1] - 1.0f) > 1.0E-5d) {
            throw new IllegalArgumentException("The Path must start at (0,0) and end at (1,1) start: " + this.f66a[0] + "," + this.f67b[0] + " end:" + this.f66a[iMin - 1] + "," + this.f67b[iMin - 1]);
        }
        float f = 0.0f;
        int i3 = 0;
        while (i < iMin) {
            int i4 = i3 + 1;
            float f2 = this.f66a[i3];
            if (f2 < f) {
                throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
            }
            this.f66a[i] = f2;
            i++;
            f = f2;
            i3 = i4;
        }
        if (pathMeasure.nextContour()) {
            throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        int i;
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i2 = 0;
        int length = this.f66a.length - 1;
        while (length - i2 > 1) {
            int i3 = (i2 + length) / 2;
            if (f < this.f66a[i3]) {
                i = i2;
            } else {
                int i4 = length;
                i = i3;
                i3 = i4;
            }
            i2 = i;
            length = i3;
        }
        float f2 = this.f66a[length] - this.f66a[i2];
        if (f2 == 0.0f) {
            return this.f67b[i2];
        }
        float f3 = (f - this.f66a[i2]) / f2;
        float f4 = this.f67b[i2];
        return (f3 * (this.f67b[length] - f4)) + f4;
    }
}
