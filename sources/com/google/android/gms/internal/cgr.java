package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C0727bk;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@cnb
final class cgr {

    /* JADX INFO: renamed from: a */
    private final Object[] f9954a;

    cgr(bwx bwxVar, String str, int i) {
        this.f9954a = C0727bk.m5633a((String) bxm.m10409f().m10546a(can.f9435aH), bwxVar, str, i, null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cgr) {
            return Arrays.equals(this.f9954a, ((cgr) obj).f9954a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9954a);
    }

    public final String toString() {
        String string = Arrays.toString(this.f9954a);
        return new StringBuilder(String.valueOf(string).length() + 24).append("[InterstitialAdPoolKey ").append(string).append("]").toString();
    }
}
