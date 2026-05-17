package android.support.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.p019j.C0246q;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: renamed from: android.support.transition.aj */
/* JADX INFO: loaded from: classes.dex */
class C0095aj implements InterfaceC0097al {

    /* JADX INFO: renamed from: a */
    protected a f514a;

    /* JADX INFO: renamed from: android.support.transition.aj$a */
    static class a extends ViewGroup {

        /* JADX INFO: renamed from: a */
        static Method f515a;

        /* JADX INFO: renamed from: b */
        ViewGroup f516b;

        /* JADX INFO: renamed from: c */
        View f517c;

        /* JADX INFO: renamed from: d */
        ArrayList<Drawable> f518d;

        /* JADX INFO: renamed from: e */
        C0095aj f519e;

        static {
            try {
                f515a = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", Integer.TYPE, Integer.TYPE, Rect.class);
            } catch (NoSuchMethodException e) {
            }
        }

        a(Context context, ViewGroup viewGroup, View view, C0095aj c0095aj) {
            super(context);
            this.f518d = null;
            this.f516b = viewGroup;
            this.f517c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f519e = c0095aj;
        }

        /* JADX INFO: renamed from: a */
        private void m603a(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f516b.getLocationOnScreen(iArr2);
            this.f517c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* JADX INFO: renamed from: a */
        public void m604a(Drawable drawable) {
            if (this.f518d == null) {
                this.f518d = new ArrayList<>();
            }
            if (this.f518d.contains(drawable)) {
                return;
            }
            this.f518d.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        /* JADX INFO: renamed from: a */
        public void m605a(View view) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f516b && viewGroup.getParent() != null && C0246q.m1780z(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f516b.getLocationOnScreen(iArr2);
                    C0246q.m1757c(view, iArr[0] - iArr2[0]);
                    C0246q.m1753b(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view, getChildCount() - 1);
        }

        /* JADX INFO: renamed from: a */
        boolean m606a() {
            return getChildCount() == 0 && (this.f518d == null || this.f518d.size() == 0);
        }

        /* JADX INFO: renamed from: b */
        public void m607b(Drawable drawable) {
            if (this.f518d != null) {
                this.f518d.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m608b(View view) {
            super.removeView(view);
            if (m606a()) {
                this.f516b.removeView(this);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            this.f516b.getLocationOnScreen(new int[2]);
            this.f517c.getLocationOnScreen(new int[2]);
            canvas.translate(r2[0] - r1[0], r2[1] - r1[1]);
            canvas.clipRect(new Rect(0, 0, this.f517c.getWidth(), this.f517c.getHeight()));
            super.dispatchDraw(canvas);
            int size = this.f518d == null ? 0 : this.f518d.size();
            for (int i = 0; i < size; i++) {
                this.f518d.get(i).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f516b != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.f516b instanceof ViewGroup) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    m603a(iArr2);
                    rect.offset(iArr2[0], iArr2[1]);
                    return super.invalidateChildInParent(iArr, rect);
                }
                invalidate(rect);
            }
            return null;
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        @Override // android.view.View
        protected boolean verifyDrawable(Drawable drawable) {
            return super.verifyDrawable(drawable) || (this.f518d != null && this.f518d.contains(drawable));
        }
    }

    C0095aj(Context context, ViewGroup viewGroup, View view) {
        this.f514a = new a(context, viewGroup, view, this);
    }

    /* JADX INFO: renamed from: c */
    static ViewGroup m601c(View view) {
        View view2 = view;
        while (view2 != null) {
            if (view2.getId() == 16908290 && (view2 instanceof ViewGroup)) {
                return (ViewGroup) view2;
            }
            if (view2.getParent() instanceof ViewGroup) {
                view2 = (ViewGroup) view2.getParent();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    static C0095aj m602d(View view) {
        ViewGroup viewGroupM601c = m601c(view);
        if (viewGroupM601c == null) {
            return null;
        }
        int childCount = viewGroupM601c.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroupM601c.getChildAt(i);
            if (childAt instanceof a) {
                return ((a) childAt).f519e;
            }
        }
        return new C0088ac(viewGroupM601c.getContext(), viewGroupM601c, view);
    }

    @Override // android.support.transition.InterfaceC0097al
    /* JADX INFO: renamed from: a */
    public void mo593a(Drawable drawable) {
        this.f514a.m604a(drawable);
    }

    @Override // android.support.transition.InterfaceC0097al
    /* JADX INFO: renamed from: b */
    public void mo594b(Drawable drawable) {
        this.f514a.m607b(drawable);
    }
}
