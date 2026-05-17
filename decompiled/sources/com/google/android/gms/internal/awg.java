package com.google.android.gms.internal;

import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class awg extends boz<awg, C1414a> implements bqc {

    /* JADX INFO: renamed from: e */
    private static final awg f7473e;

    /* JADX INFO: renamed from: f */
    private static volatile bqg<awg> f7474f;

    /* JADX INFO: renamed from: d */
    private String f7475d = "";

    /* JADX INFO: renamed from: com.google.android.gms.internal.awg$a */
    public static final class C1414a extends boz.AbstractC1441a<awg, C1414a> implements bqc {
        private C1414a() {
            super(awg.f7473e);
        }

        /* synthetic */ C1414a(awh awhVar) {
            this();
        }
    }

    static {
        awg awgVar = new awg();
        f7473e = awgVar;
        awgVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        awgVar.f8560b.m10032c();
    }

    private awg() {
    }

    /* JADX INFO: renamed from: a */
    public static awg m8607a(bob bobVar) {
        return (awg) boz.m9898a(f7473e, bobVar);
    }

    /* JADX INFO: renamed from: b */
    public static awg m8608b() {
        return f7473e;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        awh awhVar = null;
        boolean z = false;
        switch (awh.f7476a[i - 1]) {
            case 1:
                return new awg();
            case 2:
                return f7473e;
            case 3:
                return null;
            case 4:
                return new C1414a(awhVar);
            case 5:
                awg awgVar = (awg) obj2;
                this.f7475d = ((boz.InterfaceC1448h) obj).mo9919a(!this.f7475d.isEmpty(), this.f7475d, awgVar.f7475d.isEmpty() ? false : true, awgVar.f7475d);
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
                            case 10:
                                this.f7475d = bokVar.mo9790f();
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
                if (f7474f == null) {
                    synchronized (awg.class) {
                        if (f7474f == null) {
                            f7474f = new boz.C1442b(f7473e);
                        }
                        break;
                    }
                }
                return f7474f;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7473e;
    }

    /* JADX INFO: renamed from: a */
    public final String m8610a() {
        return this.f7475d;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (!this.f7475d.isEmpty()) {
            bonVar.mo9850a(1, this.f7475d);
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
        int iM9810b = (this.f7475d.isEmpty() ? 0 : bon.m9810b(1, this.f7475d) + 0) + this.f8560b.m10034e();
        this.f8561c = iM9810b;
        return iM9810b;
    }
}
