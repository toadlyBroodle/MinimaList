package android.support.v7.widget;

import android.content.Context;
import android.os.Build;
import android.support.v4.p019j.C0250u;
import android.support.v4.widget.C0325i;
import android.support.v7.p022a.C0333a;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: android.support.v7.widget.ai */
/* JADX INFO: loaded from: classes.dex */
class C0471ai extends C0479aq {

    /* JADX INFO: renamed from: g */
    private boolean f3042g;

    /* JADX INFO: renamed from: h */
    private boolean f3043h;

    /* JADX INFO: renamed from: i */
    private boolean f3044i;

    /* JADX INFO: renamed from: j */
    private C0250u f3045j;

    /* JADX INFO: renamed from: k */
    private C0325i f3046k;

    public C0471ai(Context context, boolean z) {
        super(context, null, C0333a.a.dropDownListViewStyle);
        this.f3043h = z;
        setCacheColorHint(0);
    }

    /* JADX INFO: renamed from: a */
    private void m3867a(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* JADX INFO: renamed from: a */
    private void m3868a(View view, int i, float f, float f2) {
        View childAt;
        this.f3044i = true;
        if (Build.VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        if (this.f3184f != -1 && (childAt = getChildAt(this.f3184f - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f3184f = i;
        float left = f - view.getLeft();
        float top = f2 - view.getTop();
        if (Build.VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m3980a(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* JADX INFO: renamed from: d */
    private void m3869d() {
        this.f3044i = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f3184f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        if (this.f3045j != null) {
            this.f3045j.m1860b();
            this.f3045j = null;
        }
    }

    @Override // android.support.v7.widget.C0479aq
    /* JADX INFO: renamed from: a */
    protected boolean mo3870a() {
        return this.f3044i || super.mo3870a();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo3871a(MotionEvent motionEvent, int i) {
        boolean z;
        int iFindPointerIndex;
        boolean z2;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        switch (actionMasked) {
            case 1:
                z = false;
                iFindPointerIndex = motionEvent.findPointerIndex(i);
                if (iFindPointerIndex < 0) {
                    int x = (int) motionEvent.getX(iFindPointerIndex);
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int iPointToPosition = pointToPosition(x, y);
                    if (iPointToPosition != -1) {
                        View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                        m3868a(childAt, iPointToPosition, x, y);
                        if (actionMasked == 1) {
                            m3867a(childAt, iPointToPosition);
                        }
                        z3 = false;
                        z2 = true;
                    } else {
                        z2 = z;
                        z3 = true;
                    }
                } else {
                    z3 = false;
                    z2 = false;
                }
                break;
            case 2:
                z = true;
                iFindPointerIndex = motionEvent.findPointerIndex(i);
                if (iFindPointerIndex < 0) {
                }
                break;
            case 3:
                z3 = false;
                z2 = false;
                break;
            default:
                z3 = false;
                z2 = true;
                break;
        }
        if (!z2 || z3) {
            m3869d();
        }
        if (z2) {
            if (this.f3046k == null) {
                this.f3046k = new C0325i(this);
            }
            this.f3046k.m2346a(true);
            this.f3046k.onTouch(this, motionEvent);
        } else if (this.f3046k != null) {
            this.f3046k.m2346a(false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f3043h || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f3043h || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f3043h || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f3043h && this.f3042g) || super.isInTouchMode();
    }

    void setListSelectionHidden(boolean z) {
        this.f3042g = z;
    }
}
