package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.BinderC0822l;
import com.google.android.gms.ads.internal.C0733bq;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cfm {

    /* JADX INFO: renamed from: a */
    private final Context f9924a;

    /* JADX INFO: renamed from: b */
    private final cii f9925b;

    /* JADX INFO: renamed from: c */
    private final C1670jo f9926c;

    /* JADX INFO: renamed from: d */
    private final C0733bq f9927d;

    cfm(Context context, cii ciiVar, C1670jo c1670jo, C0733bq c0733bq) {
        this.f9924a = context;
        this.f9925b = ciiVar;
        this.f9926c = c1670jo;
        this.f9927d = c0733bq;
    }

    /* JADX INFO: renamed from: a */
    public final Context m10791a() {
        return this.f9924a.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public final BinderC0822l m10792a(String str) {
        return new BinderC0822l(this.f9924a, new bxb(), str, this.f9925b, this.f9926c, this.f9927d);
    }

    /* JADX INFO: renamed from: b */
    public final BinderC0822l m10793b(String str) {
        return new BinderC0822l(this.f9924a.getApplicationContext(), new bxb(), str, this.f9925b, this.f9926c, this.f9927d);
    }

    /* JADX INFO: renamed from: b */
    public final cfm m10794b() {
        return new cfm(this.f9924a.getApplicationContext(), this.f9925b, this.f9926c, this.f9927d);
    }
}
