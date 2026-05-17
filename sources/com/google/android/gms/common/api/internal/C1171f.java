package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1075b;
import com.google.android.gms.common.api.InterfaceC1193k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.p051b.C0965f;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1171f {

    /* JADX INFO: renamed from: a */
    private final Map<BasePendingResult<?>, Boolean> f5768a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    private final Map<C0965f<?>, Boolean> f5769b = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: a */
    private final void m6982a(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f5768a) {
            map = new HashMap(this.f5768a);
        }
        synchronized (this.f5769b) {
            map2 = new HashMap(this.f5769b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).m6709c(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C0965f) entry2.getKey()).m6220b((Exception) new C1075b(status));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final <TResult> void m6984a(C0965f<TResult> c0965f, boolean z) {
        this.f5769b.put(c0965f, Boolean.valueOf(z));
        c0965f.m6217a().mo6208a(new C1173h(this, c0965f));
    }

    /* JADX INFO: renamed from: a */
    final void m6985a(BasePendingResult<? extends InterfaceC1193k> basePendingResult, boolean z) {
        this.f5768a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo6695a(new C1172g(this, basePendingResult));
    }

    /* JADX INFO: renamed from: a */
    final boolean m6986a() {
        return (this.f5768a.isEmpty() && this.f5769b.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final void m6987b() {
        m6982a(false, C1098am.f5575a);
    }

    /* JADX INFO: renamed from: c */
    public final void m6988c() {
        m6982a(true, C1142cc.f5697a);
    }
}
