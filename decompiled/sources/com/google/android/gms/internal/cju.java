package com.google.android.gms.internal;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.common.util.C1301e;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cju extends ckf {

    /* JADX INFO: renamed from: a */
    private static Set<String> f10193a = C1301e.m7259a("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");

    /* JADX INFO: renamed from: b */
    private String f10194b;

    /* JADX INFO: renamed from: c */
    private boolean f10195c;

    /* JADX INFO: renamed from: d */
    private int f10196d;

    /* JADX INFO: renamed from: e */
    private int f10197e;

    /* JADX INFO: renamed from: f */
    private int f10198f;

    /* JADX INFO: renamed from: g */
    private int f10199g;

    /* JADX INFO: renamed from: h */
    private int f10200h;

    /* JADX INFO: renamed from: i */
    private int f10201i;

    /* JADX INFO: renamed from: j */
    private final Object f10202j;

    /* JADX INFO: renamed from: k */
    private final InterfaceC1758mv f10203k;

    /* JADX INFO: renamed from: l */
    private final Activity f10204l;

    /* JADX INFO: renamed from: m */
    private C1807oq f10205m;

    /* JADX INFO: renamed from: n */
    private ImageView f10206n;

    /* JADX INFO: renamed from: o */
    private LinearLayout f10207o;

    /* JADX INFO: renamed from: p */
    private ckg f10208p;

    /* JADX INFO: renamed from: q */
    private PopupWindow f10209q;

    /* JADX INFO: renamed from: r */
    private RelativeLayout f10210r;

    /* JADX INFO: renamed from: s */
    private ViewGroup f10211s;

    public cju(InterfaceC1758mv interfaceC1758mv, ckg ckgVar) {
        super(interfaceC1758mv, "resize");
        this.f10194b = "top-right";
        this.f10195c = true;
        this.f10196d = 0;
        this.f10197e = 0;
        this.f10198f = -1;
        this.f10199g = 0;
        this.f10200h = 0;
        this.f10201i = -1;
        this.f10202j = new Object();
        this.f10203k = interfaceC1758mv;
        this.f10204l = interfaceC1758mv.mo11755d();
        this.f10208p = ckgVar;
    }

    /* JADX INFO: renamed from: b */
    private final void m11036b(int i, int i2) {
        m11059a(i, i2 - C0710au.m5569e().m11452c(this.f10204l)[0], this.f10201i, this.f10198f);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0131  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int[] m11037b() {
        boolean z;
        int i;
        int i2;
        int[] iArrM11450b = C0710au.m5569e().m11450b(this.f10204l);
        int[] iArrM11452c = C0710au.m5569e().m11452c(this.f10204l);
        int i3 = iArrM11450b[0];
        int i4 = iArrM11450b[1];
        if (this.f10201i < 50 || this.f10201i > i3) {
            C1560fm.m11615e("Width is too small or too large.");
            z = false;
        } else if (this.f10198f < 50 || this.f10198f > i4) {
            C1560fm.m11615e("Height is too small or too large.");
            z = false;
        } else if (this.f10198f == i4 && this.f10201i == i3) {
            C1560fm.m11615e("Cannot resize to a full-screen ad.");
            z = false;
        } else if (this.f10195c) {
            switch (this.f10194b) {
                case "top-left":
                    i = this.f10199g + this.f10196d;
                    i2 = this.f10197e + this.f10200h;
                    break;
                case "top-center":
                    i = ((this.f10196d + this.f10199g) + (this.f10201i / 2)) - 25;
                    i2 = this.f10197e + this.f10200h;
                    break;
                case "center":
                    i = ((this.f10196d + this.f10199g) + (this.f10201i / 2)) - 25;
                    i2 = ((this.f10197e + this.f10200h) + (this.f10198f / 2)) - 25;
                    break;
                case "bottom-left":
                    i = this.f10199g + this.f10196d;
                    i2 = ((this.f10197e + this.f10200h) + this.f10198f) - 50;
                    break;
                case "bottom-center":
                    i = ((this.f10196d + this.f10199g) + (this.f10201i / 2)) - 25;
                    i2 = ((this.f10197e + this.f10200h) + this.f10198f) - 50;
                    break;
                case "bottom-right":
                    i = ((this.f10196d + this.f10199g) + this.f10201i) - 50;
                    i2 = ((this.f10197e + this.f10200h) + this.f10198f) - 50;
                    break;
                default:
                    i = ((this.f10196d + this.f10199g) + this.f10201i) - 50;
                    i2 = this.f10197e + this.f10200h;
                    break;
            }
            z = i >= 0 && i + 50 <= i3 && i2 >= iArrM11452c[0] && i2 + 50 <= iArrM11452c[1];
        }
        if (!z) {
            return null;
        }
        if (this.f10195c) {
            return new int[]{this.f10196d + this.f10199g, this.f10197e + this.f10200h};
        }
        int[] iArrM11450b2 = C0710au.m5569e().m11450b(this.f10204l);
        int[] iArrM11452c2 = C0710au.m5569e().m11452c(this.f10204l);
        int i5 = iArrM11450b2[0];
        int i6 = this.f10196d + this.f10199g;
        int i7 = this.f10197e + this.f10200h;
        if (i6 < 0) {
            i6 = 0;
        } else if (this.f10201i + i6 > i5) {
            i6 = i5 - this.f10201i;
        }
        if (i7 < iArrM11452c2[0]) {
            i7 = iArrM11452c2[0];
        } else if (this.f10198f + i7 > iArrM11452c2[1]) {
            i7 = iArrM11452c2[1] - this.f10198f;
        }
        return new int[]{i6, i7};
    }

    /* JADX INFO: renamed from: a */
    public final void m11038a(int i, int i2) {
        this.f10196d = i;
        this.f10197e = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m11039a(int i, int i2, boolean z) {
        synchronized (this.f10202j) {
            this.f10196d = i;
            this.f10197e = i2;
            if (this.f10209q != null && z) {
                int[] iArrM11037b = m11037b();
                if (iArrM11037b != null) {
                    PopupWindow popupWindow = this.f10209q;
                    bxm.m10404a();
                    int iM11560a = C1657jb.m11560a(this.f10204l, iArrM11037b[0]);
                    bxm.m10404a();
                    popupWindow.update(iM11560a, C1657jb.m11560a(this.f10204l, iArrM11037b[1]), this.f10209q.getWidth(), this.f10209q.getHeight());
                    m11036b(iArrM11037b[0], iArrM11037b[1]);
                } else {
                    m11041a(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11040a(Map<String, String> map) {
        RelativeLayout.LayoutParams layoutParams;
        synchronized (this.f10202j) {
            if (this.f10204l == null) {
                m11061a("Not an activity context. Cannot resize.");
                return;
            }
            if (this.f10203k.mo11831u() == null) {
                m11061a("Webview is not yet available, size is not set.");
                return;
            }
            if (this.f10203k.mo11831u().m11930d()) {
                m11061a("Is interstitial. Cannot resize an interstitial.");
                return;
            }
            if (this.f10203k.mo11836z()) {
                m11061a("Cannot resize an expanded banner.");
                return;
            }
            if (!TextUtils.isEmpty(map.get("width"))) {
                C0710au.m5569e();
                this.f10201i = C1596gv.m11405b(map.get("width"));
            }
            if (!TextUtils.isEmpty(map.get("height"))) {
                C0710au.m5569e();
                this.f10198f = C1596gv.m11405b(map.get("height"));
            }
            if (!TextUtils.isEmpty(map.get("offsetX"))) {
                C0710au.m5569e();
                this.f10199g = C1596gv.m11405b(map.get("offsetX"));
            }
            if (!TextUtils.isEmpty(map.get("offsetY"))) {
                C0710au.m5569e();
                this.f10200h = C1596gv.m11405b(map.get("offsetY"));
            }
            if (!TextUtils.isEmpty(map.get("allowOffscreen"))) {
                this.f10195c = Boolean.parseBoolean(map.get("allowOffscreen"));
            }
            String str = map.get("customClosePosition");
            if (!TextUtils.isEmpty(str)) {
                this.f10194b = str;
            }
            if (!(this.f10201i >= 0 && this.f10198f >= 0)) {
                m11061a("Invalid width and height options. Cannot resize.");
                return;
            }
            Window window = this.f10204l.getWindow();
            if (window == null || window.getDecorView() == null) {
                m11061a("Activity context is not ready, cannot get window or decor view.");
                return;
            }
            int[] iArrM11037b = m11037b();
            if (iArrM11037b == null) {
                m11061a("Resize location out of screen or close button is not visible.");
                return;
            }
            bxm.m10404a();
            int iM11560a = C1657jb.m11560a(this.f10204l, this.f10201i);
            bxm.m10404a();
            int iM11560a2 = C1657jb.m11560a(this.f10204l, this.f10198f);
            Object obj = this.f10203k;
            if (obj == null) {
                throw null;
            }
            ViewParent parent = ((View) obj).getParent();
            if (parent == null || !(parent instanceof ViewGroup)) {
                m11061a("Webview is detached, probably in the middle of a resize or expand.");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            Object obj2 = this.f10203k;
            if (obj2 == null) {
                throw null;
            }
            viewGroup.removeView((View) obj2);
            if (this.f10209q == null) {
                this.f10211s = (ViewGroup) parent;
                C0710au.m5569e();
                Object obj3 = this.f10203k;
                if (obj3 == null) {
                    throw null;
                }
                Bitmap bitmapM11373a = C1596gv.m11373a((View) obj3);
                this.f10206n = new ImageView(this.f10204l);
                this.f10206n.setImageBitmap(bitmapM11373a);
                this.f10205m = this.f10203k.mo11831u();
                this.f10211s.addView(this.f10206n);
            } else {
                this.f10209q.dismiss();
            }
            this.f10210r = new RelativeLayout(this.f10204l);
            this.f10210r.setBackgroundColor(0);
            this.f10210r.setLayoutParams(new ViewGroup.LayoutParams(iM11560a, iM11560a2));
            C0710au.m5569e();
            this.f10209q = C1596gv.m11377a((View) this.f10210r, iM11560a, iM11560a2, false);
            this.f10209q.setOutsideTouchable(true);
            this.f10209q.setTouchable(true);
            this.f10209q.setClippingEnabled(!this.f10195c);
            RelativeLayout relativeLayout = this.f10210r;
            Object obj4 = this.f10203k;
            if (obj4 == null) {
                throw null;
            }
            relativeLayout.addView((View) obj4, -1, -1);
            this.f10207o = new LinearLayout(this.f10204l);
            bxm.m10404a();
            int iM11560a3 = C1657jb.m11560a(this.f10204l, 50);
            bxm.m10404a();
            layoutParams = new RelativeLayout.LayoutParams(iM11560a3, C1657jb.m11560a(this.f10204l, 50));
            switch (this.f10194b) {
                case "top-left":
                    layoutParams.addRule(10);
                    layoutParams.addRule(9);
                    break;
                case "top-center":
                    layoutParams.addRule(10);
                    layoutParams.addRule(14);
                    break;
                case "center":
                    layoutParams.addRule(13);
                    break;
                case "bottom-left":
                    layoutParams.addRule(12);
                    layoutParams.addRule(9);
                    break;
                case "bottom-center":
                    layoutParams.addRule(12);
                    layoutParams.addRule(14);
                    break;
                case "bottom-right":
                    layoutParams.addRule(12);
                    layoutParams.addRule(11);
                    break;
                default:
                    layoutParams.addRule(10);
                    layoutParams.addRule(11);
                    break;
            }
            this.f10207o.setOnClickListener(new cjv(this));
            this.f10207o.setContentDescription("Close button");
            this.f10210r.addView(this.f10207o, layoutParams);
            try {
                PopupWindow popupWindow = this.f10209q;
                View decorView = window.getDecorView();
                bxm.m10404a();
                int iM11560a4 = C1657jb.m11560a(this.f10204l, iArrM11037b[0]);
                bxm.m10404a();
                popupWindow.showAtLocation(decorView, 0, iM11560a4, C1657jb.m11560a(this.f10204l, iArrM11037b[1]));
                int i = iArrM11037b[0];
                int i2 = iArrM11037b[1];
                if (this.f10208p != null) {
                    this.f10208p.mo5626a(i, i2, this.f10201i, this.f10198f);
                }
                this.f10203k.mo11813a(C1807oq.m11926a(iM11560a, iM11560a2));
                m11036b(iArrM11037b[0], iArrM11037b[1]);
                m11064c("resized");
            } catch (RuntimeException e) {
                String strValueOf = String.valueOf(e.getMessage());
                m11061a(strValueOf.length() != 0 ? "Cannot show popup window: ".concat(strValueOf) : new String("Cannot show popup window: "));
                RelativeLayout relativeLayout2 = this.f10210r;
                Object obj5 = this.f10203k;
                if (obj5 == null) {
                    throw null;
                }
                relativeLayout2.removeView((View) obj5);
                if (this.f10211s != null) {
                    this.f10211s.removeView(this.f10206n);
                    ViewGroup viewGroup2 = this.f10211s;
                    Object obj6 = this.f10203k;
                    if (obj6 == null) {
                        throw null;
                    }
                    viewGroup2.addView((View) obj6);
                    this.f10203k.mo11813a(this.f10205m);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11041a(boolean z) {
        synchronized (this.f10202j) {
            if (this.f10209q != null) {
                this.f10209q.dismiss();
                RelativeLayout relativeLayout = this.f10210r;
                Object obj = this.f10203k;
                if (obj == null) {
                    throw null;
                }
                relativeLayout.removeView((View) obj);
                if (this.f10211s != null) {
                    this.f10211s.removeView(this.f10206n);
                    ViewGroup viewGroup = this.f10211s;
                    Object obj2 = this.f10203k;
                    if (obj2 == null) {
                        throw null;
                    }
                    viewGroup.addView((View) obj2);
                    this.f10203k.mo11813a(this.f10205m);
                }
                if (z) {
                    m11064c("default");
                    if (this.f10208p != null) {
                        this.f10208p.mo5624G();
                    }
                }
                this.f10209q = null;
                this.f10210r = null;
                this.f10211s = null;
                this.f10207o = null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11042a() {
        boolean z;
        synchronized (this.f10202j) {
            z = this.f10209q != null;
        }
        return z;
    }
}
