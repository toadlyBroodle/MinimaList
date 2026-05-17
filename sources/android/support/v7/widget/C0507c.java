package android.support.v7.widget;

import android.graphics.Outline;

/* JADX INFO: renamed from: android.support.v7.widget.c */
/* JADX INFO: loaded from: classes.dex */
class C0507c extends C0489b {
    public C0507c(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f3411a.f2630d) {
            if (this.f3411a.f2629c != null) {
                this.f3411a.f2629c.getOutline(outline);
            }
        } else if (this.f3411a.f2627a != null) {
            this.f3411a.f2627a.getOutline(outline);
        }
    }
}
