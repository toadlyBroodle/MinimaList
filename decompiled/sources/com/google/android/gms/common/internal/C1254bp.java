package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.InterfaceC1117be;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.bp */
/* JADX INFO: loaded from: classes.dex */
final class C1254bp extends AbstractDialogInterfaceOnClickListenerC1252bn {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Intent f5924a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ InterfaceC1117be f5925b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ int f5926c;

    C1254bp(Intent intent, InterfaceC1117be interfaceC1117be, int i) {
        this.f5924a = intent;
        this.f5925b = interfaceC1117be;
        this.f5926c = i;
    }

    @Override // com.google.android.gms.common.internal.AbstractDialogInterfaceOnClickListenerC1252bn
    /* JADX INFO: renamed from: a */
    public final void mo7174a() {
        if (this.f5924a != null) {
            this.f5925b.startActivityForResult(this.f5924a, this.f5926c);
        }
    }
}
