package com.google.android.gms.internal;

import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
final class aiu implements aiw {
    aiu() {
    }

    @Override // com.google.android.gms.internal.aiw
    /* JADX INFO: renamed from: a */
    public final HttpURLConnection mo8030a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }
}
