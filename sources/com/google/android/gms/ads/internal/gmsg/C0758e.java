package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.cnb;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.gmsg.e */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0758e implements InterfaceC0748aa<Object> {

    /* JADX INFO: renamed from: a */
    private final Object f4637a = new Object();

    /* JADX INFO: renamed from: b */
    private final Map<String, InterfaceC0759f> f4638b = new HashMap();

    /* JADX INFO: renamed from: a */
    public final void m5687a(String str, InterfaceC0759f interfaceC0759f) {
        synchronized (this.f4637a) {
            this.f4638b.put(str, interfaceC0759f);
        }
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("id");
        String str2 = map.get("fail");
        String str3 = map.get("fail_reason");
        String str4 = map.get("result");
        synchronized (this.f4637a) {
            InterfaceC0759f interfaceC0759fRemove = this.f4638b.remove(str);
            if (interfaceC0759fRemove == null) {
                String strValueOf = String.valueOf(str);
                C1560fm.m11615e(strValueOf.length() != 0 ? "Received result for unexpected method invocation: ".concat(strValueOf) : new String("Received result for unexpected method invocation: "));
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                interfaceC0759fRemove.mo5688a(str3);
                return;
            }
            if (str4 == null) {
                interfaceC0759fRemove.mo5689a((JSONObject) null);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str4);
                if (C1560fm.m11344a()) {
                    String strValueOf2 = String.valueOf(jSONObject.toString(2));
                    C1560fm.m11343a(strValueOf2.length() != 0 ? "Result GMSG: ".concat(strValueOf2) : new String("Result GMSG: "));
                }
                interfaceC0759fRemove.mo5689a(jSONObject);
            } catch (JSONException e) {
                interfaceC0759fRemove.mo5688a(e.getMessage());
            }
        }
    }
}
