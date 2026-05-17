package com.google.android.gms.ads.internal.gmsg;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.InterfaceC1758mv;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.gmsg.r */
/* JADX INFO: loaded from: classes.dex */
final class C0771r implements InterfaceC0748aa<InterfaceC1758mv> {
    C0771r() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final /* synthetic */ void zza(InterfaceC1758mv interfaceC1758mv, Map map) {
        InterfaceC1758mv interfaceC1758mv2 = interfaceC1758mv;
        WindowManager windowManager = (WindowManager) interfaceC1758mv2.getContext().getSystemService("window");
        C0710au.m5569e();
        DisplayMetrics displayMetricsM11376a = C1596gv.m11376a(windowManager);
        int i = displayMetricsM11376a.widthPixels;
        int i2 = displayMetricsM11376a.heightPixels;
        int[] iArr = new int[2];
        HashMap map2 = new HashMap();
        ((View) interfaceC1758mv2).getLocationInWindow(iArr);
        map2.put("xInPixels", Integer.valueOf(iArr[0]));
        map2.put("yInPixels", Integer.valueOf(iArr[1]));
        map2.put("windowWidthInPixels", Integer.valueOf(i));
        map2.put("windowHeightInPixels", Integer.valueOf(i2));
        interfaceC1758mv2.mo5712a("locationReady", map2);
        C1560fm.m11615e("GET LOCATION COMPILED");
    }
}
