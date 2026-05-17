package android.support.v4.p016g;

import android.os.Build;
import android.os.Trace;

/* JADX INFO: renamed from: android.support.v4.g.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0203e {
    /* JADX INFO: renamed from: a */
    public static void m1471a() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1472a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}
