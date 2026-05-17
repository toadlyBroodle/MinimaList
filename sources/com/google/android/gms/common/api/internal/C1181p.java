package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.internal.InterfaceC1240bb;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.p */
/* JADX INFO: loaded from: classes.dex */
final class C1181p implements InterfaceC1240bb {

    /* JADX INFO: renamed from: a */
    private final WeakReference<C1179n> f5803a;

    /* JADX INFO: renamed from: b */
    private final C1074a<?> f5804b;

    /* JADX INFO: renamed from: c */
    private final boolean f5805c;

    public C1181p(C1179n c1179n, C1074a<?> c1074a, boolean z) {
        this.f5803a = new WeakReference<>(c1179n);
        this.f5804b = c1074a;
        this.f5805c = z;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1240bb
    /* JADX INFO: renamed from: a */
    public final void mo6842a(C1071a c1071a) {
        C1179n c1179n = this.f5803a.get();
        if (c1179n == null) {
            return;
        }
        C1221aj.m7071a(Looper.myLooper() == c1179n.f5781a.f5560d.mo6677c(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        c1179n.f5782b.lock();
        try {
            if (c1179n.m7004b(0)) {
                if (!c1071a.m6612b()) {
                    c1179n.m7003b(c1071a, this.f5804b, this.f5805c);
                }
                if (c1179n.m7009d()) {
                    c1179n.m7010e();
                }
            }
        } finally {
            c1179n.f5782b.unlock();
        }
    }
}
