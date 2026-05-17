package com.google.android.gms.internal;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: com.google.android.gms.internal.qo */
/* JADX INFO: loaded from: classes.dex */
public final class C1859qo extends AbstractC1582gh {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1887rp f11382a;

    /* JADX INFO: renamed from: b */
    private final SSLSocketFactory f11383b;

    public C1859qo() {
        this(null);
    }

    private C1859qo(InterfaceC1887rp interfaceC1887rp) {
        this(null, null);
    }

    private C1859qo(InterfaceC1887rp interfaceC1887rp, SSLSocketFactory sSLSocketFactory) {
        this.f11382a = null;
        this.f11383b = null;
    }

    /* JADX INFO: renamed from: a */
    private static InputStream m12160a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException e) {
            return httpURLConnection.getErrorStream();
        }
    }

    /* JADX INFO: renamed from: a */
    private static List<byl> m12161a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new byl(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private static void m12162a(HttpURLConnection httpURLConnection, cej<?> cejVar) {
        byte[] bArrMo10763a = cejVar.mo10763a();
        if (bArrMo10763a != null) {
            httpURLConnection.setDoOutput(true);
            String strValueOf = String.valueOf("UTF-8");
            httpURLConnection.addRequestProperty("Content-Type", strValueOf.length() != 0 ? "application/x-www-form-urlencoded; charset=".concat(strValueOf) : new String("application/x-www-form-urlencoded; charset="));
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(bArrMo10763a);
            dataOutputStream.close();
        }
    }

    @Override // com.google.android.gms.internal.AbstractC1582gh
    /* JADX INFO: renamed from: a */
    public final C1806op mo11337a(cej<?> cejVar, Map<String, String> map) throws IOException {
        String strM12261a;
        String strM10769e = cejVar.m10769e();
        HashMap map2 = new HashMap();
        map2.putAll(cejVar.mo10764b());
        map2.putAll(map);
        if (this.f11382a != null) {
            strM12261a = this.f11382a.m12261a(strM10769e);
            if (strM12261a == null) {
                String strValueOf = String.valueOf(strM10769e);
                throw new IOException(strValueOf.length() != 0 ? "URL blocked by rewriter: ".concat(strValueOf) : new String("URL blocked by rewriter: "));
            }
        } else {
            strM12261a = strM10769e;
        }
        URL url = new URL(strM12261a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int iM10772h = cejVar.m10772h();
        httpURLConnection.setConnectTimeout(iM10772h);
        httpURLConnection.setReadTimeout(iM10772h);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        "https".equals(url.getProtocol());
        for (String str : map2.keySet()) {
            httpURLConnection.addRequestProperty(str, (String) map2.get(str));
        }
        switch (cejVar.m10766c()) {
            case -1:
                break;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                break;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                m12162a(httpURLConnection, cejVar);
                break;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                m12162a(httpURLConnection, cejVar);
                break;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                break;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                break;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                break;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                break;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                m12162a(httpURLConnection, cejVar);
                break;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == -1) {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        return !(cejVar.m10766c() != 4 && ((100 > responseCode || responseCode >= 200) && responseCode != 204 && responseCode != 304)) ? new C1806op(responseCode, m12161a(httpURLConnection.getHeaderFields())) : new C1806op(responseCode, m12161a(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), m12160a(httpURLConnection));
    }
}
