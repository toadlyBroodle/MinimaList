package android.support.v4.p019j;

import android.os.Build;
import android.support.p002a.C0011a;
import android.view.ViewGroup;

/* JADX INFO: renamed from: android.support.v4.j.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0248s {

    /* JADX INFO: renamed from: a */
    static final c f1360a;

    /* JADX INFO: renamed from: android.support.v4.j.s$a */
    static class a extends c {
        a() {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.j.s$b */
    static class b extends a {
        b() {
        }

        @Override // android.support.v4.p019j.C0248s.c
        /* JADX INFO: renamed from: a */
        public boolean mo1836a(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }
    }

    /* JADX INFO: renamed from: android.support.v4.j.s$c */
    static class c {
        c() {
        }

        /* JADX INFO: renamed from: a */
        public boolean mo1836a(ViewGroup viewGroup) {
            Boolean bool = (Boolean) viewGroup.getTag(C0011a.a.tag_transition_group);
            return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C0246q.m1767m(viewGroup) == null) ? false : true;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f1360a = new b();
        } else if (Build.VERSION.SDK_INT >= 18) {
            f1360a = new a();
        } else {
            f1360a = new c();
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static void m1834a(ViewGroup viewGroup, boolean z) {
        viewGroup.setMotionEventSplittingEnabled(z);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1835a(ViewGroup viewGroup) {
        return f1360a.mo1836a(viewGroup);
    }
}
