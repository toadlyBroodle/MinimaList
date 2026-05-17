package com.google.android.gms.internal;

import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class azl extends ayo implements C1074a.a.c {

    /* JADX INFO: renamed from: b */
    private final String f7611b;

    private azl(String str) {
        this.f7611b = C1221aj.m7068a(str, (Object) "A valid API key must be provided");
    }

    /* synthetic */ azl(String str, azk azkVar) {
        this(str);
    }

    @Override // com.google.android.gms.internal.ayo
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ayo clone() {
        return (azl) clone();
    }

    /* JADX INFO: renamed from: b */
    public final String m8735b() {
        return this.f7611b;
    }

    @Override // com.google.android.gms.internal.ayo
    public final /* synthetic */ Object clone() {
        return new azm(this.f7611b).m8736a();
    }
}
