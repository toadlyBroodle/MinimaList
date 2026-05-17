package com.google.android.gms.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.analytics.C0903r;
import com.google.android.gms.common.internal.C1221aj;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: com.google.android.gms.internal.rm */
/* JADX INFO: loaded from: classes.dex */
final class C1884rm extends AbstractC1832po {

    /* JADX INFO: renamed from: c */
    private static final byte[] f11472c = "\n".getBytes();

    /* JADX INFO: renamed from: a */
    private final String f11473a;

    /* JADX INFO: renamed from: b */
    private final C1895rx f11474b;

    C1884rm(C1834pq c1834pq) {
        super(c1834pq);
        this.f11473a = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", C1833pp.f11302a, Build.VERSION.RELEASE, C1897rz.m12285a(Locale.getDefault()), Build.MODEL, Build.ID);
        this.f11474b = new C1895rx(c1834pq.m12058c());
    }

    /* JADX INFO: renamed from: a */
    private final int m12236a(URL url) {
        C1221aj.m7065a(url);
        m12024b("GET request", url);
        HttpURLConnection httpURLConnectionM12243b = null;
        try {
            try {
                httpURLConnectionM12243b = m12243b(url);
                httpURLConnectionM12243b.connect();
                m12241a(httpURLConnectionM12243b);
                int responseCode = httpURLConnectionM12243b.getResponseCode();
                if (responseCode == 200) {
                    m12043o().m12015g();
                }
                m12024b("GET status", Integer.valueOf(responseCode));
                if (httpURLConnectionM12243b == null) {
                    return responseCode;
                }
                httpURLConnectionM12243b.disconnect();
                return responseCode;
            } catch (IOException e) {
                m12031d("Network GET connection error", e);
                if (httpURLConnectionM12243b != null) {
                    httpURLConnectionM12243b.disconnect();
                }
                return 0;
            }
        } catch (Throwable th) {
            if (httpURLConnectionM12243b != null) {
                httpURLConnectionM12243b.disconnect();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int m12237a(URL url, byte[] bArr) throws Throwable {
        HttpURLConnection httpURLConnectionM12243b;
        OutputStream outputStream = null;
        C1221aj.m7065a(url);
        C1221aj.m7065a(bArr);
        Integer numValueOf = Integer.valueOf(bArr.length);
        m12025b("POST bytes, url", numValueOf, url);
        ?? r2 = numValueOf;
        if (m12019w()) {
            String str = new String(bArr);
            m12020a("Post payload\n", str);
            r2 = str;
        }
        try {
            try {
                m12038j().getPackageName();
                httpURLConnectionM12243b = m12243b(url);
                try {
                    httpURLConnectionM12243b.setDoOutput(true);
                    httpURLConnectionM12243b.setFixedLengthStreamingMode(bArr.length);
                    httpURLConnectionM12243b.connect();
                    outputStream = httpURLConnectionM12243b.getOutputStream();
                    outputStream.write(bArr);
                    m12241a(httpURLConnectionM12243b);
                    int responseCode = httpURLConnectionM12243b.getResponseCode();
                    if (responseCode == 200) {
                        m12043o().m12015g();
                    }
                    m12024b("POST status", Integer.valueOf(responseCode));
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e) {
                            m12034e("Error closing http post connection output stream", e);
                        }
                    }
                    if (httpURLConnectionM12243b == null) {
                        return responseCode;
                    }
                    httpURLConnectionM12243b.disconnect();
                    return responseCode;
                } catch (IOException e2) {
                    e = e2;
                    m12031d("Network POST connection error", e);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e3) {
                            m12034e("Error closing http post connection output stream", e3);
                        }
                    }
                    if (httpURLConnectionM12243b != null) {
                        httpURLConnectionM12243b.disconnect();
                    }
                    return 0;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    try {
                        outputStream.close();
                    } catch (IOException e4) {
                        m12034e("Error closing http post connection output stream", e4);
                    }
                }
                if (r2 != 0) {
                    r2.disconnect();
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            httpURLConnectionM12243b = null;
        } catch (Throwable th2) {
            th = th2;
            r2 = 0;
            if (0 != 0) {
            }
            if (r2 != 0) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private final URL m12238a(C1877rf c1877rf) {
        String strConcat;
        if (c1877rf.m12215f()) {
            String strValueOf = String.valueOf(C1863qs.m12176h());
            String strValueOf2 = String.valueOf(C1863qs.m12178j());
            strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
        } else {
            String strValueOf3 = String.valueOf(C1863qs.m12177i());
            String strValueOf4 = String.valueOf(C1863qs.m12178j());
            strConcat = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
        }
        try {
            return new URL(strConcat);
        } catch (MalformedURLException e) {
            m12034e("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private final URL m12239a(C1877rf c1877rf, String str) {
        String string;
        if (c1877rf.m12215f()) {
            String strM12176h = C1863qs.m12176h();
            String strM12178j = C1863qs.m12178j();
            string = new StringBuilder(String.valueOf(strM12176h).length() + 1 + String.valueOf(strM12178j).length() + String.valueOf(str).length()).append(strM12176h).append(strM12178j).append("?").append(str).toString();
        } else {
            String strM12177i = C1863qs.m12177i();
            String strM12178j2 = C1863qs.m12178j();
            string = new StringBuilder(String.valueOf(strM12177i).length() + 1 + String.valueOf(strM12178j2).length() + String.valueOf(str).length()).append(strM12177i).append(strM12178j2).append("?").append(str).toString();
        }
        try {
            return new URL(string);
        } catch (MalformedURLException e) {
            m12034e("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m12240a(StringBuilder sb, String str, String str2) {
        if (sb.length() != 0) {
            sb.append('&');
        }
        sb.append(URLEncoder.encode(str, "UTF-8"));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, "UTF-8"));
    }

    /* JADX INFO: renamed from: a */
    private final void m12241a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            inputStream = httpURLConnection.getInputStream();
            do {
            } while (inputStream.read(new byte[1024]) > 0);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    m12034e("Error closing http connection input stream", e);
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    m12034e("Error closing http connection input stream", e2);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int m12242b(URL url, byte[] bArr) throws Throwable {
        HttpURLConnection httpURLConnectionM12243b;
        HttpURLConnection httpURLConnection;
        byte[] byteArray;
        OutputStream outputStream;
        OutputStream outputStream2 = null;
        C1221aj.m7065a(url);
        C1221aj.m7065a(bArr);
        try {
            m12038j().getPackageName();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            byteArray = byteArrayOutputStream.toByteArray();
            m12022a("POST compressed size, ratio %, url", Integer.valueOf(byteArray.length), Long.valueOf((100 * ((long) byteArray.length)) / ((long) bArr.length)), url);
            if (byteArray.length > bArr.length) {
                m12029c("Compressed payload is larger then uncompressed. compressed, uncompressed", Integer.valueOf(byteArray.length), Integer.valueOf(bArr.length));
            }
            if (m12019w()) {
                String strValueOf = String.valueOf(new String(bArr));
                m12020a("Post payload", strValueOf.length() != 0 ? "\n".concat(strValueOf) : new String("\n"));
            }
            httpURLConnectionM12243b = m12243b(url);
            try {
                httpURLConnectionM12243b.setDoOutput(true);
                httpURLConnectionM12243b.addRequestProperty("Content-Encoding", "gzip");
                httpURLConnectionM12243b.setFixedLengthStreamingMode(byteArray.length);
                httpURLConnectionM12243b.connect();
                outputStream = httpURLConnectionM12243b.getOutputStream();
            } catch (IOException e) {
                e = e;
                httpURLConnection = httpURLConnectionM12243b;
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e = e2;
            httpURLConnection = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnectionM12243b = null;
        }
        try {
            outputStream.write(byteArray);
            outputStream.close();
            m12241a(httpURLConnectionM12243b);
            int responseCode = httpURLConnectionM12243b.getResponseCode();
            if (responseCode == 200) {
                m12043o().m12015g();
            }
            m12024b("POST status", Integer.valueOf(responseCode));
            if (httpURLConnectionM12243b == null) {
                return responseCode;
            }
            httpURLConnectionM12243b.disconnect();
            return responseCode;
        } catch (IOException e3) {
            e = e3;
            outputStream2 = outputStream;
            httpURLConnection = httpURLConnectionM12243b;
            try {
                m12031d("Network compressed POST connection error", e);
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (IOException e4) {
                        m12034e("Error closing http compressed post connection output stream", e4);
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return 0;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnectionM12243b = httpURLConnection;
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (IOException e5) {
                        m12034e("Error closing http compressed post connection output stream", e5);
                    }
                }
                if (httpURLConnectionM12243b != null) {
                    httpURLConnectionM12243b.disconnect();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            outputStream2 = outputStream;
            if (outputStream2 != null) {
            }
            if (httpURLConnectionM12243b != null) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    private final HttpURLConnection m12243b(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain http connection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setDefaultUseCaches(false);
        httpURLConnection.setConnectTimeout(C1872ra.f11439w.m12204a().intValue());
        httpURLConnection.setReadTimeout(C1872ra.f11440x.m12204a().intValue());
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestProperty("User-Agent", this.f11473a);
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: b */
    private final List<Long> m12244b(List<C1877rf> list) {
        boolean z;
        ArrayList arrayList = new ArrayList(list.size());
        for (C1877rf c1877rf : list) {
            C1221aj.m7065a(c1877rf);
            String strM12247a = m12247a(c1877rf, !c1877rf.m12215f());
            if (strM12247a == null) {
                m12039k().m12228a(c1877rf, "Error formatting hit for upload");
                z = true;
            } else if (strM12247a.length() <= C1872ra.f11431o.m12204a().intValue()) {
                URL urlM12239a = m12239a(c1877rf, strM12247a);
                if (urlM12239a == null) {
                    m12035f("Failed to build collect GET endpoint url");
                    z = false;
                } else {
                    z = m12236a(urlM12239a) == 200;
                }
            } else {
                String strM12247a2 = m12247a(c1877rf, false);
                if (strM12247a2 == null) {
                    m12039k().m12228a(c1877rf, "Error formatting hit for POST upload");
                    z = true;
                } else {
                    byte[] bytes = strM12247a2.getBytes();
                    if (bytes.length > C1872ra.f11435s.m12204a().intValue()) {
                        m12039k().m12228a(c1877rf, "Hit payload exceeds size limit");
                        z = true;
                    } else {
                        URL urlM12238a = m12238a(c1877rf);
                        if (urlM12238a == null) {
                            m12035f("Failed to build collect POST endpoint url");
                        } else if (m12237a(urlM12238a, bytes) == 200) {
                            z = true;
                        }
                        z = false;
                    }
                }
            }
            if (!z) {
                break;
            }
            arrayList.add(Long.valueOf(c1877rf.m12212c()));
            if (arrayList.size() >= C1863qs.m12174f()) {
                break;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    private final URL m12246d() {
        String strValueOf = String.valueOf(C1863qs.m12176h());
        String strValueOf2 = String.valueOf(C1872ra.f11430n.m12204a());
        try {
            return new URL(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
        } catch (MalformedURLException e) {
            m12034e("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    final String m12247a(C1877rf c1877rf, boolean z) {
        C1221aj.m7065a(c1877rf);
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : c1877rf.m12211b().entrySet()) {
                String key = entry.getKey();
                if (!"ht".equals(key) && !"qt".equals(key) && !"AppUID".equals(key) && !"z".equals(key) && !"_gmsv".equals(key)) {
                    m12240a(sb, key, entry.getValue());
                }
            }
            m12240a(sb, "ht", String.valueOf(c1877rf.m12213d()));
            m12240a(sb, "qt", String.valueOf(m12037i().mo7252a() - c1877rf.m12213d()));
            if (z) {
                long jM12216g = c1877rf.m12216g();
                m12240a(sb, "z", jM12216g != 0 ? String.valueOf(jM12216g) : String.valueOf(c1877rf.m12212c()));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            m12034e("Failed to encode name or value", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Long> m12248a(List<C1877rf> list) {
        boolean z;
        C0903r.m6076d();
        m12052y();
        C1221aj.m7065a(list);
        if (!m12040l().m12181k().isEmpty() && this.f11474b.m12280a(((long) C1872ra.f11438v.m12204a().intValue()) * 1000)) {
            z = EnumC1852qh.m12149a(C1872ra.f11432p.m12204a()) != EnumC1852qh.NONE;
            boolean z2 = EnumC1858qn.m12159a(C1872ra.f11433q.m12204a()) == EnumC1858qn.GZIP;
            if (z) {
                return m12244b(list);
            }
            C1221aj.m7074b(list.isEmpty() ? false : true);
            m12021a("Uploading batched hits. compression, count", Boolean.valueOf(z2), Integer.valueOf(list.size()));
            C1885rn c1885rn = new C1885rn(this);
            ArrayList arrayList = new ArrayList();
            for (C1877rf c1877rf : list) {
                if (!c1885rn.m12251a(c1877rf)) {
                    break;
                }
                arrayList.add(Long.valueOf(c1877rf.m12212c()));
            }
            if (c1885rn.m12250a() == 0) {
                return arrayList;
            }
            URL urlM12246d = m12246d();
            if (urlM12246d == null) {
                m12035f("Failed to build batching endpoint url");
            } else {
                int iM12242b = z2 ? m12242b(urlM12246d, c1885rn.m12252b()) : m12237a(urlM12246d, c1885rn.m12252b());
                if (200 == iM12242b) {
                    m12020a("Batched upload completed. Hits batched", Integer.valueOf(c1885rn.m12250a()));
                    return arrayList;
                }
                m12020a("Network error uploading hits. status code", Integer.valueOf(iM12242b));
                if (m12040l().m12181k().contains(Integer.valueOf(iM12242b))) {
                    m12033e("Server instructed the client to stop batching");
                    this.f11474b.m12279a();
                }
            }
            return Collections.emptyList();
        }
        z = false;
        if (z) {
        }
    }

    @Override // com.google.android.gms.internal.AbstractC1832po
    /* JADX INFO: renamed from: a */
    protected final void mo6013a() {
        m12020a("Network initialized. User agent", this.f11473a);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12249b() {
        NetworkInfo activeNetworkInfo;
        C0903r.m6076d();
        m12052y();
        try {
            activeNetworkInfo = ((ConnectivityManager) m12038j().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException e) {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        m12023b("No network connectivity");
        return false;
    }
}
