package com.google.android.gms.internal;

import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ik */
/* JADX INFO: loaded from: classes.dex */
final class C1639ik extends C1906sh {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ byte[] f10791a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ Map f10792b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C1661jf f10793c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1639ik(C1633ie c1633ie, int i, String str, cle cleVar, ckd ckdVar, byte[] bArr, Map map, C1661jf c1661jf) {
        super(i, str, cleVar, ckdVar);
        this.f10791a = bArr;
        this.f10792b = map;
        this.f10793c = c1661jf;
    }

    @Override // com.google.android.gms.internal.C1906sh, com.google.android.gms.internal.cej
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ void mo10762a(String str) {
        mo10762a(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.C1906sh
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
    public final void mo10762a(String str) {
        this.f10793c.m11601a(str);
        super.mo10762a(str);
    }

    @Override // com.google.android.gms.internal.cej
    /* JADX INFO: renamed from: a */
    public final byte[] mo10763a() {
        return this.f10791a == null ? super.mo10763a() : this.f10791a;
    }

    @Override // com.google.android.gms.internal.cej
    /* JADX INFO: renamed from: b */
    public final Map<String, String> mo10764b() {
        return this.f10792b == null ? super.mo10764b() : this.f10792b;
    }
}
