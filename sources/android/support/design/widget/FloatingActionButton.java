package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.design.C0025a;
import android.support.design.widget.C0066f;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.p019j.C0246q;
import android.support.v7.widget.C0520p;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@CoordinatorLayout.InterfaceC0046b(m372a = Behavior.class)
public class FloatingActionButton extends C0080t {

    /* JADX INFO: renamed from: a */
    int f297a;

    /* JADX INFO: renamed from: b */
    boolean f298b;

    /* JADX INFO: renamed from: c */
    final Rect f299c;

    /* JADX INFO: renamed from: d */
    private ColorStateList f300d;

    /* JADX INFO: renamed from: e */
    private PorterDuff.Mode f301e;

    /* JADX INFO: renamed from: f */
    private int f302f;

    /* JADX INFO: renamed from: g */
    private int f303g;

    /* JADX INFO: renamed from: h */
    private int f304h;

    /* JADX INFO: renamed from: i */
    private int f305i;

    /* JADX INFO: renamed from: j */
    private final Rect f306j;

    /* JADX INFO: renamed from: k */
    private C0520p f307k;

    /* JADX INFO: renamed from: l */
    private C0066f f308l;

    public static class Behavior extends CoordinatorLayout.AbstractC0045a<FloatingActionButton> {

        /* JADX INFO: renamed from: a */
        private Rect f311a;

        /* JADX INFO: renamed from: b */
        private AbstractC0053a f312b;

        /* JADX INFO: renamed from: c */
        private boolean f313c;

        public Behavior() {
            this.f313c = true;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0025a.j.FloatingActionButton_Behavior_Layout);
            this.f313c = typedArrayObtainStyledAttributes.getBoolean(C0025a.j.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: a */
        private void m407a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i = 0;
            Rect rect = floatingActionButton.f299c;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.C0048d c0048d = (CoordinatorLayout.C0048d) floatingActionButton.getLayoutParams();
            int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - c0048d.rightMargin ? rect.right : floatingActionButton.getLeft() <= c0048d.leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - c0048d.bottomMargin) {
                i = rect.bottom;
            } else if (floatingActionButton.getTop() <= c0048d.topMargin) {
                i = -rect.top;
            }
            if (i != 0) {
                C0246q.m1753b(floatingActionButton, i);
            }
            if (i2 != 0) {
                C0246q.m1757c(floatingActionButton, i2);
            }
        }

        /* JADX INFO: renamed from: a */
        private boolean m408a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m410a(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f311a == null) {
                this.f311a = new Rect();
            }
            Rect rect = this.f311a;
            C0075o.m555b(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m404b(this.f312b, false);
            } else {
                floatingActionButton.m402a(this.f312b, false);
            }
            return true;
        }

        /* JADX INFO: renamed from: a */
        private static boolean m409a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0048d) {
                return ((CoordinatorLayout.C0048d) layoutParams).m384b() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* JADX INFO: renamed from: a */
        private boolean m410a(View view, FloatingActionButton floatingActionButton) {
            return this.f313c && ((CoordinatorLayout.C0048d) floatingActionButton.getLayoutParams()).m376a() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* JADX INFO: renamed from: b */
        private boolean m411b(View view, FloatingActionButton floatingActionButton) {
            if (!m410a(view, floatingActionButton)) {
                return false;
            }
            CoordinatorLayout.C0048d c0048d = (CoordinatorLayout.C0048d) floatingActionButton.getLayoutParams();
            if (view.getTop() < c0048d.topMargin + (floatingActionButton.getHeight() / 2)) {
                floatingActionButton.m404b(this.f312b, false);
            } else {
                floatingActionButton.m402a(this.f312b, false);
            }
            return true;
        }

        @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
        /* JADX INFO: renamed from: a */
        public void mo361a(CoordinatorLayout.C0048d c0048d) {
            if (c0048d.f284h == 0) {
                c0048d.f284h = 80;
            }
        }

        @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean mo257a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> listM354c = coordinatorLayout.m354c(floatingActionButton);
            int size = listM354c.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = listM354c.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m409a(view) && m411b(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (m408a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m340a(floatingActionButton, i);
            m407a(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean mo363a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f299c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean mo279b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m408a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!m409a(view)) {
                return false;
            }
            m411b(view, floatingActionButton);
            return false;
        }
    }

    /* JADX INFO: renamed from: android.support.design.widget.FloatingActionButton$a */
    public static abstract class AbstractC0053a {
        /* JADX INFO: renamed from: a */
        public void m415a(FloatingActionButton floatingActionButton) {
        }

        /* JADX INFO: renamed from: b */
        public void m416b(FloatingActionButton floatingActionButton) {
        }
    }

    /* JADX INFO: renamed from: android.support.design.widget.FloatingActionButton$b */
    private class C0054b implements InterfaceC0071k {
        C0054b() {
        }

        @Override // android.support.design.widget.InterfaceC0071k
        /* JADX INFO: renamed from: a */
        public float mo417a() {
            return FloatingActionButton.this.getSizeDimension() / 2.0f;
        }

        @Override // android.support.design.widget.InterfaceC0071k
        /* JADX INFO: renamed from: a */
        public void mo418a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f299c.set(i, i2, i3, i4);
            FloatingActionButton.this.setPadding(FloatingActionButton.this.f297a + i, FloatingActionButton.this.f297a + i2, FloatingActionButton.this.f297a + i3, FloatingActionButton.this.f297a + i4);
        }

        @Override // android.support.design.widget.InterfaceC0071k
        /* JADX INFO: renamed from: a */
        public void mo419a(Drawable drawable) {
            FloatingActionButton.super.setBackgroundDrawable(drawable);
        }

        @Override // android.support.design.widget.InterfaceC0071k
        /* JADX INFO: renamed from: b */
        public boolean mo420b() {
            return FloatingActionButton.this.f298b;
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f299c = new Rect();
        this.f306j = new Rect();
        C0074n.m552a(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0025a.j.FloatingActionButton, i, C0025a.i.Widget_Design_FloatingActionButton);
        this.f300d = typedArrayObtainStyledAttributes.getColorStateList(C0025a.j.FloatingActionButton_backgroundTint);
        this.f301e = C0078r.m561a(typedArrayObtainStyledAttributes.getInt(C0025a.j.FloatingActionButton_backgroundTintMode, -1), null);
        this.f303g = typedArrayObtainStyledAttributes.getColor(C0025a.j.FloatingActionButton_rippleColor, 0);
        this.f304h = typedArrayObtainStyledAttributes.getInt(C0025a.j.FloatingActionButton_fabSize, -1);
        this.f302f = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0025a.j.FloatingActionButton_borderWidth, 0);
        float dimension = typedArrayObtainStyledAttributes.getDimension(C0025a.j.FloatingActionButton_elevation, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(C0025a.j.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.f298b = typedArrayObtainStyledAttributes.getBoolean(C0025a.j.FloatingActionButton_useCompatPadding, false);
        typedArrayObtainStyledAttributes.recycle();
        this.f307k = new C0520p(this);
        this.f307k.m4702a(attributeSet, i);
        this.f305i = (int) getResources().getDimension(C0025a.d.design_fab_image_size);
        getImpl().mo488a(this.f300d, this.f301e, this.f303g, this.f302f);
        getImpl().m484a(dimension);
        getImpl().m494b(dimension2);
    }

    /* JADX INFO: renamed from: a */
    private int m397a(int i) {
        Resources resources = getResources();
        switch (i) {
            case -1:
                return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m397a(1) : m397a(0);
            case 0:
            default:
                return resources.getDimensionPixelSize(C0025a.d.design_fab_size_normal);
            case 1:
                return resources.getDimensionPixelSize(C0025a.d.design_fab_size_mini);
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m398a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        switch (mode) {
            case Integer.MIN_VALUE:
                return Math.min(i, size);
            case 0:
            default:
                return i;
            case 1073741824:
                return size;
        }
    }

    /* JADX INFO: renamed from: a */
    private C0066f.c m399a(final AbstractC0053a abstractC0053a) {
        if (abstractC0053a == null) {
            return null;
        }
        return new C0066f.c() { // from class: android.support.design.widget.FloatingActionButton.1
            @Override // android.support.design.widget.C0066f.c
            /* JADX INFO: renamed from: a */
            public void mo405a() {
                abstractC0053a.m415a(FloatingActionButton.this);
            }

            @Override // android.support.design.widget.C0066f.c
            /* JADX INFO: renamed from: b */
            public void mo406b() {
                abstractC0053a.m416b(FloatingActionButton.this);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    private C0066f m400a() {
        return Build.VERSION.SDK_INT >= 21 ? new C0067g(this, new C0054b()) : new C0066f(this, new C0054b());
    }

    private C0066f getImpl() {
        if (this.f308l == null) {
            this.f308l = m400a();
        }
        return this.f308l;
    }

    /* JADX INFO: renamed from: a */
    void m402a(AbstractC0053a abstractC0053a, boolean z) {
        getImpl().m496b(m399a(abstractC0053a), z);
    }

    /* JADX INFO: renamed from: a */
    public boolean m403a(Rect rect) {
        if (!C0246q.m1777w(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        rect.left += this.f299c.left;
        rect.top += this.f299c.top;
        rect.right -= this.f299c.right;
        rect.bottom -= this.f299c.bottom;
        return true;
    }

    /* JADX INFO: renamed from: b */
    void m404b(AbstractC0053a abstractC0053a, boolean z) {
        getImpl().m491a(m399a(abstractC0053a), z);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo492a(getDrawableState());
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f300d;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f301e;
    }

    public float getCompatElevation() {
        return getImpl().mo482a();
    }

    public Drawable getContentBackground() {
        return getImpl().m497c();
    }

    public int getRippleColor() {
        return this.f303g;
    }

    public int getSize() {
        return this.f304h;
    }

    int getSizeDimension() {
        return m397a(this.f304h);
    }

    public boolean getUseCompatPadding() {
        return this.f298b;
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo493b();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().m500f();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().m501g();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f297a = (sizeDimension - this.f305i) / 2;
        getImpl().m499e();
        int iMin = Math.min(m398a(sizeDimension, i), m398a(sizeDimension, i2));
        setMeasuredDimension(this.f299c.left + iMin + this.f299c.right, iMin + this.f299c.top + this.f299c.bottom);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                if (m403a(this.f306j) && !this.f306j.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f300d != colorStateList) {
            this.f300d = colorStateList;
            getImpl().m487a(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f301e != mode) {
            this.f301e = mode;
            getImpl().m489a(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().m484a(f);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f307k.m4699a(i);
    }

    public void setRippleColor(int i) {
        if (this.f303g != i) {
            this.f303g = i;
            getImpl().mo486a(i);
        }
    }

    public void setSize(int i) {
        if (i != this.f304h) {
            this.f304h = i;
            requestLayout();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f298b != z) {
            this.f298b = z;
            getImpl().mo498d();
        }
    }

    @Override // android.support.design.widget.C0080t, android.widget.ImageView, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }
}
