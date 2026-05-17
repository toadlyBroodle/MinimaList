package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.nm */
/* JADX INFO: loaded from: classes.dex */
final class C1776nm implements InterfaceC0748aa<InterfaceC1758mv> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1775nl f11178a;

    C1776nm(ViewTreeObserverOnGlobalLayoutListenerC1775nl viewTreeObserverOnGlobalLayoutListenerC1775nl) {
        this.f11178a = viewTreeObserverOnGlobalLayoutListenerC1775nl;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final /* synthetic */ void zza(InterfaceC1758mv interfaceC1758mv, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i = Integer.parseInt(str);
                synchronized (this.f11178a.f11153b) {
                    if (this.f11178a.f11176y != i) {
                        this.f11178a.f11176y = i;
                        this.f11178a.requestLayout();
                    }
                }
            } catch (Exception e) {
                C1560fm.m11613c("Exception occurred while getting webview content height", e);
            }
        }
    }
}
