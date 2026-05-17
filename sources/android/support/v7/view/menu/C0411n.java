package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.support.v4.p019j.C0233d;
import android.support.v4.p019j.C0246q;
import android.support.v7.p022a.C0333a;
import android.support.v7.view.menu.InterfaceC0412o;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: android.support.v7.view.menu.n */
/* JADX INFO: loaded from: classes.dex */
public class C0411n {

    /* JADX INFO: renamed from: a */
    private final Context f2590a;

    /* JADX INFO: renamed from: b */
    private final C0405h f2591b;

    /* JADX INFO: renamed from: c */
    private final boolean f2592c;

    /* JADX INFO: renamed from: d */
    private final int f2593d;

    /* JADX INFO: renamed from: e */
    private final int f2594e;

    /* JADX INFO: renamed from: f */
    private View f2595f;

    /* JADX INFO: renamed from: g */
    private int f2596g;

    /* JADX INFO: renamed from: h */
    private boolean f2597h;

    /* JADX INFO: renamed from: i */
    private InterfaceC0412o.a f2598i;

    /* JADX INFO: renamed from: j */
    private AbstractC0410m f2599j;

    /* JADX INFO: renamed from: k */
    private PopupWindow.OnDismissListener f2600k;

    /* JADX INFO: renamed from: l */
    private final PopupWindow.OnDismissListener f2601l;

    public C0411n(Context context, C0405h c0405h, View view, boolean z, int i) {
        this(context, c0405h, view, z, i, 0);
    }

    public C0411n(Context context, C0405h c0405h, View view, boolean z, int i, int i2) {
        this.f2596g = 8388611;
        this.f2601l = new PopupWindow.OnDismissListener() { // from class: android.support.v7.view.menu.n.1
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                C0411n.this.mo3335e();
            }
        };
        this.f2590a = context;
        this.f2591b = c0405h;
        this.f2595f = view;
        this.f2592c = z;
        this.f2593d = i;
        this.f2594e = i2;
    }

    /* JADX INFO: renamed from: a */
    private void m3323a(int i, int i2, boolean z, boolean z2) {
        AbstractC0410m abstractC0410mM3332b = m3332b();
        abstractC0410mM3332b.mo3211c(z2);
        if (z) {
            if ((C0233d.m1692a(this.f2596g, C0246q.m1759e(this.f2595f)) & 7) == 5) {
                i += this.f2595f.getWidth();
            }
            abstractC0410mM3332b.mo3208b(i);
            abstractC0410mM3332b.mo3210c(i2);
            int i3 = (int) ((this.f2590a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC0410mM3332b.m3321a(new Rect(i - i3, i2 - i3, i + i3, i3 + i2));
        }
        abstractC0410mM3332b.mo3212d();
    }

    /* JADX INFO: renamed from: g */
    private AbstractC0410m m3324g() {
        Display defaultDisplay = ((WindowManager) this.f2590a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        AbstractC0410m viewOnKeyListenerC0402e = Math.min(point.x, point.y) >= this.f2590a.getResources().getDimensionPixelSize(C0333a.d.abc_cascading_menus_min_smallest_width) ? new ViewOnKeyListenerC0402e(this.f2590a, this.f2595f, this.f2593d, this.f2594e, this.f2592c) : new ViewOnKeyListenerC0417t(this.f2590a, this.f2591b, this.f2595f, this.f2593d, this.f2594e, this.f2592c);
        viewOnKeyListenerC0402e.mo3205a(this.f2591b);
        viewOnKeyListenerC0402e.mo3207a(this.f2601l);
        viewOnKeyListenerC0402e.mo3206a(this.f2595f);
        viewOnKeyListenerC0402e.mo172a(this.f2598i);
        viewOnKeyListenerC0402e.mo3209b(this.f2597h);
        viewOnKeyListenerC0402e.mo3204a(this.f2596g);
        return viewOnKeyListenerC0402e;
    }

    /* JADX INFO: renamed from: a */
    public void m3325a() {
        if (!m3333c()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3326a(int i) {
        this.f2596g = i;
    }

    /* JADX INFO: renamed from: a */
    public void m3327a(InterfaceC0412o.a aVar) {
        this.f2598i = aVar;
        if (this.f2599j != null) {
            this.f2599j.mo172a(aVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3328a(View view) {
        this.f2595f = view;
    }

    /* JADX INFO: renamed from: a */
    public void m3329a(PopupWindow.OnDismissListener onDismissListener) {
        this.f2600k = onDismissListener;
    }

    /* JADX INFO: renamed from: a */
    public void m3330a(boolean z) {
        this.f2597h = z;
        if (this.f2599j != null) {
            this.f2599j.mo3209b(z);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m3331a(int i, int i2) {
        if (m3336f()) {
            return true;
        }
        if (this.f2595f == null) {
            return false;
        }
        m3323a(i, i2, true, true);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public AbstractC0410m m3332b() {
        if (this.f2599j == null) {
            this.f2599j = m3324g();
        }
        return this.f2599j;
    }

    /* JADX INFO: renamed from: c */
    public boolean m3333c() {
        if (m3336f()) {
            return true;
        }
        if (this.f2595f == null) {
            return false;
        }
        m3323a(0, 0, false, false);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public void m3334d() {
        if (m3336f()) {
            this.f2599j.mo3213e();
        }
    }

    /* JADX INFO: renamed from: e */
    protected void mo3335e() {
        this.f2599j = null;
        if (this.f2600k != null) {
            this.f2600k.onDismiss();
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m3336f() {
        return this.f2599j != null && this.f2599j.mo3214f();
    }
}
