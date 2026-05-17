package com.google.android.gms.internal;

import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class auh extends boz<auh, C1389a> implements bqc {

    /* JADX INFO: renamed from: e */
    private static final auh f7292e;

    /* JADX INFO: renamed from: f */
    private static volatile bqg<auh> f7293f;

    /* JADX INFO: renamed from: d */
    private int f7294d;

    /* JADX INFO: renamed from: com.google.android.gms.internal.auh$a */
    public static final class C1389a extends boz.AbstractC1441a<auh, C1389a> implements bqc {
        private C1389a() {
            super(auh.f7292e);
        }

        /* synthetic */ C1389a(aui auiVar) {
            this();
        }
    }

    static {
        auh auhVar = new auh();
        f7292e = auhVar;
        auhVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        auhVar.f8560b.m10032c();
    }

    private auh() {
    }

    /* JADX INFO: renamed from: b */
    public static auh m8395b() {
        return f7292e;
    }

    /* JADX INFO: renamed from: a */
    public final int m8397a() {
        return this.f7294d;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        aui auiVar = null;
        boolean z = false;
        switch (aui.f7295a[i - 1]) {
            case 1:
                return new auh();
            case 2:
                return f7292e;
            case 3:
                return null;
            case 4:
                return new C1389a(auiVar);
            case 5:
                auh auhVar = (auh) obj2;
                this.f7294d = ((boz.InterfaceC1448h) obj).mo9914a(this.f7294d != 0, this.f7294d, auhVar.f7294d != 0, auhVar.f7294d);
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
                                this.f7294d = bokVar.mo9792h();
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
                if (f7293f == null) {
                    synchronized (auh.class) {
                        if (f7293f == null) {
                            f7293f = new boz.C1442b(f7292e);
                        }
                        break;
                    }
                }
                return f7293f;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7292e;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (this.f7294d != 0) {
            bonVar.mo9865c(1, this.f7294d);
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
        int iM9829e = (this.f7294d != 0 ? bon.m9829e(1, this.f7294d) + 0 : 0) + this.f8560b.m10034e();
        this.f8561c = iM9829e;
        return iM9829e;
    }
}
