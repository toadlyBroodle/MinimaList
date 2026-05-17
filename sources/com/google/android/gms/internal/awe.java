package com.google.android.gms.internal;

import com.google.android.gms.internal.awg;
import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class awe extends boz<awe, C1413a> implements bqc {

    /* JADX INFO: renamed from: f */
    private static final awe f7468f;

    /* JADX INFO: renamed from: g */
    private static volatile bqg<awe> f7469g;

    /* JADX INFO: renamed from: d */
    private int f7470d;

    /* JADX INFO: renamed from: e */
    private awg f7471e;

    /* JADX INFO: renamed from: com.google.android.gms.internal.awe$a */
    public static final class C1413a extends boz.AbstractC1441a<awe, C1413a> implements bqc {
        private C1413a() {
            super(awe.f7468f);
        }

        /* synthetic */ C1413a(awf awfVar) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1413a m8605a(int i) {
            m9910b();
            ((awe) this.f8562a).m8597a(0);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1413a m8606a(awg awgVar) {
            m9910b();
            ((awe) this.f8562a).m8600a(awgVar);
            return this;
        }
    }

    static {
        awe aweVar = new awe();
        f7468f = aweVar;
        aweVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        aweVar.f8560b.m10032c();
    }

    private awe() {
    }

    /* JADX INFO: renamed from: a */
    public static awe m8596a(bob bobVar) {
        return (awe) boz.m9898a(f7468f, bobVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8597a(int i) {
        this.f7470d = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8600a(awg awgVar) {
        if (awgVar == null) {
            throw new NullPointerException();
        }
        this.f7471e = awgVar;
    }

    /* JADX INFO: renamed from: c */
    public static C1413a m8601c() {
        awe aweVar = f7468f;
        boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) aweVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
        abstractC1441a.mo9750a(aweVar);
        return (C1413a) abstractC1441a;
    }

    /* JADX INFO: renamed from: a */
    public final int m8603a() {
        return this.f7470d;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        awg.C1414a c1414a;
        awf awfVar = null;
        switch (awf.f7472a[i - 1]) {
            case 1:
                return new awe();
            case 2:
                return f7468f;
            case 3:
                return null;
            case 4:
                return new C1413a(awfVar);
            case 5:
                boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                awe aweVar = (awe) obj2;
                this.f7470d = interfaceC1448h.mo9914a(this.f7470d != 0, this.f7470d, aweVar.f7470d != 0, aweVar.f7470d);
                this.f7471e = (awg) interfaceC1448h.mo9917a(this.f7471e, aweVar.f7471e);
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
                                this.f7470d = bokVar.mo9792h();
                                break;
                            case 18:
                                if (this.f7471e != null) {
                                    awg awgVar = this.f7471e;
                                    boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) awgVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
                                    abstractC1441a.mo9750a(awgVar);
                                    c1414a = (awg.C1414a) abstractC1441a;
                                } else {
                                    c1414a = null;
                                }
                                this.f7471e = (awg) bokVar.mo9782a(awg.m8608b(), borVar);
                                if (c1414a != null) {
                                    c1414a.mo9750a(this.f7471e);
                                    this.f7471e = (awg) c1414a.m9911c();
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
                if (f7469g == null) {
                    synchronized (awe.class) {
                        if (f7469g == null) {
                            f7469g = new boz.C1442b(f7468f);
                        }
                        break;
                    }
                }
                return f7469g;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7468f;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (this.f7470d != 0) {
            bonVar.mo9865c(1, this.f7470d);
        }
        if (this.f7471e != null) {
            bonVar.mo9849a(2, this.f7471e == null ? awg.m8608b() : this.f7471e);
        }
        this.f8560b.m10028a(bonVar);
    }

    /* JADX INFO: renamed from: b */
    public final awg m8604b() {
        return this.f7471e == null ? awg.m8608b() : this.f7471e;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = this.f8561c;
        if (i != -1) {
            return i;
        }
        int iM9829e = this.f7470d != 0 ? bon.m9829e(1, this.f7470d) + 0 : 0;
        if (this.f7471e != null) {
            iM9829e += bon.m9819c(2, this.f7471e == null ? awg.m8608b() : this.f7471e);
        }
        int iM10034e = iM9829e + this.f8560b.m10034e();
        this.f8561c = iM10034e;
        return iM10034e;
    }
}
