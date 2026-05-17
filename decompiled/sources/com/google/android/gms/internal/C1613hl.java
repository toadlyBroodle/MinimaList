package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.google.android.gms.internal.hl */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(19)
public class C1613hl extends C1611hj {
    @Override // com.google.android.gms.internal.C1611hj, com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: a */
    public final boolean mo11470a(View view) {
        return view.isAttachedToWindow();
    }

    @Override // com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: d */
    public final ViewGroup.LayoutParams mo11479d() {
        return new ViewGroup.LayoutParams(-1, -1);
    }
}
