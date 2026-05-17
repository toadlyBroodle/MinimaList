package com.google.android.gms.internal;

import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class aup extends boz<aup, C1393a> implements bqc {

    /* JADX INFO: renamed from: f */
    private static final aup f7310f;

    /* JADX INFO: renamed from: g */
    private static volatile bqg<aup> f7311g;

    /* JADX INFO: renamed from: d */
    private int f7312d;

    /* JADX INFO: renamed from: e */
    private bob f7313e = bob.f8512a;

    /* JADX INFO: renamed from: com.google.android.gms.internal.aup$a */
    public static final class C1393a extends boz.AbstractC1441a<aup, C1393a> implements bqc {
        private C1393a() {
            super(aup.f7310f);
        }

        /* synthetic */ C1393a(auq auqVar) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1393a m8427a(int i) {
            m9910b();
            ((aup) this.f8562a).m8419a(0);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1393a m8428a(bob bobVar) {
            m9910b();
            ((aup) this.f8562a).m8422b(bobVar);
            return this;
        }
    }

    static {
        aup aupVar = new aup();
        f7310f = aupVar;
        aupVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        aupVar.f8560b.m10032c();
    }

    private aup() {
    }

    /* JADX INFO: renamed from: a */
    public static aup m8418a(bob bobVar) {
        return (aup) boz.m9898a(f7310f, bobVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8419a(int i) {
        this.f7312d = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m8422b(bob bobVar) {
        if (bobVar == null) {
            throw new NullPointerException();
        }
        this.f7313e = bobVar;
    }

    /* JADX INFO: renamed from: c */
    public static C1393a m8423c() {
        aup aupVar = f7310f;
        boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) aupVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
        abstractC1441a.mo9750a(aupVar);
        return (C1393a) abstractC1441a;
    }

    /* JADX INFO: renamed from: a */
    public final int m8425a() {
        return this.f7312d;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        auq auqVar = null;
        boolean z = false;
        switch (auq.f7314a[i - 1]) {
            case 1:
                return new aup();
            case 2:
                return f7310f;
            case 3:
                return null;
            case 4:
                return new C1393a(auqVar);
            case 5:
                boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                aup aupVar = (aup) obj2;
                this.f7312d = interfaceC1448h.mo9914a(this.f7312d != 0, this.f7312d, aupVar.f7312d != 0, aupVar.f7312d);
                this.f7313e = interfaceC1448h.mo9915a(this.f7313e != bob.f8512a, this.f7313e, aupVar.f7313e != bob.f8512a, aupVar.f7313e);
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
                            case 8:
                                this.f7312d = bokVar.mo9792h();
                                break;
                            case 18:
                                this.f7313e = bokVar.mo9791g();
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
                if (f7311g == null) {
                    synchronized (aup.class) {
                        if (f7311g == null) {
                            f7311g = new boz.C1442b(f7310f);
                        }
                        break;
                    }
                }
                return f7311g;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7310f;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (this.f7312d != 0) {
            bonVar.mo9865c(1, this.f7312d);
        }
        if (!this.f7313e.m9769b()) {
            bonVar.mo9848a(2, this.f7313e);
        }
        this.f8560b.m10028a(bonVar);
    }

    /* JADX INFO: renamed from: b */
    public final bob m8426b() {
        return this.f7313e;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = this.f8561c;
        if (i != -1) {
            return i;
        }
        int iM9829e = this.f7312d != 0 ? bon.m9829e(1, this.f7312d) + 0 : 0;
        if (!this.f7313e.m9769b()) {
            iM9829e += bon.m9818c(2, this.f7313e);
        }
        int iM10034e = iM9829e + this.f8560b.m10034e();
        this.f8561c = iM10034e;
        return iM10034e;
    }
}
