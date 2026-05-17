package com.google.firebase.iid;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.firebase.iid.s */
/* JADX INFO: loaded from: classes.dex */
final class C2307s extends AbstractC2308t<Void> {
    C2307s(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    @Override // com.google.firebase.iid.AbstractC2308t
    /* JADX INFO: renamed from: a */
    final void mo13097a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m13100a((Object) null);
        } else {
            m13099a(new C2309u(4, "Invalid response to one way request"));
        }
    }

    @Override // com.google.firebase.iid.AbstractC2308t
    /* JADX INFO: renamed from: a */
    final boolean mo13098a() {
        return true;
    }
}
