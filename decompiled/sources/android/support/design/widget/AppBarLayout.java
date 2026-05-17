package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.C0025a;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.p015f.C0198a;
import android.support.v4.p018i.C0215i;
import android.support.v4.p019j.AbstractC0222a;
import android.support.v4.p019j.C0246q;
import android.support.v4.p019j.C0254y;
import android.support.v4.p019j.InterfaceC0244o;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@CoordinatorLayout.InterfaceC0046b(m372a = Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private int f195a;

    /* JADX INFO: renamed from: b */
    private int f196b;

    /* JADX INFO: renamed from: c */
    private int f197c;

    /* JADX INFO: renamed from: d */
    private boolean f198d;

    /* JADX INFO: renamed from: e */
    private int f199e;

    /* JADX INFO: renamed from: f */
    private C0254y f200f;

    /* JADX INFO: renamed from: g */
    private List<InterfaceC0038b> f201g;

    /* JADX INFO: renamed from: h */
    private boolean f202h;

    /* JADX INFO: renamed from: i */
    private boolean f203i;

    /* JADX INFO: renamed from: j */
    private int[] f204j;

    public static class Behavior extends AbstractC0068h<AppBarLayout> {

        /* JADX INFO: renamed from: b */
        private int f206b;

        /* JADX INFO: renamed from: c */
        private ValueAnimator f207c;

        /* JADX INFO: renamed from: d */
        private int f208d;

        /* JADX INFO: renamed from: e */
        private boolean f209e;

        /* JADX INFO: renamed from: f */
        private float f210f;

        /* JADX INFO: renamed from: g */
        private WeakReference<View> f211g;

        /* JADX INFO: renamed from: h */
        private AbstractC0035a f212h;

        /* JADX INFO: renamed from: android.support.design.widget.AppBarLayout$Behavior$a */
        public static abstract class AbstractC0035a {
            /* JADX INFO: renamed from: a */
            public abstract boolean m267a(AppBarLayout appBarLayout);
        }

        /* JADX INFO: renamed from: android.support.design.widget.AppBarLayout$Behavior$b */
        protected static class C0036b extends AbstractC0222a {
            public static final Parcelable.Creator<C0036b> CREATOR = new Parcelable.ClassLoaderCreator<C0036b>() { // from class: android.support.design.widget.AppBarLayout.Behavior.b.1
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public C0036b createFromParcel(Parcel parcel) {
                    return new C0036b(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public C0036b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C0036b(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public C0036b[] newArray(int i) {
                    return new C0036b[i];
                }
            };

            /* JADX INFO: renamed from: a */
            int f216a;

            /* JADX INFO: renamed from: b */
            float f217b;

            /* JADX INFO: renamed from: c */
            boolean f218c;

            public C0036b(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f216a = parcel.readInt();
                this.f217b = parcel.readFloat();
                this.f218c = parcel.readByte() != 0;
            }

            public C0036b(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // android.support.v4.p019j.AbstractC0222a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f216a);
                parcel.writeFloat(this.f217b);
                parcel.writeByte((byte) (this.f218c ? 1 : 0));
            }
        }

        public Behavior() {
            this.f208d = -1;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f208d = -1;
        }

        /* JADX INFO: renamed from: a */
        private int m229a(AppBarLayout appBarLayout, int i) {
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (childAt.getTop() <= (-i) && childAt.getBottom() >= (-i)) {
                    return i2;
                }
            }
            return -1;
        }

        /* JADX INFO: renamed from: a */
        private void m230a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, float f) {
            int iAbs = Math.abs(mo238a() - i);
            float fAbs = Math.abs(f);
            m231a(coordinatorLayout, appBarLayout, i, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f));
        }

        /* JADX INFO: renamed from: a */
        private void m231a(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, int i, int i2) {
            int iMo238a = mo238a();
            if (iMo238a == i) {
                if (this.f207c == null || !this.f207c.isRunning()) {
                    return;
                }
                this.f207c.cancel();
                return;
            }
            if (this.f207c == null) {
                this.f207c = new ValueAnimator();
                this.f207c.setInterpolator(C0061a.f344e);
                this.f207c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: android.support.design.widget.AppBarLayout.Behavior.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Behavior.this.m512a_(coordinatorLayout, appBarLayout, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
            } else {
                this.f207c.cancel();
            }
            this.f207c.setDuration(Math.min(i2, 600));
            this.f207c.setIntValues(iMo238a, i);
            this.f207c.start();
        }

        /* JADX INFO: renamed from: a */
        private void m232a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            boolean z2 = false;
            View viewM235c = m235c(appBarLayout, i);
            if (viewM235c != null) {
                int iM280a = ((C0037a) viewM235c.getLayoutParams()).m280a();
                if ((iM280a & 1) != 0) {
                    int iM1764j = C0246q.m1764j(viewM235c);
                    if (i2 > 0 && (iM280a & 12) != 0) {
                        z2 = (-i) >= (viewM235c.getBottom() - iM1764j) - appBarLayout.getTopInset();
                    } else if ((iM280a & 2) != 0) {
                        z2 = (-i) >= (viewM235c.getBottom() - iM1764j) - appBarLayout.getTopInset();
                    }
                }
                boolean zM224a = appBarLayout.m224a(z2);
                if (Build.VERSION.SDK_INT >= 11) {
                    if (z || (zM224a && m237d(coordinatorLayout, appBarLayout))) {
                        appBarLayout.jumpDrawablesToCurrentState();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: a */
        private static boolean m233a(int i, int i2) {
            return (i & i2) == i2;
        }

        /* JADX INFO: renamed from: b */
        private int m234b(AppBarLayout appBarLayout, int i) {
            int topInset;
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                C0037a c0037a = (C0037a) childAt.getLayoutParams();
                Interpolator interpolatorM281b = c0037a.m281b();
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    if (interpolatorM281b == null) {
                        return i;
                    }
                    int iM280a = c0037a.m280a();
                    if ((iM280a & 1) != 0) {
                        topInset = c0037a.bottomMargin + childAt.getHeight() + c0037a.topMargin + 0;
                        if ((iM280a & 2) != 0) {
                            topInset -= C0246q.m1764j(childAt);
                        }
                    } else {
                        topInset = 0;
                    }
                    if (C0246q.m1770p(childAt)) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if (topInset <= 0) {
                        return i;
                    }
                    return Integer.signum(i) * (Math.round(interpolatorM281b.getInterpolation((iAbs - childAt.getTop()) / topInset) * topInset) + childAt.getTop());
                }
            }
            return i;
        }

        /* JADX INFO: renamed from: c */
        private static View m235c(AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        private void m236c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int iM1764j;
            int iMo238a = mo238a();
            int iM229a = m229a(appBarLayout, iMo238a);
            if (iM229a >= 0) {
                View childAt = appBarLayout.getChildAt(iM229a);
                int iM280a = ((C0037a) childAt.getLayoutParams()).m280a();
                if ((iM280a & 17) == 17) {
                    int i = -childAt.getTop();
                    int iM1764j2 = -childAt.getBottom();
                    if (iM229a == appBarLayout.getChildCount() - 1) {
                        iM1764j2 += appBarLayout.getTopInset();
                    }
                    if (m233a(iM280a, 2)) {
                        iM1764j2 += C0246q.m1764j(childAt);
                        iM1764j = i;
                    } else if (m233a(iM280a, 5)) {
                        iM1764j = C0246q.m1764j(childAt) + iM1764j2;
                        if (iMo238a >= iM1764j) {
                            iM1764j2 = iM1764j;
                            iM1764j = i;
                        }
                    } else {
                        iM1764j = i;
                    }
                    if (iMo238a >= (iM1764j2 + iM1764j) / 2) {
                        iM1764j2 = iM1764j;
                    }
                    m230a(coordinatorLayout, appBarLayout, C0198a.m1464a(iM1764j2, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* JADX INFO: renamed from: d */
        private boolean m237d(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List<View> listM359d = coordinatorLayout.m359d(appBarLayout);
            int size = listM359d.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.AbstractC0045a abstractC0045aM384b = ((CoordinatorLayout.C0048d) listM359d.get(i).getLayoutParams()).m384b();
                if (abstractC0045aM384b instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) abstractC0045aM384b).m519d() != 0;
                }
            }
            return false;
        }

        @Override // android.support.design.widget.AbstractC0068h
        /* JADX INFO: renamed from: a */
        int mo238a() {
            return mo260b() + this.f206b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // android.support.design.widget.AbstractC0068h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int mo240a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3) {
            int iMo238a = mo238a();
            if (i2 == 0 || iMo238a < i2 || iMo238a > i3) {
                this.f206b = 0;
                return 0;
            }
            int iM1464a = C0198a.m1464a(i, i2, i3);
            if (iMo238a == iM1464a) {
                return 0;
            }
            int iM234b = appBarLayout.m225b() ? m234b(appBarLayout, iM1464a) : iM1464a;
            boolean zMo252a = mo252a(iM234b);
            int i4 = iMo238a - iM1464a;
            this.f206b = iM1464a - iM234b;
            if (!zMo252a && appBarLayout.m225b()) {
                coordinatorLayout.m350b(appBarLayout);
            }
            appBarLayout.m222a(mo260b());
            m232a(coordinatorLayout, appBarLayout, iM1464a, iM1464a < iMo238a ? -1 : 1, false);
            return i4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // android.support.design.widget.AbstractC0068h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo247a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            m236c(coordinatorLayout, appBarLayout);
        }

        @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo248a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (!(parcelable instanceof C0036b)) {
                super.mo248a(coordinatorLayout, appBarLayout, parcelable);
                this.f208d = -1;
                return;
            }
            C0036b c0036b = (C0036b) parcelable;
            super.mo248a(coordinatorLayout, appBarLayout, c0036b.m1605a());
            this.f208d = c0036b.f216a;
            this.f210f = c0036b.f217b;
            this.f209e = c0036b.f218c;
        }

        @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo249a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            if (i == 0) {
                m236c(coordinatorLayout, appBarLayout);
            }
            this.f211g = new WeakReference<>(view);
        }

        @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo250a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
            if (i4 < 0) {
                m513b(coordinatorLayout, appBarLayout, i4, -appBarLayout.getDownNestedScrollRange(), 0);
            }
        }

        @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo251a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int downNestedPreScrollRange;
            if (i2 != 0) {
                if (i2 < 0) {
                    i4 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = i4 + appBarLayout.getDownNestedPreScrollRange();
                } else {
                    i4 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                if (i4 != downNestedPreScrollRange) {
                    iArr[1] = m513b(coordinatorLayout, appBarLayout, i2, i4, downNestedPreScrollRange);
                }
            }
        }

        @Override // android.support.design.widget.C0076p
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo252a(int i) {
            return super.mo252a(i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // android.support.design.widget.AbstractC0068h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean mo266c(AppBarLayout appBarLayout) {
            if (this.f212h != null) {
                return this.f212h.m267a(appBarLayout);
            }
            if (this.f211g == null) {
                return true;
            }
            View view = this.f211g.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        @Override // android.support.design.widget.C0076p, android.support.design.widget.CoordinatorLayout.AbstractC0045a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean mo257a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            boolean zA = super.mo257a(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            if (this.f208d >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(this.f208d);
                int i2 = -childAt.getBottom();
                m512a_(coordinatorLayout, appBarLayout, this.f209e ? C0246q.m1764j(childAt) + appBarLayout.getTopInset() + i2 : Math.round(childAt.getHeight() * this.f210f) + i2);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i3 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z) {
                        m230a(coordinatorLayout, appBarLayout, i3, 0.0f);
                    } else {
                        m512a_(coordinatorLayout, appBarLayout, i3);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m230a(coordinatorLayout, appBarLayout, 0, 0.0f);
                    } else {
                        m512a_(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.m227d();
            this.f208d = -1;
            mo252a(C0198a.m1464a(mo260b(), -appBarLayout.getTotalScrollRange(), 0));
            m232a(coordinatorLayout, appBarLayout, mo260b(), 0, true);
            appBarLayout.m222a(mo260b());
            return zA;
        }

        @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean mo258a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.C0048d) appBarLayout.getLayoutParams()).height != -2) {
                return super.mo258a(coordinatorLayout, appBarLayout, i, i2, i3, i4);
            }
            coordinatorLayout.m341a(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean mo259a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            boolean z = (i & 2) != 0 && appBarLayout.m226c() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
            if (z && this.f207c != null) {
                this.f207c.cancel();
            }
            this.f211g = null;
            return z;
        }

        @Override // android.support.design.widget.C0076p
        /* JADX INFO: renamed from: b */
        public /* bridge */ /* synthetic */ int mo260b() {
            return super.mo260b();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // android.support.design.widget.AbstractC0068h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int mo262b(AppBarLayout appBarLayout) {
            return -appBarLayout.getDownNestedScrollRange();
        }

        @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo264b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable parcelableB = super.mo264b(coordinatorLayout, appBarLayout);
            int iMo260b = mo260b();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iMo260b;
                if (childAt.getTop() + iMo260b <= 0 && bottom >= 0) {
                    C0036b c0036b = new C0036b(parcelableB);
                    c0036b.f216a = i;
                    c0036b.f218c = bottom == C0246q.m1764j(childAt) + appBarLayout.getTopInset();
                    c0036b.f217b = bottom / childAt.getHeight();
                    return c0036b;
                }
            }
            return parcelableB;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // android.support.design.widget.AbstractC0068h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo241a(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }
    }

    public static class ScrollingViewBehavior extends AbstractC0069i {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0025a.j.ScrollingViewBehavior_Layout);
            m516b(typedArrayObtainStyledAttributes.getDimensionPixelSize(C0025a.j.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: a */
        private static int m271a(AppBarLayout appBarLayout) {
            CoordinatorLayout.AbstractC0045a abstractC0045aM384b = ((CoordinatorLayout.C0048d) appBarLayout.getLayoutParams()).m384b();
            if (abstractC0045aM384b instanceof Behavior) {
                return ((Behavior) abstractC0045aM384b).mo238a();
            }
            return 0;
        }

        /* JADX INFO: renamed from: e */
        private void m272e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.AbstractC0045a abstractC0045aM384b = ((CoordinatorLayout.C0048d) view2.getLayoutParams()).m384b();
            if (abstractC0045aM384b instanceof Behavior) {
                C0246q.m1753b(view, ((((Behavior) abstractC0045aM384b).f206b + (view2.getBottom() - view.getTop())) + m515a()) - m518c(view2));
            }
        }

        @Override // android.support.design.widget.AbstractC0069i
        /* JADX INFO: renamed from: a */
        float mo273a(View view) {
            int i;
            if (!(view instanceof AppBarLayout)) {
                return 0.0f;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            int iM271a = m271a(appBarLayout);
            if ((downNestedPreScrollRange == 0 || totalScrollRange + iM271a > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                return 1.0f + (iM271a / i);
            }
            return 0.0f;
        }

        /* JADX INFO: renamed from: a */
        AppBarLayout m274a(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // android.support.design.widget.C0076p
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo252a(int i) {
            return super.mo252a(i);
        }

        @Override // android.support.design.widget.C0076p, android.support.design.widget.CoordinatorLayout.AbstractC0045a
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo257a(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.mo257a(coordinatorLayout, view, i);
        }

        @Override // android.support.design.widget.AbstractC0069i, android.support.design.widget.CoordinatorLayout.AbstractC0045a
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo258a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.mo258a(coordinatorLayout, view, i, i2, i3, i4);
        }

        @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
        /* JADX INFO: renamed from: a */
        public boolean mo275a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutM274a = m274a(coordinatorLayout.m354c(view));
            if (appBarLayoutM274a != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f432a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    appBarLayoutM274a.m223a(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
        /* JADX INFO: renamed from: a */
        public boolean mo276a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // android.support.design.widget.C0076p
        /* JADX INFO: renamed from: b */
        public /* bridge */ /* synthetic */ int mo260b() {
            return super.mo260b();
        }

        @Override // android.support.design.widget.AbstractC0069i
        /* JADX INFO: renamed from: b */
        int mo277b(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.mo277b(view);
        }

        @Override // android.support.design.widget.AbstractC0069i
        /* JADX INFO: renamed from: b */
        /* synthetic */ View mo278b(List list) {
            return m274a((List<View>) list);
        }

        @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
        /* JADX INFO: renamed from: b */
        public boolean mo279b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m272e(coordinatorLayout, view, view2);
            return false;
        }
    }

    /* JADX INFO: renamed from: android.support.design.widget.AppBarLayout$a */
    public static class C0037a extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a */
        int f219a;

        /* JADX INFO: renamed from: b */
        Interpolator f220b;

        public C0037a(int i, int i2) {
            super(i, i2);
            this.f219a = 1;
        }

        public C0037a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f219a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0025a.j.AppBarLayout_Layout);
            this.f219a = typedArrayObtainStyledAttributes.getInt(C0025a.j.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (typedArrayObtainStyledAttributes.hasValue(C0025a.j.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f220b = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(C0025a.j.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0037a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f219a = 1;
        }

        public C0037a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f219a = 1;
        }

        public C0037a(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f219a = 1;
        }

        /* JADX INFO: renamed from: a */
        public int m280a() {
            return this.f219a;
        }

        /* JADX INFO: renamed from: b */
        public Interpolator m281b() {
            return this.f220b;
        }

        /* JADX INFO: renamed from: c */
        boolean m282c() {
            return (this.f219a & 1) == 1 && (this.f219a & 10) != 0;
        }
    }

    /* JADX INFO: renamed from: android.support.design.widget.AppBarLayout$b */
    public interface InterfaceC0038b {
        /* JADX INFO: renamed from: a */
        void m283a(AppBarLayout appBarLayout, int i);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f195a = -1;
        this.f196b = -1;
        this.f197c = -1;
        this.f199e = 0;
        setOrientation(1);
        C0074n.m552a(context);
        if (Build.VERSION.SDK_INT >= 21) {
            C0079s.m562a(this);
            C0079s.m564a(this, attributeSet, 0, C0025a.i.Widget_Design_AppBarLayout);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0025a.j.AppBarLayout, 0, C0025a.i.Widget_Design_AppBarLayout);
        C0246q.m1744a(this, typedArrayObtainStyledAttributes.getDrawable(C0025a.j.AppBarLayout_android_background));
        if (typedArrayObtainStyledAttributes.hasValue(C0025a.j.AppBarLayout_expanded)) {
            m214a(typedArrayObtainStyledAttributes.getBoolean(C0025a.j.AppBarLayout_expanded, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && typedArrayObtainStyledAttributes.hasValue(C0025a.j.AppBarLayout_elevation)) {
            C0079s.m563a(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(C0025a.j.AppBarLayout_elevation, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (typedArrayObtainStyledAttributes.hasValue(C0025a.j.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(typedArrayObtainStyledAttributes.getBoolean(C0025a.j.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (typedArrayObtainStyledAttributes.hasValue(C0025a.j.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(typedArrayObtainStyledAttributes.getBoolean(C0025a.j.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        C0246q.m1746a(this, new InterfaceC0244o() { // from class: android.support.design.widget.AppBarLayout.1
            @Override // android.support.v4.p019j.InterfaceC0244o
            /* JADX INFO: renamed from: a */
            public C0254y mo213a(View view, C0254y c0254y) {
                return AppBarLayout.this.m221a(c0254y);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private void m214a(boolean z, boolean z2, boolean z3) {
        this.f199e = (z3 ? 8 : 0) | (z2 ? 4 : 0) | (z ? 1 : 2);
        requestLayout();
    }

    /* JADX INFO: renamed from: b */
    private boolean m215b(boolean z) {
        if (this.f202h == z) {
            return false;
        }
        this.f202h = z;
        refreshDrawableState();
        return true;
    }

    /* JADX INFO: renamed from: e */
    private void m216e() {
        boolean z;
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            } else {
                if (((C0037a) getChildAt(i).getLayoutParams()).m282c()) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        m215b(z);
    }

    /* JADX INFO: renamed from: f */
    private void m217f() {
        this.f195a = -1;
        this.f196b = -1;
        this.f197c = -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0037a generateDefaultLayoutParams() {
        return new C0037a(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0037a generateLayoutParams(AttributeSet attributeSet) {
        return new C0037a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0037a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (Build.VERSION.SDK_INT < 19 || !(layoutParams instanceof LinearLayout.LayoutParams)) ? layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0037a((ViewGroup.MarginLayoutParams) layoutParams) : new C0037a(layoutParams) : new C0037a((LinearLayout.LayoutParams) layoutParams);
    }

    /* JADX INFO: renamed from: a */
    C0254y m221a(C0254y c0254y) {
        C0254y c0254y2 = C0246q.m1770p(this) ? c0254y : null;
        if (!C0215i.m1567a(this.f200f, c0254y2)) {
            this.f200f = c0254y2;
            m217f();
        }
        return c0254y;
    }

    /* JADX INFO: renamed from: a */
    void m222a(int i) {
        if (this.f201g != null) {
            int size = this.f201g.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC0038b interfaceC0038b = this.f201g.get(i2);
                if (interfaceC0038b != null) {
                    interfaceC0038b.m283a(this, i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m223a(boolean z, boolean z2) {
        m214a(z, z2, true);
    }

    /* JADX INFO: renamed from: a */
    boolean m224a(boolean z) {
        if (this.f203i == z) {
            return false;
        }
        this.f203i = z;
        refreshDrawableState();
        return true;
    }

    /* JADX INFO: renamed from: b */
    boolean m225b() {
        return this.f198d;
    }

    /* JADX INFO: renamed from: c */
    boolean m226c() {
        return getTotalScrollRange() != 0;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0037a;
    }

    /* JADX INFO: renamed from: d */
    void m227d() {
        this.f199e = 0;
    }

    int getDownNestedPreScrollRange() {
        int iM1764j;
        if (this.f196b != -1) {
            return this.f196b;
        }
        int childCount = getChildCount() - 1;
        int i = 0;
        while (childCount >= 0) {
            View childAt = getChildAt(childCount);
            C0037a c0037a = (C0037a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i2 = c0037a.f219a;
            if ((i2 & 5) == 5) {
                int i3 = c0037a.bottomMargin + c0037a.topMargin + i;
                iM1764j = (i2 & 8) != 0 ? i3 + C0246q.m1764j(childAt) : (i2 & 2) != 0 ? i3 + (measuredHeight - C0246q.m1764j(childAt)) : i3 + (measuredHeight - getTopInset());
            } else {
                if (i > 0) {
                    break;
                }
                iM1764j = i;
            }
            childCount--;
            i = iM1764j;
        }
        int iMax = Math.max(0, i);
        this.f196b = iMax;
        return iMax;
    }

    int getDownNestedScrollRange() {
        int iM1764j;
        if (this.f197c != -1) {
            return this.f197c;
        }
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0037a c0037a = (C0037a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + c0037a.topMargin + c0037a.bottomMargin;
            int i3 = c0037a.f219a;
            if ((i3 & 1) == 0) {
                break;
            }
            i += measuredHeight;
            if ((i3 & 2) != 0) {
                iM1764j = i - (C0246q.m1764j(childAt) + getTopInset());
                break;
            }
        }
        iM1764j = i;
        int iMax = Math.max(0, iM1764j);
        this.f197c = iMax;
        return iMax;
    }

    final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int iM1764j = C0246q.m1764j(this);
        if (iM1764j != 0) {
            return (iM1764j * 2) + topInset;
        }
        int childCount = getChildCount();
        int iM1764j2 = childCount >= 1 ? C0246q.m1764j(getChildAt(childCount - 1)) : 0;
        return iM1764j2 != 0 ? (iM1764j2 * 2) + topInset : getHeight() / 3;
    }

    int getPendingAction() {
        return this.f199e;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        if (this.f200f != null) {
            return this.f200f.m1870b();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int iM1764j;
        if (this.f195a != -1) {
            return this.f195a;
        }
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0037a c0037a = (C0037a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = c0037a.f219a;
            if ((i3 & 1) == 0) {
                break;
            }
            i += c0037a.bottomMargin + measuredHeight + c0037a.topMargin;
            if ((i3 & 2) != 0) {
                iM1764j = i - C0246q.m1764j(childAt);
                break;
            }
        }
        iM1764j = i;
        int iMax = Math.max(0, iM1764j - getTopInset());
        this.f195a = iMax;
        return iMax;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        if (this.f204j == null) {
            this.f204j = new int[2];
        }
        int[] iArr = this.f204j;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(iArr.length + i);
        iArr[0] = this.f202h ? C0025a.b.state_collapsible : -C0025a.b.state_collapsible;
        iArr[1] = (this.f202h && this.f203i) ? C0025a.b.state_collapsed : -C0025a.b.state_collapsed;
        return mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m217f();
        this.f198d = false;
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            if (((C0037a) getChildAt(i5).getLayoutParams()).m281b() != null) {
                this.f198d = true;
                break;
            }
            i5++;
        }
        m216e();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m217f();
    }

    public void setExpanded(boolean z) {
        m223a(z, C0246q.m1777w(this));
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0079s.m563a(this, f);
        }
    }
}
