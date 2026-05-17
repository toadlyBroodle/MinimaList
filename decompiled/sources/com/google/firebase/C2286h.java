package com.google.firebase;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC1133bu;

/* JADX INFO: renamed from: com.google.firebase.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2286h implements InterfaceC1133bu {
    @Override // com.google.android.gms.common.api.internal.InterfaceC1133bu
    /* JADX INFO: renamed from: a */
    public final Exception mo6901a(Status status) {
        return status.m6627e() == 8 ? new C2214c(status.m6628f()) : new C2146a(status.m6628f());
    }
}
