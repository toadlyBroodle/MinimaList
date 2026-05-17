package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.p018i.C0207a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.InterfaceC1300d;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.p051b.AbstractC0964e;
import com.google.android.gms.p051b.C0967h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class acf extends acd {

    /* JADX INFO: renamed from: a */
    protected acu f6332a;

    /* JADX INFO: renamed from: b */
    private AppMeasurement.InterfaceC2115b f6333b;

    /* JADX INFO: renamed from: c */
    private final Set<AppMeasurement.InterfaceC2116c> f6334c;

    /* JADX INFO: renamed from: d */
    private boolean f6335d;

    /* JADX INFO: renamed from: e */
    private final AtomicReference<String> f6336e;

    protected acf(abd abdVar) {
        super(abdVar);
        this.f6334c = new CopyOnWriteArraySet();
        this.f6336e = new AtomicReference<>();
    }

    /* JADX INFO: renamed from: a */
    private final void m7591a(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2;
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle);
            for (String str4 : bundle2.keySet()) {
                Object obj = bundle2.get(str4);
                if (obj instanceof Bundle) {
                    bundle2.putBundle(str4, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (i2 < parcelableArr.length) {
                            if (parcelableArr[i2] instanceof Bundle) {
                                parcelableArr[i2] = new Bundle((Bundle) parcelableArr[i2]);
                            }
                            i = i2 + 1;
                        }
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    int i3 = 0;
                    while (true) {
                        int i4 = i3;
                        if (i4 < arrayList.size()) {
                            Object obj2 = arrayList.get(i4);
                            if (obj2 instanceof Bundle) {
                                arrayList.set(i4, new Bundle((Bundle) obj2));
                            }
                            i3 = i4 + 1;
                        }
                    }
                }
            }
        }
        mo7392s().m7479a(new acn(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    /* JADX INFO: renamed from: a */
    private final void m7592a(String str, String str2, long j, Object obj) {
        mo7392s().m7479a(new aco(this, str, str2, obj, j));
    }

    /* JADX INFO: renamed from: a */
    private final void m7593a(String str, String str2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        m7591a(str, str2, mo7384k().mo7252a(), bundle, true, z2, z3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m7594a(String str, String str2, Object obj, long j) {
        C1221aj.m7067a(str);
        C1221aj.m7067a(str2);
        mo7376c();
        m7584Q();
        if (!this.f6329p.m7512B()) {
            mo7393t().m7404D().m7412a("User property not set since app measurement is disabled");
        } else if (this.f6329p.m7534b()) {
            mo7393t().m7404D().m7414a("Setting user property (FE)", mo7388o().m7371a(str2), obj);
            mo7382i().m7662a(new aeh(str2, j, obj, str));
        }
    }

    /* JADX INFO: renamed from: b */
    private final List<AppMeasurement.ConditionalUserProperty> m7595b(String str, String str2, String str3) {
        if (mo7392s().m7482z()) {
            mo7393t().m7410y().m7412a("Cannot get conditional user properties from analytics worker thread");
            return Collections.emptyList();
        }
        mo7392s();
        if (aay.m7476y()) {
            mo7393t().m7410y().m7412a("Cannot get conditional user properties from main thread");
            return Collections.emptyList();
        }
        AtomicReference atomicReference = new AtomicReference();
        synchronized (atomicReference) {
            this.f6329p.m7542h().m7479a(new acj(this, atomicReference, str, str2, str3));
            try {
                atomicReference.wait(5000L);
            } catch (InterruptedException e) {
                mo7393t().m7401A().m7414a("Interrupted waiting for get conditional user properties", str, e);
            }
        }
        List<C2088za> list = (List) atomicReference.get();
        if (list == null) {
            mo7393t().m7401A().m7413a("Timed out waiting for get conditional user properties", str);
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C2088za c2088za : list) {
            AppMeasurement.ConditionalUserProperty conditionalUserProperty = new AppMeasurement.ConditionalUserProperty();
            conditionalUserProperty.mAppId = str;
            conditionalUserProperty.mOrigin = str2;
            conditionalUserProperty.mCreationTimestamp = c2088za.f12638d;
            conditionalUserProperty.mName = c2088za.f12637c.f6488a;
            conditionalUserProperty.mValue = c2088za.f12637c.m7712a();
            conditionalUserProperty.mActive = c2088za.f12639e;
            conditionalUserProperty.mTriggerEventName = c2088za.f12640f;
            if (c2088za.f12641g != null) {
                conditionalUserProperty.mTimedOutEventName = c2088za.f12641g.f12690a;
                if (c2088za.f12641g.f12691b != null) {
                    conditionalUserProperty.mTimedOutEventParams = c2088za.f12641g.f12691b.m12769b();
                }
            }
            conditionalUserProperty.mTriggerTimeout = c2088za.f12642h;
            if (c2088za.f12643i != null) {
                conditionalUserProperty.mTriggeredEventName = c2088za.f12643i.f12690a;
                if (c2088za.f12643i.f12691b != null) {
                    conditionalUserProperty.mTriggeredEventParams = c2088za.f12643i.f12691b.m12769b();
                }
            }
            conditionalUserProperty.mTriggeredTimestamp = c2088za.f12637c.f6489b;
            conditionalUserProperty.mTimeToLive = c2088za.f12644j;
            if (c2088za.f12645k != null) {
                conditionalUserProperty.mExpiredEventName = c2088za.f12645k.f12690a;
                if (c2088za.f12645k.f12691b != null) {
                    conditionalUserProperty.mExpiredEventParams = c2088za.f12645k.f12691b.m12769b();
                }
            }
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    private final Map<String, Object> m7596b(String str, String str2, String str3, boolean z) {
        if (mo7392s().m7482z()) {
            mo7393t().m7410y().m7412a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        mo7392s();
        if (aay.m7476y()) {
            mo7393t().m7410y().m7412a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        synchronized (atomicReference) {
            this.f6329p.m7542h().m7479a(new ack(this, atomicReference, str, str2, str3, z));
            try {
                atomicReference.wait(5000L);
            } catch (InterruptedException e) {
                mo7393t().m7401A().m7413a("Interrupted waiting for get user properties", e);
            }
        }
        List<aeh> list = (List) atomicReference.get();
        if (list == null) {
            mo7393t().m7401A().m7412a("Timed out waiting for get user properties");
            return Collections.emptyMap();
        }
        C0207a c0207a = new C0207a(list.size());
        for (aeh aehVar : list) {
            c0207a.put(aehVar.f6488a, aehVar.m7712a());
        }
        return c0207a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m7598b(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        int length;
        C1221aj.m7067a(str);
        C1221aj.m7067a(str2);
        C1221aj.m7065a(bundle);
        mo7376c();
        m7584Q();
        if (!this.f6329p.m7512B()) {
            mo7393t().m7404D().m7412a("Event not sent since app measurement is disabled");
            return;
        }
        if (!this.f6335d) {
            this.f6335d = true;
            try {
                try {
                    Class.forName("com.google.android.gms.tagmanager.TagManagerService").getDeclaredMethod("initialize", Context.class).invoke(null, mo7385l());
                } catch (Exception e) {
                    mo7393t().m7401A().m7413a("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException e2) {
                mo7393t().m7403C().m7412a("Tag Manager is not found and thus will not be used");
            }
        }
        boolean zEquals = "am".equals(str);
        boolean zM7739i = aek.m7739i(str2);
        if (z && this.f6333b != null && !zM7739i && !zEquals) {
            mo7393t().m7404D().m7414a("Passing event to registered event handler (FE)", mo7388o().m7371a(str2), mo7388o().m7365a(bundle));
            this.f6333b.mo12797a(str, str2, bundle, j);
            return;
        }
        if (this.f6329p.m7534b()) {
            int iM7763c = mo7389p().m7763c(str2);
            if (iM7763c != 0) {
                mo7389p();
                this.f6329p.m7549o().m7755a(str3, iM7763c, "_ev", aek.m7716a(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            List<String> listSingletonList = Collections.singletonList("_o");
            Bundle bundleM7747a = mo7389p().m7747a(str2, bundle, listSingletonList, z3, true);
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleM7747a);
            long jNextLong = mo7389p().m7773z().nextLong();
            int i = 0;
            String[] strArr = (String[]) bundleM7747a.keySet().toArray(new String[bundle.size()]);
            Arrays.sort(strArr);
            int length2 = strArr.length;
            int i2 = 0;
            while (i2 < length2) {
                String str4 = strArr[i2];
                Object obj = bundleM7747a.get(str4);
                mo7389p();
                Bundle[] bundleArrM7731a = aek.m7731a(obj);
                if (bundleArrM7731a != null) {
                    bundleM7747a.putInt(str4, bundleArrM7731a.length);
                    int i3 = 0;
                    while (true) {
                        int i4 = i3;
                        if (i4 >= bundleArrM7731a.length) {
                            break;
                        }
                        Bundle bundleM7747a2 = mo7389p().m7747a("_ep", bundleArrM7731a[i4], listSingletonList, z3, false);
                        bundleM7747a2.putString("_en", str2);
                        bundleM7747a2.putLong("_eid", jNextLong);
                        bundleM7747a2.putString("_gn", str4);
                        bundleM7747a2.putInt("_ll", bundleArrM7731a.length);
                        bundleM7747a2.putInt("_i", i4);
                        arrayList.add(bundleM7747a2);
                        i3 = i4 + 1;
                    }
                    length = bundleArrM7731a.length + i;
                } else {
                    length = i;
                }
                i2++;
                i = length;
            }
            if (i != 0) {
                bundleM7747a.putLong("_eid", jNextLong);
                bundleM7747a.putInt("_epc", i);
            }
            acy acyVarM7642y = mo7383j().m7642y();
            if (acyVarM7642y != null && !bundleM7747a.containsKey("_sc")) {
                acyVarM7642y.f6396a = true;
            }
            int i5 = 0;
            while (true) {
                int i6 = i5;
                if (i6 >= arrayList.size()) {
                    break;
                }
                Bundle bundle2 = (Bundle) arrayList.get(i6);
                String str5 = i6 != 0 ? "_ep" : str2;
                bundle2.putString("_o", str);
                if (!bundle2.containsKey("_sc")) {
                    acv.m7632a(acyVarM7642y, bundle2);
                }
                Bundle bundleM7746a = z2 ? mo7389p().m7746a(bundle2) : bundle2;
                mo7393t().m7404D().m7414a("Logging event (FE)", mo7388o().m7371a(str2), mo7388o().m7365a(bundleM7746a));
                mo7382i().m7664a(new C2104zq(str5, new C2100zm(bundleM7746a), str, j), str3);
                if (!zEquals) {
                    Iterator<AppMeasurement.InterfaceC2116c> it = this.f6334c.iterator();
                    while (it.hasNext()) {
                        it.next().mo8795a(str, str2, new Bundle(bundleM7746a), j);
                    }
                }
                i5 = i6 + 1;
            }
            if (mo7383j().m7642y() == null || !"_ae".equals(str2)) {
                return;
            }
            mo7391r().m7700a(true);
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m7599b(String str, String str2, String str3, Bundle bundle) {
        long jMo7252a = mo7384k().mo7252a();
        C1221aj.m7067a(str2);
        AppMeasurement.ConditionalUserProperty conditionalUserProperty = new AppMeasurement.ConditionalUserProperty();
        conditionalUserProperty.mAppId = str;
        conditionalUserProperty.mName = str2;
        conditionalUserProperty.mCreationTimestamp = jMo7252a;
        if (str3 != null) {
            conditionalUserProperty.mExpiredEventName = str3;
            conditionalUserProperty.mExpiredEventParams = bundle;
        }
        mo7392s().m7479a(new aci(this, conditionalUserProperty));
    }

    /* JADX INFO: renamed from: c */
    private final void m7600c(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        long jMo7252a = mo7384k().mo7252a();
        C1221aj.m7065a(conditionalUserProperty);
        C1221aj.m7067a(conditionalUserProperty.mName);
        C1221aj.m7067a(conditionalUserProperty.mOrigin);
        C1221aj.m7065a(conditionalUserProperty.mValue);
        conditionalUserProperty.mCreationTimestamp = jMo7252a;
        String str = conditionalUserProperty.mName;
        Object obj = conditionalUserProperty.mValue;
        if (mo7389p().m7766e(str) != 0) {
            mo7393t().m7410y().m7413a("Invalid conditional user property name", mo7388o().m7375c(str));
            return;
        }
        if (mo7389p().m7760b(str, obj) != 0) {
            mo7393t().m7410y().m7414a("Invalid conditional user property value", mo7388o().m7375c(str), obj);
            return;
        }
        Object objM7764c = mo7389p().m7764c(str, obj);
        if (objM7764c == null) {
            mo7393t().m7410y().m7414a("Unable to normalize conditional user property value", mo7388o().m7375c(str), obj);
            return;
        }
        conditionalUserProperty.mValue = objM7764c;
        long j = conditionalUserProperty.mTriggerTimeout;
        if (!TextUtils.isEmpty(conditionalUserProperty.mTriggerEventName) && (j > 15552000000L || j < 1)) {
            mo7393t().m7410y().m7414a("Invalid conditional user property timeout", mo7388o().m7375c(str), Long.valueOf(j));
            return;
        }
        long j2 = conditionalUserProperty.mTimeToLive;
        if (j2 > 15552000000L || j2 < 1) {
            mo7393t().m7410y().m7414a("Invalid conditional user property time to live", mo7388o().m7375c(str), Long.valueOf(j2));
        } else {
            mo7392s().m7479a(new ach(this, conditionalUserProperty));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final void m7601c(boolean z) {
        mo7376c();
        m7584Q();
        mo7393t().m7404D().m7413a("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        mo7394u().m7432b(z);
        mo7382i().m7673z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final void m7602d(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        mo7376c();
        m7584Q();
        C1221aj.m7065a(conditionalUserProperty);
        C1221aj.m7067a(conditionalUserProperty.mName);
        C1221aj.m7067a(conditionalUserProperty.mOrigin);
        C1221aj.m7065a(conditionalUserProperty.mValue);
        if (!this.f6329p.m7512B()) {
            mo7393t().m7404D().m7412a("Conditional property not sent since Firebase Analytics is disabled");
            return;
        }
        aeh aehVar = new aeh(conditionalUserProperty.mName, conditionalUserProperty.mTriggeredTimestamp, conditionalUserProperty.mValue, conditionalUserProperty.mOrigin);
        try {
            C2104zq c2104zqM7749a = mo7389p().m7749a(conditionalUserProperty.mTriggeredEventName, conditionalUserProperty.mTriggeredEventParams, conditionalUserProperty.mOrigin, 0L, true, false);
            mo7382i().m7663a(new C2088za(conditionalUserProperty.mAppId, conditionalUserProperty.mOrigin, aehVar, conditionalUserProperty.mCreationTimestamp, false, conditionalUserProperty.mTriggerEventName, mo7389p().m7749a(conditionalUserProperty.mTimedOutEventName, conditionalUserProperty.mTimedOutEventParams, conditionalUserProperty.mOrigin, 0L, true, false), conditionalUserProperty.mTriggerTimeout, c2104zqM7749a, conditionalUserProperty.mTimeToLive, mo7389p().m7749a(conditionalUserProperty.mExpiredEventName, conditionalUserProperty.mExpiredEventParams, conditionalUserProperty.mOrigin, 0L, true, false)));
        } catch (IllegalArgumentException e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final void m7603e(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        mo7376c();
        m7584Q();
        C1221aj.m7065a(conditionalUserProperty);
        C1221aj.m7067a(conditionalUserProperty.mName);
        if (!this.f6329p.m7512B()) {
            mo7393t().m7404D().m7412a("Conditional property not cleared since Firebase Analytics is disabled");
            return;
        }
        try {
            mo7382i().m7663a(new C2088za(conditionalUserProperty.mAppId, conditionalUserProperty.mOrigin, new aeh(conditionalUserProperty.mName, 0L, null, null), conditionalUserProperty.mCreationTimestamp, conditionalUserProperty.mActive, conditionalUserProperty.mTriggerEventName, null, conditionalUserProperty.mTriggerTimeout, null, conditionalUserProperty.mTimeToLive, mo7389p().m7749a(conditionalUserProperty.mExpiredEventName, conditionalUserProperty.mExpiredEventParams, conditionalUserProperty.mOrigin, conditionalUserProperty.mCreationTimestamp, true, false)));
        } catch (IllegalArgumentException e) {
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m7604A() {
        mo7392s().m7479a(new act(this));
    }

    /* JADX INFO: renamed from: a */
    public final List<AppMeasurement.ConditionalUserProperty> m7605a(String str, String str2) {
        return m7595b((String) null, str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final List<AppMeasurement.ConditionalUserProperty> m7606a(String str, String str2, String str3) {
        C1221aj.m7067a(str);
        mo7372a();
        return m7595b(str, str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, Object> m7607a(String str, String str2, String str3, boolean z) {
        C1221aj.m7067a(str);
        mo7372a();
        return m7596b(str, str2, str3, z);
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, Object> m7608a(String str, String str2, boolean z) {
        return m7596b((String) null, str, str2, z);
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7372a() {
        super.mo7372a();
    }

    /* JADX INFO: renamed from: a */
    public final void m7609a(long j) {
        mo7392s().m7479a(new acl(this, j));
    }

    /* JADX INFO: renamed from: a */
    public final void m7610a(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        C1221aj.m7065a(conditionalUserProperty);
        AppMeasurement.ConditionalUserProperty conditionalUserProperty2 = new AppMeasurement.ConditionalUserProperty(conditionalUserProperty);
        if (!TextUtils.isEmpty(conditionalUserProperty2.mAppId)) {
            mo7393t().m7401A().m7412a("Package name should be null when calling setConditionalUserProperty");
        }
        conditionalUserProperty2.mAppId = null;
        m7600c(conditionalUserProperty2);
    }

    /* JADX INFO: renamed from: a */
    public final void m7611a(AppMeasurement.InterfaceC2115b interfaceC2115b) {
        mo7376c();
        m7584Q();
        if (interfaceC2115b != null && interfaceC2115b != this.f6333b) {
            C1221aj.m7071a(this.f6333b == null, "EventInterceptor already set.");
        }
        this.f6333b = interfaceC2115b;
    }

    /* JADX INFO: renamed from: a */
    public final void m7612a(AppMeasurement.InterfaceC2116c interfaceC2116c) {
        m7584Q();
        C1221aj.m7065a(interfaceC2116c);
        if (this.f6334c.add(interfaceC2116c)) {
            return;
        }
        mo7393t().m7401A().m7412a("OnEventListener already registered");
    }

    /* JADX INFO: renamed from: a */
    final void m7613a(String str) {
        this.f6336e.set(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m7614a(String str, String str2, Bundle bundle) {
        m7593a(str, str2, bundle, true, this.f6333b == null || aek.m7739i(str2), false, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m7615a(String str, String str2, Bundle bundle, long j) {
        m7591a(str, str2, j, bundle, false, true, true, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m7616a(String str, String str2, Bundle bundle, boolean z) {
        m7593a(str, str2, bundle, true, this.f6333b == null || aek.m7739i(str2), true, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m7617a(String str, String str2, Object obj) {
        C1221aj.m7067a(str);
        long jMo7252a = mo7384k().mo7252a();
        int iM7766e = mo7389p().m7766e(str2);
        if (iM7766e != 0) {
            mo7389p();
            this.f6329p.m7549o().m7751a(iM7766e, "_ev", aek.m7716a(str2, 24, true), str2 != null ? str2.length() : 0);
            return;
        }
        if (obj == null) {
            m7592a(str, str2, jMo7252a, (Object) null);
            return;
        }
        int iM7760b = mo7389p().m7760b(str2, obj);
        if (iM7760b != 0) {
            mo7389p();
            this.f6329p.m7549o().m7751a(iM7760b, "_ev", aek.m7716a(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0);
        } else {
            Object objM7764c = mo7389p().m7764c(str2, obj);
            if (objM7764c != null) {
                m7592a(str, str2, jMo7252a, objM7764c);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7618a(String str, String str2, String str3, Bundle bundle) {
        C1221aj.m7067a(str);
        mo7372a();
        m7599b(str, str2, str3, bundle);
    }

    /* JADX INFO: renamed from: a */
    public final void m7619a(boolean z) {
        m7584Q();
        mo7392s().m7479a(new acg(this, z));
    }

    /* JADX INFO: renamed from: b */
    public final List<aeh> m7620b(boolean z) {
        m7584Q();
        mo7393t().m7404D().m7412a("Fetching user attributes (FE)");
        if (mo7392s().m7482z()) {
            mo7393t().m7410y().m7412a("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        }
        mo7392s();
        if (aay.m7476y()) {
            mo7393t().m7410y().m7412a("Cannot get all user properties from main thread");
            return Collections.emptyList();
        }
        AtomicReference atomicReference = new AtomicReference();
        synchronized (atomicReference) {
            this.f6329p.m7542h().m7479a(new acp(this, atomicReference, z));
            try {
                atomicReference.wait(5000L);
            } catch (InterruptedException e) {
                mo7393t().m7401A().m7413a("Interrupted waiting for get user properties", e);
            }
        }
        List<aeh> list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        mo7393t().m7401A().m7412a("Timed out waiting for get user properties");
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo7374b() {
        super.mo7374b();
    }

    /* JADX INFO: renamed from: b */
    public final void m7621b(long j) {
        mo7392s().m7479a(new acm(this, j));
    }

    /* JADX INFO: renamed from: b */
    public final void m7622b(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        C1221aj.m7065a(conditionalUserProperty);
        C1221aj.m7067a(conditionalUserProperty.mAppId);
        mo7372a();
        m7600c(new AppMeasurement.ConditionalUserProperty(conditionalUserProperty));
    }

    /* JADX INFO: renamed from: b */
    public final void m7623b(AppMeasurement.InterfaceC2116c interfaceC2116c) {
        m7584Q();
        C1221aj.m7065a(interfaceC2116c);
        if (this.f6334c.remove(interfaceC2116c)) {
            return;
        }
        mo7393t().m7401A().m7412a("OnEventListener had not been registered");
    }

    /* JADX INFO: renamed from: b */
    public final void m7624b(String str, String str2, Bundle bundle) {
        m7599b((String) null, str, str2, bundle);
    }

    /* JADX INFO: renamed from: c */
    final String m7625c(long j) {
        AtomicReference atomicReference = new AtomicReference();
        synchronized (atomicReference) {
            mo7392s().m7479a(new acr(this, atomicReference));
            try {
                atomicReference.wait(j);
            } catch (InterruptedException e) {
                mo7393t().m7401A().m7412a("Interrupted waiting for app instance id");
                return null;
            }
        }
        return (String) atomicReference.get();
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
    public final AbstractC0964e<String> m7626y() {
        try {
            String strM7438z = mo7394u().m7438z();
            return strM7438z != null ? C0967h.m6223a(strM7438z) : C0967h.m6224a(mo7392s().m7477A(), new acq(this));
        } catch (Exception e) {
            mo7393t().m7401A().m7412a("Failed to schedule task for getAppInstanceId");
            return C0967h.m6222a(e);
        }
    }

    /* JADX INFO: renamed from: z */
    public final String m7627z() {
        return this.f6336e.get();
    }
}
