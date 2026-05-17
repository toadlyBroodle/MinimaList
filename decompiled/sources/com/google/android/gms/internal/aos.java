package com.google.android.gms.internal;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class aos implements ajz {

    /* JADX INFO: renamed from: a */
    private final Context f7003a;

    public aos(Context context) {
        this.f7003a = (Context) C1221aj.m7065a(context);
    }

    @Override // com.google.android.gms.internal.ajz
    /* JADX INFO: renamed from: b */
    public final arh<?> mo8076b(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(arhVarArr != null);
        C1221aj.m7074b(arhVarArr.length == 0);
        String string = Settings.Secure.getString(this.f7003a.getContentResolver(), "android_id");
        return string != null ? new art(string) : arn.f7154e;
    }
}
