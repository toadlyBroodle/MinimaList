package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class bec implements beb, bmj {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ bdx f7921a;

    /* JADX INFO: renamed from: b */
    private bme f7922b;

    private bec(bdx bdxVar, bme bmeVar) {
        this.f7921a = bdxVar;
        this.f7922b = bmeVar;
        this.f7922b.m9646a(this);
    }

    /* synthetic */ bec(bdx bdxVar, bme bmeVar, bdy bdyVar) {
        this(bdxVar, bmeVar);
    }

    @Override // com.google.android.gms.internal.beb
    /* JADX INFO: renamed from: a */
    public final void mo9068a() {
        try {
            this.f7922b.m9651d();
        } catch (bml e) {
            if (this.f7921a.f7906l.m9541a()) {
                this.f7921a.f7906l.m9540a("Error connecting", e, new Object[0]);
            }
            this.f7922b.m9652e();
            try {
                this.f7922b.m9654g();
            } catch (InterruptedException e2) {
                this.f7921a.f7906l.m9539a("Interrupted while shutting down websocket threads", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.bmj
    /* JADX INFO: renamed from: a */
    public final void mo9071a(bml bmlVar) {
        this.f7921a.f7905k.execute(new beg(this, bmlVar));
    }

    @Override // com.google.android.gms.internal.bmj
    /* JADX INFO: renamed from: a */
    public final void mo9072a(bmn bmnVar) {
        String strM9659a = bmnVar.m9659a();
        if (this.f7921a.f7906l.m9541a()) {
            bkl bklVar = this.f7921a.f7906l;
            String strValueOf = String.valueOf(strM9659a);
            bklVar.m9540a(strValueOf.length() != 0 ? "ws message: ".concat(strValueOf) : new String("ws message: "), null, new Object[0]);
        }
        this.f7921a.f7905k.execute(new bee(this, strM9659a));
    }

    @Override // com.google.android.gms.internal.beb
    /* JADX INFO: renamed from: a */
    public final void mo9069a(String str) {
        this.f7922b.m9648a(str);
    }

    @Override // com.google.android.gms.internal.beb
    /* JADX INFO: renamed from: b */
    public final void mo9070b() {
        this.f7922b.m9652e();
    }

    @Override // com.google.android.gms.internal.bmj
    /* JADX INFO: renamed from: c */
    public final void mo9073c() {
        this.f7921a.f7905k.execute(new bed(this));
    }

    @Override // com.google.android.gms.internal.bmj
    /* JADX INFO: renamed from: d */
    public final void mo9074d() {
        this.f7921a.f7905k.execute(new bef(this));
    }
}
