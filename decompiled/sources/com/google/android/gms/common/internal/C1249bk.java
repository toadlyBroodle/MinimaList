package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.support.v4.p018i.C0208b;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.afr;
import java.util.Collection;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.bk */
/* JADX INFO: loaded from: classes.dex */
public final class C1249bk {

    /* JADX INFO: renamed from: a */
    private Account f5913a;

    /* JADX INFO: renamed from: b */
    private C0208b<Scope> f5914b;

    /* JADX INFO: renamed from: d */
    private String f5916d;

    /* JADX INFO: renamed from: e */
    private String f5917e;

    /* JADX INFO: renamed from: c */
    private int f5915c = 0;

    /* JADX INFO: renamed from: f */
    private afr f5918f = afr.f6666a;

    /* JADX INFO: renamed from: a */
    public final C1248bj m7158a() {
        return new C1248bj(this.f5913a, this.f5914b, null, 0, null, this.f5916d, this.f5917e, this.f5918f);
    }

    /* JADX INFO: renamed from: a */
    public final C1249bk m7159a(Account account) {
        this.f5913a = account;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C1249bk m7160a(String str) {
        this.f5916d = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C1249bk m7161a(Collection<Scope> collection) {
        if (this.f5914b == null) {
            this.f5914b = new C0208b<>();
        }
        this.f5914b.addAll(collection);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C1249bk m7162b(String str) {
        this.f5917e = str;
        return this;
    }
}
