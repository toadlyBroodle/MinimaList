package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.AbstractC0901p;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.pd */
/* JADX INFO: loaded from: classes.dex */
public final class C1821pd extends AbstractC0901p<C1821pd> {

    /* JADX INFO: renamed from: a */
    public String f11277a;

    /* JADX INFO: renamed from: b */
    public long f11278b;

    /* JADX INFO: renamed from: c */
    public String f11279c;

    /* JADX INFO: renamed from: d */
    public String f11280d;

    @Override // com.google.android.gms.analytics.AbstractC0901p
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo6068a(AbstractC0901p abstractC0901p) {
        C1821pd c1821pd = (C1821pd) abstractC0901p;
        if (!TextUtils.isEmpty(this.f11277a)) {
            c1821pd.f11277a = this.f11277a;
        }
        if (this.f11278b != 0) {
            c1821pd.f11278b = this.f11278b;
        }
        if (!TextUtils.isEmpty(this.f11279c)) {
            c1821pd.f11279c = this.f11279c;
        }
        if (TextUtils.isEmpty(this.f11280d)) {
            return;
        }
        c1821pd.f11280d = this.f11280d;
    }

    public final String toString() {
        HashMap map = new HashMap();
        map.put("variableName", this.f11277a);
        map.put("timeInMillis", Long.valueOf(this.f11278b));
        map.put("category", this.f11279c);
        map.put("label", this.f11280d);
        return m6065a((Object) map);
    }
}
