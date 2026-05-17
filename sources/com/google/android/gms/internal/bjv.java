package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bjv {

    /* JADX INFO: renamed from: a */
    private final bje f8296a;

    /* JADX INFO: renamed from: b */
    private final bje f8297b;

    public bjv(bje bjeVar, bje bjeVar2) {
        this.f8296a = bjeVar;
        this.f8297b = bjeVar2;
    }

    /* JADX INFO: renamed from: a */
    public final bje m9497a() {
        return this.f8296a;
    }

    /* JADX INFO: renamed from: a */
    public final bjv m9498a(blf blfVar, boolean z, boolean z2) {
        return new bjv(new bje(blfVar, z, z2), this.f8297b);
    }

    /* JADX INFO: renamed from: b */
    public final bjv m9499b(blf blfVar, boolean z, boolean z2) {
        return new bjv(this.f8296a, new bje(blfVar, z, z2));
    }

    /* JADX INFO: renamed from: b */
    public final bln m9500b() {
        if (this.f8296a.m9436a()) {
            return this.f8296a.m9440c();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final bje m9501c() {
        return this.f8297b;
    }

    /* JADX INFO: renamed from: d */
    public final bln m9502d() {
        if (this.f8297b.m9436a()) {
            return this.f8297b.m9440c();
        }
        return null;
    }
}
