package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.transition.AbstractC0128u;
import android.support.transition.C0109b;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: android.support.transition.at */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0105at extends AbstractC0128u {

    /* JADX INFO: renamed from: g */
    private static final String[] f536g = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: h */
    private int f537h = 3;

    /* JADX INFO: renamed from: android.support.transition.at$a */
    private static class a extends AnimatorListenerAdapter implements C0109b.a, AbstractC0128u.c {

        /* JADX INFO: renamed from: a */
        boolean f541a = false;

        /* JADX INFO: renamed from: b */
        private final View f542b;

        /* JADX INFO: renamed from: c */
        private final int f543c;

        /* JADX INFO: renamed from: d */
        private final ViewGroup f544d;

        /* JADX INFO: renamed from: e */
        private final boolean f545e;

        /* JADX INFO: renamed from: f */
        private boolean f546f;

        a(View view, int i, boolean z) {
            this.f542b = view;
            this.f543c = i;
            this.f544d = (ViewGroup) view.getParent();
            this.f545e = z;
            m651a(true);
        }

        /* JADX INFO: renamed from: a */
        private void m650a() {
            if (!this.f541a) {
                C0098am.m612a(this.f542b, this.f543c);
                if (this.f544d != null) {
                    this.f544d.invalidate();
                }
            }
            m651a(false);
        }

        /* JADX INFO: renamed from: a */
        private void m651a(boolean z) {
            if (!this.f545e || this.f546f == z || this.f544d == null) {
                return;
            }
            this.f546f = z;
            C0091af.m596a(this.f544d, z);
        }

        @Override // android.support.transition.AbstractC0128u.c
        /* JADX INFO: renamed from: a */
        public void mo583a(AbstractC0128u abstractC0128u) {
            m650a();
            abstractC0128u.mo712b(this);
        }

        @Override // android.support.transition.AbstractC0128u.c
        /* JADX INFO: renamed from: b */
        public void mo584b(AbstractC0128u abstractC0128u) {
            m651a(false);
        }

        @Override // android.support.transition.AbstractC0128u.c
        /* JADX INFO: renamed from: c */
        public void mo585c(AbstractC0128u abstractC0128u) {
            m651a(true);
        }

        @Override // android.support.transition.AbstractC0128u.c
        /* JADX INFO: renamed from: d */
        public void mo586d(AbstractC0128u abstractC0128u) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f541a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m650a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, android.support.transition.C0109b.a
        public void onAnimationPause(Animator animator) {
            if (this.f541a) {
                return;
            }
            C0098am.m612a(this.f542b, this.f543c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, android.support.transition.C0109b.a
        public void onAnimationResume(Animator animator) {
            if (this.f541a) {
                return;
            }
            C0098am.m612a(this.f542b, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: android.support.transition.at$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        boolean f547a;

        /* JADX INFO: renamed from: b */
        boolean f548b;

        /* JADX INFO: renamed from: c */
        int f549c;

        /* JADX INFO: renamed from: d */
        int f550d;

        /* JADX INFO: renamed from: e */
        ViewGroup f551e;

        /* JADX INFO: renamed from: f */
        ViewGroup f552f;

        private b() {
        }
    }

    /* JADX INFO: renamed from: b */
    private b m638b(C0086aa c0086aa, C0086aa c0086aa2) {
        b bVar = new b();
        bVar.f547a = false;
        bVar.f548b = false;
        if (c0086aa == null || !c0086aa.f497a.containsKey("android:visibility:visibility")) {
            bVar.f549c = -1;
            bVar.f551e = null;
        } else {
            bVar.f549c = ((Integer) c0086aa.f497a.get("android:visibility:visibility")).intValue();
            bVar.f551e = (ViewGroup) c0086aa.f497a.get("android:visibility:parent");
        }
        if (c0086aa2 == null || !c0086aa2.f497a.containsKey("android:visibility:visibility")) {
            bVar.f550d = -1;
            bVar.f552f = null;
        } else {
            bVar.f550d = ((Integer) c0086aa2.f497a.get("android:visibility:visibility")).intValue();
            bVar.f552f = (ViewGroup) c0086aa2.f497a.get("android:visibility:parent");
        }
        if (c0086aa == null || c0086aa2 == null) {
            if (c0086aa == null && bVar.f550d == 0) {
                bVar.f548b = true;
                bVar.f547a = true;
            } else if (c0086aa2 == null && bVar.f549c == 0) {
                bVar.f548b = false;
                bVar.f547a = true;
            }
        } else {
            if (bVar.f549c == bVar.f550d && bVar.f551e == bVar.f552f) {
                return bVar;
            }
            if (bVar.f549c != bVar.f550d) {
                if (bVar.f549c == 0) {
                    bVar.f548b = false;
                    bVar.f547a = true;
                } else if (bVar.f550d == 0) {
                    bVar.f548b = true;
                    bVar.f547a = true;
                }
            } else if (bVar.f552f == null) {
                bVar.f548b = false;
                bVar.f547a = true;
            } else if (bVar.f551e == null) {
                bVar.f548b = true;
                bVar.f547a = true;
            }
        }
        return bVar;
    }

    /* JADX INFO: renamed from: d */
    private void m639d(C0086aa c0086aa) {
        c0086aa.f497a.put("android:visibility:visibility", Integer.valueOf(c0086aa.f498b.getVisibility()));
        c0086aa.f497a.put("android:visibility:parent", c0086aa.f498b.getParent());
        int[] iArr = new int[2];
        c0086aa.f498b.getLocationOnScreen(iArr);
        c0086aa.f497a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX INFO: renamed from: a */
    public Animator m640a(ViewGroup viewGroup, C0086aa c0086aa, int i, C0086aa c0086aa2, int i2) {
        if ((this.f537h & 1) != 1 || c0086aa2 == null) {
            return null;
        }
        if (c0086aa == null) {
            View view = (View) c0086aa2.f498b.getParent();
            if (m638b(m710b(view, false), m698a(view, false)).f547a) {
                return null;
            }
        }
        return mo642a(viewGroup, c0086aa2.f498b, c0086aa, c0086aa2);
    }

    @Override // android.support.transition.AbstractC0128u
    /* JADX INFO: renamed from: a */
    public Animator mo641a(ViewGroup viewGroup, C0086aa c0086aa, C0086aa c0086aa2) {
        b bVarM638b = m638b(c0086aa, c0086aa2);
        if (!bVarM638b.f547a || (bVarM638b.f551e == null && bVarM638b.f552f == null)) {
            return null;
        }
        return bVarM638b.f548b ? m640a(viewGroup, c0086aa, bVarM638b.f549c, c0086aa2, bVarM638b.f550d) : m647b(viewGroup, c0086aa, bVarM638b.f549c, c0086aa2, bVarM638b.f550d);
    }

    /* JADX INFO: renamed from: a */
    public Animator mo642a(ViewGroup viewGroup, View view, C0086aa c0086aa, C0086aa c0086aa2) {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m643a(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f537h = i;
    }

    @Override // android.support.transition.AbstractC0128u
    /* JADX INFO: renamed from: a */
    public void mo644a(C0086aa c0086aa) {
        m639d(c0086aa);
    }

    @Override // android.support.transition.AbstractC0128u
    /* JADX INFO: renamed from: a */
    public boolean mo645a(C0086aa c0086aa, C0086aa c0086aa2) {
        if (c0086aa == null && c0086aa2 == null) {
            return false;
        }
        if (c0086aa != null && c0086aa2 != null && c0086aa2.f497a.containsKey("android:visibility:visibility") != c0086aa.f497a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b bVarM638b = m638b(c0086aa, c0086aa2);
        if (bVarM638b.f547a) {
            return bVarM638b.f549c == 0 || bVarM638b.f550d == 0;
        }
        return false;
    }

    @Override // android.support.transition.AbstractC0128u
    /* JADX INFO: renamed from: a */
    public String[] mo646a() {
        return f536g;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Animator m647b(ViewGroup viewGroup, C0086aa c0086aa, int i, C0086aa c0086aa2, int i2) {
        int id;
        Animator animatorMo648b = null;
        if ((this.f537h & 2) == 2) {
            final View viewM756a = c0086aa != null ? c0086aa.f498b : null;
            View view = c0086aa2 != null ? c0086aa2.f498b : null;
            if (view == null || view.getParent() == null) {
                if (view != null) {
                    viewM756a = view;
                    view = null;
                } else if (viewM756a == null) {
                    view = null;
                    viewM756a = null;
                } else if (viewM756a.getParent() == null) {
                    view = null;
                } else if (viewM756a.getParent() instanceof View) {
                    View view2 = (View) viewM756a.getParent();
                    viewM756a = !m638b(m698a(view2, true), m710b(view2, true)).f547a ? C0133z.m756a(viewGroup, viewM756a, view2) : (view2.getParent() != null || (id = view2.getId()) == -1 || viewGroup.findViewById(id) == null || !this.f624e) ? null : viewM756a;
                    view = null;
                }
            } else if (i2 == 4 || viewM756a == view) {
                viewM756a = null;
            } else {
                view = null;
            }
            if (viewM756a != null && c0086aa != null) {
                int[] iArr = (int[]) c0086aa.f497a.get("android:visibility:screenLocation");
                int i3 = iArr[0];
                int i4 = iArr[1];
                int[] iArr2 = new int[2];
                viewGroup.getLocationOnScreen(iArr2);
                viewM756a.offsetLeftAndRight((i3 - iArr2[0]) - viewM756a.getLeft());
                viewM756a.offsetTopAndBottom((i4 - iArr2[1]) - viewM756a.getTop());
                final InterfaceC0090ae interfaceC0090aeM595a = C0091af.m595a(viewGroup);
                interfaceC0090aeM595a.mo591a(viewM756a);
                animatorMo648b = mo648b(viewGroup, viewM756a, c0086aa, c0086aa2);
                if (animatorMo648b == null) {
                    interfaceC0090aeM595a.mo592b(viewM756a);
                } else {
                    animatorMo648b.addListener(new AnimatorListenerAdapter() { // from class: android.support.transition.at.1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            interfaceC0090aeM595a.mo592b(viewM756a);
                        }
                    });
                }
            } else if (view != null) {
                int visibility = view.getVisibility();
                C0098am.m612a(view, 0);
                animatorMo648b = mo648b(viewGroup, view, c0086aa, c0086aa2);
                if (animatorMo648b != null) {
                    a aVar = new a(view, i2, true);
                    animatorMo648b.addListener(aVar);
                    C0085a.m588a(animatorMo648b, aVar);
                    mo700a(aVar);
                } else {
                    C0098am.m612a(view, visibility);
                }
            }
        }
        return animatorMo648b;
    }

    /* JADX INFO: renamed from: b */
    public Animator mo648b(ViewGroup viewGroup, View view, C0086aa c0086aa, C0086aa c0086aa2) {
        return null;
    }

    @Override // android.support.transition.AbstractC0128u
    /* JADX INFO: renamed from: b */
    public void mo649b(C0086aa c0086aa) {
        m639d(c0086aa);
    }
}
