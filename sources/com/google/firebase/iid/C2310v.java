package com.google.firebase.iid;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.firebase.iid.v */
/* JADX INFO: loaded from: classes.dex */
final class C2310v extends AbstractC2308t<Bundle> {
    C2310v(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    @Override // com.google.firebase.iid.AbstractC2308t
    /* JADX INFO: renamed from: a */
    final void mo13097a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        m13100a(bundle2);
    }

    @Override // com.google.firebase.iid.AbstractC2308t
    /* JADX INFO: renamed from: a */
    final boolean mo13098a() {
        return false;
    }
}
