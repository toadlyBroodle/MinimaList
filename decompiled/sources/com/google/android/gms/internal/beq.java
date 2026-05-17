package com.google.android.gms.internal;

import com.google.android.gms.ads.p046c.C0677a;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class beq extends bnq {
    public beq(arz arzVar, String str, String str2, C1937tl c1937tl, int i, int i2) {
        super(arzVar, str, str2, c1937tl, i, 24);
    }

    /* JADX INFO: renamed from: c */
    private final void m9111c() {
        C0677a c0677aM8263m = this.f8491a.m8263m();
        if (c0677aM8263m == null) {
            return;
        }
        try {
            C0677a.a aVarM5405b = c0677aM8263m.m5405b();
            String strM8324a = atq.m8324a(aVarM5405b.m5408a());
            if (strM8324a != null) {
                synchronized (this.f8492b) {
                    this.f8492b.f11562S = strM8324a;
                    this.f8492b.f11564U = Boolean.valueOf(aVarM5405b.m5409b());
                    this.f8492b.f11563T = 5;
                }
            }
        } catch (IOException e) {
        }
    }

    @Override // com.google.android.gms.internal.bnq
    /* JADX INFO: renamed from: a */
    protected final void mo8698a() {
        if (this.f8491a.m8257g()) {
            m9111c();
            return;
        }
        synchronized (this.f8492b) {
            this.f8492b.f11562S = (String) this.f8493c.invoke(null, this.f8491a.m8247a());
        }
    }

    @Override // com.google.android.gms.internal.bnq
    /* JADX INFO: renamed from: b */
    public final Void call() {
        if (this.f8491a.m8252b()) {
            return super.call();
        }
        if (this.f8491a.m8257g()) {
            m9111c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.bnq, java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return call();
    }
}
