package com.google.android.gms.internal;

import com.google.android.gms.internal.avw;
import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class awk extends boz<awk, C1416a> implements bqc {

    /* JADX INFO: renamed from: f */
    private static final awk f7482f;

    /* JADX INFO: renamed from: g */
    private static volatile bqg<awk> f7483g;

    /* JADX INFO: renamed from: d */
    private String f7484d = "";

    /* JADX INFO: renamed from: e */
    private avw f7485e;

    /* JADX INFO: renamed from: com.google.android.gms.internal.awk$a */
    public static final class C1416a extends boz.AbstractC1441a<awk, C1416a> implements bqc {
        private C1416a() {
            super(awk.f7482f);
        }

        /* synthetic */ C1416a(awl awlVar) {
            this();
        }
    }

    static {
        awk awkVar = new awk();
        f7482f = awkVar;
        awkVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        awkVar.f8560b.m10032c();
    }

    private awk() {
    }

    /* JADX INFO: renamed from: a */
    public static awk m8622a(bob bobVar) {
        return (awk) boz.m9898a(f7482f, bobVar);
    }

    /* JADX INFO: renamed from: c */
    public static awk m8623c() {
        return f7482f;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        avw.C1406a c1406a;
        awl awlVar = null;
        switch (awl.f7486a[i - 1]) {
            case 1:
                return new awk();
            case 2:
                return f7482f;
            case 3:
                return null;
            case 4:
                return new C1416a(awlVar);
            case 5:
                boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                awk awkVar = (awk) obj2;
                this.f7484d = interfaceC1448h.mo9919a(!this.f7484d.isEmpty(), this.f7484d, awkVar.f7484d.isEmpty() ? false : true, awkVar.f7484d);
                this.f7485e = (avw) interfaceC1448h.mo9917a(this.f7485e, awkVar.f7485e);
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
                                this.f7484d = bokVar.mo9790f();
                                break;
                            case 18:
                                if (this.f7485e != null) {
                                    avw avwVar = this.f7485e;
                                    boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) avwVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
                                    abstractC1441a.mo9750a(avwVar);
                                    c1406a = (avw.C1406a) abstractC1441a;
                                } else {
                                    c1406a = null;
                                }
                                this.f7485e = (avw) bokVar.mo9782a(avw.m8534c(), borVar);
                                if (c1406a != null) {
                                    c1406a.mo9750a(this.f7485e);
                                    this.f7485e = (avw) c1406a.m9911c();
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
                if (f7483g == null) {
                    synchronized (awk.class) {
                        if (f7483g == null) {
                            f7483g = new boz.C1442b(f7482f);
                        }
                        break;
                    }
                }
                return f7483g;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7482f;
    }

    /* JADX INFO: renamed from: a */
    public final String m8625a() {
        return this.f7484d;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (!this.f7484d.isEmpty()) {
            bonVar.mo9850a(1, this.f7484d);
        }
        if (this.f7485e != null) {
            bonVar.mo9849a(2, this.f7485e == null ? avw.m8534c() : this.f7485e);
        }
        this.f8560b.m10028a(bonVar);
    }

    /* JADX INFO: renamed from: b */
    public final avw m8626b() {
        return this.f7485e == null ? avw.m8534c() : this.f7485e;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = this.f8561c;
        if (i != -1) {
            return i;
        }
        int iM9810b = this.f7484d.isEmpty() ? 0 : bon.m9810b(1, this.f7484d) + 0;
        if (this.f7485e != null) {
            iM9810b += bon.m9819c(2, this.f7485e == null ? avw.m8534c() : this.f7485e);
        }
        int iM10034e = iM9810b + this.f8560b.m10034e();
        this.f8561c = iM10034e;
        return iM10034e;
    }
}
