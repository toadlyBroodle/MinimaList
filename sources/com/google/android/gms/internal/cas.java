package com.google.android.gms.internal;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cas {
    /* JADX INFO: renamed from: a */
    public static caq m10563a(cap capVar) {
        if (!capVar.m10552a()) {
            C1560fm.m11343a("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
            return null;
        }
        if (capVar.m10554c() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(capVar.m10555d())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        return new caq(capVar.m10554c(), capVar.m10555d(), capVar.m10553b(), capVar.m10556e());
    }
}
