package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.view.View;

/* JADX INFO: renamed from: com.google.android.gms.internal.hj */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(18)
public class C1611hj extends C1609hh {
    @Override // com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: a */
    public boolean mo11470a(View view) {
        return super.mo11470a(view) || view.getWindowId() != null;
    }

    @Override // com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: c */
    public final int mo11475c() {
        return 14;
    }
}
