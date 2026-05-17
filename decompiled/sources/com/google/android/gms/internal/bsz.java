package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.p048js.C0820z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bsz implements btl {

    /* JADX INFO: renamed from: a */
    private final Object f8902a = new Object();

    /* JADX INFO: renamed from: b */
    private final WeakHashMap<C1541eu, bta> f8903b = new WeakHashMap<>();

    /* JADX INFO: renamed from: c */
    private final ArrayList<bta> f8904c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    private final Context f8905d;

    /* JADX INFO: renamed from: e */
    private final C1670jo f8906e;

    /* JADX INFO: renamed from: f */
    private final C0820z f8907f;

    public bsz(Context context, C1670jo c1670jo) {
        this.f8905d = context.getApplicationContext();
        this.f8906e = c1670jo;
        this.f8907f = new C0820z(context.getApplicationContext(), c1670jo, (String) bxm.m10409f().m10546a(can.f9427a));
    }

    /* JADX INFO: renamed from: e */
    private final boolean m10198e(C1541eu c1541eu) {
        boolean z;
        synchronized (this.f8902a) {
            bta btaVar = this.f8903b.get(c1541eu);
            z = btaVar != null && btaVar.m10233c();
        }
        return z;
    }

    @Override // com.google.android.gms.internal.btl
    /* JADX INFO: renamed from: a */
    public final void mo10199a(bta btaVar) {
        synchronized (this.f8902a) {
            if (!btaVar.m10233c()) {
                this.f8904c.remove(btaVar);
                Iterator<Map.Entry<C1541eu, bta>> it = this.f8903b.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue() == btaVar) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10200a(bxb bxbVar, C1541eu c1541eu) {
        Object obj = c1541eu.f10535b;
        if (obj == null) {
            throw null;
        }
        m10201a(bxbVar, c1541eu, (View) obj);
    }

    /* JADX INFO: renamed from: a */
    public final void m10201a(bxb bxbVar, C1541eu c1541eu, View view) {
        m10203a(bxbVar, c1541eu, new btj(view, c1541eu), (InterfaceC1758mv) null);
    }

    /* JADX INFO: renamed from: a */
    public final void m10202a(bxb bxbVar, C1541eu c1541eu, View view, InterfaceC1758mv interfaceC1758mv) {
        m10203a(bxbVar, c1541eu, new btj(view, c1541eu), interfaceC1758mv);
    }

    /* JADX INFO: renamed from: a */
    public final void m10203a(bxb bxbVar, C1541eu c1541eu, bup bupVar, InterfaceC1758mv interfaceC1758mv) {
        bta btaVar;
        synchronized (this.f8902a) {
            if (m10198e(c1541eu)) {
                btaVar = this.f8903b.get(c1541eu);
            } else {
                btaVar = new bta(this.f8905d, bxbVar, c1541eu, this.f8906e, bupVar);
                btaVar.m10225a(this);
                this.f8903b.put(c1541eu, btaVar);
                this.f8904c.add(btaVar);
            }
            if (interfaceC1758mv != null) {
                btaVar.m10226a(new btm(btaVar, interfaceC1758mv));
            } else {
                btaVar.m10226a(new btq(btaVar, this.f8907f, this.f8905d));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10204a(C1541eu c1541eu) {
        synchronized (this.f8902a) {
            bta btaVar = this.f8903b.get(c1541eu);
            if (btaVar != null) {
                btaVar.m10229b();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10205b(C1541eu c1541eu) {
        synchronized (this.f8902a) {
            bta btaVar = this.f8903b.get(c1541eu);
            if (btaVar != null) {
                btaVar.m10234d();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10206c(C1541eu c1541eu) {
        synchronized (this.f8902a) {
            bta btaVar = this.f8903b.get(c1541eu);
            if (btaVar != null) {
                btaVar.m10235e();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m10207d(C1541eu c1541eu) {
        synchronized (this.f8902a) {
            bta btaVar = this.f8903b.get(c1541eu);
            if (btaVar != null) {
                btaVar.m10236f();
            }
        }
    }
}
