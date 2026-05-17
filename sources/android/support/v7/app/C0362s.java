package android.support.v7.app;

/* JADX INFO: renamed from: android.support.v7.app.s */
/* JADX INFO: loaded from: classes.dex */
class C0362s {

    /* JADX INFO: renamed from: d */
    private static C0362s f2056d;

    /* JADX INFO: renamed from: a */
    public long f2057a;

    /* JADX INFO: renamed from: b */
    public long f2058b;

    /* JADX INFO: renamed from: c */
    public int f2059c;

    C0362s() {
    }

    /* JADX INFO: renamed from: a */
    static C0362s m2738a() {
        if (f2056d == null) {
            f2056d = new C0362s();
        }
        return f2056d;
    }

    /* JADX INFO: renamed from: a */
    public void m2739a(long j, double d, double d2) {
        float f = 6.24006f + (0.01720197f * ((j - 946728000000L) / 8.64E7f));
        double dSin = ((double) f) + (0.03341960161924362d * Math.sin(f)) + (3.4906598739326E-4d * Math.sin(2.0f * f)) + (5.236000106378924E-6d * Math.sin(3.0f * f)) + 1.796593063d + 3.141592653589793d;
        double dSin2 = (Math.sin(f) * 0.0053d) + ((-d2) / 360.0d) + ((double) (Math.round(((double) (r2 - 9.0E-4f)) - r6) + 9.0E-4f)) + ((-0.0069d) * Math.sin(2.0d * dSin));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d3 = 0.01745329238474369d * d;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(d3) * Math.sin(dAsin))) / (Math.cos(dAsin) * Math.cos(d3));
        if (dSin3 >= 1.0d) {
            this.f2059c = 1;
            this.f2057a = -1L;
            this.f2058b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f2059c = 0;
                this.f2057a = -1L;
                this.f2058b = -1L;
                return;
            }
            float fAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f2057a = Math.round((((double) fAcos) + dSin2) * 8.64E7d) + 946728000000L;
            this.f2058b = Math.round((dSin2 - ((double) fAcos)) * 8.64E7d) + 946728000000L;
            if (this.f2058b >= j || this.f2057a <= j) {
                this.f2059c = 1;
            } else {
                this.f2059c = 0;
            }
        }
    }
}
