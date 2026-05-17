package com.google.android.gms.ads.internal.p048js;

import android.content.Context;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.C1670jo;
import com.google.android.gms.internal.InterfaceC1627hz;
import com.google.android.gms.internal.afk;
import com.google.android.gms.internal.cnb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.js.z */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0820z {

    /* JADX INFO: renamed from: a */
    private final Object f4741a;

    /* JADX INFO: renamed from: b */
    private final Context f4742b;

    /* JADX INFO: renamed from: c */
    private final String f4743c;

    /* JADX INFO: renamed from: d */
    private final C1670jo f4744d;

    /* JADX INFO: renamed from: e */
    private InterfaceC1627hz<InterfaceC0809o> f4745e;

    /* JADX INFO: renamed from: f */
    private InterfaceC1627hz<InterfaceC0809o> f4746f;

    /* JADX INFO: renamed from: g */
    private C0800f f4747g;

    /* JADX INFO: renamed from: h */
    private int f4748h;

    public C0820z(Context context, C1670jo c1670jo, String str) {
        this.f4741a = new Object();
        this.f4748h = 1;
        this.f4743c = str;
        this.f4742b = context.getApplicationContext();
        this.f4744d = c1670jo;
        this.f4745e = new C0795al();
        this.f4746f = new C0795al();
    }

    public C0820z(Context context, C1670jo c1670jo, String str, InterfaceC1627hz<InterfaceC0809o> interfaceC1627hz, InterfaceC1627hz<InterfaceC0809o> interfaceC1627hz2) {
        this(context, c1670jo, str);
        this.f4745e = interfaceC1627hz;
        this.f4746f = interfaceC1627hz2;
    }

    /* JADX INFO: renamed from: a */
    protected final C0800f m5750a(afk afkVar) {
        C0800f c0800f = new C0800f(this.f4746f);
        C0710au.m5569e();
        C1596gv.m11394a(new RunnableC0784aa(this, afkVar, c0800f));
        c0800f.mo11659a(new C0792ai(this, c0800f), new C0793aj(this, c0800f));
        return c0800f;
    }

    /* JADX INFO: renamed from: b */
    public final C0796b m5751b(afk afkVar) {
        C0796b c0796bM5722a;
        synchronized (this.f4741a) {
            if (this.f4747g == null || this.f4747g.m11662e() == -1) {
                this.f4748h = 2;
                this.f4747g = m5750a((afk) null);
                c0796bM5722a = this.f4747g.m5722a();
            } else if (this.f4748h == 0) {
                c0796bM5722a = this.f4747g.m5722a();
            } else if (this.f4748h == 1) {
                this.f4748h = 2;
                m5750a((afk) null);
                c0796bM5722a = this.f4747g.m5722a();
            } else {
                c0796bM5722a = this.f4748h == 2 ? this.f4747g.m5722a() : this.f4747g.m5722a();
            }
        }
        return c0796bM5722a;
    }
}
