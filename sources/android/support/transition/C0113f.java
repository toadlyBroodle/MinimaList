package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.p019j.C0246q;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* JADX INFO: renamed from: android.support.transition.f */
/* JADX INFO: loaded from: classes.dex */
public class C0113f extends AbstractC0128u {

    /* JADX INFO: renamed from: g */
    private static final String[] f555g = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: h */
    private static final Property<Drawable, PointF> f556h = new Property<Drawable, PointF>(PointF.class, "boundsOrigin") { // from class: android.support.transition.f.1

        /* JADX INFO: renamed from: a */
        private Rect f566a = new Rect();

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f566a);
            return new PointF(this.f566a.left, this.f566a.top);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f566a);
            this.f566a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f566a);
        }
    };

    /* JADX INFO: renamed from: i */
    private static final Property<a, PointF> f557i = new Property<a, PointF>(PointF.class, "topLeft") { // from class: android.support.transition.f.3
        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(a aVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void set(a aVar, PointF pointF) {
            aVar.m671a(pointF);
        }
    };

    /* JADX INFO: renamed from: j */
    private static final Property<a, PointF> f558j = new Property<a, PointF>(PointF.class, "bottomRight") { // from class: android.support.transition.f.4
        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(a aVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void set(a aVar, PointF pointF) {
            aVar.m672b(pointF);
        }
    };

    /* JADX INFO: renamed from: k */
    private static final Property<View, PointF> f559k = new Property<View, PointF>(PointF.class, "bottomRight") { // from class: android.support.transition.f.5
        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            C0098am.m613a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    };

    /* JADX INFO: renamed from: l */
    private static final Property<View, PointF> f560l = new Property<View, PointF>(PointF.class, "topLeft") { // from class: android.support.transition.f.6
        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            C0098am.m613a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    };

    /* JADX INFO: renamed from: m */
    private static final Property<View, PointF> f561m = new Property<View, PointF>(PointF.class, "position") { // from class: android.support.transition.f.7
        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            C0098am.m613a(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    };

    /* JADX INFO: renamed from: q */
    private static C0126s f562q = new C0126s();

    /* JADX INFO: renamed from: n */
    private int[] f563n = new int[2];

    /* JADX INFO: renamed from: o */
    private boolean f564o = false;

    /* JADX INFO: renamed from: p */
    private boolean f565p = false;

    /* JADX INFO: renamed from: android.support.transition.f$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        private int f585a;

        /* JADX INFO: renamed from: b */
        private int f586b;

        /* JADX INFO: renamed from: c */
        private int f587c;

        /* JADX INFO: renamed from: d */
        private int f588d;

        /* JADX INFO: renamed from: e */
        private View f589e;

        /* JADX INFO: renamed from: f */
        private int f590f;

        /* JADX INFO: renamed from: g */
        private int f591g;

        a(View view) {
            this.f589e = view;
        }

        /* JADX INFO: renamed from: a */
        private void m670a() {
            C0098am.m613a(this.f589e, this.f585a, this.f586b, this.f587c, this.f588d);
            this.f590f = 0;
            this.f591g = 0;
        }

        /* JADX INFO: renamed from: a */
        void m671a(PointF pointF) {
            this.f585a = Math.round(pointF.x);
            this.f586b = Math.round(pointF.y);
            this.f590f++;
            if (this.f590f == this.f591g) {
                m670a();
            }
        }

        /* JADX INFO: renamed from: b */
        void m672b(PointF pointF) {
            this.f587c = Math.round(pointF.x);
            this.f588d = Math.round(pointF.y);
            this.f591g++;
            if (this.f590f == this.f591g) {
                m670a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m656a(View view, View view2) {
        if (!this.f565p) {
            return true;
        }
        C0086aa c0086aaB = m710b(view, true);
        return c0086aaB == null ? view == view2 : view2 == c0086aaB.f498b;
    }

    /* JADX INFO: renamed from: d */
    private void m657d(C0086aa c0086aa) {
        View view = c0086aa.f498b;
        if (!C0246q.m1777w(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        c0086aa.f497a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        c0086aa.f497a.put("android:changeBounds:parent", c0086aa.f498b.getParent());
        if (this.f565p) {
            c0086aa.f498b.getLocationInWindow(this.f563n);
            c0086aa.f497a.put("android:changeBounds:windowX", Integer.valueOf(this.f563n[0]));
            c0086aa.f497a.put("android:changeBounds:windowY", Integer.valueOf(this.f563n[1]));
        }
        if (this.f564o) {
            c0086aa.f497a.put("android:changeBounds:clip", C0246q.m1779y(view));
        }
    }

    @Override // android.support.transition.AbstractC0128u
    /* JADX INFO: renamed from: a */
    public Animator mo641a(final ViewGroup viewGroup, C0086aa c0086aa, C0086aa c0086aa2) {
        ObjectAnimator objectAnimator;
        Animator animatorM754a;
        if (c0086aa == null || c0086aa2 == null) {
            return null;
        }
        Map<String, Object> map = c0086aa.f497a;
        Map<String, Object> map2 = c0086aa2.f497a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        final View view = c0086aa2.f498b;
        if (m656a(viewGroup2, viewGroup3)) {
            Rect rect = (Rect) c0086aa.f497a.get("android:changeBounds:bounds");
            Rect rect2 = (Rect) c0086aa2.f497a.get("android:changeBounds:bounds");
            int i = rect.left;
            final int i2 = rect2.left;
            int i3 = rect.top;
            final int i4 = rect2.top;
            int i5 = rect.right;
            final int i6 = rect2.right;
            int i7 = rect.bottom;
            final int i8 = rect2.bottom;
            int i9 = i5 - i;
            int i10 = i7 - i3;
            int i11 = i6 - i2;
            int i12 = i8 - i4;
            Rect rect3 = (Rect) c0086aa.f497a.get("android:changeBounds:clip");
            final Rect rect4 = (Rect) c0086aa2.f497a.get("android:changeBounds:clip");
            if ((i9 != 0 && i10 != 0) || (i11 != 0 && i12 != 0)) {
                i = (i == i2 && i3 == i4) ? 0 : 1;
                if (i5 != i6 || i7 != i8) {
                    i++;
                }
            }
            if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                i++;
            }
            if (i > 0) {
                if (this.f564o) {
                    C0098am.m613a(view, i, i3, Math.max(i9, i11) + i, Math.max(i10, i12) + i3);
                    ObjectAnimator objectAnimatorM675a = (i == i2 && i3 == i4) ? null : C0115h.m675a(view, f561m, m727l().mo677a(i, i3, i2, i4));
                    Rect rect5 = rect3 == null ? new Rect(0, 0, i9, i10) : rect3;
                    Rect rect6 = rect4 == null ? new Rect(0, 0, i11, i12) : rect4;
                    if (rect5.equals(rect6)) {
                        objectAnimator = null;
                    } else {
                        C0246q.m1743a(view, rect5);
                        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f562q, rect5, rect6);
                        objectAnimatorOfObject.addListener(new AnimatorListenerAdapter() { // from class: android.support.transition.f.9

                            /* JADX INFO: renamed from: h */
                            private boolean f584h;

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationCancel(Animator animator) {
                                this.f584h = true;
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                if (this.f584h) {
                                    return;
                                }
                                C0246q.m1743a(view, rect4);
                                C0098am.m613a(view, i2, i4, i6, i8);
                            }
                        });
                        objectAnimator = objectAnimatorOfObject;
                    }
                    animatorM754a = C0133z.m754a(objectAnimatorM675a, objectAnimator);
                } else {
                    C0098am.m613a(view, i, i3, i5, i7);
                    if (i != 2) {
                        animatorM754a = (i == i2 && i3 == i4) ? C0115h.m675a(view, f559k, m727l().mo677a(i5, i7, i6, i8)) : C0115h.m675a(view, f560l, m727l().mo677a(i, i3, i2, i4));
                    } else if (i9 == i11 && i10 == i12) {
                        animatorM754a = C0115h.m675a(view, f561m, m727l().mo677a(i, i3, i2, i4));
                    } else {
                        final a aVar = new a(view);
                        ObjectAnimator objectAnimatorM675a2 = C0115h.m675a(aVar, f557i, m727l().mo677a(i, i3, i2, i4));
                        ObjectAnimator objectAnimatorM675a3 = C0115h.m675a(aVar, f558j, m727l().mo677a(i5, i7, i6, i8));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(objectAnimatorM675a2, objectAnimatorM675a3);
                        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: android.support.transition.f.8
                            private a mViewBounds;

                            {
                                this.mViewBounds = aVar;
                            }
                        });
                        animatorM754a = animatorSet;
                    }
                }
                if (!(view.getParent() instanceof ViewGroup)) {
                    return animatorM754a;
                }
                final ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                C0091af.m596a(viewGroup4, true);
                mo700a(new C0129v() { // from class: android.support.transition.f.10

                    /* JADX INFO: renamed from: a */
                    boolean f567a = false;

                    @Override // android.support.transition.C0129v, android.support.transition.AbstractC0128u.c
                    /* JADX INFO: renamed from: a */
                    public void mo583a(AbstractC0128u abstractC0128u) {
                        if (!this.f567a) {
                            C0091af.m596a(viewGroup4, false);
                        }
                        abstractC0128u.mo712b(this);
                    }

                    @Override // android.support.transition.C0129v, android.support.transition.AbstractC0128u.c
                    /* JADX INFO: renamed from: b */
                    public void mo584b(AbstractC0128u abstractC0128u) {
                        C0091af.m596a(viewGroup4, false);
                    }

                    @Override // android.support.transition.C0129v, android.support.transition.AbstractC0128u.c
                    /* JADX INFO: renamed from: c */
                    public void mo585c(AbstractC0128u abstractC0128u) {
                        C0091af.m596a(viewGroup4, true);
                    }
                });
                return animatorM754a;
            }
        } else {
            int iIntValue = ((Integer) c0086aa.f497a.get("android:changeBounds:windowX")).intValue();
            int iIntValue2 = ((Integer) c0086aa.f497a.get("android:changeBounds:windowY")).intValue();
            int iIntValue3 = ((Integer) c0086aa2.f497a.get("android:changeBounds:windowX")).intValue();
            int iIntValue4 = ((Integer) c0086aa2.f497a.get("android:changeBounds:windowY")).intValue();
            if (iIntValue != iIntValue3 || iIntValue2 != iIntValue4) {
                viewGroup.getLocationInWindow(this.f563n);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
                view.draw(new Canvas(bitmapCreateBitmap));
                final BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                final float fM617c = C0098am.m617c(view);
                C0098am.m611a(view, 0.0f);
                C0098am.m609a(viewGroup).mo593a(bitmapDrawable);
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, C0121n.m680a(f556h, m727l().mo677a(iIntValue - this.f563n[0], iIntValue2 - this.f563n[1], iIntValue3 - this.f563n[0], iIntValue4 - this.f563n[1])));
                objectAnimatorOfPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: android.support.transition.f.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        C0098am.m609a(viewGroup).mo594b(bitmapDrawable);
                        C0098am.m611a(view, fM617c);
                    }
                });
                return objectAnimatorOfPropertyValuesHolder;
            }
        }
        return null;
    }

    @Override // android.support.transition.AbstractC0128u
    /* JADX INFO: renamed from: a */
    public void mo644a(C0086aa c0086aa) {
        m657d(c0086aa);
    }

    @Override // android.support.transition.AbstractC0128u
    /* JADX INFO: renamed from: a */
    public String[] mo646a() {
        return f555g;
    }

    @Override // android.support.transition.AbstractC0128u
    /* JADX INFO: renamed from: b */
    public void mo649b(C0086aa c0086aa) {
        m657d(c0086aa);
    }
}
