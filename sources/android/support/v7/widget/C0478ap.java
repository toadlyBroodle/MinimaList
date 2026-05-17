package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.p019j.C0246q;
import android.support.v4.widget.C0327k;
import android.support.v7.p022a.C0333a;
import android.support.v7.view.menu.InterfaceC0416s;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: android.support.v7.widget.ap */
/* JADX INFO: loaded from: classes.dex */
public class C0478ap implements InterfaceC0416s {

    /* JADX INFO: renamed from: a */
    private static Method f3135a;

    /* JADX INFO: renamed from: b */
    private static Method f3136b;

    /* JADX INFO: renamed from: h */
    private static Method f3137h;

    /* JADX INFO: renamed from: A */
    private Drawable f3138A;

    /* JADX INFO: renamed from: B */
    private AdapterView.OnItemClickListener f3139B;

    /* JADX INFO: renamed from: C */
    private AdapterView.OnItemSelectedListener f3140C;

    /* JADX INFO: renamed from: D */
    private final d f3141D;

    /* JADX INFO: renamed from: E */
    private final c f3142E;

    /* JADX INFO: renamed from: F */
    private final a f3143F;

    /* JADX INFO: renamed from: G */
    private Runnable f3144G;

    /* JADX INFO: renamed from: H */
    private final Rect f3145H;

    /* JADX INFO: renamed from: I */
    private Rect f3146I;

    /* JADX INFO: renamed from: J */
    private boolean f3147J;

    /* JADX INFO: renamed from: c */
    C0471ai f3148c;

    /* JADX INFO: renamed from: d */
    int f3149d;

    /* JADX INFO: renamed from: e */
    final e f3150e;

    /* JADX INFO: renamed from: f */
    final Handler f3151f;

    /* JADX INFO: renamed from: g */
    PopupWindow f3152g;

    /* JADX INFO: renamed from: i */
    private Context f3153i;

    /* JADX INFO: renamed from: j */
    private ListAdapter f3154j;

    /* JADX INFO: renamed from: k */
    private int f3155k;

    /* JADX INFO: renamed from: l */
    private int f3156l;

    /* JADX INFO: renamed from: m */
    private int f3157m;

    /* JADX INFO: renamed from: n */
    private int f3158n;

    /* JADX INFO: renamed from: o */
    private int f3159o;

    /* JADX INFO: renamed from: p */
    private boolean f3160p;

    /* JADX INFO: renamed from: q */
    private boolean f3161q;

    /* JADX INFO: renamed from: r */
    private boolean f3162r;

    /* JADX INFO: renamed from: s */
    private boolean f3163s;

    /* JADX INFO: renamed from: t */
    private int f3164t;

    /* JADX INFO: renamed from: u */
    private boolean f3165u;

    /* JADX INFO: renamed from: v */
    private boolean f3166v;

    /* JADX INFO: renamed from: w */
    private View f3167w;

    /* JADX INFO: renamed from: x */
    private int f3168x;

    /* JADX INFO: renamed from: y */
    private DataSetObserver f3169y;

    /* JADX INFO: renamed from: z */
    private View f3170z;

    /* JADX INFO: renamed from: android.support.v7.widget.ap$a */
    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0478ap.this.m3976m();
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.ap$b */
    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (C0478ap.this.mo3214f()) {
                C0478ap.this.mo3212d();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C0478ap.this.mo3213e();
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.ap$c */
    private class c implements AbsListView.OnScrollListener {
        c() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || C0478ap.this.m3977n() || C0478ap.this.f3152g.getContentView() == null) {
                return;
            }
            C0478ap.this.f3151f.removeCallbacks(C0478ap.this.f3150e);
            C0478ap.this.f3150e.run();
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.ap$d */
    private class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && C0478ap.this.f3152g != null && C0478ap.this.f3152g.isShowing() && x >= 0 && x < C0478ap.this.f3152g.getWidth() && y >= 0 && y < C0478ap.this.f3152g.getHeight()) {
                C0478ap.this.f3151f.postDelayed(C0478ap.this.f3150e, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            C0478ap.this.f3151f.removeCallbacks(C0478ap.this.f3150e);
            return false;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.ap$e */
    private class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0478ap.this.f3148c == null || !C0246q.m1780z(C0478ap.this.f3148c) || C0478ap.this.f3148c.getCount() <= C0478ap.this.f3148c.getChildCount() || C0478ap.this.f3148c.getChildCount() > C0478ap.this.f3149d) {
                return;
            }
            C0478ap.this.f3152g.setInputMethodMode(2);
            C0478ap.this.mo3212d();
        }
    }

    static {
        try {
            f3135a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException e2) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            f3136b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
        } catch (NoSuchMethodException e3) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            f3137h = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
        } catch (NoSuchMethodException e4) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public C0478ap(Context context) {
        this(context, null, C0333a.a.listPopupWindowStyle);
    }

    public C0478ap(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C0478ap(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f3155k = -2;
        this.f3156l = -2;
        this.f3159o = 1002;
        this.f3161q = true;
        this.f3164t = 0;
        this.f3165u = false;
        this.f3166v = false;
        this.f3149d = Integer.MAX_VALUE;
        this.f3168x = 0;
        this.f3150e = new e();
        this.f3141D = new d();
        this.f3142E = new c();
        this.f3143F = new a();
        this.f3145H = new Rect();
        this.f3153i = context;
        this.f3151f = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0333a.j.ListPopupWindow, i, i2);
        this.f3157m = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C0333a.j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f3158n = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C0333a.j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f3158n != 0) {
            this.f3160p = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f3152g = new C0523s(context, attributeSet, i, i2);
        this.f3152g.setInputMethodMode(1);
    }

    /* JADX INFO: renamed from: a */
    private int m3948a(View view, int i, boolean z) {
        if (f3136b != null) {
            try {
                return ((Integer) f3136b.invoke(this.f3152g, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
            } catch (Exception e2) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f3152g.getMaxAvailableHeight(view, i);
    }

    /* JADX INFO: renamed from: a */
    private void m3949a() {
        if (this.f3167w != null) {
            ViewParent parent = this.f3167w.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f3167w);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private int m3950b() {
        int measuredHeight;
        int i;
        int iMakeMeasureSpec;
        View view;
        int measuredHeight2;
        int i2;
        int i3;
        if (this.f3148c == null) {
            Context context = this.f3153i;
            this.f3144G = new Runnable() { // from class: android.support.v7.widget.ap.1
                @Override // java.lang.Runnable
                public void run() {
                    View viewM3971i = C0478ap.this.m3971i();
                    if (viewM3971i == null || viewM3971i.getWindowToken() == null) {
                        return;
                    }
                    C0478ap.this.mo3212d();
                }
            };
            this.f3148c = mo3952a(context, !this.f3147J);
            if (this.f3138A != null) {
                this.f3148c.setSelector(this.f3138A);
            }
            this.f3148c.setAdapter(this.f3154j);
            this.f3148c.setOnItemClickListener(this.f3139B);
            this.f3148c.setFocusable(true);
            this.f3148c.setFocusableInTouchMode(true);
            this.f3148c.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: android.support.v7.widget.ap.2
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(AdapterView<?> adapterView, View view2, int i4, long j) {
                    C0471ai c0471ai;
                    if (i4 == -1 || (c0471ai = C0478ap.this.f3148c) == null) {
                        return;
                    }
                    c0471ai.setListSelectionHidden(false);
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
            this.f3148c.setOnScrollListener(this.f3142E);
            if (this.f3140C != null) {
                this.f3148c.setOnItemSelectedListener(this.f3140C);
            }
            C0471ai c0471ai = this.f3148c;
            View view2 = this.f3167w;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                switch (this.f3168x) {
                    case 0:
                        linearLayout.addView(view2);
                        linearLayout.addView(c0471ai, layoutParams);
                        break;
                    case 1:
                        linearLayout.addView(c0471ai, layoutParams);
                        linearLayout.addView(view2);
                        break;
                    default:
                        Log.e("ListPopupWindow", "Invalid hint position " + this.f3168x);
                        break;
                }
                if (this.f3156l >= 0) {
                    i3 = this.f3156l;
                    i2 = Integer.MIN_VALUE;
                } else {
                    i2 = 0;
                    i3 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i3, i2), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight2 = layoutParams2.bottomMargin + view2.getMeasuredHeight() + layoutParams2.topMargin;
                view = linearLayout;
            } else {
                view = c0471ai;
                measuredHeight2 = 0;
            }
            this.f3152g.setContentView(view);
            measuredHeight = measuredHeight2;
        } else {
            View view3 = this.f3167w;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = layoutParams3.bottomMargin + view3.getMeasuredHeight() + layoutParams3.topMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.f3152g.getBackground();
        if (background != null) {
            background.getPadding(this.f3145H);
            int i4 = this.f3145H.top + this.f3145H.bottom;
            if (this.f3160p) {
                i = i4;
            } else {
                this.f3158n = -this.f3145H.top;
                i = i4;
            }
        } else {
            this.f3145H.setEmpty();
            i = 0;
        }
        int iM3948a = m3948a(m3971i(), this.f3158n, this.f3152g.getInputMethodMode() == 2);
        if (this.f3165u || this.f3155k == -1) {
            return iM3948a + i;
        }
        switch (this.f3156l) {
            case -2:
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f3153i.getResources().getDisplayMetrics().widthPixels - (this.f3145H.left + this.f3145H.right), Integer.MIN_VALUE);
                break;
            case -1:
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f3153i.getResources().getDisplayMetrics().widthPixels - (this.f3145H.left + this.f3145H.right), 1073741824);
                break;
            default:
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f3156l, 1073741824);
                break;
        }
        int iA = this.f3148c.m3978a(iMakeMeasureSpec, 0, -1, iM3948a - measuredHeight, -1);
        if (iA > 0) {
            measuredHeight += this.f3148c.getPaddingTop() + this.f3148c.getPaddingBottom() + i;
        }
        return iA + measuredHeight;
    }

    /* JADX INFO: renamed from: c */
    private void m3951c(boolean z) {
        if (f3135a != null) {
            try {
                f3135a.invoke(this.f3152g, Boolean.valueOf(z));
            } catch (Exception e2) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    C0471ai mo3952a(Context context, boolean z) {
        return new C0471ai(context, z);
    }

    /* JADX INFO: renamed from: a */
    public void m3953a(int i) {
        this.f3168x = i;
    }

    /* JADX INFO: renamed from: a */
    public void m3954a(Rect rect) {
        this.f3146I = rect;
    }

    /* JADX INFO: renamed from: a */
    public void m3955a(Drawable drawable) {
        this.f3152g.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: a */
    public void m3956a(AdapterView.OnItemClickListener onItemClickListener) {
        this.f3139B = onItemClickListener;
    }

    /* JADX INFO: renamed from: a */
    public void mo3957a(ListAdapter listAdapter) {
        if (this.f3169y == null) {
            this.f3169y = new b();
        } else if (this.f3154j != null) {
            this.f3154j.unregisterDataSetObserver(this.f3169y);
        }
        this.f3154j = listAdapter;
        if (this.f3154j != null) {
            listAdapter.registerDataSetObserver(this.f3169y);
        }
        if (this.f3148c != null) {
            this.f3148c.setAdapter(this.f3154j);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3958a(PopupWindow.OnDismissListener onDismissListener) {
        this.f3152g.setOnDismissListener(onDismissListener);
    }

    /* JADX INFO: renamed from: a */
    public void m3959a(boolean z) {
        this.f3147J = z;
        this.f3152g.setFocusable(z);
    }

    /* JADX INFO: renamed from: b */
    public void m3960b(int i) {
        this.f3152g.setAnimationStyle(i);
    }

    /* JADX INFO: renamed from: b */
    public void m3961b(View view) {
        this.f3170z = view;
    }

    /* JADX INFO: renamed from: b */
    public void m3962b(boolean z) {
        this.f3163s = true;
        this.f3162r = z;
    }

    /* JADX INFO: renamed from: c */
    public void m3963c(int i) {
        this.f3157m = i;
    }

    /* JADX INFO: renamed from: c */
    public boolean m3964c() {
        return this.f3147J;
    }

    @Override // android.support.v7.view.menu.InterfaceC0416s
    /* JADX INFO: renamed from: d */
    public void mo3212d() {
        int i;
        boolean z = false;
        int iM3950b = m3950b();
        boolean zM3977n = m3977n();
        C0327k.m2461a(this.f3152g, this.f3159o);
        if (!this.f3152g.isShowing()) {
            int width = this.f3156l == -1 ? -1 : this.f3156l == -2 ? m3971i().getWidth() : this.f3156l;
            if (this.f3155k == -1) {
                iM3950b = -1;
            } else if (this.f3155k != -2) {
                iM3950b = this.f3155k;
            }
            this.f3152g.setWidth(width);
            this.f3152g.setHeight(iM3950b);
            m3951c(true);
            this.f3152g.setOutsideTouchable((this.f3166v || this.f3165u) ? false : true);
            this.f3152g.setTouchInterceptor(this.f3141D);
            if (this.f3163s) {
                C0327k.m2463a(this.f3152g, this.f3162r);
            }
            if (f3137h != null) {
                try {
                    f3137h.invoke(this.f3152g, this.f3146I);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
            C0327k.m2462a(this.f3152g, m3971i(), this.f3157m, this.f3158n, this.f3164t);
            this.f3148c.setSelection(-1);
            if (!this.f3147J || this.f3148c.isInTouchMode()) {
                m3976m();
            }
            if (this.f3147J) {
                return;
            }
            this.f3151f.post(this.f3143F);
            return;
        }
        if (C0246q.m1780z(m3971i())) {
            int width2 = this.f3156l == -1 ? -1 : this.f3156l == -2 ? m3971i().getWidth() : this.f3156l;
            if (this.f3155k == -1) {
                if (!zM3977n) {
                    iM3950b = -1;
                }
                if (zM3977n) {
                    this.f3152g.setWidth(this.f3156l == -1 ? -1 : 0);
                    this.f3152g.setHeight(0);
                    i = iM3950b;
                } else {
                    this.f3152g.setWidth(this.f3156l == -1 ? -1 : 0);
                    this.f3152g.setHeight(-1);
                    i = iM3950b;
                }
            } else {
                i = this.f3155k == -2 ? iM3950b : this.f3155k;
            }
            PopupWindow popupWindow = this.f3152g;
            if (!this.f3166v && !this.f3165u) {
                z = true;
            }
            popupWindow.setOutsideTouchable(z);
            PopupWindow popupWindow2 = this.f3152g;
            View viewM3971i = m3971i();
            int i2 = this.f3157m;
            int i3 = this.f3158n;
            if (width2 < 0) {
                width2 = -1;
            }
            popupWindow2.update(viewM3971i, i2, i3, width2, i >= 0 ? i : -1);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m3965d(int i) {
        this.f3158n = i;
        this.f3160p = true;
    }

    @Override // android.support.v7.view.menu.InterfaceC0416s
    /* JADX INFO: renamed from: e */
    public void mo3213e() {
        this.f3152g.dismiss();
        m3949a();
        this.f3152g.setContentView(null);
        this.f3148c = null;
        this.f3151f.removeCallbacks(this.f3150e);
    }

    /* JADX INFO: renamed from: e */
    public void m3966e(int i) {
        this.f3164t = i;
    }

    /* JADX INFO: renamed from: f */
    public void m3967f(int i) {
        this.f3156l = i;
    }

    @Override // android.support.v7.view.menu.InterfaceC0416s
    /* JADX INFO: renamed from: f */
    public boolean mo3214f() {
        return this.f3152g.isShowing();
    }

    @Override // android.support.v7.view.menu.InterfaceC0416s
    /* JADX INFO: renamed from: g */
    public ListView mo3215g() {
        return this.f3148c;
    }

    /* JADX INFO: renamed from: g */
    public void m3968g(int i) {
        Drawable background = this.f3152g.getBackground();
        if (background == null) {
            m3967f(i);
        } else {
            background.getPadding(this.f3145H);
            this.f3156l = this.f3145H.left + this.f3145H.right + i;
        }
    }

    /* JADX INFO: renamed from: h */
    public Drawable m3969h() {
        return this.f3152g.getBackground();
    }

    /* JADX INFO: renamed from: h */
    public void m3970h(int i) {
        this.f3152g.setInputMethodMode(i);
    }

    /* JADX INFO: renamed from: i */
    public View m3971i() {
        return this.f3170z;
    }

    /* JADX INFO: renamed from: i */
    public void m3972i(int i) {
        C0471ai c0471ai = this.f3148c;
        if (!mo3214f() || c0471ai == null) {
            return;
        }
        c0471ai.setListSelectionHidden(false);
        c0471ai.setSelection(i);
        if (c0471ai.getChoiceMode() != 0) {
            c0471ai.setItemChecked(i, true);
        }
    }

    /* JADX INFO: renamed from: j */
    public int m3973j() {
        return this.f3157m;
    }

    /* JADX INFO: renamed from: k */
    public int m3974k() {
        if (this.f3160p) {
            return this.f3158n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public int m3975l() {
        return this.f3156l;
    }

    /* JADX INFO: renamed from: m */
    public void m3976m() {
        C0471ai c0471ai = this.f3148c;
        if (c0471ai != null) {
            c0471ai.setListSelectionHidden(true);
            c0471ai.requestLayout();
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m3977n() {
        return this.f3152g.getInputMethodMode() == 2;
    }
}
