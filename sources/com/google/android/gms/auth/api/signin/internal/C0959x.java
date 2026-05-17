package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C1221aj;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.internal.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0959x {

    /* JADX INFO: renamed from: a */
    private static final Lock f5104a = new ReentrantLock();

    /* JADX INFO: renamed from: b */
    private static C0959x f5105b;

    /* JADX INFO: renamed from: c */
    private final Lock f5106c = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    private final SharedPreferences f5107d;

    private C0959x(Context context) {
        this.f5107d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* JADX INFO: renamed from: a */
    private final GoogleSignInAccount m6193a(String str) {
        String strM6197c;
        if (TextUtils.isEmpty(str) || (strM6197c = m6197c(m6196b("googleSignInAccount", str))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m6112a(strM6197c);
        } catch (JSONException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0959x m6194a(Context context) {
        C1221aj.m7065a(context);
        f5104a.lock();
        try {
            if (f5105b == null) {
                f5105b = new C0959x(context.getApplicationContext());
            }
            return f5105b;
        } finally {
            f5104a.unlock();
        }
    }

    /* JADX INFO: renamed from: b */
    private final GoogleSignInOptions m6195b(String str) {
        String strM6197c;
        if (TextUtils.isEmpty(str) || (strM6197c = m6197c(m6196b("googleSignInOptions", str))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.m6127a(strM6197c);
        } catch (JSONException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m6196b(String str, String str2) {
        return new StringBuilder(String.valueOf(str).length() + String.valueOf(":").length() + String.valueOf(str2).length()).append(str).append(":").append(str2).toString();
    }

    /* JADX INFO: renamed from: c */
    private final String m6197c(String str) {
        this.f5106c.lock();
        try {
            return this.f5107d.getString(str, null);
        } finally {
            this.f5106c.unlock();
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m6198d(String str) {
        this.f5106c.lock();
        try {
            this.f5107d.edit().remove(str).apply();
        } finally {
            this.f5106c.unlock();
        }
    }

    /* JADX INFO: renamed from: a */
    public final GoogleSignInAccount m6199a() {
        return m6193a(m6197c("defaultGoogleSignInAccount"));
    }

    /* JADX INFO: renamed from: a */
    final void m6200a(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        C1221aj.m7065a(googleSignInAccount);
        C1221aj.m7065a(googleSignInOptions);
        String strM6124j = googleSignInAccount.m6124j();
        m6201a(m6196b("googleSignInAccount", strM6124j), googleSignInAccount.m6126l());
        m6201a(m6196b("googleSignInOptions", strM6124j), googleSignInOptions.m6140b());
    }

    /* JADX INFO: renamed from: a */
    protected final void m6201a(String str, String str2) {
        this.f5106c.lock();
        try {
            this.f5107d.edit().putString(str, str2).apply();
        } finally {
            this.f5106c.unlock();
        }
    }

    /* JADX INFO: renamed from: b */
    public final GoogleSignInOptions m6202b() {
        return m6195b(m6197c("defaultGoogleSignInAccount"));
    }

    /* JADX INFO: renamed from: c */
    public final void m6203c() {
        String strM6197c = m6197c("defaultGoogleSignInAccount");
        m6198d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strM6197c)) {
            return;
        }
        m6198d(m6196b("googleSignInAccount", strM6197c));
        m6198d(m6196b("googleSignInOptions", strM6197c));
    }

    /* JADX INFO: renamed from: d */
    public final void m6204d() {
        this.f5106c.lock();
        try {
            this.f5107d.edit().clear().apply();
        } finally {
            this.f5106c.unlock();
        }
    }
}
