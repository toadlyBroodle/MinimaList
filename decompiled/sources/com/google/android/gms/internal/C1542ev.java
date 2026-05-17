package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C0710au;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ev */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1542ev {

    /* JADX INFO: renamed from: a */
    public final C1979v f10560a;

    /* JADX INFO: renamed from: b */
    public final C2087z f10561b;

    /* JADX INFO: renamed from: c */
    public final cht f10562c;

    /* JADX INFO: renamed from: d */
    public final bxb f10563d;

    /* JADX INFO: renamed from: e */
    public final int f10564e;

    /* JADX INFO: renamed from: f */
    public final long f10565f;

    /* JADX INFO: renamed from: g */
    public final long f10566g;

    /* JADX INFO: renamed from: h */
    public final JSONObject f10567h;

    /* JADX INFO: renamed from: i */
    public final bwf f10568i;

    /* JADX INFO: renamed from: j */
    public final boolean f10569j;

    public C1542ev(C1979v c1979v, C2087z c2087z, cht chtVar, bxb bxbVar, int i, long j, long j2, JSONObject jSONObject, bwf bwfVar, Boolean bool) {
        this.f10560a = c1979v;
        this.f10561b = c2087z;
        this.f10562c = chtVar;
        this.f10563d = bxbVar;
        this.f10564e = i;
        this.f10565f = j;
        this.f10566g = j2;
        this.f10567h = jSONObject;
        this.f10568i = bwfVar;
        if (bool != null) {
            this.f10569j = bool.booleanValue();
            return;
        }
        C0710au.m5569e();
        if (C1596gv.m11401a(c1979v.f11753c)) {
            this.f10569j = true;
        } else {
            this.f10569j = false;
        }
    }

    public C1542ev(C1979v c1979v, C2087z c2087z, cht chtVar, bxb bxbVar, int i, long j, long j2, JSONObject jSONObject, bwk bwkVar) {
        this.f10560a = c1979v;
        this.f10561b = c2087z;
        this.f10562c = null;
        this.f10563d = null;
        this.f10564e = i;
        this.f10565f = j;
        this.f10566g = j2;
        this.f10567h = null;
        this.f10568i = new bwf(bwkVar, ((Boolean) bxm.m10409f().m10546a(can.f9543cJ)).booleanValue());
        this.f10569j = false;
    }
}
