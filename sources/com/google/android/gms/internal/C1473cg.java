package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.C0710au;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.cg */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1473cg implements InterfaceC1432bj {

    /* JADX INFO: renamed from: a */
    private cgz<JSONObject, JSONObject> f9936a;

    /* JADX INFO: renamed from: b */
    private cgz<JSONObject, JSONObject> f9937b;

    public C1473cg(Context context) {
        this.f9936a = C0710au.m5582r().m10853a(context, C1670jo.m11616a()).m10857a("google.afma.request.getAdDictionary", che.f9990a, che.f9990a);
        this.f9937b = C0710au.m5582r().m10853a(context, C1670jo.m11616a()).m10857a("google.afma.sdkConstants.getSdkConstants", che.f9990a, che.f9990a);
    }

    @Override // com.google.android.gms.internal.InterfaceC1432bj
    /* JADX INFO: renamed from: a */
    public final cgz<JSONObject, JSONObject> mo9433a() {
        return this.f9936a;
    }

    @Override // com.google.android.gms.internal.InterfaceC1432bj
    /* JADX INFO: renamed from: b */
    public final cgz<JSONObject, JSONObject> mo9434b() {
        return this.f9937b;
    }
}
