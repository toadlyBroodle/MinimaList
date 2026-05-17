package com.google.android.gms.tagmanager;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Keep;
import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public class TagManagerService extends Service {
    @Keep
    @KeepName
    public static void initialize(Context context) {
        C2123c.m12811b(context);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return C2123c.m12805a(this);
    }
}
