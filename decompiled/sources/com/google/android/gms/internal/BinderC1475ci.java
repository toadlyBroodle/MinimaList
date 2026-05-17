package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.C0733bq;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.internal.ci */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class BinderC1475ci extends AbstractBinderC1483cq {

    /* JADX INFO: renamed from: a */
    private final Context f10086a;

    /* JADX INFO: renamed from: b */
    private final Object f10087b;

    /* JADX INFO: renamed from: c */
    private final C1670jo f10088c;

    /* JADX INFO: renamed from: d */
    private final BinderC1476cj f10089d;

    public BinderC1475ci(Context context, C0733bq c0733bq, cii ciiVar, C1670jo c1670jo) {
        this(context, c1670jo, new BinderC1476cj(context, c0733bq, bxb.m10380a(), ciiVar, c1670jo));
    }

    private BinderC1475ci(Context context, C1670jo c1670jo, BinderC1476cj binderC1476cj) {
        this.f10087b = new Object();
        this.f10086a = context;
        this.f10088c = c1670jo;
        this.f10089d = binderC1476cj;
    }

    @Override // com.google.android.gms.internal.InterfaceC1482cp
    /* JADX INFO: renamed from: a */
    public final void mo10905a() {
        synchronized (this.f10087b) {
            this.f10089d.m11008F();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1482cp
    /* JADX INFO: renamed from: a */
    public final void mo10906a(InterfaceC0652a interfaceC0652a) {
        synchronized (this.f10087b) {
            this.f10089d.mo5484n();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1482cp
    /* JADX INFO: renamed from: a */
    public final void mo10907a(InterfaceC1487cu interfaceC1487cu) {
        synchronized (this.f10087b) {
            this.f10089d.mo5461a(interfaceC1487cu);
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1482cp
    /* JADX INFO: renamed from: a */
    public final void mo10908a(C1494da c1494da) {
        synchronized (this.f10087b) {
            this.f10089d.m11016a(c1494da);
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1482cp
    /* JADX INFO: renamed from: a */
    public final void mo10909a(String str) {
        synchronized (this.f10087b) {
            this.f10089d.mo5464a(str);
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1482cp
    /* JADX INFO: renamed from: a */
    public final void mo10910a(boolean z) {
        synchronized (this.f10087b) {
            this.f10089d.mo5474c(z);
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1482cp
    /* JADX INFO: renamed from: b */
    public final void mo10911b(InterfaceC0652a interfaceC0652a) {
        Context context;
        synchronized (this.f10087b) {
            if (interfaceC0652a == null) {
                context = null;
            } else {
                try {
                    context = (Context) BinderC0654c.m5330a(interfaceC0652a);
                } catch (Exception e) {
                    C1560fm.m11613c("Unable to extract updated context.", e);
                }
            }
            if (context != null) {
                this.f10089d.m11015a(context);
                this.f10089d.mo5485o();
            } else {
                this.f10089d.mo5485o();
            }
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1482cp
    /* JADX INFO: renamed from: b */
    public final boolean mo10912b() {
        boolean zM11009G;
        synchronized (this.f10087b) {
            zM11009G = this.f10089d.m11009G();
        }
        return zM11009G;
    }

    @Override // com.google.android.gms.internal.InterfaceC1482cp
    /* JADX INFO: renamed from: c */
    public final void mo10913c() {
        mo10906a((InterfaceC0652a) null);
    }

    @Override // com.google.android.gms.internal.InterfaceC1482cp
    /* JADX INFO: renamed from: c */
    public final void mo10914c(InterfaceC0652a interfaceC0652a) {
        synchronized (this.f10087b) {
            this.f10089d.mo5479i();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1482cp
    /* JADX INFO: renamed from: d */
    public final void mo10915d() {
        mo10911b(null);
    }

    @Override // com.google.android.gms.internal.InterfaceC1482cp
    /* JADX INFO: renamed from: e */
    public final void mo10916e() {
        mo10914c(null);
    }

    @Override // com.google.android.gms.internal.InterfaceC1482cp
    /* JADX INFO: renamed from: f */
    public final String mo10917f() {
        String strMo5549a;
        synchronized (this.f10087b) {
            strMo5549a = this.f10089d.mo5549a();
        }
        return strMo5549a;
    }
}
