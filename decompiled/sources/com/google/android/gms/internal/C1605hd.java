package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.DownloadManager;

/* JADX INFO: renamed from: com.google.android.gms.internal.hd */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(9)
public class C1605hd extends C1603hb {
    public C1605hd() {
        super();
    }

    @Override // com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: a */
    public final int mo11459a() {
        return 6;
    }

    @Override // com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: a */
    public boolean mo11468a(DownloadManager.Request request) {
        request.setShowRunningNotification(true);
        return true;
    }

    @Override // com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: b */
    public final int mo11472b() {
        return 7;
    }
}
