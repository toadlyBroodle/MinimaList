package com.google.android.gms.internal;

import android.support.design.C0025a;

/* JADX INFO: renamed from: com.google.android.gms.internal.uf */
/* JADX INFO: loaded from: classes.dex */
public final class C1958uf extends brw<C1958uf> {

    /* JADX INFO: renamed from: v */
    private static volatile C1958uf[] f11638v;

    /* JADX INFO: renamed from: g */
    public Integer f11645g;

    /* JADX INFO: renamed from: k */
    public Integer f11649k;

    /* JADX INFO: renamed from: a */
    public Long f11639a = null;

    /* JADX INFO: renamed from: b */
    public Long f11640b = null;

    /* JADX INFO: renamed from: c */
    public Long f11641c = null;

    /* JADX INFO: renamed from: d */
    public Long f11642d = null;

    /* JADX INFO: renamed from: e */
    public Long f11643e = null;

    /* JADX INFO: renamed from: f */
    public Long f11644f = null;

    /* JADX INFO: renamed from: h */
    public Long f11646h = null;

    /* JADX INFO: renamed from: i */
    public Long f11647i = null;

    /* JADX INFO: renamed from: j */
    public Long f11648j = null;

    /* JADX INFO: renamed from: l */
    public Long f11650l = null;

    /* JADX INFO: renamed from: m */
    public Long f11651m = null;

    /* JADX INFO: renamed from: n */
    public Long f11652n = null;

    /* JADX INFO: renamed from: o */
    public Long f11653o = null;

    /* JADX INFO: renamed from: p */
    public Long f11654p = null;

    /* JADX INFO: renamed from: q */
    public Long f11655q = null;

    /* JADX INFO: renamed from: r */
    public Long f11656r = null;

    /* JADX INFO: renamed from: s */
    public Long f11657s = null;

    /* JADX INFO: renamed from: t */
    public Long f11658t = null;

    /* JADX INFO: renamed from: u */
    public Long f11659u = null;

    public C1958uf() {
        this.f8813Y = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1958uf mo7776a(brt brtVar) throws bsb {
        while (true) {
            int iM10082a = brtVar.m10082a();
            switch (iM10082a) {
                case 0:
                    break;
                case 8:
                    this.f11639a = Long.valueOf(brtVar.m10097h());
                    break;
                case 16:
                    this.f11640b = Long.valueOf(brtVar.m10097h());
                    break;
                case 24:
                    this.f11641c = Long.valueOf(brtVar.m10097h());
                    break;
                case 32:
                    this.f11642d = Long.valueOf(brtVar.m10097h());
                    break;
                case 40:
                    this.f11643e = Long.valueOf(brtVar.m10097h());
                    break;
                case 48:
                    this.f11644f = Long.valueOf(brtVar.m10097h());
                    break;
                case 56:
                    int iM10101l = brtVar.m10101l();
                    try {
                        this.f11645g = Integer.valueOf(C1930te.m12310a(brtVar.m10096g()));
                    } catch (IllegalArgumentException e) {
                        brtVar.m10094e(iM10101l);
                        m10136a(brtVar, iM10082a);
                    }
                    break;
                case 64:
                    this.f11646h = Long.valueOf(brtVar.m10097h());
                    break;
                case 72:
                    this.f11647i = Long.valueOf(brtVar.m10097h());
                    break;
                case 80:
                    this.f11648j = Long.valueOf(brtVar.m10097h());
                    break;
                case 88:
                    int iM10101l2 = brtVar.m10101l();
                    try {
                        this.f11649k = Integer.valueOf(C1930te.m12310a(brtVar.m10096g()));
                    } catch (IllegalArgumentException e2) {
                        brtVar.m10094e(iM10101l2);
                        m10136a(brtVar, iM10082a);
                    }
                    break;
                case 96:
                    this.f11650l = Long.valueOf(brtVar.m10097h());
                    break;
                case 104:
                    this.f11651m = Long.valueOf(brtVar.m10097h());
                    break;
                case C0025a.j.AppCompatTheme_windowFixedHeightMajor /* 112 */:
                    this.f11652n = Long.valueOf(brtVar.m10097h());
                    break;
                case 120:
                    this.f11653o = Long.valueOf(brtVar.m10097h());
                    break;
                case 128:
                    this.f11654p = Long.valueOf(brtVar.m10097h());
                    break;
                case 136:
                    this.f11655q = Long.valueOf(brtVar.m10097h());
                    break;
                case 144:
                    this.f11656r = Long.valueOf(brtVar.m10097h());
                    break;
                case 152:
                    this.f11657s = Long.valueOf(brtVar.m10097h());
                    break;
                case 160:
                    this.f11658t = Long.valueOf(brtVar.m10097h());
                    break;
                case 168:
                    this.f11659u = Long.valueOf(brtVar.m10097h());
                    break;
                default:
                    if (!super.m10136a(brtVar, iM10082a)) {
                    }
                    break;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public static C1958uf[] m12364b() {
        if (f11638v == null) {
            synchronized (bsa.f8811b) {
                if (f11638v == null) {
                    f11638v = new C1958uf[0];
                }
            }
        }
        return f11638v;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected final int mo7775a() {
        int iMo7775a = super.mo7775a();
        if (this.f11639a != null) {
            iMo7775a += bru.m10118c(1, this.f11639a.longValue());
        }
        if (this.f11640b != null) {
            iMo7775a += bru.m10118c(2, this.f11640b.longValue());
        }
        if (this.f11641c != null) {
            iMo7775a += bru.m10118c(3, this.f11641c.longValue());
        }
        if (this.f11642d != null) {
            iMo7775a += bru.m10118c(4, this.f11642d.longValue());
        }
        if (this.f11643e != null) {
            iMo7775a += bru.m10118c(5, this.f11643e.longValue());
        }
        if (this.f11644f != null) {
            iMo7775a += bru.m10118c(6, this.f11644f.longValue());
        }
        if (this.f11645g != null) {
            iMo7775a += bru.m10111b(7, this.f11645g.intValue());
        }
        if (this.f11646h != null) {
            iMo7775a += bru.m10118c(8, this.f11646h.longValue());
        }
        if (this.f11647i != null) {
            iMo7775a += bru.m10118c(9, this.f11647i.longValue());
        }
        if (this.f11648j != null) {
            iMo7775a += bru.m10118c(10, this.f11648j.longValue());
        }
        if (this.f11649k != null) {
            iMo7775a += bru.m10111b(11, this.f11649k.intValue());
        }
        if (this.f11650l != null) {
            iMo7775a += bru.m10118c(12, this.f11650l.longValue());
        }
        if (this.f11651m != null) {
            iMo7775a += bru.m10118c(13, this.f11651m.longValue());
        }
        if (this.f11652n != null) {
            iMo7775a += bru.m10118c(14, this.f11652n.longValue());
        }
        if (this.f11653o != null) {
            iMo7775a += bru.m10118c(15, this.f11653o.longValue());
        }
        if (this.f11654p != null) {
            iMo7775a += bru.m10118c(16, this.f11654p.longValue());
        }
        if (this.f11655q != null) {
            iMo7775a += bru.m10118c(17, this.f11655q.longValue());
        }
        if (this.f11656r != null) {
            iMo7775a += bru.m10118c(18, this.f11656r.longValue());
        }
        if (this.f11657s != null) {
            iMo7775a += bru.m10118c(19, this.f11657s.longValue());
        }
        if (this.f11658t != null) {
            iMo7775a += bru.m10118c(20, this.f11658t.longValue());
        }
        return this.f11659u != null ? iMo7775a + bru.m10118c(21, this.f11659u.longValue()) : iMo7775a;
    }

    @Override // com.google.android.gms.internal.brw, com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    public final void mo7777a(bru bruVar) throws brv {
        if (this.f11639a != null) {
            bruVar.m10132b(1, this.f11639a.longValue());
        }
        if (this.f11640b != null) {
            bruVar.m10132b(2, this.f11640b.longValue());
        }
        if (this.f11641c != null) {
            bruVar.m10132b(3, this.f11641c.longValue());
        }
        if (this.f11642d != null) {
            bruVar.m10132b(4, this.f11642d.longValue());
        }
        if (this.f11643e != null) {
            bruVar.m10132b(5, this.f11643e.longValue());
        }
        if (this.f11644f != null) {
            bruVar.m10132b(6, this.f11644f.longValue());
        }
        if (this.f11645g != null) {
            bruVar.m10125a(7, this.f11645g.intValue());
        }
        if (this.f11646h != null) {
            bruVar.m10132b(8, this.f11646h.longValue());
        }
        if (this.f11647i != null) {
            bruVar.m10132b(9, this.f11647i.longValue());
        }
        if (this.f11648j != null) {
            bruVar.m10132b(10, this.f11648j.longValue());
        }
        if (this.f11649k != null) {
            bruVar.m10125a(11, this.f11649k.intValue());
        }
        if (this.f11650l != null) {
            bruVar.m10132b(12, this.f11650l.longValue());
        }
        if (this.f11651m != null) {
            bruVar.m10132b(13, this.f11651m.longValue());
        }
        if (this.f11652n != null) {
            bruVar.m10132b(14, this.f11652n.longValue());
        }
        if (this.f11653o != null) {
            bruVar.m10132b(15, this.f11653o.longValue());
        }
        if (this.f11654p != null) {
            bruVar.m10132b(16, this.f11654p.longValue());
        }
        if (this.f11655q != null) {
            bruVar.m10132b(17, this.f11655q.longValue());
        }
        if (this.f11656r != null) {
            bruVar.m10132b(18, this.f11656r.longValue());
        }
        if (this.f11657s != null) {
            bruVar.m10132b(19, this.f11657s.longValue());
        }
        if (this.f11658t != null) {
            bruVar.m10132b(20, this.f11658t.longValue());
        }
        if (this.f11659u != null) {
            bruVar.m10132b(21, this.f11659u.longValue());
        }
        super.mo7777a(bruVar);
    }
}
