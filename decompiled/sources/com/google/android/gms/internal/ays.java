package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ays extends bnq {

    /* JADX INFO: renamed from: d */
    private final Activity f7594d;

    /* JADX INFO: renamed from: e */
    private final View f7595e;

    public ays(arz arzVar, String str, String str2, C1937tl c1937tl, int i, int i2, View view, Activity activity) {
        super(arzVar, str, str2, c1937tl, i, 62);
        this.f7595e = view;
        this.f7594d = activity;
    }

    @Override // com.google.android.gms.internal.bnq
    /* JADX INFO: renamed from: a */
    protected final void mo8698a() {
        if (this.f7595e == null) {
            return;
        }
        long[] jArr = (long[]) this.f8493c.invoke(null, this.f7595e, this.f7594d);
        synchronized (this.f8492b) {
            this.f8492b.f11560Q = Long.valueOf(jArr[0]);
            this.f8492b.f11561R = Long.valueOf(jArr[1]);
        }
    }
}
