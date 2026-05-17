package com.google.android.gms.ads.internal.p048js;

import com.google.android.gms.internal.C1704kv;
import com.google.android.gms.internal.C1706kx;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.js.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0796b extends C1706kx<InterfaceC0805k> {

    /* JADX INFO: renamed from: a */
    private final Object f4709a = new Object();

    /* JADX INFO: renamed from: b */
    private final C0800f f4710b;

    /* JADX INFO: renamed from: c */
    private boolean f4711c;

    public C0796b(C0800f c0800f) {
        this.f4710b = c0800f;
    }

    /* JADX INFO: renamed from: a */
    public final void m5719a() {
        synchronized (this.f4709a) {
            if (this.f4711c) {
                return;
            }
            this.f4711c = true;
            mo11659a(new C0797c(this), new C1704kv());
            mo11659a(new C0798d(this), new C0799e(this));
        }
    }
}
