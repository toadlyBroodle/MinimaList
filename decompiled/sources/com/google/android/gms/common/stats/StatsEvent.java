package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.AbstractC2011we;

/* JADX INFO: loaded from: classes.dex */
public abstract class StatsEvent extends AbstractC2011we implements ReflectedParcelable {
    /* JADX INFO: renamed from: a */
    public abstract long mo7236a();

    /* JADX INFO: renamed from: b */
    public abstract int mo7237b();

    /* JADX INFO: renamed from: c */
    public abstract long mo7238c();

    /* JADX INFO: renamed from: d */
    public abstract String mo7239d();

    public String toString() {
        long jMo7236a = mo7236a();
        int iMo7237b = mo7237b();
        long jMo7238c = mo7238c();
        String strMo7239d = mo7239d();
        return new StringBuilder(String.valueOf("\t").length() + 51 + String.valueOf("\t").length() + String.valueOf(strMo7239d).length()).append(jMo7236a).append("\t").append(iMo7237b).append("\t").append(jMo7238c).append(strMo7239d).toString();
    }
}
