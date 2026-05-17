package com.google.android.gms.ads.internal.p048js;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.ads.internal.C0733bq;
import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import com.google.android.gms.common.util.InterfaceC1311o;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.C1657jb;
import com.google.android.gms.internal.C1670jo;
import com.google.android.gms.internal.C1807oq;
import com.google.android.gms.internal.InterfaceC1758mv;
import com.google.android.gms.internal.afk;
import com.google.android.gms.internal.bwf;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.cnb;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.js.q */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0811q implements InterfaceC0809o {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1758mv f4726a;

    /* JADX INFO: renamed from: b */
    private final Context f4727b;

    public C0811q(Context context, C1670jo c1670jo, afk afkVar, C0733bq c0733bq) {
        this.f4727b = context;
        this.f4726a = C0710au.m5570f().m11878a(context, C1807oq.m11925a(), "", false, false, afkVar, c1670jo, null, null, null, bwf.m10352a());
        Object obj = this.f4726a;
        if (obj == null) {
            throw null;
        }
        ((View) obj).setWillNotDraw(true);
    }

    /* JADX INFO: renamed from: a */
    private static void m5737a(Runnable runnable) {
        bxm.m10404a();
        if (C1657jb.m11573b()) {
            runnable.run();
        } else {
            C1596gv.f10711a.post(runnable);
        }
    }

    @Override // com.google.android.gms.ads.internal.p048js.InterfaceC0809o
    /* JADX INFO: renamed from: a */
    public final void mo5730a() {
        this.f4726a.destroy();
    }

    @Override // com.google.android.gms.ads.internal.p048js.InterfaceC0809o
    /* JADX INFO: renamed from: a */
    public final void mo5731a(InterfaceC0810p interfaceC0810p) {
        this.f4726a.mo11833w().m11853a(new C0817w(this, interfaceC0810p));
    }

    @Override // com.google.android.gms.ads.internal.p048js.InterfaceC0809o
    /* JADX INFO: renamed from: a */
    public final void mo5732a(String str) {
        m5737a(new RunnableC0814t(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str)));
    }

    @Override // com.google.android.gms.ads.internal.p048js.InterfaceC0805k
    /* JADX INFO: renamed from: a */
    public final void mo5725a(String str, InterfaceC0748aa<? super InterfaceC0805k> interfaceC0748aa) {
        this.f4726a.mo11833w().m11857a(str, new C0818x(this, interfaceC0748aa));
    }

    @Override // com.google.android.gms.ads.internal.p048js.InterfaceC0783a
    /* JADX INFO: renamed from: a */
    public final void mo5712a(String str, Map<String, ?> map) {
        this.f4726a.mo5712a(str, map);
    }

    @Override // com.google.android.gms.ads.internal.p048js.InterfaceC0783a
    /* JADX INFO: renamed from: a */
    public final void mo5713a(String str, JSONObject jSONObject) {
        this.f4726a.mo5713a(str, jSONObject);
    }

    @Override // com.google.android.gms.ads.internal.p048js.InterfaceC0809o
    /* JADX INFO: renamed from: b */
    public final InterfaceC0806l mo5733b() {
        return new C0807m(this);
    }

    @Override // com.google.android.gms.ads.internal.p048js.InterfaceC0809o
    /* JADX INFO: renamed from: b */
    public final void mo5734b(String str) {
        m5737a(new RunnableC0816v(this, str));
    }

    @Override // com.google.android.gms.ads.internal.p048js.InterfaceC0805k
    /* JADX INFO: renamed from: b */
    public final void mo5726b(String str, final InterfaceC0748aa<? super InterfaceC0805k> interfaceC0748aa) {
        this.f4726a.mo11833w().m11858a(str, new InterfaceC1311o(interfaceC0748aa) { // from class: com.google.android.gms.ads.internal.js.r

            /* JADX INFO: renamed from: a */
            private final InterfaceC0748aa f4728a;

            {
                this.f4728a = interfaceC0748aa;
            }

            @Override // com.google.android.gms.common.util.InterfaceC1311o
            /* JADX INFO: renamed from: a */
            public final boolean mo5738a(Object obj) {
                InterfaceC0748aa interfaceC0748aa2 = (InterfaceC0748aa) obj;
                return (interfaceC0748aa2 instanceof C0818x) && ((C0818x) interfaceC0748aa2).f4739a.equals(this.f4728a);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.p048js.InterfaceC0819y
    /* JADX INFO: renamed from: b */
    public final void mo5728b(String str, JSONObject jSONObject) {
        m5737a(new RunnableC0813s(this, str, jSONObject));
    }

    @Override // com.google.android.gms.ads.internal.p048js.InterfaceC0809o
    /* JADX INFO: renamed from: c */
    public final void mo5735c(String str) {
        m5737a(new RunnableC0815u(this, str));
    }
}
