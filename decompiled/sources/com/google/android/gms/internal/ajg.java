package com.google.android.gms.internal;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
final class ajg implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ aix f6925a;

    ajg(aix aixVar) {
        this.f6925a = aixVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20) {
            this.f6925a.f6890g.execute(new ajh(this));
        }
    }
}
