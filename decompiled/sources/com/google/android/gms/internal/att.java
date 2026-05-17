package com.google.android.gms.internal;

import com.google.android.gms.internal.atx;
import com.google.android.gms.internal.avk;
import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class att extends boz<att, C1381a> implements bqc {

    /* JADX INFO: renamed from: g */
    private static final att f7254g;

    /* JADX INFO: renamed from: h */
    private static volatile bqg<att> f7255h;

    /* JADX INFO: renamed from: d */
    private int f7256d;

    /* JADX INFO: renamed from: e */
    private atx f7257e;

    /* JADX INFO: renamed from: f */
    private avk f7258f;

    /* JADX INFO: renamed from: com.google.android.gms.internal.att$a */
    public static final class C1381a extends boz.AbstractC1441a<att, C1381a> implements bqc {
        private C1381a() {
            super(att.f7254g);
        }

        /* synthetic */ C1381a(atu atuVar) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1381a m8345a(int i) {
            m9910b();
            ((att) this.f8562a).m8331a(i);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1381a m8346a(atx atxVar) {
            m9910b();
            ((att) this.f8562a).m8335a(atxVar);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1381a m8347a(avk avkVar) {
            m9910b();
            ((att) this.f8562a).m8336a(avkVar);
            return this;
        }
    }

    static {
        att attVar = new att();
        f7254g = attVar;
        attVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        attVar.f8560b.m10032c();
    }

    private att() {
    }

    /* JADX INFO: renamed from: a */
    public static att m8330a(bob bobVar) {
        return (att) boz.m9898a(f7254g, bobVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8331a(int i) {
        this.f7256d = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8335a(atx atxVar) {
        if (atxVar == null) {
            throw new NullPointerException();
        }
        this.f7257e = atxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8336a(avk avkVar) {
        if (avkVar == null) {
            throw new NullPointerException();
        }
        this.f7258f = avkVar;
    }

    /* JADX INFO: renamed from: e */
    public static C1381a m8337e() {
        att attVar = f7254g;
        boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) attVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
        abstractC1441a.mo9750a(attVar);
        return (C1381a) abstractC1441a;
    }

    /* JADX INFO: renamed from: a */
    public final int m8339a() {
        return this.f7256d;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        avk.C1401a c1401a;
        atx.C1383a c1383a;
        atu atuVar = null;
        switch (atu.f7259a[i - 1]) {
            case 1:
                return new att();
            case 2:
                return f7254g;
            case 3:
                return null;
            case 4:
                return new C1381a(atuVar);
            case 5:
                boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                att attVar = (att) obj2;
                this.f7256d = interfaceC1448h.mo9914a(this.f7256d != 0, this.f7256d, attVar.f7256d != 0, attVar.f7256d);
                this.f7257e = (atx) interfaceC1448h.mo9917a(this.f7257e, attVar.f7257e);
                this.f7258f = (avk) interfaceC1448h.mo9917a(this.f7258f, attVar.f7258f);
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
                                this.f7256d = bokVar.mo9792h();
                                break;
                            case 18:
                                if (this.f7257e != null) {
                                    atx atxVar = this.f7257e;
                                    boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) atxVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
                                    abstractC1441a.mo9750a(atxVar);
                                    c1383a = (atx.C1383a) abstractC1441a;
                                } else {
                                    c1383a = null;
                                }
                                this.f7257e = (atx) bokVar.mo9782a(atx.m8360f(), borVar);
                                if (c1383a != null) {
                                    c1383a.mo9750a(this.f7257e);
                                    this.f7257e = (atx) c1383a.m9911c();
                                }
                                break;
                            case 26:
                                if (this.f7258f != null) {
                                    avk avkVar = this.f7258f;
                                    boz.AbstractC1441a abstractC1441a2 = (boz.AbstractC1441a) avkVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
                                    abstractC1441a2.mo9750a(avkVar);
                                    c1401a = (avk.C1401a) abstractC1441a2;
                                } else {
                                    c1401a = null;
                                }
                                this.f7258f = (avk) bokVar.mo9782a(avk.m8492f(), borVar);
                                if (c1401a != null) {
                                    c1401a.mo9750a(this.f7258f);
                                    this.f7258f = (avk) c1401a.m9911c();
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
                if (f7255h == null) {
                    synchronized (att.class) {
                        if (f7255h == null) {
                            f7255h = new boz.C1442b(f7254g);
                        }
                        break;
                    }
                }
                return f7255h;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7254g;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (this.f7256d != 0) {
            bonVar.mo9865c(1, this.f7256d);
        }
        if (this.f7257e != null) {
            bonVar.mo9849a(2, this.f7257e == null ? atx.m8360f() : this.f7257e);
        }
        if (this.f7258f != null) {
            bonVar.mo9849a(3, this.f7258f == null ? avk.m8492f() : this.f7258f);
        }
        this.f8560b.m10028a(bonVar);
    }

    /* JADX INFO: renamed from: b */
    public final atx m8342b() {
        return this.f7257e == null ? atx.m8360f() : this.f7257e;
    }

    /* JADX INFO: renamed from: c */
    public final avk m8343c() {
        return this.f7258f == null ? avk.m8492f() : this.f7258f;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = this.f8561c;
        if (i != -1) {
            return i;
        }
        int iM9829e = this.f7256d != 0 ? bon.m9829e(1, this.f7256d) + 0 : 0;
        if (this.f7257e != null) {
            iM9829e += bon.m9819c(2, this.f7257e == null ? atx.m8360f() : this.f7257e);
        }
        if (this.f7258f != null) {
            iM9829e += bon.m9819c(3, this.f7258f == null ? avk.m8492f() : this.f7258f);
        }
        int iM10034e = iM9829e + this.f8560b.m10034e();
        this.f8561c = iM10034e;
        return iM10034e;
    }
}
