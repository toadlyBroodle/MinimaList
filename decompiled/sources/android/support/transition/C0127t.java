package android.support.transition;

import android.support.transition.C0125r;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: android.support.transition.t */
/* JADX INFO: loaded from: classes.dex */
public class C0127t {

    /* JADX INFO: renamed from: a */
    private ViewGroup f605a;

    /* JADX INFO: renamed from: b */
    private Runnable f606b;

    /* JADX INFO: renamed from: a */
    static C0127t m683a(View view) {
        return (C0127t) view.getTag(C0125r.a.transition_current_scene);
    }

    /* JADX INFO: renamed from: a */
    static void m684a(View view, C0127t c0127t) {
        view.setTag(C0125r.a.transition_current_scene, c0127t);
    }

    /* JADX INFO: renamed from: a */
    public void m685a() {
        if (m683a(this.f605a) != this || this.f606b == null) {
            return;
        }
        this.f606b.run();
    }
}
