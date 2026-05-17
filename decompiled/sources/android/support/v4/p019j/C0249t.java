package android.support.v4.p019j;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: android.support.v4.j.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0249t {

    /* JADX INFO: renamed from: a */
    static final c f1361a;

    /* JADX INFO: renamed from: android.support.v4.j.t$a */
    static class a extends c {
        a() {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.j.t$b */
    static class b extends a {
        b() {
        }

        @Override // android.support.v4.p019j.C0249t.c
        /* JADX INFO: renamed from: a */
        public void mo1844a(ViewParent viewParent, View view) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }

        @Override // android.support.v4.p019j.C0249t.c
        /* JADX INFO: renamed from: a */
        public void mo1845a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
            }
        }

        @Override // android.support.v4.p019j.C0249t.c
        /* JADX INFO: renamed from: a */
        public void mo1846a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }

        @Override // android.support.v4.p019j.C0249t.c
        /* JADX INFO: renamed from: a */
        public boolean mo1847a(ViewParent viewParent, View view, float f, float f2) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
                return false;
            }
        }

        @Override // android.support.v4.p019j.C0249t.c
        /* JADX INFO: renamed from: a */
        public boolean mo1848a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
                return false;
            }
        }

        @Override // android.support.v4.p019j.C0249t.c
        /* JADX INFO: renamed from: a */
        public boolean mo1849a(ViewParent viewParent, View view, View view2, int i) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
                return false;
            }
        }

        @Override // android.support.v4.p019j.C0249t.c
        /* JADX INFO: renamed from: b */
        public void mo1850b(ViewParent viewParent, View view, View view2, int i) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v4.j.t$c */
    static class c {
        c() {
        }

        /* JADX INFO: renamed from: a */
        public void mo1844a(ViewParent viewParent, View view) {
            if (viewParent instanceof InterfaceC0241l) {
                ((InterfaceC0241l) viewParent).onStopNestedScroll(view);
            }
        }

        /* JADX INFO: renamed from: a */
        public void mo1845a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            if (viewParent instanceof InterfaceC0241l) {
                ((InterfaceC0241l) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }

        /* JADX INFO: renamed from: a */
        public void mo1846a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            if (viewParent instanceof InterfaceC0241l) {
                ((InterfaceC0241l) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean mo1847a(ViewParent viewParent, View view, float f, float f2) {
            if (viewParent instanceof InterfaceC0241l) {
                return ((InterfaceC0241l) viewParent).onNestedPreFling(view, f, f2);
            }
            return false;
        }

        /* JADX INFO: renamed from: a */
        public boolean mo1848a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            if (viewParent instanceof InterfaceC0241l) {
                return ((InterfaceC0241l) viewParent).onNestedFling(view, f, f2, z);
            }
            return false;
        }

        /* JADX INFO: renamed from: a */
        public boolean mo1849a(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof InterfaceC0241l) {
                return ((InterfaceC0241l) viewParent).onStartNestedScroll(view, view2, i);
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public void mo1850b(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof InterfaceC0241l) {
                ((InterfaceC0241l) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f1361a = new b();
        } else if (Build.VERSION.SDK_INT >= 19) {
            f1361a = new a();
        } else {
            f1361a = new c();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1837a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof InterfaceC0242m) {
            ((InterfaceC0242m) viewParent).mo356c(view, i);
        } else if (i == 0) {
            f1361a.mo1844a(viewParent, view);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1838a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (viewParent instanceof InterfaceC0242m) {
            ((InterfaceC0242m) viewParent).mo342a(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            f1361a.mo1845a(viewParent, view, i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1839a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof InterfaceC0242m) {
            ((InterfaceC0242m) viewParent).mo343a(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            f1361a.mo1846a(viewParent, view, i, i2, iArr);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1840a(ViewParent viewParent, View view, float f, float f2) {
        return f1361a.mo1847a(viewParent, view, f, f2);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1841a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return f1361a.mo1848a(viewParent, view, f, f2, z);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1842a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof InterfaceC0242m) {
            return ((InterfaceC0242m) viewParent).mo348a(view, view2, i, i2);
        }
        if (i2 == 0) {
            return f1361a.mo1849a(viewParent, view, view2, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static void m1843b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof InterfaceC0242m) {
            ((InterfaceC0242m) viewParent).mo353b(view, view2, i, i2);
        } else if (i2 == 0) {
            f1361a.mo1850b(viewParent, view, view2, i);
        }
    }
}
