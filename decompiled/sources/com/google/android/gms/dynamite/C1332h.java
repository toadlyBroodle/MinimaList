package com.google.android.gms.dynamite;

import dalvik.system.PathClassLoader;

/* JADX INFO: renamed from: com.google.android.gms.dynamite.h */
/* JADX INFO: loaded from: classes.dex */
final class C1332h extends PathClassLoader {
    C1332h(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    protected final Class<?> loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException e) {
            }
        }
        return super.loadClass(str, z);
    }
}
