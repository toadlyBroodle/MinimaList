package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.st */
/* JADX INFO: loaded from: classes.dex */
public final class C1918st extends brw<C1918st> {

    /* JADX INFO: renamed from: a */
    public String f11518a = null;

    /* JADX INFO: renamed from: b */
    public Long f11519b = null;

    /* JADX INFO: renamed from: c */
    private String f11520c = null;

    /* JADX INFO: renamed from: d */
    private String f11521d = null;

    /* JADX INFO: renamed from: e */
    private String f11522e = null;

    /* JADX INFO: renamed from: f */
    private Long f11523f = null;

    /* JADX INFO: renamed from: g */
    private Long f11524g = null;

    /* JADX INFO: renamed from: h */
    private String f11525h = null;

    /* JADX INFO: renamed from: i */
    private Long f11526i = null;

    /* JADX INFO: renamed from: j */
    private String f11527j = null;

    public C1918st() {
        this.f8813Y = -1;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f11518a != null) {
            iMo7775a += bru.m10113b(1, this.f11518a);
        }
        if (this.f11519b != null) {
            iMo7775a += bru.m10118c(2, this.f11519b.longValue());
        }
        if (this.f11520c != null) {
            iMo7775a += bru.m10113b(3, this.f11520c);
        }
        if (this.f11521d != null) {
            iMo7775a += bru.m10113b(4, this.f11521d);
        }
        if (this.f11522e != null) {
            iMo7775a += bru.m10113b(5, this.f11522e);
        }
        if (this.f11523f != null) {
            iMo7775a += bru.m10118c(6, this.f11523f.longValue());
        }
        if (this.f11524g != null) {
            iMo7775a += bru.m10118c(7, this.f11524g.longValue());
        }
        if (this.f11525h != null) {
            iMo7775a += bru.m10113b(8, this.f11525h);
        }
        if (this.f11526i != null) {
            iMo7775a += bru.m10118c(9, this.f11526i.longValue());
        }
        return this.f11527j != null ? iMo7775a + bru.m10113b(10, this.f11527j) : iMo7775a;
    }

    @Override // com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bsc mo7776a(brt brtVar) throws bsb {
        while (true) {
            int iM10082a = brtVar.m10082a();
            switch (iM10082a) {
                case 0:
                    break;
                case 10:
                    this.f11518a = brtVar.m10093e();
                    break;
                case 16:
                    this.f11519b = Long.valueOf(brtVar.m10097h());
                    break;
                case 26:
                    this.f11520c = brtVar.m10093e();
                    break;
                case 34:
                    this.f11521d = brtVar.m10093e();
                    break;
                case 42:
                    this.f11522e = brtVar.m10093e();
                    break;
                case 48:
                    this.f11523f = Long.valueOf(brtVar.m10097h());
                    break;
                case 56:
                    this.f11524g = Long.valueOf(brtVar.m10097h());
                    break;
                case 66:
                    this.f11525h = brtVar.m10093e();
                    break;
                case 72:
                    this.f11526i = Long.valueOf(brtVar.m10097h());
                    break;
                case 82:
                    this.f11527j = brtVar.m10093e();
                    break;
                default:
                    if (!super.m10136a(brtVar, iM10082a)) {
                    }
                    break;
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    public final void mo7777a(bru bruVar) throws brv {
        if (this.f11518a != null) {
            bruVar.m10128a(1, this.f11518a);
        }
        if (this.f11519b != null) {
            bruVar.m10132b(2, this.f11519b.longValue());
        }
        if (this.f11520c != null) {
            bruVar.m10128a(3, this.f11520c);
        }
        if (this.f11521d != null) {
            bruVar.m10128a(4, this.f11521d);
        }
        if (this.f11522e != null) {
            bruVar.m10128a(5, this.f11522e);
        }
        if (this.f11523f != null) {
            bruVar.m10132b(6, this.f11523f.longValue());
        }
        if (this.f11524g != null) {
            bruVar.m10132b(7, this.f11524g.longValue());
        }
        if (this.f11525h != null) {
            bruVar.m10128a(8, this.f11525h);
        }
        if (this.f11526i != null) {
            bruVar.m10132b(9, this.f11526i.longValue());
        }
        if (this.f11527j != null) {
            bruVar.m10128a(10, this.f11527j);
        }
        super.mo7777a(bruVar);
    }
}
