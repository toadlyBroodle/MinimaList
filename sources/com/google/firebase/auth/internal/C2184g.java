package com.google.firebase.auth.internal;

import android.support.v4.p018i.C0207a;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.bae;
import com.google.firebase.C2213b;
import com.google.firebase.auth.AbstractC2198l;
import com.google.firebase.auth.InterfaceC2199m;
import com.google.firebase.auth.InterfaceC2208v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.firebase.auth.internal.g */
/* JADX INFO: loaded from: classes.dex */
public class C2184g extends AbstractC2198l {

    /* JADX INFO: renamed from: a */
    private bae f12816a;

    /* JADX INFO: renamed from: b */
    private C2182e f12817b;

    /* JADX INFO: renamed from: c */
    private String f12818c;

    /* JADX INFO: renamed from: d */
    private String f12819d;

    /* JADX INFO: renamed from: e */
    private List<C2182e> f12820e;

    /* JADX INFO: renamed from: f */
    private List<String> f12821f;

    /* JADX INFO: renamed from: g */
    private Map<String, C2182e> f12822g;

    /* JADX INFO: renamed from: h */
    private String f12823h;

    /* JADX INFO: renamed from: i */
    private boolean f12824i;

    /* JADX INFO: renamed from: j */
    private InterfaceC2199m f12825j;

    /* JADX INFO: renamed from: k */
    private boolean f12826k;

    public C2184g(C2213b c2213b, List<? extends InterfaceC2208v> list) {
        C1221aj.m7065a(c2213b);
        this.f12818c = c2213b.m12936b();
        this.f12819d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f12823h = "2";
        mo12864a(list);
    }

    /* JADX INFO: renamed from: a */
    public final C2184g m12863a(String str) {
        this.f12823h = str;
        return this;
    }

    @Override // com.google.firebase.auth.AbstractC2198l
    /* JADX INFO: renamed from: a */
    public final AbstractC2198l mo12864a(List<? extends InterfaceC2208v> list) {
        C1221aj.m7065a(list);
        this.f12820e = new ArrayList(list.size());
        this.f12821f = new ArrayList(list.size());
        this.f12822g = new C0207a();
        for (int i = 0; i < list.size(); i++) {
            InterfaceC2208v interfaceC2208v = list.get(i);
            if (interfaceC2208v.mo12862j().equals("firebase")) {
                this.f12817b = (C2182e) interfaceC2208v;
            } else {
                this.f12821f.add(interfaceC2208v.mo12862j());
            }
            this.f12820e.add((C2182e) interfaceC2208v);
            this.f12822g.put(interfaceC2208v.mo12862j(), (C2182e) interfaceC2208v);
        }
        if (this.f12817b == null) {
            this.f12817b = this.f12820e.get(0);
        }
        return this;
    }

    @Override // com.google.firebase.auth.AbstractC2198l
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC2198l mo12865a(boolean z) {
        this.f12824i = z;
        return this;
    }

    @Override // com.google.firebase.auth.AbstractC2198l
    /* JADX INFO: renamed from: a */
    public String mo12866a() {
        return this.f12817b.m12857a();
    }

    @Override // com.google.firebase.auth.AbstractC2198l
    /* JADX INFO: renamed from: a */
    public final void mo12867a(bae baeVar) {
        this.f12816a = (bae) C1221aj.m7065a(baeVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m12868a(InterfaceC2199m interfaceC2199m) {
        this.f12825j = interfaceC2199m;
    }

    /* JADX INFO: renamed from: b */
    public final void m12869b(boolean z) {
        this.f12826k = z;
    }

    @Override // com.google.firebase.auth.AbstractC2198l
    /* JADX INFO: renamed from: b */
    public boolean mo12870b() {
        return this.f12824i;
    }

    @Override // com.google.firebase.auth.AbstractC2198l
    /* JADX INFO: renamed from: c */
    public List<? extends InterfaceC2208v> mo12871c() {
        return this.f12820e;
    }

    @Override // com.google.firebase.auth.AbstractC2198l
    /* JADX INFO: renamed from: d */
    public final C2213b mo12872d() {
        return C2213b.m12919a(this.f12818c);
    }

    @Override // com.google.firebase.auth.AbstractC2198l
    /* JADX INFO: renamed from: e */
    public String mo12873e() {
        return this.f12817b.m12858b();
    }

    @Override // com.google.firebase.auth.AbstractC2198l
    /* JADX INFO: renamed from: f */
    public String mo12874f() {
        return this.f12817b.m12859c();
    }

    @Override // com.google.firebase.auth.AbstractC2198l
    /* JADX INFO: renamed from: g */
    public final bae mo12875g() {
        return this.f12816a;
    }

    @Override // com.google.firebase.auth.AbstractC2198l
    /* JADX INFO: renamed from: h */
    public final String mo12876h() {
        return this.f12816a.m8772f();
    }

    @Override // com.google.firebase.auth.AbstractC2198l
    /* JADX INFO: renamed from: i */
    public final String mo12877i() {
        return mo12875g().m8769c();
    }

    @Override // com.google.firebase.auth.InterfaceC2208v
    /* JADX INFO: renamed from: j */
    public String mo12862j() {
        return this.f12817b.mo12862j();
    }

    /* JADX INFO: renamed from: k */
    public final List<C2182e> m12878k() {
        return this.f12820e;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m12879l() {
        return this.f12826k;
    }
}
