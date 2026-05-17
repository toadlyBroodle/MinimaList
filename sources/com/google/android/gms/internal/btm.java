package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class btm implements btz {

    /* JADX INFO: renamed from: a */
    private final bta f8970a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1758mv f8971b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0748aa<InterfaceC1758mv> f8972c = new btn(this);

    /* JADX INFO: renamed from: d */
    private final InterfaceC0748aa<InterfaceC1758mv> f8973d = new bto(this);

    /* JADX INFO: renamed from: e */
    private final InterfaceC0748aa<InterfaceC1758mv> f8974e = new btp(this);

    public btm(bta btaVar, InterfaceC1758mv interfaceC1758mv) {
        this.f8970a = btaVar;
        this.f8971b = interfaceC1758mv;
        InterfaceC1758mv interfaceC1758mv2 = this.f8971b;
        interfaceC1758mv2.mo11815a("/updateActiveView", this.f8972c);
        interfaceC1758mv2.mo11815a("/untrackActiveViewUnit", this.f8973d);
        interfaceC1758mv2.mo11815a("/visibilityChanged", this.f8974e);
        String strValueOf = String.valueOf(this.f8970a.f8936a.m10195d());
        C1560fm.m11610b(strValueOf.length() != 0 ? "Custom JS tracking ad unit: ".concat(strValueOf) : new String("Custom JS tracking ad unit: "));
    }

    @Override // com.google.android.gms.internal.btz
    /* JADX INFO: renamed from: a */
    public final void mo10243a(JSONObject jSONObject, boolean z) {
        if (z) {
            this.f8970a.m10230b(this);
        } else {
            this.f8971b.mo5728b("AFMA_updateActiveView", jSONObject);
        }
    }

    @Override // com.google.android.gms.internal.btz
    /* JADX INFO: renamed from: a */
    public final boolean mo10244a() {
        return true;
    }

    @Override // com.google.android.gms.internal.btz
    /* JADX INFO: renamed from: b */
    public final void mo10245b() {
        InterfaceC1758mv interfaceC1758mv = this.f8971b;
        interfaceC1758mv.mo11819b("/visibilityChanged", this.f8974e);
        interfaceC1758mv.mo11819b("/untrackActiveViewUnit", this.f8973d);
        interfaceC1758mv.mo11819b("/updateActiveView", this.f8972c);
    }
}
