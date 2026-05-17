package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.ads.internal.gmsg.C0754ag;
import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import com.google.android.gms.ads.internal.p048js.C0796b;
import com.google.android.gms.ads.internal.p048js.C0820z;
import com.google.android.gms.ads.internal.p048js.InterfaceC0805k;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class btq implements btz {

    /* JADX INFO: renamed from: a */
    private final bta f8978a;

    /* JADX INFO: renamed from: b */
    private final Context f8979b;

    /* JADX INFO: renamed from: c */
    private final C0754ag f8980c;

    /* JADX INFO: renamed from: d */
    private C0796b f8981d;

    /* JADX INFO: renamed from: e */
    private boolean f8982e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC0748aa<InterfaceC0805k> f8983f = new btv(this);

    /* JADX INFO: renamed from: g */
    private final InterfaceC0748aa<InterfaceC0805k> f8984g = new btw(this);

    /* JADX INFO: renamed from: h */
    private final InterfaceC0748aa<InterfaceC0805k> f8985h = new btx(this);

    /* JADX INFO: renamed from: i */
    private final InterfaceC0748aa<InterfaceC0805k> f8986i = new bty(this);

    public btq(bta btaVar, C0820z c0820z, Context context) {
        this.f8978a = btaVar;
        this.f8979b = context;
        this.f8980c = new C0754ag(this.f8979b);
        this.f8981d = c0820z.m5751b((afk) null);
        this.f8981d.mo11659a(new btr(this), new bts(this));
        String strValueOf = String.valueOf(this.f8978a.f8936a.m10195d());
        C1560fm.m11610b(strValueOf.length() != 0 ? "Core JS tracking ad unit: ".concat(strValueOf) : new String("Core JS tracking ad unit: "));
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m10247a(btq btqVar, boolean z) {
        btqVar.f8982e = true;
        return true;
    }

    /* JADX INFO: renamed from: a */
    final void m10249a(InterfaceC0805k interfaceC0805k) {
        interfaceC0805k.mo5725a("/updateActiveView", this.f8983f);
        interfaceC0805k.mo5725a("/untrackActiveViewUnit", this.f8984g);
        interfaceC0805k.mo5725a("/visibilityChanged", this.f8985h);
        if (C0710au.m5590z().m11236a(this.f8979b)) {
            interfaceC0805k.mo5725a("/logScionEvent", this.f8986i);
        }
    }

    @Override // com.google.android.gms.internal.btz
    /* JADX INFO: renamed from: a */
    public final void mo10243a(JSONObject jSONObject, boolean z) {
        this.f8981d.mo11659a(new btt(this, jSONObject), new C1704kv());
    }

    @Override // com.google.android.gms.internal.btz
    /* JADX INFO: renamed from: a */
    public final boolean mo10244a() {
        return this.f8982e;
    }

    @Override // com.google.android.gms.internal.btz
    /* JADX INFO: renamed from: b */
    public final void mo10245b() {
        this.f8981d.mo11659a(new btu(this), new C1704kv());
        this.f8981d.m5719a();
    }

    /* JADX INFO: renamed from: b */
    final void m10250b(InterfaceC0805k interfaceC0805k) {
        interfaceC0805k.mo5726b("/visibilityChanged", this.f8985h);
        interfaceC0805k.mo5726b("/untrackActiveViewUnit", this.f8984g);
        interfaceC0805k.mo5726b("/updateActiveView", this.f8983f);
        if (C0710au.m5590z().m11236a(this.f8979b)) {
            interfaceC0805k.mo5726b("/logScionEvent", this.f8986i);
        }
    }
}
