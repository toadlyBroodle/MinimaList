package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.crash.FirebaseCrash;

/* JADX INFO: loaded from: classes.dex */
public final class bas extends bar {

    /* JADX INFO: renamed from: c */
    private final String f7697c;

    /* JADX INFO: renamed from: d */
    private final long f7698d;

    /* JADX INFO: renamed from: e */
    private final Bundle f7699e;

    public bas(Context context, FirebaseCrash.InterfaceC2215a interfaceC2215a, String str, long j, Bundle bundle) {
        super(context, interfaceC2215a);
        this.f7697c = str;
        this.f7698d = j;
        this.f7699e = bundle;
    }

    @Override // com.google.android.gms.internal.bar
    /* JADX INFO: renamed from: a */
    protected final String mo8785a() {
        return "Failed to log analytics event";
    }

    @Override // com.google.android.gms.internal.bar
    /* JADX INFO: renamed from: a */
    protected final void mo8786a(baw bawVar) {
        bawVar.mo8790a(this.f7697c, this.f7698d, this.f7699e);
    }

    @Override // com.google.android.gms.internal.bar, java.lang.Runnable
    public final /* bridge */ /* synthetic */ void run() {
        super.run();
    }
}
