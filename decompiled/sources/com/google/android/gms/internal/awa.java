package com.google.android.gms.internal;

import com.google.android.gms.internal.avq;
import com.google.android.gms.internal.boz;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class awa extends boz<awa, C1409a> implements bqc {

    /* JADX INFO: renamed from: g */
    private static final awa f7444g;

    /* JADX INFO: renamed from: h */
    private static volatile bqg<awa> f7445h;

    /* JADX INFO: renamed from: d */
    private int f7446d;

    /* JADX INFO: renamed from: e */
    private int f7447e;

    /* JADX INFO: renamed from: f */
    private bpe<C1410b> f7448f = m9904l();

    /* JADX INFO: renamed from: com.google.android.gms.internal.awa$a */
    public static final class C1409a extends boz.AbstractC1441a<awa, C1409a> implements bqc {
        private C1409a() {
            super(awa.f7444g);
        }

        /* synthetic */ C1409a(awb awbVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.awa$b */
    public static final class C1410b extends boz<C1410b, a> implements bqc {

        /* JADX INFO: renamed from: h */
        private static final C1410b f7449h;

        /* JADX INFO: renamed from: i */
        private static volatile bqg<C1410b> f7450i;

        /* JADX INFO: renamed from: d */
        private avq f7451d;

        /* JADX INFO: renamed from: e */
        private int f7452e;

        /* JADX INFO: renamed from: f */
        private int f7453f;

        /* JADX INFO: renamed from: g */
        private int f7454g;

        /* JADX INFO: renamed from: com.google.android.gms.internal.awa$b$a */
        public static final class a extends boz.AbstractC1441a<C1410b, a> implements bqc {
            private a() {
                super(C1410b.f7449h);
            }

            /* synthetic */ a(awb awbVar) {
                this();
            }
        }

        static {
            C1410b c1410b = new C1410b();
            f7449h = c1410b;
            c1410b.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
            c1410b.f8560b.m10032c();
        }

        private C1410b() {
        }

        /* JADX INFO: renamed from: g */
        public static C1410b m8566g() {
            return f7449h;
        }

        @Override // com.google.android.gms.internal.boz
        /* JADX INFO: renamed from: a */
        protected final Object mo8340a(int i, Object obj, Object obj2) {
            avq.C1404a c1404a;
            awb awbVar = null;
            switch (awb.f7455a[i - 1]) {
                case 1:
                    return new C1410b();
                case 2:
                    return f7449h;
                case 3:
                    return null;
                case 4:
                    return new a(awbVar);
                case 5:
                    boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                    C1410b c1410b = (C1410b) obj2;
                    this.f7451d = (avq) interfaceC1448h.mo9917a(this.f7451d, c1410b.f7451d);
                    this.f7452e = interfaceC1448h.mo9914a(this.f7452e != 0, this.f7452e, c1410b.f7452e != 0, c1410b.f7452e);
                    this.f7453f = interfaceC1448h.mo9914a(this.f7453f != 0, this.f7453f, c1410b.f7453f != 0, c1410b.f7453f);
                    this.f7454g = interfaceC1448h.mo9914a(this.f7454g != 0, this.f7454g, c1410b.f7454g != 0, c1410b.f7454g);
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
                                case 10:
                                    if (this.f7451d != null) {
                                        avq avqVar = this.f7451d;
                                        boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) avqVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
                                        abstractC1441a.mo9750a(avqVar);
                                        c1404a = (avq.C1404a) abstractC1441a;
                                    } else {
                                        c1404a = null;
                                    }
                                    this.f7451d = (avq) bokVar.mo9782a(avq.m8516f(), borVar);
                                    if (c1404a != null) {
                                        c1404a.mo9750a(this.f7451d);
                                        this.f7451d = (avq) c1404a.m9911c();
                                    }
                                    break;
                                case 16:
                                    this.f7452e = bokVar.mo9793i();
                                    break;
                                case 24:
                                    this.f7453f = bokVar.mo9792h();
                                    break;
                                case 32:
                                    this.f7454g = bokVar.mo9793i();
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
                    if (f7450i == null) {
                        synchronized (C1410b.class) {
                            if (f7450i == null) {
                                f7450i = new boz.C1442b(f7449h);
                            }
                            break;
                        }
                    }
                    return f7450i;
                case 9:
                    return (byte) 1;
                case 10:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
            return f7449h;
        }

        @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
        /* JADX INFO: renamed from: a */
        public final void mo8341a(bon bonVar) {
            if (this.f7451d != null) {
                bonVar.mo9849a(1, this.f7451d == null ? avq.m8516f() : this.f7451d);
            }
            if (this.f7452e != avu.UNKNOWN_STATUS.mo8430a()) {
                bonVar.mo9859b(2, this.f7452e);
            }
            if (this.f7453f != 0) {
                bonVar.mo9865c(3, this.f7453f);
            }
            if (this.f7454g != awm.UNKNOWN_PREFIX.mo8430a()) {
                bonVar.mo9859b(4, this.f7454g);
            }
            this.f8560b.m10028a(bonVar);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m8568a() {
            return this.f7451d != null;
        }

        /* JADX INFO: renamed from: b */
        public final avq m8569b() {
            return this.f7451d == null ? avq.m8516f() : this.f7451d;
        }

        /* JADX INFO: renamed from: c */
        public final avu m8570c() {
            avu avuVarM8533a = avu.m8533a(this.f7452e);
            return avuVarM8533a == null ? avu.UNRECOGNIZED : avuVarM8533a;
        }

        @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
        /* JADX INFO: renamed from: d */
        public final int mo8344d() {
            int i = this.f8561c;
            if (i != -1) {
                return i;
            }
            int iM9835g = 0;
            if (this.f7451d != null) {
                iM9835g = bon.m9819c(1, this.f7451d == null ? avq.m8516f() : this.f7451d) + 0;
            }
            if (this.f7452e != avu.UNKNOWN_STATUS.mo8430a()) {
                iM9835g += bon.m9835g(2, this.f7452e);
            }
            if (this.f7453f != 0) {
                iM9835g += bon.m9829e(3, this.f7453f);
            }
            if (this.f7454g != awm.UNKNOWN_PREFIX.mo8430a()) {
                iM9835g += bon.m9835g(4, this.f7454g);
            }
            int iM10034e = iM9835g + this.f8560b.m10034e();
            this.f8561c = iM10034e;
            return iM10034e;
        }

        /* JADX INFO: renamed from: e */
        public final int m8571e() {
            return this.f7453f;
        }

        /* JADX INFO: renamed from: f */
        public final awm m8572f() {
            awm awmVarM8627a = awm.m8627a(this.f7454g);
            return awmVarM8627a == null ? awm.UNRECOGNIZED : awmVarM8627a;
        }
    }

    static {
        awa awaVar = new awa();
        f7444g = awaVar;
        awaVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        awaVar.f8560b.m10032c();
    }

    private awa() {
    }

    /* JADX INFO: renamed from: a */
    public static awa m8561a(byte[] bArr) {
        return (awa) boz.m9901a(f7444g, bArr);
    }

    /* JADX INFO: renamed from: a */
    public final int m8563a() {
        return this.f7447e;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        awb awbVar = null;
        boolean z = false;
        switch (awb.f7455a[i - 1]) {
            case 1:
                return new awa();
            case 2:
                return f7444g;
            case 3:
                this.f7448f.mo9753b();
                return null;
            case 4:
                return new C1409a(awbVar);
            case 5:
                boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                awa awaVar = (awa) obj2;
                this.f7447e = interfaceC1448h.mo9914a(this.f7447e != 0, this.f7447e, awaVar.f7447e != 0, awaVar.f7447e);
                this.f7448f = interfaceC1448h.mo9916a(this.f7448f, awaVar.f7448f);
                if (interfaceC1448h != boz.C1446f.f8570a) {
                    return this;
                }
                this.f7446d |= awaVar.f7446d;
                return this;
            case 6:
                bok bokVar = (bok) obj;
                bor borVar = (bor) obj2;
                if (borVar == null) {
                    throw new NullPointerException();
                }
                while (!z) {
                    try {
                        int iMo9781a = bokVar.mo9781a();
                        switch (iMo9781a) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                this.f7447e = bokVar.mo9792h();
                                break;
                            case 18:
                                if (!this.f7448f.mo9752a()) {
                                    bpe<C1410b> bpeVar = this.f7448f;
                                    int size = bpeVar.size();
                                    this.f7448f = bpeVar.mo9934a(size == 0 ? 10 : size << 1);
                                }
                                this.f7448f.add((C1410b) bokVar.mo9782a(C1410b.m8566g(), borVar));
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
                if (f7445h == null) {
                    synchronized (awa.class) {
                        if (f7445h == null) {
                            f7445h = new boz.C1442b(f7444g);
                        }
                        break;
                    }
                }
                return f7445h;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7444g;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (this.f7447e != 0) {
            bonVar.mo9865c(1, this.f7447e);
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f7448f.size()) {
                this.f8560b.m10028a(bonVar);
                return;
            } else {
                bonVar.mo9849a(2, this.f7448f.get(i2));
                i = i2 + 1;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final List<C1410b> m8564b() {
        return this.f7448f;
    }

    /* JADX INFO: renamed from: c */
    public final int m8565c() {
        return this.f7448f.size();
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = 0;
        int i2 = this.f8561c;
        if (i2 != -1) {
            return i2;
        }
        int iM9829e = this.f7447e != 0 ? bon.m9829e(1, this.f7447e) + 0 : 0;
        while (true) {
            int i3 = iM9829e;
            if (i >= this.f7448f.size()) {
                int iM10034e = this.f8560b.m10034e() + i3;
                this.f8561c = iM10034e;
                return iM10034e;
            }
            iM9829e = bon.m9819c(2, this.f7448f.get(i)) + i3;
            i++;
        }
    }
}
