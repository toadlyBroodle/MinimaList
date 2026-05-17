package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.mj */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1746mj implements InterfaceC0748aa<InterfaceC1739mc> {
    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final /* synthetic */ void zza(InterfaceC1739mc interfaceC1739mc, Map map) {
        BinderC1779np binderC1779np;
        InterfaceC1739mc interfaceC1739mc2 = interfaceC1739mc;
        if (((Boolean) bxm.m10409f().m10546a(can.f9513bg)).booleanValue()) {
            BinderC1779np binderC1779npMo11753b = interfaceC1739mc2.mo11753b();
            if (binderC1779npMo11753b == null) {
                try {
                    BinderC1779np binderC1779np2 = new BinderC1779np(interfaceC1739mc2, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                    interfaceC1739mc2.mo11750a(binderC1779np2);
                    binderC1779np = binderC1779np2;
                } catch (NullPointerException | NumberFormatException e) {
                    C1560fm.m11611b("Unable to parse videoMeta message.", e);
                    C0710au.m5573i().m11292a(e, "VideoMetaGmsgHandler.onGmsg");
                    return;
                }
            } else {
                binderC1779np = binderC1779npMo11753b;
            }
            boolean zEquals = "1".equals(map.get("muted"));
            float f = Float.parseFloat((String) map.get("currentTime"));
            int i = Integer.parseInt((String) map.get("playbackState"));
            int i2 = (i < 0 || 3 < i) ? 0 : i;
            String str = (String) map.get("aspectRatio");
            float f2 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
            if (C1560fm.m11609a(3)) {
                C1560fm.m11610b(new StringBuilder(String.valueOf(str).length() + 79).append("Video Meta GMSG: isMuted : ").append(zEquals).append(" , playbackState : ").append(i2).append(" , aspectRatio : ").append(str).toString());
            }
            binderC1779np.m11913a(f, i2, zEquals, f2);
        }
    }
}
