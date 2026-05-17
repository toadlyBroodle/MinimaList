package com.google.firebase.auth.internal;

import com.google.android.gms.common.api.internal.InterfaceC1154co;

/* JADX INFO: renamed from: com.google.firebase.auth.internal.p */
/* JADX INFO: loaded from: classes.dex */
final class C2193p implements InterfaceC1154co {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C2192o f12847a;

    C2193p(C2192o c2192o) {
        this.f12847a = c2192o;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1154co
    /* JADX INFO: renamed from: a */
    public final void mo6809a(boolean z) {
        if (z) {
            this.f12847a.f12846c = true;
            this.f12847a.m12898a();
        } else {
            this.f12847a.f12846c = false;
            if (this.f12847a.m12897b()) {
                this.f12847a.f12845b.m12881a();
            }
        }
    }
}
