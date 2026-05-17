package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.InterfaceC0473ak;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements InterfaceC0473ak {

    /* JADX INFO: renamed from: a */
    private InterfaceC0473ak.a f2736a;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (this.f2736a != null) {
            this.f2736a.mo2703a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // android.support.v7.widget.InterfaceC0473ak
    public void setOnFitSystemWindowsListener(InterfaceC0473ak.a aVar) {
        this.f2736a = aVar;
    }
}
