package com.google.android.gms.internal;

import com.google.android.gms.internal.aub;
import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class atz extends boz<atz, C1384a> implements bqc {

    /* JADX INFO: renamed from: f */
    private static final atz f7271f;

    /* JADX INFO: renamed from: g */
    private static volatile bqg<atz> f7272g;

    /* JADX INFO: renamed from: d */
    private aub f7273d;

    /* JADX INFO: renamed from: e */
    private int f7274e;

    /* JADX INFO: renamed from: com.google.android.gms.internal.atz$a */
    public static final class C1384a extends boz.AbstractC1441a<atz, C1384a> implements bqc {
        private C1384a() {
            super(atz.f7271f);
        }

        /* synthetic */ C1384a(aua auaVar) {
            this();
        }
    }

    static {
        atz atzVar = new atz();
        f7271f = atzVar;
        atzVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        atzVar.f8560b.m10032c();
    }

    private atz() {
    }

    /* JADX INFO: renamed from: a */
    public static atz m8368a(bob bobVar) {
        return (atz) boz.m9898a(f7271f, bobVar);
    }

    /* JADX INFO: renamed from: c */
    public static atz m8369c() {
        return f7271f;
    }

    /* JADX INFO: renamed from: a */
    public final aub m8371a() {
        return this.f7273d == null ? aub.m8373b() : this.f7273d;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        aub.C1386a c1386a;
        aua auaVar = null;
        switch (aua.f7276a[i - 1]) {
            case 1:
                return new atz();
            case 2:
                return f7271f;
            case 3:
                return null;
            case 4:
                return new C1384a(auaVar);
            case 5:
                boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                atz atzVar = (atz) obj2;
                this.f7273d = (aub) interfaceC1448h.mo9917a(this.f7273d, atzVar.f7273d);
                this.f7274e = interfaceC1448h.mo9914a(this.f7274e != 0, this.f7274e, atzVar.f7274e != 0, atzVar.f7274e);
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
                                if (this.f7273d != null) {
                                    aub aubVar = this.f7273d;
                                    boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) aubVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
                                    abstractC1441a.mo9750a(aubVar);
                                    c1386a = (aub.C1386a) abstractC1441a;
                                } else {
                                    c1386a = null;
                                }
                                this.f7273d = (aub) bokVar.mo9782a(aub.m8373b(), borVar);
                                if (c1386a != null) {
                                    c1386a.mo9750a(this.f7273d);
                                    this.f7273d = (aub) c1386a.m9911c();
                                }
                                break;
                            case 16:
                                this.f7274e = bokVar.mo9792h();
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
                if (f7272g == null) {
                    synchronized (atz.class) {
                        if (f7272g == null) {
                            f7272g = new boz.C1442b(f7271f);
                        }
                        break;
                    }
                }
                return f7272g;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7271f;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (this.f7273d != null) {
            bonVar.mo9849a(1, this.f7273d == null ? aub.m8373b() : this.f7273d);
        }
        if (this.f7274e != 0) {
            bonVar.mo9865c(2, this.f7274e);
        }
        this.f8560b.m10028a(bonVar);
    }

    /* JADX INFO: renamed from: b */
    public final int m8372b() {
        return this.f7274e;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = this.f8561c;
        if (i != -1) {
            return i;
        }
        int iM9829e = 0;
        if (this.f7273d != null) {
            iM9829e = bon.m9819c(1, this.f7273d == null ? aub.m8373b() : this.f7273d) + 0;
        }
        if (this.f7274e != 0) {
            iM9829e += bon.m9829e(2, this.f7274e);
        }
        int iM10034e = iM9829e + this.f8560b.m10034e();
        this.f8561c = iM10034e;
        return iM10034e;
    }
}
