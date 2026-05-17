package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1700kr;
import com.google.android.gms.internal.cnb;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.gmsg.af */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0753af implements InterfaceC0748aa<Object> {

    /* JADX INFO: renamed from: a */
    private HashMap<String, C1700kr<JSONObject>> f4619a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public final Future<JSONObject> m5677a(String str) {
        C1700kr<JSONObject> c1700kr = new C1700kr<>();
        this.f4619a.put(str, c1700kr);
        return c1700kr;
    }

    /* JADX INFO: renamed from: b */
    public final void m5678b(String str) {
        C1700kr<JSONObject> c1700kr = this.f4619a.get(str);
        if (c1700kr == null) {
            C1560fm.m11612c("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!c1700kr.isDone()) {
            c1700kr.cancel(true);
        }
        this.f4619a.remove(str);
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("request_id");
        String str2 = map.get("fetched_ad");
        C1560fm.m11610b("Received ad from the cache.");
        C1700kr<JSONObject> c1700kr = this.f4619a.get(str);
        if (c1700kr == null) {
            C1560fm.m11612c("Could not find the ad request for the corresponding ad response.");
            return;
        }
        try {
            c1700kr.m11657b(new JSONObject(str2));
        } catch (JSONException e) {
            C1560fm.m11611b("Failed constructing JSON object from value passed from javascript", e);
            c1700kr.m11657b(null);
        } finally {
            this.f4619a.remove(str);
        }
    }
}
