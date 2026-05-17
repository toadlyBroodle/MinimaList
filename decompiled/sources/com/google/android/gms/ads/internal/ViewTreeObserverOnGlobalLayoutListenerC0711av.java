package com.google.android.gms.ads.internal;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.support.v4.p018i.C0219m;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.internal.AbstractC1556fi;
import com.google.android.gms.internal.C1541eu;
import com.google.android.gms.internal.C1542ev;
import com.google.android.gms.internal.C1543ew;
import com.google.android.gms.internal.C1553ff;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1647is;
import com.google.android.gms.internal.C1657jb;
import com.google.android.gms.internal.C1670jo;
import com.google.android.gms.internal.InterfaceC1487cu;
import com.google.android.gms.internal.InterfaceC1616ho;
import com.google.android.gms.internal.afg;
import com.google.android.gms.internal.afk;
import com.google.android.gms.internal.bxb;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.bxp;
import com.google.android.gms.internal.bxs;
import com.google.android.gms.internal.byi;
import com.google.android.gms.internal.byp;
import com.google.android.gms.internal.bzd;
import com.google.android.gms.internal.bzw;
import com.google.android.gms.internal.can;
import com.google.android.gms.internal.cbh;
import com.google.android.gms.internal.ccm;
import com.google.android.gms.internal.cdz;
import com.google.android.gms.internal.cec;
import com.google.android.gms.internal.cef;
import com.google.android.gms.internal.cei;
import com.google.android.gms.internal.cep;
import com.google.android.gms.internal.cnb;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.av */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class ViewTreeObserverOnGlobalLayoutListenerC0711av implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: A */
    InterfaceC1487cu f4501A;

    /* JADX INFO: renamed from: B */
    public String f4502B;

    /* JADX INFO: renamed from: C */
    List<String> f4503C;

    /* JADX INFO: renamed from: D */
    public C1553ff f4504D;

    /* JADX INFO: renamed from: E */
    View f4505E;

    /* JADX INFO: renamed from: F */
    public int f4506F;

    /* JADX INFO: renamed from: G */
    boolean f4507G;

    /* JADX INFO: renamed from: H */
    private HashSet<C1543ew> f4508H;

    /* JADX INFO: renamed from: I */
    private int f4509I;

    /* JADX INFO: renamed from: J */
    private int f4510J;

    /* JADX INFO: renamed from: K */
    private C1647is f4511K;

    /* JADX INFO: renamed from: L */
    private boolean f4512L;

    /* JADX INFO: renamed from: M */
    private boolean f4513M;

    /* JADX INFO: renamed from: N */
    private boolean f4514N;

    /* JADX INFO: renamed from: a */
    final String f4515a;

    /* JADX INFO: renamed from: b */
    public String f4516b;

    /* JADX INFO: renamed from: c */
    public final Context f4517c;

    /* JADX INFO: renamed from: d */
    final afk f4518d;

    /* JADX INFO: renamed from: e */
    public final C1670jo f4519e;

    /* JADX INFO: renamed from: f */
    C0712aw f4520f;

    /* JADX INFO: renamed from: g */
    public AbstractC1556fi f4521g;

    /* JADX INFO: renamed from: h */
    public InterfaceC1616ho f4522h;

    /* JADX INFO: renamed from: i */
    public bxb f4523i;

    /* JADX INFO: renamed from: j */
    public C1541eu f4524j;

    /* JADX INFO: renamed from: k */
    public C1542ev f4525k;

    /* JADX INFO: renamed from: l */
    public C1543ew f4526l;

    /* JADX INFO: renamed from: m */
    bxp f4527m;

    /* JADX INFO: renamed from: n */
    bxs f4528n;

    /* JADX INFO: renamed from: o */
    byi f4529o;

    /* JADX INFO: renamed from: p */
    byp f4530p;

    /* JADX INFO: renamed from: q */
    cdz f4531q;

    /* JADX INFO: renamed from: r */
    cec f4532r;

    /* JADX INFO: renamed from: s */
    C0219m<String, cef> f4533s;

    /* JADX INFO: renamed from: t */
    C0219m<String, cei> f4534t;

    /* JADX INFO: renamed from: u */
    ccm f4535u;

    /* JADX INFO: renamed from: v */
    bzw f4536v;

    /* JADX INFO: renamed from: w */
    bzd f4537w;

    /* JADX INFO: renamed from: x */
    cep f4538x;

    /* JADX INFO: renamed from: y */
    List<Integer> f4539y;

    /* JADX INFO: renamed from: z */
    cbh f4540z;

    public ViewTreeObserverOnGlobalLayoutListenerC0711av(Context context, bxb bxbVar, String str, C1670jo c1670jo) {
        this(context, bxbVar, str, c1670jo, null);
    }

    private ViewTreeObserverOnGlobalLayoutListenerC0711av(Context context, bxb bxbVar, String str, C1670jo c1670jo, afk afkVar) {
        this.f4504D = null;
        this.f4505E = null;
        this.f4506F = 0;
        this.f4507G = false;
        this.f4508H = null;
        this.f4509I = -1;
        this.f4510J = -1;
        this.f4512L = true;
        this.f4513M = true;
        this.f4514N = false;
        can.m10549a(context);
        if (C0710au.m5573i().m11303e() != null) {
            List<String> listM10551b = can.m10551b();
            if (c1670jo.f10856b != 0) {
                listM10551b.add(Integer.toString(c1670jo.f10856b));
            }
            C0710au.m5573i().m11303e().m10561a(listM10551b);
        }
        this.f4515a = UUID.randomUUID().toString();
        if (bxbVar.f9250d || bxbVar.f9254h) {
            this.f4520f = null;
        } else {
            this.f4520f = new C0712aw(context, str, c1670jo.f10855a, this, this);
            this.f4520f.setMinimumWidth(bxbVar.f9252f);
            this.f4520f.setMinimumHeight(bxbVar.f9249c);
            this.f4520f.setVisibility(4);
        }
        this.f4523i = bxbVar;
        this.f4516b = str;
        this.f4517c = context;
        this.f4519e = c1670jo;
        this.f4518d = new afk(new RunnableC0742g(this));
        this.f4511K = new C1647is(200L);
        this.f4534t = new C0219m<>();
    }

    /* JADX INFO: renamed from: b */
    private final void m5591b(boolean z) {
        View viewFindViewById;
        if (this.f4520f == null || this.f4524j == null || this.f4524j.f10535b == null || this.f4524j.f10535b.mo11833w() == null) {
            return;
        }
        if (!z || this.f4511K.m11540a()) {
            if (this.f4524j.f10535b.mo11833w().m11864b()) {
                int[] iArr = new int[2];
                this.f4520f.getLocationOnScreen(iArr);
                bxm.m10404a();
                int iM11570b = C1657jb.m11570b(this.f4517c, iArr[0]);
                bxm.m10404a();
                int iM11570b2 = C1657jb.m11570b(this.f4517c, iArr[1]);
                if (iM11570b != this.f4509I || iM11570b2 != this.f4510J) {
                    this.f4509I = iM11570b;
                    this.f4510J = iM11570b2;
                    this.f4524j.f10535b.mo11833w().m11849a(this.f4509I, this.f4510J, z ? false : true);
                }
            }
            if (this.f4520f == null || (viewFindViewById = this.f4520f.getRootView().findViewById(R.id.content)) == null) {
                return;
            }
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            this.f4520f.getGlobalVisibleRect(rect);
            viewFindViewById.getGlobalVisibleRect(rect2);
            if (rect.top != rect2.top) {
                this.f4512L = false;
            }
            if (rect.bottom != rect2.bottom) {
                this.f4513M = false;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final HashSet<C1543ew> m5592a() {
        return this.f4508H;
    }

    /* JADX INFO: renamed from: a */
    final void m5593a(View view) {
        afg afgVarM7810a;
        if (((Boolean) bxm.m10409f().m10546a(can.f9526bt)).booleanValue() && (afgVarM7810a = this.f4518d.m7810a()) != null) {
            afgVarM7810a.mo5661a(view);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5594a(HashSet<C1543ew> hashSet) {
        this.f4508H = hashSet;
    }

    /* JADX INFO: renamed from: a */
    public final void m5595a(boolean z) {
        if (this.f4506F == 0 && this.f4524j != null && this.f4524j.f10535b != null) {
            this.f4524j.f10535b.stopLoading();
        }
        if (this.f4521g != null) {
            this.f4521g.mo11075c();
        }
        if (this.f4522h != null) {
            this.f4522h.mo11075c();
        }
        if (z) {
            this.f4524j = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5596b() {
        if (this.f4524j == null || this.f4524j.f10535b == null) {
            return;
        }
        this.f4524j.f10535b.destroy();
    }

    /* JADX INFO: renamed from: c */
    public final void m5597c() {
        if (this.f4524j == null || this.f4524j.f10548o == null) {
            return;
        }
        try {
            this.f4524j.f10548o.mo10954c();
        } catch (RemoteException e) {
            C1560fm.m11615e("Could not destroy mediation adapter.");
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5598d() {
        return this.f4506F == 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m5599e() {
        return this.f4506F == 1;
    }

    /* JADX INFO: renamed from: f */
    public final String m5600f() {
        return (this.f4512L && this.f4513M) ? "" : this.f4512L ? this.f4514N ? "top-scrollable" : "top-locked" : this.f4513M ? this.f4514N ? "bottom-scrollable" : "bottom-locked" : "";
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m5591b(false);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m5591b(true);
        this.f4514N = true;
    }
}
