package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.JsonWriter;
import com.google.android.gms.common.util.C1298b;
import com.google.android.gms.common.util.C1303g;
import com.google.android.gms.common.util.InterfaceC1300d;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: com.google.android.gms.internal.jf */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1661jf {

    /* JADX INFO: renamed from: a */
    private static Object f10840a = new Object();

    /* JADX INFO: renamed from: b */
    private static boolean f10841b = false;

    /* JADX INFO: renamed from: c */
    private static boolean f10842c = false;

    /* JADX INFO: renamed from: d */
    private static InterfaceC1300d f10843d = C1303g.m7263d();

    /* JADX INFO: renamed from: e */
    private static final Set<String> f10844e = new HashSet(Arrays.asList(new String[0]));

    /* JADX INFO: renamed from: f */
    private final List<String> f10845f;

    public C1661jf() {
        this(null);
    }

    public C1661jf(String str) {
        List<String> listAsList;
        if (m11600c()) {
            String string = UUID.randomUUID().toString();
            if (str == null) {
                String[] strArr = new String[1];
                String strValueOf = String.valueOf(string);
                strArr[0] = strValueOf.length() != 0 ? "network_request_".concat(strValueOf) : new String("network_request_");
                listAsList = Arrays.asList(strArr);
            } else {
                String[] strArr2 = new String[2];
                String strValueOf2 = String.valueOf(str);
                strArr2[0] = strValueOf2.length() != 0 ? "ad_request_".concat(strValueOf2) : new String("ad_request_");
                String strValueOf3 = String.valueOf(string);
                strArr2[1] = strValueOf3.length() != 0 ? "network_request_".concat(strValueOf3) : new String("network_request_");
                listAsList = Arrays.asList(strArr2);
            }
        } else {
            listAsList = new ArrayList<>();
        }
        this.f10845f = listAsList;
    }

    /* JADX INFO: renamed from: a */
    public static void m11586a() {
        synchronized (f10840a) {
            f10841b = false;
            f10842c = false;
            C1668jm.m11615e("Ad debug logging enablement is out of date.");
        }
    }

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ void m11587a(int i, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        m11588a(jsonWriter, (Map<String, ?>) map);
        jsonWriter.endObject();
    }

    /* JADX INFO: renamed from: a */
    private static void m11588a(JsonWriter jsonWriter, Map<String, ?> map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            if (!f10844e.contains(key)) {
                if (!(next.getValue() instanceof List)) {
                    if (!(next.getValue() instanceof String)) {
                        C1668jm.m11612c("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(key);
                    jsonWriter.name("value").value((String) next.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str : (List) next.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(key);
                        jsonWriter.name("value").value(str);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ void m11589a(String str, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    /* JADX INFO: renamed from: a */
    private final void m11590a(String str, InterfaceC1667jl interfaceC1667jl) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f10843d.mo7252a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator<String> it = this.f10845f.iterator();
            while (it.hasNext()) {
                jsonWriter.value(it.next());
            }
            jsonWriter.endArray();
            interfaceC1667jl.mo11607a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            C1668jm.m11611b("unable to log", e);
        }
        m11599c(stringWriter.toString());
    }

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ void m11591a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        m11588a(jsonWriter, (Map<String, ?>) map);
        if (bArr != null) {
            jsonWriter.name("body").value(C1298b.m7249a(bArr));
        }
        jsonWriter.endObject();
    }

    /* JADX INFO: renamed from: a */
    public static void m11592a(boolean z) {
        synchronized (f10840a) {
            f10841b = true;
            f10842c = z;
        }
    }

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ void m11593a(byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String strM7249a = C1298b.m7249a(bArr);
        if (length < 10000) {
            jsonWriter.name("body").value(strM7249a);
        } else {
            String strM11563a = C1657jb.m11563a(strM7249a);
            if (strM11563a != null) {
                jsonWriter.name("bodydigest").value(strM11563a);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11594a(Context context) {
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        return ((Boolean) bxm.m10409f().m10546a(can.f9447aT)).booleanValue() && Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
    }

    /* JADX INFO: renamed from: b */
    private final void m11595b(final String str) {
        m11590a("onNetworkRequestError", new InterfaceC1667jl(str) { // from class: com.google.android.gms.internal.jj

            /* JADX INFO: renamed from: a */
            private final String f10853a;

            {
                this.f10853a = str;
            }

            @Override // com.google.android.gms.internal.InterfaceC1667jl
            /* JADX INFO: renamed from: a */
            public final void mo11607a(JsonWriter jsonWriter) throws IOException {
                C1661jf.m11589a(this.f10853a, jsonWriter);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private final void m11596b(final String str, final String str2, final Map<String, ?> map, final byte[] bArr) {
        m11590a("onNetworkRequest", new InterfaceC1667jl(str, str2, map, bArr) { // from class: com.google.android.gms.internal.jg

            /* JADX INFO: renamed from: a */
            private final String f10846a;

            /* JADX INFO: renamed from: b */
            private final String f10847b;

            /* JADX INFO: renamed from: c */
            private final Map f10848c;

            /* JADX INFO: renamed from: d */
            private final byte[] f10849d;

            {
                this.f10846a = str;
                this.f10847b = str2;
                this.f10848c = map;
                this.f10849d = bArr;
            }

            @Override // com.google.android.gms.internal.InterfaceC1667jl
            /* JADX INFO: renamed from: a */
            public final void mo11607a(JsonWriter jsonWriter) throws IOException {
                C1661jf.m11591a(this.f10846a, this.f10847b, this.f10848c, this.f10849d, jsonWriter);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private final void m11597b(final Map<String, ?> map, final int i) {
        m11590a("onNetworkResponse", new InterfaceC1667jl(i, map) { // from class: com.google.android.gms.internal.jh

            /* JADX INFO: renamed from: a */
            private final int f10850a;

            /* JADX INFO: renamed from: b */
            private final Map f10851b;

            {
                this.f10850a = i;
                this.f10851b = map;
            }

            @Override // com.google.android.gms.internal.InterfaceC1667jl
            /* JADX INFO: renamed from: a */
            public final void mo11607a(JsonWriter jsonWriter) throws IOException {
                C1661jf.m11587a(this.f10850a, this.f10851b, jsonWriter);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11598b() {
        boolean z;
        synchronized (f10840a) {
            z = f10841b;
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    private static synchronized void m11599c(String str) {
        C1668jm.m11614d("GMA Debug BEGIN");
        for (int i = 0; i < str.length(); i += 4000) {
            String strValueOf = String.valueOf(str.substring(i, Math.min(i + 4000, str.length())));
            C1668jm.m11614d(strValueOf.length() != 0 ? "GMA Debug CONTENT ".concat(strValueOf) : new String("GMA Debug CONTENT "));
        }
        C1668jm.m11614d("GMA Debug FINISH");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m11600c() {
        boolean z;
        synchronized (f10840a) {
            z = f10841b && f10842c;
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public final void m11601a(String str) {
        if (m11600c() && str != null) {
            m11606a(str.getBytes());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11602a(String str, String str2, Map<String, ?> map, byte[] bArr) {
        if (m11600c()) {
            m11596b(str, str2, map, bArr);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11603a(HttpURLConnection httpURLConnection, int i) {
        String responseMessage = null;
        if (m11600c()) {
            m11597b(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    String strValueOf = String.valueOf(e.getMessage());
                    C1668jm.m11615e(strValueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(strValueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                }
                m11595b(responseMessage);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11604a(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (m11600c()) {
            m11596b(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11605a(Map<String, ?> map, int i) {
        if (m11600c()) {
            m11597b(map, i);
            if (i < 200 || i >= 300) {
                m11595b(null);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11606a(final byte[] bArr) {
        m11590a("onNetworkResponseBody", new InterfaceC1667jl(bArr) { // from class: com.google.android.gms.internal.ji

            /* JADX INFO: renamed from: a */
            private final byte[] f10852a;

            {
                this.f10852a = bArr;
            }

            @Override // com.google.android.gms.internal.InterfaceC1667jl
            /* JADX INFO: renamed from: a */
            public final void mo11607a(JsonWriter jsonWriter) throws IOException {
                C1661jf.m11593a(this.f10852a, jsonWriter);
            }
        });
    }
}
