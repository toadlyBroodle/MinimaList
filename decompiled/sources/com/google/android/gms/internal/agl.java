package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.InterfaceC1300d;
import com.google.android.gms.tagmanager.InterfaceC2137q;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class agl {

    /* JADX INFO: renamed from: a */
    private final Context f6716a;

    /* JADX INFO: renamed from: b */
    private final String f6717b;

    /* JADX INFO: renamed from: c */
    private final String f6718c;

    /* JADX INFO: renamed from: d */
    private final String f6719d;

    /* JADX INFO: renamed from: e */
    private final aih f6720e;

    /* JADX INFO: renamed from: f */
    private final apt f6721f;

    /* JADX INFO: renamed from: g */
    private final ExecutorService f6722g;

    /* JADX INFO: renamed from: h */
    private final ScheduledExecutorService f6723h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC2137q f6724i;

    /* JADX INFO: renamed from: j */
    private final InterfaceC1300d f6725j;

    /* JADX INFO: renamed from: k */
    private final agv f6726k;

    /* JADX INFO: renamed from: l */
    private aic f6727l;

    /* JADX INFO: renamed from: m */
    private volatile int f6728m = 1;

    /* JADX INFO: renamed from: n */
    private List<aha> f6729n = new ArrayList();

    /* JADX INFO: renamed from: o */
    private ScheduledFuture<?> f6730o = null;

    /* JADX INFO: renamed from: p */
    private boolean f6731p = false;

    agl(Context context, String str, String str2, String str3, aih aihVar, apt aptVar, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, InterfaceC2137q interfaceC2137q, InterfaceC1300d interfaceC1300d, agv agvVar) {
        this.f6716a = context;
        this.f6717b = (String) C1221aj.m7065a(str);
        this.f6720e = (aih) C1221aj.m7065a(aihVar);
        this.f6721f = (apt) C1221aj.m7065a(aptVar);
        this.f6722g = (ExecutorService) C1221aj.m7065a(executorService);
        this.f6723h = (ScheduledExecutorService) C1221aj.m7065a(scheduledExecutorService);
        this.f6724i = (InterfaceC2137q) C1221aj.m7065a(interfaceC2137q);
        this.f6725j = (InterfaceC1300d) C1221aj.m7065a(interfaceC1300d);
        this.f6726k = (agv) C1221aj.m7065a(agvVar);
        this.f6718c = str3;
        this.f6719d = str2;
        this.f6729n.add(new aha("gtm.load", new Bundle(), "gtm", new Date(), false, this.f6724i));
        String str4 = this.f6717b;
        ahs.m7947d(new StringBuilder(String.valueOf(str4).length() + 35).append("Container ").append(str4).append("is scheduled for loading.").toString());
        this.f6722g.execute(new agq(this, null));
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ List m7857a(agl aglVar, List list) {
        aglVar.f6729n = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m7858a(long j) {
        if (this.f6730o != null) {
            this.f6730o.cancel(false);
        }
        String str = this.f6717b;
        ahs.m7947d(new StringBuilder(String.valueOf(str).length() + 45).append("Refresh container ").append(str).append(" in ").append(j).append("ms.").toString());
        this.f6730o = this.f6723h.schedule(new ago(this), j, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: a */
    public final void m7874a() {
        this.f6722g.execute(new agn(this));
    }

    /* JADX INFO: renamed from: a */
    public final void m7875a(aha ahaVar) {
        this.f6722g.execute(new agr(this, ahaVar));
    }
}
