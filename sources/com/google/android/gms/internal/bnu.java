package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class bnu implements cgj {

    /* JADX INFO: renamed from: a */
    private final Map<String, List<cej<?>>> f8502a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final aio f8503b;

    bnu(aio aioVar) {
        this.f8503b = aioVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final synchronized boolean m9743b(cej<?> cejVar) {
        boolean z = false;
        synchronized (this) {
            String strM10769e = cejVar.m10769e();
            if (this.f8502a.containsKey(strM10769e)) {
                List<cej<?>> arrayList = this.f8502a.get(strM10769e);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                cejVar.m10765b("waiting-for-response");
                arrayList.add(cejVar);
                this.f8502a.put(strM10769e, arrayList);
                if (C1498de.f10438a) {
                    C1498de.m11170b("Request for cacheKey=%s is in flight, putting on hold.", strM10769e);
                }
                z = true;
            } else {
                this.f8502a.put(strM10769e, null);
                cejVar.m10760a((cgj) this);
                if (C1498de.f10438a) {
                    C1498de.m11170b("new request, sending to network %s", strM10769e);
                }
            }
        }
        return z;
    }

    @Override // com.google.android.gms.internal.cgj
    /* JADX INFO: renamed from: a */
    public final synchronized void mo9744a(cej<?> cejVar) {
        String strM10769e = cejVar.m10769e();
        List<cej<?>> listRemove = this.f8502a.remove(strM10769e);
        if (listRemove != null && !listRemove.isEmpty()) {
            if (C1498de.f10438a) {
                C1498de.m11168a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(listRemove.size()), strM10769e);
            }
            cej<?> cejVarRemove = listRemove.remove(0);
            this.f8502a.put(strM10769e, listRemove);
            cejVarRemove.m10760a((cgj) this);
            try {
                this.f8503b.f6868c.put(cejVarRemove);
            } catch (InterruptedException e) {
                C1498de.m11171c("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.f8503b.m8023a();
            }
        }
    }

    @Override // com.google.android.gms.internal.cgj
    /* JADX INFO: renamed from: a */
    public final void mo9745a(cej<?> cejVar, cjk<?> cjkVar) {
        List<cej<?>> listRemove;
        if (cjkVar.f10172b == null || cjkVar.f10172b.m12577a()) {
            mo9744a(cejVar);
            return;
        }
        String strM10769e = cejVar.m10769e();
        synchronized (this) {
            listRemove = this.f8502a.remove(strM10769e);
        }
        if (listRemove != null) {
            if (C1498de.f10438a) {
                C1498de.m11168a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(listRemove.size()), strM10769e);
            }
            Iterator<cej<?>> it = listRemove.iterator();
            while (it.hasNext()) {
                this.f8503b.f6870e.mo10329a(it.next(), cjkVar);
            }
        }
    }
}
