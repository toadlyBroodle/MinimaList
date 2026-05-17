package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.be */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1117be {
    /* JADX INFO: renamed from: a */
    <T extends LifecycleCallback> T mo6882a(String str, Class<T> cls);

    /* JADX INFO: renamed from: a */
    void mo6883a(String str, LifecycleCallback lifecycleCallback);

    /* JADX INFO: renamed from: k_ */
    Activity mo6884k_();

    void startActivityForResult(Intent intent, int i);
}
