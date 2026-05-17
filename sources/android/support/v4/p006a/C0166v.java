package android.support.v4.p006a;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: android.support.v4.a.v */
/* JADX INFO: loaded from: classes.dex */
class C0166v extends AbstractC0167w {
    C0166v() {
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1247a(Transition transition) {
        return (m1250a((List) transition.getTargetIds()) && m1250a((List) transition.getTargetNames()) && m1250a((List) transition.getTargetTypes())) ? false : true;
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: a */
    public Object mo567a(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: a */
    public void mo568a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: a */
    public void mo569a(Object obj, final Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() { // from class: android.support.v4.a.v.4
                @Override // android.transition.Transition.EpicenterCallback
                public Rect onGetEpicenter(Transition transition) {
                    if (rect == null || rect.isEmpty()) {
                        return null;
                    }
                    return rect;
                }
            });
        }
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: a */
    public void mo570a(Object obj, View view) {
        if (view != null) {
            final Rect rect = new Rect();
            m1253a(view, rect);
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() { // from class: android.support.v4.a.v.1
                @Override // android.transition.Transition.EpicenterCallback
                public Rect onGetEpicenter(Transition transition) {
                    return rect;
                }
            });
        }
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: a */
    public void mo571a(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m1249a(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo573a(transitionSet, arrayList);
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: a */
    public void mo572a(Object obj, final Object obj2, final ArrayList<View> arrayList, final Object obj3, final ArrayList<View> arrayList2, final Object obj4, final ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: android.support.v4.a.v.3
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
                if (obj2 != null) {
                    C0166v.this.mo580b(obj2, arrayList, (ArrayList<View>) null);
                }
                if (obj3 != null) {
                    C0166v.this.mo580b(obj3, arrayList2, (ArrayList<View>) null);
                }
                if (obj4 != null) {
                    C0166v.this.mo580b(obj4, arrayList3, (ArrayList<View>) null);
                }
            }
        });
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: a */
    public void mo573a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            for (int i = 0; i < transitionCount; i++) {
                mo573a(transitionSet.getTransitionAt(i), arrayList);
            }
            return;
        }
        if (m1247a(transition) || !m1250a((List) transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            transition.addTarget(arrayList.get(i2));
        }
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: a */
    public void mo574a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo580b((Object) transitionSet, arrayList, arrayList2);
        }
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: a */
    public boolean mo575a(Object obj) {
        return obj instanceof Transition;
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: b */
    public Object mo576b(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: b */
    public Object mo577b(Object obj, Object obj2, Object obj3) {
        Transition ordering = null;
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            ordering = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition != null) {
            ordering = transition;
        } else if (transition2 != null) {
            ordering = transition2;
        }
        if (transition3 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: b */
    public void mo578b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: b */
    public void mo579b(Object obj, final View view, final ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: android.support.v4.a.v.2
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                transition.removeListener(this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
            }
        });
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: b */
    public void mo580b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            for (int i = 0; i < transitionCount; i++) {
                mo580b((Object) transitionSet.getTransitionAt(i), arrayList, arrayList2);
            }
            return;
        }
        if (m1247a(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            transition.addTarget(arrayList2.get(i2));
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: c */
    public Object mo581c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: c */
    public void mo582c(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }
}
