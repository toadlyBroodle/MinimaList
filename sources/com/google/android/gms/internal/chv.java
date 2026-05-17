package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class chv extends ciq {

    /* JADX INFO: renamed from: a */
    private final Object f10053a = new Object();

    /* JADX INFO: renamed from: b */
    private cia f10054b;

    /* JADX INFO: renamed from: c */
    private chu f10055c;

    @Override // com.google.android.gms.internal.cip
    /* JADX INFO: renamed from: a */
    public final void mo10868a() {
        synchronized (this.f10053a) {
            if (this.f10055c != null) {
                this.f10055c.mo5514O();
            }
        }
    }

    @Override // com.google.android.gms.internal.cip
    /* JADX INFO: renamed from: a */
    public final void mo10869a(int i) {
        synchronized (this.f10053a) {
            if (this.f10054b != null) {
                this.f10054b.mo10902a(i == 3 ? 1 : 2);
                this.f10054b = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.cip
    /* JADX INFO: renamed from: a */
    public final void mo10870a(cdv cdvVar, String str) {
        synchronized (this.f10053a) {
            if (this.f10055c != null) {
                this.f10055c.mo5614a(cdvVar, str);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10871a(chu chuVar) {
        synchronized (this.f10053a) {
            this.f10055c = chuVar;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10872a(cia ciaVar) {
        synchronized (this.f10053a) {
            this.f10054b = ciaVar;
        }
    }

    @Override // com.google.android.gms.internal.cip
    /* JADX INFO: renamed from: a */
    public final void mo10873a(cis cisVar) {
        synchronized (this.f10053a) {
            if (this.f10054b != null) {
                this.f10054b.mo10903a(0, cisVar);
                this.f10054b = null;
            } else {
                if (this.f10055c != null) {
                    this.f10055c.mo5612V();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.cip
    /* JADX INFO: renamed from: a */
    public final void mo10874a(String str, String str2) {
        synchronized (this.f10053a) {
            if (this.f10055c != null) {
                this.f10055c.mo5619b(str, str2);
            }
        }
    }

    @Override // com.google.android.gms.internal.cip
    /* JADX INFO: renamed from: b */
    public final void mo10875b() {
        synchronized (this.f10053a) {
            if (this.f10055c != null) {
                this.f10055c.mo5609S();
            }
        }
    }

    @Override // com.google.android.gms.internal.cip
    /* JADX INFO: renamed from: c */
    public final void mo10876c() {
        synchronized (this.f10053a) {
            if (this.f10055c != null) {
                this.f10055c.mo5610T();
            }
        }
    }

    @Override // com.google.android.gms.internal.cip
    /* JADX INFO: renamed from: d */
    public final void mo10877d() {
        synchronized (this.f10053a) {
            if (this.f10055c != null) {
                this.f10055c.mo5611U();
            }
        }
    }

    @Override // com.google.android.gms.internal.cip
    /* JADX INFO: renamed from: e */
    public final void mo10878e() {
        synchronized (this.f10053a) {
            if (this.f10054b != null) {
                this.f10054b.mo10902a(0);
                this.f10054b = null;
            } else {
                if (this.f10055c != null) {
                    this.f10055c.mo5612V();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.cip
    /* JADX INFO: renamed from: f */
    public final void mo10879f() {
        synchronized (this.f10053a) {
            if (this.f10055c != null) {
                this.f10055c.mo5515P();
            }
        }
    }

    @Override // com.google.android.gms.internal.cip
    /* JADX INFO: renamed from: g */
    public final void mo10880g() {
        synchronized (this.f10053a) {
            if (this.f10055c != null) {
                this.f10055c.mo5516Q();
            }
        }
    }
}
