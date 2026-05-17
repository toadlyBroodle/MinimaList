package com.google.android.gms.ads.internal.p048js;

import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.InterfaceC1705kw;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.js.ai */
/* JADX INFO: loaded from: classes.dex */
final class C0792ai implements InterfaceC1705kw<InterfaceC0809o> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C0800f f4703a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C0820z f4704b;

    C0792ai(C0820z c0820z, C0800f c0800f) {
        this.f4704b = c0820z;
        this.f4703a = c0800f;
    }

    @Override // com.google.android.gms.internal.InterfaceC1705kw
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo5715a(InterfaceC0809o interfaceC0809o) {
        synchronized (this.f4704b.f4741a) {
            this.f4704b.f4748h = 0;
            if (this.f4704b.f4747g != null && this.f4703a != this.f4704b.f4747g) {
                C1560fm.m11343a("New JS engine is loaded, marking previous one as destroyable.");
                this.f4704b.f4747g.m5724c();
            }
            this.f4704b.f4747g = this.f4703a;
        }
    }
}
