package com.google.android.gms.internal;

import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class aun extends boz<aun, C1392a> implements bqc {

    /* JADX INFO: renamed from: d */
    private static final aun f7307d;

    /* JADX INFO: renamed from: e */
    private static volatile bqg<aun> f7308e;

    /* JADX INFO: renamed from: com.google.android.gms.internal.aun$a */
    public static final class C1392a extends boz.AbstractC1441a<aun, C1392a> implements bqc {
        private C1392a() {
            super(aun.f7307d);
        }

        /* synthetic */ C1392a(auo auoVar) {
            this();
        }
    }

    static {
        aun aunVar = new aun();
        f7307d = aunVar;
        aunVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        aunVar.f8560b.m10032c();
    }

    private aun() {
    }

    /* JADX INFO: renamed from: a */
    public static aun m8416a() {
        return f7307d;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        auo auoVar = null;
        switch (auo.f7309a[i - 1]) {
            case 1:
                return new aun();
            case 2:
                return f7307d;
            case 3:
                return null;
            case 4:
                return new C1392a(auoVar);
            case 5:
                return this;
            case 6:
                bok bokVar = (bok) obj;
                if (((bor) obj2) == null) {
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
                if (f7308e == null) {
                    synchronized (aun.class) {
                        if (f7308e == null) {
                            f7308e = new boz.C1442b(f7307d);
                        }
                        break;
                    }
                }
                return f7308e;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7307d;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        this.f8560b.m10028a(bonVar);
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = this.f8561c;
        if (i != -1) {
            return i;
        }
        int iM10034e = this.f8560b.m10034e() + 0;
        this.f8561c = iM10034e;
        return iM10034e;
    }
}
