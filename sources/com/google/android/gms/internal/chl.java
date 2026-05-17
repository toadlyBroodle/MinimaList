package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.ads.internal.gmsg.C0764k;
import com.google.android.gms.ads.internal.p048js.C0796b;
import com.google.android.gms.ads.internal.p048js.C0820z;
import com.google.android.gms.ads.internal.p048js.InterfaceC0805k;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class chl<I, O> implements cgz<I, O> {

    /* JADX INFO: renamed from: a */
    private final chb<O> f10002a;

    /* JADX INFO: renamed from: b */
    private final chc<I> f10003b;

    /* JADX INFO: renamed from: c */
    private final C0820z f10004c;

    /* JADX INFO: renamed from: d */
    private final String f10005d;

    chl(C0820z c0820z, String str, chc<I> chcVar, chb<O> chbVar) {
        this.f10004c = c0820z;
        this.f10005d = str;
        this.f10003b = chcVar;
        this.f10002a = chbVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m10859a(C0796b c0796b, InterfaceC0805k interfaceC0805k, I i, C1700kr<O> c1700kr) {
        try {
            C0710au.m5569e();
            String strM11379a = C1596gv.m11379a();
            C0764k.f4654o.m5687a(strM11379a, new cho(this, c0796b, c1700kr));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", strM11379a);
            jSONObject.put("args", this.f10003b.mo10855a(i));
            interfaceC0805k.mo5728b(this.f10005d, jSONObject);
        } catch (Exception e) {
            try {
                c1700kr.m11656a(e);
                C1560fm.m11611b("Unable to invokeJavaScript", e);
            } finally {
                c0796b.m5719a();
            }
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1673jr
    /* JADX INFO: renamed from: a */
    public final InterfaceFutureC1689kg<O> mo5652a(I i) {
        return mo10850b(i);
    }

    @Override // com.google.android.gms.internal.cgz
    /* JADX INFO: renamed from: b */
    public final InterfaceFutureC1689kg<O> mo10850b(I i) {
        C1700kr c1700kr = new C1700kr();
        C0796b c0796bM5751b = this.f10004c.m5751b((afk) null);
        c0796bM5751b.mo11659a(new chm(this, c0796bM5751b, i, c1700kr), new chn(this, c1700kr, c0796bM5751b));
        return c1700kr;
    }
}
