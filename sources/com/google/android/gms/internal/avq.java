package com.google.android.gms.internal;

import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class avq extends boz<avq, C1404a> implements bqc {

    /* JADX INFO: renamed from: g */
    private static final avq f7393g;

    /* JADX INFO: renamed from: h */
    private static volatile bqg<avq> f7394h;

    /* JADX INFO: renamed from: d */
    private String f7395d = "";

    /* JADX INFO: renamed from: e */
    private bob f7396e = bob.f8512a;

    /* JADX INFO: renamed from: f */
    private int f7397f;

    /* JADX INFO: renamed from: com.google.android.gms.internal.avq$a */
    public static final class C1404a extends boz.AbstractC1441a<avq, C1404a> implements bqc {
        private C1404a() {
            super(avq.f7393g);
        }

        /* synthetic */ C1404a(avr avrVar) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1404a m8521a(EnumC1405b enumC1405b) {
            m9910b();
            ((avq) this.f8562a).m8509a(enumC1405b);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1404a m8522a(bob bobVar) {
            m9910b();
            ((avq) this.f8562a).m8513a(bobVar);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1404a m8523a(String str) {
            m9910b();
            ((avq) this.f8562a).m8514a(str);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.avq$b */
    public enum EnumC1405b implements bpc {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: g */
        private static final bpd<EnumC1405b> f7404g = new avt();

        /* JADX INFO: renamed from: h */
        private final int f7406h;

        EnumC1405b(int i) {
            this.f7406h = i;
        }

        /* JADX INFO: renamed from: a */
        public static EnumC1405b m8524a(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_KEYMATERIAL;
                case 1:
                    return SYMMETRIC;
                case 2:
                    return ASYMMETRIC_PRIVATE;
                case 3:
                    return ASYMMETRIC_PUBLIC;
                case 4:
                    return REMOTE;
                default:
                    return null;
            }
        }

        @Override // com.google.android.gms.internal.bpc
        /* JADX INFO: renamed from: a */
        public final int mo8430a() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.f7406h;
        }
    }

    static {
        avq avqVar = new avq();
        f7393g = avqVar;
        avqVar.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
        avqVar.f8560b.m10032c();
    }

    private avq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8509a(EnumC1405b enumC1405b) {
        if (enumC1405b == null) {
            throw new NullPointerException();
        }
        this.f7397f = enumC1405b.mo8430a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8513a(bob bobVar) {
        if (bobVar == null) {
            throw new NullPointerException();
        }
        this.f7396e = bobVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8514a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f7395d = str;
    }

    /* JADX INFO: renamed from: e */
    public static C1404a m8515e() {
        avq avqVar = f7393g;
        boz.AbstractC1441a abstractC1441a = (boz.AbstractC1441a) avqVar.mo8340a(boz.C1447g.f8578h, (Object) null, (Object) null);
        abstractC1441a.mo9750a(avqVar);
        return (C1404a) abstractC1441a;
    }

    /* JADX INFO: renamed from: f */
    public static avq m8516f() {
        return f7393g;
    }

    @Override // com.google.android.gms.internal.boz
    /* JADX INFO: renamed from: a */
    protected final Object mo8340a(int i, Object obj, Object obj2) {
        avr avrVar = null;
        boolean z = false;
        switch (avr.f7407a[i - 1]) {
            case 1:
                return new avq();
            case 2:
                return f7393g;
            case 3:
                return null;
            case 4:
                return new C1404a(avrVar);
            case 5:
                boz.InterfaceC1448h interfaceC1448h = (boz.InterfaceC1448h) obj;
                avq avqVar = (avq) obj2;
                this.f7395d = interfaceC1448h.mo9919a(!this.f7395d.isEmpty(), this.f7395d, !avqVar.f7395d.isEmpty(), avqVar.f7395d);
                this.f7396e = interfaceC1448h.mo9915a(this.f7396e != bob.f8512a, this.f7396e, avqVar.f7396e != bob.f8512a, avqVar.f7396e);
                this.f7397f = interfaceC1448h.mo9914a(this.f7397f != 0, this.f7397f, avqVar.f7397f != 0, avqVar.f7397f);
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
                                this.f7395d = bokVar.mo9790f();
                                break;
                            case 18:
                                this.f7396e = bokVar.mo9791g();
                                break;
                            case 24:
                                this.f7397f = bokVar.mo9793i();
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
                if (f7394h == null) {
                    synchronized (avq.class) {
                        if (f7394h == null) {
                            f7394h = new boz.C1442b(f7393g);
                        }
                        break;
                    }
                }
                return f7394h;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f7393g;
    }

    /* JADX INFO: renamed from: a */
    public final String m8518a() {
        return this.f7395d;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public final void mo8341a(bon bonVar) {
        if (!this.f7395d.isEmpty()) {
            bonVar.mo9850a(1, this.f7395d);
        }
        if (!this.f7396e.m9769b()) {
            bonVar.mo9848a(2, this.f7396e);
        }
        if (this.f7397f != EnumC1405b.UNKNOWN_KEYMATERIAL.mo8430a()) {
            bonVar.mo9859b(3, this.f7397f);
        }
        this.f8560b.m10028a(bonVar);
    }

    /* JADX INFO: renamed from: b */
    public final bob m8519b() {
        return this.f7396e;
    }

    /* JADX INFO: renamed from: c */
    public final EnumC1405b m8520c() {
        EnumC1405b enumC1405bM8524a = EnumC1405b.m8524a(this.f7397f);
        return enumC1405bM8524a == null ? EnumC1405b.UNRECOGNIZED : enumC1405bM8524a;
    }

    @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public final int mo8344d() {
        int i = this.f8561c;
        if (i != -1) {
            return i;
        }
        int iM9810b = this.f7395d.isEmpty() ? 0 : bon.m9810b(1, this.f7395d) + 0;
        if (!this.f7396e.m9769b()) {
            iM9810b += bon.m9818c(2, this.f7396e);
        }
        if (this.f7397f != EnumC1405b.UNKNOWN_KEYMATERIAL.mo8430a()) {
            iM9810b += bon.m9835g(3, this.f7397f);
        }
        int iM10034e = iM9810b + this.f8560b.m10034e();
        this.f8561c = iM10034e;
        return iM10034e;
    }
}
