package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.BinderC0692ac;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.ads.internal.gmsg.C0764k;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cly {

    /* JADX INFO: renamed from: b */
    private final Context f10333b;

    /* JADX INFO: renamed from: c */
    private final afk f10334c;

    /* JADX INFO: renamed from: d */
    private final C1542ev f10335d;

    /* JADX INFO: renamed from: e */
    private final cba f10336e;

    /* JADX INFO: renamed from: f */
    private final BinderC0692ac f10337f;

    /* JADX INFO: renamed from: g */
    private ViewTreeObserver.OnGlobalLayoutListener f10338g;

    /* JADX INFO: renamed from: h */
    private ViewTreeObserver.OnScrollChangedListener f10339h;

    /* JADX INFO: renamed from: a */
    private final Object f10332a = new Object();

    /* JADX INFO: renamed from: j */
    private int f10341j = -1;

    /* JADX INFO: renamed from: k */
    private int f10342k = -1;

    /* JADX INFO: renamed from: i */
    private C1647is f10340i = new C1647is(200);

    public cly(Context context, afk afkVar, C1542ev c1542ev, cba cbaVar, BinderC0692ac binderC0692ac) {
        this.f10333b = context;
        this.f10334c = afkVar;
        this.f10335d = c1542ev;
        this.f10336e = cbaVar;
        this.f10337f = binderC0692ac;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final ViewTreeObserver.OnGlobalLayoutListener m11116a(WeakReference<InterfaceC1758mv> weakReference) {
        if (this.f10338g == null) {
            this.f10338g = new cme(this, weakReference);
        }
        return this.f10338g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m11120a(InterfaceC1758mv interfaceC1758mv) {
        C1759mw c1759mwMo11833w = interfaceC1758mv.mo11833w();
        c1759mwMo11833w.m11857a("/video", C0764k.f4651l);
        c1759mwMo11833w.m11857a("/videoMeta", C0764k.f4652m);
        c1759mwMo11833w.m11857a("/precache", new C1755ms());
        c1759mwMo11833w.m11857a("/delayPageLoaded", C0764k.f4655p);
        c1759mwMo11833w.m11857a("/instrument", C0764k.f4653n);
        c1759mwMo11833w.m11857a("/log", C0764k.f4646g);
        c1759mwMo11833w.m11857a("/videoClicked", C0764k.f4647h);
        c1759mwMo11833w.m11857a("/trackActiveViewUnit", new cmc(this));
        c1759mwMo11833w.m11857a("/untrackActiveViewUnit", new cmd(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m11121a(WeakReference<InterfaceC1758mv> weakReference, boolean z) {
        InterfaceC1758mv interfaceC1758mv;
        if (weakReference == null || (interfaceC1758mv = weakReference.get()) == 0) {
            return;
        }
        if (interfaceC1758mv == 0) {
            throw null;
        }
        if (((View) interfaceC1758mv) != null) {
            if (!z || this.f10340i.m11540a()) {
                if (interfaceC1758mv == 0) {
                    throw null;
                }
                int[] iArr = new int[2];
                ((View) interfaceC1758mv).getLocationOnScreen(iArr);
                bxm.m10404a();
                int iM11570b = C1657jb.m11570b(this.f10333b, iArr[0]);
                bxm.m10404a();
                int iM11570b2 = C1657jb.m11570b(this.f10333b, iArr[1]);
                synchronized (this.f10332a) {
                    if (this.f10341j != iM11570b || this.f10342k != iM11570b2) {
                        this.f10341j = iM11570b;
                        this.f10342k = iM11570b2;
                        interfaceC1758mv.mo11833w().m11849a(this.f10341j, this.f10342k, !z);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final ViewTreeObserver.OnScrollChangedListener m11123b(WeakReference<InterfaceC1758mv> weakReference) {
        if (this.f10339h == null) {
            this.f10339h = new cmg(this, weakReference);
        }
        return this.f10339h;
    }

    /* JADX INFO: renamed from: a */
    final InterfaceC1758mv m11124a() {
        return C0710au.m5570f().m11878a(this.f10333b, C1807oq.m11925a(), "native-video", false, false, this.f10334c, this.f10335d.f10560a.f11761k, this.f10336e, null, this.f10337f.m5478h(), this.f10335d.f10568i);
    }
}
