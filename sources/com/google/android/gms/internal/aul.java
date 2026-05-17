package com.google.android.gms.internal;

import com.google.android.gms.internal.aun;
import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class aul extends boz<aul, C1391a> implements bqc {

    /* JADX INFO: renamed from: f */
    private static final aul f7302f;

    /* JADX INFO: renamed from: g */
    private static volatile bqg<aul> f7303g;

    /* JADX INFO: renamed from: d */
    private aun f7304d;

    /* JADX INFO: renamed from: e */
    private int f7305e;

    /* JADX INFO: renamed from: com.google.android.gms.internal.aul$a */
    public static final class C1391a extends boz.AbstractC1441a<aul, C1391a> implements bqc {
        private C1391a() {
            super(aul.f7302f);
        }

        /* synthetic */ C1391a(aum aumVar) {
            this();
        }
    }

    static {
        aul aulVar = new aul();
        f7302f = aulVar;
        aulVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        aulVar.f8560b.m10032c();
    }

    private aul() {
    }

    /* JADX INFO: renamed from: a */
    public static aul m8412a(bob bobVar) {
        return (aul) boz.m9898a(f7302f, bobVar);
    }

    /* JADX INFO: renamed from: a */
    public final aun m8414a() {
        return this.f7304d == null ? aun.m8416a() : this.f7304d;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        aun.C1392a c1392a;
        aum aumVar = null;
        switch (aum.f7306a[i - 1]) {
            case 1:
                return new aul();
            case 2:
                return f7302f;
            case 3:
                return null;
            case 4:
                return new C1391a(aumVar);
            case 5:
                boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                aul aulVar = (aul) obj2;
                this.f7304d = (aun) interfaceC1448h.mo9917a(this.f7304d, aulVar.f7304d);
                this.f7305e = interfaceC1448h.mo9914a(this.f7305e != 0, this.f7305e, aulVar.f7305e != 0, aulVar.f7305e);
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
                                if (this.f7304d != null) {
                                    aun aunVar = this.f7304d;
                                    boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) aunVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
                                    abstractC1441a.mo9750a(aunVar);
                                    c1392a = (aun.C1392a) abstractC1441a;
                                } else {
                                    c1392a = null;
                                }
                                this.f7304d = (aun) bokVar.mo9782a(aun.m8416a(), borVar);
                                if (c1392a != null) {
                                    c1392a.mo9750a(this.f7304d);
                                    this.f7304d = (aun) c1392a.m9911c();
                                }
                                break;
                            case 16:
                                this.f7305e = bokVar.mo9792h();
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
                if (f7303g == null) {
                    synchronized (aul.class) {
                        if (f7303g == null) {
                            f7303g = new boz.C1442b(f7302f);
                        }
                        break;
                    }
                }
                return f7303g;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7302f;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (this.f7304d != null) {
            bonVar.mo9849a(1, this.f7304d == null ? aun.m8416a() : this.f7304d);
        }
        if (this.f7305e != 0) {
            bonVar.mo9865c(2, this.f7305e);
        }
        this.f8560b.m10028a(bonVar);
    }

    /* JADX INFO: renamed from: b */
    public final int m8415b() {
        return this.f7305e;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = this.f8561c;
        if (i != -1) {
            return i;
        }
        int iM9829e = 0;
        if (this.f7304d != null) {
            iM9829e = bon.m9819c(1, this.f7304d == null ? aun.m8416a() : this.f7304d) + 0;
        }
        if (this.f7305e != 0) {
            iM9829e += bon.m9829e(2, this.f7305e);
        }
        int iM10034e = iM9829e + this.f8560b.m10034e();
        this.f8561c = iM10034e;
        return iM10034e;
    }
}
