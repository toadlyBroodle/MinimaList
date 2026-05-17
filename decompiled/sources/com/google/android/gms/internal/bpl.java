package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public class bpl {

    /* JADX INFO: renamed from: a */
    private static final bor f8629a = bor.m9874a();

    /* JADX INFO: renamed from: b */
    private bob f8630b;

    /* JADX INFO: renamed from: c */
    private volatile bqa f8631c;

    /* JADX INFO: renamed from: d */
    private volatile bob f8632d;

    /* JADX INFO: renamed from: b */
    private bqa m9946b(bqa bqaVar) {
        if (this.f8631c == null) {
            synchronized (this) {
                if (this.f8631c == null) {
                    try {
                        this.f8631c = bqaVar;
                        this.f8632d = bob.f8512a;
                    } catch (bpf e) {
                        this.f8631c = bqaVar;
                        this.f8632d = bob.f8512a;
                    }
                }
            }
        }
        return this.f8631c;
    }

    /* JADX INFO: renamed from: a */
    public final bqa m9947a(bqa bqaVar) {
        bqa bqaVar2 = this.f8631c;
        this.f8630b = null;
        this.f8632d = null;
        this.f8631c = bqaVar;
        return bqaVar2;
    }

    /* JADX INFO: renamed from: b */
    public final int m9948b() {
        if (this.f8632d != null) {
            return this.f8632d.mo9764a();
        }
        if (this.f8631c != null) {
            return this.f8631c.mo8344d();
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final bob m9949c() {
        if (this.f8632d != null) {
            return this.f8632d;
        }
        synchronized (this) {
            if (this.f8632d != null) {
                return this.f8632d;
            }
            if (this.f8631c == null) {
                this.f8632d = bob.f8512a;
            } else {
                this.f8632d = this.f8631c.mo9747j();
            }
            return this.f8632d;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpl)) {
            return false;
        }
        bpl bplVar = (bpl) obj;
        bqa bqaVar = this.f8631c;
        bqa bqaVar2 = bplVar.f8631c;
        return (bqaVar == null && bqaVar2 == null) ? m9949c().equals(bplVar.m9949c()) : (bqaVar == null || bqaVar2 == null) ? bqaVar != null ? bqaVar.equals(bplVar.m9946b(bqaVar.mo9907n())) : m9946b(bqaVar2.mo9907n()).equals(bqaVar2) : bqaVar.equals(bqaVar2);
    }

    public int hashCode() {
        return 1;
    }
}
