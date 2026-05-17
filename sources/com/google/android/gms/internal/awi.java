package com.google.android.gms.internal;

import com.google.android.gms.internal.awk;
import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class awi extends boz<awi, C1415a> implements bqc {

    /* JADX INFO: renamed from: f */
    private static final awi f7477f;

    /* JADX INFO: renamed from: g */
    private static volatile bqg<awi> f7478g;

    /* JADX INFO: renamed from: d */
    private int f7479d;

    /* JADX INFO: renamed from: e */
    private awk f7480e;

    /* JADX INFO: renamed from: com.google.android.gms.internal.awi$a */
    public static final class C1415a extends boz.AbstractC1441a<awi, C1415a> implements bqc {
        private C1415a() {
            super(awi.f7477f);
        }

        /* synthetic */ C1415a(awj awjVar) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1415a m8620a(int i) {
            m9910b();
            ((awi) this.f8562a).m8612a(0);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1415a m8621a(awk awkVar) {
            m9910b();
            ((awi) this.f8562a).m8615a(awkVar);
            return this;
        }
    }

    static {
        awi awiVar = new awi();
        f7477f = awiVar;
        awiVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        awiVar.f8560b.m10032c();
    }

    private awi() {
    }

    /* JADX INFO: renamed from: a */
    public static awi m8611a(bob bobVar) {
        return (awi) boz.m9898a(f7477f, bobVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8612a(int i) {
        this.f7479d = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8615a(awk awkVar) {
        if (awkVar == null) {
            throw new NullPointerException();
        }
        this.f7480e = awkVar;
    }

    /* JADX INFO: renamed from: c */
    public static C1415a m8616c() {
        awi awiVar = f7477f;
        boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) awiVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
        abstractC1441a.mo9750a(awiVar);
        return (C1415a) abstractC1441a;
    }

    /* JADX INFO: renamed from: a */
    public final int m8618a() {
        return this.f7479d;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        awk.C1416a c1416a;
        awj awjVar = null;
        switch (awj.f7481a[i - 1]) {
            case 1:
                return new awi();
            case 2:
                return f7477f;
            case 3:
                return null;
            case 4:
                return new C1415a(awjVar);
            case 5:
                boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                awi awiVar = (awi) obj2;
                this.f7479d = interfaceC1448h.mo9914a(this.f7479d != 0, this.f7479d, awiVar.f7479d != 0, awiVar.f7479d);
                this.f7480e = (awk) interfaceC1448h.mo9917a(this.f7480e, awiVar.f7480e);
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
                            case 8:
                                this.f7479d = bokVar.mo9792h();
                                break;
                            case 18:
                                if (this.f7480e != null) {
                                    awk awkVar = this.f7480e;
                                    boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) awkVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
                                    abstractC1441a.mo9750a(awkVar);
                                    c1416a = (awk.C1416a) abstractC1441a;
                                } else {
                                    c1416a = null;
                                }
                                this.f7480e = (awk) bokVar.mo9782a(awk.m8623c(), borVar);
                                if (c1416a != null) {
                                    c1416a.mo9750a(this.f7480e);
                                    this.f7480e = (awk) c1416a.m9911c();
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
                if (f7478g == null) {
                    synchronized (awi.class) {
                        if (f7478g == null) {
                            f7478g = new boz.C1442b(f7477f);
                        }
                        break;
                    }
                }
                return f7478g;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7477f;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (this.f7479d != 0) {
            bonVar.mo9865c(1, this.f7479d);
        }
        if (this.f7480e != null) {
            bonVar.mo9849a(2, this.f7480e == null ? awk.m8623c() : this.f7480e);
        }
        this.f8560b.m10028a(bonVar);
    }

    /* JADX INFO: renamed from: b */
    public final awk m8619b() {
        return this.f7480e == null ? awk.m8623c() : this.f7480e;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = this.f8561c;
        if (i != -1) {
            return i;
        }
        int iM9829e = this.f7479d != 0 ? bon.m9829e(1, this.f7479d) + 0 : 0;
        if (this.f7480e != null) {
            iM9829e += bon.m9819c(2, this.f7480e == null ? awk.m8623c() : this.f7480e);
        }
        int iM10034e = iM9829e + this.f8560b.m10034e();
        this.f8561c = iM10034e;
        return iM10034e;
    }
}
