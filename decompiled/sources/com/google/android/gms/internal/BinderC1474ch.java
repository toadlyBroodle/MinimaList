package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1218ag;

/* JADX INFO: renamed from: com.google.android.gms.internal.ch */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class BinderC1474ch extends AbstractBinderC1480cn {

    /* JADX INFO: renamed from: a */
    private final String f9986a;

    /* JADX INFO: renamed from: b */
    private final int f9987b;

    public BinderC1474ch(String str, int i) {
        this.f9986a = str;
        this.f9987b = i;
    }

    @Override // com.google.android.gms.internal.InterfaceC1479cm
    /* JADX INFO: renamed from: a */
    public final String mo10851a() {
        return this.f9986a;
    }

    @Override // com.google.android.gms.internal.InterfaceC1479cm
    /* JADX INFO: renamed from: b */
    public final int mo10852b() {
        return this.f9987b;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BinderC1474ch)) {
            return false;
        }
        BinderC1474ch binderC1474ch = (BinderC1474ch) obj;
        return C1218ag.m7063a(this.f9986a, binderC1474ch.f9986a) && C1218ag.m7063a(Integer.valueOf(this.f9987b), Integer.valueOf(binderC1474ch.f9987b));
    }
}
