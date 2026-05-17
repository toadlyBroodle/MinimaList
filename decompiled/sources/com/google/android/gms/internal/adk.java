package com.google.android.gms.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class adk implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AtomicReference f6435a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f6436b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f6437c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ String f6438d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ boolean f6439e;

    /* JADX INFO: renamed from: f */
    private /* synthetic */ C2084yx f6440f;

    /* JADX INFO: renamed from: g */
    private /* synthetic */ acz f6441g;

    adk(acz aczVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z, C2084yx c2084yx) {
        this.f6441g = aczVar;
        this.f6435a = atomicReference;
        this.f6436b = str;
        this.f6437c = str2;
        this.f6438d = str3;
        this.f6439e = z;
        this.f6440f = c2084yx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2108zu interfaceC2108zu;
        synchronized (this.f6435a) {
            try {
                try {
                    interfaceC2108zu = this.f6441g.f6398b;
                } catch (RemoteException e) {
                    this.f6441g.mo7393t().m7410y().m7415a("Failed to get user properties", aac.m7397a(this.f6436b), this.f6437c, e);
                    this.f6435a.set(Collections.emptyList());
                    this.f6435a.notify();
                }
                if (interfaceC2108zu == null) {
                    this.f6441g.mo7393t().m7410y().m7415a("Failed to get user properties", aac.m7397a(this.f6436b), this.f6437c, this.f6438d);
                    this.f6435a.set(Collections.emptyList());
                } else {
                    if (TextUtils.isEmpty(this.f6436b)) {
                        this.f6435a.set(interfaceC2108zu.mo7571a(this.f6437c, this.f6438d, this.f6439e, this.f6440f));
                    } else {
                        this.f6435a.set(interfaceC2108zu.mo7570a(this.f6436b, this.f6437c, this.f6438d, this.f6439e));
                    }
                    this.f6441g.m7644F();
                }
            } finally {
                this.f6435a.notify();
            }
        }
    }
}
