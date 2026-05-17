package com.google.android.gms.cast;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.cast.C0991e;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.internal.C1248bj;
import com.google.android.gms.internal.C1973uu;

/* JADX INFO: renamed from: com.google.android.gms.cast.ab */
/* JADX INFO: loaded from: classes.dex */
final class C0981ab extends C1074a.b<C1973uu, C0991e.c> {
    C0981ab() {
    }

    @Override // com.google.android.gms.common.api.C1074a.b
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1074a.f mo6098a(Context context, Looper looper, C1248bj c1248bj, C0991e.c cVar, AbstractC1079f.b bVar, AbstractC1079f.c cVar2) {
        C0991e.c cVar3 = cVar;
        C1221aj.m7066a(cVar3, "Setting the API options is required.");
        return new C1973uu(context, looper, c1248bj, cVar3.f5208a, cVar3.f5211d, cVar3.f5209b, cVar3.f5210c, bVar, cVar2);
    }
}
