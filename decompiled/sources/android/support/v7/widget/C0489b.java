package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: android.support.v7.widget.b */
/* JADX INFO: loaded from: classes.dex */
class C0489b extends Drawable {

    /* JADX INFO: renamed from: a */
    final ActionBarContainer f3411a;

    public C0489b(ActionBarContainer actionBarContainer) {
        this.f3411a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f3411a.f2630d) {
            if (this.f3411a.f2629c != null) {
                this.f3411a.f2629c.draw(canvas);
            }
        } else {
            if (this.f3411a.f2627a != null) {
                this.f3411a.f2627a.draw(canvas);
            }
            if (this.f3411a.f2628b == null || !this.f3411a.f2631e) {
                return;
            }
            this.f3411a.f2628b.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
