package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.common.C1283m;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.C1310n;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.dx */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1517dx implements InterfaceC1528eh {

    /* JADX INFO: renamed from: a */
    boolean f10477a;

    /* JADX INFO: renamed from: b */
    private final bsg f10478b;

    /* JADX INFO: renamed from: c */
    private final LinkedHashMap<String, bso> f10479c;

    /* JADX INFO: renamed from: d */
    private final Context f10480d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1530ej f10481e;

    /* JADX INFO: renamed from: f */
    private final C1524ed f10482f;

    /* JADX INFO: renamed from: g */
    private final Object f10483g = new Object();

    /* JADX INFO: renamed from: h */
    private HashSet<String> f10484h = new HashSet<>();

    /* JADX INFO: renamed from: i */
    private boolean f10485i = false;

    /* JADX INFO: renamed from: j */
    private boolean f10486j = false;

    /* JADX INFO: renamed from: k */
    private boolean f10487k = false;

    public C1517dx(Context context, C1670jo c1670jo, C1524ed c1524ed, String str, InterfaceC1530ej interfaceC1530ej) {
        C1221aj.m7066a(c1524ed, "SafeBrowsing config is not present.");
        this.f10480d = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f10479c = new LinkedHashMap<>();
        this.f10481e = interfaceC1530ej;
        this.f10482f = c1524ed;
        Iterator<String> it = this.f10482f.f10498e.iterator();
        while (it.hasNext()) {
            this.f10484h.add(it.next().toLowerCase(Locale.ENGLISH));
        }
        this.f10484h.remove("cookie".toLowerCase(Locale.ENGLISH));
        bsg bsgVar = new bsg();
        bsgVar.f8828a = 8;
        bsgVar.f8829b = str;
        bsgVar.f8830c = str;
        bsgVar.f8831d = new bsh();
        bsgVar.f8831d.f8844a = this.f10482f.f10494a;
        bsp bspVar = new bsp();
        bspVar.f8878a = c1670jo.f10855a;
        bspVar.f8880c = Boolean.valueOf(C2040xg.m12562a(this.f10480d).m12557a());
        C1283m.m7222b();
        long jM7225d = C1283m.m7225d(this.f10480d);
        if (jM7225d > 0) {
            bspVar.f8879b = Long.valueOf(jM7225d);
        }
        bsgVar.f8835h = bspVar;
        this.f10478b = bsgVar;
    }

    /* JADX INFO: renamed from: b */
    private final bso m11206b(String str) {
        bso bsoVar;
        synchronized (this.f10483g) {
            bsoVar = this.f10479c.get(str);
        }
        return bsoVar;
    }

    @Override // com.google.android.gms.internal.InterfaceC1528eh
    /* JADX INFO: renamed from: a */
    public final C1524ed mo11207a() {
        return this.f10482f;
    }

    @Override // com.google.android.gms.internal.InterfaceC1528eh
    /* JADX INFO: renamed from: a */
    public final void mo11208a(View view) {
        if (this.f10482f.f10496c && !this.f10486j) {
            C0710au.m5569e();
            Bitmap bitmapM11406b = C1596gv.m11406b(view);
            if (bitmapM11406b == null) {
                C1527eg.m11219a("Failed to capture the webview bitmap.");
            } else {
                this.f10486j = true;
                C1596gv.m11412b(new RunnableC1518dy(this, bitmapM11406b));
            }
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1528eh
    /* JADX INFO: renamed from: a */
    public final void mo11209a(String str) {
        synchronized (this.f10483g) {
            this.f10478b.f8833f = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[Catch: all -> 0x00ac, TryCatch #1 {, blocks: (B:6:0x0007, B:7:0x0009, B:10:0x0013, B:11:0x0021, B:13:0x0023, B:16:0x004d, B:17:0x005a, B:19:0x0060, B:20:0x0066, B:22:0x006c, B:23:0x0072, B:25:0x0078, B:26:0x007e, B:28:0x008c, B:31:0x00a6, B:38:0x00b5, B:39:0x00c2, B:40:0x00c7), top: B:44:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    @Override // com.google.android.gms.internal.InterfaceC1528eh
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo11210a(String str, Map<String, String> map, int i) {
        synchronized (this.f10483g) {
            if (i == 3) {
                this.f10487k = true;
                if (!this.f10479c.containsKey(str)) {
                    if (i == 3) {
                        this.f10479c.get(str).f8872d = Integer.valueOf(i);
                    }
                    return;
                }
                bso bsoVar = new bso();
                bsoVar.f8872d = Integer.valueOf(i);
                bsoVar.f8869a = Integer.valueOf(this.f10479c.size());
                bsoVar.f8870b = str;
                bsoVar.f8871c = new bsj();
                if (this.f10484h.size() > 0 && map != null) {
                    LinkedList linkedList = new LinkedList();
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        try {
                            String key = entry.getKey() != null ? entry.getKey() : "";
                            String value = entry.getValue() != null ? entry.getValue() : "";
                            if (this.f10484h.contains(key.toLowerCase(Locale.ENGLISH))) {
                                bsi bsiVar = new bsi();
                                bsiVar.f8846a = key.getBytes("UTF-8");
                                bsiVar.f8847b = value.getBytes("UTF-8");
                                linkedList.add(bsiVar);
                            }
                        } catch (UnsupportedEncodingException e) {
                            C1527eg.m11219a("Cannot convert string to bytes, skip header.");
                        }
                    }
                    bsi[] bsiVarArr = new bsi[linkedList.size()];
                    linkedList.toArray(bsiVarArr);
                    bsoVar.f8871c.f8848a = bsiVarArr;
                }
                this.f10479c.put(str, bsoVar);
                return;
            }
            if (!this.f10479c.containsKey(str)) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m11211a(Map<String, String> map) {
        if (map == null) {
            return;
        }
        for (String str : map.keySet()) {
            JSONArray jSONArrayOptJSONArray = new JSONObject(map.get(str)).optJSONArray("matches");
            if (jSONArrayOptJSONArray != null) {
                synchronized (this.f10483g) {
                    int length = jSONArrayOptJSONArray.length();
                    bso bsoVarM11206b = m11206b(str);
                    if (bsoVarM11206b == null) {
                        String strValueOf = String.valueOf(str);
                        C1527eg.m11219a(strValueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(strValueOf) : new String("Cannot find the corresponding resource object for "));
                    } else {
                        bsoVarM11206b.f8873e = new String[length];
                        for (int i = 0; i < length; i++) {
                            bsoVarM11206b.f8873e[i] = jSONArrayOptJSONArray.getJSONObject(i).getString("threat_type");
                        }
                        this.f10477a = (length > 0) | this.f10477a;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1528eh
    /* JADX INFO: renamed from: b */
    public final boolean mo11212b() {
        return C1310n.m7282e() && this.f10482f.f10496c && !this.f10486j;
    }

    @Override // com.google.android.gms.internal.InterfaceC1528eh
    /* JADX INFO: renamed from: c */
    public final void mo11213c() {
        this.f10485i = true;
    }

    @Override // com.google.android.gms.internal.InterfaceC1528eh
    /* JADX INFO: renamed from: d */
    public final void mo11214d() {
        synchronized (this.f10483g) {
            InterfaceFutureC1689kg<Map<String, String>> interfaceFutureC1689kgMo11217a = this.f10481e.mo11217a(this.f10480d, this.f10479c.keySet());
            interfaceFutureC1689kgMo11217a.mo11631a(new RunnableC1519dz(this, interfaceFutureC1689kgMo11217a), C1590gp.f10701a);
        }
    }

    /* JADX INFO: renamed from: e */
    final void m11215e() {
        boolean z = true;
        if ((!this.f10477a || !this.f10482f.f10500g) && ((!this.f10487k || !this.f10482f.f10499f) && (this.f10477a || !this.f10482f.f10497d))) {
            z = false;
        }
        if (z) {
            synchronized (this.f10483g) {
                this.f10478b.f8832e = new bso[this.f10479c.size()];
                this.f10479c.values().toArray(this.f10478b.f8832e);
                if (C1527eg.m11220a()) {
                    String str = this.f10478b.f8829b;
                    String str2 = this.f10478b.f8833f;
                    StringBuilder sb = new StringBuilder(new StringBuilder(String.valueOf(str).length() + 53 + String.valueOf(str2).length()).append("Sending SB report\n  url: ").append(str).append("\n  clickUrl: ").append(str2).append("\n  resources: \n").toString());
                    for (bso bsoVar : this.f10478b.f8832e) {
                        sb.append("    [");
                        sb.append(bsoVar.f8873e.length);
                        sb.append("] ");
                        sb.append(bsoVar.f8870b);
                    }
                    C1527eg.m11219a(sb.toString());
                }
                InterfaceFutureC1689kg<String> interfaceFutureC1689kgM11529a = new C1633ie(this.f10480d).m11529a(1, this.f10482f.f10495b, null, bsc.m10164a(this.f10478b));
                if (C1527eg.m11220a()) {
                    interfaceFutureC1689kgM11529a.mo11631a(new RunnableC1521ea(this), C1590gp.f10701a);
                }
            }
        }
    }
}
