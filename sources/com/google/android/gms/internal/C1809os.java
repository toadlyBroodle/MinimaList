package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.AbstractC0901p;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.os */
/* JADX INFO: loaded from: classes.dex */
public final class C1809os extends AbstractC0901p<C1809os> {

    /* JADX INFO: renamed from: a */
    private String f11227a;

    /* JADX INFO: renamed from: b */
    private String f11228b;

    /* JADX INFO: renamed from: c */
    private String f11229c;

    /* JADX INFO: renamed from: d */
    private String f11230d;

    /* JADX INFO: renamed from: e */
    private String f11231e;

    /* JADX INFO: renamed from: f */
    private String f11232f;

    /* JADX INFO: renamed from: g */
    private String f11233g;

    /* JADX INFO: renamed from: h */
    private String f11234h;

    /* JADX INFO: renamed from: i */
    private String f11235i;

    /* JADX INFO: renamed from: j */
    private String f11236j;

    /* JADX INFO: renamed from: a */
    public final String m11942a() {
        return this.f11227a;
    }

    @Override // com.google.android.gms.analytics.AbstractC0901p
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo6068a(AbstractC0901p abstractC0901p) {
        C1809os c1809os = (C1809os) abstractC0901p;
        if (!TextUtils.isEmpty(this.f11227a)) {
            c1809os.f11227a = this.f11227a;
        }
        if (!TextUtils.isEmpty(this.f11228b)) {
            c1809os.f11228b = this.f11228b;
        }
        if (!TextUtils.isEmpty(this.f11229c)) {
            c1809os.f11229c = this.f11229c;
        }
        if (!TextUtils.isEmpty(this.f11230d)) {
            c1809os.f11230d = this.f11230d;
        }
        if (!TextUtils.isEmpty(this.f11231e)) {
            c1809os.f11231e = this.f11231e;
        }
        if (!TextUtils.isEmpty(this.f11232f)) {
            c1809os.f11232f = this.f11232f;
        }
        if (!TextUtils.isEmpty(this.f11233g)) {
            c1809os.f11233g = this.f11233g;
        }
        if (!TextUtils.isEmpty(this.f11234h)) {
            c1809os.f11234h = this.f11234h;
        }
        if (!TextUtils.isEmpty(this.f11235i)) {
            c1809os.f11235i = this.f11235i;
        }
        if (TextUtils.isEmpty(this.f11236j)) {
            return;
        }
        c1809os.f11236j = this.f11236j;
    }

    /* JADX INFO: renamed from: a */
    public final void m11943a(String str) {
        this.f11227a = str;
    }

    /* JADX INFO: renamed from: b */
    public final String m11944b() {
        return this.f11228b;
    }

    /* JADX INFO: renamed from: b */
    public final void m11945b(String str) {
        this.f11228b = str;
    }

    /* JADX INFO: renamed from: c */
    public final String m11946c() {
        return this.f11229c;
    }

    /* JADX INFO: renamed from: c */
    public final void m11947c(String str) {
        this.f11229c = str;
    }

    /* JADX INFO: renamed from: d */
    public final String m11948d() {
        return this.f11230d;
    }

    /* JADX INFO: renamed from: d */
    public final void m11949d(String str) {
        this.f11230d = str;
    }

    /* JADX INFO: renamed from: e */
    public final String m11950e() {
        return this.f11231e;
    }

    /* JADX INFO: renamed from: e */
    public final void m11951e(String str) {
        this.f11231e = str;
    }

    /* JADX INFO: renamed from: f */
    public final String m11952f() {
        return this.f11232f;
    }

    /* JADX INFO: renamed from: f */
    public final void m11953f(String str) {
        this.f11232f = str;
    }

    /* JADX INFO: renamed from: g */
    public final String m11954g() {
        return this.f11233g;
    }

    /* JADX INFO: renamed from: g */
    public final void m11955g(String str) {
        this.f11233g = str;
    }

    /* JADX INFO: renamed from: h */
    public final String m11956h() {
        return this.f11234h;
    }

    /* JADX INFO: renamed from: h */
    public final void m11957h(String str) {
        this.f11234h = str;
    }

    /* JADX INFO: renamed from: i */
    public final String m11958i() {
        return this.f11235i;
    }

    /* JADX INFO: renamed from: i */
    public final void m11959i(String str) {
        this.f11235i = str;
    }

    /* JADX INFO: renamed from: j */
    public final String m11960j() {
        return this.f11236j;
    }

    /* JADX INFO: renamed from: j */
    public final void m11961j(String str) {
        this.f11236j = str;
    }

    public final String toString() {
        HashMap map = new HashMap();
        map.put("name", this.f11227a);
        map.put("source", this.f11228b);
        map.put("medium", this.f11229c);
        map.put("keyword", this.f11230d);
        map.put("content", this.f11231e);
        map.put("id", this.f11232f);
        map.put("adNetworkId", this.f11233g);
        map.put("gclid", this.f11234h);
        map.put("dclid", this.f11235i);
        map.put("aclid", this.f11236j);
        return m6065a((Object) map);
    }
}
