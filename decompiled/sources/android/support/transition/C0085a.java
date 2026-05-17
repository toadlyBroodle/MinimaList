package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;

/* JADX INFO: renamed from: android.support.transition.a */
/* JADX INFO: loaded from: classes.dex */
class C0085a {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC0111d f496a;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f496a = new C0110c();
        } else {
            f496a = new C0109b();
        }
    }

    /* JADX INFO: renamed from: a */
    static void m587a(Animator animator) {
        f496a.mo652a(animator);
    }

    /* JADX INFO: renamed from: a */
    static void m588a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        f496a.mo653a(animator, animatorListenerAdapter);
    }

    /* JADX INFO: renamed from: b */
    static void m589b(Animator animator) {
        f496a.mo654b(animator);
    }
}
