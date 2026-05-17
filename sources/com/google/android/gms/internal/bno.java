package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class bno {

    /* JADX INFO: renamed from: a */
    private static String f8482a = bno.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    private final arz f8483b;

    /* JADX INFO: renamed from: c */
    private final String f8484c;

    /* JADX INFO: renamed from: d */
    private final String f8485d;

    /* JADX INFO: renamed from: g */
    private final Class<?>[] f8488g;

    /* JADX INFO: renamed from: e */
    private final int f8486e = 2;

    /* JADX INFO: renamed from: f */
    private volatile Method f8487f = null;

    /* JADX INFO: renamed from: h */
    private CountDownLatch f8489h = new CountDownLatch(1);

    public bno(arz arzVar, String str, String str2, Class<?>... clsArr) {
        this.f8483b = arzVar;
        this.f8484c = str;
        this.f8485d = str2;
        this.f8488g = clsArr;
        this.f8483b.m8253c().submit(new bnp(this));
    }

    /* JADX INFO: renamed from: a */
    private final String m9726a(byte[] bArr, String str) {
        return new String(this.f8483b.m8255e().m7817a(bArr, str), "UTF-8");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m9728b() {
        try {
            Class clsLoadClass = this.f8483b.m8254d().loadClass(m9726a(this.f8483b.m8256f(), this.f8484c));
            if (clsLoadClass == null) {
                return;
            }
            this.f8487f = clsLoadClass.getMethod(m9726a(this.f8483b.m8256f(), this.f8485d), this.f8488g);
            if (this.f8487f == null) {
            }
        } catch (agm e) {
        } catch (UnsupportedEncodingException e2) {
        } catch (ClassNotFoundException e3) {
        } catch (NoSuchMethodException e4) {
        } catch (NullPointerException e5) {
        } finally {
            this.f8489h.countDown();
        }
    }

    /* JADX INFO: renamed from: a */
    public final Method m9729a() {
        if (this.f8487f != null) {
            return this.f8487f;
        }
        try {
            if (this.f8489h.await(2L, TimeUnit.SECONDS)) {
                return this.f8487f;
            }
            return null;
        } catch (InterruptedException e) {
            return null;
        }
    }
}
