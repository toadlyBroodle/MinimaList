package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: renamed from: android.support.design.widget.t */
/* JADX INFO: loaded from: classes.dex */
class C0080t extends ImageButton {

    /* JADX INFO: renamed from: a */
    private int f481a;

    public C0080t(Context context) {
        this(context, null);
    }

    public C0080t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0080t(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f481a = getVisibility();
    }

    /* JADX INFO: renamed from: a */
    final void m565a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f481a = i;
        }
    }

    final int getUserSetVisibility() {
        return this.f481a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        m565a(i, true);
    }
}
