package com.google.android.gms.internal;

import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class avo extends boz<avo, C1403a> implements bqc {

    /* JADX INFO: renamed from: f */
    private static final avo f7388f;

    /* JADX INFO: renamed from: g */
    private static volatile bqg<avo> f7389g;

    /* JADX INFO: renamed from: d */
    private int f7390d;

    /* JADX INFO: renamed from: e */
    private int f7391e;

    /* JADX INFO: renamed from: com.google.android.gms.internal.avo$a */
    public static final class C1403a extends boz.AbstractC1441a<avo, C1403a> implements bqc {
        private C1403a() {
            super(avo.f7388f);
        }

        /* synthetic */ C1403a(avp avpVar) {
            this();
        }
    }

    static {
        avo avoVar = new avo();
        f7388f = avoVar;
        avoVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        avoVar.f8560b.m10032c();
    }

    private avo() {
    }

    /* JADX INFO: renamed from: c */
    public static avo m8505c() {
        return f7388f;
    }

    /* JADX INFO: renamed from: a */
    public final avi m8507a() {
        avi aviVarM8483a = avi.m8483a(this.f7390d);
        return aviVarM8483a == null ? avi.UNRECOGNIZED : aviVarM8483a;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        avp avpVar = null;
        boolean z = false;
        switch (avp.f7392a[i - 1]) {
            case 1:
                return new avo();
            case 2:
                return f7388f;
            case 3:
                return null;
            case 4:
                return new C1403a(avpVar);
            case 5:
                boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                avo avoVar = (avo) obj2;
                this.f7390d = interfaceC1448h.mo9914a(this.f7390d != 0, this.f7390d, avoVar.f7390d != 0, avoVar.f7390d);
                this.f7391e = interfaceC1448h.mo9914a(this.f7391e != 0, this.f7391e, avoVar.f7391e != 0, avoVar.f7391e);
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
                                this.f7390d = bokVar.mo9793i();
                                break;
                            case 16:
                                this.f7391e = bokVar.mo9792h();
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
                if (f7389g == null) {
                    synchronized (avo.class) {
                        if (f7389g == null) {
                            f7389g = new boz.C1442b(f7388f);
                        }
                        break;
                    }
                }
                return f7389g;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7388f;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (this.f7390d != avi.UNKNOWN_HASH.mo8430a()) {
            bonVar.mo9859b(1, this.f7390d);
        }
        if (this.f7391e != 0) {
            bonVar.mo9865c(2, this.f7391e);
        }
        this.f8560b.m10028a(bonVar);
    }

    /* JADX INFO: renamed from: b */
    public final int m8508b() {
        return this.f7391e;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = this.f8561c;
        if (i != -1) {
            return i;
        }
        int iM9835g = this.f7390d != avi.UNKNOWN_HASH.mo8430a() ? bon.m9835g(1, this.f7390d) + 0 : 0;
        if (this.f7391e != 0) {
            iM9835g += bon.m9829e(2, this.f7391e);
        }
        int iM10034e = iM9835g + this.f8560b.m10034e();
        this.f8561c = iM10034e;
        return iM10034e;
    }
}
