package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.rn */
/* JADX INFO: loaded from: classes.dex */
final class C1885rn {

    /* JADX INFO: renamed from: a */
    private int f11475a;

    /* JADX INFO: renamed from: b */
    private ByteArrayOutputStream f11476b = new ByteArrayOutputStream();

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C1884rm f11477c;

    public C1885rn(C1884rm c1884rm) {
        this.f11477c = c1884rm;
    }

    /* JADX INFO: renamed from: a */
    public final int m12250a() {
        return this.f11475a;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12251a(C1877rf c1877rf) {
        C1221aj.m7065a(c1877rf);
        if (this.f11475a + 1 > C1863qs.m12175g()) {
            return false;
        }
        String strM12247a = this.f11477c.m12247a(c1877rf, false);
        if (strM12247a == null) {
            this.f11477c.m12039k().m12228a(c1877rf, "Error formatting hit");
            return true;
        }
        byte[] bytes = strM12247a.getBytes();
        int length = bytes.length;
        if (length > C1863qs.m12171c()) {
            this.f11477c.m12039k().m12228a(c1877rf, "Hit size exceeds the maximum size limit");
            return true;
        }
        if (this.f11476b.size() > 0) {
            length++;
        }
        if (this.f11476b.size() + length > C1872ra.f11436t.m12204a().intValue()) {
            return false;
        }
        try {
            if (this.f11476b.size() > 0) {
                this.f11476b.write(C1884rm.f11472c);
            }
            this.f11476b.write(bytes);
            this.f11475a++;
            return true;
        } catch (IOException e) {
            this.f11477c.m12034e("Failed to write payload when batching hits", e);
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m12252b() {
        return this.f11476b.toByteArray();
    }
}
