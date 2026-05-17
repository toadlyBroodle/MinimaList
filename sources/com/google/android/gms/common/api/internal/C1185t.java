package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1074a;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.t */
/* JADX INFO: loaded from: classes.dex */
final class C1185t extends AbstractRunnableC1189x {

    /* JADX INFO: renamed from: a */
    private final ArrayList<C1074a.f> f5811a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1179n f5812b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1185t(C1179n c1179n, ArrayList<C1074a.f> arrayList) {
        super(c1179n, null);
        this.f5812b = c1179n;
        this.f5811a = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractRunnableC1189x
    /* JADX INFO: renamed from: a */
    public final void mo7023a() {
        this.f5812b.f5781a.f5560d.f5523c = this.f5812b.m7018i();
        ArrayList<C1074a.f> arrayList = this.f5811a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C1074a.f fVar = arrayList.get(i);
            i++;
            fVar.m6638a(this.f5812b.f5795o, this.f5812b.f5781a.f5560d.f5523c);
        }
    }
}
