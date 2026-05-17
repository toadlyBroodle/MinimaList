package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0710au;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.md */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1740md {

    /* JADX INFO: renamed from: a */
    private final Context f11023a;

    /* JADX INFO: renamed from: b */
    private final String f11024b;

    /* JADX INFO: renamed from: c */
    private final C1670jo f11025c;

    /* JADX INFO: renamed from: d */
    private final cay f11026d;

    /* JADX INFO: renamed from: e */
    private final cba f11027e;

    /* JADX INFO: renamed from: g */
    private final long[] f11029g;

    /* JADX INFO: renamed from: h */
    private final String[] f11030h;

    /* JADX INFO: renamed from: m */
    private boolean f11035m;

    /* JADX INFO: renamed from: n */
    private AbstractC1724lo f11036n;

    /* JADX INFO: renamed from: o */
    private boolean f11037o;

    /* JADX INFO: renamed from: p */
    private boolean f11038p;

    /* JADX INFO: renamed from: f */
    private final C1629ia f11028f = new C1632id().m11527a("min_1", Double.MIN_VALUE, 1.0d).m11527a("1_5", 1.0d, 5.0d).m11527a("5_10", 5.0d, 10.0d).m11527a("10_20", 10.0d, 20.0d).m11527a("20_30", 20.0d, 30.0d).m11527a("30_max", 30.0d, Double.MAX_VALUE).m11526a();

    /* JADX INFO: renamed from: i */
    private boolean f11031i = false;

    /* JADX INFO: renamed from: j */
    private boolean f11032j = false;

    /* JADX INFO: renamed from: k */
    private boolean f11033k = false;

    /* JADX INFO: renamed from: l */
    private boolean f11034l = false;

    /* JADX INFO: renamed from: q */
    private long f11039q = -1;

    public C1740md(Context context, C1670jo c1670jo, String str, cba cbaVar, cay cayVar) {
        this.f11023a = context;
        this.f11025c = c1670jo;
        this.f11024b = str;
        this.f11027e = cbaVar;
        this.f11026d = cayVar;
        String str2 = (String) bxm.m10409f().m10546a(can.f9665q);
        if (str2 == null) {
            this.f11030h = new String[0];
            this.f11029g = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        this.f11030h = new String[strArrSplit.length];
        this.f11029g = new long[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                this.f11029g[i] = Long.parseLong(strArrSplit[i]);
            } catch (NumberFormatException e) {
                C1560fm.m11613c("Unable to parse frame hash target time number.", e);
                this.f11029g[i] = -1;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11763a() {
        if (!this.f11031i || this.f11032j) {
            return;
        }
        cat.m10565a(this.f11027e, this.f11026d, "vfr2");
        this.f11032j = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m11764a(AbstractC1724lo abstractC1724lo) {
        cat.m10565a(this.f11027e, this.f11026d, "vpc2");
        this.f11031i = true;
        if (this.f11027e != null) {
            this.f11027e.m10579a("vpn", abstractC1724lo.mo11679a());
        }
        this.f11036n = abstractC1724lo;
    }

    /* JADX INFO: renamed from: b */
    public final void m11765b() {
        if (!((Boolean) bxm.m10409f().m10546a(can.f9664p)).booleanValue() || this.f11037o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.f11024b);
        bundle.putString("player", this.f11036n.mo11679a());
        for (C1631ic c1631ic : this.f11028f.m11521a()) {
            String strValueOf = String.valueOf("fps_c_");
            String strValueOf2 = String.valueOf(c1631ic.f10771a);
            bundle.putString(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf), Integer.toString(c1631ic.f10773c));
            String strValueOf3 = String.valueOf("fps_p_");
            String strValueOf4 = String.valueOf(c1631ic.f10771a);
            bundle.putString(strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3), Double.toString(c1631ic.f10772b));
        }
        for (int i = 0; i < this.f11029g.length; i++) {
            String str = this.f11030h[i];
            if (str != null) {
                String strValueOf5 = String.valueOf(Long.valueOf(this.f11029g[i]));
                bundle.putString(new StringBuilder(String.valueOf("fh_").length() + String.valueOf(strValueOf5).length()).append("fh_").append(strValueOf5).toString(), str);
            }
        }
        C0710au.m5569e().m11443a(this.f11023a, this.f11025c.f10855a, "gmob-apps", bundle, true);
        this.f11037o = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m11766b(AbstractC1724lo abstractC1724lo) {
        long j;
        if (this.f11033k && !this.f11034l) {
            cat.m10565a(this.f11027e, this.f11026d, "vff2");
            this.f11034l = true;
        }
        long jMo7254c = C0710au.m5575k().mo7254c();
        if (this.f11035m && this.f11038p && this.f11039q != -1) {
            this.f11028f.m11522a(TimeUnit.SECONDS.toNanos(1L) / (jMo7254c - this.f11039q));
        }
        this.f11038p = this.f11035m;
        this.f11039q = jMo7254c;
        long jLongValue = ((Long) bxm.m10409f().m10546a(can.f9666r)).longValue();
        long currentPosition = abstractC1724lo.getCurrentPosition();
        for (int i = 0; i < this.f11030h.length; i++) {
            if (this.f11030h[i] == null && jLongValue > Math.abs(currentPosition - this.f11029g[i])) {
                String[] strArr = this.f11030h;
                Bitmap bitmap = abstractC1724lo.getBitmap(8, 8);
                long j2 = 0;
                long j3 = 63;
                int i2 = 0;
                while (i2 < 8) {
                    int i3 = 0;
                    long j4 = j2;
                    while (true) {
                        j = j3;
                        if (i3 < 8) {
                            int pixel = bitmap.getPixel(i3, i2);
                            j4 |= (Color.green(pixel) + (Color.blue(pixel) + Color.red(pixel)) > 128 ? 1L : 0L) << ((int) j);
                            i3++;
                            j3 = j - 1;
                        }
                    }
                    i2++;
                    j3 = j;
                    j2 = j4;
                }
                strArr[i] = String.format("%016X", Long.valueOf(j2));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11767c() {
        this.f11035m = true;
        if (!this.f11032j || this.f11033k) {
            return;
        }
        cat.m10565a(this.f11027e, this.f11026d, "vfp2");
        this.f11033k = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m11768d() {
        this.f11035m = false;
    }
}
