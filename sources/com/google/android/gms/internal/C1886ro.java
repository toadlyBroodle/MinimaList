package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.analytics.C0903r;

/* JADX INFO: renamed from: com.google.android.gms.internal.ro */
/* JADX INFO: loaded from: classes.dex */
public final class C1886ro extends AbstractC1832po {

    /* JADX INFO: renamed from: a */
    private SharedPreferences f11478a;

    /* JADX INFO: renamed from: b */
    private long f11479b;

    /* JADX INFO: renamed from: c */
    private long f11480c;

    /* JADX INFO: renamed from: d */
    private final C1889rr f11481d;

    protected C1886ro(C1834pq c1834pq) {
        super(c1834pq);
        this.f11480c = -1L;
        this.f11481d = new C1889rr(this, "monitoring", C1872ra.f11403D.m12204a().longValue());
    }

    @Override // com.google.android.gms.internal.AbstractC1832po
    /* JADX INFO: renamed from: a */
    protected final void mo6013a() {
        this.f11478a = m12038j().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m12254a(String str) {
        C0903r.m6076d();
        m12052y();
        SharedPreferences.Editor editorEdit = this.f11478a.edit();
        if (TextUtils.isEmpty(str)) {
            editorEdit.remove("installation_campaign");
        } else {
            editorEdit.putString("installation_campaign", str);
        }
        if (editorEdit.commit()) {
            return;
        }
        m12033e("Failed to commit campaign data");
    }

    /* JADX INFO: renamed from: b */
    public final long m12255b() {
        C0903r.m6076d();
        m12052y();
        if (this.f11479b == 0) {
            long j = this.f11478a.getLong("first_run", 0L);
            if (j != 0) {
                this.f11479b = j;
            } else {
                long jMo7252a = m12037i().mo7252a();
                SharedPreferences.Editor editorEdit = this.f11478a.edit();
                editorEdit.putLong("first_run", jMo7252a);
                if (!editorEdit.commit()) {
                    m12033e("Failed to commit first run time");
                }
                this.f11479b = jMo7252a;
            }
        }
        return this.f11479b;
    }

    /* JADX INFO: renamed from: c */
    public final C1895rx m12256c() {
        return new C1895rx(m12037i(), m12255b());
    }

    /* JADX INFO: renamed from: d */
    public final long m12257d() {
        C0903r.m6076d();
        m12052y();
        if (this.f11480c == -1) {
            this.f11480c = this.f11478a.getLong("last_dispatch", 0L);
        }
        return this.f11480c;
    }

    /* JADX INFO: renamed from: e */
    public final void m12258e() {
        C0903r.m6076d();
        m12052y();
        long jMo7252a = m12037i().mo7252a();
        SharedPreferences.Editor editorEdit = this.f11478a.edit();
        editorEdit.putLong("last_dispatch", jMo7252a);
        editorEdit.apply();
        this.f11480c = jMo7252a;
    }

    /* JADX INFO: renamed from: f */
    public final String m12259f() {
        C0903r.m6076d();
        m12052y();
        String string = this.f11478a.getString("installation_campaign", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    /* JADX INFO: renamed from: g */
    public final C1889rr m12260g() {
        return this.f11481d;
    }
}
