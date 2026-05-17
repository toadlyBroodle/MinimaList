package com.google.android.gms.internal;

import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class avy extends boz<avy, C1407a> implements bqc {

    /* JADX INFO: renamed from: i */
    private static final avy f7435i;

    /* JADX INFO: renamed from: j */
    private static volatile bqg<avy> f7436j;

    /* JADX INFO: renamed from: f */
    private int f7439f;

    /* JADX INFO: renamed from: g */
    private boolean f7440g;

    /* JADX INFO: renamed from: d */
    private String f7437d = "";

    /* JADX INFO: renamed from: e */
    private String f7438e = "";

    /* JADX INFO: renamed from: h */
    private String f7441h = "";

    /* JADX INFO: renamed from: com.google.android.gms.internal.avy$a */
    public static final class C1407a extends boz.AbstractC1441a<avy, C1407a> implements bqc {
        private C1407a() {
            super(avy.f7435i);
        }

        /* synthetic */ C1407a(avz avzVar) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1407a m8556a(int i) {
            m9910b();
            ((avy) this.f8562a).m8538a(0);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1407a m8557a(String str) {
            m9910b();
            ((avy) this.f8562a).m8542a(str);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1407a m8558a(boolean z) {
            m9910b();
            ((avy) this.f8562a).m8543a(true);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final C1407a m8559b(String str) {
            m9910b();
            ((avy) this.f8562a).m8545b(str);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final C1407a m8560c(String str) {
            m9910b();
            ((avy) this.f8562a).m8547c(str);
            return this;
        }
    }

    static {
        avy avyVar = new avy();
        f7435i = avyVar;
        avyVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        avyVar.f8560b.m10032c();
    }

    private avy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8538a(int i) {
        this.f7439f = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8542a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f7437d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8543a(boolean z) {
        this.f7440g = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m8545b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f7438e = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final void m8547c(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f7441h = str;
    }

    /* JADX INFO: renamed from: g */
    public static C1407a m8548g() {
        avy avyVar = f7435i;
        boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) avyVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
        abstractC1441a.mo9750a(avyVar);
        return (C1407a) abstractC1441a;
    }

    /* JADX INFO: renamed from: h */
    public static avy m8549h() {
        return f7435i;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        avz avzVar = null;
        boolean z = false;
        switch (avz.f7442a[i - 1]) {
            case 1:
                return new avy();
            case 2:
                return f7435i;
            case 3:
                return null;
            case 4:
                return new C1407a(avzVar);
            case 5:
                boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                avy avyVar = (avy) obj2;
                this.f7437d = interfaceC1448h.mo9919a(!this.f7437d.isEmpty(), this.f7437d, !avyVar.f7437d.isEmpty(), avyVar.f7437d);
                this.f7438e = interfaceC1448h.mo9919a(!this.f7438e.isEmpty(), this.f7438e, !avyVar.f7438e.isEmpty(), avyVar.f7438e);
                this.f7439f = interfaceC1448h.mo9914a(this.f7439f != 0, this.f7439f, avyVar.f7439f != 0, avyVar.f7439f);
                this.f7440g = interfaceC1448h.mo9920a(this.f7440g, this.f7440g, avyVar.f7440g, avyVar.f7440g);
                this.f7441h = interfaceC1448h.mo9919a(!this.f7441h.isEmpty(), this.f7441h, avyVar.f7441h.isEmpty() ? false : true, avyVar.f7441h);
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
                                this.f7437d = bokVar.mo9790f();
                                break;
                            case 18:
                                this.f7438e = bokVar.mo9790f();
                                break;
                            case 24:
                                this.f7439f = bokVar.mo9792h();
                                break;
                            case 32:
                                this.f7440g = bokVar.mo9789e();
                                break;
                            case 42:
                                this.f7441h = bokVar.mo9790f();
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
                if (f7436j == null) {
                    synchronized (avy.class) {
                        if (f7436j == null) {
                            f7436j = new boz.C1442b(f7435i);
                        }
                        break;
                    }
                }
                return f7436j;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7435i;
    }

    /* JADX INFO: renamed from: a */
    public final String m8551a() {
        return this.f7437d;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (!this.f7437d.isEmpty()) {
            bonVar.mo9850a(1, this.f7437d);
        }
        if (!this.f7438e.isEmpty()) {
            bonVar.mo9850a(2, this.f7438e);
        }
        if (this.f7439f != 0) {
            bonVar.mo9865c(3, this.f7439f);
        }
        if (this.f7440g) {
            bonVar.mo9851a(4, this.f7440g);
        }
        if (!this.f7441h.isEmpty()) {
            bonVar.mo9850a(5, this.f7441h);
        }
        this.f8560b.m10028a(bonVar);
    }

    /* JADX INFO: renamed from: b */
    public final String m8552b() {
        return this.f7438e;
    }

    /* JADX INFO: renamed from: c */
    public final int m8553c() {
        return this.f7439f;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = this.f8561c;
        if (i != -1) {
            return i;
        }
        int iM9810b = this.f7437d.isEmpty() ? 0 : bon.m9810b(1, this.f7437d) + 0;
        if (!this.f7438e.isEmpty()) {
            iM9810b += bon.m9810b(2, this.f7438e);
        }
        if (this.f7439f != 0) {
            iM9810b += bon.m9829e(3, this.f7439f);
        }
        if (this.f7440g) {
            iM9810b += bon.m9811b(4, this.f7440g);
        }
        if (!this.f7441h.isEmpty()) {
            iM9810b += bon.m9810b(5, this.f7441h);
        }
        int iM10034e = iM9810b + this.f8560b.m10034e();
        this.f8561c = iM10034e;
        return iM10034e;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m8554e() {
        return this.f7440g;
    }

    /* JADX INFO: renamed from: f */
    public final String m8555f() {
        return this.f7441h;
    }
}
