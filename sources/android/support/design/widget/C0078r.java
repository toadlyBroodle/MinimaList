package android.support.design.widget;

import android.graphics.PorterDuff;

/* JADX INFO: renamed from: android.support.design.widget.r */
/* JADX INFO: loaded from: classes.dex */
class C0078r {
    /* JADX INFO: renamed from: a */
    static PorterDuff.Mode m561a(int i, PorterDuff.Mode mode) {
        switch (i) {
            case 3:
                return PorterDuff.Mode.SRC_OVER;
            case 5:
                return PorterDuff.Mode.SRC_IN;
            case 9:
                return PorterDuff.Mode.SRC_ATOP;
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            default:
                return mode;
        }
    }
}
