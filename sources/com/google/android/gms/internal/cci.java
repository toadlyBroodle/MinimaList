package com.google.android.gms.internal;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class cci implements InterfaceC1764na {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Map f9806a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ ccg f9807b;

    cci(ccg ccgVar, Map map) {
        this.f9807b = ccgVar;
        this.f9806a = map;
    }

    @Override // com.google.android.gms.internal.InterfaceC1764na
    /* JADX INFO: renamed from: a */
    public final void mo5739a(InterfaceC1758mv interfaceC1758mv, boolean z) {
        this.f9807b.f9799b.f9797b = (String) this.f9806a.get("id");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("messageType", "htmlLoaded");
            jSONObject.put("id", this.f9807b.f9799b.f9797b);
            this.f9807b.f9798a.mo11128a("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            C1560fm.m11611b("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}
