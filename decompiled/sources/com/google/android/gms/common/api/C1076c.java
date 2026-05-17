package com.google.android.gms.common.api;

import android.support.v4.p018i.C0207a;
import android.text.TextUtils;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.internal.C1150ck;
import com.google.android.gms.common.internal.C1221aj;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.common.api.c */
/* JADX INFO: loaded from: classes.dex */
public class C1076c extends Exception {

    /* JADX INFO: renamed from: a */
    private final C0207a<C1150ck<?>, C1071a> f5468a;

    public C1076c(C0207a<C1150ck<?>, C1071a> c0207a) {
        this.f5468a = c0207a;
    }

    /* JADX INFO: renamed from: a */
    public final C0207a<C1150ck<?>, C1071a> m6647a() {
        return this.f5468a;
    }

    /* JADX INFO: renamed from: a */
    public C1071a m6648a(C1078e<? extends C1074a.a> c1078e) {
        Object objM6659b = c1078e.m6659b();
        C1221aj.m7075b(this.f5468a.get(objM6659b) != null, "The given API was not part of the availability request.");
        return this.f5468a.get(objM6659b);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C1150ck<?> c1150ck : this.f5468a.keySet()) {
            C1071a c1071a = this.f5468a.get(c1150ck);
            if (c1071a.m6612b()) {
                z = false;
            }
            String strM6929a = c1150ck.m6929a();
            String strValueOf = String.valueOf(c1071a);
            arrayList.add(new StringBuilder(String.valueOf(strM6929a).length() + 2 + String.valueOf(strValueOf).length()).append(strM6929a).append(": ").append(strValueOf).toString());
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }
}
