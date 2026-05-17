package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
@cnb
final class cgx {

    /* JADX INFO: renamed from: a */
    private static final cgu f9981a = cgu.m10834a();

    /* JADX INFO: renamed from: b */
    private static final float f9982b = ((Float) bxm.m10409f().m10546a(can.f9445aR)).floatValue();

    /* JADX INFO: renamed from: c */
    private static final long f9983c = ((Long) bxm.m10409f().m10546a(can.f9443aP)).longValue();

    /* JADX INFO: renamed from: d */
    private static final float f9984d = ((Float) bxm.m10409f().m10546a(can.f9446aS)).floatValue();

    /* JADX INFO: renamed from: e */
    private static final long f9985e = ((Long) bxm.m10409f().m10546a(can.f9444aQ)).longValue();

    /* JADX INFO: renamed from: a */
    private static int m10848a(long j, int i) {
        return (int) ((j >>> ((i % 16) * 4)) & 15);
    }

    /* JADX INFO: renamed from: a */
    static boolean m10849a() {
        int iM10848a = Integer.MAX_VALUE;
        int iM10842h = f9981a.m10842h();
        int iM10843i = f9981a.m10843i();
        int iM10840f = f9981a.m10840f() + f9981a.m10841g();
        if (iM10843i <= ((iM10842h >= 16 || f9985e == 0) ? f9984d != 0.0f ? ((int) (f9984d * iM10842h)) + 1 : Integer.MAX_VALUE : m10848a(f9985e, iM10842h))) {
            if (iM10842h < 16 && f9983c != 0) {
                iM10848a = m10848a(f9983c, iM10842h);
            } else if (f9982b != 0.0f) {
                iM10848a = (int) (f9982b * iM10842h);
            }
            if (iM10840f <= iM10848a) {
                return true;
            }
        }
        return false;
    }
}
