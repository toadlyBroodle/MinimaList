package com.google.android.gms.internal;

import com.google.android.gms.internal.boz;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class awo extends boz<awo, C1417a> implements bqc {

    /* JADX INFO: renamed from: g */
    private static final awo f7496g;

    /* JADX INFO: renamed from: h */
    private static volatile bqg<awo> f7497h;

    /* JADX INFO: renamed from: d */
    private int f7498d;

    /* JADX INFO: renamed from: e */
    private String f7499e = "";

    /* JADX INFO: renamed from: f */
    private bpe<avy> f7500f = m9904l();

    /* JADX INFO: renamed from: com.google.android.gms.internal.awo$a */
    public static final class C1417a extends boz.AbstractC1441a<awo, C1417a> implements bqc {
        private C1417a() {
            super(awo.f7496g);
        }

        /* synthetic */ C1417a(awp awpVar) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1417a m8635a(avy avyVar) {
            m9910b();
            ((awo) this.f8562a).m8628a(avyVar);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1417a m8636a(String str) {
            m9910b();
            ((awo) this.f8562a).m8631a(str);
            return this;
        }
    }

    static {
        awo awoVar = new awo();
        f7496g = awoVar;
        awoVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        awoVar.f8560b.m10032c();
    }

    private awo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8628a(avy avyVar) {
        if (avyVar == null) {
            throw new NullPointerException();
        }
        if (!this.f7500f.mo9752a()) {
            bpe<avy> bpeVar = this.f7500f;
            int size = bpeVar.size();
            this.f7500f = bpeVar.mo9934a(size == 0 ? 10 : size << 1);
        }
        this.f7500f.add(avyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8631a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f7499e = str;
    }

    /* JADX INFO: renamed from: b */
    public static C1417a m8632b() {
        awo awoVar = f7496g;
        boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) awoVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
        abstractC1441a.mo9750a(awoVar);
        return (C1417a) abstractC1441a;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        awp awpVar = null;
        boolean z = false;
        switch (awp.f7501a[i - 1]) {
            case 1:
                return new awo();
            case 2:
                return f7496g;
            case 3:
                this.f7500f.mo9753b();
                return null;
            case 4:
                return new C1417a(awpVar);
            case 5:
                boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                awo awoVar = (awo) obj2;
                this.f7499e = interfaceC1448h.mo9919a(!this.f7499e.isEmpty(), this.f7499e, awoVar.f7499e.isEmpty() ? false : true, awoVar.f7499e);
                this.f7500f = interfaceC1448h.mo9916a(this.f7500f, awoVar.f7500f);
                if (interfaceC1448h != boz.C1446f.f8570a) {
                    return this;
                }
                this.f7498d |= awoVar.f7498d;
                return this;
            case 6:
                bok bokVar = (bok) obj;
                bor borVar = (bor) obj2;
                if (borVar == null) {
                    throw new NullPointerException();
                }
                while (!z) {
                    try {
                        try {
                            int iMo9781a = bokVar.mo9781a();
                            switch (iMo9781a) {
                                case 0:
                                    z = true;
                                    break;
                                case 10:
                                    this.f7499e = bokVar.mo9790f();
                                    break;
                                case 18:
                                    if (!this.f7500f.mo9752a()) {
                                        bpe<avy> bpeVar = this.f7500f;
                                        int size = bpeVar.size();
                                        this.f7500f = bpeVar.mo9934a(size == 0 ? 10 : size << 1);
                                    }
                                    this.f7500f.add((avy) bokVar.mo9782a(avy.m8549h(), borVar));
                                    break;
                                default:
                                    if (!m9905a(iMo9781a, bokVar)) {
                                        z = true;
                                    }
                                    break;
                            }
                        } catch (bpf e) {
                            throw new RuntimeException(e.m9943a(this));
                        }
                    } catch (IOException e2) {
                        throw new RuntimeException(new bpf(e2.getMessage()).m9943a(this));
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (f7497h == null) {
                    synchronized (awo.class) {
                        if (f7497h == null) {
                            f7497h = new boz.C1442b(f7496g);
                        }
                        break;
                    }
                }
                return f7497h;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7496g;
    }

    /* JADX INFO: renamed from: a */
    public final List<avy> m8634a() {
        return this.f7500f;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (!this.f7499e.isEmpty()) {
            bonVar.mo9850a(1, this.f7499e);
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f7500f.size()) {
                this.f8560b.m10028a(bonVar);
                return;
            } else {
                bonVar.mo9849a(2, this.f7500f.get(i2));
                i = i2 + 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = 0;
        int i2 = this.f8561c;
        if (i2 != -1) {
            return i2;
        }
        int iM9810b = !this.f7499e.isEmpty() ? bon.m9810b(1, this.f7499e) + 0 : 0;
        while (true) {
            int i3 = iM9810b;
            if (i >= this.f7500f.size()) {
                int iM10034e = this.f8560b.m10034e() + i3;
                this.f8561c = iM10034e;
                return iM10034e;
            }
            iM9810b = bon.m9819c(2, this.f7500f.get(i)) + i3;
            i++;
        }
    }
}
