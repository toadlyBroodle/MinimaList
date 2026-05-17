package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.ads.mediation.InterfaceC0861b;
import com.google.android.gms.ads.p045b.C0667d;
import com.google.android.gms.p043a.BinderC0654c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class chw implements cia {

    /* JADX INFO: renamed from: a */
    private final String f10056a;

    /* JADX INFO: renamed from: b */
    private final cii f10057b;

    /* JADX INFO: renamed from: c */
    private final long f10058c;

    /* JADX INFO: renamed from: d */
    private final cht f10059d;

    /* JADX INFO: renamed from: e */
    private final chs f10060e;

    /* JADX INFO: renamed from: f */
    private bwx f10061f;

    /* JADX INFO: renamed from: g */
    private final bxb f10062g;

    /* JADX INFO: renamed from: h */
    private final Context f10063h;

    /* JADX INFO: renamed from: j */
    private final C1670jo f10065j;

    /* JADX INFO: renamed from: k */
    private final boolean f10066k;

    /* JADX INFO: renamed from: l */
    private final ccm f10067l;

    /* JADX INFO: renamed from: m */
    private final List<String> f10068m;

    /* JADX INFO: renamed from: n */
    private final List<String> f10069n;

    /* JADX INFO: renamed from: o */
    private final List<String> f10070o;

    /* JADX INFO: renamed from: p */
    private final boolean f10071p;

    /* JADX INFO: renamed from: q */
    private final boolean f10072q;

    /* JADX INFO: renamed from: r */
    private cim f10073r;

    /* JADX INFO: renamed from: t */
    private cis f10075t;

    /* JADX INFO: renamed from: i */
    private final Object f10064i = new Object();

    /* JADX INFO: renamed from: s */
    private int f10074s = -2;

    public chw(Context context, String str, cii ciiVar, cht chtVar, chs chsVar, bwx bwxVar, bxb bxbVar, C1670jo c1670jo, boolean z, boolean z2, ccm ccmVar, List<String> list, List<String> list2, List<String> list3, boolean z3) {
        this.f10063h = context;
        this.f10057b = ciiVar;
        this.f10060e = chsVar;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            this.f10056a = m10890b();
        } else {
            this.f10056a = str;
        }
        this.f10059d = chtVar;
        if (chsVar.f10032r != -1) {
            this.f10058c = chsVar.f10032r;
        } else if (chtVar.f10035b != -1) {
            this.f10058c = chtVar.f10035b;
        } else {
            this.f10058c = 10000L;
        }
        this.f10061f = bwxVar;
        this.f10062g = bxbVar;
        this.f10065j = c1670jo;
        this.f10066k = z;
        this.f10071p = z2;
        this.f10067l = ccmVar;
        this.f10068m = list;
        this.f10069n = list2;
        this.f10070o = list3;
        this.f10072q = z3;
    }

    /* JADX INFO: renamed from: a */
    private static cim m10881a(InterfaceC0861b interfaceC0861b) {
        return new cjd(interfaceC0861b);
    }

    /* JADX INFO: renamed from: a */
    private final String m10884a(String str) {
        if (str == null || !m10896e() || m10891b(2)) {
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.remove("cpm_floor_cents");
            return jSONObject.toString();
        } catch (JSONException e) {
            C1560fm.m11615e("Could not remove field. Returning the original value");
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m10885a(chv chvVar) {
        String strM10884a = m10884a(this.f10060e.f10024j);
        try {
            if (this.f10065j.f10857c < 4100000) {
                if (this.f10062g.f9250d) {
                    this.f10073r.mo10943a(BinderC0654c.m5329a(this.f10063h), this.f10061f, strM10884a, chvVar);
                    return;
                } else {
                    this.f10073r.mo10947a(BinderC0654c.m5329a(this.f10063h), this.f10062g, this.f10061f, strM10884a, chvVar);
                    return;
                }
            }
            if (!this.f10066k && !this.f10060e.m10866b()) {
                if (this.f10062g.f9250d) {
                    this.f10073r.mo10945a(BinderC0654c.m5329a(this.f10063h), this.f10061f, strM10884a, this.f10060e.f10015a, chvVar);
                    return;
                }
                if (!this.f10071p) {
                    this.f10073r.mo10948a(BinderC0654c.m5329a(this.f10063h), this.f10062g, this.f10061f, strM10884a, this.f10060e.f10015a, chvVar);
                    return;
                } else if (this.f10060e.f10027m != null) {
                    this.f10073r.mo10946a(BinderC0654c.m5329a(this.f10063h), this.f10061f, strM10884a, this.f10060e.f10015a, chvVar, new ccm(m10889b(this.f10060e.f10031q)), this.f10060e.f10030p);
                    return;
                } else {
                    this.f10073r.mo10948a(BinderC0654c.m5329a(this.f10063h), this.f10062g, this.f10061f, strM10884a, this.f10060e.f10015a, chvVar);
                    return;
                }
            }
            ArrayList arrayList = new ArrayList(this.f10068m);
            if (this.f10069n != null) {
                for (String str : this.f10069n) {
                    String str2 = ":false";
                    if (this.f10070o != null && this.f10070o.contains(str)) {
                        str2 = ":true";
                    }
                    arrayList.add(new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(str2).length()).append("custom:").append(str).append(str2).toString());
                }
            }
            this.f10073r.mo10946a(BinderC0654c.m5329a(this.f10063h), this.f10061f, strM10884a, this.f10060e.f10015a, chvVar, this.f10067l, arrayList);
        } catch (RemoteException e) {
            C1560fm.m11613c("Could not request ad from mediation adapter.", e);
            mo10902a(5);
        }
    }

    /* JADX INFO: renamed from: b */
    private static C0667d m10889b(String str) {
        int i = 0;
        C0667d.a aVar = new C0667d.a();
        if (str == null) {
            return aVar.m5360a();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            aVar.m5362b(jSONObject.optBoolean("multiple_images", false));
            aVar.m5359a(jSONObject.optBoolean("only_urls", false));
            String strOptString = jSONObject.optString("native_image_orientation", "any");
            if ("landscape".equals(strOptString)) {
                i = 2;
            } else if ("portrait".equals(strOptString)) {
                i = 1;
            } else if (!"any".equals(strOptString)) {
                i = -1;
            }
            aVar.m5357a(i);
        } catch (JSONException e) {
            C1560fm.m11613c("Exception occurred when creating native ad options", e);
        }
        return aVar.m5360a();
    }

    /* JADX INFO: renamed from: b */
    private final String m10890b() {
        try {
            if (!TextUtils.isEmpty(this.f10060e.f10019e)) {
                return this.f10057b.mo10936b(this.f10060e.f10019e) ? "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter" : "com.google.ads.mediation.customevent.CustomEventAdapter";
            }
        } catch (RemoteException e) {
            C1560fm.m11615e("Fail to determine the custom event's version, assuming the old one.");
        }
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final boolean m10891b(int i) {
        try {
            Bundle bundleMo10963l = this.f10066k ? this.f10073r.mo10963l() : this.f10062g.f9250d ? this.f10073r.mo10962k() : this.f10073r.mo10961j();
            return bundleMo10963l != null && (bundleMo10963l.getInt("capabilities", 0) & i) == i;
        } catch (RemoteException e) {
            C1560fm.m11615e("Could not get adapter info. Returning false");
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    private final cis m10893c() {
        if (this.f10074s != 0 || !m10896e()) {
            return null;
        }
        try {
            if (m10891b(4) && this.f10075t != null && this.f10075t.mo10904a() != 0) {
                return this.f10075t;
            }
        } catch (RemoteException e) {
            C1560fm.m11615e("Could not get cpm value from MediationResponseMetadata");
        }
        return new chy(m10898f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final cim m10894d() {
        String strValueOf = String.valueOf(this.f10056a);
        C1560fm.m11614d(strValueOf.length() != 0 ? "Instantiating mediation adapter: ".concat(strValueOf) : new String("Instantiating mediation adapter: "));
        if (!this.f10066k && !this.f10060e.m10866b()) {
            if (((Boolean) bxm.m10409f().m10546a(can.f9515bi)).booleanValue() && "com.google.ads.mediation.admob.AdMobAdapter".equals(this.f10056a)) {
                return m10881a(new AdMobAdapter());
            }
            if (((Boolean) bxm.m10409f().m10546a(can.f9516bj)).booleanValue() && "com.google.ads.mediation.AdUrlAdapter".equals(this.f10056a)) {
                return m10881a(new AdUrlAdapter());
            }
            if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(this.f10056a)) {
                return new cjd(new zzwl());
            }
        }
        try {
            return this.f10057b.mo10934a(this.f10056a);
        } catch (RemoteException e) {
            String strValueOf2 = String.valueOf(this.f10056a);
            C1560fm.m11608a(strValueOf2.length() != 0 ? "Could not instantiate mediation adapter: ".concat(strValueOf2) : new String("Could not instantiate mediation adapter: "), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final boolean m10896e() {
        return this.f10059d.f10045l != -1;
    }

    /* JADX INFO: renamed from: f */
    private final int m10898f() {
        if (this.f10060e.f10024j == null) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.f10060e.f10024j);
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f10056a)) {
                return jSONObject.optInt("cpm_cents", 0);
            }
            int iOptInt = m10891b(2) ? jSONObject.optInt("cpm_floor_cents", 0) : 0;
            return iOptInt == 0 ? jSONObject.optInt("penalized_average_cpm_cents", 0) : iOptInt;
        } catch (JSONException e) {
            C1560fm.m11615e("Could not convert to json. Returning 0");
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public final chz m10900a(long j, long j2) {
        chz chzVar;
        synchronized (this.f10064i) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            chv chvVar = new chv();
            C1596gv.f10711a.post(new chx(this, chvVar));
            long j3 = this.f10058c;
            while (this.f10074s == -2) {
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                long j4 = j3 - (jElapsedRealtime2 - jElapsedRealtime);
                long j5 = j2 - (jElapsedRealtime2 - j);
                if (j4 <= 0 || j5 <= 0) {
                    C1560fm.m11614d("Timed out waiting for adapter.");
                    this.f10074s = 3;
                } else {
                    try {
                        this.f10064i.wait(Math.min(j4, j5));
                    } catch (InterruptedException e) {
                        this.f10074s = 5;
                    }
                }
            }
            chzVar = new chz(this.f10060e, this.f10073r, this.f10056a, chvVar, this.f10074s, m10893c(), C0710au.m5575k().mo7253b() - jElapsedRealtime);
        }
        return chzVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m10901a() {
        synchronized (this.f10064i) {
            try {
            } catch (RemoteException e) {
                C1560fm.m11613c("Could not destroy mediation adapter.", e);
            }
            if (this.f10073r != null) {
                this.f10073r.mo10954c();
                this.f10074s = -1;
                this.f10064i.notify();
            } else {
                this.f10074s = -1;
                this.f10064i.notify();
            }
        }
    }

    @Override // com.google.android.gms.internal.cia
    /* JADX INFO: renamed from: a */
    public final void mo10902a(int i) {
        synchronized (this.f10064i) {
            this.f10074s = i;
            this.f10064i.notify();
        }
    }

    @Override // com.google.android.gms.internal.cia
    /* JADX INFO: renamed from: a */
    public final void mo10903a(int i, cis cisVar) {
        synchronized (this.f10064i) {
            this.f10074s = 0;
            this.f10075t = cisVar;
            this.f10064i.notify();
        }
    }
}
