package com.google.android.gms.internal;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class aof implements ajz {

    /* JADX INFO: renamed from: a */
    private final Context f6994a;

    public aof(Context context) {
        this.f6994a = context;
    }

    @Override // com.google.android.gms.internal.ajz
    /* JADX INFO: renamed from: b */
    public final arh<?> mo8076b(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(arhVarArr != null);
        C1221aj.m7074b(arhVarArr.length == 0);
        String string = Settings.Secure.getString(this.f6994a.getContentResolver(), "android_id");
        if (string == null) {
            string = "";
        }
        return new art(string);
    }
}
