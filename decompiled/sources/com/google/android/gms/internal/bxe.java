package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.C0651a;
import com.google.android.gms.ads.C0681d;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bxe {

    /* JADX INFO: renamed from: a */
    private final C0681d[] f9258a;

    /* JADX INFO: renamed from: b */
    private final String f9259b;

    public bxe(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C0651a.e.AdsAttrs);
        String string = typedArrayObtainAttributes.getString(C0651a.e.AdsAttrs_adSize);
        String string2 = typedArrayObtainAttributes.getString(C0651a.e.AdsAttrs_adSizes);
        boolean z = !TextUtils.isEmpty(string);
        boolean z2 = TextUtils.isEmpty(string2) ? false : true;
        if (z && !z2) {
            this.f9258a = m10386a(string);
        } else {
            if (z || !z2) {
                if (!z) {
                    throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
                }
                throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
            }
            this.f9258a = m10386a(string2);
        }
        this.f9259b = typedArrayObtainAttributes.getString(C0651a.e.AdsAttrs_adUnitId);
        if (TextUtils.isEmpty(this.f9259b)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    /* JADX INFO: renamed from: a */
    private static C0681d[] m10386a(String str) {
        String[] strArrSplit = str.split("\\s*,\\s*");
        C0681d[] c0681dArr = new C0681d[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            String strTrim = strArrSplit[i].trim();
            if (strTrim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] strArrSplit2 = strTrim.split("[xX]");
                strArrSplit2[0] = strArrSplit2[0].trim();
                strArrSplit2[1] = strArrSplit2[1].trim();
                try {
                    c0681dArr[i] = new C0681d("FULL_WIDTH".equals(strArrSplit2[0]) ? -1 : Integer.parseInt(strArrSplit2[0]), "AUTO_HEIGHT".equals(strArrSplit2[1]) ? -2 : Integer.parseInt(strArrSplit2[1]));
                } catch (NumberFormatException e) {
                    String strValueOf = String.valueOf(strTrim);
                    throw new IllegalArgumentException(strValueOf.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(strValueOf) : new String("Could not parse XML attribute \"adSize\": "));
                }
            } else if ("BANNER".equals(strTrim)) {
                c0681dArr[i] = C0681d.f4380a;
            } else if ("LARGE_BANNER".equals(strTrim)) {
                c0681dArr[i] = C0681d.f4382c;
            } else if ("FULL_BANNER".equals(strTrim)) {
                c0681dArr[i] = C0681d.f4381b;
            } else if ("LEADERBOARD".equals(strTrim)) {
                c0681dArr[i] = C0681d.f4383d;
            } else if ("MEDIUM_RECTANGLE".equals(strTrim)) {
                c0681dArr[i] = C0681d.f4384e;
            } else if ("SMART_BANNER".equals(strTrim)) {
                c0681dArr[i] = C0681d.f4386g;
            } else if ("WIDE_SKYSCRAPER".equals(strTrim)) {
                c0681dArr[i] = C0681d.f4385f;
            } else if ("FLUID".equals(strTrim)) {
                c0681dArr[i] = C0681d.f4387h;
            } else {
                if (!"ICON".equals(strTrim)) {
                    String strValueOf2 = String.valueOf(strTrim);
                    throw new IllegalArgumentException(strValueOf2.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(strValueOf2) : new String("Could not parse XML attribute \"adSize\": "));
                }
                c0681dArr[i] = C0681d.f4388i;
            }
        }
        if (c0681dArr.length != 0) {
            return c0681dArr;
        }
        String strValueOf3 = String.valueOf(str);
        throw new IllegalArgumentException(strValueOf3.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(strValueOf3) : new String("Could not parse XML attribute \"adSize\": "));
    }

    /* JADX INFO: renamed from: a */
    public final String m10387a() {
        return this.f9259b;
    }

    /* JADX INFO: renamed from: a */
    public final C0681d[] m10388a(boolean z) {
        if (z || this.f9258a.length == 1) {
            return this.f9258a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
