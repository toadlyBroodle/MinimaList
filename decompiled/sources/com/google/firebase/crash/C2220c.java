package com.google.firebase.crash;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.util.C1302f;
import com.google.android.gms.internal.C2063yc;
import com.google.android.gms.internal.baw;
import com.google.android.gms.internal.bay;
import com.google.android.gms.internal.bba;
import com.google.android.gms.internal.bbd;
import com.google.firebase.C2213b;

/* JADX INFO: renamed from: com.google.firebase.crash.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2220c {

    /* JADX INFO: renamed from: a */
    private String f12902a = null;

    /* JADX INFO: renamed from: b */
    private final C2213b f12903b;

    /* JADX INFO: renamed from: c */
    private final Context f12904c;

    C2220c(C2213b c2213b, String str) {
        this.f12904c = c2213b.m12929a();
        this.f12903b = c2213b;
    }

    /* JADX INFO: renamed from: a */
    public final baw m12956a() {
        baw bawVarM8794b;
        bba e;
        bbd.m8799a(this.f12904c);
        if (!((Boolean) C2063yc.m12594b().m12591a(bbd.f7710a)).booleanValue()) {
            Log.w("FirebaseCrash", "Crash reporting is disabled");
            return null;
        }
        try {
            bay.m8792a().m8793a(this.f12904c);
            bawVarM8794b = bay.m8792a().m8794b();
        } catch (bba e2) {
            bawVarM8794b = null;
            e = e2;
        }
        try {
            String strValueOf = String.valueOf(bay.m8792a());
            Log.i("FirebaseCrash", new StringBuilder(String.valueOf(strValueOf).length() + 33).append("FirebaseCrash reporting loaded - ").append(strValueOf).toString());
            return bawVarM8794b;
        } catch (bba e3) {
            e = e3;
            Log.e("FirebaseCrash", "Failed to load crash reporting", e);
            C1302f.m7261a(this.f12904c, e);
            return bawVarM8794b;
        }
    }
}
