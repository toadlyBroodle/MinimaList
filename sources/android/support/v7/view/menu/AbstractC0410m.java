package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: android.support.v7.view.menu.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0410m implements InterfaceC0412o, InterfaceC0416s, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    private Rect f2589a;

    AbstractC0410m() {
    }

    /* JADX INFO: renamed from: a */
    protected static int m3318a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        int i4 = 0;
        ViewGroup viewGroup2 = viewGroup;
        while (i2 < count) {
            int itemViewType = listAdapter.getItemViewType(i2);
            if (itemViewType != i3) {
                i3 = itemViewType;
                view = null;
            }
            ViewGroup frameLayout = viewGroup2 == null ? new FrameLayout(context) : viewGroup2;
            view = listAdapter.getView(i2, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth <= i4) {
                measuredWidth = i4;
            }
            i2++;
            i4 = measuredWidth;
            viewGroup2 = frameLayout;
        }
        return i4;
    }

    /* JADX INFO: renamed from: a */
    protected static C0404g m3319a(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0404g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0404g) listAdapter;
    }

    /* JADX INFO: renamed from: b */
    protected static boolean m3320b(C0405h c0405h) {
        int size = c0405h.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0405h.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3204a(int i);

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo165a(Context context, C0405h c0405h) {
    }

    /* JADX INFO: renamed from: a */
    public void m3321a(Rect rect) {
        this.f2589a = rect;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3205a(C0405h c0405h);

    /* JADX INFO: renamed from: a */
    public abstract void mo3206a(View view);

    /* JADX INFO: renamed from: a */
    public abstract void mo3207a(PopupWindow.OnDismissListener onDismissListener);

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public boolean mo176a(C0405h c0405h, C0407j c0407j) {
        return false;
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: b */
    public int mo178b() {
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo3208b(int i);

    /* JADX INFO: renamed from: b */
    public abstract void mo3209b(boolean z);

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: b */
    public boolean mo182b(C0405h c0405h, C0407j c0407j) {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo3210c(int i);

    /* JADX INFO: renamed from: c */
    public abstract void mo3211c(boolean z);

    /* JADX INFO: renamed from: h */
    protected boolean mo3216h() {
        return true;
    }

    /* JADX INFO: renamed from: i */
    public Rect m3322i() {
        return this.f2589a;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m3319a(listAdapter).f2510b.m3257a((MenuItem) listAdapter.getItem(i), this, mo3216h() ? 0 : 4);
    }
}
