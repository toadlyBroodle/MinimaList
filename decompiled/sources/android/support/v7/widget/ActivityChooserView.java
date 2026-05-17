package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.p019j.AbstractC0232c;
import android.support.v7.p022a.C0333a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    final C0431a f2701a;

    /* JADX INFO: renamed from: b */
    final FrameLayout f2702b;

    /* JADX INFO: renamed from: c */
    final FrameLayout f2703c;

    /* JADX INFO: renamed from: d */
    AbstractC0232c f2704d;

    /* JADX INFO: renamed from: e */
    final DataSetObserver f2705e;

    /* JADX INFO: renamed from: f */
    PopupWindow.OnDismissListener f2706f;

    /* JADX INFO: renamed from: g */
    boolean f2707g;

    /* JADX INFO: renamed from: h */
    int f2708h;

    /* JADX INFO: renamed from: i */
    private final ViewOnClickListenerC0432b f2709i;

    /* JADX INFO: renamed from: j */
    private final C0477ao f2710j;

    /* JADX INFO: renamed from: k */
    private final ImageView f2711k;

    /* JADX INFO: renamed from: l */
    private final int f2712l;

    /* JADX INFO: renamed from: m */
    private final ViewTreeObserver.OnGlobalLayoutListener f2713m;

    /* JADX INFO: renamed from: n */
    private C0478ap f2714n;

    /* JADX INFO: renamed from: o */
    private boolean f2715o;

    /* JADX INFO: renamed from: p */
    private int f2716p;

    public static class InnerLayout extends C0477ao {

        /* JADX INFO: renamed from: a */
        private static final int[] f2717a = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C0498bi c0498biM4509a = C0498bi.m4509a(context, attributeSet, f2717a);
            setBackgroundDrawable(c0498biM4509a.m4514a(0));
            c0498biM4509a.m4515a();
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.ActivityChooserView$a */
    private class C0431a extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ActivityChooserView f2718a;

        /* JADX INFO: renamed from: b */
        private C0509e f2719b;

        /* JADX INFO: renamed from: c */
        private int f2720c;

        /* JADX INFO: renamed from: d */
        private boolean f2721d;

        /* JADX INFO: renamed from: e */
        private boolean f2722e;

        /* JADX INFO: renamed from: f */
        private boolean f2723f;

        /* JADX INFO: renamed from: a */
        public int m3400a() {
            int i = this.f2720c;
            this.f2720c = Integer.MAX_VALUE;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int iMax = 0;
            for (int i2 = 0; i2 < count; i2++) {
                view = getView(i2, view, null);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                iMax = Math.max(iMax, view.getMeasuredWidth());
            }
            this.f2720c = i;
            return iMax;
        }

        /* JADX INFO: renamed from: a */
        public void m3401a(int i) {
            if (this.f2720c != i) {
                this.f2720c = i;
                notifyDataSetChanged();
            }
        }

        /* JADX INFO: renamed from: a */
        public void m3402a(C0509e c0509e) {
            C0509e c0509eM3407d = this.f2718a.f2701a.m3407d();
            if (c0509eM3407d != null && this.f2718a.isShown()) {
                c0509eM3407d.unregisterObserver(this.f2718a.f2705e);
            }
            this.f2719b = c0509e;
            if (c0509e != null && this.f2718a.isShown()) {
                c0509e.registerObserver(this.f2718a.f2705e);
            }
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: a */
        public void m3403a(boolean z) {
            if (this.f2723f != z) {
                this.f2723f = z;
                notifyDataSetChanged();
            }
        }

        /* JADX INFO: renamed from: a */
        public void m3404a(boolean z, boolean z2) {
            if (this.f2721d == z && this.f2722e == z2) {
                return;
            }
            this.f2721d = z;
            this.f2722e = z2;
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: b */
        public ResolveInfo m3405b() {
            return this.f2719b.m4617b();
        }

        /* JADX INFO: renamed from: c */
        public int m3406c() {
            return this.f2719b.m4613a();
        }

        /* JADX INFO: renamed from: d */
        public C0509e m3407d() {
            return this.f2719b;
        }

        /* JADX INFO: renamed from: e */
        public boolean m3408e() {
            return this.f2721d;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int iM4613a = this.f2719b.m4613a();
            if (!this.f2721d && this.f2719b.m4617b() != null) {
                iM4613a--;
            }
            int iMin = Math.min(iM4613a, this.f2720c);
            return this.f2723f ? iMin + 1 : iMin;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            switch (getItemViewType(i)) {
                case 0:
                    if (!this.f2721d && this.f2719b.m4617b() != null) {
                        i++;
                    }
                    return this.f2719b.m4615a(i);
                case 1:
                    return null;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            return (this.f2723f && i == getCount() + (-1)) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            switch (getItemViewType(i)) {
                case 0:
                    if (view == null || view.getId() != C0333a.f.list_item) {
                        view = LayoutInflater.from(this.f2718a.getContext()).inflate(C0333a.g.abc_activity_chooser_view_list_item, viewGroup, false);
                    }
                    PackageManager packageManager = this.f2718a.getContext().getPackageManager();
                    ImageView imageView = (ImageView) view.findViewById(C0333a.f.icon);
                    ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                    imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
                    ((TextView) view.findViewById(C0333a.f.title)).setText(resolveInfo.loadLabel(packageManager));
                    if (this.f2721d && i == 0 && this.f2722e) {
                        view.setActivated(true);
                        return view;
                    }
                    view.setActivated(false);
                    return view;
                case 1:
                    if (view != null && view.getId() == 1) {
                        return view;
                    }
                    View viewInflate = LayoutInflater.from(this.f2718a.getContext()).inflate(C0333a.g.abc_activity_chooser_view_list_item, viewGroup, false);
                    viewInflate.setId(1);
                    ((TextView) viewInflate.findViewById(C0333a.f.title)).setText(this.f2718a.getContext().getString(C0333a.h.abc_activity_chooser_view_see_all));
                    return viewInflate;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.ActivityChooserView$b */
    private class ViewOnClickListenerC0432b implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ActivityChooserView f2724a;

        /* JADX INFO: renamed from: a */
        private void m3409a() {
            if (this.f2724a.f2706f != null) {
                this.f2724a.f2706f.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view != this.f2724a.f2703c) {
                if (view != this.f2724a.f2702b) {
                    throw new IllegalArgumentException();
                }
                this.f2724a.f2707g = false;
                this.f2724a.m3396a(this.f2724a.f2708h);
                return;
            }
            this.f2724a.m3398b();
            Intent intentM4616b = this.f2724a.f2701a.m3407d().m4616b(this.f2724a.f2701a.m3407d().m4614a(this.f2724a.f2701a.m3405b()));
            if (intentM4616b != null) {
                intentM4616b.addFlags(524288);
                this.f2724a.getContext().startActivity(intentM4616b);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            m3409a();
            if (this.f2724a.f2704d != null) {
                this.f2724a.f2704d.m1684a(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            switch (((C0431a) adapterView.getAdapter()).getItemViewType(i)) {
                case 0:
                    this.f2724a.m3398b();
                    if (this.f2724a.f2707g) {
                        if (i > 0) {
                            this.f2724a.f2701a.m3407d().m4618c(i);
                            return;
                        }
                        return;
                    }
                    if (!this.f2724a.f2701a.m3408e()) {
                        i++;
                    }
                    Intent intentM4616b = this.f2724a.f2701a.m3407d().m4616b(i);
                    if (intentM4616b != null) {
                        intentM4616b.addFlags(524288);
                        this.f2724a.getContext().startActivity(intentM4616b);
                        return;
                    }
                    return;
                case 1:
                    this.f2724a.m3396a(Integer.MAX_VALUE);
                    return;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (view != this.f2724a.f2703c) {
                throw new IllegalArgumentException();
            }
            if (this.f2724a.f2701a.getCount() > 0) {
                this.f2724a.f2707g = true;
                this.f2724a.m3396a(this.f2724a.f2708h);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    void m3396a(int i) {
        if (this.f2701a.m3407d() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f2713m);
        boolean z = this.f2703c.getVisibility() == 0;
        int iM3406c = this.f2701a.m3406c();
        int i2 = z ? 1 : 0;
        if (i == Integer.MAX_VALUE || iM3406c <= i2 + i) {
            this.f2701a.m3403a(false);
            this.f2701a.m3401a(i);
        } else {
            this.f2701a.m3403a(true);
            this.f2701a.m3401a(i - 1);
        }
        C0478ap listPopupWindow = getListPopupWindow();
        if (listPopupWindow.mo3214f()) {
            return;
        }
        if (this.f2707g || !z) {
            this.f2701a.m3404a(true, z);
        } else {
            this.f2701a.m3404a(false, false);
        }
        listPopupWindow.m3968g(Math.min(this.f2701a.m3400a(), this.f2712l));
        listPopupWindow.mo3212d();
        if (this.f2704d != null) {
            this.f2704d.m1684a(true);
        }
        listPopupWindow.mo3215g().setContentDescription(getContext().getString(C0333a.h.abc_activitychooserview_choose_application));
        listPopupWindow.mo3215g().setSelector(new ColorDrawable(0));
    }

    /* JADX INFO: renamed from: a */
    public boolean m3397a() {
        if (m3399c() || !this.f2715o) {
            return false;
        }
        this.f2707g = false;
        m3396a(this.f2708h);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public boolean m3398b() {
        if (!m3399c()) {
            return true;
        }
        getListPopupWindow().mo3213e();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f2713m);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public boolean m3399c() {
        return getListPopupWindow().mo3214f();
    }

    public C0509e getDataModel() {
        return this.f2701a.m3407d();
    }

    C0478ap getListPopupWindow() {
        if (this.f2714n == null) {
            this.f2714n = new C0478ap(getContext());
            this.f2714n.mo3957a(this.f2701a);
            this.f2714n.m3961b(this);
            this.f2714n.m3959a(true);
            this.f2714n.m3956a((AdapterView.OnItemClickListener) this.f2709i);
            this.f2714n.m3958a((PopupWindow.OnDismissListener) this.f2709i);
        }
        return this.f2714n;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0509e c0509eM3407d = this.f2701a.m3407d();
        if (c0509eM3407d != null) {
            c0509eM3407d.registerObserver(this.f2705e);
        }
        this.f2715o = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0509e c0509eM3407d = this.f2701a.m3407d();
        if (c0509eM3407d != null) {
            c0509eM3407d.unregisterObserver(this.f2705e);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2713m);
        }
        if (m3399c()) {
            m3398b();
        }
        this.f2715o = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f2710j.layout(0, 0, i3 - i, i4 - i2);
        if (m3399c()) {
            return;
        }
        m3398b();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        C0477ao c0477ao = this.f2710j;
        if (this.f2703c.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(c0477ao, i, i2);
        setMeasuredDimension(c0477ao.getMeasuredWidth(), c0477ao.getMeasuredHeight());
    }

    public void setActivityChooserModel(C0509e c0509e) {
        this.f2701a.m3402a(c0509e);
        if (m3399c()) {
            m3398b();
            m3397a();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f2716p = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f2711k.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f2711k.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.f2708h = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f2706f = onDismissListener;
    }

    public void setProvider(AbstractC0232c abstractC0232c) {
        this.f2704d = abstractC0232c;
    }
}
