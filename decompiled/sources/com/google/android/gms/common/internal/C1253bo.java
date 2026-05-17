package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.bo */
/* JADX INFO: loaded from: classes.dex */
final class C1253bo extends AbstractDialogInterfaceOnClickListenerC1252bn {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Intent f5921a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ Activity f5922b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ int f5923c;

    C1253bo(Intent intent, Activity activity, int i) {
        this.f5921a = intent;
        this.f5922b = activity;
        this.f5923c = i;
    }

    @Override // com.google.android.gms.common.internal.AbstractDialogInterfaceOnClickListenerC1252bn
    /* JADX INFO: renamed from: a */
    public final void mo7174a() {
        if (this.f5921a != null) {
            this.f5922b.startActivityForResult(this.f5921a, this.f5923c);
        }
    }
}
