package com.google.firebase.auth;

import android.support.annotation.Keep;
import android.support.v4.p018i.C0207a;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.ayv;
import com.google.android.gms.internal.aze;
import com.google.android.gms.internal.azj;
import com.google.android.gms.internal.azm;
import com.google.android.gms.internal.bae;
import com.google.android.gms.p051b.AbstractC0964e;
import com.google.android.gms.p051b.C0967h;
import com.google.firebase.C2213b;
import com.google.firebase.auth.internal.C2183f;
import com.google.firebase.auth.internal.C2191n;
import com.google.firebase.auth.internal.C2192o;
import com.google.firebase.auth.internal.ExecutorC2194q;
import com.google.firebase.auth.internal.InterfaceC2178a;
import com.google.firebase.auth.internal.InterfaceC2195r;
import com.google.firebase.p053a.C2151d;
import com.google.firebase.p053a.InterfaceC2147a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseAuth implements InterfaceC2147a {

    /* JADX INFO: renamed from: j */
    private static Map<String, FirebaseAuth> f12777j = new C0207a();

    /* JADX INFO: renamed from: k */
    private static FirebaseAuth f12778k;

    /* JADX INFO: renamed from: a */
    private C2213b f12779a;

    /* JADX INFO: renamed from: b */
    private List<InterfaceC2156b> f12780b;

    /* JADX INFO: renamed from: c */
    private List<InterfaceC2155a> f12781c;

    /* JADX INFO: renamed from: d */
    private ayv f12782d;

    /* JADX INFO: renamed from: e */
    private AbstractC2198l f12783e;

    /* JADX INFO: renamed from: f */
    private final Object f12784f;

    /* JADX INFO: renamed from: g */
    private C2191n f12785g;

    /* JADX INFO: renamed from: h */
    private C2192o f12786h;

    /* JADX INFO: renamed from: i */
    private ExecutorC2194q f12787i;

    /* JADX INFO: renamed from: com.google.firebase.auth.FirebaseAuth$a */
    public interface InterfaceC2155a {
        /* JADX INFO: renamed from: a */
        void mo4978a(FirebaseAuth firebaseAuth);
    }

    /* JADX INFO: renamed from: com.google.firebase.auth.FirebaseAuth$b */
    public interface InterfaceC2156b {
        /* JADX INFO: renamed from: a */
        void m12844a(FirebaseAuth firebaseAuth);
    }

    /* JADX INFO: renamed from: com.google.firebase.auth.FirebaseAuth$c */
    class C2157c implements InterfaceC2178a {
        C2157c() {
        }

        @Override // com.google.firebase.auth.internal.InterfaceC2178a
        /* JADX INFO: renamed from: a */
        public final void mo12845a(bae baeVar, AbstractC2198l abstractC2198l) {
            C1221aj.m7065a(baeVar);
            C1221aj.m7065a(abstractC2198l);
            abstractC2198l.mo12867a(baeVar);
            FirebaseAuth.this.m12840a(abstractC2198l, baeVar, true);
        }
    }

    public FirebaseAuth(C2213b c2213b) {
        this(c2213b, azj.m8734a(c2213b.m12929a(), new azm(c2213b.m12937c().m13023a()).m8736a()), new C2191n(c2213b.m12929a(), c2213b.m12939f()));
    }

    private FirebaseAuth(C2213b c2213b, ayv ayvVar, C2191n c2191n) {
        bae baeVarM12893b;
        this.f12784f = new Object();
        this.f12779a = (C2213b) C1221aj.m7065a(c2213b);
        this.f12782d = (ayv) C1221aj.m7065a(ayvVar);
        this.f12785g = (C2191n) C1221aj.m7065a(c2191n);
        this.f12780b = new CopyOnWriteArrayList();
        this.f12781c = new CopyOnWriteArrayList();
        this.f12787i = ExecutorC2194q.m12900a();
        this.f12783e = this.f12785g.m12889a();
        if (this.f12783e == null || (baeVarM12893b = this.f12785g.m12893b(this.f12783e)) == null) {
            return;
        }
        m12840a(this.f12783e, baeVarM12893b, false);
    }

    /* JADX INFO: renamed from: a */
    private static synchronized FirebaseAuth m12828a(C2213b c2213b) {
        FirebaseAuth c2183f;
        c2183f = f12777j.get(c2213b.m12939f());
        if (c2183f == null) {
            c2183f = new C2183f(c2213b);
            c2213b.m12930a(c2183f);
            if (f12778k == null) {
                f12778k = c2183f;
            }
            f12777j.put(c2213b.m12939f(), c2183f);
        }
        return c2183f;
    }

    /* JADX INFO: renamed from: a */
    private final synchronized void m12830a(C2192o c2192o) {
        this.f12786h = c2192o;
        this.f12779a.m12934a(c2192o);
    }

    /* JADX INFO: renamed from: a */
    private final void m12831a(AbstractC2198l abstractC2198l) {
        if (abstractC2198l != null) {
            String strMo12866a = abstractC2198l.mo12866a();
            Log.d("FirebaseAuth", new StringBuilder(String.valueOf(strMo12866a).length() + 45).append("Notifying id token listeners about user ( ").append(strMo12866a).append(" ).").toString());
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        this.f12787i.execute(new RunnableC2161ac(this, new C2151d(abstractC2198l != null ? abstractC2198l.mo12877i() : null)));
    }

    /* JADX INFO: renamed from: b */
    private final void m12833b(AbstractC2198l abstractC2198l) {
        if (abstractC2198l != null) {
            String strMo12866a = abstractC2198l.mo12866a();
            Log.d("FirebaseAuth", new StringBuilder(String.valueOf(strMo12866a).length() + 47).append("Notifying auth state listeners about user ( ").append(strMo12866a).append(" ).").toString());
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        this.f12787i.execute(new RunnableC2162ad(this));
    }

    /* JADX INFO: renamed from: d */
    private final synchronized C2192o m12835d() {
        if (this.f12786h == null) {
            m12830a(new C2192o(this.f12779a));
        }
        return this.f12786h;
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return m12828a(C2213b.m12924d());
    }

    @Keep
    public static FirebaseAuth getInstance(C2213b c2213b) {
        return m12828a(c2213b);
    }

    /* JADX INFO: renamed from: a */
    public AbstractC0964e<Object> m12836a(AbstractC2158a abstractC2158a) {
        C1221aj.m7065a(abstractC2158a);
        if (abstractC2158a instanceof C2169b) {
            C2169b c2169b = (C2169b) abstractC2158a;
            return this.f12782d.m8707a(this.f12779a, c2169b.m12848b(), c2169b.m12849c(), new C2157c());
        }
        if (!(abstractC2158a instanceof C2204r)) {
            return this.f12782d.m8704a(this.f12779a, abstractC2158a, new C2157c());
        }
        return this.f12782d.m8706a(this.f12779a, (C2204r) abstractC2158a, (InterfaceC2178a) new C2157c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.firebase.auth.ae, com.google.firebase.auth.internal.r] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final AbstractC0964e<C2200n> m12837a(AbstractC2198l abstractC2198l, boolean z) {
        if (abstractC2198l == null) {
            return C0967h.m6222a((Exception) aze.m8713a(new Status(17495)));
        }
        bae baeVarMo12875g = this.f12783e.mo12875g();
        return (!baeVarMo12875g.m8767a() || z) ? this.f12782d.m8705a(this.f12779a, abstractC2198l, baeVarMo12875g.m8768b(), (InterfaceC2195r) new C2163ae(this)) : C0967h.m6223a(new C2200n(baeVarMo12875g.m8769c()));
    }

    @Override // com.google.firebase.p053a.InterfaceC2147a
    /* JADX INFO: renamed from: a */
    public final AbstractC0964e<C2200n> mo12821a(boolean z) {
        return m12837a(this.f12783e, z);
    }

    /* JADX INFO: renamed from: a */
    public AbstractC2198l m12838a() {
        return this.f12783e;
    }

    /* JADX INFO: renamed from: a */
    public void m12839a(InterfaceC2155a interfaceC2155a) {
        this.f12781c.add(interfaceC2155a);
        this.f12787i.execute(new RunnableC2160ab(this, interfaceC2155a));
    }

    /* JADX INFO: renamed from: a */
    public final void m12840a(AbstractC2198l abstractC2198l, bae baeVar, boolean z) {
        boolean z2;
        boolean z3 = true;
        C1221aj.m7065a(abstractC2198l);
        C1221aj.m7065a(baeVar);
        if (this.f12783e == null) {
            z2 = true;
        } else {
            boolean z4 = !this.f12783e.mo12875g().m8769c().equals(baeVar.m8769c());
            boolean zEquals = this.f12783e.mo12866a().equals(abstractC2198l.mo12866a());
            z2 = !zEquals || z4;
            if (zEquals) {
                z3 = false;
            }
        }
        C1221aj.m7065a(abstractC2198l);
        if (this.f12783e == null) {
            this.f12783e = abstractC2198l;
        } else {
            this.f12783e.mo12865a(abstractC2198l.mo12870b());
            this.f12783e.mo12864a(abstractC2198l.mo12871c());
        }
        if (z) {
            this.f12785g.m12890a(this.f12783e);
        }
        if (z2) {
            if (this.f12783e != null) {
                this.f12783e.mo12867a(baeVar);
            }
            m12831a(this.f12783e);
        }
        if (z3) {
            m12833b(this.f12783e);
        }
        if (z) {
            this.f12785g.m12891a(abstractC2198l, baeVar);
        }
        m12835d().m12899a(this.f12783e.mo12875g());
    }

    /* JADX INFO: renamed from: b */
    public final void m12841b() {
        if (this.f12783e != null) {
            C2191n c2191n = this.f12785g;
            AbstractC2198l abstractC2198l = this.f12783e;
            C1221aj.m7065a(abstractC2198l);
            c2191n.m12892a(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC2198l.mo12866a()));
            this.f12783e = null;
        }
        this.f12785g.m12892a("com.google.firebase.auth.FIREBASE_USER");
        m12831a((AbstractC2198l) null);
        m12833b((AbstractC2198l) null);
    }

    /* JADX INFO: renamed from: b */
    public void m12842b(InterfaceC2155a interfaceC2155a) {
        this.f12781c.remove(interfaceC2155a);
    }

    /* JADX INFO: renamed from: c */
    public void m12843c() {
        m12841b();
        if (this.f12786h != null) {
            this.f12786h.m12898a();
        }
    }
}
