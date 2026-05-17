package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1262i {

    /* JADX INFO: renamed from: a */
    private final String f5952a;

    /* JADX INFO: renamed from: b */
    private final String f5953b;

    /* JADX INFO: renamed from: c */
    private final ComponentName f5954c = null;

    /* JADX INFO: renamed from: d */
    private final int f5955d;

    public C1262i(String str, String str2, int i) {
        this.f5952a = C1221aj.m7067a(str);
        this.f5953b = C1221aj.m7067a(str2);
        this.f5955d = i;
    }

    /* JADX INFO: renamed from: a */
    public final String m7189a() {
        return this.f5953b;
    }

    /* JADX INFO: renamed from: b */
    public final ComponentName m7190b() {
        return this.f5954c;
    }

    /* JADX INFO: renamed from: c */
    public final int m7191c() {
        return this.f5955d;
    }

    /* JADX INFO: renamed from: d */
    public final Intent m7192d() {
        return this.f5952a != null ? new Intent(this.f5952a).setPackage(this.f5953b) : new Intent().setComponent(this.f5954c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1262i)) {
            return false;
        }
        C1262i c1262i = (C1262i) obj;
        return C1218ag.m7063a(this.f5952a, c1262i.f5952a) && C1218ag.m7063a(this.f5953b, c1262i.f5953b) && C1218ag.m7063a(this.f5954c, c1262i.f5954c) && this.f5955d == c1262i.f5955d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5952a, this.f5953b, this.f5954c, Integer.valueOf(this.f5955d)});
    }

    public final String toString() {
        return this.f5952a == null ? this.f5954c.flattenToString() : this.f5952a;
    }
}
