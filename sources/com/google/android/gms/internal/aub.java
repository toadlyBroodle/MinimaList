package com.google.android.gms.internal;

import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class aub extends boz<aub, C1386a> implements bqc {

    /* JADX INFO: renamed from: e */
    private static final aub f7277e;

    /* JADX INFO: renamed from: f */
    private static volatile bqg<aub> f7278f;

    /* JADX INFO: renamed from: d */
    private int f7279d;

    /* JADX INFO: renamed from: com.google.android.gms.internal.aub$a */
    public static final class C1386a extends boz.AbstractC1441a<aub, C1386a> implements bqc {
        private C1386a() {
            super(aub.f7277e);
        }

        /* synthetic */ C1386a(auc aucVar) {
            this();
        }
    }

    static {
        aub aubVar = new aub();
        f7277e = aubVar;
        aubVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        aubVar.f8560b.m10032c();
    }

    private aub() {
    }

    /* JADX INFO: renamed from: b */
    public static aub m8373b() {
        return f7277e;
    }

    /* JADX INFO: renamed from: a */
    public final int m8375a() {
        return this.f7279d;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        auc aucVar = null;
        boolean z = false;
        switch (auc.f7280a[i - 1]) {
            case 1:
                return new aub();
            case 2:
                return f7277e;
            case 3:
                return null;
            case 4:
                return new C1386a(aucVar);
            case 5:
                aub aubVar = (aub) obj2;
                this.f7279d = ((boz.InterfaceC1448h) obj).mo9914a(this.f7279d != 0, this.f7279d, aubVar.f7279d != 0, aubVar.f7279d);
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
                                this.f7279d = bokVar.mo9792h();
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
                if (f7278f == null) {
                    synchronized (aub.class) {
                        if (f7278f == null) {
                            f7278f = new boz.C1442b(f7277e);
                        }
                        break;
                    }
                }
                return f7278f;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7277e;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (this.f7279d != 0) {
            bonVar.mo9865c(1, this.f7279d);
        }
        this.f8560b.m10028a(bonVar);
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = this.f8561c;
        if (i != -1) {
            return i;
        }
        int iM9829e = (this.f7279d != 0 ? bon.m9829e(1, this.f7279d) + 0 : 0) + this.f8560b.m10034e();
        this.f8561c = iM9829e;
        return iM9829e;
    }
}
