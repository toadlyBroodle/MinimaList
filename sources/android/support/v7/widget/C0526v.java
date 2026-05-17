package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.p022a.C0333a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* JADX INFO: renamed from: android.support.v7.widget.v */
/* JADX INFO: loaded from: classes.dex */
public class C0526v extends RatingBar {

    /* JADX INFO: renamed from: a */
    private final C0524t f3653a;

    public C0526v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0333a.a.ratingBarStyle);
    }

    public C0526v(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3653a = new C0524t(this);
        this.f3653a.mo4713a(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmapM4712a = this.f3653a.m4712a();
        if (bitmapM4712a != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapM4712a.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
