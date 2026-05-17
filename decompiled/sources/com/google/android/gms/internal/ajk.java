package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.ajo;
import com.google.android.gms.tagmanager.InterfaceC2128h;
import com.google.android.gms.tagmanager.InterfaceC2137q;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class ajk extends ahp {

    /* JADX INFO: renamed from: a */
    private final Map<String, agl> f6932a;

    /* JADX INFO: renamed from: b */
    private final ExecutorService f6933b;

    /* JADX INFO: renamed from: c */
    private final agu f6934c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC2137q f6935d;

    /* JADX INFO: renamed from: e */
    private final Context f6936e;

    private ajk(Context context, InterfaceC2137q interfaceC2137q, agu aguVar, ExecutorService executorService) {
        this.f6932a = new HashMap(1);
        C1221aj.m7065a(interfaceC2137q);
        this.f6935d = interfaceC2137q;
        this.f6934c = aguVar;
        this.f6933b = executorService;
        this.f6936e = context;
    }

    public ajk(Context context, InterfaceC2137q interfaceC2137q, InterfaceC2128h interfaceC2128h) {
        this(context, interfaceC2137q, new agu(context, interfaceC2137q, interfaceC2128h), ajo.C1369a.m8057a(context));
    }

    @Override // com.google.android.gms.internal.aho
    /* JADX INFO: renamed from: a */
    public final void mo7933a() {
        this.f6932a.clear();
    }

    @Override // com.google.android.gms.internal.aho
    /* JADX INFO: renamed from: a */
    public final void mo7934a(String str, Bundle bundle, String str2, long j, boolean z) {
        this.f6933b.execute(new ajm(this, new aha(str, bundle, str2, new Date(j), z, this.f6935d)));
    }

    @Override // com.google.android.gms.internal.aho
    /* JADX INFO: renamed from: a */
    public final void mo7935a(String str, String str2, String str3) {
        mo7936a(str, str2, str3, null);
    }

    @Override // com.google.android.gms.internal.aho
    /* JADX INFO: renamed from: a */
    public final void mo7936a(String str, String str2, String str3, ahk ahkVar) {
        this.f6933b.execute(new ajl(this, str, str2, str3, ahkVar));
    }

    @Override // com.google.android.gms.internal.aho
    /* JADX INFO: renamed from: b */
    public final void mo7937b() {
        this.f6933b.execute(new ajn(this));
    }
}
