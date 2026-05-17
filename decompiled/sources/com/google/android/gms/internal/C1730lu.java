package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* JADX INFO: renamed from: com.google.android.gms.internal.lu */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1730lu extends AbstractC1725lp {
    @Override // com.google.android.gms.internal.AbstractC1725lp
    /* JADX INFO: renamed from: a */
    public final AbstractC1724lo mo11698a(Context context, InterfaceC1739mc interfaceC1739mc, int i, boolean z, cba cbaVar, C1738mb c1738mb) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || applicationInfo.targetSdkVersion >= 11) {
            return new TextureViewSurfaceTextureListenerC1713ld(context, z, interfaceC1739mc.mo11831u().m11930d(), c1738mb, new C1740md(context, interfaceC1739mc.mo11760k(), interfaceC1739mc.mo11758i(), cbaVar, interfaceC1739mc.mo11754c()));
        }
        return null;
    }
}
