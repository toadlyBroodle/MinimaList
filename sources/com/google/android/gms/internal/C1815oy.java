package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.AbstractC0901p;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.oy */
/* JADX INFO: loaded from: classes.dex */
public final class C1815oy extends AbstractC0901p<C1815oy> {

    /* JADX INFO: renamed from: a */
    private String f11250a;

    /* JADX INFO: renamed from: b */
    private String f11251b;

    /* JADX INFO: renamed from: c */
    private String f11252c;

    /* JADX INFO: renamed from: d */
    private long f11253d;

    /* JADX INFO: renamed from: a */
    public final String m11972a() {
        return this.f11250a;
    }

    @Override // com.google.android.gms.analytics.AbstractC0901p
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo6068a(AbstractC0901p abstractC0901p) {
        C1815oy c1815oy = (C1815oy) abstractC0901p;
        if (!TextUtils.isEmpty(this.f11250a)) {
            c1815oy.f11250a = this.f11250a;
        }
        if (!TextUtils.isEmpty(this.f11251b)) {
            c1815oy.f11251b = this.f11251b;
        }
        if (!TextUtils.isEmpty(this.f11252c)) {
            c1815oy.f11252c = this.f11252c;
        }
        if (this.f11253d != 0) {
            c1815oy.f11253d = this.f11253d;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m11973b() {
        return this.f11251b;
    }

    /* JADX INFO: renamed from: c */
    public final String m11974c() {
        return this.f11252c;
    }

    /* JADX INFO: renamed from: d */
    public final long m11975d() {
        return this.f11253d;
    }

    public final String toString() {
        HashMap map = new HashMap();
        map.put("category", this.f11250a);
        map.put("action", this.f11251b);
        map.put("label", this.f11252c);
        map.put("value", Long.valueOf(this.f11253d));
        return m6065a((Object) map);
    }
}
