package android.support.v7.p023b.p024a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v4.p009c.C0180a;
import android.support.v7.p022a.C0333a;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: android.support.v7.b.a.a */
/* JADX INFO: loaded from: classes.dex */
final class C0365a {
    /* JADX INFO: renamed from: a */
    private static int m2782a(int i, float f) {
        return C0180a.m1384c(i, Math.round(Color.alpha(i) * f));
    }

    /* JADX INFO: renamed from: a */
    public static ColorStateList m2783a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        return m2784a(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
    }

    /* JADX INFO: renamed from: a */
    private static ColorStateList m2784a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m2786b(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* JADX INFO: renamed from: a */
    private static TypedArray m2785a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX INFO: renamed from: b */
    private static ColorStateList m2786b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int i;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[][] iArr2 = iArr;
        int i2 = 0;
        int[] iArr3 = new int[iArr.length];
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayM2785a = m2785a(resources, theme, attributeSet, C0333a.j.ColorStateListItem);
                int color = typedArrayM2785a.getColor(C0333a.j.ColorStateListItem_android_color, -65281);
                float f = 1.0f;
                if (typedArrayM2785a.hasValue(C0333a.j.ColorStateListItem_android_alpha)) {
                    f = typedArrayM2785a.getFloat(C0333a.j.ColorStateListItem_android_alpha, 1.0f);
                } else if (typedArrayM2785a.hasValue(C0333a.j.ColorStateListItem_alpha)) {
                    f = typedArrayM2785a.getFloat(C0333a.j.ColorStateListItem_alpha, 1.0f);
                }
                typedArrayM2785a.recycle();
                int i3 = 0;
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr4 = new int[attributeCount];
                int i4 = 0;
                while (i4 < attributeCount) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                    if (attributeNameResource == 16843173 || attributeNameResource == 16843551 || attributeNameResource == C0333a.a.alpha) {
                        i = i3;
                    } else {
                        int i5 = i3 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr4[i3] = attributeNameResource;
                        i = i5;
                    }
                    i4++;
                    i3 = i;
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i3);
                int iM2782a = m2782a(color, f);
                if (i2 == 0 || iArrTrimStateSet.length == 0) {
                }
                int[] iArrM2795a = C0367c.m2795a(iArr3, i2, iM2782a);
                int[][] iArr5 = (int[][]) C0367c.m2796a(iArr2, i2, iArrTrimStateSet);
                i2++;
                iArr2 = iArr5;
                iArr3 = iArrM2795a;
            }
        }
        int[] iArr6 = new int[i2];
        int[][] iArr7 = new int[i2][];
        System.arraycopy(iArr3, 0, iArr6, 0, i2);
        System.arraycopy(iArr2, 0, iArr7, 0, i2);
        return new ColorStateList(iArr7, iArr6);
    }
}
