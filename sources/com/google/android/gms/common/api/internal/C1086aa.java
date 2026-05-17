package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.C1204c;
import com.google.android.gms.common.C1283m;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.AbstractC1080g;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.InterfaceC1193k;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.internal.C1248bj;
import com.google.android.gms.common.internal.C1259f;
import com.google.android.gms.common.internal.InterfaceC1260g;
import com.google.android.gms.internal.C2018wl;
import com.google.android.gms.internal.afq;
import com.google.android.gms.internal.afr;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.aa */
/* JADX INFO: loaded from: classes.dex */
public final class C1086aa extends AbstractC1079f implements InterfaceC1115bc {

    /* JADX INFO: renamed from: b */
    final Map<C1074a.d<?>, C1074a.f> f5522b;

    /* JADX INFO: renamed from: e */
    final C1142cc f5525e;

    /* JADX INFO: renamed from: f */
    private final Lock f5526f;

    /* JADX INFO: renamed from: h */
    private final C1259f f5528h;

    /* JADX INFO: renamed from: j */
    private final int f5530j;

    /* JADX INFO: renamed from: k */
    private final Context f5531k;

    /* JADX INFO: renamed from: l */
    private final Looper f5532l;

    /* JADX INFO: renamed from: m */
    private volatile boolean f5533m;

    /* JADX INFO: renamed from: p */
    private final HandlerC1091af f5536p;

    /* JADX INFO: renamed from: q */
    private final C1204c f5537q;

    /* JADX INFO: renamed from: r */
    private C1109ax f5538r;

    /* JADX INFO: renamed from: s */
    private C1248bj f5539s;

    /* JADX INFO: renamed from: t */
    private Map<C1074a<?>, Boolean> f5540t;

    /* JADX INFO: renamed from: u */
    private C1074a.b<? extends afq, afr> f5541u;

    /* JADX INFO: renamed from: w */
    private final ArrayList<C1162cw> f5543w;

    /* JADX INFO: renamed from: x */
    private Integer f5544x;

    /* JADX INFO: renamed from: i */
    private InterfaceC1114bb f5529i = null;

    /* JADX INFO: renamed from: a */
    final Queue<AbstractC1155cp<?, ?>> f5521a = new LinkedList();

    /* JADX INFO: renamed from: n */
    private long f5534n = 120000;

    /* JADX INFO: renamed from: o */
    private long f5535o = 5000;

    /* JADX INFO: renamed from: c */
    Set<Scope> f5523c = new HashSet();

    /* JADX INFO: renamed from: v */
    private final C1122bj f5542v = new C1122bj();

    /* JADX INFO: renamed from: d */
    Set<C1138bz> f5524d = null;

    /* JADX INFO: renamed from: y */
    private final InterfaceC1260g f5545y = new C1087ab(this);

    /* JADX INFO: renamed from: g */
    private boolean f5527g = false;

    public C1086aa(Context context, Lock lock, Looper looper, C1248bj c1248bj, C1204c c1204c, C1074a.b<? extends afq, afr> bVar, Map<C1074a<?>, Boolean> map, List<AbstractC1079f.b> list, List<AbstractC1079f.c> list2, Map<C1074a.d<?>, C1074a.f> map2, int i, int i2, ArrayList<C1162cw> arrayList, boolean z) {
        this.f5544x = null;
        this.f5531k = context;
        this.f5526f = lock;
        this.f5528h = new C1259f(looper, this.f5545y);
        this.f5532l = looper;
        this.f5536p = new HandlerC1091af(this, looper);
        this.f5537q = c1204c;
        this.f5530j = i;
        if (this.f5530j >= 0) {
            this.f5544x = Integer.valueOf(i2);
        }
        this.f5540t = map;
        this.f5522b = map2;
        this.f5543w = arrayList;
        this.f5525e = new C1142cc(this.f5522b);
        Iterator<AbstractC1079f.b> it = list.iterator();
        while (it.hasNext()) {
            this.f5528h.m7181a(it.next());
        }
        Iterator<AbstractC1079f.c> it2 = list2.iterator();
        while (it2.hasNext()) {
            this.f5528h.m7182a(it2.next());
        }
        this.f5539s = c1248bj;
        this.f5541u = bVar;
    }

    /* JADX INFO: renamed from: a */
    public static int m6729a(Iterable<C1074a.f> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (C1074a.f fVar : iterable) {
            if (fVar.mo6643i()) {
                z3 = true;
            }
            z2 = fVar.mo6168c() ? true : z2;
        }
        if (z3) {
            return (z2 && z) ? 2 : 1;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m6730a(AbstractC1079f abstractC1079f, C1134bv c1134bv, boolean z) {
        C2018wl.f11898c.mo12541a(abstractC1079f).mo6696a(new C1090ae(this, c1134bv, z, abstractC1079f));
    }

    /* JADX INFO: renamed from: b */
    private final void m6733b(int i) {
        if (this.f5544x == null) {
            this.f5544x = Integer.valueOf(i);
        } else if (this.f5544x.intValue() != i) {
            String strM6736c = m6736c(i);
            String strM6736c2 = m6736c(this.f5544x.intValue());
            throw new IllegalStateException(new StringBuilder(String.valueOf(strM6736c).length() + 51 + String.valueOf(strM6736c2).length()).append("Cannot use sign-in mode: ").append(strM6736c).append(". Mode was already set to ").append(strM6736c2).toString());
        }
        if (this.f5529i != null) {
            return;
        }
        boolean z = false;
        boolean z2 = false;
        for (C1074a.f fVar : this.f5522b.values()) {
            if (fVar.mo6643i()) {
                z2 = true;
            }
            z = fVar.mo6168c() ? true : z;
        }
        switch (this.f5544x.intValue()) {
            case 1:
                if (!z2) {
                    throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                }
                if (z) {
                    throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
                break;
            case 2:
                if (z2) {
                    if (this.f5527g) {
                        this.f5529i = new C1112b(this.f5531k, this.f5526f, this.f5532l, this.f5537q, this.f5522b, this.f5539s, this.f5540t, this.f5541u, this.f5543w, this, true);
                        return;
                    } else {
                        this.f5529i = C1164cy.m6958a(this.f5531k, this, this.f5526f, this.f5532l, this.f5537q, this.f5522b, this.f5539s, this.f5540t, this.f5541u, this.f5543w);
                        return;
                    }
                }
                break;
        }
        if (!this.f5527g || z) {
            this.f5529i = new C1094ai(this.f5531k, this, this.f5526f, this.f5532l, this.f5537q, this.f5522b, this.f5539s, this.f5540t, this.f5541u, this.f5543w, this);
        } else {
            this.f5529i = new C1112b(this.f5531k, this.f5526f, this.f5532l, this.f5537q, this.f5522b, this.f5539s, this.f5540t, this.f5541u, this.f5543w, this, false);
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m6736c(int i) {
        switch (i) {
            case 1:
                return "SIGN_IN_MODE_REQUIRED";
            case 2:
                return "SIGN_IN_MODE_OPTIONAL";
            case 3:
                return "SIGN_IN_MODE_NONE";
            default:
                return "UNKNOWN";
        }
    }

    /* JADX INFO: renamed from: o */
    private final void m6737o() {
        this.f5528h.m7183b();
        this.f5529i.mo6760a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final void m6738p() {
        this.f5526f.lock();
        try {
            if (this.f5533m) {
                m6737o();
            }
        } finally {
            this.f5526f.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final void m6739q() {
        this.f5526f.lock();
        try {
            if (m6743l()) {
                m6737o();
            }
        } finally {
            this.f5526f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f
    /* JADX INFO: renamed from: a */
    public final <C extends C1074a.f> C mo6666a(C1074a.d<C> dVar) {
        C c = (C) this.f5522b.get(dVar);
        C1221aj.m7066a(c, "Appropriate Api was not requested.");
        return c;
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f
    /* JADX INFO: renamed from: a */
    public final <A extends C1074a.c, R extends InterfaceC1193k, T extends AbstractC1155cp<R, A>> T mo6667a(T t) {
        C1221aj.m7075b(t.m6948g() != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean zContainsKey = this.f5522b.containsKey(t.m6948g());
        String strM6632d = t.m6949h() != null ? t.m6949h().m6632d() : "the API";
        C1221aj.m7075b(zContainsKey, new StringBuilder(String.valueOf(strM6632d).length() + 65).append("GoogleApiClient is not configured to use ").append(strM6632d).append(" required for this call.").toString());
        this.f5526f.lock();
        try {
            if (this.f5529i == null) {
                this.f5521a.add(t);
            } else {
                t = (T) this.f5529i.mo6759a(t);
            }
            return t;
        } finally {
            this.f5526f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f
    /* JADX INFO: renamed from: a */
    public final void mo6668a(int i) {
        boolean z = true;
        this.f5526f.lock();
        if (i != 3 && i != 1 && i != 2) {
            z = false;
        }
        try {
            C1221aj.m7075b(z, new StringBuilder(33).append("Illegal sign-in mode: ").append(i).toString());
            m6733b(i);
            m6737o();
        } finally {
            this.f5526f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1115bc
    /* JADX INFO: renamed from: a */
    public final void mo6740a(int i, boolean z) {
        if (i == 1 && !z && !this.f5533m) {
            this.f5533m = true;
            if (this.f5538r == null) {
                this.f5538r = C1204c.m7034a(this.f5531k.getApplicationContext(), new C1092ag(this));
            }
            this.f5536p.sendMessageDelayed(this.f5536p.obtainMessage(1), this.f5534n);
            this.f5536p.sendMessageDelayed(this.f5536p.obtainMessage(2), this.f5535o);
        }
        this.f5525e.m6922b();
        this.f5528h.m7178a(i);
        this.f5528h.m7177a();
        if (i == 2) {
            m6737o();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1115bc
    /* JADX INFO: renamed from: a */
    public final void mo6741a(Bundle bundle) {
        while (!this.f5521a.isEmpty()) {
            mo6674b(this.f5521a.remove());
        }
        this.f5528h.m7179a(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1115bc
    /* JADX INFO: renamed from: a */
    public final void mo6742a(C1071a c1071a) {
        if (!C1283m.m7223b(this.f5531k, c1071a.m6613c())) {
            m6743l();
        }
        if (this.f5533m) {
            return;
        }
        this.f5528h.m7180a(c1071a);
        this.f5528h.m7177a();
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f
    /* JADX INFO: renamed from: a */
    public final void mo6669a(AbstractC1079f.c cVar) {
        this.f5528h.m7182a(cVar);
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f
    /* JADX INFO: renamed from: a */
    public final void mo6670a(C1138bz c1138bz) {
        this.f5526f.lock();
        try {
            if (this.f5524d == null) {
                this.f5524d = new HashSet();
            }
            this.f5524d.add(c1138bz);
        } finally {
            this.f5526f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f
    /* JADX INFO: renamed from: a */
    public final void mo6671a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f5531k);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f5533m);
        printWriter.append(" mWorkQueue.size()=").print(this.f5521a.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f5525e.f5699b.size());
        if (this.f5529i != null) {
            this.f5529i.mo6765a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f
    /* JADX INFO: renamed from: a */
    public final boolean mo6672a(InterfaceC1128bp interfaceC1128bp) {
        return this.f5529i != null && this.f5529i.mo6766a(interfaceC1128bp);
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f
    /* JADX INFO: renamed from: b */
    public final Context mo6673b() {
        return this.f5531k;
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f
    /* JADX INFO: renamed from: b */
    public final <A extends C1074a.c, T extends AbstractC1155cp<? extends InterfaceC1193k, A>> T mo6674b(T t) {
        C1221aj.m7075b(t.m6948g() != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean zContainsKey = this.f5522b.containsKey(t.m6948g());
        String strM6632d = t.m6949h() != null ? t.m6949h().m6632d() : "the API";
        C1221aj.m7075b(zContainsKey, new StringBuilder(String.valueOf(strM6632d).length() + 65).append("GoogleApiClient is not configured to use ").append(strM6632d).append(" required for this call.").toString());
        this.f5526f.lock();
        try {
            if (this.f5529i == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.f5533m) {
                this.f5521a.add(t);
                while (!this.f5521a.isEmpty()) {
                    AbstractC1155cp<?, ?> abstractC1155cpRemove = this.f5521a.remove();
                    this.f5525e.m6921a(abstractC1155cpRemove);
                    abstractC1155cpRemove.m6946b(Status.f5453c);
                }
            } else {
                t = (T) this.f5529i.mo6768b(t);
            }
            return t;
        } finally {
            this.f5526f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f
    /* JADX INFO: renamed from: b */
    public final void mo6675b(AbstractC1079f.c cVar) {
        this.f5528h.m7184b(cVar);
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f
    /* JADX INFO: renamed from: b */
    public final void mo6676b(C1138bz c1138bz) {
        this.f5526f.lock();
        try {
            if (this.f5524d == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (!this.f5524d.remove(c1138bz)) {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            } else if (!m6744m()) {
                this.f5529i.mo6773g();
            }
        } finally {
            this.f5526f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f
    /* JADX INFO: renamed from: c */
    public final Looper mo6677c() {
        return this.f5532l;
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f
    /* JADX INFO: renamed from: d */
    public final void mo6678d() {
        if (this.f5529i != null) {
            this.f5529i.mo6772f();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f
    /* JADX INFO: renamed from: e */
    public final void mo6679e() {
        this.f5526f.lock();
        try {
            if (this.f5530j >= 0) {
                C1221aj.m7071a(this.f5544x != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f5544x == null) {
                this.f5544x = Integer.valueOf(m6729a((Iterable<C1074a.f>) this.f5522b.values(), false));
            } else if (this.f5544x.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            mo6668a(this.f5544x.intValue());
        } finally {
            this.f5526f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f
    /* JADX INFO: renamed from: f */
    public final C1071a mo6680f() {
        C1221aj.m7071a(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.f5526f.lock();
        try {
            if (this.f5530j >= 0) {
                C1221aj.m7071a(this.f5544x != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f5544x == null) {
                this.f5544x = Integer.valueOf(m6729a((Iterable<C1074a.f>) this.f5522b.values(), false));
            } else if (this.f5544x.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            m6733b(this.f5544x.intValue());
            this.f5528h.m7183b();
            return this.f5529i.mo6767b();
        } finally {
            this.f5526f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f
    /* JADX INFO: renamed from: g */
    public final void mo6681g() {
        this.f5526f.lock();
        try {
            this.f5525e.m6920a();
            if (this.f5529i != null) {
                this.f5529i.mo6769c();
            }
            this.f5542v.m6889a();
            for (AbstractC1155cp<?, ?> abstractC1155cp : this.f5521a) {
                abstractC1155cp.m6707a((InterfaceC1145cf) null);
                abstractC1155cp.mo6694a();
            }
            this.f5521a.clear();
            if (this.f5529i == null) {
                return;
            }
            m6743l();
            this.f5528h.m7177a();
        } finally {
            this.f5526f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f
    /* JADX INFO: renamed from: h */
    public final void mo6682h() {
        mo6681g();
        mo6679e();
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f
    /* JADX INFO: renamed from: i */
    public final AbstractC1080g<Status> mo6683i() {
        C1221aj.m7071a(mo6684j(), "GoogleApiClient is not connected yet.");
        C1221aj.m7071a(this.f5544x.intValue() != 2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        C1134bv c1134bv = new C1134bv(this);
        if (this.f5522b.containsKey(C2018wl.f11896a)) {
            m6730a(this, c1134bv, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            AbstractC1079f abstractC1079fM6693b = new AbstractC1079f.a(this.f5531k).m6688a(C2018wl.f11897b).m6690a(new C1088ac(this, atomicReference, c1134bv)).m6691a(new C1089ad(this, c1134bv)).m6685a(this.f5536p).m6693b();
            atomicReference.set(abstractC1079fM6693b);
            abstractC1079fM6693b.mo6679e();
        }
        return c1134bv;
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f
    /* JADX INFO: renamed from: j */
    public final boolean mo6684j() {
        return this.f5529i != null && this.f5529i.mo6770d();
    }

    /* JADX INFO: renamed from: l */
    final boolean m6743l() {
        if (!this.f5533m) {
            return false;
        }
        this.f5533m = false;
        this.f5536p.removeMessages(2);
        this.f5536p.removeMessages(1);
        if (this.f5538r != null) {
            this.f5538r.m6845a();
            this.f5538r = null;
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    final boolean m6744m() {
        this.f5526f.lock();
        try {
            if (this.f5524d != null) {
                z = this.f5524d.isEmpty() ? false : true;
            }
            return z;
        } finally {
            this.f5526f.unlock();
        }
    }

    /* JADX INFO: renamed from: n */
    final String m6745n() {
        StringWriter stringWriter = new StringWriter();
        mo6671a("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        return stringWriter.toString();
    }
}
