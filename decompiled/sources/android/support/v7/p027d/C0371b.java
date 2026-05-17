package android.support.v7.p027d;

import android.os.Bundle;

/* JADX INFO: renamed from: android.support.v7.d.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0371b {

    /* JADX INFO: renamed from: a */
    private final Bundle f2137a;

    /* JADX INFO: renamed from: b */
    private C0375f f2138b;

    public C0371b(C0375f c0375f, boolean z) {
        if (c0375f == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        this.f2137a = new Bundle();
        this.f2138b = c0375f;
        this.f2137a.putBundle("selector", c0375f.m2887e());
        this.f2137a.putBoolean("activeScan", z);
    }

    /* JADX INFO: renamed from: e */
    private void m2846e() {
        if (this.f2138b == null) {
            this.f2138b = C0375f.m2880a(this.f2137a.getBundle("selector"));
            if (this.f2138b == null) {
                this.f2138b = C0375f.f2153b;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public C0375f m2847a() {
        m2846e();
        return this.f2138b;
    }

    /* JADX INFO: renamed from: b */
    public boolean m2848b() {
        return this.f2137a.getBoolean("activeScan");
    }

    /* JADX INFO: renamed from: c */
    public boolean m2849c() {
        m2846e();
        return this.f2138b.m2886d();
    }

    /* JADX INFO: renamed from: d */
    public Bundle m2850d() {
        return this.f2137a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0371b)) {
            return false;
        }
        C0371b c0371b = (C0371b) obj;
        return m2847a().equals(c0371b.m2847a()) && m2848b() == c0371b.m2848b();
    }

    public int hashCode() {
        return (m2848b() ? 1 : 0) ^ m2847a().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DiscoveryRequest{ selector=").append(m2847a());
        sb.append(", activeScan=").append(m2848b());
        sb.append(", isValid=").append(m2849c());
        sb.append(" }");
        return sb.toString();
    }
}
