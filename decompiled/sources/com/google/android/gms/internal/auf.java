package com.google.android.gms.internal;

import com.google.android.gms.internal.auh;
import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class auf extends boz<auf, C1388a> implements bqc {

    /* JADX INFO: renamed from: f */
    private static final auf f7287f;

    /* JADX INFO: renamed from: g */
    private static volatile bqg<auf> f7288g;

    /* JADX INFO: renamed from: d */
    private auh f7289d;

    /* JADX INFO: renamed from: e */
    private int f7290e;

    /* JADX INFO: renamed from: com.google.android.gms.internal.auf$a */
    public static final class C1388a extends boz.AbstractC1441a<auf, C1388a> implements bqc {
        private C1388a() {
            super(auf.f7287f);
        }

        /* synthetic */ C1388a(aug augVar) {
            this();
        }
    }

    static {
        auf aufVar = new auf();
        f7287f = aufVar;
        aufVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        aufVar.f8560b.m10032c();
    }

    private auf() {
    }

    /* JADX INFO: renamed from: a */
    public static auf m8391a(bob bobVar) {
        return (auf) boz.m9898a(f7287f, bobVar);
    }

    /* JADX INFO: renamed from: a */
    public final auh m8393a() {
        return this.f7289d == null ? auh.m8395b() : this.f7289d;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        auh.C1389a c1389a;
        aug augVar = null;
        switch (aug.f7291a[i - 1]) {
            case 1:
                return new auf();
            case 2:
                return f7287f;
            case 3:
                return null;
            case 4:
                return new C1388a(augVar);
            case 5:
                boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                auf aufVar = (auf) obj2;
                this.f7289d = (auh) interfaceC1448h.mo9917a(this.f7289d, aufVar.f7289d);
                this.f7290e = interfaceC1448h.mo9914a(this.f7290e != 0, this.f7290e, aufVar.f7290e != 0, aufVar.f7290e);
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
                                if (this.f7289d != null) {
                                    auh auhVar = this.f7289d;
                                    boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) auhVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
                                    abstractC1441a.mo9750a(auhVar);
                                    c1389a = (auh.C1389a) abstractC1441a;
                                } else {
                                    c1389a = null;
                                }
                                this.f7289d = (auh) bokVar.mo9782a(auh.m8395b(), borVar);
                                if (c1389a != null) {
                                    c1389a.mo9750a(this.f7289d);
                                    this.f7289d = (auh) c1389a.m9911c();
                                }
                                break;
                            case 16:
                                this.f7290e = bokVar.mo9792h();
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
                if (f7288g == null) {
                    synchronized (auf.class) {
                        if (f7288g == null) {
                            f7288g = new boz.C1442b(f7287f);
                        }
                        break;
                    }
                }
                return f7288g;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7287f;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (this.f7289d != null) {
            bonVar.mo9849a(1, this.f7289d == null ? auh.m8395b() : this.f7289d);
        }
        if (this.f7290e != 0) {
            bonVar.mo9865c(2, this.f7290e);
        }
        this.f8560b.m10028a(bonVar);
    }

    /* JADX INFO: renamed from: b */
    public final int m8394b() {
        return this.f7290e;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = this.f8561c;
        if (i != -1) {
            return i;
        }
        int iM9829e = 0;
        if (this.f7289d != null) {
            iM9829e = bon.m9819c(1, this.f7289d == null ? auh.m8395b() : this.f7289d) + 0;
        }
        if (this.f7290e != 0) {
            iM9829e += bon.m9829e(2, this.f7290e);
        }
        int iM10034e = iM9829e + this.f8560b.m10034e();
        this.f8561c = iM10034e;
        return iM10034e;
    }
}
