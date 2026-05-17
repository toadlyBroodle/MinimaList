package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.AbstractC1080g;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.InterfaceC1193k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.AbstractC1964ul;
import com.google.android.gms.internal.C1973uu;
import com.google.android.gms.internal.C1991vl;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.cast.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0991e {

    /* JADX INFO: renamed from: c */
    private static C1074a.b<C1973uu, c> f5207c = new C0981ab();

    /* JADX INFO: renamed from: a */
    public static final C1074a<c> f5205a = new C1074a<>("Cast.API", f5207c, C1991vl.f11786a);

    /* JADX INFO: renamed from: b */
    public static final b f5206b = new b.a();

    /* JADX INFO: renamed from: com.google.android.gms.cast.e$a */
    public interface a extends InterfaceC1193k {
        /* JADX INFO: renamed from: b */
        C0990d mo6288b();

        /* JADX INFO: renamed from: c */
        String mo6289c();

        /* JADX INFO: renamed from: d */
        String mo6290d();

        /* JADX INFO: renamed from: e */
        boolean mo6291e();
    }

    /* JADX INFO: renamed from: com.google.android.gms.cast.e$b */
    @Deprecated
    public interface b {

        /* JADX INFO: renamed from: com.google.android.gms.cast.e$b$a */
        public static final class a implements b {
            /* JADX INFO: renamed from: a */
            private final AbstractC1080g<a> m6315a(AbstractC1079f abstractC1079f, String str, String str2, C1058n c1058n) {
                return abstractC1079f.mo6674b(new C0984ae(this, abstractC1079f, str, str2, null));
            }

            @Override // com.google.android.gms.cast.C0991e.b
            /* JADX INFO: renamed from: a */
            public final AbstractC1080g<Status> mo6309a(AbstractC1079f abstractC1079f, String str) {
                return abstractC1079f.mo6674b(new C0985af(this, abstractC1079f, str));
            }

            @Override // com.google.android.gms.cast.C0991e.b
            /* JADX INFO: renamed from: a */
            public final AbstractC1080g<a> mo6310a(AbstractC1079f abstractC1079f, String str, C1051g c1051g) {
                return abstractC1079f.mo6674b(new C0983ad(this, abstractC1079f, str, c1051g));
            }

            @Override // com.google.android.gms.cast.C0991e.b
            /* JADX INFO: renamed from: a */
            public final AbstractC1080g<Status> mo6311a(AbstractC1079f abstractC1079f, String str, String str2) {
                return abstractC1079f.mo6674b(new C0982ac(this, abstractC1079f, str, str2));
            }

            @Override // com.google.android.gms.cast.C0991e.b
            /* JADX INFO: renamed from: a */
            public final void mo6312a(AbstractC1079f abstractC1079f, String str, e eVar) throws IOException {
                try {
                    ((C1973uu) abstractC1079f.mo6666a(C1991vl.f11786a)).m12403a(str, eVar);
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            @Override // com.google.android.gms.cast.C0991e.b
            /* JADX INFO: renamed from: b */
            public final AbstractC1080g<a> mo6313b(AbstractC1079f abstractC1079f, String str, String str2) {
                return m6315a(abstractC1079f, str, str2, null);
            }

            @Override // com.google.android.gms.cast.C0991e.b
            /* JADX INFO: renamed from: b */
            public final void mo6314b(AbstractC1079f abstractC1079f, String str) throws IOException {
                try {
                    ((C1973uu) abstractC1079f.mo6666a(C1991vl.f11786a)).m12402a(str);
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }
        }

        /* JADX INFO: renamed from: a */
        AbstractC1080g<Status> mo6309a(AbstractC1079f abstractC1079f, String str);

        /* JADX INFO: renamed from: a */
        AbstractC1080g<a> mo6310a(AbstractC1079f abstractC1079f, String str, C1051g c1051g);

        /* JADX INFO: renamed from: a */
        AbstractC1080g<Status> mo6311a(AbstractC1079f abstractC1079f, String str, String str2);

        /* JADX INFO: renamed from: a */
        void mo6312a(AbstractC1079f abstractC1079f, String str, e eVar);

        /* JADX INFO: renamed from: b */
        AbstractC1080g<a> mo6313b(AbstractC1079f abstractC1079f, String str, String str2);

        /* JADX INFO: renamed from: b */
        void mo6314b(AbstractC1079f abstractC1079f, String str);
    }

    /* JADX INFO: renamed from: com.google.android.gms.cast.e$c */
    public static final class c implements C1074a.a.c {

        /* JADX INFO: renamed from: a */
        final CastDevice f5208a;

        /* JADX INFO: renamed from: b */
        final d f5209b;

        /* JADX INFO: renamed from: c */
        final Bundle f5210c;

        /* JADX INFO: renamed from: d */
        private final int f5211d;

        /* JADX INFO: renamed from: com.google.android.gms.cast.e$c$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            CastDevice f5212a;

            /* JADX INFO: renamed from: b */
            d f5213b;

            /* JADX INFO: renamed from: c */
            private int f5214c;

            /* JADX INFO: renamed from: d */
            private Bundle f5215d;

            public a(CastDevice castDevice, d dVar) {
                C1221aj.m7066a(castDevice, "CastDevice parameter cannot be null");
                C1221aj.m7066a(dVar, "CastListener parameter cannot be null");
                this.f5212a = castDevice;
                this.f5213b = dVar;
                this.f5214c = 0;
            }

            /* JADX INFO: renamed from: a */
            public final a m6319a(Bundle bundle) {
                this.f5215d = bundle;
                return this;
            }

            /* JADX INFO: renamed from: a */
            public final c m6320a() {
                return new c(this, null);
            }
        }

        private c(a aVar) {
            this.f5208a = aVar.f5212a;
            this.f5209b = aVar.f5213b;
            this.f5211d = aVar.f5214c;
            this.f5210c = aVar.f5215d;
        }

        /* synthetic */ c(a aVar, C0981ab c0981ab) {
            this(aVar);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.cast.e$d */
    public static class d {
        /* JADX INFO: renamed from: a */
        public void mo6321a() {
        }

        /* JADX INFO: renamed from: a */
        public void mo6322a(int i) {
        }

        /* JADX INFO: renamed from: a */
        public void mo6323a(C0990d c0990d) {
        }

        /* JADX INFO: renamed from: b */
        public void mo6324b() {
        }

        /* JADX INFO: renamed from: b */
        public void mo6325b(int i) {
        }

        /* JADX INFO: renamed from: c */
        public void mo6326c(int i) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.cast.e$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        void mo6327a(CastDevice castDevice, String str, String str2);
    }

    /* JADX INFO: renamed from: com.google.android.gms.cast.e$f */
    static abstract class f extends AbstractC1964ul<a> {
        public f(AbstractC1079f abstractC1079f) {
            super(abstractC1079f);
        }

        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC1193k mo6177a(Status status) {
            return new C0986ag(this, status);
        }

        @Override // com.google.android.gms.common.api.internal.AbstractC1155cp
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo6178a(C1973uu c1973uu) {
        }
    }
}
