package com.google.android.gms.internal;

import android.content.Context;
import java.io.File;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ie */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1633ie {

    /* JADX INFO: renamed from: a */
    private static cil f10779a;

    /* JADX INFO: renamed from: b */
    private static final Object f10780b = new Object();

    /* JADX INFO: renamed from: c */
    @Deprecated
    private static InterfaceC1640il<Void> f10781c = new C1634if();

    public C1633ie(Context context) {
        m11528a(context);
    }

    /* JADX INFO: renamed from: a */
    private static cil m11528a(Context context) {
        cil cilVar;
        cil cilVar2;
        synchronized (f10780b) {
            if (f10779a == null) {
                Context applicationContext = context.getApplicationContext();
                can.m10549a(applicationContext);
                if (((Boolean) bxm.m10409f().m10546a(can.f9578cs)).booleanValue()) {
                    cilVar2 = C1626hy.m11519a(applicationContext);
                } else {
                    cilVar2 = new cil(new C1694kl(new File(applicationContext.getCacheDir(), "volley")), new C1610hi((AbstractC1582gh) new C1859qo()));
                    cilVar2.m10939a();
                }
                f10779a = cilVar2;
            }
            cilVar = f10779a;
        }
        return cilVar;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceFutureC1689kg<String> m11529a(int i, String str, Map<String, String> map, byte[] bArr) {
        C1641im c1641im = new C1641im(null);
        C1637ii c1637ii = new C1637ii(this, str, c1641im);
        C1661jf c1661jf = new C1661jf(null);
        C1639ik c1639ik = new C1639ik(this, i, str, c1641im, c1637ii, bArr, map, c1661jf);
        if (C1661jf.m11600c()) {
            try {
                c1661jf.m11602a(str, "GET", c1639ik.mo10764b(), c1639ik.mo10763a());
            } catch (C1353a e) {
                C1560fm.m11615e(e.getMessage());
            }
        }
        f10779a.m10938a(c1639ik);
        return c1641im;
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public final <T> InterfaceFutureC1689kg<T> m11530a(String str, InterfaceC1640il<T> interfaceC1640il) {
        C1700kr c1700kr = new C1700kr();
        f10779a.m10938a(new C1642in(str, c1700kr));
        return C1678jw.m11622a(C1678jw.m11621a(c1700kr, new C1636ih(this, interfaceC1640il), C1695km.f10894b), Throwable.class, new C1635ig(this, interfaceC1640il), C1695km.f10894b);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceFutureC1689kg<String> m11531a(String str, Map<String, String> map) {
        return m11529a(0, str, map, null);
    }
}
