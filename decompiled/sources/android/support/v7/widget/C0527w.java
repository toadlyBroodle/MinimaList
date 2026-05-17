package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.p022a.C0333a;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: renamed from: android.support.v7.widget.w */
/* JADX INFO: loaded from: classes.dex */
public class C0527w extends SeekBar {

    /* JADX INFO: renamed from: a */
    private final C0528x f3654a;

    public C0527w(Context context) {
        this(context, null);
    }

    public C0527w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0333a.a.seekBarStyle);
    }

    public C0527w(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3654a = new C0528x(this);
        this.f3654a.mo4713a(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f3654a.m4718c();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f3654a.m4717b();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f3654a.m4715a(canvas);
    }
}
