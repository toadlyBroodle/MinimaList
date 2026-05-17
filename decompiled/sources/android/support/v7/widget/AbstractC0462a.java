package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v4.p019j.C0246q;
import android.support.v4.p019j.C0250u;
import android.support.v4.p019j.InterfaceC0251v;
import android.support.v7.p022a.C0333a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: android.support.v7.widget.a */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0462a extends ViewGroup {

    /* JADX INFO: renamed from: a */
    protected final a f2957a;

    /* JADX INFO: renamed from: b */
    protected final Context f2958b;

    /* JADX INFO: renamed from: c */
    protected ActionMenuView f2959c;

    /* JADX INFO: renamed from: d */
    protected C0508d f2960d;

    /* JADX INFO: renamed from: e */
    protected int f2961e;

    /* JADX INFO: renamed from: f */
    protected C0250u f2962f;

    /* JADX INFO: renamed from: g */
    private boolean f2963g;

    /* JADX INFO: renamed from: h */
    private boolean f2964h;

    /* JADX INFO: renamed from: android.support.v7.widget.a$a */
    protected class a implements InterfaceC0251v {

        /* JADX INFO: renamed from: a */
        int f2965a;

        /* JADX INFO: renamed from: c */
        private boolean f2967c = false;

        protected a() {
        }

        /* JADX INFO: renamed from: a */
        public a m3744a(C0250u c0250u, int i) {
            AbstractC0462a.this.f2962f = c0250u;
            this.f2965a = i;
            return this;
        }

        @Override // android.support.v4.p019j.InterfaceC0251v
        /* JADX INFO: renamed from: a */
        public void mo1862a(View view) {
            AbstractC0462a.super.setVisibility(0);
            this.f2967c = false;
        }

        @Override // android.support.v4.p019j.InterfaceC0251v
        /* JADX INFO: renamed from: b */
        public void mo1863b(View view) {
            if (this.f2967c) {
                return;
            }
            AbstractC0462a.this.f2962f = null;
            AbstractC0462a.super.setVisibility(this.f2965a);
        }

        @Override // android.support.v4.p019j.InterfaceC0251v
        /* JADX INFO: renamed from: c */
        public void mo1864c(View view) {
            this.f2967c = true;
        }
    }

    AbstractC0462a(Context context) {
        this(context, null);
    }

    AbstractC0462a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    AbstractC0462a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2957a = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0333a.a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f2958b = context;
        } else {
            this.f2958b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* JADX INFO: renamed from: a */
    protected static int m3739a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* JADX INFO: renamed from: a */
    protected int m3742a(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* JADX INFO: renamed from: a */
    protected int m3743a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* JADX INFO: renamed from: a */
    public C0250u mo3349a(int i, long j) {
        if (this.f2962f != null) {
            this.f2962f.m1860b();
        }
        if (i != 0) {
            C0250u c0250uM1853a = C0246q.m1765k(this).m1853a(0.0f);
            c0250uM1853a.m1854a(j);
            c0250uM1853a.m1855a(this.f2957a.m3744a(c0250uM1853a, i));
            return c0250uM1853a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0250u c0250uM1853a2 = C0246q.m1765k(this).m1853a(1.0f);
        c0250uM1853a2.m1854a(j);
        c0250uM1853a2.m1855a(this.f2957a.m3744a(c0250uM1853a2, i));
        return c0250uM1853a2;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo3351a() {
        if (this.f2960d != null) {
            return this.f2960d.m4597f();
        }
        return false;
    }

    public int getAnimatedVisibility() {
        return this.f2962f != null ? this.f2957a.f2965a : getVisibility();
    }

    public int getContentHeight() {
        return this.f2961e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C0333a.j.ActionBar, C0333a.a.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(C0333a.j.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        if (this.f2960d != null) {
            this.f2960d.m4591a(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2964h = false;
        }
        if (!this.f2964h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f2964h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2964h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2963g = false;
        }
        if (!this.f2963g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f2963g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2963g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f2961e = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            if (this.f2962f != null) {
                this.f2962f.m1860b();
            }
            super.setVisibility(i);
        }
    }
}
