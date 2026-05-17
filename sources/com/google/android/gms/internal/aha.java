package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.util.InterfaceC1300d;
import com.google.android.gms.tagmanager.InterfaceC2137q;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class aha implements InterfaceC1300d {

    /* JADX INFO: renamed from: a */
    private final Bundle f6757a;

    /* JADX INFO: renamed from: b */
    private final String f6758b;

    /* JADX INFO: renamed from: c */
    private final Date f6759c;

    /* JADX INFO: renamed from: d */
    private final String f6760d;

    /* JADX INFO: renamed from: e */
    private Map<String, Object> f6761e;

    /* JADX INFO: renamed from: f */
    private boolean f6762f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC2137q f6763g;

    public aha(String str, Bundle bundle, String str2, Date date, boolean z, InterfaceC2137q interfaceC2137q) {
        this.f6758b = str;
        this.f6757a = bundle == null ? new Bundle() : bundle;
        this.f6759c = date;
        this.f6760d = str2;
        this.f6762f = z;
        this.f6763g = interfaceC2137q;
    }

    @Override // com.google.android.gms.common.util.InterfaceC1300d
    /* JADX INFO: renamed from: a */
    public final long mo7252a() {
        return this.f6759c.getTime();
    }

    /* JADX INFO: renamed from: a */
    public final void m7904a(boolean z) {
        this.f6762f = false;
    }

    @Override // com.google.android.gms.common.util.InterfaceC1300d
    /* JADX INFO: renamed from: b */
    public final long mo7253b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.InterfaceC1300d
    /* JADX INFO: renamed from: c */
    public final long mo7254c() {
        return System.nanoTime();
    }

    /* JADX INFO: renamed from: d */
    public final String m7905d() {
        return this.f6758b;
    }

    /* JADX INFO: renamed from: e */
    public final Bundle m7906e() {
        return this.f6757a;
    }

    /* JADX INFO: renamed from: f */
    public final String m7907f() {
        return this.f6760d;
    }

    /* JADX INFO: renamed from: g */
    public final Map<String, Object> m7908g() {
        if (this.f6761e == null) {
            try {
                this.f6761e = this.f6763g.mo12815a();
            } catch (RemoteException e) {
                String strValueOf = String.valueOf(e.getMessage());
                ahs.m7942a(strValueOf.length() != 0 ? "Error calling measurement proxy:".concat(strValueOf) : new String("Error calling measurement proxy:"));
            }
        }
        return this.f6761e;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m7909h() {
        return this.f6762f;
    }
}
