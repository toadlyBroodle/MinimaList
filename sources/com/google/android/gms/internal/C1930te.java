package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.te */
/* JADX INFO: loaded from: classes.dex */
public final class C1930te {
    /* JADX INFO: renamed from: a */
    public static int m12310a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 1000:
                return i;
            default:
                throw new IllegalArgumentException(new StringBuilder(43).append(i).append(" is not a valid enum EnumBoolean").toString());
        }
    }
}
