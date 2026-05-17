package android.support.p003b.p004a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.support.v4.p007b.p008a.C0174c;
import android.support.v4.p009c.C0187b;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: android.support.b.a.e */
/* JADX INFO: loaded from: classes.dex */
public class C0016e {

    /* JADX INFO: renamed from: android.support.b.a.e$a */
    private static class a implements TypeEvaluator<C0187b.b[]> {

        /* JADX INFO: renamed from: a */
        private C0187b.b[] f64a;

        private a() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0187b.b[] evaluate(float f, C0187b.b[] bVarArr, C0187b.b[] bVarArr2) {
            if (!C0187b.m1415a(bVarArr, bVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (this.f64a == null || !C0187b.m1415a(this.f64a, bVarArr)) {
                this.f64a = C0187b.m1417a(bVarArr);
            }
            for (int i = 0; i < bVarArr.length; i++) {
                this.f64a[i].m1425a(bVarArr[i], bVarArr2[i], f);
            }
            return this.f64a;
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m50a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        int i = 0;
        TypedArray typedArrayM1330a = C0174c.m1330a(resources, theme, attributeSet, C0012a.f48j);
        TypedValue typedValueM1335b = C0174c.m1335b(typedArrayM1330a, xmlPullParser, "value", 0);
        if ((typedValueM1335b != null) && m67a(typedValueM1335b.type)) {
            i = 3;
        }
        typedArrayM1330a.recycle();
        return i;
    }

    /* JADX INFO: renamed from: a */
    private static int m51a(TypedArray typedArray, int i, int i2) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        boolean z = typedValuePeekValue != null;
        int i3 = z ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i2);
        boolean z2 = typedValuePeekValue2 != null;
        return ((z && m67a(i3)) || (z2 && m67a(z2 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
    }

    /* JADX INFO: renamed from: a */
    public static Animator m52a(Context context, int i) {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i) : m53a(context, context.getResources(), context.getTheme(), i);
    }

    /* JADX INFO: renamed from: a */
    public static Animator m53a(Context context, Resources resources, Resources.Theme theme, int i) {
        return m54a(context, resources, theme, i, 1.0f);
    }

    /* JADX INFO: renamed from: a */
    public static Animator m54a(Context context, Resources resources, Resources.Theme theme, int i, float f) {
        XmlResourceParser animation = null;
        try {
            try {
                try {
                    animation = resources.getAnimation(i);
                    return m55a(context, resources, theme, animation, f);
                } catch (IOException e) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                    notFoundException.initCause(e);
                    throw notFoundException;
                }
            } catch (XmlPullParserException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } finally {
            if (animation != null) {
                animation.close();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static Animator m55a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) {
        return m56a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e5, code lost:
    
        if (r22 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e7, code lost:
    
        if (r13 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e9, code lost:
    
        r8 = new android.animation.Animator[r13.size()];
        r9 = r13.iterator();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f9, code lost:
    
        if (r9.hasNext() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fb, code lost:
    
        r8[r6] = (android.animation.Animator) r9.next();
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0107, code lost:
    
        if (r23 != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0109, code lost:
    
        r22.playTogether(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010e, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010f, code lost:
    
        r22.playSequentially(r8);
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Animator m56a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i, float f) throws XmlPullParserException, IOException {
        boolean z;
        Animator animatorM62a = null;
        ArrayList arrayList = null;
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                break;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("objectAnimator")) {
                    animatorM62a = m59a(context, resources, theme, attributeSet, f, xmlPullParser);
                    z = false;
                } else if (name.equals("animator")) {
                    animatorM62a = m62a(context, resources, theme, attributeSet, null, f, xmlPullParser);
                    z = false;
                } else if (name.equals("set")) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    TypedArray typedArrayM1330a = C0174c.m1330a(resources, theme, attributeSet, C0012a.f46h);
                    m56a(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, C0174c.m1329a(typedArrayM1330a, xmlPullParser, "ordering", 0, 0), f);
                    typedArrayM1330a.recycle();
                    z = false;
                    animatorM62a = animatorSet2;
                } else {
                    if (!name.equals("propertyValuesHolder")) {
                        throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                    }
                    PropertyValuesHolder[] propertyValuesHolderArrM68a = m68a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser));
                    if (propertyValuesHolderArrM68a != null && animatorM62a != null && (animatorM62a instanceof ValueAnimator)) {
                        ((ValueAnimator) animatorM62a).setValues(propertyValuesHolderArrM68a);
                    }
                    z = true;
                }
                if (animatorSet != null && !z) {
                    ArrayList arrayList2 = arrayList == null ? new ArrayList() : arrayList;
                    arrayList2.add(animatorM62a);
                    arrayList = arrayList2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static Keyframe m57a(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    /* JADX INFO: renamed from: a */
    private static Keyframe m58a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) {
        TypedArray typedArrayM1330a = C0174c.m1330a(resources, theme, attributeSet, C0012a.f48j);
        Keyframe keyframeOfFloat = null;
        float fM1328a = C0174c.m1328a(typedArrayM1330a, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue typedValueM1335b = C0174c.m1335b(typedArrayM1330a, xmlPullParser, "value", 0);
        boolean z = typedValueM1335b != null;
        if (i == 4) {
            i = (z && m67a(typedValueM1335b.type)) ? 3 : 0;
        }
        if (z) {
            switch (i) {
                case 0:
                    keyframeOfFloat = Keyframe.ofFloat(fM1328a, C0174c.m1328a(typedArrayM1330a, xmlPullParser, "value", 0, 0.0f));
                    break;
                case 1:
                case 3:
                    keyframeOfFloat = Keyframe.ofInt(fM1328a, C0174c.m1329a(typedArrayM1330a, xmlPullParser, "value", 0, 0));
                    break;
            }
        } else {
            keyframeOfFloat = i == 0 ? Keyframe.ofFloat(fM1328a) : Keyframe.ofInt(fM1328a);
        }
        int iM1336c = C0174c.m1336c(typedArrayM1330a, xmlPullParser, "interpolator", 1, 0);
        if (iM1336c > 0) {
            keyframeOfFloat.setInterpolator(C0015d.m48a(context, iM1336c));
        }
        typedArrayM1330a.recycle();
        return keyframeOfFloat;
    }

    /* JADX INFO: renamed from: a */
    private static ObjectAnimator m59a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m62a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* JADX INFO: renamed from: a */
    private static PropertyValuesHolder m60a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i) throws XmlPullParserException, IOException {
        int size;
        int i2;
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        int iM50a = i;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (iM50a == 4) {
                    iM50a = m50a(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe keyframeM58a = m58a(context, resources, theme, Xml.asAttributeSet(xmlPullParser), iM50a, xmlPullParser);
                if (keyframeM58a != null) {
                    arrayList = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList.add(keyframeM58a);
                } else {
                    arrayList = arrayList2;
                }
                xmlPullParser.next();
            } else {
                arrayList = arrayList2;
            }
            arrayList2 = arrayList;
        }
        if (arrayList2 == null || (size = arrayList2.size()) <= 0) {
            return null;
        }
        Keyframe keyframe = (Keyframe) arrayList2.get(0);
        Keyframe keyframe2 = (Keyframe) arrayList2.get(size - 1);
        float fraction = keyframe2.getFraction();
        if (fraction >= 1.0f) {
            i2 = size;
        } else if (fraction < 0.0f) {
            keyframe2.setFraction(1.0f);
            i2 = size;
        } else {
            arrayList2.add(arrayList2.size(), m57a(keyframe2, 1.0f));
            i2 = size + 1;
        }
        float fraction2 = keyframe.getFraction();
        if (fraction2 != 0.0f) {
            if (fraction2 < 0.0f) {
                keyframe.setFraction(0.0f);
            } else {
                arrayList2.add(0, m57a(keyframe, 0.0f));
                i2++;
            }
        }
        Keyframe[] keyframeArr = new Keyframe[i2];
        arrayList2.toArray(keyframeArr);
        for (int i3 = 0; i3 < i2; i3++) {
            Keyframe keyframe3 = keyframeArr[i3];
            if (keyframe3.getFraction() < 0.0f) {
                if (i3 == 0) {
                    keyframe3.setFraction(0.0f);
                } else if (i3 == i2 - 1) {
                    keyframe3.setFraction(1.0f);
                } else {
                    int i4 = i3;
                    for (int i5 = i3 + 1; i5 < i2 - 1 && keyframeArr[i5].getFraction() < 0.0f; i5++) {
                        i4 = i5;
                    }
                    m66a(keyframeArr, keyframeArr[i4 + 1].getFraction() - keyframeArr[i3 - 1].getFraction(), i3, i4);
                }
            }
        }
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
        if (iM50a != 3) {
            return propertyValuesHolderOfKeyframe;
        }
        propertyValuesHolderOfKeyframe.setEvaluator(C0017f.m70a());
        return propertyValuesHolderOfKeyframe;
    }

    /* JADX INFO: renamed from: a */
    private static PropertyValuesHolder m61a(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder propertyValuesHolderOfInt;
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        boolean z = typedValuePeekValue != null;
        int i4 = z ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i3);
        boolean z2 = typedValuePeekValue2 != null;
        int i5 = z2 ? typedValuePeekValue2.type : 0;
        if (i == 4) {
            i = ((z && m67a(i4)) || (z2 && m67a(i5))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C0187b.b[] bVarArrM1419b = C0187b.m1419b(string);
            C0187b.b[] bVarArrM1419b2 = C0187b.m1419b(string2);
            if (bVarArrM1419b != null || bVarArrM1419b2 != null) {
                if (bVarArrM1419b != null) {
                    a aVar = new a();
                    if (bVarArrM1419b2 == null) {
                        return PropertyValuesHolder.ofObject(str, aVar, bVarArrM1419b);
                    }
                    if (C0187b.m1415a(bVarArrM1419b, bVarArrM1419b2)) {
                        return PropertyValuesHolder.ofObject(str, aVar, bVarArrM1419b, bVarArrM1419b2);
                    }
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                if (bVarArrM1419b2 != null) {
                    return PropertyValuesHolder.ofObject(str, new a(), bVarArrM1419b2);
                }
            }
            return null;
        }
        C0017f c0017fM70a = i == 3 ? C0017f.m70a() : null;
        if (z3) {
            if (z) {
                float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                if (z2) {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
            }
        } else if (z) {
            int dimension2 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : m67a(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
            if (z2) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m67a(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
            }
        } else if (z2) {
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m67a(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
        } else {
            propertyValuesHolderOfInt = null;
        }
        if (propertyValuesHolderOfInt == null || c0017fM70a == null) {
            return propertyValuesHolderOfInt;
        }
        propertyValuesHolderOfInt.setEvaluator(c0017fM70a);
        return propertyValuesHolderOfInt;
    }

    /* JADX INFO: renamed from: a */
    private static ValueAnimator m62a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray typedArrayM1330a = C0174c.m1330a(resources, theme, attributeSet, C0012a.f45g);
        TypedArray typedArrayM1330a2 = C0174c.m1330a(resources, theme, attributeSet, C0012a.f49k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m64a(valueAnimator, typedArrayM1330a, typedArrayM1330a2, f, xmlPullParser);
        int iM1336c = C0174c.m1336c(typedArrayM1330a, xmlPullParser, "interpolator", 0, 0);
        if (iM1336c > 0) {
            valueAnimator.setInterpolator(C0015d.m48a(context, iM1336c));
        }
        typedArrayM1330a.recycle();
        if (typedArrayM1330a2 != null) {
            typedArrayM1330a2.recycle();
        }
        return valueAnimator;
    }

    /* JADX INFO: renamed from: a */
    private static void m63a(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String strM1331a = C0174c.m1331a(typedArray, xmlPullParser, "pathData", 1);
        if (strM1331a == null) {
            objectAnimator.setPropertyName(C0174c.m1331a(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String strM1331a2 = C0174c.m1331a(typedArray, xmlPullParser, "propertyXName", 2);
        String strM1331a3 = C0174c.m1331a(typedArray, xmlPullParser, "propertyYName", 3);
        if (i == 2 || i == 4) {
        }
        if (strM1331a2 == null && strM1331a3 == null) {
            throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
        }
        m65a(C0187b.m1412a(strM1331a), objectAnimator, 0.5f * f, strM1331a2, strM1331a3);
    }

    /* JADX INFO: renamed from: a */
    private static void m64a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long jM1329a = C0174c.m1329a(typedArray, xmlPullParser, "duration", 1, 300);
        long jM1329a2 = C0174c.m1329a(typedArray, xmlPullParser, "startOffset", 2, 0);
        int iM1329a = C0174c.m1329a(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C0174c.m1333a(xmlPullParser, "valueFrom") && C0174c.m1333a(xmlPullParser, "valueTo")) {
            if (iM1329a == 4) {
                iM1329a = m51a(typedArray, 5, 6);
            }
            PropertyValuesHolder propertyValuesHolderM61a = m61a(typedArray, iM1329a, 5, 6, "");
            if (propertyValuesHolderM61a != null) {
                valueAnimator.setValues(propertyValuesHolderM61a);
            }
        }
        valueAnimator.setDuration(jM1329a);
        valueAnimator.setStartDelay(jM1329a2);
        valueAnimator.setRepeatCount(C0174c.m1329a(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C0174c.m1329a(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m63a(valueAnimator, typedArray2, iM1329a, f, xmlPullParser);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m65a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        int i;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = 0.0f;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(0.0f));
        do {
            length += pathMeasure.getLength();
            arrayList.add(Float.valueOf(length));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int iMin = Math.min(100, ((int) (length / f)) + 1);
        float[] fArr = new float[iMin];
        float[] fArr2 = new float[iMin];
        float[] fArr3 = new float[2];
        int i2 = 0;
        float f2 = length / (iMin - 1);
        int i3 = 0;
        float fFloatValue = 0.0f;
        while (i3 < iMin) {
            pathMeasure2.getPosTan(fFloatValue, fArr3, null);
            pathMeasure2.getPosTan(fFloatValue, fArr3, null);
            fArr[i3] = fArr3[0];
            fArr2[i3] = fArr3[1];
            float f3 = fFloatValue + f2;
            if (i2 + 1 >= arrayList.size() || f3 <= ((Float) arrayList.get(i2 + 1)).floatValue()) {
                fFloatValue = f3;
                i = i2;
            } else {
                fFloatValue = f3 - ((Float) arrayList.get(i2 + 1)).floatValue();
                i = i2 + 1;
                pathMeasure2.nextContour();
            }
            i3++;
            i2 = i;
        }
        PropertyValuesHolder propertyValuesHolderOfFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder propertyValuesHolderOfFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (propertyValuesHolderOfFloat == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat2);
        } else if (propertyValuesHolderOfFloat2 == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat);
        } else {
            objectAnimator.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m66a(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((i2 - i) + 2);
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m67a(int i) {
        return i >= 28 && i <= 31;
    }

    /* JADX INFO: renamed from: a */
    private static PropertyValuesHolder[] m68a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray typedArrayM1330a = C0174c.m1330a(resources, theme, attributeSet, C0012a.f47i);
                    String strM1331a = C0174c.m1331a(typedArrayM1330a, xmlPullParser, "propertyName", 3);
                    int iM1329a = C0174c.m1329a(typedArrayM1330a, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder propertyValuesHolderM60a = m60a(context, resources, theme, xmlPullParser, strM1331a, iM1329a);
                    PropertyValuesHolder propertyValuesHolderM61a = propertyValuesHolderM60a == null ? m61a(typedArrayM1330a, iM1329a, 0, 1, strM1331a) : propertyValuesHolderM60a;
                    if (propertyValuesHolderM61a != null) {
                        arrayList = arrayList2 == null ? new ArrayList() : arrayList2;
                        arrayList.add(propertyValuesHolderM61a);
                    } else {
                        arrayList = arrayList2;
                    }
                    typedArrayM1330a.recycle();
                } else {
                    arrayList = arrayList2;
                }
                xmlPullParser.next();
                arrayList2 = arrayList;
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        int size = arrayList2.size();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[size];
        for (int i = 0; i < size; i++) {
            propertyValuesHolderArr[i] = (PropertyValuesHolder) arrayList2.get(i);
        }
        return propertyValuesHolderArr;
    }
}
