package com.google.android.gms.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1221aj;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.zk */
/* JADX INFO: loaded from: classes.dex */
public final class C2098zk {

    /* JADX INFO: renamed from: a */
    final String f12671a;

    /* JADX INFO: renamed from: b */
    final String f12672b;

    /* JADX INFO: renamed from: c */
    final long f12673c;

    /* JADX INFO: renamed from: d */
    final long f12674d;

    /* JADX INFO: renamed from: e */
    final C2100zm f12675e;

    /* JADX INFO: renamed from: f */
    private String f12676f;

    C2098zk(abd abdVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        C1221aj.m7067a(str2);
        C1221aj.m7067a(str3);
        this.f12671a = str2;
        this.f12672b = str3;
        this.f12676f = TextUtils.isEmpty(str) ? null : str;
        this.f12673c = j;
        this.f12674d = j2;
        if (this.f12674d != 0 && this.f12674d > this.f12673c) {
            abdVar.m7540f().m7401A().m7413a("Event created with reverse previous/current timestamps. appId", aac.m7397a(str2));
        }
        this.f12675e = m12760a(abdVar, bundle);
    }

    private C2098zk(abd abdVar, String str, String str2, String str3, long j, long j2, C2100zm c2100zm) {
        C1221aj.m7067a(str2);
        C1221aj.m7067a(str3);
        C1221aj.m7065a(c2100zm);
        this.f12671a = str2;
        this.f12672b = str3;
        this.f12676f = TextUtils.isEmpty(str) ? null : str;
        this.f12673c = j;
        this.f12674d = j2;
        if (this.f12674d != 0 && this.f12674d > this.f12673c) {
            abdVar.m7540f().m7401A().m7413a("Event created with reverse previous/current timestamps. appId", aac.m7397a(str2));
        }
        this.f12675e = c2100zm;
    }

    /* JADX INFO: renamed from: a */
    private static C2100zm m12760a(abd abdVar, Bundle bundle) {
        if (bundle == null || bundle.isEmpty()) {
            return new C2100zm(new Bundle());
        }
        Bundle bundle2 = new Bundle(bundle);
        Iterator<String> it = bundle2.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next == null) {
                abdVar.m7540f().m7410y().m7412a("Param name can't be null");
                it.remove();
            } else {
                Object objM7750a = abdVar.m7549o().m7750a(next, bundle2.get(next));
                if (objM7750a == null) {
                    abdVar.m7540f().m7401A().m7413a("Param value can't be null", abdVar.m7550p().m7373b(next));
                    it.remove();
                } else {
                    abdVar.m7549o().m7752a(bundle2, next, objM7750a);
                }
            }
        }
        return new C2100zm(bundle2);
    }

    /* JADX INFO: renamed from: a */
    final C2098zk m12761a(abd abdVar, long j) {
        return new C2098zk(abdVar, this.f12676f, this.f12671a, this.f12672b, this.f12673c, j, this.f12675e);
    }

    public final String toString() {
        String str = this.f12671a;
        String str2 = this.f12672b;
        String strValueOf = String.valueOf(this.f12675e);
        return new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(strValueOf).length()).append("Event{appId='").append(str).append("', name='").append(str2).append("', params=").append(strValueOf).append("}").toString();
    }
}
