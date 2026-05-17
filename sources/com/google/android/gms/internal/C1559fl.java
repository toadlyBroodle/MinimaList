package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.p046c.C0677a;
import com.google.android.gms.common.C1205d;
import com.google.android.gms.common.C1206e;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.fl */
/* JADX INFO: loaded from: classes.dex */
final class C1559fl extends AbstractC1556fi {

    /* JADX INFO: renamed from: a */
    private Context f10653a;

    C1559fl(Context context) {
        this.f10653a = context;
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        boolean zM5402b;
        try {
            zM5402b = C0677a.m5402b(this.f10653a);
        } catch (C1205d | C1206e | IOException | IllegalStateException e) {
            C1560fm.m11611b("Fail to get isAdIdFakeForDebugLogging", e);
            zM5402b = false;
        }
        C1661jf.m11592a(zM5402b);
        C1560fm.m11615e(new StringBuilder(43).append("Update ad debug logging enablement as ").append(zM5402b).toString());
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: b */
    public final void mo5770b() {
    }
}
