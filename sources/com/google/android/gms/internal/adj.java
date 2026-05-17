package com.google.android.gms.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class adj implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AtomicReference f6429a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f6430b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f6431c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ String f6432d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ C2084yx f6433e;

    /* JADX INFO: renamed from: f */
    private /* synthetic */ acz f6434f;

    adj(acz aczVar, AtomicReference atomicReference, String str, String str2, String str3, C2084yx c2084yx) {
        this.f6434f = aczVar;
        this.f6429a = atomicReference;
        this.f6430b = str;
        this.f6431c = str2;
        this.f6432d = str3;
        this.f6433e = c2084yx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2108zu interfaceC2108zu;
        synchronized (this.f6429a) {
            try {
                try {
                    interfaceC2108zu = this.f6434f.f6398b;
                } catch (RemoteException e) {
                    this.f6434f.mo7393t().m7410y().m7415a("Failed to get conditional properties", aac.m7397a(this.f6430b), this.f6431c, e);
                    this.f6429a.set(Collections.emptyList());
                    this.f6429a.notify();
                }
                if (interfaceC2108zu == null) {
                    this.f6434f.mo7393t().m7410y().m7415a("Failed to get conditional properties", aac.m7397a(this.f6430b), this.f6431c, this.f6432d);
                    this.f6429a.set(Collections.emptyList());
                } else {
                    if (TextUtils.isEmpty(this.f6430b)) {
                        this.f6429a.set(interfaceC2108zu.mo7568a(this.f6431c, this.f6432d, this.f6433e));
                    } else {
                        this.f6429a.set(interfaceC2108zu.mo7569a(this.f6430b, this.f6431c, this.f6432d));
                    }
                    this.f6434f.m7644F();
                }
            } finally {
                this.f6429a.notify();
            }
        }
    }
}
