package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.ads.C0857j;
import com.google.android.gms.ads.mediation.InterfaceC0876i;
import com.google.android.gms.ads.p045b.C0667d;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cjh implements InterfaceC0876i {

    /* JADX INFO: renamed from: a */
    private final Date f10158a;

    /* JADX INFO: renamed from: b */
    private final int f10159b;

    /* JADX INFO: renamed from: c */
    private final Set<String> f10160c;

    /* JADX INFO: renamed from: d */
    private final boolean f10161d;

    /* JADX INFO: renamed from: e */
    private final Location f10162e;

    /* JADX INFO: renamed from: f */
    private final int f10163f;

    /* JADX INFO: renamed from: g */
    private final ccm f10164g;

    /* JADX INFO: renamed from: i */
    private final boolean f10166i;

    /* JADX INFO: renamed from: h */
    private final List<String> f10165h = new ArrayList();

    /* JADX INFO: renamed from: j */
    private final Map<String, Boolean> f10167j = new HashMap();

    public cjh(Date date, int i, Set<String> set, Location location, boolean z, int i2, ccm ccmVar, List<String> list, boolean z2) {
        this.f10158a = date;
        this.f10159b = i;
        this.f10160c = set;
        this.f10162e = location;
        this.f10161d = z;
        this.f10163f = i2;
        this.f10164g = ccmVar;
        this.f10166i = z2;
        if (list != null) {
            for (String str : list) {
                if (str.startsWith("custom:")) {
                    String[] strArrSplit = str.split(":", 3);
                    if (strArrSplit.length == 3) {
                        if ("true".equals(strArrSplit[2])) {
                            this.f10167j.put(strArrSplit[1], true);
                        } else if ("false".equals(strArrSplit[2])) {
                            this.f10167j.put(strArrSplit[1], false);
                        }
                    }
                } else {
                    this.f10165h.add(str);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0860a
    /* JADX INFO: renamed from: a */
    public final Date mo5833a() {
        return this.f10158a;
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0860a
    /* JADX INFO: renamed from: b */
    public final int mo5834b() {
        return this.f10159b;
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0860a
    /* JADX INFO: renamed from: c */
    public final Set<String> mo5835c() {
        return this.f10160c;
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0860a
    /* JADX INFO: renamed from: d */
    public final Location mo5836d() {
        return this.f10162e;
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0860a
    /* JADX INFO: renamed from: e */
    public final int mo5837e() {
        return this.f10163f;
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0860a
    /* JADX INFO: renamed from: f */
    public final boolean mo5838f() {
        return this.f10161d;
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0860a
    /* JADX INFO: renamed from: g */
    public final boolean mo5839g() {
        return this.f10166i;
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0876i
    /* JADX INFO: renamed from: h */
    public final C0667d mo5910h() {
        if (this.f10164g == null) {
            return null;
        }
        C0667d.a aVarM5362b = new C0667d.a().m5359a(this.f10164g.f9815b).m5357a(this.f10164g.f9816c).m5362b(this.f10164g.f9817d);
        if (this.f10164g.f9814a >= 2) {
            aVarM5362b.m5361b(this.f10164g.f9818e);
        }
        if (this.f10164g.f9814a >= 3 && this.f10164g.f9819f != null) {
            aVarM5362b.m5358a(new C0857j(this.f10164g.f9819f));
        }
        return aVarM5362b.m5360a();
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0876i
    /* JADX INFO: renamed from: i */
    public final boolean mo5911i() {
        return this.f10165h != null && this.f10165h.contains("2");
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0876i
    /* JADX INFO: renamed from: j */
    public final boolean mo5912j() {
        return this.f10165h != null && this.f10165h.contains("1");
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0876i
    /* JADX INFO: renamed from: k */
    public final boolean mo5913k() {
        return this.f10165h != null && this.f10165h.contains("3");
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0876i
    /* JADX INFO: renamed from: l */
    public final Map<String, Boolean> mo5914l() {
        return this.f10167j;
    }
}
