package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AbstractC0344a;
import android.support.v7.p022a.C0333a;
import android.support.v7.view.C0387a;
import android.support.v7.widget.C0477ao;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

/* JADX INFO: renamed from: android.support.v7.widget.ba */
/* JADX INFO: loaded from: classes.dex */
public class C0490ba extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: j */
    private static final Interpolator f3412j = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a */
    Runnable f3413a;

    /* JADX INFO: renamed from: b */
    C0477ao f3414b;

    /* JADX INFO: renamed from: c */
    int f3415c;

    /* JADX INFO: renamed from: d */
    int f3416d;

    /* JADX INFO: renamed from: e */
    private b f3417e;

    /* JADX INFO: renamed from: f */
    private Spinner f3418f;

    /* JADX INFO: renamed from: g */
    private boolean f3419g;

    /* JADX INFO: renamed from: h */
    private int f3420h;

    /* JADX INFO: renamed from: i */
    private int f3421i;

    /* JADX INFO: renamed from: android.support.v7.widget.ba$a */
    private class a extends BaseAdapter {
        a() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return C0490ba.this.f3414b.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((c) C0490ba.this.f3414b.getChildAt(i)).m4463b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0490ba.this.m4459a((AbstractC0344a.c) getItem(i), true);
            }
            ((c) view).m4462a((AbstractC0344a.c) getItem(i));
            return view;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.ba$b */
    private class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((c) view).m4463b().m2570d();
            int childCount = C0490ba.this.f3414b.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0490ba.this.f3414b.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.ba$c */
    private class c extends C0477ao {

        /* JADX INFO: renamed from: b */
        private final int[] f3427b;

        /* JADX INFO: renamed from: c */
        private AbstractC0344a.c f3428c;

        /* JADX INFO: renamed from: d */
        private TextView f3429d;

        /* JADX INFO: renamed from: e */
        private ImageView f3430e;

        /* JADX INFO: renamed from: f */
        private View f3431f;

        public c(Context context, AbstractC0344a.c cVar, boolean z) {
            super(context, null, C0333a.a.actionBarTabStyle);
            this.f3427b = new int[]{R.attr.background};
            this.f3428c = cVar;
            C0498bi c0498biM4510a = C0498bi.m4510a(context, null, this.f3427b, C0333a.a.actionBarTabStyle, 0);
            if (c0498biM4510a.m4528g(0)) {
                setBackgroundDrawable(c0498biM4510a.m4514a(0));
            }
            c0498biM4510a.m4515a();
            if (z) {
                setGravity(8388627);
            }
            m4461a();
        }

        /* JADX INFO: renamed from: a */
        public void m4461a() {
            AbstractC0344a.c cVar = this.f3428c;
            View viewM2569c = cVar.m2569c();
            if (viewM2569c != null) {
                ViewParent parent = viewM2569c.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewM2569c);
                    }
                    addView(viewM2569c);
                }
                this.f3431f = viewM2569c;
                if (this.f3429d != null) {
                    this.f3429d.setVisibility(8);
                }
                if (this.f3430e != null) {
                    this.f3430e.setVisibility(8);
                    this.f3430e.setImageDrawable(null);
                    return;
                }
                return;
            }
            if (this.f3431f != null) {
                removeView(this.f3431f);
                this.f3431f = null;
            }
            Drawable drawableM2567a = cVar.m2567a();
            CharSequence charSequenceM2568b = cVar.m2568b();
            if (drawableM2567a != null) {
                if (this.f3430e == null) {
                    C0521q c0521q = new C0521q(getContext());
                    C0477ao.a aVar = new C0477ao.a(-2, -2);
                    aVar.f3134h = 16;
                    c0521q.setLayoutParams(aVar);
                    addView(c0521q, 0);
                    this.f3430e = c0521q;
                }
                this.f3430e.setImageDrawable(drawableM2567a);
                this.f3430e.setVisibility(0);
            } else if (this.f3430e != null) {
                this.f3430e.setVisibility(8);
                this.f3430e.setImageDrawable(null);
            }
            boolean z = !TextUtils.isEmpty(charSequenceM2568b);
            if (z) {
                if (this.f3429d == null) {
                    C0464ab c0464ab = new C0464ab(getContext(), null, C0333a.a.actionBarTabTextStyle);
                    c0464ab.setEllipsize(TextUtils.TruncateAt.END);
                    C0477ao.a aVar2 = new C0477ao.a(-2, -2);
                    aVar2.f3134h = 16;
                    c0464ab.setLayoutParams(aVar2);
                    addView(c0464ab);
                    this.f3429d = c0464ab;
                }
                this.f3429d.setText(charSequenceM2568b);
                this.f3429d.setVisibility(0);
            } else if (this.f3429d != null) {
                this.f3429d.setVisibility(8);
                this.f3429d.setText((CharSequence) null);
            }
            if (this.f3430e != null) {
                this.f3430e.setContentDescription(cVar.m2571e());
            }
            C0500bk.m4540a(this, z ? null : cVar.m2571e());
        }

        /* JADX INFO: renamed from: a */
        public void m4462a(AbstractC0344a.c cVar) {
            this.f3428c = cVar;
            m4461a();
        }

        /* JADX INFO: renamed from: b */
        public AbstractC0344a.c m4463b() {
            return this.f3428c;
        }

        @Override // android.support.v7.widget.C0477ao, android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(AbstractC0344a.c.class.getName());
        }

        @Override // android.support.v7.widget.C0477ao, android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(AbstractC0344a.c.class.getName());
        }

        @Override // android.support.v7.widget.C0477ao, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C0490ba.this.f3415c <= 0 || getMeasuredWidth() <= C0490ba.this.f3415c) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(C0490ba.this.f3415c, 1073741824), i2);
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m4455a() {
        return this.f3418f != null && this.f3418f.getParent() == this;
    }

    /* JADX INFO: renamed from: b */
    private void m4456b() {
        if (m4455a()) {
            return;
        }
        if (this.f3418f == null) {
            this.f3418f = m4458d();
        }
        removeView(this.f3414b);
        addView(this.f3418f, new ViewGroup.LayoutParams(-2, -1));
        if (this.f3418f.getAdapter() == null) {
            this.f3418f.setAdapter((SpinnerAdapter) new a());
        }
        if (this.f3413a != null) {
            removeCallbacks(this.f3413a);
            this.f3413a = null;
        }
        this.f3418f.setSelection(this.f3421i);
    }

    /* JADX INFO: renamed from: c */
    private boolean m4457c() {
        if (m4455a()) {
            removeView(this.f3418f);
            addView(this.f3414b, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.f3418f.getSelectedItemPosition());
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    private Spinner m4458d() {
        C0529y c0529y = new C0529y(getContext(), null, C0333a.a.actionDropDownStyle);
        c0529y.setLayoutParams(new C0477ao.a(-2, -1));
        c0529y.setOnItemSelectedListener(this);
        return c0529y;
    }

    /* JADX INFO: renamed from: a */
    c m4459a(AbstractC0344a.c cVar, boolean z) {
        c cVar2 = new c(getContext(), cVar, z);
        if (z) {
            cVar2.setBackgroundDrawable(null);
            cVar2.setLayoutParams(new AbsListView.LayoutParams(-1, this.f3420h));
        } else {
            cVar2.setFocusable(true);
            if (this.f3417e == null) {
                this.f3417e = new b();
            }
            cVar2.setOnClickListener(this.f3417e);
        }
        return cVar2;
    }

    /* JADX INFO: renamed from: a */
    public void m4460a(int i) {
        final View childAt = this.f3414b.getChildAt(i);
        if (this.f3413a != null) {
            removeCallbacks(this.f3413a);
        }
        this.f3413a = new Runnable() { // from class: android.support.v7.widget.ba.1
            @Override // java.lang.Runnable
            public void run() {
                C0490ba.this.smoothScrollTo(childAt.getLeft() - ((C0490ba.this.getWidth() - childAt.getWidth()) / 2), 0);
                C0490ba.this.f3413a = null;
            }
        };
        post(this.f3413a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3413a != null) {
            post(this.f3413a);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0387a c0387aM3123a = C0387a.m3123a(getContext());
        setContentHeight(c0387aM3123a.m3128e());
        this.f3416d = c0387aM3123a.m3130g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f3413a != null) {
            removeCallbacks(this.f3413a);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((c) view).m4463b().m2570d();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f3414b.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f3415c = -1;
        } else {
            if (childCount > 2) {
                this.f3415c = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f3415c = View.MeasureSpec.getSize(i) / 2;
            }
            this.f3415c = Math.min(this.f3415c, this.f3416d);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f3420h, 1073741824);
        if (!z && this.f3419g) {
            this.f3414b.measure(0, iMakeMeasureSpec);
            if (this.f3414b.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m4456b();
            } else {
                m4457c();
            }
        } else {
            m4457c();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f3421i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f3419g = z;
    }

    public void setContentHeight(int i) {
        this.f3420h = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f3421i = i;
        int childCount = this.f3414b.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f3414b.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                m4460a(i);
            }
            i2++;
        }
        if (this.f3418f == null || i < 0) {
            return;
        }
        this.f3418f.setSelection(i);
    }
}
