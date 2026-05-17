package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0710au;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cif implements chr {

    /* JADX INFO: renamed from: a */
    private final C1979v f10109a;

    /* JADX INFO: renamed from: b */
    private final cii f10110b;

    /* JADX INFO: renamed from: c */
    private final Context f10111c;

    /* JADX INFO: renamed from: e */
    private final cht f10113e;

    /* JADX INFO: renamed from: f */
    private final boolean f10114f;

    /* JADX INFO: renamed from: g */
    private final long f10115g;

    /* JADX INFO: renamed from: h */
    private final long f10116h;

    /* JADX INFO: renamed from: i */
    private final cba f10117i;

    /* JADX INFO: renamed from: j */
    private final boolean f10118j;

    /* JADX INFO: renamed from: k */
    private final String f10119k;

    /* JADX INFO: renamed from: m */
    private chw f10121m;

    /* JADX INFO: renamed from: o */
    private final boolean f10123o;

    /* JADX INFO: renamed from: d */
    private final Object f10112d = new Object();

    /* JADX INFO: renamed from: l */
    private boolean f10120l = false;

    /* JADX INFO: renamed from: n */
    private List<chz> f10122n = new ArrayList();

    public cif(Context context, C1979v c1979v, cii ciiVar, cht chtVar, boolean z, boolean z2, String str, long j, long j2, cba cbaVar, boolean z3) {
        this.f10111c = context;
        this.f10109a = c1979v;
        this.f10110b = ciiVar;
        this.f10113e = chtVar;
        this.f10114f = z;
        this.f10118j = z2;
        this.f10119k = str;
        this.f10115g = j;
        this.f10116h = j2;
        this.f10117i = cbaVar;
        this.f10123o = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x019b  */
    @Override // com.google.android.gms.internal.chr
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final chz mo10862a(List<chs> list) {
        bxb bxbVar;
        C1560fm.m11610b("Starting mediation.");
        ArrayList arrayList = new ArrayList();
        cay cayVarM10575a = this.f10117i.m10575a();
        bxb bxbVar2 = this.f10109a.f11754d;
        int[] iArr = new int[2];
        if (bxbVar2.f9253g != null) {
            C0710au.m5586v();
            if (cib.m10922a(this.f10119k, iArr)) {
                int i = iArr[0];
                int i2 = iArr[1];
                bxb[] bxbVarArr = bxbVar2.f9253g;
                int length = bxbVarArr.length;
                for (int i3 = 0; i3 < length; i3++) {
                    bxbVar = bxbVarArr[i3];
                    if (i == bxbVar.f9251e && i2 == bxbVar.f9248b) {
                        break;
                    }
                }
                bxbVar = bxbVar2;
            } else {
                bxbVar = bxbVar2;
            }
        }
        for (chs chsVar : list) {
            String strValueOf = String.valueOf(chsVar.f10016b);
            C1560fm.m11614d(strValueOf.length() != 0 ? "Trying mediation network: ".concat(strValueOf) : new String("Trying mediation network: "));
            for (String str : chsVar.f10017c) {
                cay cayVarM10575a2 = this.f10117i.m10575a();
                synchronized (this.f10112d) {
                    if (this.f10120l) {
                        return new chz(-1);
                    }
                    this.f10121m = new chw(this.f10111c, str, this.f10110b, this.f10113e, chsVar, this.f10109a.f11753c, bxbVar, this.f10109a.f11761k, this.f10114f, this.f10118j, this.f10109a.f11775y, this.f10109a.f11764n, this.f10109a.f11776z, this.f10109a.f11746X, this.f10123o);
                    chz chzVarM10900a = this.f10121m.m10900a(this.f10115g, this.f10116h);
                    this.f10122n.add(chzVarM10900a);
                    if (chzVarM10900a.f10079a == 0) {
                        C1560fm.m11610b("Adapter succeeded.");
                        this.f10117i.m10579a("mediation_network_succeed", str);
                        if (!arrayList.isEmpty()) {
                            this.f10117i.m10579a("mediation_networks_fail", TextUtils.join(",", arrayList));
                        }
                        this.f10117i.m10581a(cayVarM10575a2, "mls");
                        this.f10117i.m10581a(cayVarM10575a, "ttm");
                        return chzVarM10900a;
                    }
                    arrayList.add(str);
                    this.f10117i.m10581a(cayVarM10575a2, "mlf");
                    if (chzVarM10900a.f10081c != null) {
                        C1596gv.f10711a.post(new cig(this, chzVarM10900a));
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f10117i.m10579a("mediation_networks_fail", TextUtils.join(",", arrayList));
        }
        return new chz(1);
    }

    @Override // com.google.android.gms.internal.chr
    /* JADX INFO: renamed from: a */
    public final void mo10863a() {
        synchronized (this.f10112d) {
            this.f10120l = true;
            if (this.f10121m != null) {
                this.f10121m.m10901a();
            }
        }
    }

    @Override // com.google.android.gms.internal.chr
    /* JADX INFO: renamed from: b */
    public final List<chz> mo10864b() {
        return this.f10122n;
    }
}
