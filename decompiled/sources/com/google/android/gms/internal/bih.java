package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bih {

    /* JADX INFO: renamed from: b */
    private static final bix<Boolean> f8211b = new bii();

    /* JADX INFO: renamed from: c */
    private static final bix<Boolean> f8212c = new bij();

    /* JADX INFO: renamed from: d */
    private static final bit<Boolean> f8213d = new bit<>(true);

    /* JADX INFO: renamed from: e */
    private static final bit<Boolean> f8214e = new bit<>(false);

    /* JADX INFO: renamed from: a */
    private final bit<Boolean> f8215a;

    public bih() {
        this.f8215a = bit.m9405a();
    }

    private bih(bit<Boolean> bitVar) {
        this.f8215a = bitVar;
    }

    /* JADX INFO: renamed from: a */
    public final bih m9377a(bkp bkpVar) {
        bit<Boolean> bitVarM9411a = this.f8215a.m9411a(bkpVar);
        return new bih(bitVarM9411a == null ? new bit<>(this.f8215a.m9415b()) : (bitVarM9411a.m9415b() != null || this.f8215a.m9415b() == null) ? bitVarM9411a : bitVarM9411a.m9410a(bfa.m9147a(), this.f8215a.m9415b()));
    }

    /* JADX INFO: renamed from: a */
    public final <T> T m9378a(T t, biw<Void, T> biwVar) {
        return (T) this.f8215a.m9412a(t, new bik(this, biwVar));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9379a() {
        return this.f8215a.m9414a(f8212c);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9380a(bfa bfaVar) {
        Boolean boolM9416b = this.f8215a.m9416b(bfaVar);
        return boolM9416b != null && boolM9416b.booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9381b(bfa bfaVar) {
        Boolean boolM9416b = this.f8215a.m9416b(bfaVar);
        return (boolM9416b == null || boolM9416b.booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public final bih m9382c(bfa bfaVar) {
        if (this.f8215a.m9417b(bfaVar, f8211b) != null) {
            throw new IllegalArgumentException("Can't prune path that was kept previously!");
        }
        return this.f8215a.m9417b(bfaVar, f8212c) != null ? this : new bih(this.f8215a.m9409a(bfaVar, f8213d));
    }

    /* JADX INFO: renamed from: d */
    public final bih m9383d(bfa bfaVar) {
        return this.f8215a.m9417b(bfaVar, f8211b) != null ? this : new bih(this.f8215a.m9409a(bfaVar, f8214e));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bih) && this.f8215a.equals(((bih) obj).f8215a);
    }

    public final int hashCode() {
        return this.f8215a.hashCode();
    }

    public final String toString() {
        String string = this.f8215a.toString();
        return new StringBuilder(String.valueOf(string).length() + 14).append("{PruneForest:").append(string).append("}").toString();
    }
}
