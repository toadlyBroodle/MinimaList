package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.ads.p046c.C0677a;
import com.google.android.gms.common.util.C1308l;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.bf */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class BinderC1428bf extends AbstractBinderC1360af {

    /* JADX INFO: renamed from: a */
    private static final Object f7981a = new Object();

    /* JADX INFO: renamed from: b */
    private static BinderC1428bf f7982b;

    /* JADX INFO: renamed from: c */
    private final Context f7983c;

    /* JADX INFO: renamed from: d */
    private final C1427be f7984d;

    /* JADX INFO: renamed from: e */
    private final ScheduledExecutorService f7985e = Executors.newSingleThreadScheduledExecutor();

    private BinderC1428bf(Context context, C1427be c1427be) {
        this.f7983c = context;
        this.f7984d = c1427be;
    }

    /* JADX INFO: renamed from: a */
    public static BinderC1428bf m9142a(Context context, C1427be c1427be) {
        BinderC1428bf binderC1428bf;
        synchronized (f7981a) {
            if (f7982b == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                can.m10549a(context);
                f7982b = new BinderC1428bf(context, c1427be);
                if (context.getApplicationContext() != null) {
                    C0710au.m5569e().m11451c(context);
                }
                C1558fk.m11342a(context);
            }
            binderC1428bf = f7982b;
        }
        return binderC1428bf;
    }

    /* JADX INFO: renamed from: a */
    private static C2087z m9144a(Context context, C1427be c1427be, C1979v c1979v, ScheduledExecutorService scheduledExecutorService) {
        String string;
        C1560fm.m11610b("Starting ad request from service using: google.afma.request.getAdDictionary");
        cba cbaVar = new cba(((Boolean) bxm.m10409f().m10546a(can.f9408H)).booleanValue(), "load_ad", c1979v.f11754d.f9247a);
        if (c1979v.f11749a > 10 && c1979v.f11723A != -1) {
            cbaVar.m10581a(cbaVar.m10576a(c1979v.f11723A), "cts");
        }
        cay cayVarM10575a = cbaVar.m10575a();
        InterfaceFutureC1689kg interfaceFutureC1689kgM11619a = C1678jw.m11619a(c1427be.f7916h.mo11068a(context), ((Long) bxm.m10409f().m10546a(can.f9570ck)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService);
        InterfaceFutureC1689kg interfaceFutureC1689kgM11619a2 = C1678jw.m11619a(c1427be.f7915g.mo10574a(context), ((Long) bxm.m10409f().m10546a(can.f9514bh)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService);
        InterfaceFutureC1689kg<String> interfaceFutureC1689kgMo11252a = c1427be.f7911c.mo11252a(c1979v.f11757g.packageName);
        InterfaceFutureC1689kg<String> interfaceFutureC1689kgMo11254a = c1427be.f7917i.mo11254a(c1979v.f11758h, c1979v.f11757g);
        Future<C1456bs> futureM10252a = C0710au.m5579o().m10252a(context);
        InterfaceFutureC1689kg<Location> interfaceFutureC1689kgM11618a = C1678jw.m11618a(null);
        Bundle bundle = c1979v.f11753c.f9209c;
        boolean z = (bundle == null || bundle.getString("_ad") == null) ? false : true;
        if (c1979v.f11729G && !z) {
            interfaceFutureC1689kgM11618a = c1427be.f7914f.mo10861a(c1979v.f11756f);
        }
        InterfaceFutureC1689kg interfaceFutureC1689kgM11619a3 = C1678jw.m11619a(interfaceFutureC1689kgM11618a, ((Long) bxm.m10409f().m10546a(can.f9561cb)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService);
        InterfaceFutureC1689kg interfaceFutureC1689kgM11619a4 = ((Boolean) bxm.m10409f().m10546a(can.f9477ax)).booleanValue() ? C1678jw.m11619a(c1427be.f7917i.mo11253a(context), ((Long) bxm.m10409f().m10546a(can.f9478ay)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService) : C1678jw.m11618a(null);
        Bundle bundle2 = (c1979v.f11749a < 4 || c1979v.f11765o == null) ? null : c1979v.f11765o;
        ((Boolean) bxm.m10409f().m10546a(can.f9424X)).booleanValue();
        C0710au.m5569e();
        if (C1596gv.m11400a(context, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE") && ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() == null) {
            C1560fm.m11610b("Device is offline.");
        }
        String string2 = c1979v.f11749a >= 7 ? c1979v.f11772v : UUID.randomUUID().toString();
        new C1435bl(context, string2, c1979v.f11756f.packageName);
        if (c1979v.f11753c.f9209c != null && (string = c1979v.f11753c.f9209c.getString("_ad")) != null) {
            return C1433bk.m9511a(context, c1979v, string);
        }
        List<String> listMo10524a = c1427be.f7912d.mo10524a(c1979v.f11773w);
        Bundle bundle3 = (Bundle) C1678jw.m11624a(interfaceFutureC1689kgM11619a, (Object) null, ((Long) bxm.m10409f().m10546a(can.f9570ck)).longValue(), TimeUnit.MILLISECONDS);
        C1469cc c1469cc = (C1469cc) C1678jw.m11623a(interfaceFutureC1689kgM11619a2, (Object) null);
        Location location = (Location) C1678jw.m11623a(interfaceFutureC1689kgM11619a3, (Object) null);
        C0677a.a aVar = (C0677a.a) C1678jw.m11623a(interfaceFutureC1689kgM11619a4, (Object) null);
        String str = (String) C1678jw.m11623a(interfaceFutureC1689kgMo11254a, (Object) null);
        String str2 = (String) C1678jw.m11623a(interfaceFutureC1689kgMo11252a, (Object) null);
        C1456bs c1456bs = (C1456bs) C1678jw.m11623a(futureM10252a, (Object) null);
        if (c1456bs == null) {
            C1560fm.m11615e("Error fetching device info. This is not recoverable.");
            return new C2087z(0);
        }
        C1425bc c1425bc = new C1425bc();
        c1425bc.f7769i = c1979v;
        c1425bc.f7770j = c1456bs;
        c1425bc.f7765e = c1469cc;
        c1425bc.f7764d = location;
        c1425bc.f7762b = bundle3;
        c1425bc.f7767g = str;
        c1425bc.f7768h = aVar;
        if (listMo10524a == null) {
            c1425bc.f7763c.clear();
        }
        c1425bc.f7763c = listMo10524a;
        c1425bc.f7761a = bundle2;
        c1425bc.f7766f = str2;
        c1425bc.f7771k = c1427be.f7910b.mo10350a(context);
        c1425bc.f7772l = c1427be.f7918j;
        JSONObject jSONObjectM9515a = C1433bk.m9515a(context, c1425bc);
        if (jSONObjectM9515a == null) {
            return new C2087z(0);
        }
        if (c1979v.f11749a < 7) {
            try {
                jSONObjectM9515a.put("request_id", string2);
            } catch (JSONException e) {
            }
        }
        jSONObjectM9515a.toString();
        cbaVar.m10581a(cayVarM10575a, "arc");
        cbaVar.m10575a();
        InterfaceFutureC1689kg interfaceFutureC1689kgM11619a5 = C1678jw.m11619a(C1678jw.m11620a(c1427be.f7919k.mo9433a().mo10850b(jSONObjectM9515a), C1429bg.f8066a, scheduledExecutorService), 10L, TimeUnit.SECONDS, scheduledExecutorService);
        InterfaceFutureC1689kg<Void> interfaceFutureC1689kgMo10376a = c1427be.f7913e.mo10376a();
        if (interfaceFutureC1689kgMo10376a != null) {
            C1676ju.m11617a(interfaceFutureC1689kgMo10376a, "AdRequestServiceImpl.loadAd.flags");
        }
        C1451br c1451br = (C1451br) C1678jw.m11623a(interfaceFutureC1689kgM11619a5, (Object) null);
        if (c1451br == null) {
            return new C2087z(0);
        }
        if (c1451br.m10008a() != -2) {
            return new C2087z(c1451br.m10008a());
        }
        cbaVar.m10584d();
        C2087z c2087zM9511a = TextUtils.isEmpty(c1451br.m10017i()) ? null : C1433bk.m9511a(context, c1979v, c1451br.m10017i());
        if (c2087zM9511a == null && !TextUtils.isEmpty(c1451br.m10013e())) {
            c2087zM9511a = m9145a(c1979v, context, c1979v.f11761k.f10855a, c1451br.m10013e(), str2, c1451br, cbaVar, c1427be);
        }
        if (c2087zM9511a == null) {
            c2087zM9511a = new C2087z(0);
        }
        cbaVar.m10581a(cayVarM10575a, "tts");
        c2087zM9511a.f12631w = cbaVar.m10582b();
        return c2087zM9511a;
    }

    /* JADX INFO: renamed from: a */
    public static C2087z m9145a(C1979v c1979v, Context context, String str, String str2, String str3, C1451br c1451br, cba cbaVar, C1427be c1427be) {
        int responseCode;
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        BufferedOutputStream bufferedOutputStream;
        cay cayVarM10575a = cbaVar != null ? cbaVar.m10575a() : null;
        try {
            C1449bp c1449bp = new C1449bp(c1979v, c1451br.m10011c());
            String strValueOf = String.valueOf(str2);
            C1560fm.m11610b(strValueOf.length() != 0 ? "AdRequestServiceImpl: Sending request: ".concat(strValueOf) : new String("AdRequestServiceImpl: Sending request: "));
            URL url = new URL(str2);
            long jMo7253b = C0710au.m5575k().mo7253b();
            int i = 0;
            URL url2 = url;
            while (true) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url2.openConnection();
                try {
                    C0710au.m5569e().m11444a(context, str, false, httpURLConnection);
                    if (!TextUtils.isEmpty(str3) && c1451br.m10015g()) {
                        httpURLConnection.addRequestProperty("x-afma-drt-cookie", str3);
                    }
                    String str4 = c1979v.f11730H;
                    if (!TextUtils.isEmpty(str4)) {
                        C1560fm.m11610b("Sending webview cookie in ad request header.");
                        httpURLConnection.addRequestProperty("Cookie", str4);
                    }
                    byte[] bytes = null;
                    if (c1451br != null && !TextUtils.isEmpty(c1451br.m10012d())) {
                        httpURLConnection.setDoOutput(true);
                        bytes = c1451br.m10012d().getBytes();
                        httpURLConnection.setFixedLengthStreamingMode(bytes.length);
                        try {
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                            try {
                                bufferedOutputStream2.write(bytes);
                                C1308l.m7275a(bufferedOutputStream2);
                            } catch (Throwable th) {
                                th = th;
                                bufferedOutputStream = bufferedOutputStream2;
                                C1308l.m7275a(bufferedOutputStream);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedOutputStream = null;
                        }
                    }
                    C1661jf c1661jf = new C1661jf(c1979v.f11772v);
                    c1661jf.m11604a(httpURLConnection, bytes);
                    responseCode = httpURLConnection.getResponseCode();
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    c1661jf.m11603a(httpURLConnection, responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        String string = url2.toString();
                        try {
                            inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                        } catch (Throwable th3) {
                            th = th3;
                            inputStreamReader = null;
                        }
                        try {
                            C0710au.m5569e();
                            String strM11383a = C1596gv.m11383a(inputStreamReader2);
                            C1308l.m7275a(inputStreamReader2);
                            c1661jf.m11601a(strM11383a);
                            m9146a(string, headerFields, strM11383a, responseCode);
                            c1449bp.m9927a(string, headerFields, strM11383a);
                            if (cbaVar != null) {
                                cbaVar.m10581a(cayVarM10575a, "ufe");
                            }
                            return c1449bp.m9926a(jMo7253b, c1451br.m10018j());
                        } catch (Throwable th4) {
                            th = th4;
                            inputStreamReader = inputStreamReader2;
                            C1308l.m7275a(inputStreamReader);
                            throw th;
                        }
                    }
                    m9146a(url2.toString(), headerFields, (String) null, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        break;
                    }
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (TextUtils.isEmpty(headerField)) {
                        C1560fm.m11615e("No location header to follow redirect.");
                        return new C2087z(0);
                    }
                    URL url3 = new URL(headerField);
                    int i2 = i + 1;
                    if (i2 > ((Integer) bxm.m10409f().m10546a(can.f9545cL)).intValue()) {
                        C1560fm.m11615e("Too many redirects.");
                        return new C2087z(0);
                    }
                    c1449bp.m9928a(headerFields);
                    if (c1427be != null) {
                        i = i2;
                        url2 = url3;
                    } else {
                        i = i2;
                        url2 = url3;
                    }
                } finally {
                    httpURLConnection.disconnect();
                }
            }
            C1560fm.m11615e(new StringBuilder(46).append("Received error HTTP response code: ").append(responseCode).toString());
            return new C2087z(0);
        } catch (IOException e) {
            String strValueOf2 = String.valueOf(e.getMessage());
            C1560fm.m11615e(strValueOf2.length() != 0 ? "Error while connecting to ad server: ".concat(strValueOf2) : new String("Error while connecting to ad server: "));
            return new C2087z(2);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m9146a(String str, Map<String, List<String>> map, String str2, int i) {
        if (C1560fm.m11609a(2)) {
            C1560fm.m11343a(new StringBuilder(String.valueOf(str).length() + 39).append("Http Response: {\n  URL:\n    ").append(str).append("\n  Headers:").toString());
            if (map != null) {
                for (String str3 : map.keySet()) {
                    C1560fm.m11343a(new StringBuilder(String.valueOf(str3).length() + 5).append("    ").append(str3).append(":").toString());
                    Iterator<String> it = map.get(str3).iterator();
                    while (it.hasNext()) {
                        String strValueOf = String.valueOf(it.next());
                        C1560fm.m11343a(strValueOf.length() != 0 ? "      ".concat(strValueOf) : new String("      "));
                    }
                }
            }
            C1560fm.m11343a("  Body:");
            if (str2 != null) {
                for (int i2 = 0; i2 < Math.min(str2.length(), 100000); i2 += 1000) {
                    C1560fm.m11343a(str2.substring(i2, Math.min(str2.length(), i2 + 1000)));
                }
            } else {
                C1560fm.m11343a("    null");
            }
            C1560fm.m11343a(new StringBuilder(34).append("  Response Code:\n    ").append(i).append("\n}").toString());
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1359ae
    /* JADX INFO: renamed from: a */
    public final C2087z mo7701a(C1979v c1979v) {
        return m9144a(this.f7983c, this.f7984d, c1979v, this.f7985e);
    }

    @Override // com.google.android.gms.internal.InterfaceC1359ae
    /* JADX INFO: renamed from: a */
    public final void mo7702a(C1375ap c1375ap, InterfaceC1370ak interfaceC1370ak) {
        C1560fm.m11343a("Nonagon code path entered in octagon");
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.InterfaceC1359ae
    /* JADX INFO: renamed from: a */
    public final void mo7703a(C1979v c1979v, InterfaceC1362ah interfaceC1362ah) {
        C0710au.m5573i().m11287a(this.f7983c, c1979v.f11761k);
        InterfaceFutureC1689kg<Void> interfaceFutureC1689kgM11370a = C1590gp.m11370a(new RunnableC1430bh(this, c1979v, interfaceC1362ah));
        C0710au.m5583s().m11535a();
        C0710au.m5583s().m11536b().postDelayed(new RunnableC1431bi(this, interfaceFutureC1689kgM11370a), 60000L);
    }
}
