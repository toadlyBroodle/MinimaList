package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C0710au;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cjw {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1758mv f10213a;

    /* JADX INFO: renamed from: b */
    private final boolean f10214b;

    /* JADX INFO: renamed from: c */
    private final String f10215c;

    public cjw(InterfaceC1758mv interfaceC1758mv, Map<String, String> map) {
        this.f10213a = interfaceC1758mv;
        this.f10215c = map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.f10214b = Boolean.parseBoolean(map.get("allowOrientationChange"));
        } else {
            this.f10214b = true;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11043a() {
        if (this.f10213a == null) {
            C1560fm.m11615e("AdWebView is null");
        } else {
            this.f10213a.mo11816b("portrait".equalsIgnoreCase(this.f10215c) ? C0710au.m5571g().mo11472b() : "landscape".equalsIgnoreCase(this.f10215c) ? C0710au.m5571g().mo11459a() : this.f10214b ? -1 : C0710au.m5571g().mo11475c());
        }
    }
}
