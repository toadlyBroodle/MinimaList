package com.google.firebase.p053a;

import android.content.Context;
import com.google.firebase.C2213b;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.firebase.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2150c {

    /* JADX INFO: renamed from: a */
    private static final AtomicReference<C2150c> f12775a = new AtomicReference<>();

    private C2150c(Context context) {
    }

    /* JADX INFO: renamed from: a */
    public static C2150c m12823a() {
        return f12775a.get();
    }

    /* JADX INFO: renamed from: a */
    public static C2150c m12824a(Context context) {
        f12775a.compareAndSet(null, new C2150c(context));
        return f12775a.get();
    }

    /* JADX INFO: renamed from: a */
    public static void m12825a(C2213b c2213b) {
    }

    /* JADX INFO: renamed from: b */
    public static Set<String> m12826b() {
        return Collections.emptySet();
    }
}
