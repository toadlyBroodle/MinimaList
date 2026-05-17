package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.iw */
/* JADX INFO: loaded from: classes.dex */
final class CallableC1651iw implements Callable<String> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f10812a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ Context f10813b;

    CallableC1651iw(C1650iv c1650iv, Context context, Context context2) {
        this.f10812a = context;
        this.f10813b = context2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (this.f10812a != null) {
            C1560fm.m11343a("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.f10812a.getSharedPreferences("admob_user_agent", 0);
        } else {
            C1560fm.m11343a("Attempting to read user agent from local cache.");
            sharedPreferences = this.f10813b.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            C1560fm.m11343a("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.f10813b);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                C1560fm.m11343a("Persisting user agent.");
            }
        }
        return string;
    }
}
