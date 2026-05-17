package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* JADX INFO: renamed from: android.support.transition.b */
/* JADX INFO: loaded from: classes.dex */
class C0109b implements InterfaceC0111d {

    /* JADX INFO: renamed from: android.support.transition.b$a */
    interface a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    C0109b() {
    }

    @Override // android.support.transition.InterfaceC0111d
    /* JADX INFO: renamed from: a */
    public void mo652a(Animator animator) {
        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                Animator.AnimatorListener animatorListener = listeners.get(i);
                if (animatorListener instanceof a) {
                    ((a) animatorListener).onAnimationPause(animator);
                }
            }
        }
    }

    @Override // android.support.transition.InterfaceC0111d
    /* JADX INFO: renamed from: a */
    public void mo653a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
    }

    @Override // android.support.transition.InterfaceC0111d
    /* JADX INFO: renamed from: b */
    public void mo654b(Animator animator) {
        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                Animator.AnimatorListener animatorListener = listeners.get(i);
                if (animatorListener instanceof a) {
                    ((a) animatorListener).onAnimationResume(animator);
                }
            }
        }
    }
}
