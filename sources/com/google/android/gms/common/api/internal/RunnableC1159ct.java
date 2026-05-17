package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.C1204c;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.ct */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1159ct implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AbstractDialogInterfaceOnCancelListenerC1157cr f5737a;

    /* JADX INFO: renamed from: b */
    private final C1158cs f5738b;

    RunnableC1159ct(AbstractDialogInterfaceOnCancelListenerC1157cr abstractDialogInterfaceOnCancelListenerC1157cr, C1158cs c1158cs) {
        this.f5737a = abstractDialogInterfaceOnCancelListenerC1157cr;
        this.f5738b = c1158cs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5737a.f5731b) {
            C1071a c1071aM6954b = this.f5738b.m6954b();
            if (c1071aM6954b.m6611a()) {
                this.f5737a.f5519a.startActivityForResult(GoogleApiActivity.m6622a(this.f5737a.m6716a(), c1071aM6954b.m6614d(), this.f5738b.m6953a(), false), 1);
                return;
            }
            if (this.f5737a.f5733d.mo7045a(c1071aM6954b.m6613c())) {
                this.f5737a.f5733d.m7046a(this.f5737a.m6716a(), this.f5737a.f5519a, c1071aM6954b.m6613c(), 2, this.f5737a);
            } else if (c1071aM6954b.m6613c() != 18) {
                this.f5737a.mo6934a(c1071aM6954b, this.f5738b.m6953a());
            } else {
                C1204c.m7034a(this.f5737a.m6716a().getApplicationContext(), new C1160cu(this, C1204c.m7032a(this.f5737a.m6716a(), this.f5737a)));
            }
        }
    }
}
