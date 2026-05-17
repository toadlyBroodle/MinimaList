package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* JADX INFO: renamed from: android.support.design.widget.m */
/* JADX INFO: loaded from: classes.dex */
final class C0073m {

    /* JADX INFO: renamed from: b */
    private final ArrayList<a> f463b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    private a f464c = null;

    /* JADX INFO: renamed from: a */
    ValueAnimator f462a = null;

    /* JADX INFO: renamed from: d */
    private final Animator.AnimatorListener f465d = new AnimatorListenerAdapter() { // from class: android.support.design.widget.m.1
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (C0073m.this.f462a == animator) {
                C0073m.this.f462a = null;
            }
        }
    };

    /* JADX INFO: renamed from: android.support.design.widget.m$a */
    static class a {

        /* JADX INFO: renamed from: a */
        final int[] f467a;

        /* JADX INFO: renamed from: b */
        final ValueAnimator f468b;

        a(int[] iArr, ValueAnimator valueAnimator) {
            this.f467a = iArr;
            this.f468b = valueAnimator;
        }
    }

    C0073m() {
    }

    /* JADX INFO: renamed from: a */
    private void m547a(a aVar) {
        this.f462a = aVar.f468b;
        this.f462a.start();
    }

    /* JADX INFO: renamed from: b */
    private void m548b() {
        if (this.f462a != null) {
            this.f462a.cancel();
            this.f462a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m549a() {
        if (this.f462a != null) {
            this.f462a.end();
            this.f462a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    void m550a(int[] iArr) {
        a aVar;
        int size = this.f463b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = this.f463b.get(i);
            if (StateSet.stateSetMatches(aVar.f467a, iArr)) {
                break;
            } else {
                i++;
            }
        }
        if (aVar == this.f464c) {
            return;
        }
        if (this.f464c != null) {
            m548b();
        }
        this.f464c = aVar;
        if (aVar != null) {
            m547a(aVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m551a(int[] iArr, ValueAnimator valueAnimator) {
        a aVar = new a(iArr, valueAnimator);
        valueAnimator.addListener(this.f465d);
        this.f463b.add(aVar);
    }
}
