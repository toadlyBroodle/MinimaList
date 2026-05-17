package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.p009c.p010a.C0181a;
import android.support.v7.p025c.p026a.C0368a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: android.support.v7.widget.aq */
/* JADX INFO: loaded from: classes.dex */
public class C0479aq extends ListView {

    /* JADX INFO: renamed from: g */
    private static final int[] f3178g = {0};

    /* JADX INFO: renamed from: a */
    final Rect f3179a;

    /* JADX INFO: renamed from: b */
    int f3180b;

    /* JADX INFO: renamed from: c */
    int f3181c;

    /* JADX INFO: renamed from: d */
    int f3182d;

    /* JADX INFO: renamed from: e */
    int f3183e;

    /* JADX INFO: renamed from: f */
    protected int f3184f;

    /* JADX INFO: renamed from: h */
    private Field f3185h;

    /* JADX INFO: renamed from: i */
    private a f3186i;

    /* JADX INFO: renamed from: android.support.v7.widget.aq$a */
    private static class a extends C0368a {

        /* JADX INFO: renamed from: a */
        private boolean f3187a;

        public a(Drawable drawable) {
            super(drawable);
            this.f3187a = true;
        }

        /* JADX INFO: renamed from: a */
        void m3985a(boolean z) {
            this.f3187a = z;
        }

        @Override // android.support.v7.p025c.p026a.C0368a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f3187a) {
                super.draw(canvas);
            }
        }

        @Override // android.support.v7.p025c.p026a.C0368a, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f3187a) {
                super.setHotspot(f, f2);
            }
        }

        @Override // android.support.v7.p025c.p026a.C0368a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f3187a) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // android.support.v7.p025c.p026a.C0368a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f3187a) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // android.support.v7.p025c.p026a.C0368a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f3187a) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    public C0479aq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3179a = new Rect();
        this.f3180b = 0;
        this.f3181c = 0;
        this.f3182d = 0;
        this.f3183e = 0;
        try {
            this.f3185h = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f3185h.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public int m3978a(int i, int i2, int i3, int i4, int i5) {
        View view;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingBottom + listPaddingTop;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int i7 = 0;
        View view2 = null;
        int i8 = 0;
        int count = adapter.getCount();
        int i9 = 0;
        while (i9 < count) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            } else {
                view = view2;
            }
            view2 = adapter.getView(i9, view, this);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view2.setLayoutParams(layoutParams);
            }
            view2.measure(i, layoutParams.height > 0 ? View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view2.forceLayout();
            int measuredHeight = (i9 > 0 ? i6 + dividerHeight : i6) + view2.getMeasuredHeight();
            if (measuredHeight >= i4) {
                return (i5 < 0 || i9 <= i5 || i7 <= 0 || measuredHeight == i4) ? i4 : i7;
            }
            if (i5 >= 0 && i9 >= i5) {
                i7 = measuredHeight;
            }
            i9++;
            i6 = measuredHeight;
        }
        return i6;
    }

    /* JADX INFO: renamed from: a */
    protected void m3979a(int i, View view) {
        Drawable selector = getSelector();
        boolean z = (selector == null || i == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        m3983b(i, view);
        if (z) {
            Rect rect = this.f3179a;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            C0181a.m1387a(selector, fExactCenterX, fExactCenterY);
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m3980a(int i, View view, float f, float f2) {
        m3979a(i, view);
        Drawable selector = getSelector();
        if (selector == null || i == -1) {
            return;
        }
        C0181a.m1387a(selector, f, f2);
    }

    /* JADX INFO: renamed from: a */
    protected void m3981a(Canvas canvas) {
        Drawable selector;
        if (this.f3179a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f3179a);
        selector.draw(canvas);
    }

    /* JADX INFO: renamed from: a */
    protected boolean mo3870a() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    protected void m3982b() {
        Drawable selector = getSelector();
        if (selector == null || !m3984c()) {
            return;
        }
        selector.setState(getDrawableState());
    }

    /* JADX INFO: renamed from: b */
    protected void m3983b(int i, View view) {
        Rect rect = this.f3179a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f3180b;
        rect.top -= this.f3181c;
        rect.right += this.f3182d;
        rect.bottom += this.f3183e;
        try {
            boolean z = this.f3185h.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f3185h.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    protected boolean m3984c() {
        return mo3870a() && isPressed();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m3981a(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m3982b();
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f3184f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        this.f3186i = drawable != null ? new a(drawable) : null;
        super.setSelector(this.f3186i);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f3180b = rect.left;
        this.f3181c = rect.top;
        this.f3182d = rect.right;
        this.f3183e = rect.bottom;
    }

    protected void setSelectorEnabled(boolean z) {
        if (this.f3186i != null) {
            this.f3186i.m3985a(z);
        }
    }
}
