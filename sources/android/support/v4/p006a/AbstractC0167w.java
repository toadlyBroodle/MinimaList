package android.support.v4.p006a;

import android.graphics.Rect;
import android.support.v4.p019j.C0246q;
import android.support.v4.p019j.C0248s;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: android.support.v4.a.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0167w {
    /* JADX INFO: renamed from: a */
    static String m1248a(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    protected static void m1249a(List<View> list, View view) {
        int size = list.size();
        if (m1251a(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!m1251a(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected static boolean m1250a(List list) {
        return list == null || list.isEmpty();
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1251a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo567a(Object obj, Object obj2, Object obj3);

    /* JADX INFO: renamed from: a */
    ArrayList<String> m1252a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C0246q.m1767m(view));
            C0246q.m1749a(view, (String) null);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: a */
    protected void m1253a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* JADX INFO: renamed from: a */
    void m1254a(View view, final ArrayList<View> arrayList, final ArrayList<View> arrayList2, final ArrayList<String> arrayList3, Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String strM1767m = C0246q.m1767m(view2);
            arrayList4.add(strM1767m);
            if (strM1767m != null) {
                C0246q.m1749a(view2, (String) null);
                String str = map.get(strM1767m);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i2))) {
                        C0246q.m1749a(arrayList2.get(i2), strM1767m);
                        break;
                    }
                    i2++;
                }
            }
        }
        ViewOnAttachStateChangeListenerC0139ae.m805a(view, new Runnable() { // from class: android.support.v4.a.w.1
            @Override // java.lang.Runnable
            public void run() {
                int i3 = 0;
                while (true) {
                    int i4 = i3;
                    if (i4 >= size) {
                        return;
                    }
                    C0246q.m1749a((View) arrayList2.get(i4), (String) arrayList3.get(i4));
                    C0246q.m1749a((View) arrayList.get(i4), (String) arrayList4.get(i4));
                    i3 = i4 + 1;
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    void m1255a(View view, final ArrayList<View> arrayList, final Map<String, String> map) {
        ViewOnAttachStateChangeListenerC0139ae.m805a(view, new Runnable() { // from class: android.support.v4.a.w.2
            @Override // java.lang.Runnable
            public void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view2 = (View) arrayList.get(i);
                    String strM1767m = C0246q.m1767m(view2);
                    if (strM1767m != null) {
                        C0246q.m1749a(view2, AbstractC0167w.m1248a((Map<String, String>) map, strM1767m));
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo568a(ViewGroup viewGroup, Object obj);

    /* JADX INFO: renamed from: a */
    void m1256a(ViewGroup viewGroup, final ArrayList<View> arrayList, final Map<String, String> map) {
        ViewOnAttachStateChangeListenerC0139ae.m805a(viewGroup, new Runnable() { // from class: android.support.v4.a.w.3
            @Override // java.lang.Runnable
            public void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    C0246q.m1749a(view, (String) map.get(C0246q.m1767m(view)));
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo569a(Object obj, Rect rect);

    /* JADX INFO: renamed from: a */
    public abstract void mo570a(Object obj, View view);

    /* JADX INFO: renamed from: a */
    public abstract void mo571a(Object obj, View view, ArrayList<View> arrayList);

    /* JADX INFO: renamed from: a */
    public abstract void mo572a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* JADX INFO: renamed from: a */
    public abstract void mo573a(Object obj, ArrayList<View> arrayList);

    /* JADX INFO: renamed from: a */
    public abstract void mo574a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* JADX INFO: renamed from: a */
    void m1257a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (!(view instanceof ViewGroup)) {
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (C0248s.m1835a(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m1257a(arrayList, viewGroup.getChildAt(i));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void m1258a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String strM1767m = C0246q.m1767m(view);
            if (strM1767m != null) {
                map.put(strM1767m, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m1258a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo575a(Object obj);

    /* JADX INFO: renamed from: b */
    public abstract Object mo576b(Object obj);

    /* JADX INFO: renamed from: b */
    public abstract Object mo577b(Object obj, Object obj2, Object obj3);

    /* JADX INFO: renamed from: b */
    public abstract void mo578b(Object obj, View view);

    /* JADX INFO: renamed from: b */
    public abstract void mo579b(Object obj, View view, ArrayList<View> arrayList);

    /* JADX INFO: renamed from: b */
    public abstract void mo580b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* JADX INFO: renamed from: c */
    public abstract Object mo581c(Object obj);

    /* JADX INFO: renamed from: c */
    public abstract void mo582c(Object obj, View view);
}
