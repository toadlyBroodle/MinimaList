package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C1075b;
import com.google.android.gms.common.api.C1192j;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1279z {
    /* JADX INFO: renamed from: a */
    public static C1075b m7219a(Status status) {
        return status.m6625c() ? new C1192j(status) : new C1075b(status);
    }
}
