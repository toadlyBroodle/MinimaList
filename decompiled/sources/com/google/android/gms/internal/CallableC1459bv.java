package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.C0710au;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.bv */
/* JADX INFO: loaded from: classes.dex */
final class CallableC1459bv implements Callable<C1456bs> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f9099a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1458bu f9100b;

    CallableC1459bv(C1458bu c1458bu, Context context) {
        this.f9100b = c1458bu;
        this.f9099a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ C1456bs call() {
        C1456bs c1456bsM10214a;
        C1460bw c1460bw = (C1460bw) this.f9100b.f8995a.get(this.f9099a);
        if (c1460bw != null) {
            if (!(c1460bw.f9151a + ((Long) bxm.m10409f().m10546a(can.f9509bc)).longValue() < C0710au.m5575k().mo7252a())) {
                c1456bsM10214a = ((Boolean) bxm.m10409f().m10546a(can.f9508bb)).booleanValue() ? new C1457bt(this.f9099a, c1460bw.f9152b).m10214a() : new C1457bt(this.f9099a).m10214a();
            }
        }
        this.f9100b.f8995a.put(this.f9099a, new C1460bw(this.f9100b, c1456bsM10214a));
        return c1456bsM10214a;
    }
}
