package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.qh */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1852qh {
    NONE,
    BATCH_BY_SESSION,
    BATCH_BY_TIME,
    BATCH_BY_BRUTE_FORCE,
    BATCH_BY_COUNT,
    BATCH_BY_SIZE;

    /* JADX INFO: renamed from: a */
    public static EnumC1852qh m12149a(String str) {
        return "BATCH_BY_SESSION".equalsIgnoreCase(str) ? BATCH_BY_SESSION : "BATCH_BY_TIME".equalsIgnoreCase(str) ? BATCH_BY_TIME : "BATCH_BY_BRUTE_FORCE".equalsIgnoreCase(str) ? BATCH_BY_BRUTE_FORCE : "BATCH_BY_COUNT".equalsIgnoreCase(str) ? BATCH_BY_COUNT : "BATCH_BY_SIZE".equalsIgnoreCase(str) ? BATCH_BY_SIZE : NONE;
    }
}
