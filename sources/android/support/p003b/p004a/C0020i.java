package android.support.p003b.p004a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.support.v4.p007b.p008a.C0173b;
import android.support.v4.p007b.p008a.C0174c;
import android.support.v4.p009c.C0187b;
import android.support.v4.p009c.p010a.C0181a;
import android.support.v4.p018i.C0207a;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: android.support.b.a.i */
/* JADX INFO: loaded from: classes.dex */
public class C0020i extends AbstractC0019h {

    /* JADX INFO: renamed from: a */
    static final PorterDuff.Mode f69a = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c */
    private f f70c;

    /* JADX INFO: renamed from: d */
    private PorterDuffColorFilter f71d;

    /* JADX INFO: renamed from: e */
    private ColorFilter f72e;

    /* JADX INFO: renamed from: f */
    private boolean f73f;

    /* JADX INFO: renamed from: g */
    private boolean f74g;

    /* JADX INFO: renamed from: h */
    private Drawable.ConstantState f75h;

    /* JADX INFO: renamed from: i */
    private final float[] f76i;

    /* JADX INFO: renamed from: j */
    private final Matrix f77j;

    /* JADX INFO: renamed from: k */
    private final Rect f78k;

    /* JADX INFO: renamed from: android.support.b.a.i$a */
    private static class a extends d {
        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }

        /* JADX INFO: renamed from: a */
        private void m85a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f106n = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f105m = C0187b.m1419b(string2);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m86a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C0174c.m1333a(xmlPullParser, "pathData")) {
                TypedArray typedArrayM1330a = C0174c.m1330a(resources, theme, attributeSet, C0012a.f42d);
                m85a(typedArrayM1330a);
                typedArrayM1330a.recycle();
            }
        }

        @Override // android.support.p003b.p004a.C0020i.d
        /* JADX INFO: renamed from: a */
        public boolean mo87a() {
            return true;
        }
    }

    /* JADX INFO: renamed from: android.support.b.a.i$b */
    private static class b extends d {

        /* JADX INFO: renamed from: a */
        int f79a;

        /* JADX INFO: renamed from: b */
        float f80b;

        /* JADX INFO: renamed from: c */
        int f81c;

        /* JADX INFO: renamed from: d */
        float f82d;

        /* JADX INFO: renamed from: e */
        int f83e;

        /* JADX INFO: renamed from: f */
        float f84f;

        /* JADX INFO: renamed from: g */
        float f85g;

        /* JADX INFO: renamed from: h */
        float f86h;

        /* JADX INFO: renamed from: i */
        float f87i;

        /* JADX INFO: renamed from: j */
        Paint.Cap f88j;

        /* JADX INFO: renamed from: k */
        Paint.Join f89k;

        /* JADX INFO: renamed from: l */
        float f90l;

        /* JADX INFO: renamed from: p */
        private int[] f91p;

        public b() {
            this.f79a = 0;
            this.f80b = 0.0f;
            this.f81c = 0;
            this.f82d = 1.0f;
            this.f83e = 0;
            this.f84f = 1.0f;
            this.f85g = 0.0f;
            this.f86h = 1.0f;
            this.f87i = 0.0f;
            this.f88j = Paint.Cap.BUTT;
            this.f89k = Paint.Join.MITER;
            this.f90l = 4.0f;
        }

        public b(b bVar) {
            super(bVar);
            this.f79a = 0;
            this.f80b = 0.0f;
            this.f81c = 0;
            this.f82d = 1.0f;
            this.f83e = 0;
            this.f84f = 1.0f;
            this.f85g = 0.0f;
            this.f86h = 1.0f;
            this.f87i = 0.0f;
            this.f88j = Paint.Cap.BUTT;
            this.f89k = Paint.Join.MITER;
            this.f90l = 4.0f;
            this.f91p = bVar.f91p;
            this.f79a = bVar.f79a;
            this.f80b = bVar.f80b;
            this.f82d = bVar.f82d;
            this.f81c = bVar.f81c;
            this.f83e = bVar.f83e;
            this.f84f = bVar.f84f;
            this.f85g = bVar.f85g;
            this.f86h = bVar.f86h;
            this.f87i = bVar.f87i;
            this.f88j = bVar.f88j;
            this.f89k = bVar.f89k;
            this.f90l = bVar.f90l;
        }

        /* JADX INFO: renamed from: a */
        private Paint.Cap m88a(int i, Paint.Cap cap) {
            switch (i) {
                case 0:
                    return Paint.Cap.BUTT;
                case 1:
                    return Paint.Cap.ROUND;
                case 2:
                    return Paint.Cap.SQUARE;
                default:
                    return cap;
            }
        }

        /* JADX INFO: renamed from: a */
        private Paint.Join m89a(int i, Paint.Join join) {
            switch (i) {
                case 0:
                    return Paint.Join.MITER;
                case 1:
                    return Paint.Join.ROUND;
                case 2:
                    return Paint.Join.BEVEL;
                default:
                    return join;
            }
        }

        /* JADX INFO: renamed from: a */
        private void m90a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f91p = null;
            if (C0174c.m1333a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f106n = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f105m = C0187b.m1419b(string2);
                }
                this.f81c = C0174c.m1334b(typedArray, xmlPullParser, "fillColor", 1, this.f81c);
                this.f84f = C0174c.m1328a(typedArray, xmlPullParser, "fillAlpha", 12, this.f84f);
                this.f88j = m88a(C0174c.m1329a(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f88j);
                this.f89k = m89a(C0174c.m1329a(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f89k);
                this.f90l = C0174c.m1328a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f90l);
                this.f79a = C0174c.m1334b(typedArray, xmlPullParser, "strokeColor", 3, this.f79a);
                this.f82d = C0174c.m1328a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f82d);
                this.f80b = C0174c.m1328a(typedArray, xmlPullParser, "strokeWidth", 4, this.f80b);
                this.f86h = C0174c.m1328a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f86h);
                this.f87i = C0174c.m1328a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f87i);
                this.f85g = C0174c.m1328a(typedArray, xmlPullParser, "trimPathStart", 5, this.f85g);
                this.f83e = C0174c.m1329a(typedArray, xmlPullParser, "fillType", 13, this.f83e);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m91a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayM1330a = C0174c.m1330a(resources, theme, attributeSet, C0012a.f41c);
            m90a(typedArrayM1330a, xmlPullParser);
            typedArrayM1330a.recycle();
        }

        float getFillAlpha() {
            return this.f84f;
        }

        int getFillColor() {
            return this.f81c;
        }

        float getStrokeAlpha() {
            return this.f82d;
        }

        int getStrokeColor() {
            return this.f79a;
        }

        float getStrokeWidth() {
            return this.f80b;
        }

        float getTrimPathEnd() {
            return this.f86h;
        }

        float getTrimPathOffset() {
            return this.f87i;
        }

        float getTrimPathStart() {
            return this.f85g;
        }

        void setFillAlpha(float f) {
            this.f84f = f;
        }

        void setFillColor(int i) {
            this.f81c = i;
        }

        void setStrokeAlpha(float f) {
            this.f82d = f;
        }

        void setStrokeColor(int i) {
            this.f79a = i;
        }

        void setStrokeWidth(float f) {
            this.f80b = f;
        }

        void setTrimPathEnd(float f) {
            this.f86h = f;
        }

        void setTrimPathOffset(float f) {
            this.f87i = f;
        }

        void setTrimPathStart(float f) {
            this.f85g = f;
        }
    }

    /* JADX INFO: renamed from: android.support.b.a.i$c */
    private static class c {

        /* JADX INFO: renamed from: a */
        final ArrayList<Object> f92a;

        /* JADX INFO: renamed from: b */
        float f93b;

        /* JADX INFO: renamed from: c */
        int f94c;

        /* JADX INFO: renamed from: d */
        private final Matrix f95d;

        /* JADX INFO: renamed from: e */
        private float f96e;

        /* JADX INFO: renamed from: f */
        private float f97f;

        /* JADX INFO: renamed from: g */
        private float f98g;

        /* JADX INFO: renamed from: h */
        private float f99h;

        /* JADX INFO: renamed from: i */
        private float f100i;

        /* JADX INFO: renamed from: j */
        private float f101j;

        /* JADX INFO: renamed from: k */
        private final Matrix f102k;

        /* JADX INFO: renamed from: l */
        private int[] f103l;

        /* JADX INFO: renamed from: m */
        private String f104m;

        public c() {
            this.f95d = new Matrix();
            this.f92a = new ArrayList<>();
            this.f93b = 0.0f;
            this.f96e = 0.0f;
            this.f97f = 0.0f;
            this.f98g = 1.0f;
            this.f99h = 1.0f;
            this.f100i = 0.0f;
            this.f101j = 0.0f;
            this.f102k = new Matrix();
            this.f104m = null;
        }

        public c(c cVar, C0207a<String, Object> c0207a) {
            d aVar;
            this.f95d = new Matrix();
            this.f92a = new ArrayList<>();
            this.f93b = 0.0f;
            this.f96e = 0.0f;
            this.f97f = 0.0f;
            this.f98g = 1.0f;
            this.f99h = 1.0f;
            this.f100i = 0.0f;
            this.f101j = 0.0f;
            this.f102k = new Matrix();
            this.f104m = null;
            this.f93b = cVar.f93b;
            this.f96e = cVar.f96e;
            this.f97f = cVar.f97f;
            this.f98g = cVar.f98g;
            this.f99h = cVar.f99h;
            this.f100i = cVar.f100i;
            this.f101j = cVar.f101j;
            this.f103l = cVar.f103l;
            this.f104m = cVar.f104m;
            this.f94c = cVar.f94c;
            if (this.f104m != null) {
                c0207a.put(this.f104m, this);
            }
            this.f102k.set(cVar.f102k);
            ArrayList<Object> arrayList = cVar.f92a;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= arrayList.size()) {
                    return;
                }
                Object obj = arrayList.get(i2);
                if (obj instanceof c) {
                    this.f92a.add(new c((c) obj, c0207a));
                } else {
                    if (obj instanceof b) {
                        aVar = new b((b) obj);
                    } else {
                        if (!(obj instanceof a)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        aVar = new a((a) obj);
                    }
                    this.f92a.add(aVar);
                    if (aVar.f106n != null) {
                        c0207a.put(aVar.f106n, aVar);
                    }
                }
                i = i2 + 1;
            }
        }

        /* JADX INFO: renamed from: a */
        private void m93a() {
            this.f102k.reset();
            this.f102k.postTranslate(-this.f96e, -this.f97f);
            this.f102k.postScale(this.f98g, this.f99h);
            this.f102k.postRotate(this.f93b, 0.0f, 0.0f);
            this.f102k.postTranslate(this.f100i + this.f96e, this.f101j + this.f97f);
        }

        /* JADX INFO: renamed from: a */
        private void m94a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f103l = null;
            this.f93b = C0174c.m1328a(typedArray, xmlPullParser, "rotation", 5, this.f93b);
            this.f96e = typedArray.getFloat(1, this.f96e);
            this.f97f = typedArray.getFloat(2, this.f97f);
            this.f98g = C0174c.m1328a(typedArray, xmlPullParser, "scaleX", 3, this.f98g);
            this.f99h = C0174c.m1328a(typedArray, xmlPullParser, "scaleY", 4, this.f99h);
            this.f100i = C0174c.m1328a(typedArray, xmlPullParser, "translateX", 6, this.f100i);
            this.f101j = C0174c.m1328a(typedArray, xmlPullParser, "translateY", 7, this.f101j);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f104m = string;
            }
            m93a();
        }

        /* JADX INFO: renamed from: a */
        public void m96a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayM1330a = C0174c.m1330a(resources, theme, attributeSet, C0012a.f40b);
            m94a(typedArrayM1330a, xmlPullParser);
            typedArrayM1330a.recycle();
        }

        public String getGroupName() {
            return this.f104m;
        }

        public Matrix getLocalMatrix() {
            return this.f102k;
        }

        public float getPivotX() {
            return this.f96e;
        }

        public float getPivotY() {
            return this.f97f;
        }

        public float getRotation() {
            return this.f93b;
        }

        public float getScaleX() {
            return this.f98g;
        }

        public float getScaleY() {
            return this.f99h;
        }

        public float getTranslateX() {
            return this.f100i;
        }

        public float getTranslateY() {
            return this.f101j;
        }

        public void setPivotX(float f) {
            if (f != this.f96e) {
                this.f96e = f;
                m93a();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f97f) {
                this.f97f = f;
                m93a();
            }
        }

        public void setRotation(float f) {
            if (f != this.f93b) {
                this.f93b = f;
                m93a();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f98g) {
                this.f98g = f;
                m93a();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f99h) {
                this.f99h = f;
                m93a();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f100i) {
                this.f100i = f;
                m93a();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f101j) {
                this.f101j = f;
                m93a();
            }
        }
    }

    /* JADX INFO: renamed from: android.support.b.a.i$d */
    private static class d {

        /* JADX INFO: renamed from: m */
        protected C0187b.b[] f105m;

        /* JADX INFO: renamed from: n */
        String f106n;

        /* JADX INFO: renamed from: o */
        int f107o;

        public d() {
            this.f105m = null;
        }

        public d(d dVar) {
            this.f105m = null;
            this.f106n = dVar.f106n;
            this.f107o = dVar.f107o;
            this.f105m = C0187b.m1417a(dVar.f105m);
        }

        /* JADX INFO: renamed from: a */
        public void m97a(Path path) {
            path.reset();
            if (this.f105m != null) {
                C0187b.b.m1424a(this.f105m, path);
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean mo87a() {
            return false;
        }

        public C0187b.b[] getPathData() {
            return this.f105m;
        }

        public String getPathName() {
            return this.f106n;
        }

        public void setPathData(C0187b.b[] bVarArr) {
            if (C0187b.m1415a(this.f105m, bVarArr)) {
                C0187b.m1418b(this.f105m, bVarArr);
            } else {
                this.f105m = C0187b.m1417a(bVarArr);
            }
        }
    }

    /* JADX INFO: renamed from: android.support.b.a.i$e */
    private static class e {

        /* JADX INFO: renamed from: k */
        private static final Matrix f108k = new Matrix();

        /* JADX INFO: renamed from: a */
        final c f109a;

        /* JADX INFO: renamed from: b */
        float f110b;

        /* JADX INFO: renamed from: c */
        float f111c;

        /* JADX INFO: renamed from: d */
        float f112d;

        /* JADX INFO: renamed from: e */
        float f113e;

        /* JADX INFO: renamed from: f */
        int f114f;

        /* JADX INFO: renamed from: g */
        String f115g;

        /* JADX INFO: renamed from: h */
        final C0207a<String, Object> f116h;

        /* JADX INFO: renamed from: i */
        private final Path f117i;

        /* JADX INFO: renamed from: j */
        private final Path f118j;

        /* JADX INFO: renamed from: l */
        private final Matrix f119l;

        /* JADX INFO: renamed from: m */
        private Paint f120m;

        /* JADX INFO: renamed from: n */
        private Paint f121n;

        /* JADX INFO: renamed from: o */
        private PathMeasure f122o;

        /* JADX INFO: renamed from: p */
        private int f123p;

        public e() {
            this.f119l = new Matrix();
            this.f110b = 0.0f;
            this.f111c = 0.0f;
            this.f112d = 0.0f;
            this.f113e = 0.0f;
            this.f114f = 255;
            this.f115g = null;
            this.f116h = new C0207a<>();
            this.f109a = new c();
            this.f117i = new Path();
            this.f118j = new Path();
        }

        public e(e eVar) {
            this.f119l = new Matrix();
            this.f110b = 0.0f;
            this.f111c = 0.0f;
            this.f112d = 0.0f;
            this.f113e = 0.0f;
            this.f114f = 255;
            this.f115g = null;
            this.f116h = new C0207a<>();
            this.f109a = new c(eVar.f109a, this.f116h);
            this.f117i = new Path(eVar.f117i);
            this.f118j = new Path(eVar.f118j);
            this.f110b = eVar.f110b;
            this.f111c = eVar.f111c;
            this.f112d = eVar.f112d;
            this.f113e = eVar.f113e;
            this.f123p = eVar.f123p;
            this.f114f = eVar.f114f;
            this.f115g = eVar.f115g;
            if (eVar.f115g != null) {
                this.f116h.put(eVar.f115g, this);
            }
        }

        /* JADX INFO: renamed from: a */
        private static float m98a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* JADX INFO: renamed from: a */
        private float m99a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fM98a = m98a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fM98a) / fMax;
            }
            return 0.0f;
        }

        /* JADX INFO: renamed from: a */
        private void m102a(c cVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            cVar.f95d.set(matrix);
            cVar.f95d.preConcat(cVar.f102k);
            canvas.save();
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= cVar.f92a.size()) {
                    canvas.restore();
                    return;
                }
                Object obj = cVar.f92a.get(i4);
                if (obj instanceof c) {
                    m102a((c) obj, cVar.f95d, canvas, i, i2, colorFilter);
                } else if (obj instanceof d) {
                    m103a(cVar, (d) obj, canvas, i, i2, colorFilter);
                }
                i3 = i4 + 1;
            }
        }

        /* JADX INFO: renamed from: a */
        private void m103a(c cVar, d dVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.f112d;
            float f2 = i2 / this.f113e;
            float fMin = Math.min(f, f2);
            Matrix matrix = cVar.f95d;
            this.f119l.set(matrix);
            this.f119l.postScale(f, f2);
            float fM99a = m99a(matrix);
            if (fM99a == 0.0f) {
                return;
            }
            dVar.m97a(this.f117i);
            Path path = this.f117i;
            this.f118j.reset();
            if (dVar.mo87a()) {
                this.f118j.addPath(path, this.f119l);
                canvas.clipPath(this.f118j);
                return;
            }
            b bVar = (b) dVar;
            if (bVar.f85g != 0.0f || bVar.f86h != 1.0f) {
                float f3 = (bVar.f85g + bVar.f87i) % 1.0f;
                float f4 = (bVar.f86h + bVar.f87i) % 1.0f;
                if (this.f122o == null) {
                    this.f122o = new PathMeasure();
                }
                this.f122o.setPath(this.f117i, false);
                float length = this.f122o.getLength();
                float f5 = f3 * length;
                float f6 = f4 * length;
                path.reset();
                if (f5 > f6) {
                    this.f122o.getSegment(f5, length, path, true);
                    this.f122o.getSegment(0.0f, f6, path, true);
                } else {
                    this.f122o.getSegment(f5, f6, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f118j.addPath(path, this.f119l);
            if (bVar.f81c != 0) {
                if (this.f121n == null) {
                    this.f121n = new Paint();
                    this.f121n.setStyle(Paint.Style.FILL);
                    this.f121n.setAntiAlias(true);
                }
                Paint paint = this.f121n;
                paint.setColor(C0020i.m75a(bVar.f81c, bVar.f84f));
                paint.setColorFilter(colorFilter);
                this.f118j.setFillType(bVar.f83e == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f118j, paint);
            }
            if (bVar.f79a != 0) {
                if (this.f120m == null) {
                    this.f120m = new Paint();
                    this.f120m.setStyle(Paint.Style.STROKE);
                    this.f120m.setAntiAlias(true);
                }
                Paint paint2 = this.f120m;
                if (bVar.f89k != null) {
                    paint2.setStrokeJoin(bVar.f89k);
                }
                if (bVar.f88j != null) {
                    paint2.setStrokeCap(bVar.f88j);
                }
                paint2.setStrokeMiter(bVar.f90l);
                paint2.setColor(C0020i.m75a(bVar.f79a, bVar.f82d));
                paint2.setColorFilter(colorFilter);
                paint2.setStrokeWidth(fM99a * fMin * bVar.f80b);
                canvas.drawPath(this.f118j, paint2);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m106a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m102a(this.f109a, f108k, canvas, i, i2, colorFilter);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f114f;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (255.0f * f));
        }

        public void setRootAlpha(int i) {
            this.f114f = i;
        }
    }

    /* JADX INFO: renamed from: android.support.b.a.i$f */
    private static class f extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        int f124a;

        /* JADX INFO: renamed from: b */
        e f125b;

        /* JADX INFO: renamed from: c */
        ColorStateList f126c;

        /* JADX INFO: renamed from: d */
        PorterDuff.Mode f127d;

        /* JADX INFO: renamed from: e */
        boolean f128e;

        /* JADX INFO: renamed from: f */
        Bitmap f129f;

        /* JADX INFO: renamed from: g */
        ColorStateList f130g;

        /* JADX INFO: renamed from: h */
        PorterDuff.Mode f131h;

        /* JADX INFO: renamed from: i */
        int f132i;

        /* JADX INFO: renamed from: j */
        boolean f133j;

        /* JADX INFO: renamed from: k */
        boolean f134k;

        /* JADX INFO: renamed from: l */
        Paint f135l;

        public f() {
            this.f126c = null;
            this.f127d = C0020i.f69a;
            this.f125b = new e();
        }

        public f(f fVar) {
            this.f126c = null;
            this.f127d = C0020i.f69a;
            if (fVar != null) {
                this.f124a = fVar.f124a;
                this.f125b = new e(fVar.f125b);
                if (fVar.f125b.f121n != null) {
                    this.f125b.f121n = new Paint(fVar.f125b.f121n);
                }
                if (fVar.f125b.f120m != null) {
                    this.f125b.f120m = new Paint(fVar.f125b.f120m);
                }
                this.f126c = fVar.f126c;
                this.f127d = fVar.f127d;
                this.f128e = fVar.f128e;
            }
        }

        /* JADX INFO: renamed from: a */
        public Paint m107a(ColorFilter colorFilter) {
            if (!m110a() && colorFilter == null) {
                return null;
            }
            if (this.f135l == null) {
                this.f135l = new Paint();
                this.f135l.setFilterBitmap(true);
            }
            this.f135l.setAlpha(this.f125b.getRootAlpha());
            this.f135l.setColorFilter(colorFilter);
            return this.f135l;
        }

        /* JADX INFO: renamed from: a */
        public void m108a(int i, int i2) {
            this.f129f.eraseColor(0);
            this.f125b.m106a(new Canvas(this.f129f), i, i2, (ColorFilter) null);
        }

        /* JADX INFO: renamed from: a */
        public void m109a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f129f, (Rect) null, rect, m107a(colorFilter));
        }

        /* JADX INFO: renamed from: a */
        public boolean m110a() {
            return this.f125b.getRootAlpha() < 255;
        }

        /* JADX INFO: renamed from: b */
        public void m111b(int i, int i2) {
            if (this.f129f == null || !m114c(i, i2)) {
                this.f129f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f134k = true;
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m112b() {
            return !this.f134k && this.f130g == this.f126c && this.f131h == this.f127d && this.f133j == this.f128e && this.f132i == this.f125b.getRootAlpha();
        }

        /* JADX INFO: renamed from: c */
        public void m113c() {
            this.f130g = this.f126c;
            this.f131h = this.f127d;
            this.f132i = this.f125b.getRootAlpha();
            this.f133j = this.f128e;
            this.f134k = false;
        }

        /* JADX INFO: renamed from: c */
        public boolean m114c(int i, int i2) {
            return i == this.f129f.getWidth() && i2 == this.f129f.getHeight();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f124a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0020i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0020i(this);
        }
    }

    /* JADX INFO: renamed from: android.support.b.a.i$g */
    private static class g extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        private final Drawable.ConstantState f136a;

        public g(Drawable.ConstantState constantState) {
            this.f136a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f136a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f136a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0020i c0020i = new C0020i();
            c0020i.f68b = (VectorDrawable) this.f136a.newDrawable();
            return c0020i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0020i c0020i = new C0020i();
            c0020i.f68b = (VectorDrawable) this.f136a.newDrawable(resources);
            return c0020i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0020i c0020i = new C0020i();
            c0020i.f68b = (VectorDrawable) this.f136a.newDrawable(resources, theme);
            return c0020i;
        }
    }

    C0020i() {
        this.f74g = true;
        this.f76i = new float[9];
        this.f77j = new Matrix();
        this.f78k = new Rect();
        this.f70c = new f();
    }

    C0020i(f fVar) {
        this.f74g = true;
        this.f76i = new float[9];
        this.f77j = new Matrix();
        this.f78k = new Rect();
        this.f70c = fVar;
        this.f71d = m82a(this.f71d, fVar.f126c, fVar.f127d);
    }

    /* JADX INFO: renamed from: a */
    static int m75a(int i, float f2) {
        return (((int) (Color.alpha(i) * f2)) << 24) | (16777215 & i);
    }

    /* JADX INFO: renamed from: a */
    private static PorterDuff.Mode m76a(int i, PorterDuff.Mode mode) {
        switch (i) {
            case 3:
                return PorterDuff.Mode.SRC_OVER;
            case 4:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            default:
                return mode;
            case 5:
                return PorterDuff.Mode.SRC_IN;
            case 9:
                return PorterDuff.Mode.SRC_ATOP;
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return Build.VERSION.SDK_INT >= 11 ? PorterDuff.Mode.ADD : mode;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0020i m77a(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C0020i c0020i = new C0020i();
            c0020i.f68b = C0173b.m1323a(resources, i, theme);
            c0020i.f75h = new g(c0020i.f68b.getConstantState());
            return c0020i;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            return m78a(resources, xml, attributeSetAsAttributeSet, theme);
        } catch (IOException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        } catch (XmlPullParserException e3) {
            Log.e("VectorDrawableCompat", "parser error", e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0020i m78a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C0020i c0020i = new C0020i();
        c0020i.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0020i;
    }

    /* JADX INFO: renamed from: a */
    private void m79a(TypedArray typedArray, XmlPullParser xmlPullParser) throws XmlPullParserException {
        f fVar = this.f70c;
        e eVar = fVar.f125b;
        fVar.f127d = m76a(C0174c.m1329a(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            fVar.f126c = colorStateList;
        }
        fVar.f128e = C0174c.m1332a(typedArray, xmlPullParser, "autoMirrored", 5, fVar.f128e);
        eVar.f112d = C0174c.m1328a(typedArray, xmlPullParser, "viewportWidth", 7, eVar.f112d);
        eVar.f113e = C0174c.m1328a(typedArray, xmlPullParser, "viewportHeight", 8, eVar.f113e);
        if (eVar.f112d <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (eVar.f113e <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        eVar.f110b = typedArray.getDimension(3, eVar.f110b);
        eVar.f111c = typedArray.getDimension(2, eVar.f111c);
        if (eVar.f110b <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (eVar.f111c <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        eVar.setAlpha(C0174c.m1328a(typedArray, xmlPullParser, "alpha", 4, eVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            eVar.f115g = string;
            eVar.f116h.put(string, eVar);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m80a() {
        if (Build.VERSION.SDK_INT >= 17) {
            return isAutoMirrored() && C0181a.m1401g(this) == 1;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private void m81b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        boolean z;
        f fVar = this.f70c;
        e eVar = fVar.f125b;
        Stack stack = new Stack();
        stack.push(eVar.f109a);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                c cVar = (c) stack.peek();
                if ("path".equals(name)) {
                    b bVar = new b();
                    bVar.m91a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f92a.add(bVar);
                    if (bVar.getPathName() != null) {
                        eVar.f116h.put(bVar.getPathName(), bVar);
                    }
                    z = false;
                    fVar.f124a = bVar.f107o | fVar.f124a;
                } else if ("clip-path".equals(name)) {
                    a aVar = new a();
                    aVar.m86a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f92a.add(aVar);
                    if (aVar.getPathName() != null) {
                        eVar.f116h.put(aVar.getPathName(), aVar);
                    }
                    fVar.f124a |= aVar.f107o;
                    z = z2;
                } else {
                    if ("group".equals(name)) {
                        c cVar2 = new c();
                        cVar2.m96a(resources, attributeSet, theme, xmlPullParser);
                        cVar.f92a.add(cVar2);
                        stack.push(cVar2);
                        if (cVar2.getGroupName() != null) {
                            eVar.f116h.put(cVar2.getGroupName(), cVar2);
                        }
                        fVar.f124a |= cVar2.f94c;
                    }
                    z = z2;
                }
                z2 = z;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                stack.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z2) {
            StringBuffer stringBuffer = new StringBuffer();
            if (stringBuffer.length() > 0) {
                stringBuffer.append(" or ");
            }
            stringBuffer.append("path");
            throw new XmlPullParserException("no " + ((Object) stringBuffer) + " defined");
        }
    }

    /* JADX INFO: renamed from: a */
    PorterDuffColorFilter m82a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX INFO: renamed from: a */
    Object m83a(String str) {
        return this.f70c.f125b.f116h.get(str);
    }

    /* JADX INFO: renamed from: a */
    void m84a(boolean z) {
        this.f74g = z;
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        if (this.f68b == null) {
            return false;
        }
        C0181a.m1398d(this.f68b);
        return false;
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f68b != null) {
            this.f68b.draw(canvas);
            return;
        }
        copyBounds(this.f78k);
        if (this.f78k.width() <= 0 || this.f78k.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f72e == null ? this.f71d : this.f72e;
        canvas.getMatrix(this.f77j);
        this.f77j.getValues(this.f76i);
        float fAbs = Math.abs(this.f76i[0]);
        float fAbs2 = Math.abs(this.f76i[4]);
        float fAbs3 = Math.abs(this.f76i[1]);
        float fAbs4 = Math.abs(this.f76i[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs2 = 1.0f;
            fAbs = 1.0f;
        }
        int iMin = Math.min(2048, (int) (fAbs * this.f78k.width()));
        int iMin2 = Math.min(2048, (int) (fAbs2 * this.f78k.height()));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f78k.left, this.f78k.top);
        if (m80a()) {
            canvas.translate(this.f78k.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f78k.offsetTo(0, 0);
        this.f70c.m111b(iMin, iMin2);
        if (!this.f74g) {
            this.f70c.m108a(iMin, iMin2);
        } else if (!this.f70c.m112b()) {
            this.f70c.m108a(iMin, iMin2);
            this.f70c.m113c();
        }
        this.f70c.m109a(canvas, colorFilter, this.f78k);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f68b != null ? C0181a.m1397c(this.f68b) : this.f70c.f125b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f68b != null ? this.f68b.getChangingConfigurations() : super.getChangingConfigurations() | this.f70c.getChangingConfigurations();
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f68b != null && Build.VERSION.SDK_INT >= 24) {
            return new g(this.f68b.getConstantState());
        }
        this.f70c.f124a = getChangingConfigurations();
        return this.f70c;
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f68b != null ? this.f68b.getIntrinsicHeight() : (int) this.f70c.f125b.f111c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f68b != null ? this.f68b.getIntrinsicWidth() : (int) this.f70c.f125b.f110b;
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f68b != null) {
            return this.f68b.getOpacity();
        }
        return -3;
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        if (this.f68b != null) {
            this.f68b.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        if (this.f68b != null) {
            C0181a.m1392a(this.f68b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        f fVar = this.f70c;
        fVar.f125b = new e();
        TypedArray typedArrayM1330a = C0174c.m1330a(resources, theme, attributeSet, C0012a.f39a);
        m79a(typedArrayM1330a, xmlPullParser);
        typedArrayM1330a.recycle();
        fVar.f124a = getChangingConfigurations();
        fVar.f134k = true;
        m81b(resources, xmlPullParser, attributeSet, theme);
        this.f71d = m82a(this.f71d, fVar.f126c, fVar.f127d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f68b != null) {
            this.f68b.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f68b != null ? C0181a.m1395b(this.f68b) : this.f70c.f128e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f68b != null ? this.f68b.isStateful() : super.isStateful() || !(this.f70c == null || this.f70c.f126c == null || !this.f70c.f126c.isStateful());
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (this.f68b != null) {
            this.f68b.mutate();
        } else if (!this.f73f && super.mutate() == this) {
            this.f70c = new f(this.f70c);
            this.f73f = true;
        }
        return this;
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.f68b != null) {
            this.f68b.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        if (this.f68b != null) {
            return this.f68b.setState(iArr);
        }
        f fVar = this.f70c;
        if (fVar.f126c == null || fVar.f127d == null) {
            return false;
        }
        this.f71d = m82a(this.f71d, fVar.f126c, fVar.f127d);
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        if (this.f68b != null) {
            this.f68b.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f68b != null) {
            this.f68b.setAlpha(i);
        } else if (this.f70c.f125b.getRootAlpha() != i) {
            this.f70c.f125b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.f68b != null) {
            C0181a.m1394a(this.f68b, z);
        } else {
            this.f70c.f128e = z;
        }
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f68b != null) {
            this.f68b.setColorFilter(colorFilter);
        } else {
            this.f72e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.p009c.p010a.InterfaceC0186f
    public void setTint(int i) {
        if (this.f68b != null) {
            C0181a.m1388a(this.f68b, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.p009c.p010a.InterfaceC0186f
    public void setTintList(ColorStateList colorStateList) {
        if (this.f68b != null) {
            C0181a.m1390a(this.f68b, colorStateList);
            return;
        }
        f fVar = this.f70c;
        if (fVar.f126c != colorStateList) {
            fVar.f126c = colorStateList;
            this.f71d = m82a(this.f71d, colorStateList, fVar.f127d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.p009c.p010a.InterfaceC0186f
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f68b != null) {
            C0181a.m1393a(this.f68b, mode);
            return;
        }
        f fVar = this.f70c;
        if (fVar.f127d != mode) {
            fVar.f127d = mode;
            this.f71d = m82a(this.f71d, fVar.f126c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return this.f68b != null ? this.f68b.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        if (this.f68b != null) {
            this.f68b.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
