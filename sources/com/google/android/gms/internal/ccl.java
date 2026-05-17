package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class ccl implements InterfaceC0748aa<Object> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ cmh f9812a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ ccf f9813b;

    ccl(ccf ccfVar, cmh cmhVar) {
        this.f9813b = ccfVar;
        this.f9812a = cmhVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final void zza(Object obj, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
            jSONObject.put("id", this.f9813b.f9797b);
            this.f9812a.mo11128a("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            C1560fm.m11611b("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}
