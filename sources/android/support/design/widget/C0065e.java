package android.support.design.widget;

import android.support.v4.p018i.C0217k;
import android.support.v4.p018i.C0219m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: android.support.design.widget.e */
/* JADX INFO: loaded from: classes.dex */
final class C0065e<T> {

    /* JADX INFO: renamed from: a */
    private final C0217k.a<ArrayList<T>> f383a = new C0217k.b(10);

    /* JADX INFO: renamed from: b */
    private final C0219m<T, ArrayList<T>> f384b = new C0219m<>();

    /* JADX INFO: renamed from: c */
    private final ArrayList<T> f385c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    private final HashSet<T> f386d = new HashSet<>();

    C0065e() {
    }

    /* JADX INFO: renamed from: a */
    private void m466a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.f384b.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m466a(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }

    /* JADX INFO: renamed from: a */
    private void m467a(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f383a.mo1570a(arrayList);
    }

    /* JADX INFO: renamed from: c */
    private ArrayList<T> m468c() {
        ArrayList<T> arrayListMo1569a = this.f383a.mo1569a();
        return arrayListMo1569a == null ? new ArrayList<>() : arrayListMo1569a;
    }

    /* JADX INFO: renamed from: a */
    void m469a() {
        int size = this.f384b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> arrayListM1584c = this.f384b.m1584c(i);
            if (arrayListM1584c != null) {
                m467a((ArrayList) arrayListM1584c);
            }
        }
        this.f384b.clear();
    }

    /* JADX INFO: renamed from: a */
    void m470a(T t) {
        if (this.f384b.containsKey(t)) {
            return;
        }
        this.f384b.put(t, null);
    }

    /* JADX INFO: renamed from: a */
    void m471a(T t, T t2) {
        if (!this.f384b.containsKey(t) || !this.f384b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayListM468c = this.f384b.get(t);
        if (arrayListM468c == null) {
            arrayListM468c = m468c();
            this.f384b.put(t, arrayListM468c);
        }
        arrayListM468c.add(t2);
    }

    /* JADX INFO: renamed from: b */
    ArrayList<T> m472b() {
        this.f385c.clear();
        this.f386d.clear();
        int size = this.f384b.size();
        for (int i = 0; i < size; i++) {
            m466a(this.f384b.m1583b(i), this.f385c, this.f386d);
        }
        return this.f385c;
    }

    /* JADX INFO: renamed from: b */
    boolean m473b(T t) {
        return this.f384b.containsKey(t);
    }

    /* JADX INFO: renamed from: c */
    List m474c(T t) {
        return this.f384b.get(t);
    }

    /* JADX INFO: renamed from: d */
    List<T> m475d(T t) {
        ArrayList arrayList = null;
        int size = this.f384b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> arrayListM1584c = this.f384b.m1584c(i);
            if (arrayListM1584c != null && arrayListM1584c.contains(t)) {
                ArrayList arrayList2 = arrayList == null ? new ArrayList() : arrayList;
                arrayList2.add(this.f384b.m1583b(i));
                arrayList = arrayList2;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    boolean m476e(T t) {
        int size = this.f384b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> arrayListM1584c = this.f384b.m1584c(i);
            if (arrayListM1584c != null && arrayListM1584c.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
