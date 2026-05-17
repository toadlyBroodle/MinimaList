package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class aqs {

    /* JADX INFO: renamed from: a */
    private final List<aqy> f7096a;

    /* JADX INFO: renamed from: b */
    private final Map<String, aqu> f7097b;

    /* JADX INFO: renamed from: c */
    private String f7098c;

    /* JADX INFO: renamed from: d */
    private int f7099d = 0;

    public aqs(List<aqy> list, Map<String, aqu> map, String str, int i) {
        this.f7096a = Collections.unmodifiableList(list);
        this.f7097b = Collections.unmodifiableMap(map);
        this.f7098c = str;
    }

    /* JADX INFO: renamed from: a */
    public final aqu m8165a(String str) {
        return this.f7097b.get(str);
    }

    /* JADX INFO: renamed from: a */
    public final List<aqy> m8166a() {
        return this.f7096a;
    }

    /* JADX INFO: renamed from: b */
    public final String m8167b() {
        return this.f7098c;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f7096a);
        String strValueOf2 = String.valueOf(this.f7097b);
        return new StringBuilder(String.valueOf(strValueOf).length() + 18 + String.valueOf(strValueOf2).length()).append("Rules: ").append(strValueOf).append("\n  Macros: ").append(strValueOf2).toString();
    }
}
