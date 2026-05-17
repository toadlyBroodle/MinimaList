package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.BinderC0692ac;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cln extends AbstractC1556fi {

    /* JADX INFO: renamed from: a */
    private final clg f10286a;

    /* JADX INFO: renamed from: b */
    private final C2087z f10287b;

    /* JADX INFO: renamed from: c */
    private final C1542ev f10288c;

    /* JADX INFO: renamed from: d */
    private final clr f10289d;

    /* JADX INFO: renamed from: e */
    private final Object f10290e;

    /* JADX INFO: renamed from: f */
    private Future<C1541eu> f10291f;

    public cln(Context context, BinderC0692ac binderC0692ac, C1542ev c1542ev, afk afkVar, clg clgVar, cba cbaVar) {
        this(c1542ev, clgVar, new clr(context, binderC0692ac, new C1633ie(context), afkVar, c1542ev, cbaVar));
    }

    private cln(C1542ev c1542ev, clg clgVar, clr clrVar) {
        this.f10290e = new Object();
        this.f10288c = c1542ev;
        this.f10287b = c1542ev.f10561b;
        this.f10286a = clgVar;
        this.f10289d = clrVar;
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        C1541eu c1541eu;
        int i = -2;
        try {
            synchronized (this.f10290e) {
                this.f10291f = C1590gp.m11371a(C1590gp.f10701a, this.f10289d);
            }
            c1541eu = this.f10291f.get(60000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            i = 0;
            c1541eu = null;
        } catch (CancellationException e2) {
            i = 0;
            c1541eu = null;
        } catch (ExecutionException e3) {
            i = 0;
            c1541eu = null;
        } catch (TimeoutException e4) {
            C1560fm.m11615e("Timed out waiting for native ad.");
            i = 2;
            this.f10291f.cancel(true);
            c1541eu = null;
        }
        if (c1541eu == null) {
            c1541eu = new C1541eu(this.f10288c.f10560a.f11753c, null, null, i, null, null, this.f10287b.f12619k, this.f10287b.f12618j, this.f10288c.f10560a.f11759i, false, null, null, null, null, null, this.f10287b.f12616h, this.f10288c.f10563d, this.f10287b.f12614f, this.f10288c.f10565f, this.f10287b.f12621m, this.f10287b.f12622n, this.f10288c.f10567h, null, null, null, null, this.f10288c.f10561b.f12592D, this.f10288c.f10561b.f12593E, null, null, this.f10287b.f12600L, this.f10288c.f10568i, this.f10288c.f10561b.f12603O, false);
        }
        C1596gv.f10711a.post(new clo(this, c1541eu));
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: b */
    public final void mo5770b() {
        synchronized (this.f10290e) {
            if (this.f10291f != null) {
                this.f10291f.cancel(true);
            }
        }
    }
}
