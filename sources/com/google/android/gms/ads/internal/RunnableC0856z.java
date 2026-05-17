package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.BinderC1476cj;
import com.google.android.gms.internal.C1510dq;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.chs;
import com.google.android.gms.internal.cht;
import com.google.android.gms.internal.cim;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.z */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0856z implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ RunnableC0855y f4867a;

    RunnableC0856z(RunnableC0855y runnableC0855y) {
        this.f4867a = runnableC0855y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f4867a.f4866b.f4861a;
        Runnable runnable = this.f4867a.f4865a;
        C1221aj.m7073b("Adapters must be initialized on the main thread.");
        Map<String, cht> mapM11276e = C0710au.m5573i().m11316r().m11276e();
        if (mapM11276e == null || mapM11276e.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                C1560fm.m11613c("Could not initialize rewarded ads.", th);
                return;
            }
        }
        BinderC1476cj binderC1476cjM11005E = BinderC1476cj.m11005E();
        if (binderC1476cjM11005E != null) {
            Collection<cht> collectionValues = mapM11276e.values();
            HashMap map = new HashMap();
            InterfaceC0652a interfaceC0652aM5329a = BinderC0654c.m5329a(context);
            Iterator<cht> it = collectionValues.iterator();
            while (it.hasNext()) {
                for (chs chsVar : it.next().f10034a) {
                    String str = chsVar.f10024j;
                    for (String str2 : chsVar.f10017c) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((Collection) map.get(str2)).add(str);
                        }
                    }
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    C1510dq c1510dqM11018b = binderC1476cjM11005E.m11018b(str3);
                    if (c1510dqM11018b != null) {
                        cim cimVarM11199a = c1510dqM11018b.m11199a();
                        if (!cimVarM11199a.mo10958g() && cimVarM11199a.mo10964m()) {
                            cimVarM11199a.mo10949a(interfaceC0652aM5329a, c1510dqM11018b.m11200b(), (List<String>) entry.getValue());
                            String strValueOf = String.valueOf(str3);
                            C1560fm.m11610b(strValueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(strValueOf) : new String("Initialized rewarded video mediation adapter "));
                        }
                    }
                } catch (Throwable th2) {
                    C1560fm.m11613c(new StringBuilder(String.valueOf(str3).length() + 56).append("Failed to initialize rewarded video mediation adapter \"").append(str3).append("\"").toString(), th2);
                }
            }
        }
    }
}
