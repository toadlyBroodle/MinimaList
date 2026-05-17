package com.google.android.gms.internal;

import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class avw extends boz<avw, C1406a> implements bqc {

    /* JADX INFO: renamed from: g */
    private static final avw f7429g;

    /* JADX INFO: renamed from: h */
    private static volatile bqg<avw> f7430h;

    /* JADX INFO: renamed from: d */
    private String f7431d = "";

    /* JADX INFO: renamed from: e */
    private bob f7432e = bob.f8512a;

    /* JADX INFO: renamed from: f */
    private int f7433f;

    /* JADX INFO: renamed from: com.google.android.gms.internal.avw$a */
    public static final class C1406a extends boz.AbstractC1441a<avw, C1406a> implements bqc {
        private C1406a() {
            super(avw.f7429g);
        }

        /* synthetic */ C1406a(avx avxVar) {
            this();
        }
    }

    static {
        avw avwVar = new avw();
        f7429g = avwVar;
        avwVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        avwVar.f8560b.m10032c();
    }

    private avw() {
    }

    /* JADX INFO: renamed from: c */
    public static avw m8534c() {
        return f7429g;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        avx avxVar = null;
        boolean z = false;
        switch (avx.f7434a[i - 1]) {
            case 1:
                return new avw();
            case 2:
                return f7429g;
            case 3:
                return null;
            case 4:
                return new C1406a(avxVar);
            case 5:
                boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                avw avwVar = (avw) obj2;
                this.f7431d = interfaceC1448h.mo9919a(!this.f7431d.isEmpty(), this.f7431d, !avwVar.f7431d.isEmpty(), avwVar.f7431d);
                this.f7432e = interfaceC1448h.mo9915a(this.f7432e != bob.f8512a, this.f7432e, avwVar.f7432e != bob.f8512a, avwVar.f7432e);
                this.f7433f = interfaceC1448h.mo9914a(this.f7433f != 0, this.f7433f, avwVar.f7433f != 0, avwVar.f7433f);
                return this;
            case 6:
                bok bokVar = (bok) obj;
                if (((bor) obj2) == null) {
                    throw new NullPointerException();
                }
                while (!z) {
                    try {
                        int iMo9781a = bokVar.mo9781a();
                        switch (iMo9781a) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.f7431d = bokVar.mo9790f();
                                break;
                            case 18:
                                this.f7432e = bokVar.mo9791g();
                                break;
                            case 24:
                                this.f7433f = bokVar.mo9793i();
                                break;
                            default:
                                if (!m9905a(iMo9781a, bokVar)) {
                                    z = true;
                                }
                                break;
                        }
                    } catch (bpf e) {
                        throw new RuntimeException(e.m9943a(this));
                    } catch (IOException e2) {
                        throw new RuntimeException(new bpf(e2.getMessage()).m9943a(this));
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (f7430h == null) {
                    synchronized (avw.class) {
                        if (f7430h == null) {
                            f7430h = new boz.C1442b(f7429g);
                        }
                        break;
                    }
                }
                return f7430h;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7429g;
    }

    /* JADX INFO: renamed from: a */
    public final String m8536a() {
        return this.f7431d;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (!this.f7431d.isEmpty()) {
            bonVar.mo9850a(1, this.f7431d);
        }
        if (!this.f7432e.m9769b()) {
            bonVar.mo9848a(2, this.f7432e);
        }
        if (this.f7433f != awm.UNKNOWN_PREFIX.mo8430a()) {
            bonVar.mo9859b(3, this.f7433f);
        }
        this.f8560b.m10028a(bonVar);
    }

    /* JADX INFO: renamed from: b */
    public final bob m8537b() {
        return this.f7432e;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = this.f8561c;
        if (i != -1) {
            return i;
        }
        int iM9810b = this.f7431d.isEmpty() ? 0 : bon.m9810b(1, this.f7431d) + 0;
        if (!this.f7432e.m9769b()) {
            iM9810b += bon.m9818c(2, this.f7432e);
        }
        if (this.f7433f != awm.UNKNOWN_PREFIX.mo8430a()) {
            iM9810b += bon.m9835g(3, this.f7433f);
        }
        int iM10034e = iM9810b + this.f8560b.m10034e();
        this.f8561c = iM10034e;
        return iM10034e;
    }
}
