package com.google.firebase.p053a;

import com.google.android.gms.common.internal.C1218ag;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.firebase.a.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2151d {

    /* JADX INFO: renamed from: a */
    private String f12776a;

    public C2151d(String str) {
        this.f12776a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m12827a() {
        return this.f12776a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2151d) {
            return C1218ag.m7063a(this.f12776a, ((C2151d) obj).f12776a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12776a});
    }

    public final String toString() {
        return C1218ag.m7062a(this).m7064a("token", this.f12776a).toString();
    }
}
