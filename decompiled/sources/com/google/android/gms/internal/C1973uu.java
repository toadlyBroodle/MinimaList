package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.C0990d;
import com.google.android.gms.cast.C0991e;
import com.google.android.gms.cast.C1051g;
import com.google.android.gms.cast.C1058n;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC1156cq;
import com.google.android.gms.common.internal.AbstractC1256c;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.C1248bj;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.google.android.gms.internal.uu */
/* JADX INFO: loaded from: classes.dex */
public final class C1973uu extends AbstractC1256c<InterfaceC1985vf> {

    /* JADX INFO: renamed from: e */
    private C0990d f11688e;

    /* JADX INFO: renamed from: f */
    private final CastDevice f11689f;

    /* JADX INFO: renamed from: g */
    private final C0991e.d f11690g;

    /* JADX INFO: renamed from: h */
    private final Map<String, C0991e.e> f11691h;

    /* JADX INFO: renamed from: i */
    private final long f11692i;

    /* JADX INFO: renamed from: j */
    private final Bundle f11693j;

    /* JADX INFO: renamed from: k */
    private BinderC1975uw f11694k;

    /* JADX INFO: renamed from: l */
    private String f11695l;

    /* JADX INFO: renamed from: m */
    private boolean f11696m;

    /* JADX INFO: renamed from: n */
    private boolean f11697n;

    /* JADX INFO: renamed from: o */
    private boolean f11698o;

    /* JADX INFO: renamed from: p */
    private boolean f11699p;

    /* JADX INFO: renamed from: q */
    private double f11700q;

    /* JADX INFO: renamed from: r */
    private int f11701r;

    /* JADX INFO: renamed from: s */
    private int f11702s;

    /* JADX INFO: renamed from: t */
    private final AtomicLong f11703t;

    /* JADX INFO: renamed from: u */
    private String f11704u;

    /* JADX INFO: renamed from: v */
    private String f11705v;

    /* JADX INFO: renamed from: w */
    private Bundle f11706w;

    /* JADX INFO: renamed from: x */
    private final Map<Long, InterfaceC1156cq<Status>> f11707x;

    /* JADX INFO: renamed from: y */
    private InterfaceC1156cq<C0991e.a> f11708y;

    /* JADX INFO: renamed from: z */
    private InterfaceC1156cq<Status> f11709z;

    /* JADX INFO: renamed from: d */
    private static final C1992vm f11687d = new C1992vm("CastClientImpl");

    /* JADX INFO: renamed from: A */
    private static final Object f11685A = new Object();

    /* JADX INFO: renamed from: B */
    private static final Object f11686B = new Object();

    public C1973uu(Context context, Looper looper, C1248bj c1248bj, CastDevice castDevice, long j, C0991e.d dVar, Bundle bundle, AbstractC1079f.b bVar, AbstractC1079f.c cVar) {
        super(context, looper, 10, c1248bj, bVar, cVar);
        this.f11689f = castDevice;
        this.f11690g = dVar;
        this.f11692i = j;
        this.f11693j = bundle;
        this.f11691h = new HashMap();
        this.f11703t = new AtomicLong(0L);
        this.f11707x = new HashMap();
        m12377A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final void m12377A() {
        this.f11699p = false;
        this.f11701r = -1;
        this.f11702s = -1;
        this.f11688e = null;
        this.f11695l = null;
        this.f11700q = 0.0d;
        this.f11696m = false;
    }

    /* JADX INFO: renamed from: B */
    private final void m12378B() {
        f11687d.m12445a("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.f11691h) {
            this.f11691h.clear();
        }
    }

    /* JADX INFO: renamed from: C */
    private final void m12379C() {
        if (!this.f11699p || this.f11694k == null || this.f11694k.m12421b()) {
            throw new IllegalStateException("Not connected to a device");
        }
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ InterfaceC1156cq m12381a(C1973uu c1973uu, InterfaceC1156cq interfaceC1156cq) {
        c1973uu.f11708y = null;
        return null;
    }

    /* JADX INFO: renamed from: a */
    private final void m12383a(InterfaceC1156cq<C0991e.a> interfaceC1156cq) {
        synchronized (f11685A) {
            if (this.f11708y != null) {
                this.f11708y.mo6179a(new C1974uv(new Status(2002)));
            }
            this.f11708y = interfaceC1156cq;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m12384a(C1962uj c1962uj) {
        boolean z;
        String strM12365a = c1962uj.m12365a();
        if (C1981vb.m12427a(strM12365a, this.f11695l)) {
            z = false;
        } else {
            this.f11695l = strM12365a;
            z = true;
        }
        f11687d.m12445a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(this.f11697n));
        if (this.f11690g != null && (z || this.f11697n)) {
            this.f11690g.mo6321a();
        }
        this.f11697n = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m12388a(C1982vc c1982vc) {
        boolean z;
        boolean z2;
        boolean z3;
        C0990d c0990dM12434e = c1982vc.m12434e();
        if (!C1981vb.m12427a(c0990dM12434e, this.f11688e)) {
            this.f11688e = c0990dM12434e;
            this.f11690g.mo6323a(this.f11688e);
        }
        double dM12430a = c1982vc.m12430a();
        if (Double.isNaN(dM12430a) || Math.abs(dM12430a - this.f11700q) <= 1.0E-7d) {
            z = false;
        } else {
            this.f11700q = dM12430a;
            z = true;
        }
        boolean zM12431b = c1982vc.m12431b();
        if (zM12431b != this.f11696m) {
            this.f11696m = zM12431b;
            z = true;
        }
        f11687d.m12445a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(this.f11698o));
        if (this.f11690g != null && (z || this.f11698o)) {
            this.f11690g.mo6324b();
        }
        int iM12432c = c1982vc.m12432c();
        if (iM12432c != this.f11701r) {
            this.f11701r = iM12432c;
            z2 = true;
        } else {
            z2 = false;
        }
        f11687d.m12445a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(this.f11698o));
        if (this.f11690g != null && (z2 || this.f11698o)) {
            this.f11690g.mo6325b(this.f11701r);
        }
        int iM12433d = c1982vc.m12433d();
        if (iM12433d != this.f11702s) {
            this.f11702s = iM12433d;
            z3 = true;
        } else {
            z3 = false;
        }
        f11687d.m12445a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(this.f11698o));
        if (this.f11690g != null && (z3 || this.f11698o)) {
            this.f11690g.mo6326c(this.f11702s);
        }
        this.f11698o = false;
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ InterfaceC1156cq m12390b(C1973uu c1973uu, InterfaceC1156cq interfaceC1156cq) {
        c1973uu.f11709z = null;
        return null;
    }

    /* JADX INFO: renamed from: b */
    private final void m12392b(InterfaceC1156cq<Status> interfaceC1156cq) {
        synchronized (f11686B) {
            if (this.f11709z != null) {
                interfaceC1156cq.mo6179a(new Status(2001));
            } else {
                this.f11709z = interfaceC1156cq;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av, com.google.android.gms.common.internal.InterfaceC1260g
    /* JADX INFO: renamed from: a */
    public final Bundle mo6746a() {
        if (this.f11706w == null) {
            return super.mo6746a();
        }
        Bundle bundle = this.f11706w;
        this.f11706w = null;
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ IInterface mo6166a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1985vf ? (InterfaceC1985vf) iInterfaceQueryLocalInterface : new C1986vg(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: a */
    protected final void mo7109a(int i, IBinder iBinder, Bundle bundle, int i2) {
        f11687d.m12445a("in onPostInitHandler; statusCode=%d", Integer.valueOf(i));
        if (i == 0 || i == 1001) {
            this.f11699p = true;
            this.f11697n = true;
            this.f11698o = true;
        } else {
            this.f11699p = false;
        }
        if (i == 1001) {
            this.f11706w = new Bundle();
            this.f11706w.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i = 0;
        }
        super.mo7109a(i, iBinder, bundle, i2);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: a */
    public final void mo7111a(C1071a c1071a) {
        super.mo7111a(c1071a);
        m12378B();
    }

    /* JADX INFO: renamed from: a */
    public final void m12402a(String str) {
        C0991e.e eVarRemove;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
        }
        synchronized (this.f11691h) {
            eVarRemove = this.f11691h.remove(str);
        }
        if (eVarRemove != null) {
            try {
                ((InterfaceC1985vf) super.m7131w()).mo12441c(str);
            } catch (IllegalStateException e) {
                f11687d.m12446a(e, "Error unregistering namespace (%s): %s", str, e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12403a(String str, C0991e.e eVar) {
        C1981vb.m12426a(str);
        m12402a(str);
        if (eVar != null) {
            synchronized (this.f11691h) {
                this.f11691h.put(str, eVar);
            }
            ((InterfaceC1985vf) super.m7131w()).mo12440b(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12404a(String str, C1051g c1051g, InterfaceC1156cq<C0991e.a> interfaceC1156cq) {
        m12383a(interfaceC1156cq);
        ((InterfaceC1985vf) super.m7131w()).mo12437a(str, c1051g);
    }

    /* JADX INFO: renamed from: a */
    public final void m12405a(String str, InterfaceC1156cq<Status> interfaceC1156cq) {
        m12392b(interfaceC1156cq);
        ((InterfaceC1985vf) super.m7131w()).mo12436a(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m12406a(String str, String str2, C1058n c1058n, InterfaceC1156cq<C0991e.a> interfaceC1156cq) {
        m12383a(interfaceC1156cq);
        if (c1058n == null) {
            c1058n = new C1058n();
        }
        ((InterfaceC1985vf) super.m7131w()).mo12439a(str, str2, c1058n);
    }

    /* JADX INFO: renamed from: a */
    public final void m12407a(String str, String str2, InterfaceC1156cq<Status> interfaceC1156cq) {
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        if (str2.length() > 65536) {
            throw new IllegalArgumentException("Message exceeds maximum size");
        }
        C1981vb.m12426a(str);
        m12379C();
        long jIncrementAndGet = this.f11703t.incrementAndGet();
        try {
            this.f11707x.put(Long.valueOf(jIncrementAndGet), interfaceC1156cq);
            ((InterfaceC1985vf) super.m7131w()).mo12438a(str, str2, jIncrementAndGet);
        } catch (Throwable th) {
            this.f11707x.remove(Long.valueOf(jIncrementAndGet));
            throw th;
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: b */
    protected final String mo6167b() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

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
    @Override // com.google.android.gms.common.internal.AbstractC1233av, com.google.android.gms.common.api.C1074a.f
    /* JADX INFO: renamed from: f */
    public final void mo6640f() {
        f11687d.m12445a("disconnect(); ServiceListener=%s, isConnected=%b", this.f11694k, Boolean.valueOf(m7118g()));
        BinderC1975uw binderC1975uw = this.f11694k;
        this.f11694k = null;
        if (binderC1975uw == null || binderC1975uw.m12410a() == null) {
            f11687d.m12445a("already disposed, so short-circuiting", new Object[0]);
            return;
        }
        m12378B();
        try {
            try {
                ((InterfaceC1985vf) super.m7131w()).mo12435a();
            } finally {
                super.mo6640f();
            }
        } catch (RemoteException | IllegalStateException e) {
            f11687d.m12446a(e, "Error while disconnecting the controller interface: %s", e.getMessage());
            super.mo6640f();
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: j_ */
    protected final String mo6171j_() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: u */
    protected final Bundle mo7129u() {
        Bundle bundle = new Bundle();
        f11687d.m12445a("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.f11704u, this.f11705v);
        this.f11689f.m6254a(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.f11692i);
        if (this.f11693j != null) {
            bundle.putAll(this.f11693j);
        }
        this.f11694k = new BinderC1975uw(this);
        bundle.putParcelable("listener", new BinderWrapper(this.f11694k.asBinder()));
        if (this.f11704u != null) {
            bundle.putString("last_application_id", this.f11704u);
            if (this.f11705v != null) {
                bundle.putString("last_session_id", this.f11705v);
            }
        }
        return bundle;
    }
}
