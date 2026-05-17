package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.C0734br;
import com.google.android.gms.common.util.C1301e;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.InterfaceC1758mv;
import com.google.android.gms.internal.cjr;
import com.google.android.gms.internal.cju;
import com.google.android.gms.internal.cjw;
import com.google.android.gms.internal.cjx;
import com.google.android.gms.internal.cnb;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.gmsg.b */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0755b implements InterfaceC0748aa<InterfaceC1758mv> {

    /* JADX INFO: renamed from: c */
    private static Map<String, Integer> f4621c = C1301e.m7256a("resize", 1, "playVideo", 2, "storePicture", 3, "createCalendarEvent", 4, "setOrientationProperties", 5, "closeResizedAd", 6);

    /* JADX INFO: renamed from: a */
    private final C0734br f4622a;

    /* JADX INFO: renamed from: b */
    private final cju f4623b;

    public C0755b(C0734br c0734br, cju cjuVar) {
        this.f4622a = c0734br;
        this.f4623b = cjuVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final /* synthetic */ void zza(InterfaceC1758mv interfaceC1758mv, Map map) {
        InterfaceC1758mv interfaceC1758mv2 = interfaceC1758mv;
        int iIntValue = f4621c.get((String) map.get("a")).intValue();
        if (iIntValue != 5 && this.f4622a != null && !this.f4622a.m5645b()) {
            this.f4622a.m5644a(null);
        }
        switch (iIntValue) {
            case 1:
                this.f4623b.m11040a((Map<String, String>) map);
                break;
            case 2:
            default:
                C1560fm.m11614d("Unknown MRAID command called.");
                break;
            case 3:
                new cjx(interfaceC1758mv2, map).m11045a();
                break;
            case 4:
                new cjr(interfaceC1758mv2, map).m11034a();
                break;
            case 5:
                new cjw(interfaceC1758mv2, map).m11043a();
                break;
            case 6:
                this.f4623b.m11041a(true);
                break;
        }
    }
}
