package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class azz {
    /* JADX INFO: renamed from: a */
    public static String m8751a(String str) {
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
            if (objInvoke != null && String.class.isAssignableFrom(objInvoke.getClass())) {
                return (String) objInvoke;
            }
        } catch (Exception e) {
        }
        return null;
    }
}
