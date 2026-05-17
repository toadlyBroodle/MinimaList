package com.google.android.gms.internal;

import android.graphics.Point;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class ccr extends cdj implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: a */
    static final String[] f9837a = {"2011", "1009"};

    /* JADX INFO: renamed from: c */
    private final WeakReference<View> f9839c;

    /* JADX INFO: renamed from: g */
    private cbz f9843g;

    /* JADX INFO: renamed from: h */
    private View f9844h;

    /* JADX INFO: renamed from: b */
    private final Object f9838b = new Object();

    /* JADX INFO: renamed from: d */
    private final Map<String, WeakReference<View>> f9840d = new HashMap();

    /* JADX INFO: renamed from: e */
    private final Map<String, WeakReference<View>> f9841e = new HashMap();

    /* JADX INFO: renamed from: f */
    private final Map<String, WeakReference<View>> f9842f = new HashMap();

    /* JADX INFO: renamed from: i */
    private Point f9845i = new Point();

    /* JADX INFO: renamed from: j */
    private Point f9846j = new Point();

    /* JADX INFO: renamed from: k */
    private WeakReference<bua> f9847k = new WeakReference<>(null);

    public ccr(View view, HashMap<String, View> map, HashMap<String, View> map2) {
        C0710au.m5589y();
        C1708kz.m11663a(view, (ViewTreeObserver.OnGlobalLayoutListener) this);
        C0710au.m5589y();
        C1708kz.m11664a(view, (ViewTreeObserver.OnScrollChangedListener) this);
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        this.f9839c = new WeakReference<>(view);
        m10731a(map);
        this.f9842f.putAll(this.f9840d);
        m10734b(map2);
        this.f9842f.putAll(this.f9841e);
        can.m10549a(view.getContext());
    }

    /* JADX INFO: renamed from: a */
    private final int m10727a(int i) {
        int iM11570b;
        synchronized (this.f9838b) {
            bxm.m10404a();
            iM11570b = C1657jb.m11570b(this.f9843g.mo10686i(), i);
        }
        return iM11570b;
    }

    /* JADX INFO: renamed from: a */
    private final void m10728a(View view) {
        synchronized (this.f9838b) {
            if (this.f9843g != null) {
                cbz cbzVarM10672d = this.f9843g instanceof cby ? ((cby) this.f9843g).m10672d() : this.f9843g;
                if (cbzVarM10672d != null) {
                    cbzVarM10672d.mo10682b(view);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m10729a(ccd ccdVar) {
        View view;
        synchronized (this.f9838b) {
            String[] strArr = f9837a;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    view = null;
                    break;
                }
                WeakReference<View> weakReference = this.f9842f.get(strArr[i]);
                if (weakReference != null) {
                    view = weakReference.get();
                    break;
                }
                i++;
            }
            if (!(view instanceof FrameLayout)) {
                ccdVar.mo10675g();
                return;
            }
            cct cctVar = new cct(this, view);
            if (ccdVar instanceof cby) {
                ccdVar.m10705b(view, cctVar);
            } else {
                ccdVar.mo10678a(view, cctVar);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m10731a(Map<String, View> map) {
        for (Map.Entry<String, View> entry : map.entrySet()) {
            String key = entry.getKey();
            View value = entry.getValue();
            if (value != null) {
                this.f9840d.put(key, new WeakReference<>(value));
                if (!"1098".equals(key)) {
                    value.setOnTouchListener(this);
                    value.setClickable(true);
                    value.setOnClickListener(this);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final boolean m10733a(String[] strArr) {
        for (String str : strArr) {
            if (this.f9840d.get(str) != null) {
                return true;
            }
        }
        for (String str2 : strArr) {
            if (this.f9841e.get(str2) != null) {
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private final void m10734b(Map<String, View> map) {
        for (Map.Entry<String, View> entry : map.entrySet()) {
            View value = entry.getValue();
            if (value != null) {
                this.f9841e.put(entry.getKey(), new WeakReference<>(value));
                value.setOnTouchListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.cdh
    /* JADX INFO: renamed from: a */
    public final void mo10735a() {
        synchronized (this.f9838b) {
            this.f9844h = null;
            this.f9843g = null;
            this.f9845i = null;
            this.f9846j = null;
        }
    }

    @Override // com.google.android.gms.internal.cdh
    /* JADX INFO: renamed from: a */
    public final void mo10736a(InterfaceC0652a interfaceC0652a) {
        synchronized (this.f9838b) {
            m10728a((View) null);
            Object objM5330a = BinderC0654c.m5330a(interfaceC0652a);
            if (!(objM5330a instanceof ccd)) {
                C1560fm.m11615e("Not an instance of native engine. This is most likely a transient error");
                return;
            }
            ccd ccdVar = (ccd) objM5330a;
            if (!ccdVar.mo10670b()) {
                C1560fm.m11612c("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                return;
            }
            View view = this.f9839c.get();
            if (this.f9843g != null && view != null) {
                if (((Boolean) bxm.m10409f().m10546a(can.f9493bM)).booleanValue()) {
                    this.f9843g.mo10669b(view, this.f9842f);
                }
            }
            synchronized (this.f9838b) {
                if (this.f9843g instanceof ccd) {
                    ccd ccdVar2 = (ccd) this.f9843g;
                    View view2 = this.f9839c.get();
                    if (ccdVar2 != null && ccdVar2.mo10686i() != null && view2 != null && C0710au.m5590z().m11240c(view2.getContext())) {
                        C1531ek c1531ekM10706j = ccdVar2.m10706j();
                        if (c1531ekM10706j != null) {
                            c1531ekM10706j.m11222a(false);
                        }
                        bua buaVar = this.f9847k.get();
                        if (buaVar != null && c1531ekM10706j != null) {
                            buaVar.m10263b(c1531ekM10706j);
                        }
                    }
                }
            }
            if ((this.f9843g instanceof cby) && ((cby) this.f9843g).m10671c()) {
                ((cby) this.f9843g).m10667a(ccdVar);
            } else {
                this.f9843g = ccdVar;
                if (ccdVar instanceof cby) {
                    ((cby) ccdVar).m10667a((cbz) null);
                }
            }
            WeakReference<View> weakReference = this.f9842f.get("1098");
            if (weakReference == null) {
                C1560fm.m11615e("Ad choices asset view is not provided.");
            } else {
                View view3 = weakReference.get();
                ViewGroup viewGroup = view3 instanceof ViewGroup ? (ViewGroup) view3 : null;
                if (viewGroup != null) {
                    this.f9844h = ccdVar.mo10663a((View.OnClickListener) this, true);
                    if (this.f9844h != null) {
                        this.f9842f.put("1007", new WeakReference<>(this.f9844h));
                        this.f9840d.put("1007", new WeakReference<>(this.f9844h));
                        viewGroup.removeAllViews();
                        viewGroup.addView(this.f9844h);
                    }
                }
            }
            ccdVar.mo10666a(view, this.f9840d, this.f9841e, this, this);
            C1596gv.f10711a.post(new ccs(this, ccdVar));
            m10728a(view);
            this.f9843g.mo10677a(view);
            synchronized (this.f9838b) {
                if (this.f9843g instanceof ccd) {
                    ccd ccdVar3 = (ccd) this.f9843g;
                    View view4 = this.f9839c.get();
                    if (ccdVar3 != null && ccdVar3.mo10686i() != null && view4 != null && C0710au.m5590z().m11240c(view4.getContext())) {
                        bua buaVar2 = this.f9847k.get();
                        if (buaVar2 == null) {
                            buaVar2 = new bua(view4.getContext(), view4);
                            this.f9847k = new WeakReference<>(buaVar2);
                        }
                        buaVar2.m10262a(ccdVar3.m10706j());
                    }
                }
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        synchronized (this.f9838b) {
            if (this.f9843g == null) {
                return;
            }
            View view2 = this.f9839c.get();
            if (view2 == null) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("x", m10727a(this.f9845i.x));
            bundle.putFloat("y", m10727a(this.f9845i.y));
            bundle.putFloat("start_x", m10727a(this.f9846j.x));
            bundle.putFloat("start_y", m10727a(this.f9846j.y));
            if (this.f9844h == null || !this.f9844h.equals(view)) {
                this.f9843g.mo10665a(view, this.f9842f, bundle, view2);
            } else if (!(this.f9843g instanceof cby)) {
                this.f9843g.mo10679a(view, "1007", bundle, this.f9842f, view2);
            } else if (((cby) this.f9843g).m10672d() != null) {
                ((cby) this.f9843g).m10672d().mo10679a(view, "1007", bundle, this.f9842f, view2);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view;
        synchronized (this.f9838b) {
            if (this.f9843g != null && (view = this.f9839c.get()) != null) {
                this.f9843g.mo10684c(view, this.f9842f);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        View view;
        synchronized (this.f9838b) {
            if (this.f9843g != null && (view = this.f9839c.get()) != null) {
                this.f9843g.mo10684c(view, this.f9842f);
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.f9838b) {
            if (this.f9843g != null) {
                View view2 = this.f9839c.get();
                if (view2 != null) {
                    view2.getLocationOnScreen(new int[2]);
                    Point point = new Point((int) (motionEvent.getRawX() - r2[0]), (int) (motionEvent.getRawY() - r2[1]));
                    this.f9845i = point;
                    if (motionEvent.getAction() == 0) {
                        this.f9846j = point;
                    }
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setLocation(point.x, point.y);
                    this.f9843g.mo10676a(motionEventObtain);
                    motionEventObtain.recycle();
                }
            }
        }
        return false;
    }
}
