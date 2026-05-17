package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.common.internal.C1221aj;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@cnb
public abstract class cky implements InterfaceC1616ho<Void>, InterfaceC1764na {

    /* JADX INFO: renamed from: a */
    protected final Context f10248a;

    /* JADX INFO: renamed from: b */
    protected final InterfaceC1758mv f10249b;

    /* JADX INFO: renamed from: c */
    protected C2087z f10250c;

    /* JADX INFO: renamed from: d */
    private clg f10251d;

    /* JADX INFO: renamed from: e */
    private C1542ev f10252e;

    /* JADX INFO: renamed from: f */
    private Runnable f10253f;

    /* JADX INFO: renamed from: g */
    private Object f10254g = new Object();

    /* JADX INFO: renamed from: h */
    private AtomicBoolean f10255h = new AtomicBoolean(true);

    protected cky(Context context, C1542ev c1542ev, InterfaceC1758mv interfaceC1758mv, clg clgVar) {
        this.f10248a = context;
        this.f10252e = c1542ev;
        this.f10250c = this.f10252e.f10561b;
        this.f10249b = interfaceC1758mv;
        this.f10251d = clgVar;
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo11073a();

    /* JADX INFO: renamed from: a */
    protected void mo11074a(int i) {
        if (i != -2) {
            this.f10250c = new C2087z(i, this.f10250c.f12618j);
        }
        this.f10249b.mo11827q();
        clg clgVar = this.f10251d;
        C1979v c1979v = this.f10252e.f10560a;
        clgVar.mo5471b(new C1541eu(c1979v.f11753c, this.f10249b, this.f10250c.f12611c, i, this.f10250c.f12613e, this.f10250c.f12617i, this.f10250c.f12619k, this.f10250c.f12618j, c1979v.f11759i, this.f10250c.f12615g, null, null, null, null, null, this.f10250c.f12616h, this.f10252e.f10563d, this.f10250c.f12614f, this.f10252e.f10565f, this.f10250c.f12621m, this.f10250c.f12622n, this.f10252e.f10567h, null, this.f10250c.f12589A, this.f10250c.f12590B, this.f10250c.f12591C, this.f10250c.f12592D, this.f10250c.f12593E, null, this.f10250c.f12596H, this.f10250c.f12600L, this.f10252e.f10568i, this.f10252e.f10561b.f12603O, this.f10252e.f10569j));
    }

    @Override // com.google.android.gms.internal.InterfaceC1764na
    /* JADX INFO: renamed from: a */
    public final void mo5739a(InterfaceC1758mv interfaceC1758mv, boolean z) {
        C1560fm.m11610b("WebView finished loading.");
        if (this.f10255h.getAndSet(false)) {
            mo11074a(z ? -2 : 0);
            C1596gv.f10711a.removeCallbacks(this.f10253f);
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1616ho
    /* JADX INFO: renamed from: c */
    public void mo11075c() {
        if (this.f10255h.getAndSet(false)) {
            this.f10249b.stopLoading();
            C0710au.m5571g();
            C1603hb.m11456a(this.f10249b);
            mo11074a(-1);
            C1596gv.f10711a.removeCallbacks(this.f10253f);
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1616ho
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Void mo11076d() {
        C1221aj.m7073b("Webview render task needs to be called on UI thread.");
        this.f10253f = new ckz(this);
        C1596gv.f10711a.postDelayed(this.f10253f, ((Long) bxm.m10409f().m10546a(can.f9520bn)).longValue());
        mo11073a();
        return null;
    }
}
