package android.support.v7.p027d;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: android.support.v7.d.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0373d {

    /* JADX INFO: renamed from: a */
    final Bundle f2149a;

    /* JADX INFO: renamed from: b */
    List<C0370a> f2150b;

    /* JADX INFO: renamed from: android.support.v7.d.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final Bundle f2151a = new Bundle();

        /* JADX INFO: renamed from: b */
        private ArrayList<C0370a> f2152b;

        /* JADX INFO: renamed from: a */
        public a m2877a(C0370a c0370a) {
            if (c0370a == null) {
                throw new IllegalArgumentException("route must not be null");
            }
            if (this.f2152b == null) {
                this.f2152b = new ArrayList<>();
            } else if (this.f2152b.contains(c0370a)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            this.f2152b.add(c0370a);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C0373d m2878a() {
            if (this.f2152b != null) {
                int size = this.f2152b.size();
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(this.f2152b.get(i).m2830x());
                }
                this.f2151a.putParcelableArrayList("routes", arrayList);
            }
            return new C0373d(this.f2151a, this.f2152b);
        }
    }

    C0373d(Bundle bundle, List<C0370a> list) {
        this.f2149a = bundle;
        this.f2150b = list;
    }

    /* JADX INFO: renamed from: a */
    public static C0373d m2873a(Bundle bundle) {
        if (bundle != null) {
            return new C0373d(bundle, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public List<C0370a> m2874a() {
        m2875b();
        return this.f2150b;
    }

    /* JADX INFO: renamed from: b */
    void m2875b() {
        if (this.f2150b == null) {
            ArrayList parcelableArrayList = this.f2149a.getParcelableArrayList("routes");
            if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                this.f2150b = Collections.emptyList();
                return;
            }
            int size = parcelableArrayList.size();
            this.f2150b = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                this.f2150b.add(C0370a.m2806a((Bundle) parcelableArrayList.get(i)));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m2876c() {
        m2875b();
        int size = this.f2150b.size();
        for (int i = 0; i < size; i++) {
            C0370a c0370a = this.f2150b.get(i);
            if (c0370a == null || !c0370a.m2829w()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaRouteProviderDescriptor{ ");
        sb.append("routes=").append(Arrays.toString(m2874a().toArray()));
        sb.append(", isValid=").append(m2876c());
        sb.append(" }");
        return sb.toString();
    }
}
