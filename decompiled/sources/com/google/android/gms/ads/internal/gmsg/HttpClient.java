package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.ads.internal.p048js.InterfaceC0783a;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1590gp;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.C1661jf;
import com.google.android.gms.internal.C1670jo;
import com.google.android.gms.internal.cnb;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@cnb
@Keep
@KeepName
public class HttpClient implements InterfaceC0748aa<InterfaceC0783a> {
    private final Context mContext;
    private final C1670jo zzapr;

    /* JADX INFO: renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$a */
    @cnb
    static class C0743a {

        /* JADX INFO: renamed from: a */
        private final String f4599a;

        /* JADX INFO: renamed from: b */
        private final String f4600b;

        public C0743a(String str, String str2) {
            this.f4599a = str;
            this.f4600b = str2;
        }

        /* JADX INFO: renamed from: a */
        public final String m5662a() {
            return this.f4599a;
        }

        /* JADX INFO: renamed from: b */
        public final String m5663b() {
            return this.f4600b;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$b */
    @cnb
    static class C0744b {

        /* JADX INFO: renamed from: a */
        private final String f4601a;

        /* JADX INFO: renamed from: b */
        private final URL f4602b;

        /* JADX INFO: renamed from: c */
        private final ArrayList<C0743a> f4603c;

        /* JADX INFO: renamed from: d */
        private final String f4604d;

        C0744b(String str, URL url, ArrayList<C0743a> arrayList, String str2) {
            this.f4601a = str;
            this.f4602b = url;
            this.f4603c = arrayList;
            this.f4604d = str2;
        }

        /* JADX INFO: renamed from: a */
        public final String m5664a() {
            return this.f4601a;
        }

        /* JADX INFO: renamed from: b */
        public final URL m5665b() {
            return this.f4602b;
        }

        /* JADX INFO: renamed from: c */
        public final ArrayList<C0743a> m5666c() {
            return this.f4603c;
        }

        /* JADX INFO: renamed from: d */
        public final String m5667d() {
            return this.f4604d;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$c */
    @cnb
    class C0745c {

        /* JADX INFO: renamed from: a */
        private final C0746d f4605a;

        /* JADX INFO: renamed from: b */
        private final boolean f4606b;

        /* JADX INFO: renamed from: c */
        private final String f4607c;

        public C0745c(HttpClient httpClient, boolean z, C0746d c0746d, String str) {
            this.f4606b = z;
            this.f4605a = c0746d;
            this.f4607c = str;
        }

        /* JADX INFO: renamed from: a */
        public final String m5668a() {
            return this.f4607c;
        }

        /* JADX INFO: renamed from: b */
        public final C0746d m5669b() {
            return this.f4605a;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m5670c() {
            return this.f4606b;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$d */
    @cnb
    static class C0746d {

        /* JADX INFO: renamed from: a */
        private final String f4608a;

        /* JADX INFO: renamed from: b */
        private final int f4609b;

        /* JADX INFO: renamed from: c */
        private final List<C0743a> f4610c;

        /* JADX INFO: renamed from: d */
        private final String f4611d;

        C0746d(String str, int i, List<C0743a> list, String str2) {
            this.f4608a = str;
            this.f4609b = i;
            this.f4610c = list;
            this.f4611d = str2;
        }

        /* JADX INFO: renamed from: a */
        public final String m5671a() {
            return this.f4608a;
        }

        /* JADX INFO: renamed from: b */
        public final int m5672b() {
            return this.f4609b;
        }

        /* JADX INFO: renamed from: c */
        public final Iterable<C0743a> m5673c() {
            return this.f4610c;
        }

        /* JADX INFO: renamed from: d */
        public final String m5674d() {
            return this.f4611d;
        }
    }

    public HttpClient(Context context, C1670jo c1670jo) {
        this.mContext = context;
        this.zzapr = c1670jo;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C0745c zza(C0744b c0744b) throws Throwable {
        Exception e;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        HttpURLConnection httpURLConnection3 = null;
        byte[] bytes = null;
        try {
            httpURLConnection2 = (HttpURLConnection) c0744b.m5665b().openConnection();
        } catch (Exception e2) {
            e = e2;
            httpURLConnection = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            C0710au.m5569e().m11444a(this.mContext, this.zzapr.f10855a, false, httpURLConnection2);
            ArrayList<C0743a> arrayListM5666c = c0744b.m5666c();
            int size = arrayListM5666c.size();
            int i = 0;
            while (i < size) {
                C0743a c0743a = arrayListM5666c.get(i);
                i++;
                C0743a c0743a2 = c0743a;
                httpURLConnection2.addRequestProperty(c0743a2.m5662a(), c0743a2.m5663b());
            }
            if (!TextUtils.isEmpty(c0744b.m5667d())) {
                httpURLConnection2.setDoOutput(true);
                bytes = c0744b.m5667d().getBytes();
                httpURLConnection2.setFixedLengthStreamingMode(bytes.length);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                bufferedOutputStream.write(bytes);
                bufferedOutputStream.close();
            }
            C1661jf c1661jf = new C1661jf();
            c1661jf.m11604a(httpURLConnection2, bytes);
            ArrayList arrayList = new ArrayList();
            if (httpURLConnection2.getHeaderFields() != null) {
                for (Map.Entry<String, List<String>> entry : httpURLConnection2.getHeaderFields().entrySet()) {
                    Iterator<String> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        arrayList.add(new C0743a(entry.getKey(), it.next()));
                    }
                }
            }
            String strM5664a = c0744b.m5664a();
            int responseCode = httpURLConnection2.getResponseCode();
            C0710au.m5569e();
            C0746d c0746d = new C0746d(strM5664a, responseCode, arrayList, C1596gv.m11383a(new InputStreamReader(httpURLConnection2.getInputStream())));
            c1661jf.m11603a(httpURLConnection2, c0746d.m5672b());
            c1661jf.m11601a(c0746d.m5674d());
            C0745c c0745c = new C0745c(this, true, c0746d, null);
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            return c0745c;
        } catch (Exception e3) {
            e = e3;
            httpURLConnection = httpURLConnection2;
            try {
                C0745c c0745c2 = new C0745c(this, false, null, e.toString());
                if (httpURLConnection == null) {
                    return c0745c2;
                }
                httpURLConnection.disconnect();
                return c0745c2;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection3 = httpURLConnection;
                if (httpURLConnection3 != null) {
                    httpURLConnection3.disconnect();
                }
                throw th;
            }
        } catch (Throwable th3) {
            httpURLConnection3 = httpURLConnection2;
            th = th3;
            if (httpURLConnection3 != null) {
            }
            throw th;
        }
    }

    private static JSONObject zza(C0746d c0746d) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("http_request_id", c0746d.m5671a());
            if (c0746d.m5674d() != null) {
                jSONObject.put("body", c0746d.m5674d());
            }
            JSONArray jSONArray = new JSONArray();
            for (C0743a c0743a : c0746d.m5673c()) {
                jSONArray.put(new JSONObject().put("key", c0743a.m5662a()).put("value", c0743a.m5663b()));
            }
            jSONObject.put("headers", jSONArray);
            jSONObject.put("response_code", c0746d.m5672b());
        } catch (JSONException e) {
            C1560fm.m11611b("Error constructing JSON for http response.", e);
        }
        return jSONObject;
    }

    private static C0744b zzd(JSONObject jSONObject) {
        URL url;
        String strOptString = jSONObject.optString("http_request_id");
        String strOptString2 = jSONObject.optString("url");
        String strOptString3 = jSONObject.optString("post_body", null);
        try {
            url = new URL(strOptString2);
        } catch (MalformedURLException e) {
            C1560fm.m11611b("Error constructing http request.", e);
            url = null;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("headers");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(new C0743a(jSONObjectOptJSONObject.optString("key"), jSONObjectOptJSONObject.optString("value")));
            }
        }
        return new C0744b(strOptString, url, arrayList, strOptString3);
    }

    @Keep
    @KeepName
    public JSONObject send(JSONObject jSONObject) throws Throwable {
        JSONObject jSONObject2 = new JSONObject();
        String strOptString = "";
        try {
            strOptString = jSONObject.optString("http_request_id");
            C0745c c0745cZza = zza(zzd(jSONObject));
            if (c0745cZza.m5670c()) {
                jSONObject2.put("response", zza(c0745cZza.m5669b()));
                jSONObject2.put("success", true);
            } else {
                jSONObject2.put("response", new JSONObject().put("http_request_id", strOptString));
                jSONObject2.put("success", false);
                jSONObject2.put("reason", c0745cZza.m5668a());
            }
        } catch (Exception e) {
            C1560fm.m11611b("Error executing http request.", e);
            try {
                jSONObject2.put("response", new JSONObject().put("http_request_id", strOptString));
                jSONObject2.put("success", false);
                jSONObject2.put("reason", e.toString());
            } catch (JSONException e2) {
                C1560fm.m11611b("Error executing http request.", e2);
            }
        }
        return jSONObject2;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final /* synthetic */ void zza(InterfaceC0783a interfaceC0783a, Map map) {
        C1590gp.m11370a(new RunnableC0749ab(this, map, interfaceC0783a));
    }
}
