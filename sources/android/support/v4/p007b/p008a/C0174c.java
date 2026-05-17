package android.support.v4.p007b.p008a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: android.support.v4.b.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C0174c {
    /* JADX INFO: renamed from: a */
    public static float m1328a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m1333a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* JADX INFO: renamed from: a */
    public static int m1329a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m1333a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public static TypedArray m1330a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX INFO: renamed from: a */
    public static String m1331a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m1333a(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1332a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !m1333a(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1333a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX INFO: renamed from: b */
    public static int m1334b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m1333a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public static TypedValue m1335b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m1333a(xmlPullParser, str)) {
            return typedArray.peekValue(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static int m1336c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m1333a(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }
}
