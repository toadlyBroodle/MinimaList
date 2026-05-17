package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.internal.C1515dv;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.cnb;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.gmsg.g */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0760g implements InterfaceC0748aa<Object> {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0761h f4639a;

    public C0760g(InterfaceC0761h interfaceC0761h) {
        this.f4639a = interfaceC0761h;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final void zza(Object obj, Map<String, String> map) {
        int i;
        String str;
        String str2 = map.get("action");
        if (!"grant".equals(str2)) {
            if ("video_start".equals(str2)) {
                this.f4639a.mo5691c_();
            }
        } else {
            try {
                i = Integer.parseInt(map.get("amount"));
                str = map.get("type");
            } catch (NumberFormatException e) {
                C1560fm.m11613c("Unable to parse reward amount.", e);
            }
            C1515dv c1515dv = !TextUtils.isEmpty(str) ? new C1515dv(str, i) : null;
            this.f4639a.mo5690a(c1515dv);
        }
    }
}
