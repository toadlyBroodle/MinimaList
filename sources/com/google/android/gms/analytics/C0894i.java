package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.C1818pa;
import com.google.android.gms.internal.C1822pe;
import com.google.android.gms.internal.C1834pq;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.google.android.gms.analytics.i */
/* JADX INFO: loaded from: classes.dex */
public class C0894i extends C0902q<C0894i> {

    /* JADX INFO: renamed from: b */
    private final C1834pq f4944b;

    /* JADX INFO: renamed from: c */
    private boolean f4945c;

    public C0894i(C1834pq c1834pq) {
        super(c1834pq.m12062g(), c1834pq.m12058c());
        this.f4944b = c1834pq;
    }

    @Override // com.google.android.gms.analytics.C0902q
    /* JADX INFO: renamed from: a */
    protected final void mo6024a(C0900o c0900o) {
        C1818pa c1818pa = (C1818pa) c0900o.m6055b(C1818pa.class);
        if (TextUtils.isEmpty(c1818pa.m11982b())) {
            c1818pa.m11983b(this.f4944b.m12070o().m12154b());
        }
        if (this.f4945c && TextUtils.isEmpty(c1818pa.m11987d())) {
            C1822pe c1822peM12069n = this.f4944b.m12069n();
            c1818pa.m11988d(c1822peM12069n.m12003c());
            c1818pa.m11981a(c1822peM12069n.m12002b());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6025b(String str) {
        C1221aj.m7067a(str);
        Uri uriM6029a = C0895j.m6029a(str);
        ListIterator<InterfaceC0906u> listIterator = this.f4964a.m6057c().listIterator();
        while (listIterator.hasNext()) {
            if (uriM6029a.equals(listIterator.next().mo6036a())) {
                listIterator.remove();
            }
        }
        this.f4964a.m6057c().add(new C0895j(this.f4944b, str));
    }

    /* JADX INFO: renamed from: b */
    public final void m6026b(boolean z) {
        this.f4945c = z;
    }

    /* JADX INFO: renamed from: g */
    final C1834pq m6027g() {
        return this.f4944b;
    }

    @Override // com.google.android.gms.analytics.C0902q
    /* JADX INFO: renamed from: h */
    public final C0900o mo6028h() {
        C0900o c0900oM6051a = this.f4964a.m6051a();
        c0900oM6051a.m6054a(this.f4944b.m12071p().m12122b());
        c0900oM6051a.m6054a(this.f4944b.m12072q().m12190b());
        m6069b(c0900oM6051a);
        return c0900oM6051a;
    }
}
