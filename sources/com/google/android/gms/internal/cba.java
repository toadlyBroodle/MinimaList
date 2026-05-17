package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0710au;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cba {

    /* JADX INFO: renamed from: a */
    private boolean f9699a;

    /* JADX INFO: renamed from: b */
    private final List<cay> f9700b = new LinkedList();

    /* JADX INFO: renamed from: c */
    private final Map<String, String> f9701c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    private final Object f9702d = new Object();

    /* JADX INFO: renamed from: e */
    private String f9703e;

    /* JADX INFO: renamed from: f */
    private cba f9704f;

    public cba(boolean z, String str, String str2) {
        this.f9699a = z;
        this.f9701c.put("action", str);
        this.f9701c.put("ad_format", str2);
    }

    /* JADX INFO: renamed from: a */
    public final cay m10575a() {
        return m10576a(C0710au.m5575k().mo7253b());
    }

    /* JADX INFO: renamed from: a */
    public final cay m10576a(long j) {
        if (this.f9699a) {
            return new cay(j, null, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m10577a(cba cbaVar) {
        synchronized (this.f9702d) {
            this.f9704f = cbaVar;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10578a(String str) {
        if (this.f9699a) {
            synchronized (this.f9702d) {
                this.f9703e = str;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10579a(String str, String str2) {
        caq caqVarM11303e;
        if (!this.f9699a || TextUtils.isEmpty(str2) || (caqVarM11303e = C0710au.m5573i().m11303e()) == null) {
            return;
        }
        synchronized (this.f9702d) {
            cau cauVarM10559a = caqVarM11303e.m10559a(str);
            Map<String, String> map = this.f9701c;
            map.put(str, cauVarM10559a.mo10566a(map.get(str), str2));
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10580a(cay cayVar, long j, String... strArr) {
        synchronized (this.f9702d) {
            for (String str : strArr) {
                this.f9700b.add(new cay(j, str, cayVar));
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10581a(cay cayVar, String... strArr) {
        if (!this.f9699a || cayVar == null) {
            return false;
        }
        return m10580a(cayVar, C0710au.m5575k().mo7253b(), strArr);
    }

    /* JADX INFO: renamed from: b */
    public final String m10582b() {
        String string;
        StringBuilder sb = new StringBuilder();
        synchronized (this.f9702d) {
            for (cay cayVar : this.f9700b) {
                long jM10568a = cayVar.m10568a();
                String strM10569b = cayVar.m10569b();
                cay cayVarM10570c = cayVar.m10570c();
                if (cayVarM10570c != null && jM10568a > 0) {
                    sb.append(strM10569b).append('.').append(jM10568a - cayVarM10570c.m10568a()).append(',');
                }
            }
            this.f9700b.clear();
            if (!TextUtils.isEmpty(this.f9703e)) {
                sb.append(this.f9703e);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            string = sb.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: c */
    final Map<String, String> m10583c() {
        Map<String, String> mapM10560a;
        synchronized (this.f9702d) {
            caq caqVarM11303e = C0710au.m5573i().m11303e();
            mapM10560a = (caqVarM11303e == null || this.f9704f == null) ? this.f9701c : caqVarM11303e.m10560a(this.f9701c, this.f9704f.m10583c());
        }
        return mapM10560a;
    }

    /* JADX INFO: renamed from: d */
    public final cay m10584d() {
        synchronized (this.f9702d) {
        }
        return null;
    }
}
