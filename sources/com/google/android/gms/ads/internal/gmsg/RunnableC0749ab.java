package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.p048js.InterfaceC0783a;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1596gv;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.gmsg.ab */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0749ab implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceC0783a f4613a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ Map f4614b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ HttpClient f4615c;

    RunnableC0749ab(HttpClient httpClient, Map map, InterfaceC0783a interfaceC0783a) {
        this.f4615c = httpClient;
        this.f4614b = map;
        this.f4613a = interfaceC0783a;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C1560fm.m11610b("Received Http request.");
        try {
            JSONObject jSONObjectSend = this.f4615c.send(new JSONObject((String) this.f4614b.get("http_request")));
            if (jSONObjectSend == null) {
                C1560fm.m11612c("Response should not be null.");
            } else {
                C1596gv.f10711a.post(new RunnableC0750ac(this, jSONObjectSend));
            }
        } catch (Exception e) {
            C1560fm.m11611b("Error converting request to json.", e);
        }
    }
}
