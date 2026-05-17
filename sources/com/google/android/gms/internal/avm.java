package com.google.android.gms.internal;

import com.google.android.gms.internal.avo;
import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class avm extends boz<avm, C1402a> implements bqc {

    /* JADX INFO: renamed from: f */
    private static final avm f7383f;

    /* JADX INFO: renamed from: g */
    private static volatile bqg<avm> f7384g;

    /* JADX INFO: renamed from: d */
    private avo f7385d;

    /* JADX INFO: renamed from: e */
    private int f7386e;

    /* JADX INFO: renamed from: com.google.android.gms.internal.avm$a */
    public static final class C1402a extends boz.AbstractC1441a<avm, C1402a> implements bqc {
        private C1402a() {
            super(avm.f7383f);
        }

        /* synthetic */ C1402a(avn avnVar) {
            this();
        }
    }

    static {
        avm avmVar = new avm();
        f7383f = avmVar;
        avmVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        avmVar.f8560b.m10032c();
    }

    private avm() {
    }

    /* JADX INFO: renamed from: a */
    public static avm m8500a(bob bobVar) {
        return (avm) boz.m9898a(f7383f, bobVar);
    }

    /* JADX INFO: renamed from: c */
    public static avm m8501c() {
        return f7383f;
    }

    /* JADX INFO: renamed from: a */
    public final avo m8503a() {
        return this.f7385d == null ? avo.m8505c() : this.f7385d;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        avo.C1403a c1403a;
        avn avnVar = null;
        switch (avn.f7387a[i - 1]) {
            case 1:
                return new avm();
            case 2:
                return f7383f;
            case 3:
                return null;
            case 4:
                return new C1402a(avnVar);
            case 5:
                boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                avm avmVar = (avm) obj2;
                this.f7385d = (avo) interfaceC1448h.mo9917a(this.f7385d, avmVar.f7385d);
                this.f7386e = interfaceC1448h.mo9914a(this.f7386e != 0, this.f7386e, avmVar.f7386e != 0, avmVar.f7386e);
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
                                if (this.f7385d != null) {
                                    avo avoVar = this.f7385d;
                                    boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) avoVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
                                    abstractC1441a.mo9750a(avoVar);
                                    c1403a = (avo.C1403a) abstractC1441a;
                                } else {
                                    c1403a = null;
                                }
                                this.f7385d = (avo) bokVar.mo9782a(avo.m8505c(), borVar);
                                if (c1403a != null) {
                                    c1403a.mo9750a(this.f7385d);
                                    this.f7385d = (avo) c1403a.m9911c();
                                }
                                break;
                            case 16:
                                this.f7386e = bokVar.mo9792h();
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
                if (f7384g == null) {
                    synchronized (avm.class) {
                        if (f7384g == null) {
                            f7384g = new boz.C1442b(f7383f);
                        }
                        break;
                    }
                }
                return f7384g;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7383f;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (this.f7385d != null) {
            bonVar.mo9849a(1, this.f7385d == null ? avo.m8505c() : this.f7385d);
        }
        if (this.f7386e != 0) {
            bonVar.mo9865c(2, this.f7386e);
        }
        this.f8560b.m10028a(bonVar);
    }

    /* JADX INFO: renamed from: b */
    public final int m8504b() {
        return this.f7386e;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = this.f8561c;
        if (i != -1) {
            return i;
        }
        int iM9829e = 0;
        if (this.f7385d != null) {
            iM9829e = bon.m9819c(1, this.f7385d == null ? avo.m8505c() : this.f7385d) + 0;
        }
        if (this.f7386e != 0) {
            iM9829e += bon.m9829e(2, this.f7386e);
        }
        int iM10034e = iM9829e + this.f8560b.m10034e();
        this.f8561c = iM10034e;
        return iM10034e;
    }
}
