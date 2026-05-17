package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.AbstractC0901p;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.pc */
/* JADX INFO: loaded from: classes.dex */
public final class C1820pc extends AbstractC0901p<C1820pc> {

    /* JADX INFO: renamed from: a */
    public String f11274a;

    /* JADX INFO: renamed from: b */
    public String f11275b;

    /* JADX INFO: renamed from: c */
    public String f11276c;

    @Override // com.google.android.gms.analytics.AbstractC0901p
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo6068a(AbstractC0901p abstractC0901p) {
        C1820pc c1820pc = (C1820pc) abstractC0901p;
        if (!TextUtils.isEmpty(this.f11274a)) {
            c1820pc.f11274a = this.f11274a;
        }
        if (!TextUtils.isEmpty(this.f11275b)) {
            c1820pc.f11275b = this.f11275b;
        }
        if (TextUtils.isEmpty(this.f11276c)) {
            return;
        }
        c1820pc.f11276c = this.f11276c;
    }

    public final String toString() {
        HashMap map = new HashMap();
        map.put("network", this.f11274a);
        map.put("action", this.f11275b);
        map.put("target", this.f11276c);
        return m6065a((Object) map);
    }
}
