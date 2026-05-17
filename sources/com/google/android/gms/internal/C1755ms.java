package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ms */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1755ms implements InterfaceC0748aa<InterfaceC1739mc> {

    /* JADX INFO: renamed from: a */
    private AbstractC1751mo f11074a;

    /* JADX INFO: renamed from: a */
    private static Integer m11795a(Map<String, String> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(map.get(str)));
        } catch (NumberFormatException e) {
            String str2 = map.get(str);
            C1560fm.m11615e(new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(str2).length()).append("Precache invalid numeric parameter '").append(str).append("': ").append(str2).toString());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00ed  */
    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void zza(InterfaceC1739mc interfaceC1739mc, Map map) {
        boolean z;
        InterfaceC1739mc interfaceC1739mc2 = interfaceC1739mc;
        C0710au.m5588x();
        if (map.containsKey("abort")) {
            if (this.f11074a != null) {
                this.f11074a.mo11794b();
                return;
            } else {
                if (C1749mm.m11781a(interfaceC1739mc2)) {
                    return;
                }
                C1560fm.m11615e("Precache abort but no precache task running.");
                return;
            }
        }
        String str = (String) map.get("src");
        if (str != null) {
            if (this.f11074a != null) {
                C1560fm.m11615e("Threadless precache task has already started.");
                return;
            }
            if (C1749mm.m11782b(interfaceC1739mc2) != null) {
                C1560fm.m11615e("Precache task is already running.");
                return;
            }
            if (interfaceC1739mc2.mo11756e() == null) {
                C1560fm.m11615e("Precache requires a dependency provider.");
                return;
            }
            C1738mb c1738mb = new C1738mb((String) map.get("flags"));
            Integer numM11795a = m11795a(map, "notifyBytes");
            Integer numM11795a2 = m11795a(map, "notifyMillis");
            Integer numM11795a3 = m11795a(map, "player");
            if (numM11795a3 == null) {
                numM11795a3 = 0;
            }
            AbstractC1751mo abstractC1751moMo11778a = interfaceC1739mc2.mo11756e().f4576a.mo11778a(interfaceC1739mc2, numM11795a3.intValue(), null, c1738mb);
            if ((numM11795a == null && numM11795a2 == null) ? false : true) {
                String[] strArrSplit = c1738mb.f11016a.split(",");
                int length = strArrSplit.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    String str2 = strArrSplit[i];
                    if (!str2.equals("1") && !str2.equals("2")) {
                        z = true;
                        break;
                    }
                    i++;
                }
                if (z) {
                    if (numM11795a != null) {
                        numM11795a.intValue();
                    } else {
                        numM11795a2.intValue();
                    }
                    this.f11074a = abstractC1751moMo11778a;
                } else {
                    new C1747mk(interfaceC1739mc2, abstractC1751moMo11778a, str).mo11076d();
                }
            }
        } else if (C1749mm.m11782b(interfaceC1739mc2) == null && this.f11074a == null) {
            C1560fm.m11615e("Precache must specify a source.");
            return;
        }
        Integer numM11795a4 = m11795a(map, "minBufferMs");
        if (numM11795a4 != null) {
            numM11795a4.intValue();
        }
        Integer numM11795a5 = m11795a(map, "maxBufferMs");
        if (numM11795a5 != null) {
            numM11795a5.intValue();
        }
        Integer numM11795a6 = m11795a(map, "bufferForPlaybackMs");
        if (numM11795a6 != null) {
            numM11795a6.intValue();
        }
        Integer numM11795a7 = m11795a(map, "bufferForPlaybackAfterRebufferMs");
        if (numM11795a7 != null) {
            numM11795a7.intValue();
        }
    }
}
