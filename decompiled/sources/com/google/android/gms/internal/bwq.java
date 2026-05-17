package com.google.android.gms.internal;

import android.support.design.C0025a;

/* JADX INFO: loaded from: classes.dex */
public final class bwq extends brw<bwq> {

    /* JADX INFO: renamed from: a */
    public String f9198a = null;

    /* JADX INFO: renamed from: b */
    public long[] f9199b = bsf.f8817b;

    /* JADX INFO: renamed from: c */
    public bwp f9200c = null;

    /* JADX INFO: renamed from: d */
    public bwo f9201d = null;

    public bwq() {
        this.f8769X = null;
        this.f8813Y = -1;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f9198a != null) {
            iMo7775a += bru.m10113b(10, this.f9198a);
        }
        if (this.f9199b != null && this.f9199b.length > 0) {
            int iM10103a = 0;
            for (int i = 0; i < this.f9199b.length; i++) {
                iM10103a += bru.m10103a(this.f9199b[i]);
            }
            iMo7775a = iMo7775a + iM10103a + (this.f9199b.length * 1);
        }
        if (this.f9200c != null) {
            iMo7775a += bru.m10112b(15, this.f9200c);
        }
        return this.f9201d != null ? iMo7775a + bru.m10112b(18, this.f9201d) : iMo7775a;
    }

    @Override // com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bsc mo7776a(brt brtVar) throws bsb {
        while (true) {
            int iM10082a = brtVar.m10082a();
            switch (iM10082a) {
                case 0:
                    break;
                case 82:
                    this.f9198a = brtVar.m10093e();
                    break;
                case C0025a.j.AppCompatTheme_windowFixedHeightMajor /* 112 */:
                    int iM10172a = bsf.m10172a(brtVar, C0025a.j.AppCompatTheme_windowFixedHeightMajor);
                    int length = this.f9199b == null ? 0 : this.f9199b.length;
                    long[] jArr = new long[iM10172a + length];
                    if (length != 0) {
                        System.arraycopy(this.f9199b, 0, jArr, 0, length);
                    }
                    while (length < jArr.length - 1) {
                        jArr[length] = brtVar.m10097h();
                        brtVar.m10082a();
                        length++;
                    }
                    jArr[length] = brtVar.m10097h();
                    this.f9199b = jArr;
                    break;
                case C0025a.j.AppCompatTheme_windowFixedWidthMajor /* 114 */:
                    int iM10090c = brtVar.m10090c(brtVar.m10096g());
                    int iM10101l = brtVar.m10101l();
                    int i = 0;
                    while (brtVar.m10100k() > 0) {
                        brtVar.m10097h();
                        i++;
                    }
                    brtVar.m10094e(iM10101l);
                    int length2 = this.f9199b == null ? 0 : this.f9199b.length;
                    long[] jArr2 = new long[i + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f9199b, 0, jArr2, 0, length2);
                    }
                    while (length2 < jArr2.length) {
                        jArr2[length2] = brtVar.m10097h();
                        length2++;
                    }
                    this.f9199b = jArr2;
                    brtVar.m10091d(iM10090c);
                    break;
                case 122:
                    if (this.f9200c == null) {
                        this.f9200c = new bwp();
                    }
                    brtVar.m10084a(this.f9200c);
                    break;
                case 146:
                    if (this.f9201d == null) {
                        this.f9201d = new bwo();
                    }
                    brtVar.m10084a(this.f9201d);
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
        if (this.f9198a != null) {
            bruVar.m10128a(10, this.f9198a);
        }
        if (this.f9199b != null && this.f9199b.length > 0) {
            for (int i = 0; i < this.f9199b.length; i++) {
                bruVar.m10126a(14, this.f9199b[i]);
            }
        }
        if (this.f9200c != null) {
            bruVar.m10127a(15, this.f9200c);
        }
        if (this.f9201d != null) {
            bruVar.m10127a(18, this.f9201d);
        }
        super.mo7777a(bruVar);
    }
}
