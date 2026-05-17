package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.mi */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1745mi implements InterfaceC0748aa<InterfaceC1739mc> {

    /* JADX INFO: renamed from: a */
    private boolean f11048a;

    /* JADX INFO: renamed from: a */
    private static int m11779a(Context context, Map<String, String> map, String str, int i) {
        String str2 = map.get(str);
        if (str2 == null) {
            return i;
        }
        try {
            bxm.m10404a();
            return C1657jb.m11560a(context, Integer.parseInt(str2));
        } catch (NumberFormatException e) {
            C1560fm.m11615e(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length()).append("Could not parse ").append(str).append(" in a video GMSG: ").append(str2).toString());
            return i;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m11780a(C1726lq c1726lq, Map<String, String> map) {
        String str = map.get("minBufferMs");
        String str2 = map.get("maxBufferMs");
        String str3 = map.get("bufferForPlaybackMs");
        String str4 = map.get("bufferForPlaybackAfterRebufferMs");
        if (str != null) {
            try {
                Integer.parseInt(str);
            } catch (NumberFormatException e) {
                C1560fm.m11615e(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            Integer.parseInt(str2);
        }
        if (str3 != null) {
            Integer.parseInt(str3);
        }
        if (str4 != null) {
            Integer.parseInt(str4);
        }
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final /* synthetic */ void zza(InterfaceC1739mc interfaceC1739mc, Map map) {
        int iMin;
        int i;
        InterfaceC1739mc interfaceC1739mc2 = interfaceC1739mc;
        String str = (String) map.get("action");
        if (str == null) {
            C1560fm.m11615e("Action missing from video GMSG.");
            return;
        }
        if (C1560fm.m11609a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String string = jSONObject.toString();
            C1560fm.m11610b(new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(string).length()).append("Video GMSG: ").append(str).append(" ").append(string).toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                C1560fm.m11615e("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                interfaceC1739mc2.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException e) {
                C1560fm.m11615e("Invalid color parameter in video GMSG.");
                return;
            }
        }
        if ("decoderProps".equals(str)) {
            String str3 = (String) map.get("mimeTypes");
            if (str3 == null) {
                C1560fm.m11615e("No MIME types specified for decoder properties inspection.");
                C1726lq.m11701a(interfaceC1739mc2, "missingMimeTypes");
                return;
            }
            if (Build.VERSION.SDK_INT < 16) {
                C1560fm.m11615e("Video decoder properties available on API versions >= 16.");
                C1726lq.m11701a(interfaceC1739mc2, "deficientApiVersion");
                return;
            }
            HashMap map2 = new HashMap();
            for (String str4 : str3.split(",")) {
                map2.put(str4, C1654iz.m11551a(str4.trim()));
            }
            C1726lq.m11702a(interfaceC1739mc2, map2);
            return;
        }
        C1729lt c1729ltMo11749a = interfaceC1739mc2.mo11749a();
        if (c1729ltMo11749a == null) {
            C1560fm.m11615e("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = "new".equals(str);
        boolean zEquals2 = "position".equals(str);
        if (zEquals || zEquals2) {
            Context context = interfaceC1739mc2.getContext();
            int iM11779a = m11779a(context, map, "x", 0);
            int iM11779a2 = m11779a(context, map, "y", 0);
            int iM11779a3 = m11779a(context, map, "w", -1);
            int iM11779a4 = m11779a(context, map, "h", -1);
            if (((Boolean) bxm.m10409f().m10546a(can.f9498bR)).booleanValue()) {
                iMin = Math.min(iM11779a3, interfaceC1739mc2.mo11762m() - iM11779a);
                iM11779a4 = Math.min(iM11779a4, interfaceC1739mc2.mo11761l() - iM11779a2);
            } else {
                iMin = iM11779a3;
            }
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException e2) {
                i = 0;
            }
            boolean z = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || c1729ltMo11749a.m11720a() != null) {
                c1729ltMo11749a.m11721a(iM11779a, iM11779a2, iMin, iM11779a4);
                return;
            }
            c1729ltMo11749a.m11722a(iM11779a, iM11779a2, iMin, iM11779a4, i, z, new C1738mb((String) map.get("flags")));
            C1726lq c1726lqM11720a = c1729ltMo11749a.m11720a();
            if (c1726lqM11720a != null) {
                m11780a(c1726lqM11720a, map);
                return;
            }
            return;
        }
        C1726lq c1726lqM11720a2 = c1729ltMo11749a.m11720a();
        if (c1726lqM11720a2 == null) {
            C1726lq.m11700a(interfaceC1739mc2);
            return;
        }
        if ("click".equals(str)) {
            Context context2 = interfaceC1739mc2.getContext();
            int iM11779a5 = m11779a(context2, map, "x", 0);
            int iM11779a6 = m11779a(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iM11779a5, iM11779a6, 0);
            c1726lqM11720a2.m11710a(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if ("currentTime".equals(str)) {
            String str5 = (String) map.get("time");
            if (str5 == null) {
                C1560fm.m11615e("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                c1726lqM11720a2.m11708a((int) (Float.parseFloat(str5) * 1000.0f));
                return;
            } catch (NumberFormatException e3) {
                String strValueOf = String.valueOf(str5);
                C1560fm.m11615e(strValueOf.length() != 0 ? "Could not parse time parameter from currentTime video GMSG: ".concat(strValueOf) : new String("Could not parse time parameter from currentTime video GMSG: "));
                return;
            }
        }
        if ("hide".equals(str)) {
            c1726lqM11720a2.setVisibility(4);
            return;
        }
        if ("load".equals(str)) {
            c1726lqM11720a2.m11712h();
            return;
        }
        if ("loadControl".equals(str)) {
            m11780a(c1726lqM11720a2, map);
            return;
        }
        if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                c1726lqM11720a2.m11715k();
                return;
            } else {
                c1726lqM11720a2.m11716l();
                return;
            }
        }
        if ("pause".equals(str)) {
            c1726lqM11720a2.m11713i();
            return;
        }
        if ("play".equals(str)) {
            c1726lqM11720a2.m11714j();
            return;
        }
        if ("show".equals(str)) {
            c1726lqM11720a2.setVisibility(0);
            return;
        }
        if ("src".equals(str)) {
            c1726lqM11720a2.m11711a((String) map.get("src"));
            return;
        }
        if ("touchMove".equals(str)) {
            Context context3 = interfaceC1739mc2.getContext();
            c1726lqM11720a2.m11707a(m11779a(context3, map, "dx", 0), m11779a(context3, map, "dy", 0));
            if (this.f11048a) {
                return;
            }
            interfaceC1739mc2.mo11757f();
            this.f11048a = true;
            return;
        }
        if (!"volume".equals(str)) {
            if ("watermark".equals(str)) {
                c1726lqM11720a2.m11717m();
                return;
            } else {
                String strValueOf2 = String.valueOf(str);
                C1560fm.m11615e(strValueOf2.length() != 0 ? "Unknown video action: ".concat(strValueOf2) : new String("Unknown video action: "));
                return;
            }
        }
        String str6 = (String) map.get("volume");
        if (str6 == null) {
            C1560fm.m11615e("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            c1726lqM11720a2.m11706a(Float.parseFloat(str6));
        } catch (NumberFormatException e4) {
            String strValueOf3 = String.valueOf(str6);
            C1560fm.m11615e(strValueOf3.length() != 0 ? "Could not parse volume parameter from volume video GMSG: ".concat(strValueOf3) : new String("Could not parse volume parameter from volume video GMSG: "));
        }
    }
}
