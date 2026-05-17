package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.reward.InterfaceC0881b;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.bws;
import com.google.android.gms.internal.bzj;

/* JADX INFO: renamed from: com.google.android.gms.ads.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0687h {

    /* JADX INFO: renamed from: a */
    private final bzj f4397a;

    public C0687h(Context context) {
        this.f4397a = new bzj(context);
        C1221aj.m7066a(context, "Context cannot be null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m5425a(C0657a c0657a) {
        this.f4397a.m10507a(c0657a);
        if (c0657a != 0 && (c0657a instanceof bws)) {
            this.f4397a.m10509a((bws) c0657a);
        } else if (c0657a == 0) {
            this.f4397a.m10509a((bws) null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5426a(C0676c c0676c) {
        this.f4397a.m10510a(c0676c.m5385a());
    }

    /* JADX INFO: renamed from: a */
    public final void m5427a(InterfaceC0881b interfaceC0881b) {
        this.f4397a.m10508a(interfaceC0881b);
    }

    /* JADX INFO: renamed from: a */
    public final void m5428a(String str) {
        this.f4397a.m10511a(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m5429a(boolean z) {
        this.f4397a.m10512a(true);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5430a() {
        return this.f4397a.m10513a();
    }

    /* JADX INFO: renamed from: b */
    public final void m5431b() {
        this.f4397a.m10514b();
    }

    /* JADX INFO: renamed from: b */
    public final void m5432b(boolean z) {
        this.f4397a.m10515b(z);
    }
}
