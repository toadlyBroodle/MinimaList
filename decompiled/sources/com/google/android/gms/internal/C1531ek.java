package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0710au;

/* JADX INFO: renamed from: com.google.android.gms.internal.ek */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1531ek implements bue {

    /* JADX INFO: renamed from: a */
    private final Context f10504a;

    /* JADX INFO: renamed from: b */
    private final Object f10505b;

    /* JADX INFO: renamed from: c */
    private String f10506c;

    /* JADX INFO: renamed from: d */
    private boolean f10507d;

    public C1531ek(Context context, String str) {
        this.f10504a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f10506c = str;
        this.f10507d = false;
        this.f10505b = new Object();
    }

    @Override // com.google.android.gms.internal.bue
    /* JADX INFO: renamed from: a */
    public final void mo10264a(bud budVar) {
        m11222a(budVar.f9013a);
    }

    /* JADX INFO: renamed from: a */
    public final void m11221a(String str) {
        this.f10506c = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m11222a(boolean z) {
        if (C0710au.m5590z().m11236a(this.f10504a)) {
            synchronized (this.f10505b) {
                if (this.f10507d == z) {
                    return;
                }
                this.f10507d = z;
                if (TextUtils.isEmpty(this.f10506c)) {
                    return;
                }
                if (this.f10507d) {
                    C0710au.m5590z().m11233a(this.f10504a, this.f10506c);
                } else {
                    C0710au.m5590z().m11237b(this.f10504a, this.f10506c);
                }
            }
        }
    }
}
