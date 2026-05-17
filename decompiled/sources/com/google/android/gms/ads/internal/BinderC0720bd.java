package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.C1541eu;
import com.google.android.gms.internal.C1542ev;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.C1670jo;
import com.google.android.gms.internal.C1807oq;
import com.google.android.gms.internal.InterfaceC1528eh;
import com.google.android.gms.internal.InterfaceC1758mv;
import com.google.android.gms.internal.bsz;
import com.google.android.gms.internal.bxb;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.can;
import com.google.android.gms.internal.cba;
import com.google.android.gms.internal.cbh;
import com.google.android.gms.internal.cii;
import com.google.android.gms.internal.ckg;
import com.google.android.gms.internal.clf;
import com.google.android.gms.internal.cnb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.bd */
/* JADX INFO: loaded from: classes.dex */
@cnb
public class BinderC0720bd extends AbstractBinderC0714ay implements InterfaceC0741f, ckg {

    /* JADX INFO: renamed from: j */
    private boolean f4553j;

    public BinderC0720bd(Context context, bxb bxbVar, String str, cii ciiVar, C1670jo c1670jo, C0733bq c0733bq) {
        super(context, bxbVar, str, ciiVar, c1670jo, c0733bq);
    }

    @Override // com.google.android.gms.internal.ckg
    /* JADX INFO: renamed from: G */
    public final void mo5624G() {
        mo5489s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    protected InterfaceC1758mv mo5625a(C1542ev c1542ev, C0734br c0734br, InterfaceC1528eh interfaceC1528eh) {
        View nextView = this.f4405e.f4520f.getNextView();
        if (nextView instanceof InterfaceC1758mv) {
            ((InterfaceC1758mv) nextView).destroy();
        }
        if (nextView != 0) {
            this.f4405e.f4520f.removeView(nextView);
        }
        InterfaceC1758mv interfaceC1758mvM11878a = C0710au.m5570f().m11878a(this.f4405e.f4517c, C1807oq.m11927a(this.f4405e.f4523i), this.f4405e.f4523i.f9247a, false, false, this.f4405e.f4518d, this.f4405e.f4519e, this.f4401a, this, this.f4408h, c1542ev.f10568i);
        if (this.f4405e.f4523i.f9253g == null) {
            if (interfaceC1758mvM11878a == 0) {
                throw null;
            }
            m5449a((View) interfaceC1758mvM11878a);
        }
        interfaceC1758mvM11878a.mo11833w().m11852a(this, this, this, this, false, null, c0734br, this, interfaceC1528eh);
        m5627a(interfaceC1758mvM11878a);
        interfaceC1758mvM11878a.mo11818b(c1542ev.f10560a.f11772v);
        return interfaceC1758mvM11878a;
    }

    @Override // com.google.android.gms.internal.ckg
    /* JADX INFO: renamed from: a */
    public final void mo5626a(int i, int i2, int i3, int i4) {
        m5491u();
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a, com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5458a(cbh cbhVar) {
        C1221aj.m7073b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f4405e.f4540z = cbhVar;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a
    /* JADX INFO: renamed from: a */
    protected void mo5463a(C1542ev c1542ev, cba cbaVar) {
        if (c1542ev.f10564e != -2) {
            C1596gv.f10711a.post(new RunnableC0722bf(this, c1542ev));
            return;
        }
        if (c1542ev.f10563d != null) {
            this.f4405e.f4523i = c1542ev.f10563d;
        }
        if (!c1542ev.f10561b.f12615g || c1542ev.f10561b.f12634z) {
            C1596gv.f10711a.post(new RunnableC0723bg(this, c1542ev, this.f4408h.f4578c.mo11216a(this.f4405e.f4517c, this.f4405e.f4519e, c1542ev.f10561b), cbaVar));
        } else {
            this.f4405e.f4506F = 0;
            ViewTreeObserverOnGlobalLayoutListenerC0711av viewTreeObserverOnGlobalLayoutListenerC0711av = this.f4405e;
            C0710au.m5568d();
            viewTreeObserverOnGlobalLayoutListenerC0711av.f4522h = clf.m11081a(this.f4405e.f4517c, this, c1542ev, this.f4405e.f4518d, null, this.f4545i, this, cbaVar);
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m5627a(InterfaceC1758mv interfaceC1758mv) {
        interfaceC1758mv.mo11815a("/trackActiveViewUnit", new C0721be(this));
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay, com.google.android.gms.ads.internal.AbstractBinderC0689a
    /* JADX INFO: renamed from: a */
    protected boolean mo5469a(C1541eu c1541eu, C1541eu c1541eu2) {
        if (this.f4405e.m5598d() && this.f4405e.f4520f != null) {
            this.f4405e.f4520f.m5601a().m11505c(c1541eu2.f10559z);
        }
        try {
            if (c1541eu2.f10535b != null && !c1541eu2.f10546m && c1541eu2.f10530J) {
                if (((Boolean) bxm.m10409f().m10546a(can.f9549cP)).booleanValue()) {
                    String str = c1541eu2.f10534a.f9223q;
                    if ((str == null || "com.google.ads.mediation.AbstractAdViewAdapter".equals(str)) && !c1541eu2.f10534a.f9209c.containsKey("sdk_less_server_data")) {
                        try {
                            c1541eu2.f10535b.mo11808L();
                        } catch (Throwable th) {
                            C1560fm.m11343a("Could not render test Ad label.");
                        }
                    }
                }
            }
        } catch (RuntimeException e) {
            C1560fm.m11343a("Could not render test AdLabel.");
        }
        return super.mo5469a(c1541eu, c1541eu2);
    }

    @Override // com.google.android.gms.ads.internal.InterfaceC0741f
    /* JADX INFO: renamed from: a_ */
    public final void mo5628a_(View view) {
        this.f4405e.f4505E = view;
        mo5471b(new C1541eu(this.f4405e.f4525k, null, null, null, null, null, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    final void m5629b(InterfaceC1758mv interfaceC1758mv) {
        if (this.f4405e.f4524j == null) {
            this.f4553j = true;
            C1560fm.m11615e("Request to enable ActiveView before adState is available.");
            return;
        }
        bsz bszVar = this.f4407g;
        bxb bxbVar = this.f4405e.f4523i;
        C1541eu c1541eu = this.f4405e.f4524j;
        if (interfaceC1758mv == 0) {
            throw null;
        }
        bszVar.m10202a(bxbVar, c1541eu, (View) interfaceC1758mv, interfaceC1758mv);
        this.f4553j = false;
    }

    @Override // com.google.android.gms.ads.internal.InterfaceC0741f
    /* JADX INFO: renamed from: d_ */
    public final void mo5630d_() {
        mo5308e();
    }

    @Override // com.google.android.gms.ads.internal.InterfaceC0741f
    /* JADX INFO: renamed from: e_ */
    public final void mo5631e_() {
        m5613W();
        mo5483m();
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a
    /* JADX INFO: renamed from: v */
    protected void mo5492v() {
        super.mo5492v();
        if (this.f4553j) {
            if (((Boolean) bxm.m10409f().m10546a(can.f9499bS)).booleanValue()) {
                m5629b(this.f4405e.f4524j.f10535b);
            }
        }
    }
}
