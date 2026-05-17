package com.google.firebase.auth.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C1221aj;
import java.util.List;

/* JADX INFO: renamed from: com.google.firebase.auth.internal.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2181d {

    /* JADX INFO: renamed from: a */
    private C2184g f12805a;

    /* JADX INFO: renamed from: b */
    private C2180c f12806b;

    public C2181d(C2184g c2184g) {
        this.f12805a = (C2184g) C1221aj.m7065a(c2184g);
        List<C2182e> listM12878k = this.f12805a.m12878k();
        this.f12806b = null;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= listM12878k.size()) {
                break;
            }
            if (!TextUtils.isEmpty(listM12878k.get(i2).m12860d())) {
                this.f12806b = new C2180c(listM12878k.get(i2).mo12862j(), listM12878k.get(i2).m12860d(), c2184g.m12879l());
            }
            i = i2 + 1;
        }
        if (this.f12806b == null) {
            this.f12806b = new C2180c(c2184g.m12879l());
        }
    }
}
