package com.google.android.gms.ads.internal.p048js;

import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1648it;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.js.af */
/* JADX INFO: loaded from: classes.dex */
final class C0789af implements InterfaceC0748aa<InterfaceC0805k> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ InterfaceC0809o f4697a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1648it f4698b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ RunnableC0784aa f4699c;

    C0789af(RunnableC0784aa runnableC0784aa, InterfaceC0809o interfaceC0809o, C1648it c1648it) {
        this.f4699c = runnableC0784aa;
        this.f4697a = interfaceC0809o;
        this.f4698b = c1648it;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final /* synthetic */ void zza(InterfaceC0805k interfaceC0805k, Map map) {
        synchronized (this.f4699c.f4690c.f4741a) {
            C1560fm.m11614d("JS Engine is requesting an update");
            if (this.f4699c.f4690c.f4748h == 0) {
                C1560fm.m11614d("Starting reload.");
                this.f4699c.f4690c.f4748h = 2;
                this.f4699c.f4690c.m5750a(this.f4699c.f4688a);
            }
            this.f4697a.mo5726b("/requestReload", (InterfaceC0748aa<? super InterfaceC0805k>) this.f4698b.m11541a());
        }
    }
}
