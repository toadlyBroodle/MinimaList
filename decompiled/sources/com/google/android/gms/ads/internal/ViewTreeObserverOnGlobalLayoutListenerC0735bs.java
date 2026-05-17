package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.C0681d;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.BinderC1779np;
import com.google.android.gms.internal.C1531ek;
import com.google.android.gms.internal.C1541eu;
import com.google.android.gms.internal.C1542ev;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.C1670jo;
import com.google.android.gms.internal.C1708kz;
import com.google.android.gms.internal.C1759mw;
import com.google.android.gms.internal.C1807oq;
import com.google.android.gms.internal.InterfaceC1528eh;
import com.google.android.gms.internal.InterfaceC1758mv;
import com.google.android.gms.internal.InterfaceC1768ne;
import com.google.android.gms.internal.bua;
import com.google.android.gms.internal.bwh;
import com.google.android.gms.internal.bwx;
import com.google.android.gms.internal.bxb;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.byx;
import com.google.android.gms.internal.can;
import com.google.android.gms.internal.cii;
import com.google.android.gms.internal.civ;
import com.google.android.gms.internal.ciy;
import com.google.android.gms.internal.cnb;
import com.google.android.gms.p043a.BinderC0654c;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.bs */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class ViewTreeObserverOnGlobalLayoutListenerC0735bs extends BinderC0720bd implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: j */
    private boolean f4584j;

    /* JADX INFO: renamed from: k */
    private WeakReference<Object> f4585k;

    public ViewTreeObserverOnGlobalLayoutListenerC0735bs(Context context, bxb bxbVar, String str, cii ciiVar, C1670jo c1670jo, C0733bq c0733bq) {
        super(context, bxbVar, str, ciiVar, c1670jo, c0733bq);
        this.f4585k = new WeakReference<>(null);
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
    /* JADX INFO: renamed from: b */
    private final boolean m5646b(C1541eu c1541eu, C1541eu c1541eu2) {
        if (c1541eu2.f10546m) {
            View viewM5806a = C0848r.m5806a(c1541eu2);
            if (viewM5806a == null) {
                C1560fm.m11615e("Could not get mediation view");
                return false;
            }
            View nextView = this.f4405e.f4520f.getNextView();
            if (nextView != 0) {
                if (nextView instanceof InterfaceC1758mv) {
                    ((InterfaceC1758mv) nextView).destroy();
                }
                this.f4405e.f4520f.removeView(nextView);
            }
            if (!C0848r.m5818b(c1541eu2)) {
                try {
                    if (C0710au.m5590z().m11238b(this.f4405e.f4517c)) {
                        new bua(this.f4405e.f4517c, viewM5806a).m10262a(new C1531ek(this.f4405e.f4517c, this.f4405e.f4516b));
                    }
                    if (c1541eu2.f10553t != null) {
                        this.f4405e.f4520f.setMinimumWidth(c1541eu2.f10553t.f9252f);
                        this.f4405e.f4520f.setMinimumHeight(c1541eu2.f10553t.f9249c);
                    }
                    m5449a(viewM5806a);
                } catch (Exception e) {
                    C0710au.m5573i().m11292a(e, "BannerAdManager.swapViews");
                    C1560fm.m11613c("Could not add mediation view to view hierarchy.", e);
                    return false;
                }
            }
        } else if (c1541eu2.f10553t != null && c1541eu2.f10535b != null) {
            c1541eu2.f10535b.mo11813a(C1807oq.m11927a(c1541eu2.f10553t));
            this.f4405e.f4520f.removeAllViews();
            this.f4405e.f4520f.setMinimumWidth(c1541eu2.f10553t.f9252f);
            this.f4405e.f4520f.setMinimumHeight(c1541eu2.f10553t.f9249c);
            Object obj = c1541eu2.f10535b;
            if (obj == null) {
                throw null;
            }
            m5449a((View) obj);
        }
        if (this.f4405e.f4520f.getChildCount() > 1) {
            this.f4405e.f4520f.showNext();
        }
        if (c1541eu != null) {
            View nextView2 = this.f4405e.f4520f.getNextView();
            if (nextView2 instanceof InterfaceC1758mv) {
                ((InterfaceC1758mv) nextView2).destroy();
            } else if (nextView2 != 0) {
                this.f4405e.f4520f.removeView(nextView2);
            }
            this.f4405e.m5597c();
        }
        this.f4405e.f4520f.setVisibility(0);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay, com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: D */
    public final void mo5503D() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay
    /* JADX INFO: renamed from: R */
    protected final boolean mo5608R() {
        boolean z = true;
        C0710au.m5569e();
        if (!C1596gv.m11400a(this.f4405e.f4517c, this.f4405e.f4517c.getPackageName(), "android.permission.INTERNET")) {
            bxm.m10404a().m11585a(this.f4405e.f4520f, this.f4405e.f4523i, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        }
        C0710au.m5569e();
        if (!C1596gv.m11399a(this.f4405e.f4517c)) {
            bxm.m10404a().m11585a(this.f4405e.f4520f, this.f4405e.f4523i, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if (!z && this.f4405e.f4520f != null) {
            this.f4405e.f4520f.setVisibility(0);
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.BinderC0720bd
    /* JADX INFO: renamed from: a */
    protected final InterfaceC1758mv mo5625a(C1542ev c1542ev, C0734br c0734br, InterfaceC1528eh interfaceC1528eh) {
        C0681d c0681dM10384b;
        bxb bxbVar;
        if (this.f4405e.f4523i.f9253g == null && this.f4405e.f4523i.f9255i) {
            ViewTreeObserverOnGlobalLayoutListenerC0711av viewTreeObserverOnGlobalLayoutListenerC0711av = this.f4405e;
            if (c1542ev.f10561b.f12633y) {
                bxbVar = this.f4405e.f4523i;
            } else {
                String str = c1542ev.f10561b.f12620l;
                if (str != null) {
                    String[] strArrSplit = str.split("[xX]");
                    strArrSplit[0] = strArrSplit[0].trim();
                    strArrSplit[1] = strArrSplit[1].trim();
                    c0681dM10384b = new C0681d(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]));
                } else {
                    c0681dM10384b = this.f4405e.f4523i.m10384b();
                }
                bxbVar = new bxb(this.f4405e.f4517c, c0681dM10384b);
            }
            viewTreeObserverOnGlobalLayoutListenerC0711av.f4523i = bxbVar;
        }
        return super.mo5625a(c1542ev, c0734br, interfaceC1528eh);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay
    /* JADX INFO: renamed from: a */
    protected final void mo5615a(C1541eu c1541eu, boolean z) {
        View view;
        super.mo5615a(c1541eu, z);
        if (C0848r.m5818b(c1541eu)) {
            C0738c c0738c = new C0738c(this);
            if (c1541eu == null || !C0848r.m5818b(c1541eu)) {
                return;
            }
            InterfaceC1758mv interfaceC1758mv = c1541eu.f10535b;
            if (interfaceC1758mv == 0) {
                view = null;
            } else {
                if (interfaceC1758mv == 0) {
                    throw null;
                }
                view = (View) interfaceC1758mv;
            }
            if (view == null) {
                C1560fm.m11615e("AdWebView is null");
                return;
            }
            try {
                List<String> list = c1541eu.f10547n != null ? c1541eu.f10547n.f10030p : null;
                if (list == null || list.isEmpty()) {
                    C1560fm.m11615e("No template ids present in mediation response");
                    return;
                }
                civ civVarMo10959h = c1541eu.f10548o != null ? c1541eu.f10548o.mo10959h() : null;
                ciy ciyVarMo10960i = c1541eu.f10548o != null ? c1541eu.f10548o.mo10960i() : null;
                if (list.contains("2") && civVarMo10959h != null) {
                    civVarMo10959h.mo10970b(BinderC0654c.m5329a(view));
                    if (!civVarMo10959h.mo10979j()) {
                        civVarMo10959h.mo10978i();
                    }
                    interfaceC1758mv.mo11833w().m11857a("/nativeExpressViewClicked", C0848r.m5807a(civVarMo10959h, (ciy) null, c0738c));
                    return;
                }
                if (!list.contains("1") || ciyVarMo10960i == null) {
                    C1560fm.m11615e("No matching template id and mapper");
                    return;
                }
                ciyVarMo10960i.mo10990b(BinderC0654c.m5329a(view));
                if (!ciyVarMo10960i.mo10997h()) {
                    ciyVarMo10960i.mo10996g();
                }
                interfaceC1758mv.mo11833w().m11857a("/nativeExpressViewClicked", C0848r.m5807a((civ) null, ciyVarMo10960i, c0738c));
            } catch (RemoteException e) {
                C1560fm.m11613c("Error occurred while recording impression and registering for clicks", e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013f  */
    @Override // com.google.android.gms.ads.internal.BinderC0720bd, com.google.android.gms.ads.internal.AbstractBinderC0714ay, com.google.android.gms.ads.internal.AbstractBinderC0689a
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo5469a(C1541eu c1541eu, C1541eu c1541eu2) {
        View view;
        if (!super.mo5469a(c1541eu, c1541eu2)) {
            return false;
        }
        if (this.f4405e.m5598d() && !m5646b(c1541eu, c1541eu2)) {
            if (c1541eu2.f10528H != null) {
                c1541eu2.f10528H.m10356a(bwh.C1461a.b.AD_FAILED_TO_LOAD);
            }
            mo5447a(0);
            return false;
        }
        if (c1541eu2.f10544k) {
            m5647d(c1541eu2);
            C0710au.m5589y();
            C1708kz.m11663a((View) this.f4405e.f4520f, (ViewTreeObserver.OnGlobalLayoutListener) this);
            C0710au.m5589y();
            C1708kz.m11664a((View) this.f4405e.f4520f, (ViewTreeObserver.OnScrollChangedListener) this);
            if (!c1541eu2.f10545l) {
                RunnableC0736bt runnableC0736bt = new RunnableC0736bt(this);
                C1759mw c1759mwMo11833w = c1541eu2.f10535b != null ? c1541eu2.f10535b.mo11833w() : null;
                if (c1759mwMo11833w != null) {
                    c1759mwMo11833w.m11856a(new C0737bu(this, c1541eu2, runnableC0736bt));
                }
            }
        } else if (this.f4405e.m5599e()) {
            if (((Boolean) bxm.m10409f().m10546a(can.f9490bJ)).booleanValue()) {
                mo5615a(c1541eu2, false);
            }
        }
        if (c1541eu2.f10535b != null) {
            BinderC1779np binderC1779npMo11753b = c1541eu2.f10535b.mo11753b();
            C1759mw c1759mwMo11833w2 = c1541eu2.f10535b.mo11833w();
            if (c1759mwMo11833w2 != null) {
                c1759mwMo11833w2.m11870h();
            }
            if (this.f4405e.f4536v != null && binderC1779npMo11753b != null) {
                binderC1779npMo11753b.m11914a(this.f4405e.f4536v);
            }
        }
        if (this.f4405e.m5598d()) {
            if (c1541eu2.f10535b != null) {
                if (c1541eu2.f10543j != null) {
                    this.f4407g.m10200a(this.f4405e.f4523i, c1541eu2);
                }
                Object obj = c1541eu2.f10535b;
                if (obj == null) {
                    throw null;
                }
                view = (View) obj;
                bua buaVar = new bua(this.f4405e.f4517c, view);
                if (C0710au.m5590z().m11238b(this.f4405e.f4517c) && m5441a(c1541eu2.f10534a) && !TextUtils.isEmpty(this.f4405e.f4516b)) {
                    buaVar.m10262a(new C1531ek(this.f4405e.f4517c, this.f4405e.f4516b));
                }
                if (c1541eu2.m11256a()) {
                    buaVar.m10262a(c1541eu2.f10535b);
                } else {
                    c1541eu2.f10535b.mo11833w().m11855a(new C0716b(this, buaVar, c1541eu2));
                }
            } else {
                view = null;
            }
        } else if (this.f4405e.f4505E != null && c1541eu2.f10543j != null) {
            this.f4407g.m10201a(this.f4405e.f4523i, c1541eu2, this.f4405e.f4505E);
            view = this.f4405e.f4505E;
        }
        if (!c1541eu2.f10546m) {
            this.f4405e.m5593a(view);
        }
        return true;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a, com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: b */
    public final void mo5472b(boolean z) {
        C1221aj.m7073b("setManualImpressionsEnabled must be called from the main thread.");
        this.f4584j = z;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a, com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: b */
    public final boolean mo5473b(bwx bwxVar) {
        if (bwxVar.f9214h != this.f4584j) {
            bwxVar = new bwx(bwxVar.f9207a, bwxVar.f9208b, bwxVar.f9209c, bwxVar.f9210d, bwxVar.f9211e, bwxVar.f9212f, bwxVar.f9213g, bwxVar.f9214h || this.f4584j, bwxVar.f9215i, bwxVar.f9216j, bwxVar.f9217k, bwxVar.f9218l, bwxVar.f9219m, bwxVar.f9220n, bwxVar.f9221o, bwxVar.f9222p, bwxVar.f9223q, bwxVar.f9224r);
        }
        return super.mo5473b(bwxVar);
    }

    /* JADX INFO: renamed from: d */
    final void m5647d(C1541eu c1541eu) {
        if (c1541eu == null || c1541eu.f10545l || this.f4405e.f4520f == null || !C0710au.m5569e().m11446a(this.f4405e.f4520f, this.f4405e.f4517c) || !this.f4405e.f4520f.getGlobalVisibleRect(new Rect(), null)) {
            return;
        }
        if (c1541eu != null && c1541eu.f10535b != null && c1541eu.f10535b.mo11833w() != null) {
            c1541eu.f10535b.mo11833w().m11856a((InterfaceC1768ne) null);
        }
        mo5615a(c1541eu, false);
        c1541eu.f10545l = true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m5647d(this.f4405e.f4524j);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m5647d(this.f4405e.f4524j);
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a, com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: r */
    public final byx mo5488r() {
        C1221aj.m7073b("getVideoController must be called from the main thread.");
        if (this.f4405e.f4524j == null || this.f4405e.f4524j.f10535b == null) {
            return null;
        }
        return this.f4405e.f4524j.f10535b.mo11753b();
    }
}
