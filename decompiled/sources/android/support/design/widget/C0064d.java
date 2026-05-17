package android.support.design.widget;

import android.graphics.Outline;

/* JADX INFO: renamed from: android.support.design.widget.d */
/* JADX INFO: loaded from: classes.dex */
class C0064d extends C0063c {
    C0064d() {
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        copyBounds(this.f372b);
        outline.setOval(this.f372b);
    }
}
