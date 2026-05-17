package android.support.design.widget;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.C0025a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: android.support.design.widget.s */
/* JADX INFO: loaded from: classes.dex */
class C0079s {

    /* JADX INFO: renamed from: a */
    private static final int[] f480a = {R.attr.stateListAnimator};

    /* JADX INFO: renamed from: a */
    static void m562a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* JADX INFO: renamed from: a */
    static void m563a(View view, float f) {
        int integer = view.getResources().getInteger(C0025a.g.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(new int[]{R.attr.enabled, C0025a.b.state_collapsible, -C0025a.b.state_collapsed}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(integer));
        stateListAnimator.addState(new int[]{R.attr.enabled}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(integer));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    /* JADX INFO: renamed from: a */
    static void m564a(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f480a, i, i2);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, typedArrayObtainStyledAttributes.getResourceId(0, 0)));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
