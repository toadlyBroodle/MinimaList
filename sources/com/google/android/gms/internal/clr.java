package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.BinderC0692ac;
import com.google.android.gms.ads.internal.C0710au;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class clr implements Callable<C1541eu> {

    /* JADX INFO: renamed from: a */
    private static long f10296a = 10;

    /* JADX INFO: renamed from: b */
    private final Context f10297b;

    /* JADX INFO: renamed from: c */
    private final C1633ie f10298c;

    /* JADX INFO: renamed from: d */
    private final BinderC0692ac f10299d;

    /* JADX INFO: renamed from: e */
    private final afk f10300e;

    /* JADX INFO: renamed from: f */
    private final cmh f10301f;

    /* JADX INFO: renamed from: h */
    private final C1542ev f10303h;

    /* JADX INFO: renamed from: i */
    private final cba f10304i;

    /* JADX INFO: renamed from: m */
    private JSONObject f10308m;

    /* JADX INFO: renamed from: g */
    private final Object f10302g = new Object();

    /* JADX INFO: renamed from: j */
    private boolean f10305j = false;

    /* JADX INFO: renamed from: k */
    private int f10306k = -2;

    /* JADX INFO: renamed from: l */
    private List<String> f10307l = null;

    /* JADX INFO: renamed from: n */
    private String f10309n = null;

    public clr(Context context, BinderC0692ac binderC0692ac, C1633ie c1633ie, afk afkVar, C1542ev c1542ev, cba cbaVar) {
        this.f10297b = context;
        this.f10299d = binderC0692ac;
        this.f10298c = c1633ie;
        this.f10303h = c1542ev;
        this.f10300e = afkVar;
        this.f10304i = cbaVar;
        this.f10301f = binderC0692ac.m5505F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: CancellationException -> 0x0152, ExecutionException -> 0x0165, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8, InterruptedException -> 0x01bf, TryCatch #2 {InterruptedException -> 0x01bf, CancellationException -> 0x0152, ExecutionException -> 0x0165, TimeoutException -> 0x01b1, JSONException -> 0x01aa, Exception -> 0x01b8, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x0034, B:9:0x003c, B:11:0x0043, B:14:0x004d, B:16:0x0066, B:17:0x0077, B:33:0x00af, B:35:0x00bd, B:36:0x00c6, B:38:0x00ce, B:39:0x00d7, B:41:0x00df, B:21:0x0080, B:68:0x0167, B:71:0x0176, B:26:0x008b, B:28:0x008f, B:29:0x00a6, B:72:0x01a5, B:44:0x00ee, B:46:0x00f6, B:47:0x0101, B:49:0x0109, B:51:0x0128, B:52:0x0130, B:54:0x0142, B:55:0x0146, B:57:0x014c, B:65:0x0161, B:13:0x0049), top: B:82:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066 A[Catch: CancellationException -> 0x0152, ExecutionException -> 0x0165, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8, InterruptedException -> 0x01bf, TryCatch #2 {InterruptedException -> 0x01bf, CancellationException -> 0x0152, ExecutionException -> 0x0165, TimeoutException -> 0x01b1, JSONException -> 0x01aa, Exception -> 0x01b8, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x0034, B:9:0x003c, B:11:0x0043, B:14:0x004d, B:16:0x0066, B:17:0x0077, B:33:0x00af, B:35:0x00bd, B:36:0x00c6, B:38:0x00ce, B:39:0x00d7, B:41:0x00df, B:21:0x0080, B:68:0x0167, B:71:0x0176, B:26:0x008b, B:28:0x008f, B:29:0x00a6, B:72:0x01a5, B:44:0x00ee, B:46:0x00f6, B:47:0x0101, B:49:0x0109, B:51:0x0128, B:52:0x0130, B:54:0x0142, B:55:0x0146, B:57:0x014c, B:65:0x0161, B:13:0x0049), top: B:82:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0157  */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1541eu call() {
        JSONObject jSONObject;
        clx cmkVar;
        ccb ccbVar;
        try {
            String strM5524i_ = this.f10299d.m5524i_();
            if (!m11102b()) {
                new C1700kr();
                new clq();
                JSONObject jSONObject2 = new JSONObject(this.f10303h.f10561b.f12610b);
                JSONObject jSONObject3 = new JSONObject(this.f10303h.f10561b.f12610b);
                if (jSONObject3.length() == 0) {
                    m11097a(3);
                    JSONObject jSONObject4 = this.f10301f.mo11126a(jSONObject2).get(f10296a, TimeUnit.SECONDS);
                    jSONObject = !jSONObject4.optBoolean("success", false) ? jSONObject4.getJSONObject("json").optJSONArray("ads").getJSONObject(0) : null;
                } else {
                    JSONArray jSONArrayOptJSONArray = jSONObject3.optJSONArray("ads");
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.optJSONObject(0) : null;
                    if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() == 0) {
                    }
                    JSONObject jSONObject42 = this.f10301f.mo11126a(jSONObject2).get(f10296a, TimeUnit.SECONDS);
                    if (!jSONObject42.optBoolean("success", false)) {
                    }
                }
            }
            if (m11102b() || jSONObject == null) {
                cmkVar = null;
            } else {
                String string = jSONObject.getString("template_id");
                boolean z = this.f10303h.f10560a.f11775y != null ? this.f10303h.f10560a.f11775y.f9815b : false;
                boolean z2 = this.f10303h.f10560a.f11775y != null ? this.f10303h.f10560a.f11775y.f9817d : false;
                if ("2".equals(string)) {
                    cmkVar = new cmi(z, z2, this.f10303h.f10569j);
                } else if ("1".equals(string)) {
                    cmkVar = new cmj(z, z2, this.f10303h.f10569j);
                } else {
                    if ("3".equals(string)) {
                        String string2 = jSONObject.getString("custom_template_id");
                        C1700kr c1700kr = new C1700kr();
                        C1596gv.f10711a.post(new cls(this, c1700kr, string2));
                        if (c1700kr.get(f10296a, TimeUnit.SECONDS) != null) {
                            cmkVar = new cmk(z);
                        } else {
                            String strValueOf = String.valueOf(jSONObject.getString("custom_template_id"));
                            C1560fm.m11612c(strValueOf.length() != 0 ? "No handler for custom template: ".concat(strValueOf) : new String("No handler for custom template: "));
                        }
                    } else {
                        m11097a(0);
                    }
                    cmkVar = null;
                }
            }
            if (m11102b() || cmkVar == null || jSONObject == null) {
                ccbVar = null;
            } else {
                JSONObject jSONObject5 = jSONObject.getJSONObject("tracking_urls_and_actions");
                String[] strArrM11104c = m11104c(jSONObject5, "impression_tracking_urls");
                this.f10307l = strArrM11104c == null ? null : Arrays.asList(strArrM11104c);
                this.f10308m = jSONObject5.optJSONObject("active_view");
                this.f10309n = jSONObject.optString("debug_signals");
                ccb ccbVarMo11114a = cmkVar.mo11114a(this, jSONObject);
                ccbVarMo11114a.mo10611a(new ccd(this.f10297b, this.f10299d, this.f10301f, this.f10300e, jSONObject, ccbVarMo11114a, this.f10303h.f10560a.f11761k, strM5524i_));
                ccbVar = ccbVarMo11114a;
            }
            if (ccbVar instanceof cbu) {
                clq clqVar = new clq();
                clt cltVar = new clt(this, (cbu) ccbVar);
                clqVar.f10295a = cltVar;
                this.f10301f.mo11089a("/nativeAdCustomClick", cltVar);
            }
            return m11093a(ccbVar);
        } catch (InterruptedException e) {
            if (!this.f10305j) {
                m11097a(0);
            }
            return m11093a((ccb) null);
        } catch (CancellationException e2) {
            if (!this.f10305j) {
            }
            return m11093a((ccb) null);
        } catch (ExecutionException e3) {
            if (!this.f10305j) {
            }
            return m11093a((ccb) null);
        } catch (TimeoutException e4) {
            C1560fm.m11613c("Timeout when loading native ad.", e4);
            if (!this.f10305j) {
            }
            return m11093a((ccb) null);
        } catch (JSONException e5) {
            C1560fm.m11613c("Malformed native JSON response.", e5);
            if (!this.f10305j) {
            }
            return m11093a((ccb) null);
        } catch (Exception e6) {
            C1560fm.m11613c("Error occured while doing native ads initialization.", e6);
            if (!this.f10305j) {
            }
            return m11093a((ccb) null);
        }
    }

    /* JADX INFO: renamed from: a */
    private final C1541eu m11093a(ccb ccbVar) {
        int i;
        synchronized (this.f10302g) {
            i = this.f10306k;
            if (ccbVar == null && this.f10306k == -2) {
                i = 0;
            }
        }
        return new C1541eu(this.f10303h.f10560a.f11753c, null, this.f10303h.f10561b.f12611c, i, this.f10303h.f10561b.f12613e, this.f10307l, this.f10303h.f10561b.f12619k, this.f10303h.f10561b.f12618j, this.f10303h.f10560a.f11759i, false, null, null, null, null, null, 0L, this.f10303h.f10563d, this.f10303h.f10561b.f12614f, this.f10303h.f10565f, this.f10303h.f10566g, this.f10303h.f10561b.f12622n, this.f10308m, i != -2 ? null : ccbVar, null, null, null, this.f10303h.f10561b.f12592D, this.f10303h.f10561b.f12593E, null, this.f10303h.f10561b.f12596H, this.f10309n, this.f10303h.f10568i, this.f10303h.f10561b.f12603O, this.f10303h.f10569j);
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceFutureC1689kg<cbp> m11094a(JSONObject jSONObject, boolean z, boolean z2) {
        String string = z ? jSONObject.getString("url") : jSONObject.optString("url");
        double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        if (!TextUtils.isEmpty(string)) {
            return z2 ? C1678jw.m11618a(new cbp(null, Uri.parse(string), dOptDouble)) : this.f10298c.m11530a(string, new clv(this, z, dOptDouble, zOptBoolean, string));
        }
        m11110a(0, z);
        return C1678jw.m11618a(null);
    }

    /* JADX INFO: renamed from: a */
    static InterfaceC1758mv m11095a(InterfaceFutureC1689kg<InterfaceC1758mv> interfaceFutureC1689kg) {
        try {
            return interfaceFutureC1689kg.get(((Integer) bxm.m10409f().m10546a(can.f9496bP)).intValue(), TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            C1560fm.m11613c("InterruptedException occurred while waiting for video to load", e);
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException e2) {
            e = e2;
            C1560fm.m11613c("Exception occurred while waiting for video to load", e);
            return null;
        } catch (ExecutionException e3) {
            e = e3;
            C1560fm.m11613c("Exception occurred while waiting for video to load", e);
            return null;
        } catch (TimeoutException e4) {
            e = e4;
            C1560fm.m11613c("Exception occurred while waiting for video to load", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m11097a(int i) {
        synchronized (this.f10302g) {
            this.f10305j = true;
            this.f10306k = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m11098a(cdv cdvVar, String str) {
        try {
            cef cefVarMo5521b = this.f10299d.mo5521b(cdvVar.mo10624l());
            if (cefVarMo5521b != null) {
                cefVarMo5521b.mo10751a(cdvVar, str);
            }
        } catch (RemoteException e) {
            C1560fm.m11613c(new StringBuilder(String.valueOf(str).length() + 40).append("Failed to call onCustomClick for asset ").append(str).append(".").toString(), e);
        }
    }

    /* JADX INFO: renamed from: b */
    private static <V> InterfaceFutureC1689kg<List<V>> m11100b(List<InterfaceFutureC1689kg<V>> list) {
        C1700kr c1700kr = new C1700kr();
        int size = list.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        Iterator<InterfaceFutureC1689kg<V>> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo11631a(new clw(atomicInteger, size, c1700kr, list), C1590gp.f10701a);
        }
        return c1700kr;
    }

    /* JADX INFO: renamed from: b */
    private static Integer m11101b(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private final boolean m11102b() {
        boolean z;
        synchronized (this.f10302g) {
            z = this.f10305j;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static <V> List<V> m11103c(List<InterfaceFutureC1689kg<V>> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceFutureC1689kg<V>> it = list.iterator();
        while (it.hasNext()) {
            V v = it.next().get();
            if (v != null) {
                arrayList.add(v);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private static String[] m11104c(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        String[] strArr = new String[jSONArrayOptJSONArray.length()];
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            strArr[i] = jSONArrayOptJSONArray.getString(i);
        }
        return strArr;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceFutureC1689kg<cbn> m11105a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return C1678jw.m11618a(null);
        }
        String strOptString = jSONObjectOptJSONObject.optString("text");
        int iOptInt = jSONObjectOptJSONObject.optInt("text_size", -1);
        Integer numM11101b = m11101b(jSONObjectOptJSONObject, "text_color");
        Integer numM11101b2 = m11101b(jSONObjectOptJSONObject, "bg_color");
        int iOptInt2 = jSONObjectOptJSONObject.optInt("animation_ms", 1000);
        int iOptInt3 = jSONObjectOptJSONObject.optInt("presentation_ms", 4000);
        int i = (this.f10303h.f10560a.f11775y == null || this.f10303h.f10560a.f11775y.f9814a < 2) ? 1 : this.f10303h.f10560a.f11775y.f9818e;
        boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("allow_pub_rendering");
        List<InterfaceFutureC1689kg<cbp>> arrayList = new ArrayList<>();
        if (jSONObjectOptJSONObject.optJSONArray("images") != null) {
            arrayList = m11108a(jSONObjectOptJSONObject, "images", false, false, true);
        } else {
            arrayList.add(m11107a(jSONObjectOptJSONObject, "image", false, false));
        }
        return C1678jw.m11621a(m11100b(arrayList), new clu(this, strOptString, numM11101b2, numM11101b, iOptInt, iOptInt3, iOptInt2, i, zOptBoolean), C1590gp.f10701a);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceFutureC1689kg<InterfaceC1758mv> m11106a(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            return C1678jw.m11618a(null);
        }
        if (TextUtils.isEmpty(jSONObjectOptJSONObject.optString("vast_xml"))) {
            C1560fm.m11615e("Required field 'vast_xml' is missing");
            return C1678jw.m11618a(null);
        }
        cly clyVar = new cly(this.f10297b, this.f10300e, this.f10303h, this.f10304i, this.f10299d);
        C1700kr c1700kr = new C1700kr();
        C0710au.m5569e();
        C1596gv.m11394a(new clz(clyVar, jSONObjectOptJSONObject, c1700kr));
        return c1700kr;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceFutureC1689kg<cbp> m11107a(JSONObject jSONObject, String str, boolean z, boolean z2) {
        JSONObject jSONObject2 = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return m11094a(jSONObject2, z, z2);
    }

    /* JADX INFO: renamed from: a */
    public final List<InterfaceFutureC1689kg<cbp>> m11108a(JSONObject jSONObject, String str, boolean z, boolean z2, boolean z3) throws JSONException {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            m11110a(0, false);
            return arrayList;
        }
        int length = z3 ? jSONArrayOptJSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            arrayList.add(m11094a(jSONObject2, false, z2));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final Future<cbp> m11109a(JSONObject jSONObject, String str, boolean z) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        boolean zOptBoolean = jSONObject2.optBoolean("require", true);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return m11094a(jSONObject2, zOptBoolean, z);
    }

    /* JADX INFO: renamed from: a */
    public final void m11110a(int i, boolean z) {
        if (z) {
            m11097a(i);
        }
    }
}
