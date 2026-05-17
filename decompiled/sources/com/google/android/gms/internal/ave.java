package com.google.android.gms.internal;

import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ave extends boz<ave, C1400a> implements bqc {

    /* JADX INFO: renamed from: g */
    private static final ave f7353g;

    /* JADX INFO: renamed from: h */
    private static volatile bqg<ave> f7354h;

    /* JADX INFO: renamed from: d */
    private int f7355d;

    /* JADX INFO: renamed from: e */
    private int f7356e;

    /* JADX INFO: renamed from: f */
    private bob f7357f = bob.f8512a;

    /* JADX INFO: renamed from: com.google.android.gms.internal.ave$a */
    public static final class C1400a extends boz.AbstractC1441a<ave, C1400a> implements bqc {
        private C1400a() {
            super(ave.f7353g);
        }

        /* synthetic */ C1400a(avf avfVar) {
            this();
        }
    }

    static {
        ave aveVar = new ave();
        f7353g = aveVar;
        aveVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        aveVar.f8560b.m10032c();
    }

    private ave() {
    }

    /* JADX INFO: renamed from: e */
    public static ave m8477e() {
        return f7353g;
    }

    /* JADX INFO: renamed from: a */
    public final avg m8479a() {
        avg avgVarM8482a = avg.m8482a(this.f7355d);
        return avgVarM8482a == null ? avg.UNRECOGNIZED : avgVarM8482a;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        avf avfVar = null;
        boolean z = false;
        switch (avf.f7358a[i - 1]) {
            case 1:
                return new ave();
            case 2:
                return f7353g;
            case 3:
                return null;
            case 4:
                return new C1400a(avfVar);
            case 5:
                boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                ave aveVar = (ave) obj2;
                this.f7355d = interfaceC1448h.mo9914a(this.f7355d != 0, this.f7355d, aveVar.f7355d != 0, aveVar.f7355d);
                this.f7356e = interfaceC1448h.mo9914a(this.f7356e != 0, this.f7356e, aveVar.f7356e != 0, aveVar.f7356e);
                this.f7357f = interfaceC1448h.mo9915a(this.f7357f != bob.f8512a, this.f7357f, aveVar.f7357f != bob.f8512a, aveVar.f7357f);
                return this;
            case 6:
                bok bokVar = (bok) obj;
                if (((bor) obj2) == null) {
                    throw new NullPointerException();
                }
                while (!z) {
                    try {
                        try {
                            int iMo9781a = bokVar.mo9781a();
                            switch (iMo9781a) {
                                case 0:
                                    z = true;
                                    break;
                                case 8:
                                    this.f7355d = bokVar.mo9793i();
                                    break;
                                case 16:
                                    this.f7356e = bokVar.mo9793i();
                                    break;
                                case 90:
                                    this.f7357f = bokVar.mo9791g();
                                    break;
                                default:
                                    if (!m9905a(iMo9781a, bokVar)) {
                                        z = true;
                                    }
                                    break;
                            }
                        } catch (bpf e) {
                            throw new RuntimeException(e.m9943a(this));
                        }
                    } catch (IOException e2) {
                        throw new RuntimeException(new bpf(e2.getMessage()).m9943a(this));
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (f7354h == null) {
                    synchronized (ave.class) {
                        if (f7354h == null) {
                            f7354h = new boz.C1442b(f7353g);
                        }
                        break;
                    }
                }
                return f7354h;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7353g;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (this.f7355d != avg.UNKNOWN_CURVE.mo8430a()) {
            bonVar.mo9859b(1, this.f7355d);
        }
        if (this.f7356e != avi.UNKNOWN_HASH.mo8430a()) {
            bonVar.mo9859b(2, this.f7356e);
        }
        if (!this.f7357f.m9769b()) {
            bonVar.mo9848a(11, this.f7357f);
        }
        this.f8560b.m10028a(bonVar);
    }

    /* JADX INFO: renamed from: b */
    public final avi m8480b() {
        avi aviVarM8483a = avi.m8483a(this.f7356e);
        return aviVarM8483a == null ? avi.UNRECOGNIZED : aviVarM8483a;
    }

    /* JADX INFO: renamed from: c */
    public final bob m8481c() {
        return this.f7357f;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = this.f8561c;
        if (i != -1) {
            return i;
        }
        int iM9835g = this.f7355d != avg.UNKNOWN_CURVE.mo8430a() ? bon.m9835g(1, this.f7355d) + 0 : 0;
        if (this.f7356e != avi.UNKNOWN_HASH.mo8430a()) {
            iM9835g += bon.m9835g(2, this.f7356e);
        }
        if (!this.f7357f.m9769b()) {
            iM9835g += bon.m9818c(11, this.f7357f);
        }
        int iM10034e = iM9835g + this.f8560b.m10034e();
        this.f8561c = iM10034e;
        return iM10034e;
    }
}
