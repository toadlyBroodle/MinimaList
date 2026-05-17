package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.p006a.ActivityC0155k;
import android.support.v4.p018i.C0207a;
import android.view.View;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.C1204c;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.internal.AbstractC1155cp;
import com.google.android.gms.common.api.internal.C1086aa;
import com.google.android.gms.common.api.internal.C1116bd;
import com.google.android.gms.common.api.internal.C1138bz;
import com.google.android.gms.common.api.internal.C1151cl;
import com.google.android.gms.common.api.internal.C1162cw;
import com.google.android.gms.common.api.internal.InterfaceC1128bp;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.internal.C1248bj;
import com.google.android.gms.common.internal.C1250bl;
import com.google.android.gms.internal.afn;
import com.google.android.gms.internal.afq;
import com.google.android.gms.internal.afr;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.google.android.gms.common.api.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1079f {

    /* JADX INFO: renamed from: a */
    private static final Set<AbstractC1079f> f5481a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: com.google.android.gms.common.api.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private Account f5482a;

        /* JADX INFO: renamed from: d */
        private int f5485d;

        /* JADX INFO: renamed from: e */
        private View f5486e;

        /* JADX INFO: renamed from: f */
        private String f5487f;

        /* JADX INFO: renamed from: g */
        private String f5488g;

        /* JADX INFO: renamed from: i */
        private final Context f5490i;

        /* JADX INFO: renamed from: k */
        private C1116bd f5492k;

        /* JADX INFO: renamed from: m */
        private c f5494m;

        /* JADX INFO: renamed from: n */
        private Looper f5495n;

        /* JADX INFO: renamed from: b */
        private final Set<Scope> f5483b = new HashSet();

        /* JADX INFO: renamed from: c */
        private final Set<Scope> f5484c = new HashSet();

        /* JADX INFO: renamed from: h */
        private final Map<C1074a<?>, C1250bl> f5489h = new C0207a();

        /* JADX INFO: renamed from: j */
        private final Map<C1074a<?>, C1074a.a> f5491j = new C0207a();

        /* JADX INFO: renamed from: l */
        private int f5493l = -1;

        /* JADX INFO: renamed from: o */
        private C1204c f5496o = C1204c.m7035a();

        /* JADX INFO: renamed from: p */
        private C1074a.b<? extends afq, afr> f5497p = afn.f6658a;

        /* JADX INFO: renamed from: q */
        private final ArrayList<b> f5498q = new ArrayList<>();

        /* JADX INFO: renamed from: r */
        private final ArrayList<c> f5499r = new ArrayList<>();

        /* JADX INFO: renamed from: s */
        private boolean f5500s = false;

        public a(Context context) {
            this.f5490i = context;
            this.f5495n = context.getMainLooper();
            this.f5487f = context.getPackageName();
            this.f5488g = context.getClass().getName();
        }

        /* JADX INFO: renamed from: a */
        public final a m6685a(Handler handler) {
            C1221aj.m7066a(handler, "Handler must not be null");
            this.f5495n = handler.getLooper();
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m6686a(ActivityC0155k activityC0155k, int i, c cVar) {
            C1116bd c1116bd = new C1116bd(activityC0155k);
            C1221aj.m7075b(i >= 0, "clientId must be non-negative");
            this.f5493l = i;
            this.f5494m = cVar;
            this.f5492k = c1116bd;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m6687a(ActivityC0155k activityC0155k, c cVar) {
            return m6686a(activityC0155k, 0, cVar);
        }

        /* JADX INFO: renamed from: a */
        public final a m6688a(C1074a<? extends C1074a.a.d> c1074a) {
            C1221aj.m7066a(c1074a, "Api must not be null");
            this.f5491j.put(c1074a, null);
            List<Scope> listMo6110a = c1074a.m6629a().mo6110a(null);
            this.f5484c.addAll(listMo6110a);
            this.f5483b.addAll(listMo6110a);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final <O extends C1074a.a.c> a m6689a(C1074a<O> c1074a, O o) {
            C1221aj.m7066a(c1074a, "Api must not be null");
            C1221aj.m7066a(o, "Null options are not permitted for this Api");
            this.f5491j.put(c1074a, o);
            List<Scope> listMo6110a = c1074a.m6629a().mo6110a(o);
            this.f5484c.addAll(listMo6110a);
            this.f5483b.addAll(listMo6110a);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m6690a(b bVar) {
            C1221aj.m7066a(bVar, "Listener must not be null");
            this.f5498q.add(bVar);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m6691a(c cVar) {
            C1221aj.m7066a(cVar, "Listener must not be null");
            this.f5499r.add(cVar);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1248bj m6692a() {
            afr afrVar = afr.f6666a;
            if (this.f5491j.containsKey(afn.f6659b)) {
                afrVar = (afr) this.f5491j.get(afn.f6659b);
            }
            return new C1248bj(this.f5482a, this.f5483b, this.f5489h, this.f5485d, this.f5486e, this.f5487f, this.f5488g, afrVar);
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC1079f m6693b() {
            C1221aj.m7075b(!this.f5491j.isEmpty(), "must call addApi() to add at least one API");
            C1248bj c1248bjM6692a = m6692a();
            C1074a<?> c1074a = null;
            Map<C1074a<?>, C1250bl> mapM7153f = c1248bjM6692a.m7153f();
            C0207a c0207a = new C0207a();
            C0207a c0207a2 = new C0207a();
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C1074a<?> c1074a2 : this.f5491j.keySet()) {
                C1074a.a aVar = this.f5491j.get(c1074a2);
                boolean z2 = mapM7153f.get(c1074a2) != null;
                c0207a.put(c1074a2, Boolean.valueOf(z2));
                C1162cw c1162cw = new C1162cw(c1074a2, z2);
                arrayList.add(c1162cw);
                C1074a.b<?, O> bVarM6630b = c1074a2.m6630b();
                C1074a.f fVarMo6098a = bVarM6630b.mo6098a(this.f5490i, this.f5495n, c1248bjM6692a, aVar, c1162cw, c1162cw);
                c0207a2.put(c1074a2.m6631c(), fVarMo6098a);
                boolean z3 = bVarM6630b.m6635a() == 1 ? aVar != null : z;
                if (!fVarMo6098a.mo6168c()) {
                    c1074a2 = c1074a;
                } else if (c1074a != null) {
                    String strM6632d = c1074a2.m6632d();
                    String strM6632d2 = c1074a.m6632d();
                    throw new IllegalStateException(new StringBuilder(String.valueOf(strM6632d).length() + 21 + String.valueOf(strM6632d2).length()).append(strM6632d).append(" cannot be used with ").append(strM6632d2).toString());
                }
                z = z3;
                c1074a = c1074a2;
            }
            if (c1074a != null) {
                if (z) {
                    String strM6632d3 = c1074a.m6632d();
                    throw new IllegalStateException(new StringBuilder(String.valueOf(strM6632d3).length() + 82).append("With using ").append(strM6632d3).append(", GamesOptions can only be specified within GoogleSignInOptions.Builder").toString());
                }
                C1221aj.m7072a(this.f5482a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", c1074a.m6632d());
                C1221aj.m7072a(this.f5483b.equals(this.f5484c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", c1074a.m6632d());
            }
            C1086aa c1086aa = new C1086aa(this.f5490i, new ReentrantLock(), this.f5495n, c1248bjM6692a, this.f5496o, this.f5497p, c0207a, this.f5498q, this.f5499r, c0207a2, this.f5493l, C1086aa.m6729a((Iterable<C1074a.f>) c0207a2.values(), true), arrayList, false);
            synchronized (AbstractC1079f.f5481a) {
                AbstractC1079f.f5481a.add(c1086aa);
            }
            if (this.f5493l >= 0) {
                C1151cl.m6931b(this.f5492k).m6933a(this.f5493l, c1086aa, this.f5494m);
            }
            return c1086aa;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.f$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo6386a(int i);

        /* JADX INFO: renamed from: a */
        void mo6387a(Bundle bundle);
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.f$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo4766a(C1071a c1071a);
    }

    /* JADX INFO: renamed from: a */
    public static Set<AbstractC1079f> m6664a() {
        Set<AbstractC1079f> set;
        synchronized (f5481a) {
            set = f5481a;
        }
        return set;
    }

    /* JADX INFO: renamed from: a */
    public <C extends C1074a.f> C mo6666a(C1074a.d<C> dVar) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: a */
    public <A extends C1074a.c, R extends InterfaceC1193k, T extends AbstractC1155cp<R, A>> T mo6667a(T t) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: a */
    public void mo6668a(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo6669a(c cVar);

    /* JADX INFO: renamed from: a */
    public void mo6670a(C1138bz c1138bz) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo6671a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* JADX INFO: renamed from: a */
    public boolean mo6672a(InterfaceC1128bp interfaceC1128bp) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: b */
    public Context mo6673b() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: b */
    public <A extends C1074a.c, T extends AbstractC1155cp<? extends InterfaceC1193k, A>> T mo6674b(T t) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo6675b(c cVar);

    /* JADX INFO: renamed from: b */
    public void mo6676b(C1138bz c1138bz) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: c */
    public Looper mo6677c() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: d */
    public void mo6678d() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo6679e();

    /* JADX INFO: renamed from: f */
    public abstract C1071a mo6680f();

    /* JADX INFO: renamed from: g */
    public abstract void mo6681g();

    /* JADX INFO: renamed from: h */
    public abstract void mo6682h();

    /* JADX INFO: renamed from: i */
    public abstract AbstractC1080g<Status> mo6683i();

    /* JADX INFO: renamed from: j */
    public abstract boolean mo6684j();
}
