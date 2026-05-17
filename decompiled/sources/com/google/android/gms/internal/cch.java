package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class cch {

    /* JADX INFO: renamed from: a */
    public final int f9800a;

    /* JADX INFO: renamed from: b */
    public final byte[] f9801b;

    /* JADX INFO: renamed from: c */
    public final Map<String, String> f9802c;

    /* JADX INFO: renamed from: d */
    public final List<byl> f9803d;

    /* JADX INFO: renamed from: e */
    public final boolean f9804e;

    /* JADX INFO: renamed from: f */
    private long f9805f;

    private cch(int i, byte[] bArr, Map<String, String> map, List<byl> list, boolean z, long j) {
        this.f9800a = i;
        this.f9801b = bArr;
        this.f9802c = map;
        if (list == null) {
            this.f9803d = null;
        } else {
            this.f9803d = Collections.unmodifiableList(list);
        }
        this.f9804e = z;
        this.f9805f = j;
    }

    @Deprecated
    public cch(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this(i, bArr, map, m10711a(map), z, j);
    }

    public cch(int i, byte[] bArr, boolean z, long j, List<byl> list) {
        this(i, bArr, m10712a(list), list, z, j);
    }

    @Deprecated
    public cch(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0L);
    }

    /* JADX INFO: renamed from: a */
    private static List<byl> m10711a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new byl(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private static Map<String, String> m10712a(List<byl> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (byl bylVar : list) {
            treeMap.put(bylVar.m10418a(), bylVar.m10419b());
        }
        return treeMap;
    }
}
