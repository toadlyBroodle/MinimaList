package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.analytics.C0889d;
import com.google.android.gms.analytics.C0893h;

/* JADX INFO: loaded from: classes.dex */
public final class aju {

    /* JADX INFO: renamed from: a */
    private C0889d f6954a;

    /* JADX INFO: renamed from: b */
    private Context f6955b;

    /* JADX INFO: renamed from: c */
    private C0893h f6956c;

    public aju(Context context) {
        this.f6955b = context;
    }

    /* JADX INFO: renamed from: b */
    private final synchronized void m8065b(String str) {
        if (this.f6954a == null) {
            this.f6954a = C0889d.m5964a(this.f6955b);
            this.f6954a.m5972a(new ajv());
            this.f6956c = this.f6954a.m5966a(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0893h m8066a(String str) {
        m8065b(str);
        return this.f6956c;
    }
}
