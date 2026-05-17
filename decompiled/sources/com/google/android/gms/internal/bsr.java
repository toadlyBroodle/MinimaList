package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bsr extends brw<bsr> {

    /* JADX INFO: renamed from: a */
    public String f8883a = "";

    /* JADX INFO: renamed from: b */
    public String f8884b = "";

    /* JADX INFO: renamed from: c */
    public long f8885c = 0;

    /* JADX INFO: renamed from: d */
    public String f8886d = "";

    /* JADX INFO: renamed from: e */
    public long f8887e = 0;

    /* JADX INFO: renamed from: f */
    public long f8888f = 0;

    /* JADX INFO: renamed from: g */
    public String f8889g = "";

    /* JADX INFO: renamed from: h */
    public String f8890h = "";

    /* JADX INFO: renamed from: i */
    public String f8891i = "";

    /* JADX INFO: renamed from: j */
    public String f8892j = "";

    /* JADX INFO: renamed from: k */
    public String f8893k = "";

    /* JADX INFO: renamed from: l */
    public int f8894l = 0;

    /* JADX INFO: renamed from: m */
    public bsq[] f8895m = bsq.m10178b();

    public bsr() {
        this.f8769X = null;
        this.f8813Y = -1;
    }

    /* JADX INFO: renamed from: a */
    public static bsr m10179a(byte[] bArr) {
        return (bsr) bsc.m10162a(new bsr(), bArr);
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f8883a != null && !this.f8883a.equals("")) {
            iMo7775a += bru.m10113b(1, this.f8883a);
        }
        if (this.f8884b != null && !this.f8884b.equals("")) {
            iMo7775a += bru.m10113b(2, this.f8884b);
        }
        if (this.f8885c != 0) {
            iMo7775a += bru.m10118c(3, this.f8885c);
        }
        if (this.f8886d != null && !this.f8886d.equals("")) {
            iMo7775a += bru.m10113b(4, this.f8886d);
        }
        if (this.f8887e != 0) {
            iMo7775a += bru.m10118c(5, this.f8887e);
        }
        if (this.f8888f != 0) {
            iMo7775a += bru.m10118c(6, this.f8888f);
        }
        if (this.f8889g != null && !this.f8889g.equals("")) {
            iMo7775a += bru.m10113b(7, this.f8889g);
        }
        if (this.f8890h != null && !this.f8890h.equals("")) {
            iMo7775a += bru.m10113b(8, this.f8890h);
        }
        if (this.f8891i != null && !this.f8891i.equals("")) {
            iMo7775a += bru.m10113b(9, this.f8891i);
        }
        if (this.f8892j != null && !this.f8892j.equals("")) {
            iMo7775a += bru.m10113b(10, this.f8892j);
        }
        if (this.f8893k != null && !this.f8893k.equals("")) {
            iMo7775a += bru.m10113b(11, this.f8893k);
        }
        if (this.f8894l != 0) {
            iMo7775a += bru.m10111b(12, this.f8894l);
        }
        if (this.f8895m == null || this.f8895m.length <= 0) {
            return iMo7775a;
        }
        int iM10112b = iMo7775a;
        for (int i = 0; i < this.f8895m.length; i++) {
            bsq bsqVar = this.f8895m[i];
            if (bsqVar != null) {
                iM10112b += bru.m10112b(13, bsqVar);
            }
        }
        return iM10112b;
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
                    this.f8883a = brtVar.m10093e();
                    break;
                case 18:
                    this.f8884b = brtVar.m10093e();
                    break;
                case 24:
                    this.f8885c = brtVar.m10086b();
                    break;
                case 34:
                    this.f8886d = brtVar.m10093e();
                    break;
                case 40:
                    this.f8887e = brtVar.m10086b();
                    break;
                case 48:
                    this.f8888f = brtVar.m10086b();
                    break;
                case 58:
                    this.f8889g = brtVar.m10093e();
                    break;
                case 66:
                    this.f8890h = brtVar.m10093e();
                    break;
                case 74:
                    this.f8891i = brtVar.m10093e();
                    break;
                case 82:
                    this.f8892j = brtVar.m10093e();
                    break;
                case 90:
                    this.f8893k = brtVar.m10093e();
                    break;
                case 96:
                    this.f8894l = brtVar.m10089c();
                    break;
                case 106:
                    int iM10172a = bsf.m10172a(brtVar, 106);
                    int length = this.f8895m == null ? 0 : this.f8895m.length;
                    bsq[] bsqVarArr = new bsq[iM10172a + length];
                    if (length != 0) {
                        System.arraycopy(this.f8895m, 0, bsqVarArr, 0, length);
                    }
                    while (length < bsqVarArr.length - 1) {
                        bsqVarArr[length] = new bsq();
                        brtVar.m10084a(bsqVarArr[length]);
                        brtVar.m10082a();
                        length++;
                    }
                    bsqVarArr[length] = new bsq();
                    brtVar.m10084a(bsqVarArr[length]);
                    this.f8895m = bsqVarArr;
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
        if (this.f8883a != null && !this.f8883a.equals("")) {
            bruVar.m10128a(1, this.f8883a);
        }
        if (this.f8884b != null && !this.f8884b.equals("")) {
            bruVar.m10128a(2, this.f8884b);
        }
        if (this.f8885c != 0) {
            bruVar.m10132b(3, this.f8885c);
        }
        if (this.f8886d != null && !this.f8886d.equals("")) {
            bruVar.m10128a(4, this.f8886d);
        }
        if (this.f8887e != 0) {
            bruVar.m10132b(5, this.f8887e);
        }
        if (this.f8888f != 0) {
            bruVar.m10132b(6, this.f8888f);
        }
        if (this.f8889g != null && !this.f8889g.equals("")) {
            bruVar.m10128a(7, this.f8889g);
        }
        if (this.f8890h != null && !this.f8890h.equals("")) {
            bruVar.m10128a(8, this.f8890h);
        }
        if (this.f8891i != null && !this.f8891i.equals("")) {
            bruVar.m10128a(9, this.f8891i);
        }
        if (this.f8892j != null && !this.f8892j.equals("")) {
            bruVar.m10128a(10, this.f8892j);
        }
        if (this.f8893k != null && !this.f8893k.equals("")) {
            bruVar.m10128a(11, this.f8893k);
        }
        if (this.f8894l != 0) {
            bruVar.m10125a(12, this.f8894l);
        }
        if (this.f8895m != null && this.f8895m.length > 0) {
            for (int i = 0; i < this.f8895m.length; i++) {
                bsq bsqVar = this.f8895m[i];
                if (bsqVar != null) {
                    bruVar.m10127a(13, bsqVar);
                }
            }
        }
        super.mo7777a(bruVar);
    }
}
