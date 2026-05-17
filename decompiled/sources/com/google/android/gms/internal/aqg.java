package com.google.android.gms.internal;

import android.content.Context;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
final class aqg implements aqk {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f7073a;

    aqg(Context context) {
        this.f7073a = context;
    }

    @Override // com.google.android.gms.internal.aqk
    /* JADX INFO: renamed from: a */
    public final InputStream mo8158a(String str) {
        return this.f7073a.getAssets().open(str);
    }
}
