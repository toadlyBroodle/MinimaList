package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.cnb;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.gmsg.a */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0747a implements InterfaceC0748aa<Object> {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0762i f4612a;

    public C0747a(InterfaceC0762i interfaceC0762i) {
        this.f4612a = interfaceC0762i;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("name");
        if (str == null) {
            C1560fm.m11615e("App event with no name parameter.");
        } else {
            this.f4612a.mo5465a(str, map.get("info"));
        }
    }
}
