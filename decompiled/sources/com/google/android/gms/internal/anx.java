package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class anx implements ajz {

    /* JADX INFO: renamed from: a */
    private Context f6987a;

    public anx(Context context) {
        this.f6987a = context;
    }

    @Override // com.google.android.gms.internal.ajz
    /* JADX INFO: renamed from: b */
    public final arh<?> mo8076b(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(arhVarArr != null);
        C1221aj.m7074b(arhVarArr.length == 0);
        try {
            PackageManager packageManager = this.f6987a.getPackageManager();
            return new art(packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f6987a.getPackageName(), 0)).toString());
        } catch (PackageManager.NameNotFoundException e) {
            return new art("");
        }
    }
}
