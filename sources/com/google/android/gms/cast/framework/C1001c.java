package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.cast.C0990d;
import com.google.android.gms.cast.C0991e;
import com.google.android.gms.cast.C1051g;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.media.C1016e;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.InterfaceC1193k;
import com.google.android.gms.common.api.InterfaceC1194l;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.C1303g;
import com.google.android.gms.internal.C1931tf;
import com.google.android.gms.internal.C1933th;
import com.google.android.gms.internal.C1955uc;
import com.google.android.gms.internal.C1992vm;
import com.google.android.gms.internal.C1993vn;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.c */
/* JADX INFO: loaded from: classes.dex */
public class C1001c extends AbstractC1005g {

    /* JADX INFO: renamed from: a */
    private static final C1992vm f5236a = new C1992vm("CastSession");

    /* JADX INFO: renamed from: b */
    private final Context f5237b;

    /* JADX INFO: renamed from: c */
    private final Set<C0991e.d> f5238c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1046v f5239d;

    /* JADX INFO: renamed from: e */
    private final C1000b f5240e;

    /* JADX INFO: renamed from: f */
    private final C0991e.b f5241f;

    /* JADX INFO: renamed from: g */
    private final C1933th f5242g;

    /* JADX INFO: renamed from: h */
    private final C1955uc f5243h;

    /* JADX INFO: renamed from: i */
    private AbstractC1079f f5244i;

    /* JADX INFO: renamed from: j */
    private C1016e f5245j;

    /* JADX INFO: renamed from: k */
    private CastDevice f5246k;

    /* JADX INFO: renamed from: l */
    private C0991e.a f5247l;

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.c$a */
    class a implements InterfaceC1194l<C0991e.a> {

        /* JADX INFO: renamed from: a */
        private String f5248a;

        a(String str) {
            this.f5248a = str;
        }

        @Override // com.google.android.gms.common.api.InterfaceC1194l
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ void mo4791a(InterfaceC1193k interfaceC1193k) {
            C0991e.a aVar = (C0991e.a) interfaceC1193k;
            C1001c.this.f5247l = aVar;
            try {
                if (!aVar.mo6094a().m6626d()) {
                    C1001c.f5236a.m12445a("%s() -> failure result", this.f5248a);
                    C1001c.this.f5239d.mo6535b(aVar.mo6094a().m6627e());
                    return;
                }
                C1001c.f5236a.m12445a("%s() -> success result", this.f5248a);
                C1001c.this.f5245j = new C1016e(new C1993vn(null, C1303g.m7263d()), C1001c.this.f5241f);
                try {
                    C1001c.this.f5245j.m6470a(C1001c.this.f5244i);
                    C1001c.this.f5245j.m6468a();
                    C1001c.this.f5245j.m6476d();
                    C1001c.this.f5243h.m12361a(C1001c.this.f5245j, C1001c.this.m6377b());
                } catch (IOException e) {
                    C1001c.f5236a.m12448b(e, "Exception when setting GoogleApiClient.", new Object[0]);
                    C1001c.this.f5245j = null;
                }
                C1001c.this.f5239d.mo6532a(aVar.mo6288b(), aVar.mo6289c(), aVar.mo6290d(), aVar.mo6291e());
            } catch (RemoteException e2) {
                C1001c.f5236a.m12446a(e2, "Unable to call %s on %s.", "methods", InterfaceC1046v.class.getSimpleName());
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.c$b */
    class b extends AbstractBinderC1043s {
        private b() {
        }

        @Override // com.google.android.gms.cast.framework.InterfaceC1042r
        /* JADX INFO: renamed from: a */
        public final void mo6382a(int i) {
            C1001c.this.m6370d(i);
        }

        @Override // com.google.android.gms.cast.framework.InterfaceC1042r
        /* JADX INFO: renamed from: a */
        public final void mo6383a(String str) {
            if (C1001c.this.f5244i != null) {
                C1001c.this.f5241f.mo6309a(C1001c.this.f5244i, str);
            }
        }

        @Override // com.google.android.gms.cast.framework.InterfaceC1042r
        /* JADX INFO: renamed from: a */
        public final void mo6384a(String str, C1051g c1051g) {
            if (C1001c.this.f5244i != null) {
                C1001c.this.f5241f.mo6310a(C1001c.this.f5244i, str, c1051g).mo6696a(C1001c.this.new a("launchApplication"));
            }
        }

        @Override // com.google.android.gms.cast.framework.InterfaceC1042r
        /* JADX INFO: renamed from: a */
        public final void mo6385a(String str, String str2) {
            if (C1001c.this.f5244i != null) {
                C1001c.this.f5241f.mo6313b(C1001c.this.f5244i, str, str2).mo6696a(C1001c.this.new a("joinApplication"));
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.c$c */
    class c extends C0991e.d {
        private c() {
        }

        @Override // com.google.android.gms.cast.C0991e.d
        /* JADX INFO: renamed from: a */
        public final void mo6321a() {
            Iterator it = new HashSet(C1001c.this.f5238c).iterator();
            while (it.hasNext()) {
                ((C0991e.d) it.next()).mo6321a();
            }
        }

        @Override // com.google.android.gms.cast.C0991e.d
        /* JADX INFO: renamed from: a */
        public final void mo6322a(int i) {
            C1001c.this.m6370d(i);
            C1001c.this.m6391b(i);
            Iterator it = new HashSet(C1001c.this.f5238c).iterator();
            while (it.hasNext()) {
                ((C0991e.d) it.next()).mo6322a(i);
            }
        }

        @Override // com.google.android.gms.cast.C0991e.d
        /* JADX INFO: renamed from: a */
        public final void mo6323a(C0990d c0990d) {
            Iterator it = new HashSet(C1001c.this.f5238c).iterator();
            while (it.hasNext()) {
                ((C0991e.d) it.next()).mo6323a(c0990d);
            }
        }

        @Override // com.google.android.gms.cast.C0991e.d
        /* JADX INFO: renamed from: b */
        public final void mo6324b() {
            Iterator it = new HashSet(C1001c.this.f5238c).iterator();
            while (it.hasNext()) {
                ((C0991e.d) it.next()).mo6324b();
            }
        }

        @Override // com.google.android.gms.cast.C0991e.d
        /* JADX INFO: renamed from: b */
        public final void mo6325b(int i) {
            Iterator it = new HashSet(C1001c.this.f5238c).iterator();
            while (it.hasNext()) {
                ((C0991e.d) it.next()).mo6325b(i);
            }
        }

        @Override // com.google.android.gms.cast.C0991e.d
        /* JADX INFO: renamed from: c */
        public final void mo6326c(int i) {
            Iterator it = new HashSet(C1001c.this.f5238c).iterator();
            while (it.hasNext()) {
                ((C0991e.d) it.next()).mo6326c(i);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.c$d */
    class d implements AbstractC1079f.b, AbstractC1079f.c {
        private d() {
        }

        @Override // com.google.android.gms.common.api.AbstractC1079f.b
        /* JADX INFO: renamed from: a */
        public final void mo6386a(int i) {
            try {
                C1001c.this.f5239d.mo6530a(i);
            } catch (RemoteException e) {
                C1001c.f5236a.m12446a(e, "Unable to call %s on %s.", "onConnectionSuspended", InterfaceC1046v.class.getSimpleName());
            }
        }

        @Override // com.google.android.gms.common.api.AbstractC1079f.b
        /* JADX INFO: renamed from: a */
        public final void mo6387a(Bundle bundle) {
            try {
                if (C1001c.this.f5245j != null) {
                    try {
                        C1001c.this.f5245j.m6468a();
                        C1001c.this.f5245j.m6476d();
                    } catch (IOException e) {
                        C1001c.f5236a.m12448b(e, "Exception when setting GoogleApiClient.", new Object[0]);
                        C1001c.this.f5245j = null;
                    }
                }
                C1001c.this.f5239d.mo6531a(bundle);
            } catch (RemoteException e2) {
                C1001c.f5236a.m12446a(e2, "Unable to call %s on %s.", "onConnected", InterfaceC1046v.class.getSimpleName());
            }
        }

        @Override // com.google.android.gms.common.api.AbstractC1079f.c
        /* JADX INFO: renamed from: a */
        public final void mo4766a(C1071a c1071a) {
            try {
                C1001c.this.f5239d.mo6533a(c1071a);
            } catch (RemoteException e) {
                C1001c.f5236a.m12446a(e, "Unable to call %s on %s.", "onConnectionFailed", InterfaceC1046v.class.getSimpleName());
            }
        }
    }

    public C1001c(Context context, String str, String str2, C1000b c1000b, C0991e.b bVar, C1933th c1933th, C1955uc c1955uc) {
        super(context, str, str2);
        this.f5238c = new HashSet();
        this.f5237b = context.getApplicationContext();
        this.f5240e = c1000b;
        this.f5241f = bVar;
        this.f5242g = c1933th;
        this.f5243h = c1955uc;
        this.f5239d = C1931tf.m12314a(context, c1000b, m6395g(), new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final void m6370d(int i) {
        this.f5243h.m12360a(i);
        if (this.f5244i != null) {
            this.f5244i.mo6681g();
            this.f5244i = null;
        }
        this.f5246k = null;
        if (this.f5245j != null) {
            this.f5245j.m6470a((AbstractC1079f) null);
            this.f5245j = null;
        }
        this.f5247l = null;
    }

    /* JADX INFO: renamed from: e */
    private final void m6372e(Bundle bundle) {
        this.f5246k = CastDevice.m6252b(bundle);
        if (this.f5246k == null) {
            if (m6394f()) {
                m6392c(8);
                return;
            } else {
                m6390a(8);
                return;
            }
        }
        if (this.f5244i != null) {
            this.f5244i.mo6681g();
            this.f5244i = null;
        }
        f5236a.m12445a("Acquiring a connection to Google Play Services for %s", this.f5246k);
        d dVar = new d();
        Context context = this.f5237b;
        CastDevice castDevice = this.f5246k;
        C1000b c1000b = this.f5240e;
        c cVar = new c();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", (c1000b == null || c1000b.m6359f() == null || c1000b.m6359f().m6422b() == null) ? false : true);
        this.f5244i = new AbstractC1079f.a(context).m6689a(C0991e.f5205a, new C0991e.c.a(castDevice, cVar).m6319a(bundle2).m6320a()).m6690a((AbstractC1079f.b) dVar).m6691a((AbstractC1079f.c) dVar).m6693b();
        this.f5244i.mo6679e();
    }

    /* JADX INFO: renamed from: a */
    public C1016e m6374a() {
        C1221aj.m7073b("Must be called from the main thread.");
        return this.f5245j;
    }

    @Override // com.google.android.gms.cast.framework.AbstractC1005g
    /* JADX INFO: renamed from: a */
    protected void mo6375a(Bundle bundle) {
        this.f5246k = CastDevice.m6252b(bundle);
    }

    @Override // com.google.android.gms.cast.framework.AbstractC1005g
    /* JADX INFO: renamed from: a */
    protected void mo6376a(boolean z) {
        try {
            this.f5239d.mo6534a(z, 0);
        } catch (RemoteException e) {
            f5236a.m12446a(e, "Unable to call %s on %s.", "disconnectFromDevice", InterfaceC1046v.class.getSimpleName());
        }
        m6391b(0);
    }

    /* JADX INFO: renamed from: b */
    public CastDevice m6377b() {
        C1221aj.m7073b("Must be called from the main thread.");
        return this.f5246k;
    }

    @Override // com.google.android.gms.cast.framework.AbstractC1005g
    /* JADX INFO: renamed from: b */
    protected void mo6378b(Bundle bundle) {
        this.f5246k = CastDevice.m6252b(bundle);
    }

    @Override // com.google.android.gms.cast.framework.AbstractC1005g
    /* JADX INFO: renamed from: c */
    public long mo6379c() {
        C1221aj.m7073b("Must be called from the main thread.");
        if (this.f5245j == null) {
            return 0L;
        }
        return this.f5245j.m6479f() - this.f5245j.m6478e();
    }

    @Override // com.google.android.gms.cast.framework.AbstractC1005g
    /* JADX INFO: renamed from: c */
    protected void mo6380c(Bundle bundle) {
        m6372e(bundle);
    }

    @Override // com.google.android.gms.cast.framework.AbstractC1005g
    /* JADX INFO: renamed from: d */
    protected void mo6381d(Bundle bundle) {
        m6372e(bundle);
    }
}
