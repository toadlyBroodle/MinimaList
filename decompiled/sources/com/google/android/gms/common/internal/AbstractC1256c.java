package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C1204c;
import com.google.android.gms.common.C1281k;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1256c<T extends IInterface> extends AbstractC1233av<T> implements C1074a.f, InterfaceC1260g {

    /* JADX INFO: renamed from: d */
    private final C1248bj f5936d;

    /* JADX INFO: renamed from: e */
    private final Set<Scope> f5937e;

    /* JADX INFO: renamed from: f */
    private final Account f5938f;

    protected AbstractC1256c(Context context, Looper looper, int i, C1248bj c1248bj, AbstractC1079f.b bVar, AbstractC1079f.c cVar) {
        this(context, looper, AbstractC1261h.m7185a(context), C1204c.m7035a(), i, c1248bj, (AbstractC1079f.b) C1221aj.m7065a(bVar), (AbstractC1079f.c) C1221aj.m7065a(cVar));
    }

    private AbstractC1256c(Context context, Looper looper, AbstractC1261h abstractC1261h, C1204c c1204c, int i, C1248bj c1248bj, AbstractC1079f.b bVar, AbstractC1079f.c cVar) {
        super(context, looper, abstractC1261h, c1204c, i, bVar == null ? null : new C1257d(bVar), cVar == null ? null : new C1258e(cVar), c1248bj.m7155h());
        this.f5936d = c1248bj;
        this.f5938f = c1248bj.m7149b();
        Set<Scope> setM7152e = c1248bj.m7152e();
        Set<Scope> setM7175a = m7175a(setM7152e);
        Iterator<Scope> it = setM7175a.iterator();
        while (it.hasNext()) {
            if (!setM7152e.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f5937e = setM7175a;
    }

    /* JADX INFO: renamed from: a */
    protected Set<Scope> m7175a(Set<Scope> set) {
        return set;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: m_ */
    public final Account mo7122m_() {
        return this.f5938f;
    }

    /* JADX INFO: renamed from: n */
    protected final C1248bj m7176n() {
        return this.f5936d;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: o */
    protected final Set<Scope> mo7123o() {
        return this.f5937e;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: p */
    public C1281k[] mo7124p() {
        return new C1281k[0];
    }
}
