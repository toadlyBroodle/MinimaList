package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.AbstractC0901p;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.or */
/* JADX INFO: loaded from: classes.dex */
public final class C1808or extends AbstractC0901p<C1808or> {

    /* JADX INFO: renamed from: a */
    private String f11223a;

    /* JADX INFO: renamed from: b */
    private String f11224b;

    /* JADX INFO: renamed from: c */
    private String f11225c;

    /* JADX INFO: renamed from: d */
    private String f11226d;

    /* JADX INFO: renamed from: a */
    public final String m11933a() {
        return this.f11223a;
    }

    @Override // com.google.android.gms.analytics.AbstractC0901p
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void mo6068a(C1808or c1808or) {
        if (!TextUtils.isEmpty(this.f11223a)) {
            c1808or.f11223a = this.f11223a;
        }
        if (!TextUtils.isEmpty(this.f11224b)) {
            c1808or.f11224b = this.f11224b;
        }
        if (!TextUtils.isEmpty(this.f11225c)) {
            c1808or.f11225c = this.f11225c;
        }
        if (TextUtils.isEmpty(this.f11226d)) {
            return;
        }
        c1808or.f11226d = this.f11226d;
    }

    /* JADX INFO: renamed from: a */
    public final void m11935a(String str) {
        this.f11223a = str;
    }

    /* JADX INFO: renamed from: b */
    public final String m11936b() {
        return this.f11224b;
    }

    /* JADX INFO: renamed from: b */
    public final void m11937b(String str) {
        this.f11224b = str;
    }

    /* JADX INFO: renamed from: c */
    public final String m11938c() {
        return this.f11225c;
    }

    /* JADX INFO: renamed from: c */
    public final void m11939c(String str) {
        this.f11225c = str;
    }

    /* JADX INFO: renamed from: d */
    public final String m11940d() {
        return this.f11226d;
    }

    /* JADX INFO: renamed from: d */
    public final void m11941d(String str) {
        this.f11226d = str;
    }

    public final String toString() {
        HashMap map = new HashMap();
        map.put("appName", this.f11223a);
        map.put("appVersion", this.f11224b);
        map.put("appId", this.f11225c);
        map.put("appInstallerId", this.f11226d);
        return m6065a((Object) map);
    }
}
