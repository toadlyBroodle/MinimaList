package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.InterfaceC1758mv;
import com.google.android.gms.internal.cba;
import com.google.android.gms.internal.cnb;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.gmsg.j */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0763j implements InterfaceC0748aa<InterfaceC1758mv> {
    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final /* synthetic */ void zza(InterfaceC1758mv interfaceC1758mv, Map map) {
        InterfaceC1758mv interfaceC1758mv2 = interfaceC1758mv;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                C1560fm.m11615e("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                C1560fm.m11615e("No timestamp given for CSI tick.");
                return;
            }
            try {
                long j = (Long.parseLong(str4) - C0710au.m5575k().mo7252a()) + C0710au.m5575k().mo7253b();
                if (TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                interfaceC1758mv2.mo11759j().m10573a(str2, str3, j);
                return;
            } catch (NumberFormatException e) {
                C1560fm.m11613c("Malformed timestamp for CSI tick.", e);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                C1560fm.m11615e("No value given for CSI experiment.");
                return;
            }
            cba cbaVarM10571a = interfaceC1758mv2.mo11759j().m10571a();
            if (cbaVarM10571a == null) {
                C1560fm.m11615e("No ticker for WebView, dropping experiment ID.");
                return;
            } else {
                cbaVarM10571a.m10579a("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                C1560fm.m11615e("No value given for CSI extra.");
                return;
            }
            if (TextUtils.isEmpty(str6)) {
                C1560fm.m11615e("No name given for CSI extra.");
                return;
            }
            cba cbaVarM10571a2 = interfaceC1758mv2.mo11759j().m10571a();
            if (cbaVarM10571a2 == null) {
                C1560fm.m11615e("No ticker for WebView, dropping extra parameter.");
            } else {
                cbaVarM10571a2.m10579a(str6, str7);
            }
        }
    }
}
