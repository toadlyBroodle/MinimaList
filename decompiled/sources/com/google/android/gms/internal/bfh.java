package com.google.android.gms.internal;

import com.google.firebase.database.C2226b;
import com.google.firebase.database.C2278p;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class bfh implements bdw {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bfa f8015a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ List f8016b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ bfd f8017c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ bfd f8018d;

    bfh(bfd bfdVar, bfa bfaVar, List list, bfd bfdVar2) {
        this.f8018d = bfdVar;
        this.f8015a = bfaVar;
        this.f8016b = list;
        this.f8017c = bfdVar2;
    }

    @Override // com.google.android.gms.internal.bdw
    /* JADX INFO: renamed from: a */
    public final void mo9046a(String str, String str2) {
        C2226b c2226bM9186b = bfd.m9186b(str, str2);
        this.f8018d.m9181a("Transaction", this.f8015a, c2226bM9186b);
        ArrayList arrayList = new ArrayList();
        if (c2226bM9186b != null) {
            if (c2226bM9186b.m12967a() == -1) {
                for (bfz bfzVar : this.f8016b) {
                    if (bfzVar.f8057d == bga.f8071e) {
                        bfzVar.f8057d = bga.f8072f;
                    } else {
                        bfzVar.f8057d = bga.f8068b;
                    }
                }
            } else {
                for (bfz bfzVar2 : this.f8016b) {
                    bfzVar2.f8057d = bga.f8072f;
                    bfzVar2.f8061h = c2226bM9186b;
                }
            }
            this.f8018d.m9164a(this.f8015a);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (bfz bfzVar3 : this.f8016b) {
            bfzVar3.f8057d = bga.f8070d;
            arrayList.addAll(this.f8018d.f8007p.m9287a(bfzVar3.f8062i, false, false, (bmt) this.f8018d.f7993b));
            arrayList2.add(new bfi(this, bfzVar3, C2278p.m13019a(C2278p.m13020a(this.f8017c, bfzVar3.f8054a), blf.m9611a(bfzVar3.f8065l))));
            this.f8018d.m9200a(new bhl(this.f8018d, bfzVar3.f8056c, bjs.m9481a(bfzVar3.f8054a)));
        }
        this.f8018d.m9188b((biz<List<bfz>>) this.f8018d.f7997f.m9425a(this.f8015a));
        this.f8018d.m9196f();
        this.f8017c.m9182a((List<? extends bjj>) arrayList);
        for (int i = 0; i < arrayList2.size(); i++) {
            this.f8018d.m9205b((Runnable) arrayList2.get(i));
        }
    }
}
