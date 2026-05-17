package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class bdh implements bcy {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ long f7857a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bdg f7858b;

    bdh(bdg bdgVar, long j) {
        this.f7858b = bdgVar;
        this.f7857a = j;
    }

    @Override // com.google.android.gms.internal.bcy
    /* JADX INFO: renamed from: a */
    public final void mo8940a(String str) {
        if (this.f7857a != this.f7858b.f7855a.f7852x) {
            this.f7858b.f7855a.f7849u.m9540a("Ignoring getToken result, because this was not the latest attempt.", null, new Object[0]);
        } else if (this.f7858b.f7855a.f7837i == bdp.GettingToken) {
            this.f7858b.f7855a.f7849u.m9540a("Successfully fetched token, opening connection", null, new Object[0]);
            this.f7858b.f7855a.m9023g(str);
        } else {
            bda.m8952a(this.f7858b.f7855a.f7837i == bdp.Disconnected, "Expected connection state disconnected, but was %s", this.f7858b.f7855a.f7837i);
            this.f7858b.f7855a.f7849u.m9540a("Not opening connection after token refresh, because connection was set to disconnected", null, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.bcy
    /* JADX INFO: renamed from: b */
    public final void mo8941b(String str) {
        if (this.f7857a != this.f7858b.f7855a.f7852x) {
            this.f7858b.f7855a.f7849u.m9540a("Ignoring getToken error, because this was not the latest attempt.", null, new Object[0]);
            return;
        }
        this.f7858b.f7855a.f7837i = bdp.Disconnected;
        bkl bklVar = this.f7858b.f7855a.f7849u;
        String strValueOf = String.valueOf(str);
        bklVar.m9540a(strValueOf.length() != 0 ? "Error fetching token: ".concat(strValueOf) : new String("Error fetching token: "), null, new Object[0]);
        this.f7858b.f7855a.m9008h();
    }
}
