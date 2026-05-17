package android.support.v4.p007b.p008a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.p002a.C0011a;
import android.support.v4.p017h.C0204a;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: android.support.v4.b.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0172a {

    /* JADX INFO: renamed from: android.support.v4.b.a.a$a */
    public interface a {
    }

    /* JADX INFO: renamed from: android.support.v4.b.a.a$b */
    public static final class b implements a {

        /* JADX INFO: renamed from: a */
        private final c[] f1074a;

        public b(c[] cVarArr) {
            this.f1074a = cVarArr;
        }

        /* JADX INFO: renamed from: a */
        public c[] m1312a() {
            return this.f1074a;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.b.a.a$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        private final String f1075a;

        /* JADX INFO: renamed from: b */
        private int f1076b;

        /* JADX INFO: renamed from: c */
        private boolean f1077c;

        /* JADX INFO: renamed from: d */
        private int f1078d;

        public c(String str, int i, boolean z, int i2) {
            this.f1075a = str;
            this.f1076b = i;
            this.f1077c = z;
            this.f1078d = i2;
        }

        /* JADX INFO: renamed from: a */
        public String m1313a() {
            return this.f1075a;
        }

        /* JADX INFO: renamed from: b */
        public int m1314b() {
            return this.f1076b;
        }

        /* JADX INFO: renamed from: c */
        public boolean m1315c() {
            return this.f1077c;
        }

        /* JADX INFO: renamed from: d */
        public int m1316d() {
            return this.f1078d;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.b.a.a$d */
    public static final class d implements a {

        /* JADX INFO: renamed from: a */
        private final C0204a f1079a;

        /* JADX INFO: renamed from: b */
        private final int f1080b;

        /* JADX INFO: renamed from: c */
        private final int f1081c;

        public d(C0204a c0204a, int i, int i2) {
            this.f1079a = c0204a;
            this.f1081c = i;
            this.f1080b = i2;
        }

        /* JADX INFO: renamed from: a */
        public C0204a m1317a() {
            return this.f1079a;
        }

        /* JADX INFO: renamed from: b */
        public int m1318b() {
            return this.f1081c;
        }

        /* JADX INFO: renamed from: c */
        public int m1319c() {
            return this.f1080b;
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m1305a(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        return m1309b(xmlPullParser, resources);
    }

    /* JADX INFO: renamed from: a */
    public static List<List<byte[]>> m1306a(Resources resources, int i) {
        ArrayList arrayList = null;
        if (i != 0) {
            TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
            if (typedArrayObtainTypedArray.length() > 0) {
                ArrayList arrayList2 = new ArrayList();
                if (typedArrayObtainTypedArray.getResourceId(0, 0) != 0) {
                    for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                        arrayList2.add(m1307a(resources.getStringArray(typedArrayObtainTypedArray.getResourceId(i2, 0))));
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList2.add(m1307a(resources.getStringArray(i)));
                    arrayList = arrayList2;
                }
            }
            typedArrayObtainTypedArray.recycle();
        }
        return arrayList != null ? arrayList : Collections.emptyList();
    }

    /* JADX INFO: renamed from: a */
    private static List<byte[]> m1307a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private static void m1308a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            switch (xmlPullParser.next()) {
                case 2:
                    i++;
                    break;
                case 3:
                    i--;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static a m1309b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m1310c(xmlPullParser, resources);
        }
        m1308a(xmlPullParser);
        return null;
    }

    /* JADX INFO: renamed from: c */
    private static a m1310c(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0011a.b.FontFamily);
        String string = typedArrayObtainAttributes.getString(C0011a.b.FontFamily_fontProviderAuthority);
        String string2 = typedArrayObtainAttributes.getString(C0011a.b.FontFamily_fontProviderPackage);
        String string3 = typedArrayObtainAttributes.getString(C0011a.b.FontFamily_fontProviderQuery);
        int resourceId = typedArrayObtainAttributes.getResourceId(C0011a.b.FontFamily_fontProviderCerts, 0);
        int integer = typedArrayObtainAttributes.getInteger(C0011a.b.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(C0011a.b.FontFamily_fontProviderFetchTimeout, 500);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m1308a(xmlPullParser);
            }
            return new d(new C0204a(string, string2, string3, m1306a(resources, resourceId)), integer, integer2);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(m1311d(xmlPullParser, resources));
                } else {
                    m1308a(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b((c[]) arrayList.toArray(new c[arrayList.size()]));
    }

    /* JADX INFO: renamed from: d */
    private static c m1311d(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0011a.b.FontFamilyFont);
        int i = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(C0011a.b.FontFamilyFont_fontWeight) ? C0011a.b.FontFamilyFont_fontWeight : C0011a.b.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(C0011a.b.FontFamilyFont_fontStyle) ? C0011a.b.FontFamilyFont_fontStyle : C0011a.b.FontFamilyFont_android_fontStyle, 0);
        int i2 = typedArrayObtainAttributes.hasValue(C0011a.b.FontFamilyFont_font) ? C0011a.b.FontFamilyFont_font : C0011a.b.FontFamilyFont_android_font;
        int resourceId = typedArrayObtainAttributes.getResourceId(i2, 0);
        String string = typedArrayObtainAttributes.getString(i2);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m1308a(xmlPullParser);
        }
        return new c(string, i, z, resourceId);
    }
}
