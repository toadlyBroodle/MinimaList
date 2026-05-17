package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class aye {
    /* JADX INFO: renamed from: a */
    public static boolean m8683a() {
        try {
            Class.forName("android.app.Application", false, null);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
