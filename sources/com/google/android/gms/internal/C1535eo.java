package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0710au;

/* JADX INFO: renamed from: com.google.android.gms.internal.eo */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1535eo {
    /* JADX INFO: renamed from: a */
    public static String m11251a(String str, Context context) {
        String strM11249i;
        if (!C0710au.m5590z().m11236a(context) || TextUtils.isEmpty(str) || (strM11249i = C0710au.m5590z().m11249i(context)) == null) {
            return str;
        }
        if (((Boolean) bxm.m10409f().m10546a(can.f9467an)).booleanValue()) {
            CharSequence charSequence = (String) bxm.m10409f().m10546a(can.f9468ao);
            if (!str.contains(charSequence)) {
                return str;
            }
            if (C0710au.m5569e().m11453d(str)) {
                C0710au.m5590z().m11241d(context, strM11249i);
                return str.replace(charSequence, strM11249i);
            }
            if (!C0710au.m5569e().m11454e(str)) {
                return str;
            }
            C0710au.m5590z().m11243e(context, strM11249i);
            return str.replace(charSequence, strM11249i);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (C0710au.m5569e().m11453d(str)) {
            C0710au.m5590z().m11241d(context, strM11249i);
            C0710au.m5569e();
            return C1596gv.m11374a(str, "fbs_aeid", strM11249i).toString();
        }
        if (!C0710au.m5569e().m11454e(str)) {
            return str;
        }
        C0710au.m5590z().m11243e(context, strM11249i);
        C0710au.m5569e();
        return C1596gv.m11374a(str, "fbs_aeid", strM11249i).toString();
    }
}
