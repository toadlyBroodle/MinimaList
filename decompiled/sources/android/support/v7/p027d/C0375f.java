package android.support.v7.p027d;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: android.support.v7.d.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0375f {

    /* JADX INFO: renamed from: b */
    public static final C0375f f2153b = new C0375f(new Bundle(), null);

    /* JADX INFO: renamed from: a */
    List<String> f2154a;

    /* JADX INFO: renamed from: c */
    private final Bundle f2155c;

    /* JADX INFO: renamed from: android.support.v7.d.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private ArrayList<String> f2156a;

        public a() {
        }

        public a(C0375f c0375f) {
            if (c0375f == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            c0375f.m2884b();
            if (c0375f.f2154a.isEmpty()) {
                return;
            }
            this.f2156a = new ArrayList<>(c0375f.f2154a);
        }

        /* JADX INFO: renamed from: a */
        public a m2888a(C0375f c0375f) {
            if (c0375f == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            m2890a(c0375f.m2881a());
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m2889a(String str) {
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            }
            if (this.f2156a == null) {
                this.f2156a = new ArrayList<>();
            }
            if (!this.f2156a.contains(str)) {
                this.f2156a.add(str);
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m2890a(Collection<String> collection) {
            if (collection == null) {
                throw new IllegalArgumentException("categories must not be null");
            }
            if (!collection.isEmpty()) {
                Iterator<String> it = collection.iterator();
                while (it.hasNext()) {
                    m2889a(it.next());
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C0375f m2891a() {
            if (this.f2156a == null) {
                return C0375f.f2153b;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", this.f2156a);
            return new C0375f(bundle, this.f2156a);
        }
    }

    C0375f(Bundle bundle, List<String> list) {
        this.f2155c = bundle;
        this.f2154a = list;
    }

    /* JADX INFO: renamed from: a */
    public static C0375f m2880a(Bundle bundle) {
        if (bundle != null) {
            return new C0375f(bundle, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public List<String> m2881a() {
        m2884b();
        return this.f2154a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m2882a(C0375f c0375f) {
        if (c0375f == null) {
            return false;
        }
        m2884b();
        c0375f.m2884b();
        return this.f2154a.containsAll(c0375f.f2154a);
    }

    /* JADX INFO: renamed from: a */
    public boolean m2883a(List<IntentFilter> list) {
        if (list != null) {
            m2884b();
            int size = this.f2154a.size();
            if (size != 0) {
                int size2 = list.size();
                for (int i = 0; i < size2; i++) {
                    IntentFilter intentFilter = list.get(i);
                    if (intentFilter != null) {
                        for (int i2 = 0; i2 < size; i2++) {
                            if (intentFilter.hasCategory(this.f2154a.get(i2))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    void m2884b() {
        if (this.f2154a == null) {
            this.f2154a = this.f2155c.getStringArrayList("controlCategories");
            if (this.f2154a == null || this.f2154a.isEmpty()) {
                this.f2154a = Collections.emptyList();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m2885c() {
        m2884b();
        return this.f2154a.isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public boolean m2886d() {
        m2884b();
        return !this.f2154a.contains(null);
    }

    /* JADX INFO: renamed from: e */
    public Bundle m2887e() {
        return this.f2155c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0375f)) {
            return false;
        }
        C0375f c0375f = (C0375f) obj;
        m2884b();
        c0375f.m2884b();
        return this.f2154a.equals(c0375f.f2154a);
    }

    public int hashCode() {
        m2884b();
        return this.f2154a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaRouteSelector{ ");
        sb.append("controlCategories=").append(Arrays.toString(m2881a().toArray()));
        sb.append(" }");
        return sb.toString();
    }
}
