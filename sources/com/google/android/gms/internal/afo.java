package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.internal.C1248bj;

/* JADX INFO: loaded from: classes.dex */
final class afo extends C1074a.b<aga, afr> {
    afo() {
    }

    @Override // com.google.android.gms.common.api.C1074a.b
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1074a.f mo6098a(Context context, Looper looper, C1248bj c1248bj, afr afrVar, AbstractC1079f.b bVar, AbstractC1079f.c cVar) {
        afr afrVar2 = afrVar;
        return new aga(context, looper, true, c1248bj, afrVar2 == null ? afr.f6666a : afrVar2, bVar, cVar);
    }
}
