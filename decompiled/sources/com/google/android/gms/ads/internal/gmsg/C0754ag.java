package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.internal.cnb;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.gmsg.ag */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0754ag implements InterfaceC0748aa<Object> {

    /* JADX INFO: renamed from: a */
    private final Context f4620a;

    public C0754ag(Context context) {
        this.f4620a = context;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final void zza(Object obj, Map<String, String> map) {
        if (C0710au.m5590z().m11236a(this.f4620a)) {
            C0710au.m5590z().m11234a(this.f4620a, map.get("eventName"), map.get("eventId"));
        }
    }
}
