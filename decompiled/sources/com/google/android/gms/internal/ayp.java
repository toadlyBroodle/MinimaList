package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ayp implements ayu {

    /* JADX INFO: renamed from: a */
    private final int f7587a;

    /* JADX INFO: renamed from: b */
    private final int f7588b;

    /* JADX INFO: renamed from: c */
    private final Map<String, Integer> f7589c;

    /* JADX INFO: renamed from: d */
    private final boolean f7590d;

    public ayp(int i, int i2, Map<String, Integer> map, boolean z) {
        this.f7587a = i;
        this.f7588b = i2;
        this.f7589c = (Map) C1221aj.m7065a(map);
        this.f7590d = z;
    }

    @Override // com.google.android.gms.internal.ayu
    /* JADX INFO: renamed from: a */
    public final boolean mo8696a(ayt aytVar) {
        Integer num;
        if (!this.f7590d) {
            return true;
        }
        if (this.f7588b > this.f7587a && (num = this.f7589c.get(aytVar.mo8699a())) != null && num.intValue() > this.f7587a) {
            return true;
        }
        return false;
    }
}
