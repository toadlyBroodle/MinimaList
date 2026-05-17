package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.C1074a.a;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.internal.C1248bj;
import com.google.android.gms.common.internal.InterfaceC1240bb;
import com.google.android.gms.common.internal.InterfaceC1246bh;
import com.google.android.gms.common.internal.InterfaceC1268o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.common.api.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1074a<O extends a> {

    /* JADX INFO: renamed from: a */
    private final b<?, O> f5462a;

    /* JADX INFO: renamed from: b */
    private final i<?, O> f5463b;

    /* JADX INFO: renamed from: c */
    private final g<?> f5464c;

    /* JADX INFO: renamed from: d */
    private final j<?> f5465d;

    /* JADX INFO: renamed from: e */
    private final String f5466e;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$a */
    public interface a {

        /* JADX INFO: renamed from: com.google.android.gms.common.api.a$a$a, reason: collision with other inner class name */
        public interface InterfaceC2332a extends c, d {
            /* JADX INFO: renamed from: a */
            Account m6633a();
        }

        /* JADX INFO: renamed from: com.google.android.gms.common.api.a$a$b */
        public interface b extends c {
            /* JADX INFO: renamed from: a */
            GoogleSignInAccount m6634a();
        }

        /* JADX INFO: renamed from: com.google.android.gms.common.api.a$a$c */
        public interface c extends a {
        }

        /* JADX INFO: renamed from: com.google.android.gms.common.api.a$a$d */
        public interface d extends a {
        }

        /* JADX INFO: renamed from: com.google.android.gms.common.api.a$a$e */
        public interface e extends c, d {
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$b */
    public static abstract class b<T extends f, O> extends e<T, O> {
        /* JADX INFO: renamed from: a */
        public abstract T mo6098a(Context context, Looper looper, C1248bj c1248bj, O o, AbstractC1079f.b bVar, AbstractC1079f.c cVar);
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$c */
    public interface c {
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$d */
    public static class d<C extends c> {
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$e */
    public static abstract class e<T extends c, O> {
        /* JADX INFO: renamed from: a */
        public int m6635a() {
            return Integer.MAX_VALUE;
        }

        /* JADX INFO: renamed from: a */
        public List<Scope> mo6110a(O o) {
            return Collections.emptyList();
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$f */
    public interface f extends c {
        /* JADX INFO: renamed from: a */
        void m6636a(InterfaceC1240bb interfaceC1240bb);

        /* JADX INFO: renamed from: a */
        void m6637a(InterfaceC1246bh interfaceC1246bh);

        /* JADX INFO: renamed from: a */
        void m6638a(InterfaceC1268o interfaceC1268o, Set<Scope> set);

        /* JADX INFO: renamed from: a */
        void m6639a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        /* JADX INFO: renamed from: c */
        boolean mo6168c();

        /* JADX INFO: renamed from: d */
        Intent mo6169d();

        /* JADX INFO: renamed from: f */
        void mo6640f();

        /* JADX INFO: renamed from: g */
        boolean m6641g();

        /* JADX INFO: renamed from: h */
        boolean m6642h();

        /* JADX INFO: renamed from: i */
        boolean mo6643i();

        /* JADX INFO: renamed from: j */
        boolean mo6644j();

        /* JADX INFO: renamed from: k */
        IBinder m6645k();

        /* JADX INFO: renamed from: l */
        String m6646l();
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$g */
    public static final class g<C extends f> extends d<C> {
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$h */
    public interface h<T extends IInterface> extends c {
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$i */
    public static abstract class i<T extends h, O> extends e<T, O> {
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$j */
    public static final class j<C extends h> extends d<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends f> C1074a(String str, b<C, O> bVar, g<C> gVar) {
        C1221aj.m7066a(bVar, "Cannot construct an Api with a null ClientBuilder");
        C1221aj.m7066a(gVar, "Cannot construct an Api with a null ClientKey");
        this.f5466e = str;
        this.f5462a = bVar;
        this.f5463b = null;
        this.f5464c = gVar;
        this.f5465d = null;
    }

    /* JADX INFO: renamed from: a */
    public final e<?, O> m6629a() {
        return this.f5462a;
    }

    /* JADX INFO: renamed from: b */
    public final b<?, O> m6630b() {
        C1221aj.m7071a(this.f5462a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f5462a;
    }

    /* JADX INFO: renamed from: c */
    public final d<?> m6631c() {
        if (this.f5464c != null) {
            return this.f5464c;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    /* JADX INFO: renamed from: d */
    public final String m6632d() {
        return this.f5466e;
    }
}
