package com.google.android.gms.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class bor {

    /* JADX INFO: renamed from: d */
    private final Map<Object, Object> f8548d;

    /* JADX INFO: renamed from: b */
    private static volatile boolean f8546b = false;

    /* JADX INFO: renamed from: c */
    private static final Class<?> f8547c = m9875b();

    /* JADX INFO: renamed from: a */
    static final bor f8545a = new bor(true);

    bor() {
        this.f8548d = new HashMap();
    }

    private bor(boolean z) {
        this.f8548d = Collections.emptyMap();
    }

    /* JADX INFO: renamed from: a */
    public static bor m9874a() {
        return boq.m9871a();
    }

    /* JADX INFO: renamed from: b */
    private static Class<?> m9875b() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
}
