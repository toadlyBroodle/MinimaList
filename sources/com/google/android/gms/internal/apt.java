package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.C1303g;
import com.google.android.gms.common.util.InterfaceC1300d;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class apt {

    /* JADX INFO: renamed from: a */
    private final Context f7045a;

    /* JADX INFO: renamed from: b */
    private final aqf f7046b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1300d f7047c;

    /* JADX INFO: renamed from: d */
    private String f7048d;

    /* JADX INFO: renamed from: e */
    private Map<String, apx<aqs>> f7049e;

    /* JADX INFO: renamed from: f */
    private final Map<String, aqq> f7050f;

    public apt(Context context) {
        this(context, new HashMap(), new aqf(context), C1303g.m7263d());
    }

    private apt(Context context, Map<String, aqq> map, aqf aqfVar, InterfaceC1300d interfaceC1300d) {
        this.f7048d = null;
        this.f7049e = new HashMap();
        this.f7045a = context.getApplicationContext();
        this.f7047c = interfaceC1300d;
        this.f7046b = aqfVar;
        this.f7050f = map;
    }

    /* JADX INFO: renamed from: a */
    final void m8129a(Status status, aqe aqeVar) {
        String strM8107a = aqeVar.m8145b().m8107a();
        aqs aqsVarM8146c = aqeVar.m8146c();
        if (!this.f7049e.containsKey(strM8107a)) {
            this.f7049e.put(strM8107a, new apx<>(status, aqsVarM8146c, this.f7047c.mo7252a()));
            return;
        }
        apx<aqs> apxVar = this.f7049e.get(strM8107a);
        apxVar.m8133a(this.f7047c.mo7252a());
        if (status == Status.f5451a) {
            apxVar.m8134a(status);
            apxVar.m8135a(aqsVarM8146c);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: a */
    final void m8130a(com.google.android.gms.internal.aqc r15, java.util.List<java.lang.Integer> r16, int r17, com.google.android.gms.internal.apu r18, com.google.android.gms.internal.agv r19) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.apt.m8130a(com.google.android.gms.internal.aqc, java.util.List, int, com.google.android.gms.internal.apu, com.google.android.gms.internal.agv):void");
    }

    /* JADX INFO: renamed from: a */
    public final void m8131a(String str, String str2, String str3, List<Integer> list, apu apuVar, agv agvVar) {
        C1221aj.m7074b(!list.isEmpty());
        aqc aqcVar = new aqc();
        aia aiaVarM7973a = aia.m7973a();
        m8130a(aqcVar.m8138a(new app(str, str2, str3, aiaVarM7973a.m7976b() && str.equals(aiaVarM7973a.m7978d()), aia.m7973a().m7977c())), Collections.unmodifiableList(list), 0, apuVar, agvVar);
    }
}
