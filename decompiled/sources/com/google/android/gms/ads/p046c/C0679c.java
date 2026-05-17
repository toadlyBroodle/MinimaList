package com.google.android.gms.ads.p046c;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.C1319w;

/* JADX INFO: renamed from: com.google.android.gms.ads.c.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0679c {

    /* JADX INFO: renamed from: a */
    private SharedPreferences f4379a;

    public C0679c(Context context) {
        try {
            Context contextM7316f = C1319w.m7316f(context);
            this.f4379a = contextM7316f == null ? null : contextM7316f.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.f4379a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    final float m5411a(String str, float f) {
        try {
            if (this.f4379a == null) {
                return 0.0f;
            }
            return this.f4379a.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: a */
    final String m5412a(String str, String str2) {
        try {
            return this.f4379a == null ? str2 : this.f4379a.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5413a(String str, boolean z) {
        try {
            if (this.f4379a == null) {
                return false;
            }
            return this.f4379a.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }
}
