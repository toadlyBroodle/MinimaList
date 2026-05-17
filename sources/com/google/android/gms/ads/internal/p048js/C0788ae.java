package com.google.android.gms.ads.internal.p048js;

import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import com.google.android.gms.internal.C1560fm;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.js.ae */
/* JADX INFO: loaded from: classes.dex */
final class C0788ae implements InterfaceC0748aa<InterfaceC0805k> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ InterfaceC0809o f4695a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ RunnableC0784aa f4696b;

    C0788ae(RunnableC0784aa runnableC0784aa, InterfaceC0809o interfaceC0809o) {
        this.f4696b = runnableC0784aa;
        this.f4695a = interfaceC0809o;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final /* synthetic */ void zza(InterfaceC0805k interfaceC0805k, Map map) {
        synchronized (this.f4696b.f4690c.f4741a) {
            if (this.f4696b.f4689b.m11662e() == -1 || this.f4696b.f4689b.m11662e() == 1) {
                return;
            }
            this.f4696b.f4690c.f4748h = 0;
            this.f4696b.f4690c.f4745e.mo5717a(this.f4695a);
            this.f4696b.f4689b.mo11660a(this.f4695a);
            this.f4696b.f4690c.f4747g = this.f4696b.f4689b;
            C1560fm.m11343a("Successfully loaded JS Engine.");
        }
    }
}
