package com.google.android.gms.internal;

import com.google.android.gms.internal.avw;
import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class auu extends boz<auu, C1394a> implements bqc {

    /* JADX INFO: renamed from: e */
    private static final auu f7325e;

    /* JADX INFO: renamed from: f */
    private static volatile bqg<auu> f7326f;

    /* JADX INFO: renamed from: d */
    private avw f7327d;

    /* JADX INFO: renamed from: com.google.android.gms.internal.auu$a */
    public static final class C1394a extends boz.AbstractC1441a<auu, C1394a> implements bqc {
        private C1394a() {
            super(auu.f7325e);
        }

        /* synthetic */ C1394a(auv auvVar) {
            this();
        }
    }

    static {
        auu auuVar = new auu();
        f7325e = auuVar;
        auuVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        auuVar.f8560b.m10032c();
    }

    private auu() {
    }

    /* JADX INFO: renamed from: b */
    public static auu m8431b() {
        return f7325e;
    }

    /* JADX INFO: renamed from: a */
    public final avw m8433a() {
        return this.f7327d == null ? avw.m8534c() : this.f7327d;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        avw.C1406a c1406a;
        auv auvVar = null;
        switch (auv.f7328a[i - 1]) {
            case 1:
                return new auu();
            case 2:
                return f7325e;
            case 3:
                return null;
            case 4:
                return new C1394a(auvVar);
            case 5:
                this.f7327d = (avw) ((boz.InterfaceC1448h) obj).mo9917a(this.f7327d, ((auu) obj2).f7327d);
                return this;
            case 6:
                bok bokVar = (bok) obj;
                bor borVar = (bor) obj2;
                if (borVar == null) {
                    throw new NullPointerException();
                }
                boolean z = false;
                while (!z) {
                    try {
                        int iMo9781a = bokVar.mo9781a();
                        switch (iMo9781a) {
                            case 0:
                                z = true;
                                break;
                            case 18:
                                if (this.f7327d != null) {
                                    avw avwVar = this.f7327d;
                                    boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) avwVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
                                    abstractC1441a.mo9750a(avwVar);
                                    c1406a = (avw.C1406a) abstractC1441a;
                                } else {
                                    c1406a = null;
                                }
                                this.f7327d = (avw) bokVar.mo9782a(avw.m8534c(), borVar);
                                if (c1406a != null) {
                                    c1406a.mo9750a(this.f7327d);
                                    this.f7327d = (avw) c1406a.m9911c();
                                }
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
                if (f7326f == null) {
                    synchronized (auu.class) {
                        if (f7326f == null) {
                            f7326f = new boz.C1442b(f7325e);
                        }
                        break;
                    }
                }
                return f7326f;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7325e;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (this.f7327d != null) {
            bonVar.mo9849a(2, this.f7327d == null ? avw.m8534c() : this.f7327d);
        }
        this.f8560b.m10028a(bonVar);
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = this.f8561c;
        if (i != -1) {
            return i;
        }
        int iM9819c = 0;
        if (this.f7327d != null) {
            iM9819c = bon.m9819c(2, this.f7327d == null ? avw.m8534c() : this.f7327d) + 0;
        }
        int iM10034e = iM9819c + this.f8560b.m10034e();
        this.f8561c = iM10034e;
        return iM10034e;
    }
}
