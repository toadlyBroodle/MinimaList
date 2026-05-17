package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.internal.InterfaceC1235ax;
import com.google.android.gms.common.internal.InterfaceC1236ay;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.yf */
/* JADX INFO: loaded from: classes.dex */
final class C2066yf implements InterfaceC1235ax, InterfaceC1236ay {

    /* JADX INFO: renamed from: a */
    private C2067yg f12521a;

    /* JADX INFO: renamed from: b */
    private final String f12522b;

    /* JADX INFO: renamed from: c */
    private final String f12523c;

    /* JADX INFO: renamed from: d */
    private final LinkedBlockingQueue<C1937tl> f12524d;

    /* JADX INFO: renamed from: e */
    private final HandlerThread f12525e = new HandlerThread("GassClient");

    public C2066yf(Context context, String str, String str2) {
        this.f12522b = str;
        this.f12523c = str2;
        this.f12525e.start();
        this.f12521a = new C2067yg(context, this.f12525e.getLooper(), this, this);
        this.f12524d = new LinkedBlockingQueue<>();
        this.f12521a.m7126r();
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC2072yl m12598a() {
        try {
            return this.f12521a.m12602e();
        } catch (DeadObjectException | IllegalStateException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m12599b() {
        if (this.f12521a != null) {
            if (this.f12521a.m7118g() || this.f12521a.m7119h()) {
                this.f12521a.mo6640f();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static C1937tl m12600c() {
        C1937tl c1937tl = new C1937tl();
        c1937tl.f11593k = 32768L;
        return c1937tl;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1235ax
    /* JADX INFO: renamed from: a */
    public final void mo7136a(int i) {
        try {
            this.f12524d.put(m12600c());
        } catch (InterruptedException e) {
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1235ax
    /* JADX INFO: renamed from: a */
    public final void mo7137a(Bundle bundle) {
        InterfaceC2072yl interfaceC2072ylM12598a = m12598a();
        try {
            if (interfaceC2072ylM12598a != null) {
                try {
                    this.f12524d.put(interfaceC2072ylM12598a.mo12605a(new C2068yh(this.f12522b, this.f12523c)).m12604a());
                } catch (Throwable th) {
                    try {
                        this.f12524d.put(m12600c());
                    } catch (InterruptedException e) {
                    }
                }
            }
        } finally {
            m12599b();
            this.f12525e.quit();
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1236ay
    /* JADX INFO: renamed from: a */
    public final void mo7138a(C1071a c1071a) {
        try {
            this.f12524d.put(m12600c());
        } catch (InterruptedException e) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final C1937tl m12601b(int i) {
        C1937tl c1937tlPoll;
        try {
            c1937tlPoll = this.f12524d.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            c1937tlPoll = null;
        }
        return c1937tlPoll == null ? m12600c() : c1937tlPoll;
    }
}
