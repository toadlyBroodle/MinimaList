package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.p045b.AbstractC0670g;
import com.google.android.gms.ads.p045b.AbstractC0671h;
import com.google.android.gms.ads.p045b.C0667d;
import com.google.android.gms.ads.p045b.InterfaceC0672i;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.C1668jm;
import com.google.android.gms.internal.bwu;
import com.google.android.gms.internal.bxa;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.bxv;
import com.google.android.gms.internal.bxy;
import com.google.android.gms.internal.bzf;
import com.google.android.gms.internal.ccm;
import com.google.android.gms.internal.ceu;
import com.google.android.gms.internal.cev;
import com.google.android.gms.internal.cew;
import com.google.android.gms.internal.cex;
import com.google.android.gms.internal.cih;

/* JADX INFO: renamed from: com.google.android.gms.ads.b */
/* JADX INFO: loaded from: classes.dex */
public class C0663b {

    /* JADX INFO: renamed from: a */
    private final bxa f4340a;

    /* JADX INFO: renamed from: b */
    private final Context f4341b;

    /* JADX INFO: renamed from: c */
    private final bxv f4342c;

    /* JADX INFO: renamed from: com.google.android.gms.ads.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final Context f4343a;

        /* JADX INFO: renamed from: b */
        private final bxy f4344b;

        private a(Context context, bxy bxyVar) {
            this.f4343a = context;
            this.f4344b = bxyVar;
        }

        public a(Context context, String str) {
            this((Context) C1221aj.m7066a(context, "context cannot be null"), bxm.m10405b().m10398a(context, str, new cih()));
        }

        /* JADX INFO: renamed from: a */
        public a m5337a(C0657a c0657a) {
            try {
                this.f4344b.mo5754a(new bwu(c0657a));
            } catch (RemoteException e) {
                C1668jm.m11613c("Failed to set AdListener.", e);
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m5338a(C0667d c0667d) {
            try {
                this.f4344b.mo5756a(new ccm(c0667d));
            } catch (RemoteException e) {
                C1668jm.m11613c("Failed to specify native ad options", e);
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m5339a(AbstractC0670g.a aVar) {
            try {
                this.f4344b.mo5757a(new ceu(aVar));
            } catch (RemoteException e) {
                C1668jm.m11613c("Failed to add app install ad listener", e);
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m5340a(AbstractC0671h.a aVar) {
            try {
                this.f4344b.mo5758a(new cev(aVar));
            } catch (RemoteException e) {
                C1668jm.m11613c("Failed to add content ad listener", e);
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m5341a(String str, InterfaceC0672i.b bVar, InterfaceC0672i.a aVar) {
            try {
                this.f4344b.mo5761a(str, new cex(bVar), aVar == null ? null : new cew(aVar));
            } catch (RemoteException e) {
                C1668jm.m11613c("Failed to add custom template ad listener", e);
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C0663b m5342a() {
            try {
                return new C0663b(this.f4343a, this.f4344b.mo5752a());
            } catch (RemoteException e) {
                C1668jm.m11611b("Failed to build AdLoader.", e);
                return null;
            }
        }
    }

    C0663b(Context context, bxv bxvVar) {
        this(context, bxvVar, bxa.f9246a);
    }

    private C0663b(Context context, bxv bxvVar, bxa bxaVar) {
        this.f4341b = context;
        this.f4342c = bxvVar;
        this.f4340a = bxaVar;
    }

    /* JADX INFO: renamed from: a */
    private final void m5335a(bzf bzfVar) {
        try {
            this.f4342c.mo5708a(bxa.m10378a(this.f4341b, bzfVar));
        } catch (RemoteException e) {
            C1668jm.m11611b("Failed to load ad.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m5336a(C0676c c0676c) {
        m5335a(c0676c.m5385a());
    }
}
