package com.google.android.gms.internal;

import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.in */
/* JADX INFO: loaded from: classes.dex */
public final class C1642in extends cej<cch> {

    /* JADX INFO: renamed from: a */
    private final C1700kr<cch> f10794a;

    /* JADX INFO: renamed from: b */
    private final Map<String, String> f10795b;

    /* JADX INFO: renamed from: c */
    private final C1661jf f10796c;

    public C1642in(String str, C1700kr<cch> c1700kr) {
        this(str, null, c1700kr);
    }

    private C1642in(String str, Map<String, String> map, C1700kr<cch> c1700kr) {
        super(0, str, new C1643io(c1700kr));
        this.f10795b = null;
        this.f10794a = c1700kr;
        this.f10796c = new C1661jf();
        this.f10796c.m11602a(str, "GET", null, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.internal.cej
    /* JADX INFO: renamed from: a */
    protected final cjk<cch> mo10758a(cch cchVar) {
        return cjk.m11027a(cchVar, C1778no.m11901a(cchVar));
    }

    @Override // com.google.android.gms.internal.cej
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ void mo10762a(cch cchVar) {
        cch cchVar2 = cchVar;
        this.f10796c.m11605a(cchVar2.f9802c, cchVar2.f9800a);
        C1661jf c1661jf = this.f10796c;
        byte[] bArr = cchVar2.f9801b;
        if (C1661jf.m11600c() && bArr != null) {
            c1661jf.m11606a(bArr);
        }
        this.f10794a.m11657b(cchVar2);
    }
}
