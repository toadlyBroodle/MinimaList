package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.C1670jo;
import com.google.android.gms.internal.bwx;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.can;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.at */
/* JADX INFO: loaded from: classes.dex */
final class C0709at {

    /* JADX INFO: renamed from: a */
    private final String f4463a;

    /* JADX INFO: renamed from: b */
    private final Map<String, String> f4464b = new TreeMap();

    /* JADX INFO: renamed from: c */
    private String f4465c;

    /* JADX INFO: renamed from: d */
    private String f4466d;

    public C0709at(String str) {
        this.f4463a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m5556a() {
        return this.f4466d;
    }

    /* JADX INFO: renamed from: a */
    public final void m5557a(bwx bwxVar, C1670jo c1670jo) {
        this.f4465c = bwxVar.f9216j.f9376a;
        Bundle bundle = bwxVar.f9219m != null ? bwxVar.f9219m.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle == null) {
            return;
        }
        String str = (String) bxm.m10409f().m10546a(can.f9568ci);
        for (String str2 : bundle.keySet()) {
            if (str.equals(str2)) {
                this.f4466d = bundle.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.f4464b.put(str2.substring(4), bundle.getString(str2));
            }
        }
        this.f4464b.put("SDKVersion", c1670jo.f10855a);
    }

    /* JADX INFO: renamed from: b */
    public final String m5558b() {
        return this.f4465c;
    }

    /* JADX INFO: renamed from: c */
    public final String m5559c() {
        return this.f4463a;
    }

    /* JADX INFO: renamed from: d */
    public final Map<String, String> m5560d() {
        return this.f4464b;
    }
}
