package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C0710au;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cic implements chr {

    /* JADX INFO: renamed from: a */
    private final C1979v f10090a;

    /* JADX INFO: renamed from: b */
    private final cii f10091b;

    /* JADX INFO: renamed from: c */
    private final Context f10092c;

    /* JADX INFO: renamed from: d */
    private final cht f10093d;

    /* JADX INFO: renamed from: e */
    private final boolean f10094e;

    /* JADX INFO: renamed from: f */
    private final long f10095f;

    /* JADX INFO: renamed from: g */
    private final long f10096g;

    /* JADX INFO: renamed from: l */
    private final boolean f10101l;

    /* JADX INFO: renamed from: m */
    private final String f10102m;

    /* JADX INFO: renamed from: o */
    private final boolean f10104o;

    /* JADX INFO: renamed from: i */
    private final Object f10098i = new Object();

    /* JADX INFO: renamed from: j */
    private boolean f10099j = false;

    /* JADX INFO: renamed from: k */
    private final Map<InterfaceFutureC1689kg<chz>, chw> f10100k = new HashMap();

    /* JADX INFO: renamed from: n */
    private List<chz> f10103n = new ArrayList();

    /* JADX INFO: renamed from: h */
    private final int f10097h = 2;

    public cic(Context context, C1979v c1979v, cii ciiVar, cht chtVar, boolean z, boolean z2, String str, long j, long j2, int i, boolean z3) {
        this.f10092c = context;
        this.f10090a = c1979v;
        this.f10091b = ciiVar;
        this.f10093d = chtVar;
        this.f10094e = z;
        this.f10101l = z2;
        this.f10102m = str;
        this.f10095f = j;
        this.f10096g = j2;
        this.f10104o = z3;
    }

    /* JADX INFO: renamed from: a */
    private final void m10924a(InterfaceFutureC1689kg<chz> interfaceFutureC1689kg) {
        C1596gv.f10711a.post(new cie(this, interfaceFutureC1689kg));
    }

    /* JADX INFO: renamed from: b */
    private final chz m10925b(List<InterfaceFutureC1689kg<chz>> list) {
        synchronized (this.f10098i) {
            if (this.f10099j) {
                return new chz(-1);
            }
            for (InterfaceFutureC1689kg<chz> interfaceFutureC1689kg : list) {
                try {
                    chz chzVar = interfaceFutureC1689kg.get();
                    this.f10103n.add(chzVar);
                    if (chzVar != null && chzVar.f10079a == 0) {
                        m10924a(interfaceFutureC1689kg);
                        return chzVar;
                    }
                } catch (InterruptedException | ExecutionException e) {
                    C1560fm.m11613c("Exception while processing an adapter; continuing with other adapters", e);
                }
            }
            m10924a((InterfaceFutureC1689kg<chz>) null);
            return new chz(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00cb  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final chz m10928c(List<InterfaceFutureC1689kg<chz>> list) {
        chz chzVar;
        chz chzVar2;
        InterfaceFutureC1689kg<chz> interfaceFutureC1689kg;
        int iMo10904a;
        cis cisVar;
        synchronized (this.f10098i) {
            if (this.f10099j) {
                return new chz(-1);
            }
            int i = -1;
            InterfaceFutureC1689kg<chz> interfaceFutureC1689kg2 = null;
            chz chzVar3 = null;
            long j = this.f10093d.f10046m != -1 ? this.f10093d.f10046m : 10000L;
            long jMax = j;
            for (InterfaceFutureC1689kg<chz> interfaceFutureC1689kg3 : list) {
                long jMo7252a = C0710au.m5575k().mo7252a();
                if (jMax == 0) {
                    try {
                        try {
                            if (interfaceFutureC1689kg3.isDone()) {
                                chzVar = interfaceFutureC1689kg3.get();
                            }
                            this.f10103n.add(chzVar);
                            if (chzVar != null || chzVar.f10079a != 0 || (cisVar = chzVar.f10084f) == null || cisVar.mo10904a() <= i) {
                                chzVar2 = chzVar3;
                                interfaceFutureC1689kg = interfaceFutureC1689kg2;
                                iMo10904a = i;
                            } else {
                                iMo10904a = cisVar.mo10904a();
                                chz chzVar4 = chzVar;
                                interfaceFutureC1689kg = interfaceFutureC1689kg3;
                                chzVar2 = chzVar4;
                            }
                            jMax = Math.max(jMax - (C0710au.m5575k().mo7252a() - jMo7252a), 0L);
                            interfaceFutureC1689kg2 = interfaceFutureC1689kg;
                            i = iMo10904a;
                            chzVar3 = chzVar2;
                        } catch (Throwable th) {
                            Math.max(jMax - (C0710au.m5575k().mo7252a() - jMo7252a), 0L);
                            throw th;
                        }
                    } catch (RemoteException | InterruptedException | ExecutionException | TimeoutException e) {
                        C1560fm.m11613c("Exception while processing an adapter; continuing with other adapters", e);
                        jMax = Math.max(jMax - (C0710au.m5575k().mo7252a() - jMo7252a), 0L);
                    }
                }
                chzVar = interfaceFutureC1689kg3.get(jMax, TimeUnit.MILLISECONDS);
                this.f10103n.add(chzVar);
                if (chzVar != null) {
                    chzVar2 = chzVar3;
                    interfaceFutureC1689kg = interfaceFutureC1689kg2;
                    iMo10904a = i;
                    jMax = Math.max(jMax - (C0710au.m5575k().mo7252a() - jMo7252a), 0L);
                    interfaceFutureC1689kg2 = interfaceFutureC1689kg;
                    i = iMo10904a;
                    chzVar3 = chzVar2;
                }
            }
            m10924a(interfaceFutureC1689kg2);
            return chzVar3 == null ? new chz(1) : chzVar3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00fc  */
    @Override // com.google.android.gms.internal.chr
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final chz mo10862a(List<chs> list) {
        bxb bxbVar;
        C1560fm.m11610b("Starting mediation.");
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        ArrayList arrayList = new ArrayList();
        bxb bxbVar2 = this.f10090a.f11754d;
        int[] iArr = new int[2];
        if (bxbVar2.f9253g != null) {
            C0710au.m5586v();
            if (cib.m10922a(this.f10102m, iArr)) {
                int i = iArr[0];
                int i2 = iArr[1];
                bxb[] bxbVarArr = bxbVar2.f9253g;
                int length = bxbVarArr.length;
                for (int i3 = 0; i3 < length; i3++) {
                    bxbVar = bxbVarArr[i3];
                    if (i == bxbVar.f9251e && i2 == bxbVar.f9248b) {
                        break;
                    }
                }
                bxbVar = bxbVar2;
            } else {
                bxbVar = bxbVar2;
            }
        }
        for (chs chsVar : list) {
            String strValueOf = String.valueOf(chsVar.f10016b);
            C1560fm.m11614d(strValueOf.length() != 0 ? "Trying mediation network: ".concat(strValueOf) : new String("Trying mediation network: "));
            Iterator<String> it = chsVar.f10017c.iterator();
            while (it.hasNext()) {
                chw chwVar = new chw(this.f10092c, it.next(), this.f10091b, this.f10093d, chsVar, this.f10090a.f11753c, bxbVar, this.f10090a.f11761k, this.f10094e, this.f10101l, this.f10090a.f11775y, this.f10090a.f11764n, this.f10090a.f11776z, this.f10090a.f11746X, this.f10104o);
                InterfaceFutureC1689kg<chz> interfaceFutureC1689kgM11371a = C1590gp.m11371a(executorServiceNewCachedThreadPool, new cid(this, chwVar));
                this.f10100k.put(interfaceFutureC1689kgM11371a, chwVar);
                arrayList.add(interfaceFutureC1689kgM11371a);
            }
        }
        switch (this.f10097h) {
            case 2:
                return m10928c(arrayList);
            default:
                return m10925b(arrayList);
        }
    }

    @Override // com.google.android.gms.internal.chr
    /* JADX INFO: renamed from: a */
    public final void mo10863a() {
        synchronized (this.f10098i) {
            this.f10099j = true;
            Iterator<chw> it = this.f10100k.values().iterator();
            while (it.hasNext()) {
                it.next().m10901a();
            }
        }
    }

    @Override // com.google.android.gms.internal.chr
    /* JADX INFO: renamed from: b */
    public final List<chz> mo10864b() {
        return this.f10103n;
    }
}
