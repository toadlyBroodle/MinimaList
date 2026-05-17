package com.google.android.gms.internal;

import android.util.Base64;
import java.net.URI;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class bmm {

    /* JADX INFO: renamed from: a */
    private URI f8428a;

    /* JADX INFO: renamed from: b */
    private String f8429b;

    /* JADX INFO: renamed from: c */
    private String f8430c;

    /* JADX INFO: renamed from: d */
    private Map<String, String> f8431d;

    public bmm(URI uri, String str, Map<String, String> map) {
        this.f8428a = null;
        this.f8429b = null;
        this.f8430c = null;
        this.f8431d = null;
        this.f8428a = uri;
        this.f8429b = null;
        this.f8431d = map;
        this.f8430c = m9657b();
    }

    /* JADX INFO: renamed from: a */
    private static String m9656a(LinkedHashMap<String, String> linkedHashMap) {
        String str = new String();
        Iterator<String> it = linkedHashMap.keySet().iterator();
        while (true) {
            String str2 = str;
            if (!it.hasNext()) {
                return str2;
            }
            String next = it.next();
            String strValueOf = String.valueOf(str2);
            String str3 = linkedHashMap.get(next);
            str = new StringBuilder(String.valueOf(strValueOf).length() + 4 + String.valueOf(next).length() + String.valueOf(str3).length()).append(strValueOf).append(next).append(": ").append(str3).append("\r\n").toString();
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m9657b() {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) ((Math.random() * 255.0d) + 0.0d);
        }
        return Base64.encodeToString(bArr, 2);
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m9658a() {
        String strConcat;
        String path = this.f8428a.getPath();
        String query = this.f8428a.getQuery();
        String strValueOf = String.valueOf(path);
        if (query == null) {
            strConcat = "";
        } else {
            String strValueOf2 = String.valueOf(query);
            strConcat = strValueOf2.length() != 0 ? "?".concat(strValueOf2) : new String("?");
        }
        String strValueOf3 = String.valueOf(strConcat);
        String strConcat2 = strValueOf3.length() != 0 ? strValueOf.concat(strValueOf3) : new String(strValueOf);
        String host = this.f8428a.getHost();
        if (this.f8428a.getPort() != -1) {
            String strValueOf4 = String.valueOf(host);
            host = new StringBuilder(String.valueOf(strValueOf4).length() + 12).append(strValueOf4).append(":").append(this.f8428a.getPort()).toString();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Host", host);
        linkedHashMap.put("Upgrade", "websocket");
        linkedHashMap.put("Connection", "Upgrade");
        linkedHashMap.put("Sec-WebSocket-Version", "13");
        linkedHashMap.put("Sec-WebSocket-Key", this.f8430c);
        if (this.f8429b != null) {
            linkedHashMap.put("Sec-WebSocket-Protocol", this.f8429b);
        }
        if (this.f8431d != null) {
            for (String str : this.f8431d.keySet()) {
                if (!linkedHashMap.containsKey(str)) {
                    linkedHashMap.put(str, this.f8431d.get(str));
                }
            }
        }
        String strValueOf5 = String.valueOf(new StringBuilder(String.valueOf(strConcat2).length() + 15).append("GET ").append(strConcat2).append(" HTTP/1.1\r\n").toString());
        String strValueOf6 = String.valueOf(m9656a(linkedHashMap));
        String strConcat3 = String.valueOf(strValueOf6.length() != 0 ? strValueOf5.concat(strValueOf6) : new String(strValueOf5)).concat("\r\n");
        byte[] bArr = new byte[strConcat3.getBytes().length];
        System.arraycopy(strConcat3.getBytes(), 0, bArr, 0, strConcat3.getBytes().length);
        return bArr;
    }
}
