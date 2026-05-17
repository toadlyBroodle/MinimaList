package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class bdf implements bcu, bdd {

    /* JADX INFO: renamed from: a */
    private static long f7827a = 0;

    /* JADX INFO: renamed from: A */
    private long f7828A;

    /* JADX INFO: renamed from: B */
    private boolean f7829B;

    /* JADX INFO: renamed from: b */
    private final bde f7830b;

    /* JADX INFO: renamed from: c */
    private final bdb f7831c;

    /* JADX INFO: renamed from: d */
    private String f7832d;

    /* JADX INFO: renamed from: g */
    private long f7835g;

    /* JADX INFO: renamed from: h */
    private bct f7836h;

    /* JADX INFO: renamed from: p */
    private String f7844p;

    /* JADX INFO: renamed from: q */
    private boolean f7845q;

    /* JADX INFO: renamed from: r */
    private final bcz f7846r;

    /* JADX INFO: renamed from: s */
    private final bcx f7847s;

    /* JADX INFO: renamed from: t */
    private final ScheduledExecutorService f7848t;

    /* JADX INFO: renamed from: u */
    private final bkl f7849u;

    /* JADX INFO: renamed from: v */
    private final beh f7850v;

    /* JADX INFO: renamed from: w */
    private String f7851w;

    /* JADX INFO: renamed from: e */
    private HashSet<String> f7833e = new HashSet<>();

    /* JADX INFO: renamed from: f */
    private boolean f7834f = true;

    /* JADX INFO: renamed from: i */
    private bdp f7837i = bdp.Disconnected;

    /* JADX INFO: renamed from: j */
    private long f7838j = 0;

    /* JADX INFO: renamed from: k */
    private long f7839k = 0;

    /* JADX INFO: renamed from: x */
    private long f7852x = 0;

    /* JADX INFO: renamed from: y */
    private int f7853y = 0;

    /* JADX INFO: renamed from: z */
    private ScheduledFuture<?> f7854z = null;

    /* JADX INFO: renamed from: o */
    private Map<bdq, bdt> f7843o = new HashMap();

    /* JADX INFO: renamed from: l */
    private Map<Long, bdo> f7840l = new HashMap();

    /* JADX INFO: renamed from: n */
    private Map<Long, bdu> f7842n = new HashMap();

    /* JADX INFO: renamed from: m */
    private List<bds> f7841m = new ArrayList();

    public bdf(bcz bczVar, bdb bdbVar, bde bdeVar) {
        this.f7830b = bdeVar;
        this.f7846r = bczVar;
        this.f7848t = bczVar.m8944c();
        this.f7847s = bczVar.m8943b();
        this.f7831c = bdbVar;
        this.f7850v = new bej(this.f7848t, bczVar.m8942a(), "ConnectionRetryHelper").m9082a(1000L).m9081a(1.3d).m9084b(30000L).m9083b(0.7d).m9080a();
        long j = f7827a;
        f7827a = 1 + j;
        this.f7849u = new bkl(bczVar.m8942a(), "PersistentConnection", new StringBuilder(23).append("pc_").append(j).toString());
        this.f7851w = null;
        m9015k();
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ int m8981a(bdf bdfVar, int i) {
        bdfVar.f7853y = 0;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final bdt m8984a(bdq bdqVar) {
        if (this.f7849u.m9541a()) {
            bkl bklVar = this.f7849u;
            String strValueOf = String.valueOf(bdqVar);
            bklVar.m9540a(new StringBuilder(String.valueOf(strValueOf).length() + 15).append("removing query ").append(strValueOf).toString(), null, new Object[0]);
        }
        if (this.f7843o.containsKey(bdqVar)) {
            bdt bdtVar = this.f7843o.get(bdqVar);
            this.f7843o.remove(bdqVar);
            m9015k();
            return bdtVar;
        }
        if (!this.f7849u.m9541a()) {
            return null;
        }
        bkl bklVar2 = this.f7849u;
        String strValueOf2 = String.valueOf(bdqVar);
        bklVar2.m9540a(new StringBuilder(String.valueOf(strValueOf2).length() + 64).append("Trying to remove listener for QuerySpec ").append(strValueOf2).append(" but no listener exists.").toString(), null, new Object[0]);
        return null;
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ String m8986a(bdf bdfVar, String str) {
        bdfVar.f7844p = null;
        return null;
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ ScheduledFuture m8987a(bdf bdfVar, ScheduledFuture scheduledFuture) {
        bdfVar.f7854z = null;
        return null;
    }

    /* JADX INFO: renamed from: a */
    private final void m8988a(long j) {
        bdu bduVar = this.f7842n.get(Long.valueOf(j));
        bdw bdwVarM9040c = bduVar.m9040c();
        String strM9038a = bduVar.m9038a();
        bduVar.m9041d();
        m8993a(strM9038a, bduVar.m9039b(), new bdk(this, strM9038a, j, bduVar, bdwVarM9040c));
    }

    /* JADX INFO: renamed from: a */
    private final void m8990a(bdt bdtVar) {
        Map<String, Object> map = new HashMap<>();
        map.put("p", bda.m8950a((List<String>) bdtVar.m9034a().f7877a));
        Object objM9035b = bdtVar.m9035b();
        if (objM9035b != null) {
            map.put("q", bdtVar.f7885b.f7878b);
            map.put("t", objM9035b);
        }
        bdc bdcVarM9036c = bdtVar.m9036c();
        map.put("h", bdcVarM9036c.mo8956a());
        if (bdcVarM9036c.mo8957b()) {
            bcs bcsVarMo8958c = bdcVarM9036c.mo8958c();
            ArrayList arrayList = new ArrayList();
            Iterator<List<String>> it = bcsVarMo8958c.m8926a().iterator();
            while (it.hasNext()) {
                arrayList.add(bda.m8950a(it.next()));
            }
            HashMap map2 = new HashMap();
            map2.put("hs", bcsVarMo8958c.m8927b());
            map2.put("ps", arrayList);
            map.put("ch", map2);
        }
        m8993a("q", map, new bdl(this, bdtVar));
    }

    /* JADX INFO: renamed from: a */
    private final void m8991a(String str, List<String> list, Object obj, bdw bdwVar) {
        HashMap map = new HashMap();
        map.put("p", bda.m8950a(list));
        map.put("d", obj);
        m8993a(str, map, new bdi(this, bdwVar));
    }

    /* JADX INFO: renamed from: a */
    private final void m8992a(String str, List<String> list, Object obj, String str2, bdw bdwVar) {
        HashMap map = new HashMap();
        map.put("p", bda.m8950a(list));
        map.put("d", obj);
        if (str2 != null) {
            map.put("h", str2);
        }
        long j = this.f7838j;
        this.f7838j = 1 + j;
        this.f7842n.put(Long.valueOf(j), new bdu(str, map, bdwVar, null));
        if (m9005f()) {
            m8988a(j);
        }
        this.f7828A = System.currentTimeMillis();
        m9015k();
    }

    /* JADX INFO: renamed from: a */
    private final void m8993a(String str, Map<String, Object> map, bdo bdoVar) {
        m8994a(str, false, map, bdoVar);
    }

    /* JADX INFO: renamed from: a */
    private final void m8994a(String str, boolean z, Map<String, Object> map, bdo bdoVar) {
        long j = this.f7839k;
        this.f7839k = 1 + j;
        HashMap map2 = new HashMap();
        map2.put("r", Long.valueOf(j));
        map2.put("a", str);
        map2.put("b", map);
        this.f7836h.m8931a(map2, z);
        this.f7840l.put(Long.valueOf(j), bdoVar);
    }

    /* JADX INFO: renamed from: a */
    private final void m8995a(List<String> list) {
        if (this.f7849u.m9541a()) {
            bkl bklVar = this.f7849u;
            String strValueOf = String.valueOf(list);
            bklVar.m9540a(new StringBuilder(String.valueOf(strValueOf).length() + 29).append("removing all listens at path ").append(strValueOf).toString(), null, new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<bdq, bdt> entry : this.f7843o.entrySet()) {
            bdq key = entry.getKey();
            bdt value = entry.getValue();
            if (key.f7877a.equals(list)) {
                arrayList.add(value);
            }
        }
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            this.f7843o.remove(((bdt) obj).m9034a());
        }
        m9015k();
        ArrayList arrayList3 = arrayList;
        int size2 = arrayList3.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList3.get(i2);
            i2++;
            ((bdt) obj2).f7884a.mo9046a("permission_denied", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m8996a(List<String> list, bdq bdqVar) {
        if (list.contains("no_index")) {
            String strValueOf = String.valueOf(bdqVar.f7878b.get("i"));
            String string = new StringBuilder(String.valueOf(strValueOf).length() + 14).append("\".indexOn\": \"").append(strValueOf).append("\"").toString();
            bkl bklVar = this.f7849u;
            String strM8950a = bda.m8950a((List<String>) bdqVar.f7877a);
            bklVar.m9542b(new StringBuilder(String.valueOf(string).length() + 175 + String.valueOf(strM8950a).length()).append("Using an unspecified index. Your data will be downloaded and filtered on the client. Consider adding '").append(string).append("' at ").append(strM8950a).append(" to your security and Firebase Database rules for better performance").toString(), null);
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m8997a(boolean z) {
        bda.m8952a(m9003e(), "Must be connected to send auth, but was: %s", this.f7837i);
        bda.m8952a(this.f7844p != null, "Auth token must be set to authenticate!", new Object[0]);
        bdj bdjVar = new bdj(this, z);
        HashMap map = new HashMap();
        bmr bmrVarM9672a = bmr.m9672a(this.f7844p);
        if (bmrVarM9672a == null) {
            map.put("cred", this.f7844p);
            m8994a("auth", true, (Map<String, Object>) map, (bdo) bdjVar);
        } else {
            map.put("cred", bmrVarM9672a.m9673a());
            if (bmrVarM9672a.m9674b() != null) {
                map.put("authvar", bmrVarM9672a.m9674b());
            }
            m8994a("gauth", true, (Map<String, Object>) map, (bdo) bdjVar);
        }
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m8998a(bdf bdfVar, boolean z) {
        bdfVar.f7845q = true;
        return true;
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ long m9000c(bdf bdfVar) {
        long j = bdfVar.f7852x;
        bdfVar.f7852x = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: e */
    private final boolean m9003e() {
        return this.f7837i == bdp.Authenticating || this.f7837i == bdp.Connected;
    }

    /* JADX INFO: renamed from: f */
    private final boolean m9005f() {
        return this.f7837i == bdp.Connected;
    }

    /* JADX INFO: renamed from: g */
    private final boolean m9007g() {
        return this.f7833e.size() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final void m9008h() {
        if (m9007g()) {
            bda.m8952a(this.f7837i == bdp.Disconnected, "Not in disconnected state: %s", this.f7837i);
            boolean z = this.f7845q;
            this.f7849u.m9540a("Scheduling connection attempt", null, new Object[0]);
            this.f7845q = false;
            this.f7850v.m9077a(new bdg(this, z));
        }
    }

    /* JADX INFO: renamed from: i */
    private final void m9011i() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Long, bdu>> it = this.f7842n.entrySet().iterator();
        while (it.hasNext()) {
            bdu value = it.next().getValue();
            if (value.m9039b().containsKey("h") && value.m9042e()) {
                arrayList.add(value);
                it.remove();
            }
        }
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((bdu) obj).m9040c().mo9046a("disconnected", null);
        }
    }

    /* JADX INFO: renamed from: j */
    static /* synthetic */ int m9012j(bdf bdfVar) {
        int i = bdfVar.f7853y;
        bdfVar.f7853y = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final void m9013j() {
        int i = 0;
        bda.m8952a(this.f7837i == bdp.Connected, "Should be connected if we're restoring state, but we are: %s", this.f7837i);
        if (this.f7849u.m9541a()) {
            this.f7849u.m9540a("Restoring outstanding listens", null, new Object[0]);
        }
        for (bdt bdtVar : this.f7843o.values()) {
            if (this.f7849u.m9541a()) {
                bkl bklVar = this.f7849u;
                String strValueOf = String.valueOf(bdtVar.m9034a());
                bklVar.m9540a(new StringBuilder(String.valueOf(strValueOf).length() + 17).append("Restoring listen ").append(strValueOf).toString(), null, new Object[0]);
            }
            m8990a(bdtVar);
        }
        if (this.f7849u.m9541a()) {
            this.f7849u.m9540a("Restoring writes.", null, new Object[0]);
        }
        ArrayList arrayList = new ArrayList(this.f7842n.keySet());
        Collections.sort(arrayList);
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            m8988a(((Long) obj).longValue());
        }
        for (bds bdsVar : this.f7841m) {
            m8991a(bdsVar.m9028a(), bdsVar.m9029b(), bdsVar.m9030c(), bdsVar.m9031d());
        }
        this.f7841m.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final void m9015k() {
        if (m9017l()) {
            if (this.f7854z != null) {
                this.f7854z.cancel(false);
            }
            this.f7854z = this.f7848t.schedule(new bdn(this), 60000L, TimeUnit.MILLISECONDS);
        } else if (mo8974f("connection_idle")) {
            bda.m8952a(!m9017l(), "", new Object[0]);
            mo8973e("connection_idle");
        }
    }

    /* JADX INFO: renamed from: l */
    private final boolean m9017l() {
        return this.f7843o.isEmpty() && this.f7840l.isEmpty() && !this.f7829B && this.f7842n.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final boolean m9019m() {
        return m9017l() && System.currentTimeMillis() > this.f7828A + 60000;
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: a */
    public final void mo8959a() {
        m9008h();
    }

    @Override // com.google.android.gms.internal.bcu
    /* JADX INFO: renamed from: a */
    public final void mo8934a(long j, String str) {
        if (this.f7849u.m9541a()) {
            this.f7849u.m9540a("onReady", null, new Object[0]);
        }
        this.f7835g = System.currentTimeMillis();
        if (this.f7849u.m9541a()) {
            this.f7849u.m9540a("handling timestamp", null, new Object[0]);
        }
        long jCurrentTimeMillis = j - System.currentTimeMillis();
        HashMap map = new HashMap();
        map.put("serverTimeOffset", Long.valueOf(jCurrentTimeMillis));
        this.f7830b.mo8978a(map);
        if (this.f7834f) {
            HashMap map2 = new HashMap();
            if (this.f7846r.m8945d()) {
                map2.put("persistence.android.enabled", 1);
            }
            String strValueOf = String.valueOf(this.f7846r.m8946e().replace('.', '-'));
            map2.put(strValueOf.length() != 0 ? "sdk.android.".concat(strValueOf) : new String("sdk.android."), 1);
            if (this.f7849u.m9541a()) {
                this.f7849u.m9540a("Sending first connection stats", null, new Object[0]);
            }
            if (!map2.isEmpty()) {
                Map<String, Object> map3 = new HashMap<>();
                map3.put("c", map2);
                m8993a("s", map3, new bdm(this));
            } else if (this.f7849u.m9541a()) {
                this.f7849u.m9540a("Not sending stats because stats are empty", null, new Object[0]);
            }
        }
        if (this.f7849u.m9541a()) {
            this.f7849u.m9540a("calling restore state", null, new Object[0]);
        }
        bda.m8952a(this.f7837i == bdp.Connecting, "Wanted to restore auth, but was in wrong state: %s", this.f7837i);
        if (this.f7844p == null) {
            if (this.f7849u.m9541a()) {
                this.f7849u.m9540a("Not restoring auth because token is null.", null, new Object[0]);
            }
            this.f7837i = bdp.Connected;
            m9013j();
        } else {
            if (this.f7849u.m9541a()) {
                this.f7849u.m9540a("Restoring auth.", null, new Object[0]);
            }
            this.f7837i = bdp.Authenticating;
            m8997a(true);
        }
        this.f7834f = false;
        this.f7851w = str;
        this.f7830b.mo8975a();
    }

    @Override // com.google.android.gms.internal.bcu
    /* JADX INFO: renamed from: a */
    public final void mo8935a(bcv bcvVar) {
        if (this.f7849u.m9541a()) {
            bkl bklVar = this.f7849u;
            String strValueOf = String.valueOf(bcvVar.name());
            bklVar.m9540a(strValueOf.length() != 0 ? "Got on disconnect due to ".concat(strValueOf) : new String("Got on disconnect due to "), null, new Object[0]);
        }
        this.f7837i = bdp.Disconnected;
        this.f7836h = null;
        this.f7829B = false;
        this.f7840l.clear();
        m9011i();
        if (m9007g()) {
            boolean z = this.f7835g > 0 && System.currentTimeMillis() - this.f7835g > 30000;
            if (bcvVar == bcv.SERVER_RESET || z) {
                this.f7850v.m9076a();
            }
            m9008h();
        }
        this.f7835g = 0L;
        this.f7830b.mo8980b();
    }

    @Override // com.google.android.gms.internal.bcu
    /* JADX INFO: renamed from: a */
    public final void mo8936a(String str) {
        this.f7832d = str;
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: a */
    public final void mo8960a(List<String> list, bdw bdwVar) {
        bdg bdgVar = null;
        if (m9005f()) {
            m8991a("oc", list, (Object) null, bdwVar);
        } else {
            this.f7841m.add(new bds("oc", list, bdgVar, bdwVar, bdgVar));
        }
        m9015k();
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: a */
    public final void mo8961a(List<String> list, Object obj, bdw bdwVar) {
        m8992a("p", list, obj, (String) null, bdwVar);
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: a */
    public final void mo8962a(List<String> list, Object obj, String str, bdw bdwVar) {
        m8992a("p", list, obj, str, bdwVar);
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: a */
    public final void mo8963a(List<String> list, Map<String, Object> map) {
        bdq bdqVar = new bdq(list, map);
        if (this.f7849u.m9541a()) {
            bkl bklVar = this.f7849u;
            String strValueOf = String.valueOf(bdqVar);
            bklVar.m9540a(new StringBuilder(String.valueOf(strValueOf).length() + 15).append("unlistening on ").append(strValueOf).toString(), null, new Object[0]);
        }
        bdt bdtVarM8984a = m8984a(bdqVar);
        if (bdtVarM8984a != null && m9003e()) {
            HashMap map2 = new HashMap();
            map2.put("p", bda.m8950a((List<String>) bdtVarM8984a.f7885b.f7877a));
            Long lM9035b = bdtVarM8984a.m9035b();
            if (lM9035b != null) {
                map2.put("q", bdtVarM8984a.m9034a().f7878b);
                map2.put("t", lM9035b);
            }
            m8993a("n", map2, (bdo) null);
        }
        m9015k();
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: a */
    public final void mo8964a(List<String> list, Map<String, Object> map, bdc bdcVar, Long l, bdw bdwVar) {
        bdg bdgVar = null;
        bdq bdqVar = new bdq(list, map);
        if (this.f7849u.m9541a()) {
            bkl bklVar = this.f7849u;
            String strValueOf = String.valueOf(bdqVar);
            bklVar.m9540a(new StringBuilder(String.valueOf(strValueOf).length() + 13).append("Listening on ").append(strValueOf).toString(), null, new Object[0]);
        }
        bda.m8952a(!this.f7843o.containsKey(bdqVar), "listen() called twice for same QuerySpec.", new Object[0]);
        if (this.f7849u.m9541a()) {
            bkl bklVar2 = this.f7849u;
            String strValueOf2 = String.valueOf(bdqVar);
            bklVar2.m9540a(new StringBuilder(String.valueOf(strValueOf2).length() + 21).append("Adding listen query: ").append(strValueOf2).toString(), null, new Object[0]);
        }
        bdt bdtVar = new bdt(bdwVar, bdqVar, l, bdcVar, bdgVar);
        this.f7843o.put(bdqVar, bdtVar);
        if (m9003e()) {
            m8990a(bdtVar);
        }
        m9015k();
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: a */
    public final void mo8965a(List<String> list, Map<String, Object> map, bdw bdwVar) {
        m8992a("m", list, map, (String) null, bdwVar);
    }

    @Override // com.google.android.gms.internal.bcu
    /* JADX INFO: renamed from: a */
    public final void mo8937a(Map<String, Object> map) {
        if (map.containsKey("r")) {
            bdo bdoVarRemove = this.f7840l.remove(Long.valueOf(((Integer) map.get("r")).intValue()));
            if (bdoVarRemove != null) {
                bdoVarRemove.mo9024a((Map) map.get("b"));
                return;
            }
            return;
        }
        if (map.containsKey("error")) {
            return;
        }
        if (!map.containsKey("a")) {
            if (this.f7849u.m9541a()) {
                bkl bklVar = this.f7849u;
                String strValueOf = String.valueOf(map);
                bklVar.m9540a(new StringBuilder(String.valueOf(strValueOf).length() + 26).append("Ignoring unknown message: ").append(strValueOf).toString(), null, new Object[0]);
                return;
            }
            return;
        }
        String str = (String) map.get("a");
        Map map2 = (Map) map.get("b");
        if (this.f7849u.m9541a()) {
            bkl bklVar2 = this.f7849u;
            String strValueOf2 = String.valueOf(map2);
            bklVar2.m9540a(new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(strValueOf2).length()).append("handleServerMessage: ").append(str).append(" ").append(strValueOf2).toString(), null, new Object[0]);
        }
        if (str.equals("d") || str.equals("m")) {
            boolean zEquals = str.equals("m");
            String str2 = (String) map2.get("p");
            Object obj = map2.get("d");
            Long lM8949a = bda.m8949a(map2.get("t"));
            if (!zEquals || !(obj instanceof Map) || ((Map) obj).size() != 0) {
                this.f7830b.mo8976a(bda.m8951a(str2), obj, zEquals, lM8949a);
                return;
            } else {
                if (this.f7849u.m9541a()) {
                    bkl bklVar3 = this.f7849u;
                    String strValueOf3 = String.valueOf(str2);
                    bklVar3.m9540a(strValueOf3.length() != 0 ? "ignoring empty merge for path ".concat(strValueOf3) : new String("ignoring empty merge for path "), null, new Object[0]);
                    return;
                }
                return;
            }
        }
        if (str.equals("rm")) {
            String str3 = (String) map2.get("p");
            List<String> listM8951a = bda.m8951a(str3);
            Object obj2 = map2.get("d");
            Long lM8949a2 = bda.m8949a(map2.get("t"));
            ArrayList arrayList = new ArrayList();
            for (Map map3 : (List) obj2) {
                String str4 = (String) map3.get("s");
                String str5 = (String) map3.get("e");
                arrayList.add(new bdv(str4 != null ? bda.m8951a(str4) : null, str5 != null ? bda.m8951a(str5) : null, map3.get("m")));
            }
            if (!arrayList.isEmpty()) {
                this.f7830b.mo8977a(listM8951a, arrayList, lM8949a2);
                return;
            } else {
                if (this.f7849u.m9541a()) {
                    bkl bklVar4 = this.f7849u;
                    String strValueOf4 = String.valueOf(str3);
                    bklVar4.m9540a(strValueOf4.length() != 0 ? "Ignoring empty range merge for path ".concat(strValueOf4) : new String("Ignoring empty range merge for path "), null, new Object[0]);
                    return;
                }
                return;
            }
        }
        if (str.equals("c")) {
            m8995a(bda.m8951a((String) map2.get("p")));
            return;
        }
        if (str.equals("ac")) {
            String str6 = (String) map2.get("s");
            String str7 = (String) map2.get("d");
            this.f7849u.m9540a(new StringBuilder(String.valueOf(str6).length() + 23 + String.valueOf(str7).length()).append("Auth token revoked: ").append(str6).append(" (").append(str7).append(")").toString(), null, new Object[0]);
            this.f7844p = null;
            this.f7845q = true;
            this.f7830b.mo8979a(false);
            this.f7836h.m8933b();
            return;
        }
        if (str.equals("sd")) {
            this.f7849u.m9538a((String) map2.get("msg"));
        } else if (this.f7849u.m9541a()) {
            bkl bklVar5 = this.f7849u;
            String strValueOf5 = String.valueOf(str);
            bklVar5.m9540a(strValueOf5.length() != 0 ? "Unrecognized action from server: ".concat(strValueOf5) : new String("Unrecognized action from server: "), null, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: b */
    public final void mo8966b() {
        mo8972d("shutdown");
    }

    @Override // com.google.android.gms.internal.bcu
    /* JADX INFO: renamed from: b */
    public final void mo8938b(String str) {
        if (this.f7849u.m9541a()) {
            bkl bklVar = this.f7849u;
            String strValueOf = String.valueOf(str);
            bklVar.m9540a(strValueOf.length() != 0 ? "Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: ".concat(strValueOf) : new String("Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: "), null, new Object[0]);
        }
        mo8972d("server_kill");
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: b */
    public final void mo8967b(List<String> list, Object obj, bdw bdwVar) {
        this.f7829B = true;
        if (m9005f()) {
            m8991a("o", list, obj, bdwVar);
        } else {
            this.f7841m.add(new bds("o", list, obj, bdwVar, null));
        }
        m9015k();
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: b */
    public final void mo8968b(List<String> list, Map<String, Object> map, bdw bdwVar) {
        this.f7829B = true;
        if (m9005f()) {
            m8991a("om", list, map, bdwVar);
        } else {
            this.f7841m.add(new bds("om", list, map, bdwVar, null));
        }
        m9015k();
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: c */
    public final void mo8969c() {
        this.f7849u.m9540a("Auth token refresh requested", null, new Object[0]);
        mo8972d("token_refresh");
        mo8973e("token_refresh");
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: c */
    public final void mo8970c(String str) {
        this.f7849u.m9540a("Auth token refreshed.", null, new Object[0]);
        this.f7844p = str;
        if (m9003e()) {
            if (str != null) {
                m8997a(false);
                return;
            }
            bda.m8952a(m9003e(), "Must be connected to send unauth.", new Object[0]);
            bda.m8952a(this.f7844p == null, "Auth token must not be set.", new Object[0]);
            m8993a("unauth", Collections.emptyMap(), (bdo) null);
        }
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: d */
    public final void mo8971d() {
        for (bdu bduVar : this.f7842n.values()) {
            if (bduVar.f7890c != null) {
                bduVar.f7890c.mo9046a("write_canceled", null);
            }
        }
        for (bds bdsVar : this.f7841m) {
            if (bdsVar.f7883d != null) {
                bdsVar.f7883d.mo9046a("write_canceled", null);
            }
        }
        this.f7842n.clear();
        this.f7841m.clear();
        if (!m9003e()) {
            this.f7829B = false;
        }
        m9015k();
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: d */
    public final void mo8972d(String str) {
        if (this.f7849u.m9541a()) {
            bkl bklVar = this.f7849u;
            String strValueOf = String.valueOf(str);
            bklVar.m9540a(strValueOf.length() != 0 ? "Connection interrupted for: ".concat(strValueOf) : new String("Connection interrupted for: "), null, new Object[0]);
        }
        this.f7833e.add(str);
        if (this.f7836h != null) {
            this.f7836h.m8933b();
            this.f7836h = null;
        } else {
            this.f7850v.m9079c();
            this.f7837i = bdp.Disconnected;
        }
        this.f7850v.m9076a();
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: e */
    public final void mo8973e(String str) {
        if (this.f7849u.m9541a()) {
            bkl bklVar = this.f7849u;
            String strValueOf = String.valueOf(str);
            bklVar.m9540a(strValueOf.length() != 0 ? "Connection no longer interrupted for: ".concat(strValueOf) : new String("Connection no longer interrupted for: "), null, new Object[0]);
        }
        this.f7833e.remove(str);
        if (m9007g() && this.f7837i == bdp.Disconnected) {
            m9008h();
        }
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: f */
    public final boolean mo8974f(String str) {
        return this.f7833e.contains(str);
    }

    /* JADX INFO: renamed from: g */
    public final void m9023g(String str) {
        bda.m8952a(this.f7837i == bdp.GettingToken, "Trying to open network connection while in the wrong state: %s", this.f7837i);
        if (str == null) {
            this.f7830b.mo8979a(false);
        }
        this.f7844p = str;
        this.f7837i = bdp.Connecting;
        this.f7836h = new bct(this.f7846r, this.f7831c, this.f7832d, this, this.f7851w);
        this.f7836h.m8929a();
    }
}
