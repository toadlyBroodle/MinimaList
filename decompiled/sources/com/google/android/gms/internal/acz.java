package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.RemoteException;
import com.google.android.gms.common.C1283m;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.stats.C1290a;
import com.google.android.gms.common.util.InterfaceC1300d;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class acz extends acd {

    /* JADX INFO: renamed from: a */
    private final adn f6397a;

    /* JADX INFO: renamed from: b */
    private InterfaceC2108zu f6398b;

    /* JADX INFO: renamed from: c */
    private volatile Boolean f6399c;

    /* JADX INFO: renamed from: d */
    private final AbstractC2095zh f6400d;

    /* JADX INFO: renamed from: e */
    private final aee f6401e;

    /* JADX INFO: renamed from: f */
    private final List<Runnable> f6402f;

    /* JADX INFO: renamed from: g */
    private final AbstractC2095zh f6403g;

    protected acz(abd abdVar) {
        super(abdVar);
        this.f6402f = new ArrayList();
        this.f6401e = new aee(abdVar.m7555u());
        this.f6397a = new adn(this);
        this.f6400d = new ada(this, abdVar);
        this.f6403g = new adf(this, abdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final void m7644F() {
        mo7376c();
        this.f6401e.m7704a();
        this.f6400d.m12754a(C2106zs.f12702I.m12779b().longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public final void m7645G() {
        mo7376c();
        if (m7672y()) {
            mo7393t().m7405E().m7412a("Inactivity, disconnecting from the service");
            m7661E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public final void m7646H() {
        mo7376c();
        mo7393t().m7405E().m7413a("Processing queued up service tasks", Integer.valueOf(this.f6402f.size()));
        Iterator<Runnable> it = this.f6402f.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (Throwable th) {
                mo7393t().m7410y().m7413a("Task exception while flushing queue", th);
            }
        }
        this.f6402f.clear();
        this.f6403g.m12756c();
    }

    /* JADX INFO: renamed from: a */
    private final C2084yx m7648a(boolean z) {
        return mo7380g().m12784a(z ? mo7393t().m7406F() : null);
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ InterfaceC2108zu m7649a(acz aczVar, InterfaceC2108zu interfaceC2108zu) {
        aczVar.f6398b = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m7650a(ComponentName componentName) {
        mo7376c();
        if (this.f6398b != null) {
            this.f6398b = null;
            mo7393t().m7405E().m7413a("Disconnected from device MeasurementService", componentName);
            mo7376c();
            m7659C();
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m7652a(Runnable runnable) {
        mo7376c();
        if (m7672y()) {
            runnable.run();
        } else {
            if (this.f6402f.size() >= 1000) {
                mo7393t().m7410y().m7412a("Discarding data. Max runnable queue size reached");
                return;
            }
            this.f6402f.add(runnable);
            this.f6403g.m12754a(60000L);
            m7659C();
        }
    }

    /* JADX INFO: renamed from: A */
    protected final void m7657A() {
        mo7376c();
        m7584Q();
        C2084yx c2084yxM7648a = m7648a(false);
        mo7386m().m12793y();
        m7652a(new adb(this, c2084yxM7648a));
    }

    /* JADX INFO: renamed from: B */
    protected final void m7658B() {
        mo7376c();
        m7584Q();
        m7652a(new add(this, m7648a(true)));
    }

    /* JADX INFO: renamed from: C */
    final void m7659C() {
        boolean z;
        boolean z2;
        mo7376c();
        m7584Q();
        if (m7672y()) {
            return;
        }
        if (this.f6399c == null) {
            mo7376c();
            m7584Q();
            Boolean boolM7426A = mo7394u().m7426A();
            if (boolM7426A == null || !boolM7426A.booleanValue()) {
                if (mo7380g().m12783C() != 1) {
                    mo7393t().m7405E().m7412a("Checking service availability");
                    int iMo7040a = C1283m.m7222b().mo7040a(mo7389p().mo7385l());
                    switch (iMo7040a) {
                        case 0:
                            mo7393t().m7405E().m7412a("Service available");
                            z = true;
                            z2 = true;
                            break;
                        case 1:
                            mo7393t().m7405E().m7412a("Service missing");
                            z = true;
                            z2 = false;
                            break;
                        case 2:
                            mo7393t().m7404D().m7412a("Service container out of date");
                            aek aekVarMo7389p = mo7389p();
                            C1283m.m7222b();
                            if (C1283m.m7225d(aekVarMo7389p.mo7385l()) >= 11400) {
                                Boolean boolM7426A2 = mo7394u().m7426A();
                                z2 = boolM7426A2 == null || boolM7426A2.booleanValue();
                                z = false;
                            } else {
                                z = true;
                                z2 = false;
                            }
                            break;
                        case 3:
                            mo7393t().m7401A().m7412a("Service disabled");
                            z = false;
                            z2 = false;
                            break;
                        case 9:
                            mo7393t().m7401A().m7412a("Service invalid");
                            z = false;
                            z2 = false;
                            break;
                        case 18:
                            mo7393t().m7401A().m7412a("Service updating");
                            z = true;
                            z2 = true;
                            break;
                        default:
                            mo7393t().m7401A().m7413a("Unexpected service status", Integer.valueOf(iMo7040a));
                            z = false;
                            z2 = false;
                            break;
                    }
                } else {
                    z = true;
                    z2 = true;
                }
                if (z) {
                    mo7394u().m7430a(z2);
                }
            } else {
                z2 = true;
            }
            this.f6399c = Boolean.valueOf(z2);
        }
        if (this.f6399c.booleanValue()) {
            this.f6397a.m7676a();
            return;
        }
        List<ResolveInfo> listQueryIntentServices = mo7385l().getPackageManager().queryIntentServices(new Intent().setClassName(mo7385l(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (!(listQueryIntentServices != null && listQueryIntentServices.size() > 0)) {
            mo7393t().m7410y().m7412a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(mo7385l(), "com.google.android.gms.measurement.AppMeasurementService"));
        this.f6397a.m7677a(intent);
    }

    /* JADX INFO: renamed from: D */
    final Boolean m7660D() {
        return this.f6399c;
    }

    /* JADX INFO: renamed from: E */
    public final void m7661E() {
        mo7376c();
        m7584Q();
        try {
            C1290a.m7240a();
            mo7385l().unbindService(this.f6397a);
        } catch (IllegalArgumentException e) {
        } catch (IllegalStateException e2) {
        }
        this.f6398b = null;
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7372a() {
        super.mo7372a();
    }

    /* JADX INFO: renamed from: a */
    protected final void m7662a(aeh aehVar) {
        mo7376c();
        m7584Q();
        m7652a(new adl(this, mo7386m().m12790a(aehVar), aehVar, m7648a(true)));
    }

    /* JADX INFO: renamed from: a */
    protected final void m7663a(C2088za c2088za) {
        C1221aj.m7065a(c2088za);
        mo7376c();
        m7584Q();
        m7652a(new adi(this, true, mo7386m().m12791a(c2088za), new C2088za(c2088za), m7648a(true), c2088za));
    }

    /* JADX INFO: renamed from: a */
    protected final void m7664a(C2104zq c2104zq, String str) {
        C1221aj.m7065a(c2104zq);
        mo7376c();
        m7584Q();
        m7652a(new adh(this, true, mo7386m().m12792a(c2104zq), c2104zq, m7648a(true), str));
    }

    /* JADX INFO: renamed from: a */
    protected final void m7665a(InterfaceC2108zu interfaceC2108zu) {
        mo7376c();
        C1221aj.m7065a(interfaceC2108zu);
        this.f6398b = interfaceC2108zu;
        m7644F();
        m7646H();
    }

    /* JADX INFO: renamed from: a */
    final void m7666a(InterfaceC2108zu interfaceC2108zu, AbstractC2011we abstractC2011we, C2084yx c2084yx) {
        mo7376c();
        m7584Q();
        int size = 100;
        for (int i = 0; i < 1001 && size == 100; i++) {
            ArrayList arrayList = new ArrayList();
            List<AbstractC2011we> listM12789a = mo7386m().m12789a(100);
            if (listM12789a != null) {
                arrayList.addAll(listM12789a);
                size = listM12789a.size();
            } else {
                size = 0;
            }
            if (abstractC2011we != null && size < 100) {
                arrayList.add(abstractC2011we);
            }
            ArrayList arrayList2 = arrayList;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj = arrayList2.get(i2);
                i2++;
                AbstractC2011we abstractC2011we2 = (AbstractC2011we) obj;
                if (abstractC2011we2 instanceof C2104zq) {
                    try {
                        interfaceC2108zu.mo7577a((C2104zq) abstractC2011we2, c2084yx);
                    } catch (RemoteException e) {
                        mo7393t().m7410y().m7413a("Failed to send event to the service", e);
                    }
                } else if (abstractC2011we2 instanceof aeh) {
                    try {
                        interfaceC2108zu.mo7573a((aeh) abstractC2011we2, c2084yx);
                    } catch (RemoteException e2) {
                        mo7393t().m7410y().m7413a("Failed to send attribute to the service", e2);
                    }
                } else if (abstractC2011we2 instanceof C2088za) {
                    try {
                        interfaceC2108zu.mo7576a((C2088za) abstractC2011we2, c2084yx);
                    } catch (RemoteException e3) {
                        mo7393t().m7410y().m7413a("Failed to send conditional property to the service", e3);
                    }
                } else {
                    mo7393t().m7410y().m7412a("Discarding data. Unrecognized parcel type.");
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m7667a(AppMeasurement.C2120g c2120g) {
        mo7376c();
        m7584Q();
        m7652a(new ade(this, c2120g));
    }

    /* JADX INFO: renamed from: a */
    public final void m7668a(AtomicReference<String> atomicReference) {
        mo7376c();
        m7584Q();
        m7652a(new adc(this, atomicReference, m7648a(false)));
    }

    /* JADX INFO: renamed from: a */
    protected final void m7669a(AtomicReference<List<C2088za>> atomicReference, String str, String str2, String str3) {
        mo7376c();
        m7584Q();
        m7652a(new adj(this, atomicReference, str, str2, str3, m7648a(false)));
    }

    /* JADX INFO: renamed from: a */
    protected final void m7670a(AtomicReference<List<aeh>> atomicReference, String str, String str2, String str3, boolean z) {
        mo7376c();
        m7584Q();
        m7652a(new adk(this, atomicReference, str, str2, str3, z, m7648a(false)));
    }

    /* JADX INFO: renamed from: a */
    protected final void m7671a(AtomicReference<List<aeh>> atomicReference, boolean z) {
        mo7376c();
        m7584Q();
        m7652a(new adm(this, atomicReference, m7648a(false), z));
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo7374b() {
        super.mo7374b();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo7376c() {
        super.mo7376c();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ C2079ys mo7377d() {
        return super.mo7377d();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ C2086yz mo7378e() {
        return super.mo7378e();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ acf mo7379f() {
        return super.mo7379f();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ C2111zx mo7380g() {
        return super.mo7380g();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ C2097zj mo7381h() {
        return super.mo7381h();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ acz mo7382i() {
        return super.mo7382i();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ acv mo7383j() {
        return super.mo7383j();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ InterfaceC1300d mo7384k() {
        return super.mo7384k();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ Context mo7385l() {
        return super.mo7385l();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ C2112zy mo7386m() {
        return super.mo7386m();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ C2091zd mo7387n() {
        return super.mo7387n();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: o */
    public final /* bridge */ /* synthetic */ aaa mo7388o() {
        return super.mo7388o();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: p */
    public final /* bridge */ /* synthetic */ aek mo7389p() {
        return super.mo7389p();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: q */
    public final /* bridge */ /* synthetic */ aax mo7390q() {
        return super.mo7390q();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: r */
    public final /* bridge */ /* synthetic */ adz mo7391r() {
        return super.mo7391r();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: s */
    public final /* bridge */ /* synthetic */ aay mo7392s() {
        return super.mo7392s();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: t */
    public final /* bridge */ /* synthetic */ aac mo7393t() {
        return super.mo7393t();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: u */
    public final /* bridge */ /* synthetic */ aan mo7394u() {
        return super.mo7394u();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: v */
    public final /* bridge */ /* synthetic */ C2090zc mo7395v() {
        return super.mo7395v();
    }

    @Override // com.google.android.gms.internal.acd
    /* JADX INFO: renamed from: w */
    protected final boolean mo7396w() {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m7672y() {
        mo7376c();
        m7584Q();
        return this.f6398b != null;
    }

    /* JADX INFO: renamed from: z */
    protected final void m7673z() {
        mo7376c();
        m7584Q();
        m7652a(new adg(this, m7648a(true)));
    }
}
