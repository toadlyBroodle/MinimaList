package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.can;
import com.google.android.gms.internal.cnb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.overlay.a */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0826a {
    /* JADX INFO: renamed from: a */
    private static boolean m5773a(Context context, Intent intent, InterfaceC0842q interfaceC0842q) {
        try {
            String strValueOf = String.valueOf(intent.toURI());
            C1560fm.m11343a(strValueOf.length() != 0 ? "Launching an intent: ".concat(strValueOf) : new String("Launching an intent: "));
            C0710au.m5569e();
            C1596gv.m11390a(context, intent);
            if (interfaceC0842q != null) {
                interfaceC0842q.mo5477g();
            }
            return true;
        } catch (ActivityNotFoundException e) {
            C1560fm.m11615e(e.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5774a(Context context, C0828c c0828c, InterfaceC0842q interfaceC0842q) {
        int i;
        if (c0828c == null) {
            C1560fm.m11615e("No intent data for launcher overlay.");
            return false;
        }
        can.m10549a(context);
        if (c0828c.f4799f != null) {
            return m5773a(context, c0828c.f4799f, interfaceC0842q);
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(c0828c.f4794a)) {
            C1560fm.m11615e("Open GMSG did not contain a URL.");
            return false;
        }
        if (TextUtils.isEmpty(c0828c.f4795b)) {
            intent.setData(Uri.parse(c0828c.f4794a));
        } else {
            intent.setDataAndType(Uri.parse(c0828c.f4794a), c0828c.f4795b);
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(c0828c.f4796c)) {
            intent.setPackage(c0828c.f4796c);
        }
        if (!TextUtils.isEmpty(c0828c.f4797d)) {
            String[] strArrSplit = c0828c.f4797d.split("/", 2);
            if (strArrSplit.length < 2) {
                String strValueOf = String.valueOf(c0828c.f4797d);
                C1560fm.m11615e(strValueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(strValueOf) : new String("Could not parse component name from open GMSG: "));
                return false;
            }
            intent.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str = c0828c.f4798e;
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                C1560fm.m11615e("Could not parse intent flags.");
                i = 0;
            }
            intent.addFlags(i);
        }
        if (((Boolean) bxm.m10409f().m10546a(can.f9583cx)).booleanValue()) {
            intent.addFlags(268435456);
            intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) bxm.m10409f().m10546a(can.f9582cw)).booleanValue()) {
                C0710au.m5569e();
                C1596gv.m11410b(context, intent);
            }
        }
        return m5773a(context, intent, interfaceC0842q);
    }
}
