package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.AbstractC0901p;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ow */
/* JADX INFO: loaded from: classes.dex */
public final class C1813ow extends AbstractC0901p<C1813ow> {

    /* JADX INFO: renamed from: a */
    public int f11240a;

    /* JADX INFO: renamed from: b */
    public int f11241b;

    /* JADX INFO: renamed from: c */
    public int f11242c;

    /* JADX INFO: renamed from: d */
    public int f11243d;

    /* JADX INFO: renamed from: e */
    public int f11244e;

    /* JADX INFO: renamed from: f */
    private String f11245f;

    /* JADX INFO: renamed from: a */
    public final String m11966a() {
        return this.f11245f;
    }

    @Override // com.google.android.gms.analytics.AbstractC0901p
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo6068a(AbstractC0901p abstractC0901p) {
        C1813ow c1813ow = (C1813ow) abstractC0901p;
        if (this.f11240a != 0) {
            c1813ow.f11240a = this.f11240a;
        }
        if (this.f11241b != 0) {
            c1813ow.f11241b = this.f11241b;
        }
        if (this.f11242c != 0) {
            c1813ow.f11242c = this.f11242c;
        }
        if (this.f11243d != 0) {
            c1813ow.f11243d = this.f11243d;
        }
        if (this.f11244e != 0) {
            c1813ow.f11244e = this.f11244e;
        }
        if (TextUtils.isEmpty(this.f11245f)) {
            return;
        }
        c1813ow.f11245f = this.f11245f;
    }

    /* JADX INFO: renamed from: a */
    public final void m11967a(String str) {
        this.f11245f = str;
    }

    public final String toString() {
        HashMap map = new HashMap();
        map.put("language", this.f11245f);
        map.put("screenColors", Integer.valueOf(this.f11240a));
        map.put("screenWidth", Integer.valueOf(this.f11241b));
        map.put("screenHeight", Integer.valueOf(this.f11242c));
        map.put("viewportWidth", Integer.valueOf(this.f11243d));
        map.put("viewportHeight", Integer.valueOf(this.f11244e));
        return m6065a((Object) map);
    }
}
