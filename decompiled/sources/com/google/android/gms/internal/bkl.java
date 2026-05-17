package com.google.android.gms.internal;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes.dex */
public final class bkl {

    /* JADX INFO: renamed from: a */
    private final bkm f8321a;

    /* JADX INFO: renamed from: b */
    private final String f8322b;

    /* JADX INFO: renamed from: c */
    private final String f8323c;

    public bkl(bkm bkmVar, String str) {
        this(bkmVar, str, null);
    }

    public bkl(bkm bkmVar, String str, String str2) {
        this.f8321a = bkmVar;
        this.f8322b = str;
        this.f8323c = str2;
    }

    /* JADX INFO: renamed from: a */
    private final String m9536a(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        if (this.f8323c == null) {
            return str;
        }
        String str2 = this.f8323c;
        return new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(str).length()).append(str2).append(" - ").append(str).toString();
    }

    /* JADX INFO: renamed from: a */
    private static String m9537a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        ayg.m8688a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: a */
    public final void m9538a(String str) {
        this.f8321a.mo9535b(bkn.INFO, this.f8322b, m9536a(str, new Object[0]), System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: a */
    public final void m9539a(String str, Throwable th) {
        String strM9536a = m9536a(str, new Object[0]);
        String strM9537a = m9537a(th);
        this.f8321a.mo9535b(bkn.ERROR, this.f8322b, new StringBuilder(String.valueOf(strM9536a).length() + 1 + String.valueOf(strM9537a).length()).append(strM9536a).append("\n").append(strM9537a).toString(), System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: a */
    public final void m9540a(String str, Throwable th, Object... objArr) {
        if (m9541a()) {
            String strM9536a = m9536a(str, objArr);
            if (th != null) {
                String strM9537a = m9537a(th);
                strM9536a = new StringBuilder(String.valueOf(strM9536a).length() + 1 + String.valueOf(strM9537a).length()).append(strM9536a).append("\n").append(strM9537a).toString();
            }
            this.f8321a.mo9535b(bkn.DEBUG, this.f8322b, strM9536a, System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9541a() {
        return this.f8321a.mo9534a().ordinal() <= bkn.DEBUG.ordinal();
    }

    /* JADX INFO: renamed from: b */
    public final void m9542b(String str, Throwable th) {
        this.f8321a.mo9535b(bkn.WARN, this.f8322b, m9536a(str, new Object[0]), System.currentTimeMillis());
    }
}
