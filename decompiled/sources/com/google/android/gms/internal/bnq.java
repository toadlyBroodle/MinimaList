package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public abstract class bnq implements Callable {

    /* JADX INFO: renamed from: a */
    protected final arz f8491a;

    /* JADX INFO: renamed from: b */
    protected final C1937tl f8492b;

    /* JADX INFO: renamed from: c */
    protected Method f8493c;

    /* JADX INFO: renamed from: d */
    private String f8494d = getClass().getSimpleName();

    /* JADX INFO: renamed from: e */
    private String f8495e;

    /* JADX INFO: renamed from: f */
    private String f8496f;

    /* JADX INFO: renamed from: g */
    private int f8497g;

    /* JADX INFO: renamed from: h */
    private int f8498h;

    public bnq(arz arzVar, String str, String str2, C1937tl c1937tl, int i, int i2) {
        this.f8491a = arzVar;
        this.f8495e = str;
        this.f8496f = str2;
        this.f8492b = c1937tl;
        this.f8497g = i;
        this.f8498h = i2;
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo8698a();

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void call() {
        try {
            long jNanoTime = System.nanoTime();
            this.f8493c = this.f8491a.m8248a(this.f8495e, this.f8496f);
            if (this.f8493c != null) {
                mo8698a();
                afe afeVarM8258h = this.f8491a.m8258h();
                if (afeVarM8258h != null && this.f8497g != Integer.MIN_VALUE) {
                    afeVarM8258h.m7794a(this.f8498h, this.f8497g, (System.nanoTime() - jNanoTime) / 1000);
                }
            }
        } catch (IllegalAccessException e) {
        } catch (InvocationTargetException e2) {
        }
        return null;
    }
}
