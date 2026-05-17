package com.google.android.gms.internal;

import android.os.Environment;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class bzz implements Callable<Boolean> {
    bzz() {
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Boolean call() {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}
