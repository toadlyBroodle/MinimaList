package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0710au;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.hv */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1623hv {

    /* JADX INFO: renamed from: a */
    private final Object f10754a = new Object();

    /* JADX INFO: renamed from: b */
    private String f10755b = "";

    /* JADX INFO: renamed from: c */
    private String f10756c = "";

    /* JADX INFO: renamed from: d */
    private boolean f10757d = false;

    /* JADX INFO: renamed from: e */
    private String f10758e = "";

    /* JADX INFO: renamed from: a */
    private final String m11507a(Context context) {
        String str;
        synchronized (this.f10754a) {
            if (TextUtils.isEmpty(this.f10755b)) {
                C0710au.m5569e();
                this.f10755b = C1596gv.m11408b(context, "debug_signals_id.txt");
                if (TextUtils.isEmpty(this.f10755b)) {
                    C0710au.m5569e();
                    this.f10755b = C1596gv.m11379a();
                    C0710au.m5569e();
                    C1596gv.m11414c(context, "debug_signals_id.txt", this.f10755b);
                }
            }
            str = this.f10755b;
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    private final void m11508a(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            C1596gv.f10711a.post(new RunnableC1624hw(this, context, str, z, z2));
        } else {
            C1560fm.m11614d("Can not create dialog without Activity Context");
        }
    }

    /* JADX INFO: renamed from: b */
    private final boolean m11509b(Context context, String str, String str2) {
        String strM11512d = m11512d(context, m11510c(context, (String) bxm.m10409f().m10546a(can.f9535cB), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strM11512d)) {
            C1560fm.m11610b("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strM11512d.trim());
            String strOptString = jSONObject.optString("gct");
            this.f10758e = jSONObject.optString("status");
            synchronized (this.f10754a) {
                this.f10756c = strOptString;
            }
            return true;
        } catch (JSONException e) {
            C1560fm.m11613c("Fail to get in app preview response json.", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    private final Uri m11510c(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.appendQueryParameter("linkedDeviceId", m11507a(context));
        builderBuildUpon.appendQueryParameter("adSlotPath", str2);
        builderBuildUpon.appendQueryParameter("afmaVersion", str3);
        return builderBuildUpon.build();
    }

    /* JADX INFO: renamed from: c */
    private final boolean m11511c(Context context, String str, String str2) {
        String strM11512d = m11512d(context, m11510c(context, (String) bxm.m10409f().m10546a(can.f9536cC), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strM11512d)) {
            C1560fm.m11610b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strM11512d.trim()).optString("debug_mode"));
            synchronized (this.f10754a) {
                this.f10757d = zEquals;
            }
            return zEquals;
        } catch (JSONException e) {
            C1560fm.m11613c("Fail to get debug mode response json.", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    private static String m11512d(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", C0710au.m5569e().m11440a(context, str2));
        InterfaceFutureC1689kg<String> interfaceFutureC1689kgM11531a = new C1633ie(context).m11531a(str, map);
        try {
            return interfaceFutureC1689kgM11531a.get(((Integer) bxm.m10409f().m10546a(can.f9538cE)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            String strValueOf = String.valueOf(str);
            C1560fm.m11611b(strValueOf.length() != 0 ? "Interrupted while retriving a response from: ".concat(strValueOf) : new String("Interrupted while retriving a response from: "), e);
            interfaceFutureC1689kgM11531a.cancel(true);
            return null;
        } catch (TimeoutException e2) {
            String strValueOf2 = String.valueOf(str);
            C1560fm.m11611b(strValueOf2.length() != 0 ? "Timeout while retriving a response from: ".concat(strValueOf2) : new String("Timeout while retriving a response from: "), e2);
            interfaceFutureC1689kgM11531a.cancel(true);
            return null;
        } catch (Exception e3) {
            String strValueOf3 = String.valueOf(str);
            C1560fm.m11611b(strValueOf3.length() != 0 ? "Error retriving a response from: ".concat(strValueOf3) : new String("Error retriving a response from: "), e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m11513e(Context context, String str, String str2) {
        C0710au.m5569e();
        C1596gv.m11391a(context, m11510c(context, (String) bxm.m10409f().m10546a(can.f9534cA), str, str2));
    }

    /* JADX INFO: renamed from: a */
    public final String m11514a() {
        String str;
        synchronized (this.f10754a) {
            str = this.f10756c;
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public final void m11515a(Context context, String str, String str2) {
        if (!m11509b(context, str, str2)) {
            m11508a(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(this.f10758e)) {
            C1560fm.m11610b("Creative is not pushed for this device.");
            m11508a(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(this.f10758e)) {
            C1560fm.m11610b("The app is not linked for creative preview.");
            m11513e(context, str, str2);
        } else if ("0".equals(this.f10758e)) {
            C1560fm.m11610b("Device is linked for in app preview.");
            m11508a(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11516a(Context context, String str, String str2, String str3) {
        boolean zM11518b = m11518b();
        if (!m11511c(context, str, str2)) {
            m11513e(context, str, str2);
            return;
        }
        if (!zM11518b && !TextUtils.isEmpty(str3)) {
            m11517b(context, str2, str3, str);
        }
        C1560fm.m11610b("Device is linked for debug signals.");
        m11508a(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    /* JADX INFO: renamed from: b */
    public final void m11517b(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = m11510c(context, (String) bxm.m10409f().m10546a(can.f9537cD), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        C0710au.m5569e();
        C1596gv.m11411b(context, str, builderBuildUpon.build().toString());
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11518b() {
        boolean z;
        synchronized (this.f10754a) {
            z = this.f10757d;
        }
        return z;
    }
}
