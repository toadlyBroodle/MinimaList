package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.C1303g;
import com.google.android.gms.internal.ajo;
import com.google.android.gms.tagmanager.InterfaceC2128h;
import com.google.android.gms.tagmanager.InterfaceC2137q;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class agu {

    /* JADX INFO: renamed from: a */
    private final Context f6741a;

    /* JADX INFO: renamed from: b */
    private final apt f6742b;

    /* JADX INFO: renamed from: c */
    private final ExecutorService f6743c;

    /* JADX INFO: renamed from: d */
    private final ScheduledExecutorService f6744d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC2137q f6745e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC2128h f6746f;

    public agu(Context context, InterfaceC2137q interfaceC2137q, InterfaceC2128h interfaceC2128h) {
        this(context, interfaceC2137q, interfaceC2128h, new apt(context), ajo.C1369a.m8057a(context), ajr.f6948a);
    }

    private agu(Context context, InterfaceC2137q interfaceC2137q, InterfaceC2128h interfaceC2128h, apt aptVar, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f6741a = ((Context) C1221aj.m7065a(context)).getApplicationContext();
        this.f6745e = (InterfaceC2137q) C1221aj.m7065a(interfaceC2137q);
        this.f6746f = (InterfaceC2128h) C1221aj.m7065a(interfaceC2128h);
        this.f6742b = (apt) C1221aj.m7065a(aptVar);
        this.f6743c = (ExecutorService) C1221aj.m7065a(executorService);
        this.f6744d = (ScheduledExecutorService) C1221aj.m7065a(scheduledExecutorService);
    }

    /* JADX INFO: renamed from: a */
    public final agl m7877a(String str, String str2, String str3) {
        return new agl(this.f6741a, str, str2, str3, new aih(this.f6741a, this.f6745e, this.f6746f, str), this.f6742b, this.f6743c, this.f6744d, this.f6745e, C1303g.m7263d(), new agv(this.f6741a, str));
    }
}
