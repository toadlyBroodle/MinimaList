package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.C1355ab;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.InterfaceC1528eh;
import com.google.android.gms.internal.cnb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.br */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0734br {

    /* JADX INFO: renamed from: a */
    private final Context f4580a;

    /* JADX INFO: renamed from: b */
    private boolean f4581b;

    /* JADX INFO: renamed from: c */
    private InterfaceC1528eh f4582c;

    /* JADX INFO: renamed from: d */
    private C1355ab f4583d;

    public C0734br(Context context, InterfaceC1528eh interfaceC1528eh, C1355ab c1355ab) {
        this.f4580a = context;
        this.f4582c = interfaceC1528eh;
        this.f4583d = c1355ab;
        if (this.f4583d == null) {
            this.f4583d = new C1355ab();
        }
    }

    /* JADX INFO: renamed from: c */
    private final boolean m5642c() {
        return (this.f4582c != null && this.f4582c.mo11207a().f10499f) || this.f4583d.f6209a;
    }

    /* JADX INFO: renamed from: a */
    public final void m5643a() {
        this.f4581b = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m5644a(String str) {
        if (m5642c()) {
            if (str == null) {
                str = "";
            }
            if (this.f4582c != null) {
                this.f4582c.mo11210a(str, null, 3);
                return;
            }
            if (!this.f4583d.f6209a || this.f4583d.f6210b == null) {
                return;
            }
            for (String str2 : this.f4583d.f6210b) {
                if (!TextUtils.isEmpty(str2)) {
                    String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    C0710au.m5569e();
                    C1596gv.m11411b(this.f4580a, "", strReplace);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5645b() {
        return !m5642c() || this.f4581b;
    }
}
