package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.InterfaceC0759f;
import com.google.android.gms.ads.internal.p048js.C0796b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class cho implements InterfaceC0759f {

    /* JADX INFO: renamed from: a */
    private final C0796b f10012a;

    /* JADX INFO: renamed from: b */
    private final C1700kr f10013b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ chl f10014c;

    public cho(chl chlVar, C0796b c0796b, C1700kr c1700kr) {
        this.f10014c = chlVar;
        this.f10012a = c0796b;
        this.f10013b = c1700kr;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0759f
    /* JADX INFO: renamed from: a */
    public final void mo5688a(String str) {
        try {
            if (str == null) {
                this.f10013b.m11656a(new cgy());
            } else {
                this.f10013b.m11656a(new cgy(str));
            }
        } catch (IllegalStateException e) {
        } finally {
            this.f10012a.m5719a();
        }
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0759f
    /* JADX INFO: renamed from: a */
    public final void mo5689a(JSONObject jSONObject) {
        try {
            this.f10013b.m11657b(this.f10014c.f10002a.mo10854a(jSONObject));
        } catch (IllegalStateException e) {
        } catch (JSONException e2) {
            this.f10013b.m11657b(e2);
        } finally {
            this.f10012a.m5719a();
        }
    }
}
