package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class bpt implements bpz {

    /* JADX INFO: renamed from: a */
    private bpz[] f8640a;

    bpt(bpz... bpzVarArr) {
        this.f8640a = bpzVarArr;
    }

    @Override // com.google.android.gms.internal.bpz
    /* JADX INFO: renamed from: a */
    public final boolean mo9896a(Class<?> cls) {
        for (bpz bpzVar : this.f8640a) {
            if (bpzVar.mo9896a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.bpz
    /* JADX INFO: renamed from: b */
    public final bpy mo9897b(Class<?> cls) {
        for (bpz bpzVar : this.f8640a) {
            if (bpzVar.mo9896a(cls)) {
                return bpzVar.mo9897b(cls);
            }
        }
        String strValueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(strValueOf.length() != 0 ? "No factory is available for message type: ".concat(strValueOf) : new String("No factory is available for message type: "));
    }
}
