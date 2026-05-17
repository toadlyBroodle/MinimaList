package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.p022a.C0333a;

/* JADX INFO: renamed from: android.support.design.widget.n */
/* JADX INFO: loaded from: classes.dex */
class C0074n {

    /* JADX INFO: renamed from: a */
    private static final int[] f469a = {C0333a.a.colorPrimary};

    /* JADX INFO: renamed from: a */
    static void m552a(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f469a);
        boolean z = typedArrayObtainStyledAttributes.hasValue(0) ? false : true;
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        }
    }
}
