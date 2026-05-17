package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.AbstractC0901p;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.oz */
/* JADX INFO: loaded from: classes.dex */
public final class C1816oz extends AbstractC0901p<C1816oz> {

    /* JADX INFO: renamed from: a */
    public String f11254a;

    /* JADX INFO: renamed from: b */
    public boolean f11255b;

    @Override // com.google.android.gms.analytics.AbstractC0901p
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo6068a(AbstractC0901p abstractC0901p) {
        C1816oz c1816oz = (C1816oz) abstractC0901p;
        if (!TextUtils.isEmpty(this.f11254a)) {
            c1816oz.f11254a = this.f11254a;
        }
        if (this.f11255b) {
            c1816oz.f11255b = this.f11255b;
        }
    }

    public final String toString() {
        HashMap map = new HashMap();
        map.put("description", this.f11254a);
        map.put("fatal", Boolean.valueOf(this.f11255b));
        return m6065a((Object) map);
    }
}
