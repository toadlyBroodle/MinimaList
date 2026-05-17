package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.Map;

/* JADX INFO: renamed from: com.google.firebase.auth.internal.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2180c {

    /* JADX INFO: renamed from: a */
    private final String f12802a;

    /* JADX INFO: renamed from: b */
    private final Map<String, Object> f12803b;

    /* JADX INFO: renamed from: c */
    private boolean f12804c;

    public C2180c(String str, String str2, boolean z) {
        C1221aj.m7067a(str);
        C1221aj.m7067a(str2);
        this.f12802a = str;
        this.f12803b = C2190m.m12885a(str2);
        this.f12804c = z;
    }

    public C2180c(boolean z) {
        this.f12804c = z;
        this.f12802a = null;
        this.f12803b = null;
    }
}
