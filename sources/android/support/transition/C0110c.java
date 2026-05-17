package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: android.support.transition.c */
/* JADX INFO: loaded from: classes.dex */
class C0110c implements InterfaceC0111d {
    C0110c() {
    }

    @Override // android.support.transition.InterfaceC0111d
    /* JADX INFO: renamed from: a */
    public void mo652a(Animator animator) {
        animator.pause();
    }

    @Override // android.support.transition.InterfaceC0111d
    /* JADX INFO: renamed from: a */
    public void mo653a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    @Override // android.support.transition.InterfaceC0111d
    /* JADX INFO: renamed from: b */
    public void mo654b(Animator animator) {
        animator.resume();
    }
}
