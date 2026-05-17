package com.google.android.gms.internal;

import com.google.android.gms.internal.atz;
import com.google.android.gms.internal.avm;
import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class atv extends boz<atv, C1382a> implements bqc {

    /* JADX INFO: renamed from: f */
    private static final atv f7260f;

    /* JADX INFO: renamed from: g */
    private static volatile bqg<atv> f7261g;

    /* JADX INFO: renamed from: d */
    private atz f7262d;

    /* JADX INFO: renamed from: e */
    private avm f7263e;

    /* JADX INFO: renamed from: com.google.android.gms.internal.atv$a */
    public static final class C1382a extends boz.AbstractC1441a<atv, C1382a> implements bqc {
        private C1382a() {
            super(atv.f7260f);
        }

        /* synthetic */ C1382a(atw atwVar) {
            this();
        }
    }

    static {
        atv atvVar = new atv();
        f7260f = atvVar;
        atvVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        atvVar.f8560b.m10032c();
    }

    private atv() {
    }

    /* JADX INFO: renamed from: a */
    public static atv m8348a(bob bobVar) {
        return (atv) boz.m9898a(f7260f, bobVar);
    }

    /* JADX INFO: renamed from: a */
    public final atz m8350a() {
        return this.f7262d == null ? atz.m8369c() : this.f7262d;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        avm.C1402a c1402a;
        atz.C1384a c1384a;
        atw atwVar = null;
        switch (atw.f7264a[i - 1]) {
            case 1:
                return new atv();
            case 2:
                return f7260f;
            case 3:
                return null;
            case 4:
                return new C1382a(atwVar);
            case 5:
                boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                atv atvVar = (atv) obj2;
                this.f7262d = (atz) interfaceC1448h.mo9917a(this.f7262d, atvVar.f7262d);
                this.f7263e = (avm) interfaceC1448h.mo9917a(this.f7263e, atvVar.f7263e);
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
                                if (this.f7262d != null) {
                                    atz atzVar = this.f7262d;
                                    boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) atzVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
                                    abstractC1441a.mo9750a(atzVar);
                                    c1384a = (atz.C1384a) abstractC1441a;
                                } else {
                                    c1384a = null;
                                }
                                this.f7262d = (atz) bokVar.mo9782a(atz.m8369c(), borVar);
                                if (c1384a != null) {
                                    c1384a.mo9750a(this.f7262d);
                                    this.f7262d = (atz) c1384a.m9911c();
                                }
                                break;
                            case 18:
                                if (this.f7263e != null) {
                                    avm avmVar = this.f7263e;
                                    boz.AbstractC1441a abstractC1441a2 = (boz.AbstractC1441a) avmVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
                                    abstractC1441a2.mo9750a(avmVar);
                                    c1402a = (avm.C1402a) abstractC1441a2;
                                } else {
                                    c1402a = null;
                                }
                                this.f7263e = (avm) bokVar.mo9782a(avm.m8501c(), borVar);
                                if (c1402a != null) {
                                    c1402a.mo9750a(this.f7263e);
                                    this.f7263e = (avm) c1402a.m9911c();
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
                if (f7261g == null) {
                    synchronized (atv.class) {
                        if (f7261g == null) {
                            f7261g = new boz.C1442b(f7260f);
                        }
                        break;
                    }
                }
                return f7261g;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7260f;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (this.f7262d != null) {
            bonVar.mo9849a(1, this.f7262d == null ? atz.m8369c() : this.f7262d);
        }
        if (this.f7263e != null) {
            bonVar.mo9849a(2, this.f7263e == null ? avm.m8501c() : this.f7263e);
        }
        this.f8560b.m10028a(bonVar);
    }

    /* JADX INFO: renamed from: b */
    public final avm m8351b() {
        return this.f7263e == null ? avm.m8501c() : this.f7263e;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = this.f8561c;
        if (i != -1) {
            return i;
        }
        int iM9819c = 0;
        if (this.f7262d != null) {
            iM9819c = bon.m9819c(1, this.f7262d == null ? atz.m8369c() : this.f7262d) + 0;
        }
        if (this.f7263e != null) {
            iM9819c += bon.m9819c(2, this.f7263e == null ? avm.m8501c() : this.f7263e);
        }
        int iM10034e = iM9819c + this.f8560b.m10034e();
        this.f8561c = iM10034e;
        return iM10034e;
    }
}
