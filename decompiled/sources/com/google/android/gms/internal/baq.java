package com.google.android.gms.internal;

import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class baq extends bnq {

    /* JADX INFO: renamed from: d */
    private static volatile C2043xj f7692d = null;

    /* JADX INFO: renamed from: e */
    private static final Object f7693e = new Object();

    /* JADX INFO: renamed from: f */
    private C1921sw f7694f;

    public baq(arz arzVar, String str, String str2, C1937tl c1937tl, int i, int i2, C1921sw c1921sw) {
        super(arzVar, str, str2, c1937tl, i, 27);
        this.f7694f = null;
        this.f7694f = c1921sw;
    }

    /* JADX INFO: renamed from: c */
    private final String m8784c() {
        try {
            if (this.f8491a.m8262l() != null) {
                this.f8491a.m8262l().get();
            }
            C1937tl c1937tlM8261k = this.f8491a.m8261k();
            if (c1937tlM8261k != null && c1937tlM8261k.f11596n != null) {
                return c1937tlM8261k.f11596n;
            }
        } catch (InterruptedException e) {
        } catch (ExecutionException e2) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f0  */
    @Override // com.google.android.gms.internal.bnq
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void mo8698a() {
        char c;
        boolean z;
        if (f7692d == null || atq.m8328b(f7692d.f12294a) || f7692d.f12294a.equals("E") || f7692d.f12294a.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
            synchronized (f7693e) {
                C1921sw c1921sw = this.f7694f;
                if (atq.m8328b(null)) {
                    C1921sw c1921sw2 = this.f7694f;
                    atq.m8328b(null);
                    Boolean bool = false;
                    if (bool.booleanValue()) {
                        if (this.f8491a.m8259i()) {
                            if (((Boolean) bxm.m10409f().m10546a(can.f9482bB)).booleanValue()) {
                                z = ((Boolean) bxm.m10409f().m10546a(can.f9483bC)).booleanValue();
                                if (!z) {
                                    c = 3;
                                }
                            }
                        }
                        if (!z) {
                        }
                    }
                    c = 2;
                } else {
                    c = 4;
                }
                Method method = this.f8493c;
                Object[] objArr = new Object[2];
                objArr[0] = this.f8491a.m8247a();
                objArr[1] = Boolean.valueOf(c == 2);
                C2043xj c2043xj = new C2043xj((String) method.invoke(null, objArr));
                f7692d = c2043xj;
                if (atq.m8328b(c2043xj.f12294a) || f7692d.f12294a.equals("E")) {
                    switch (c) {
                        case 3:
                            String strM8784c = m8784c();
                            if (!atq.m8328b(strM8784c)) {
                                f7692d.f12294a = strM8784c;
                            }
                            break;
                        case 4:
                            C1929td c1929td = null;
                            f7692d.f12294a = c1929td.f11536a;
                            break;
                    }
                }
            }
        }
        synchronized (this.f8492b) {
            if (f7692d != null) {
                this.f8492b.f11596n = f7692d.f12294a;
                this.f8492b.f11602t = Long.valueOf(f7692d.f12295b);
                this.f8492b.f11601s = f7692d.f12296c;
                this.f8492b.f11546C = f7692d.f12297d;
                this.f8492b.f11547D = f7692d.f12298e;
            }
        }
    }
}
