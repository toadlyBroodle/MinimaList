package com.google.android.gms.internal;

import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class awc extends boz<awc, C1411a> implements bqc {

    /* JADX INFO: renamed from: g */
    private static final awc f7456g;

    /* JADX INFO: renamed from: h */
    private static volatile bqg<awc> f7457h;

    /* JADX INFO: renamed from: d */
    private int f7458d;

    /* JADX INFO: renamed from: e */
    private int f7459e;

    /* JADX INFO: renamed from: f */
    private bpe<C1412b> f7460f = m9904l();

    /* JADX INFO: renamed from: com.google.android.gms.internal.awc$a */
    public static final class C1411a extends boz.AbstractC1441a<awc, C1411a> implements bqc {
        private C1411a() {
            super(awc.f7456g);
        }

        /* synthetic */ C1411a(awd awdVar) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1411a m8579a(int i) {
            m9910b();
            ((awc) this.f8562a).m8574a(i);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1411a m8580a(C1412b c1412b) {
            m9910b();
            ((awc) this.f8562a).m8575a(c1412b);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.awc$b */
    public static final class C1412b extends boz<C1412b, a> implements bqc {

        /* JADX INFO: renamed from: h */
        private static final C1412b f7461h;

        /* JADX INFO: renamed from: i */
        private static volatile bqg<C1412b> f7462i;

        /* JADX INFO: renamed from: d */
        private String f7463d = "";

        /* JADX INFO: renamed from: e */
        private int f7464e;

        /* JADX INFO: renamed from: f */
        private int f7465f;

        /* JADX INFO: renamed from: g */
        private int f7466g;

        /* JADX INFO: renamed from: com.google.android.gms.internal.awc$b$a */
        public static final class a extends boz.AbstractC1441a<C1412b, a> implements bqc {
            private a() {
                super(C1412b.f7461h);
            }

            /* synthetic */ a(awd awdVar) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final a m8592a(int i) {
                m9910b();
                ((C1412b) this.f8562a).m8582a(i);
                return this;
            }

            /* JADX INFO: renamed from: a */
            public final a m8593a(avu avuVar) {
                m9910b();
                ((C1412b) this.f8562a).m8583a(avuVar);
                return this;
            }

            /* JADX INFO: renamed from: a */
            public final a m8594a(awm awmVar) {
                m9910b();
                ((C1412b) this.f8562a).m8588a(awmVar);
                return this;
            }

            /* JADX INFO: renamed from: a */
            public final a m8595a(String str) {
                m9910b();
                ((C1412b) this.f8562a).m8589a(str);
                return this;
            }
        }

        static {
            C1412b c1412b = new C1412b();
            f7461h = c1412b;
            c1412b.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
            c1412b.f8560b.m10032c();
        }

        private C1412b() {
        }

        /* JADX INFO: renamed from: a */
        public static a m8581a() {
            C1412b c1412b = f7461h;
            boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) c1412b.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
            abstractC1441a.mo9750a(c1412b);
            return (a) abstractC1441a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public final void m8582a(int i) {
            this.f7465f = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public final void m8583a(avu avuVar) {
            if (avuVar == null) {
                throw new NullPointerException();
            }
            this.f7464e = avuVar.mo8430a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public final void m8588a(awm awmVar) {
            if (awmVar == null) {
                throw new NullPointerException();
            }
            this.f7466g = awmVar.mo8430a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public final void m8589a(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f7463d = str;
        }

        /* JADX INFO: renamed from: b */
        public static C1412b m8590b() {
            return f7461h;
        }

        @Override // com.google.android.gms.internal.boz
        /* JADX INFO: renamed from: a */
        protected final Object mo8340a(int i, Object obj, Object obj2) {
            awd awdVar = null;
            boolean z = false;
            switch (awd.f7467a[i - 1]) {
                case 1:
                    return new C1412b();
                case 2:
                    return f7461h;
                case 3:
                    return null;
                case 4:
                    return new a(awdVar);
                case 5:
                    boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                    C1412b c1412b = (C1412b) obj2;
                    this.f7463d = interfaceC1448h.mo9919a(!this.f7463d.isEmpty(), this.f7463d, !c1412b.f7463d.isEmpty(), c1412b.f7463d);
                    this.f7464e = interfaceC1448h.mo9914a(this.f7464e != 0, this.f7464e, c1412b.f7464e != 0, c1412b.f7464e);
                    this.f7465f = interfaceC1448h.mo9914a(this.f7465f != 0, this.f7465f, c1412b.f7465f != 0, c1412b.f7465f);
                    this.f7466g = interfaceC1448h.mo9914a(this.f7466g != 0, this.f7466g, c1412b.f7466g != 0, c1412b.f7466g);
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
                                    this.f7463d = bokVar.mo9790f();
                                    break;
                                case 16:
                                    this.f7464e = bokVar.mo9793i();
                                    break;
                                case 24:
                                    this.f7465f = bokVar.mo9792h();
                                    break;
                                case 32:
                                    this.f7466g = bokVar.mo9793i();
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
                    if (f7462i == null) {
                        synchronized (C1412b.class) {
                            if (f7462i == null) {
                                f7462i = new boz.C1442b(f7461h);
                            }
                            break;
                        }
                    }
                    return f7462i;
                case 9:
                    return (byte) 1;
                case 10:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
            return f7461h;
        }

        @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
        /* JADX INFO: renamed from: a */
        public final void mo8341a(bon bonVar) {
            if (!this.f7463d.isEmpty()) {
                bonVar.mo9850a(1, this.f7463d);
            }
            if (this.f7464e != avu.UNKNOWN_STATUS.mo8430a()) {
                bonVar.mo9859b(2, this.f7464e);
            }
            if (this.f7465f != 0) {
                bonVar.mo9865c(3, this.f7465f);
            }
            if (this.f7466g != awm.UNKNOWN_PREFIX.mo8430a()) {
                bonVar.mo9859b(4, this.f7466g);
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
            int iM9810b = this.f7463d.isEmpty() ? 0 : bon.m9810b(1, this.f7463d) + 0;
            if (this.f7464e != avu.UNKNOWN_STATUS.mo8430a()) {
                iM9810b += bon.m9835g(2, this.f7464e);
            }
            if (this.f7465f != 0) {
                iM9810b += bon.m9829e(3, this.f7465f);
            }
            if (this.f7466g != awm.UNKNOWN_PREFIX.mo8430a()) {
                iM9810b += bon.m9835g(4, this.f7466g);
            }
            int iM10034e = iM9810b + this.f8560b.m10034e();
            this.f8561c = iM10034e;
            return iM10034e;
        }
    }

    static {
        awc awcVar = new awc();
        f7456g = awcVar;
        awcVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        awcVar.f8560b.m10032c();
    }

    private awc() {
    }

    /* JADX INFO: renamed from: a */
    public static C1411a m8573a() {
        awc awcVar = f7456g;
        boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) awcVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
        abstractC1441a.mo9750a(awcVar);
        return (C1411a) abstractC1441a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8574a(int i) {
        this.f7459e = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8575a(C1412b c1412b) {
        if (c1412b == null) {
            throw new NullPointerException();
        }
        if (!this.f7460f.mo9752a()) {
            bpe<C1412b> bpeVar = this.f7460f;
            int size = bpeVar.size();
            this.f7460f = bpeVar.mo9934a(size == 0 ? 10 : size << 1);
        }
        this.f7460f.add(c1412b);
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        awd awdVar = null;
        boolean z = false;
        switch (awd.f7467a[i - 1]) {
            case 1:
                return new awc();
            case 2:
                return f7456g;
            case 3:
                this.f7460f.mo9753b();
                return null;
            case 4:
                return new C1411a(awdVar);
            case 5:
                boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                awc awcVar = (awc) obj2;
                this.f7459e = interfaceC1448h.mo9914a(this.f7459e != 0, this.f7459e, awcVar.f7459e != 0, awcVar.f7459e);
                this.f7460f = interfaceC1448h.mo9916a(this.f7460f, awcVar.f7460f);
                if (interfaceC1448h != boz.C1446f.f8570a) {
                    return this;
                }
                this.f7458d |= awcVar.f7458d;
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
                                this.f7459e = bokVar.mo9792h();
                                break;
                            case 18:
                                if (!this.f7460f.mo9752a()) {
                                    bpe<C1412b> bpeVar = this.f7460f;
                                    int size = bpeVar.size();
                                    this.f7460f = bpeVar.mo9934a(size == 0 ? 10 : size << 1);
                                }
                                this.f7460f.add((C1412b) bokVar.mo9782a(C1412b.m8590b(), borVar));
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
                if (f7457h == null) {
                    synchronized (awc.class) {
                        if (f7457h == null) {
                            f7457h = new boz.C1442b(f7456g);
                        }
                        break;
                    }
                }
                return f7457h;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7456g;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (this.f7459e != 0) {
            bonVar.mo9865c(1, this.f7459e);
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f7460f.size()) {
                this.f8560b.m10028a(bonVar);
                return;
            } else {
                bonVar.mo9849a(2, this.f7460f.get(i2));
                i = i2 + 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = 0;
        int i2 = this.f8561c;
        if (i2 != -1) {
            return i2;
        }
        int iM9829e = this.f7459e != 0 ? bon.m9829e(1, this.f7459e) + 0 : 0;
        while (true) {
            int i3 = iM9829e;
            if (i >= this.f7460f.size()) {
                int iM10034e = this.f8560b.m10034e() + i3;
                this.f8561c = iM10034e;
                return iM10034e;
            }
            iM9829e = bon.m9819c(2, this.f7460f.get(i)) + i3;
            i++;
        }
    }
}
