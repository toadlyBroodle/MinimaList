package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.ads.p045b.C0664a;
import com.google.android.gms.common.util.C1310n;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cco extends cdd implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: b */
    private static String[] f9820b = {"2011", "1009"};

    /* JADX INFO: renamed from: a */
    FrameLayout f9821a;

    /* JADX INFO: renamed from: d */
    private final FrameLayout f9823d;

    /* JADX INFO: renamed from: e */
    private View f9824e;

    /* JADX INFO: renamed from: f */
    private final boolean f9825f;

    /* JADX INFO: renamed from: h */
    private View f9827h;

    /* JADX INFO: renamed from: i */
    private cbz f9828i;

    /* JADX INFO: renamed from: c */
    private final Object f9822c = new Object();

    /* JADX INFO: renamed from: g */
    private Map<String, WeakReference<View>> f9826g = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: j */
    private boolean f9829j = false;

    /* JADX INFO: renamed from: k */
    private Point f9830k = new Point();

    /* JADX INFO: renamed from: l */
    private Point f9831l = new Point();

    /* JADX INFO: renamed from: m */
    private WeakReference<bua> f9832m = new WeakReference<>(null);

    @TargetApi(21)
    public cco(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f9823d = frameLayout;
        this.f9821a = frameLayout2;
        C0710au.m5589y();
        C1708kz.m11663a((View) this.f9823d, (ViewTreeObserver.OnGlobalLayoutListener) this);
        C0710au.m5589y();
        C1708kz.m11664a((View) this.f9823d, (ViewTreeObserver.OnScrollChangedListener) this);
        this.f9823d.setOnTouchListener(this);
        this.f9823d.setOnClickListener(this);
        if (frameLayout2 != null && C1310n.m7284g()) {
            frameLayout2.setElevation(Float.MAX_VALUE);
        }
        can.m10549a(this.f9823d.getContext());
        this.f9825f = ((Boolean) bxm.m10409f().m10546a(can.f9501bU)).booleanValue();
    }

    /* JADX INFO: renamed from: a */
    private final int m10713a(int i) {
        bxm.m10404a();
        return C1657jb.m11570b(this.f9828i.mo10686i(), i);
    }

    /* JADX INFO: renamed from: a */
    private final void m10715a(View view) {
        if (this.f9828i != null) {
            cbz cbzVarM10672d = this.f9828i instanceof cby ? ((cby) this.f9828i).m10672d() : this.f9828i;
            if (cbzVarM10672d != null) {
                cbzVarM10672d.mo10682b(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m10716a(ccd ccdVar) {
        View view;
        synchronized (this.f9822c) {
            ccdVar.m10704a(this.f9826g);
            if (this.f9826g != null) {
                for (String str : f9820b) {
                    WeakReference<View> weakReference = this.f9826g.get(str);
                    if (weakReference != null) {
                        view = weakReference.get();
                        break;
                    }
                }
                view = null;
            } else {
                view = null;
            }
            if (!(view instanceof FrameLayout)) {
                ccdVar.mo10675g();
                return;
            }
            ccq ccqVar = new ccq(this, view);
            if (ccdVar instanceof cby) {
                ccdVar.m10705b(view, ccqVar);
            } else {
                ccdVar.mo10678a(view, ccqVar);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m10720b() {
        synchronized (this.f9822c) {
            if (!this.f9825f && this.f9829j) {
                int measuredWidth = this.f9823d.getMeasuredWidth();
                int measuredHeight = this.f9823d.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0 && this.f9821a != null) {
                    this.f9821a.setLayoutParams(new FrameLayout.LayoutParams(measuredWidth, measuredHeight));
                    this.f9829j = false;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.cdc
    /* JADX INFO: renamed from: a */
    public final InterfaceC0652a mo10722a(String str) {
        synchronized (this.f9822c) {
            if (this.f9826g == null) {
                return null;
            }
            WeakReference<View> weakReference = this.f9826g.get(str);
            return BinderC0654c.m5329a(weakReference != null ? weakReference.get() : null);
        }
    }

    @Override // com.google.android.gms.internal.cdc
    /* JADX INFO: renamed from: a */
    public final void mo10723a() {
        synchronized (this.f9822c) {
            if (this.f9821a != null) {
                this.f9821a.removeAllViews();
            }
            this.f9821a = null;
            this.f9826g = null;
            this.f9827h = null;
            this.f9828i = null;
            this.f9830k = null;
            this.f9831l = null;
            this.f9832m = null;
            this.f9824e = null;
        }
    }

    @Override // com.google.android.gms.internal.cdc
    /* JADX INFO: renamed from: a */
    public final void mo10724a(InterfaceC0652a interfaceC0652a) {
        ccd ccdVar;
        ccd ccdVar2;
        ViewGroup viewGroup = null;
        synchronized (this.f9822c) {
            m10715a((View) null);
            Object objM5330a = BinderC0654c.m5330a(interfaceC0652a);
            if (!(objM5330a instanceof ccd)) {
                C1560fm.m11615e("Not an instance of native engine. This is most likely a transient error");
                return;
            }
            if (!this.f9825f && this.f9821a != null) {
                this.f9821a.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
                this.f9823d.requestLayout();
            }
            this.f9829j = true;
            ccd ccdVar3 = (ccd) objM5330a;
            if (this.f9828i != null) {
                if (((Boolean) bxm.m10409f().m10546a(can.f9493bM)).booleanValue()) {
                    this.f9828i.mo10669b(this.f9823d, this.f9826g);
                }
            }
            if ((this.f9828i instanceof ccd) && (ccdVar2 = (ccd) this.f9828i) != null && ccdVar2.mo10686i() != null && C0710au.m5590z().m11240c(this.f9823d.getContext())) {
                C1531ek c1531ekM10706j = ccdVar2.m10706j();
                if (c1531ekM10706j != null) {
                    c1531ekM10706j.m11222a(false);
                }
                bua buaVar = this.f9832m.get();
                if (buaVar != null && c1531ekM10706j != null) {
                    buaVar.m10263b(c1531ekM10706j);
                }
            }
            if ((this.f9828i instanceof cby) && ((cby) this.f9828i).m10671c()) {
                ((cby) this.f9828i).m10667a(ccdVar3);
            } else {
                this.f9828i = ccdVar3;
                if (ccdVar3 instanceof cby) {
                    ((cby) ccdVar3).m10667a((cbz) null);
                }
            }
            if (this.f9821a == null) {
                return;
            }
            if (((Boolean) bxm.m10409f().m10546a(can.f9493bM)).booleanValue()) {
                this.f9821a.setClickable(false);
            }
            this.f9821a.removeAllViews();
            boolean zMo10668a = ccdVar3.mo10668a();
            if (zMo10668a && this.f9826g != null) {
                WeakReference<View> weakReference = this.f9826g.get("1098");
                View view = weakReference != null ? weakReference.get() : null;
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                }
            }
            boolean z = zMo10668a && viewGroup != null;
            this.f9827h = ccdVar3.mo10663a(this, z);
            if (this.f9827h != null) {
                if (this.f9826g != null) {
                    this.f9826g.put("1007", new WeakReference<>(this.f9827h));
                }
                if (z) {
                    viewGroup.removeAllViews();
                    viewGroup.addView(this.f9827h);
                } else {
                    C0664a c0664a = new C0664a(ccdVar3.mo10686i());
                    c0664a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    c0664a.addView(this.f9827h);
                    if (this.f9821a != null) {
                        this.f9821a.addView(c0664a);
                    }
                }
            }
            ccdVar3.mo10666a(this.f9823d, this.f9826g, (Map<String, WeakReference<View>>) null, this, this);
            C1596gv.f10711a.post(new ccp(this, ccdVar3));
            m10715a(this.f9823d);
            this.f9828i.mo10677a(this.f9823d);
            if ((this.f9828i instanceof ccd) && (ccdVar = (ccd) this.f9828i) != null && ccdVar.mo10686i() != null && C0710au.m5590z().m11240c(this.f9823d.getContext())) {
                bua buaVar2 = this.f9832m.get();
                if (buaVar2 == null) {
                    buaVar2 = new bua(this.f9823d.getContext(), this.f9823d);
                    this.f9832m = new WeakReference<>(buaVar2);
                }
                buaVar2.m10262a(ccdVar.m10706j());
            }
        }
    }

    @Override // com.google.android.gms.internal.cdc
    /* JADX INFO: renamed from: a */
    public final void mo10725a(InterfaceC0652a interfaceC0652a, int i) {
        bua buaVar;
        if (C0710au.m5590z().m11240c(this.f9823d.getContext()) && this.f9832m != null && (buaVar = this.f9832m.get()) != null) {
            buaVar.m10261a();
        }
        m10720b();
    }

    @Override // com.google.android.gms.internal.cdc
    /* JADX INFO: renamed from: a */
    public final void mo10726a(String str, InterfaceC0652a interfaceC0652a) {
        View view = (View) BinderC0654c.m5330a(interfaceC0652a);
        synchronized (this.f9822c) {
            if (this.f9826g == null) {
                return;
            }
            if (view == null) {
                this.f9826g.remove(str);
            } else {
                this.f9826g.put(str, new WeakReference<>(view));
                if ("1098".equals(str)) {
                    return;
                }
                view.setOnTouchListener(this);
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        synchronized (this.f9822c) {
            if (this.f9828i == null) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("x", m10713a(this.f9830k.x));
            bundle.putFloat("y", m10713a(this.f9830k.y));
            bundle.putFloat("start_x", m10713a(this.f9831l.x));
            bundle.putFloat("start_y", m10713a(this.f9831l.y));
            if (this.f9827h == null || !this.f9827h.equals(view)) {
                this.f9828i.mo10665a(view, this.f9826g, bundle, this.f9823d);
            } else if (!(this.f9828i instanceof cby)) {
                this.f9828i.mo10679a(view, "1007", bundle, this.f9826g, this.f9823d);
            } else if (((cby) this.f9828i).m10672d() != null) {
                ((cby) this.f9828i).m10672d().mo10679a(view, "1007", bundle, this.f9826g, this.f9823d);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        synchronized (this.f9822c) {
            m10720b();
            if (this.f9828i != null) {
                this.f9828i.mo10684c(this.f9823d, this.f9826g);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        synchronized (this.f9822c) {
            if (this.f9828i != null) {
                this.f9828i.mo10684c(this.f9823d, this.f9826g);
            }
            m10720b();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.f9822c) {
            if (this.f9828i != null) {
                this.f9823d.getLocationOnScreen(new int[2]);
                Point point = new Point((int) (motionEvent.getRawX() - r0[0]), (int) (motionEvent.getRawY() - r0[1]));
                this.f9830k = point;
                if (motionEvent.getAction() == 0) {
                    this.f9831l = point;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.setLocation(point.x, point.y);
                this.f9828i.mo10676a(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        return false;
    }
}
