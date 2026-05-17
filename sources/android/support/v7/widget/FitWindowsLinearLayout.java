package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.InterfaceC0473ak;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout implements InterfaceC0473ak {

    /* JADX INFO: renamed from: a */
    private InterfaceC0473ak.a f2737a;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (this.f2737a != null) {
            this.f2737a.mo2703a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // android.support.v7.widget.InterfaceC0473ak
    public void setOnFitSystemWindowsListener(InterfaceC0473ak.a aVar) {
        this.f2737a = aVar;
    }
}
