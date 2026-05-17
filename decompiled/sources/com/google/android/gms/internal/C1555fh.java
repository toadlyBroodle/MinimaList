package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0710au;
import java.math.BigInteger;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.fh */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1555fh {

    /* JADX INFO: renamed from: a */
    private static final Object f10647a = new Object();

    /* JADX INFO: renamed from: b */
    private static String f10648b;

    /* JADX INFO: renamed from: a */
    public static String m11338a() {
        String str;
        synchronized (f10647a) {
            str = f10648b;
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public static String m11339a(Context context, String str, String str2) {
        String str3;
        synchronized (f10647a) {
            if (f10648b != null || TextUtils.isEmpty(str)) {
                str3 = f10648b;
            } else {
                try {
                    ClassLoader classLoader = context.createPackageContext(str2, 3).getClassLoader();
                    Class<?> cls = Class.forName("com.google.ads.mediation.MediationAdapter", false, classLoader);
                    BigInteger bigInteger = new BigInteger(new byte[1]);
                    String[] strArrSplit = str.split(",");
                    BigInteger bit = bigInteger;
                    for (int i = 0; i < strArrSplit.length; i++) {
                        C0710au.m5569e();
                        if (C1596gv.m11403a(classLoader, cls, strArrSplit[i])) {
                            bit = bit.setBit(i);
                        }
                    }
                    f10648b = String.format(Locale.US, "%X", bit);
                } catch (Throwable th) {
                    f10648b = "err";
                }
                str3 = f10648b;
            }
        }
        return str3;
    }
}
