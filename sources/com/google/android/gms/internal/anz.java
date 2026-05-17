package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class anz implements ajz {

    /* JADX INFO: renamed from: a */
    private final Context f6989a;

    public anz(Context context) {
        this.f6989a = (Context) C1221aj.m7065a(context);
    }

    @Override // com.google.android.gms.internal.ajz
    /* JADX INFO: renamed from: b */
    public final arh<?> mo8076b(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(arhVarArr != null);
        C1221aj.m7074b(arhVarArr.length == 0);
        try {
            return new art(this.f6989a.getPackageManager().getPackageInfo(this.f6989a.getPackageName(), 0).versionName);
        } catch (PackageManager.NameNotFoundException e) {
            String packageName = this.f6989a.getPackageName();
            String strValueOf = String.valueOf(e);
            ahs.m7942a(new StringBuilder(String.valueOf(packageName).length() + 25 + String.valueOf(strValueOf).length()).append("Package name ").append(packageName).append(" not found. ").append(strValueOf).toString());
            return arn.f7154e;
        }
    }
}
