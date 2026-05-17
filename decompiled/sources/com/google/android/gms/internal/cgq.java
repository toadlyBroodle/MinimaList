package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.C0710au;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cgq {

    /* JADX INFO: renamed from: a */
    private final Map<cgr, cgs> f9951a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final LinkedList<cgr> f9952b = new LinkedList<>();

    /* JADX INFO: renamed from: c */
    private cfm f9953c;

    /* JADX INFO: renamed from: a */
    static Set<String> m10806a(bwx bwxVar) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(bwxVar.f9209c.keySet());
        Bundle bundle = bwxVar.f9219m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            hashSet.addAll(bundle.keySet());
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: a */
    private static void m10807a(Bundle bundle, String str) {
        while (true) {
            String[] strArrSplit = str.split("/", 2);
            if (strArrSplit.length == 0) {
                return;
            }
            String str2 = strArrSplit[0];
            if (strArrSplit.length == 1) {
                bundle.remove(str2);
                return;
            }
            bundle = bundle.getBundle(str2);
            if (bundle == null) {
                return;
            } else {
                str = strArrSplit[1];
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m10808a(String str, cgr cgrVar) {
        if (C1560fm.m11609a(2)) {
            C1560fm.m11343a(String.format(str, cgrVar));
        }
    }

    /* JADX INFO: renamed from: a */
    private static String[] m10809a(String str) {
        try {
            String[] strArrSplit = str.split("\u0000");
            for (int i = 0; i < strArrSplit.length; i++) {
                strArrSplit[i] = new String(Base64.decode(strArrSplit[i], 0), "UTF-8");
            }
            return strArrSplit;
        } catch (UnsupportedEncodingException e) {
            return new String[0];
        }
    }

    /* JADX INFO: renamed from: b */
    static bwx m10810b(bwx bwxVar) {
        bwx bwxVarM10815d = m10815d(bwxVar);
        Bundle bundle = bwxVarM10815d.f9219m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            bundle.putBoolean("_skipMediation", true);
        }
        bwxVarM10815d.f9209c.putBoolean("_skipMediation", true);
        return bwxVarM10815d;
    }

    /* JADX INFO: renamed from: b */
    private final String m10811b() {
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<cgr> it = this.f9952b.iterator();
            while (it.hasNext()) {
                sb.append(Base64.encodeToString(it.next().toString().getBytes("UTF-8"), 0));
                if (it.hasNext()) {
                    sb.append("\u0000");
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m10812b(String str) {
        try {
            return Pattern.matches((String) bxm.m10409f().m10546a(can.f9440aM), str);
        } catch (RuntimeException e) {
            C0710au.m5573i().m11292a(e, "InterstitialAdPool.isExcludedAdUnit");
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    private static bwx m10813c(bwx bwxVar) {
        bwx bwxVarM10815d = m10815d(bwxVar);
        for (String str : ((String) bxm.m10409f().m10546a(can.f9436aI)).split(",")) {
            m10807a(bwxVarM10815d.f9219m, str);
            if (str.startsWith("com.google.ads.mediation.admob.AdMobAdapter/")) {
                m10807a(bwxVarM10815d.f9209c, str.replaceFirst("com.google.ads.mediation.admob.AdMobAdapter/", ""));
            }
        }
        return bwxVarM10815d;
    }

    /* JADX INFO: renamed from: c */
    private static String m10814c(String str) {
        try {
            Matcher matcher = Pattern.compile("([^/]+/[0-9]+).*").matcher(str);
            return matcher.matches() ? matcher.group(1) : str;
        } catch (RuntimeException e) {
            return str;
        }
    }

    /* JADX INFO: renamed from: d */
    private static bwx m10815d(bwx bwxVar) {
        Parcel parcelObtain = Parcel.obtain();
        bwxVar.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        bwx bwxVarCreateFromParcel = bwx.CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        if (((Boolean) bxm.m10409f().m10546a(can.f9429aB)).booleanValue()) {
            bwx.m10373a(bwxVarCreateFromParcel);
        }
        return bwxVarCreateFromParcel;
    }

    /* JADX INFO: renamed from: a */
    final cgt m10816a(bwx bwxVar, String str) {
        cgs cgsVar;
        if (m10812b(str)) {
            return null;
        }
        int i = new C1457bt(this.f9953c.m10791a()).m10214a().f8797n;
        bwx bwxVarM10813c = m10813c(bwxVar);
        String strM10814c = m10814c(str);
        cgr cgrVar = new cgr(bwxVarM10813c, strM10814c, i);
        cgs cgsVar2 = this.f9951a.get(cgrVar);
        if (cgsVar2 == null) {
            m10808a("Interstitial pool created at %s.", cgrVar);
            cgs cgsVar3 = new cgs(bwxVarM10813c, strM10814c, i);
            this.f9951a.put(cgrVar, cgsVar3);
            cgsVar = cgsVar3;
        } else {
            cgsVar = cgsVar2;
        }
        this.f9952b.remove(cgrVar);
        this.f9952b.add(cgrVar);
        cgsVar.m10831g();
        while (this.f9952b.size() > ((Integer) bxm.m10409f().m10546a(can.f9437aJ)).intValue()) {
            cgr cgrVarRemove = this.f9952b.remove();
            cgs cgsVar4 = this.f9951a.get(cgrVarRemove);
            m10808a("Evicting interstitial queue for %s.", cgrVarRemove);
            while (cgsVar4.m10828d() > 0) {
                cgt cgtVarM10823a = cgsVar4.m10823a((bwx) null);
                if (cgtVarM10823a.f9964e) {
                    cgu.m10834a().m10837c();
                }
                cgtVarM10823a.f9960a.m5768F();
            }
            this.f9951a.remove(cgrVarRemove);
        }
        while (cgsVar.m10828d() > 0) {
            cgt cgtVarM10823a2 = cgsVar.m10823a(bwxVarM10813c);
            if (cgtVarM10823a2.f9964e) {
                if (C0710au.m5575k().mo7252a() - cgtVarM10823a2.f9963d > 1000 * ((long) ((Integer) bxm.m10409f().m10546a(can.f9439aL)).intValue())) {
                    m10808a("Expired interstitial at %s.", cgrVar);
                    cgu.m10834a().m10836b();
                }
            }
            String str2 = cgtVarM10823a2.f9961b != null ? " (inline) " : " ";
            m10808a(new StringBuilder(String.valueOf(str2).length() + 34).append("Pooled interstitial").append(str2).append("returned at %s.").toString(), cgrVar);
            return cgtVarM10823a2;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    final void m10817a() {
        int iM10828d;
        int iM10829e;
        if (this.f9953c == null) {
            return;
        }
        for (Map.Entry<cgr, cgs> entry : this.f9951a.entrySet()) {
            cgr key = entry.getKey();
            cgs value = entry.getValue();
            if (C1560fm.m11609a(2) && (iM10829e = value.m10829e()) < (iM10828d = value.m10828d())) {
                C1560fm.m11343a(String.format("Loading %s/%s pooled interstitials for %s.", Integer.valueOf(iM10828d - iM10829e), Integer.valueOf(iM10828d), key));
            }
            int iM10830f = value.m10830f() + 0;
            while (value.m10828d() < ((Integer) bxm.m10409f().m10546a(can.f9438aK)).intValue()) {
                m10808a("Pooling and loading one new interstitial for %s.", key);
                if (value.m10825a(this.f9953c)) {
                    iM10830f++;
                }
            }
            cgu.m10834a().m10835a(iM10830f);
        }
        if (this.f9953c != null) {
            SharedPreferences.Editor editorEdit = this.f9953c.m10791a().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0).edit();
            editorEdit.clear();
            for (Map.Entry<cgr, cgs> entry2 : this.f9951a.entrySet()) {
                cgr key2 = entry2.getKey();
                cgs value2 = entry2.getValue();
                if (value2.m10832h()) {
                    editorEdit.putString(key2.toString(), new cgw(value2).m10847a());
                    m10808a("Saved interstitial queue for %s.", key2);
                }
            }
            editorEdit.putString("PoolKeys", m10811b());
            editorEdit.apply();
        }
    }

    /* JADX INFO: renamed from: a */
    final void m10818a(cfm cfmVar) {
        if (this.f9953c == null) {
            this.f9953c = cfmVar.m10794b();
            if (this.f9953c != null) {
                SharedPreferences sharedPreferences = this.f9953c.m10791a().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
                while (this.f9952b.size() > 0) {
                    cgr cgrVarRemove = this.f9952b.remove();
                    cgs cgsVar = this.f9951a.get(cgrVarRemove);
                    m10808a("Flushing interstitial queue for %s.", cgrVarRemove);
                    while (cgsVar.m10828d() > 0) {
                        cgsVar.m10823a((bwx) null).f9960a.m5768F();
                    }
                    this.f9951a.remove(cgrVarRemove);
                }
                try {
                    HashMap map = new HashMap();
                    for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                        if (!entry.getKey().equals("PoolKeys")) {
                            cgw cgwVarM10846a = cgw.m10846a((String) entry.getValue());
                            cgr cgrVar = new cgr(cgwVarM10846a.f9978a, cgwVarM10846a.f9979b, cgwVarM10846a.f9980c);
                            if (!this.f9951a.containsKey(cgrVar)) {
                                this.f9951a.put(cgrVar, new cgs(cgwVarM10846a.f9978a, cgwVarM10846a.f9979b, cgwVarM10846a.f9980c));
                                map.put(cgrVar.toString(), cgrVar);
                                m10808a("Restored interstitial queue for %s.", cgrVar);
                            }
                        }
                    }
                    for (String str : m10809a(sharedPreferences.getString("PoolKeys", ""))) {
                        cgr cgrVar2 = (cgr) map.get(str);
                        if (this.f9951a.containsKey(cgrVar2)) {
                            this.f9952b.add(cgrVar2);
                        }
                    }
                } catch (IOException | RuntimeException e) {
                    C0710au.m5573i().m11292a(e, "InterstitialAdPool.restore");
                    C1560fm.m11613c("Malformed preferences value for InterstitialAdPool.", e);
                    this.f9951a.clear();
                    this.f9952b.clear();
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    final void m10819b(bwx bwxVar, String str) {
        if (this.f9953c == null) {
            return;
        }
        int i = new C1457bt(this.f9953c.m10791a()).m10214a().f8797n;
        bwx bwxVarM10813c = m10813c(bwxVar);
        String strM10814c = m10814c(str);
        cgr cgrVar = new cgr(bwxVarM10813c, strM10814c, i);
        cgs cgsVar = this.f9951a.get(cgrVar);
        if (cgsVar == null) {
            m10808a("Interstitial pool created at %s.", cgrVar);
            cgsVar = new cgs(bwxVarM10813c, strM10814c, i);
            this.f9951a.put(cgrVar, cgsVar);
        }
        cgsVar.m10824a(this.f9953c, bwxVar);
        cgsVar.m10831g();
        m10808a("Inline entry added to the queue at %s.", cgrVar);
    }
}
