package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.AbstractC0901p;
import com.google.android.gms.common.internal.C1221aj;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.pa */
/* JADX INFO: loaded from: classes.dex */
public final class C1818pa extends AbstractC0901p<C1818pa> {

    /* JADX INFO: renamed from: a */
    private String f11259a;

    /* JADX INFO: renamed from: b */
    private String f11260b;

    /* JADX INFO: renamed from: c */
    private String f11261c;

    /* JADX INFO: renamed from: d */
    private String f11262d;

    /* JADX INFO: renamed from: e */
    private boolean f11263e;

    /* JADX INFO: renamed from: f */
    private String f11264f;

    /* JADX INFO: renamed from: g */
    private boolean f11265g;

    /* JADX INFO: renamed from: h */
    private double f11266h;

    /* JADX INFO: renamed from: a */
    public final String m11979a() {
        return this.f11259a;
    }

    @Override // com.google.android.gms.analytics.AbstractC0901p
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo6068a(AbstractC0901p abstractC0901p) {
        C1818pa c1818pa = (C1818pa) abstractC0901p;
        if (!TextUtils.isEmpty(this.f11259a)) {
            c1818pa.f11259a = this.f11259a;
        }
        if (!TextUtils.isEmpty(this.f11260b)) {
            c1818pa.f11260b = this.f11260b;
        }
        if (!TextUtils.isEmpty(this.f11261c)) {
            c1818pa.f11261c = this.f11261c;
        }
        if (!TextUtils.isEmpty(this.f11262d)) {
            c1818pa.f11262d = this.f11262d;
        }
        if (this.f11263e) {
            c1818pa.f11263e = true;
        }
        if (!TextUtils.isEmpty(this.f11264f)) {
            c1818pa.f11264f = this.f11264f;
        }
        if (this.f11265g) {
            c1818pa.f11265g = this.f11265g;
        }
        if (this.f11266h != 0.0d) {
            double d = this.f11266h;
            C1221aj.m7075b(d >= 0.0d && d <= 100.0d, "Sample rate must be between 0% and 100%");
            c1818pa.f11266h = d;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11980a(String str) {
        this.f11259a = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m11981a(boolean z) {
        this.f11263e = z;
    }

    /* JADX INFO: renamed from: b */
    public final String m11982b() {
        return this.f11260b;
    }

    /* JADX INFO: renamed from: b */
    public final void m11983b(String str) {
        this.f11260b = str;
    }

    /* JADX INFO: renamed from: b */
    public final void m11984b(boolean z) {
        this.f11265g = true;
    }

    /* JADX INFO: renamed from: c */
    public final String m11985c() {
        return this.f11261c;
    }

    /* JADX INFO: renamed from: c */
    public final void m11986c(String str) {
        this.f11261c = str;
    }

    /* JADX INFO: renamed from: d */
    public final String m11987d() {
        return this.f11262d;
    }

    /* JADX INFO: renamed from: d */
    public final void m11988d(String str) {
        this.f11262d = str;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m11989e() {
        return this.f11263e;
    }

    /* JADX INFO: renamed from: f */
    public final String m11990f() {
        return this.f11264f;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m11991g() {
        return this.f11265g;
    }

    /* JADX INFO: renamed from: h */
    public final double m11992h() {
        return this.f11266h;
    }

    public final String toString() {
        HashMap map = new HashMap();
        map.put("hitType", this.f11259a);
        map.put("clientId", this.f11260b);
        map.put("userId", this.f11261c);
        map.put("androidAdId", this.f11262d);
        map.put("AdTargetingEnabled", Boolean.valueOf(this.f11263e));
        map.put("sessionControl", this.f11264f);
        map.put("nonInteraction", Boolean.valueOf(this.f11265g));
        map.put("sampleRate", Double.valueOf(this.f11266h));
        return m6065a((Object) map);
    }
}
