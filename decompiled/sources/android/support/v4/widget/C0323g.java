package android.support.v4.widget;

import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: android.support.v4.widget.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0323g {

    /* JADX INFO: renamed from: a */
    private static final b f1731a;

    /* JADX INFO: renamed from: android.support.v4.widget.g$a */
    static class a extends b {
        a() {
        }

        @Override // android.support.v4.widget.C0323g.b
        /* JADX INFO: renamed from: a */
        public void mo2451a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.widget.g$b */
    static class b {
        b() {
        }

        /* JADX INFO: renamed from: a */
        public void mo2451a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f1731a = new a();
        } else {
            f1731a = new b();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2450a(EdgeEffect edgeEffect, float f, float f2) {
        f1731a.mo2451a(edgeEffect, f, f2);
    }
}
