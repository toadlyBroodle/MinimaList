package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.common.util.C1301e;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.np */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class BinderC1779np extends byy {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1739mc f11180a;

    /* JADX INFO: renamed from: c */
    private final boolean f11182c;

    /* JADX INFO: renamed from: d */
    private final boolean f11183d;

    /* JADX INFO: renamed from: e */
    private final float f11184e;

    /* JADX INFO: renamed from: f */
    private int f11185f;

    /* JADX INFO: renamed from: g */
    private bza f11186g;

    /* JADX INFO: renamed from: h */
    private boolean f11187h;

    /* JADX INFO: renamed from: j */
    private float f11189j;

    /* JADX INFO: renamed from: k */
    private float f11190k;

    /* JADX INFO: renamed from: m */
    private boolean f11192m;

    /* JADX INFO: renamed from: n */
    private boolean f11193n;

    /* JADX INFO: renamed from: b */
    private final Object f11181b = new Object();

    /* JADX INFO: renamed from: i */
    private boolean f11188i = true;

    /* JADX INFO: renamed from: l */
    private boolean f11191l = true;

    public BinderC1779np(InterfaceC1739mc interfaceC1739mc, float f, boolean z, boolean z2) {
        this.f11180a = interfaceC1739mc;
        this.f11184e = f;
        this.f11182c = z;
        this.f11183d = z2;
    }

    /* JADX INFO: renamed from: a */
    private final void m11908a(String str, Map<String, String> map) {
        HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        C0710au.m5569e();
        C1596gv.m11394a(new RunnableC1780nq(this, map2));
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: a */
    public final void mo10420a() {
        m11908a("play", (Map<String, String>) null);
    }

    /* JADX INFO: renamed from: a */
    public final void m11913a(float f, int i, boolean z, float f2) {
        boolean z2;
        int i2;
        synchronized (this.f11181b) {
            this.f11189j = f;
            z2 = this.f11188i;
            this.f11188i = z;
            i2 = this.f11185f;
            this.f11185f = i;
            float f3 = this.f11190k;
            this.f11190k = f2;
            if (Math.abs(this.f11190k - f3) > 1.0E-4f) {
                Object obj = this.f11180a;
                if (obj == null) {
                    throw null;
                }
                ((View) obj).invalidate();
            }
        }
        C0710au.m5569e();
        C1596gv.m11394a(new RunnableC1781nr(this, i2, i, z2, z));
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: a */
    public final void mo10421a(bza bzaVar) {
        synchronized (this.f11181b) {
            this.f11186g = bzaVar;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11914a(bzw bzwVar) {
        synchronized (this.f11181b) {
            this.f11191l = bzwVar.f9378a;
            this.f11192m = bzwVar.f9379b;
            this.f11193n = bzwVar.f9380c;
        }
        m11908a("initialState", C1301e.m7255a("muteStart", bzwVar.f9378a ? "1" : "0", "customControlsRequested", bzwVar.f9379b ? "1" : "0", "clickToExpandRequested", bzwVar.f9380c ? "1" : "0"));
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: a */
    public final void mo10422a(boolean z) {
        m11908a(z ? "mute" : "unmute", (Map<String, String>) null);
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: b */
    public final void mo10423b() {
        m11908a("pause", (Map<String, String>) null);
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: c */
    public final boolean mo10424c() {
        boolean z;
        synchronized (this.f11181b) {
            z = this.f11188i;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: d */
    public final int mo10425d() {
        int i;
        synchronized (this.f11181b) {
            i = this.f11185f;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: e */
    public final float mo10426e() {
        float f;
        synchronized (this.f11181b) {
            f = this.f11190k;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: f */
    public final float mo10427f() {
        return this.f11184e;
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: g */
    public final float mo10428g() {
        float f;
        synchronized (this.f11181b) {
            f = this.f11189j;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: h */
    public final bza mo10429h() {
        bza bzaVar;
        synchronized (this.f11181b) {
            bzaVar = this.f11186g;
        }
        return bzaVar;
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: i */
    public final boolean mo10430i() {
        boolean z;
        synchronized (this.f11181b) {
            z = this.f11182c && this.f11192m;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0014  */
    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo10431j() {
        boolean z;
        boolean zMo10430i = mo10430i();
        synchronized (this.f11181b) {
            if (!zMo10430i) {
                z = this.f11193n && this.f11183d;
            }
        }
        return z;
    }
}
