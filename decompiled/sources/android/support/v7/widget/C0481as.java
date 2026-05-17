package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.support.v7.view.menu.C0404g;
import android.support.v7.view.menu.C0405h;
import android.support.v7.view.menu.C0407j;
import android.support.v7.view.menu.ListMenuItemView;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: android.support.v7.widget.as */
/* JADX INFO: loaded from: classes.dex */
public class C0481as extends C0478ap implements InterfaceC0480ar {

    /* JADX INFO: renamed from: a */
    private static Method f3188a;

    /* JADX INFO: renamed from: b */
    private InterfaceC0480ar f3189b;

    /* JADX INFO: renamed from: android.support.v7.widget.as$a */
    public static class a extends C0471ai {

        /* JADX INFO: renamed from: g */
        final int f3190g;

        /* JADX INFO: renamed from: h */
        final int f3191h;

        /* JADX INFO: renamed from: i */
        private InterfaceC0480ar f3192i;

        /* JADX INFO: renamed from: j */
        private MenuItem f3193j;

        public a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f3190g = 22;
                this.f3191h = 21;
            } else {
                this.f3190g = 21;
                this.f3191h = 22;
            }
        }

        @Override // android.support.v7.widget.C0471ai
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo3871a(MotionEvent motionEvent, int i) {
            return super.mo3871a(motionEvent, i);
        }

        @Override // android.support.v7.widget.C0471ai, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // android.support.v7.widget.C0471ai, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // android.support.v7.widget.C0471ai, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // android.support.v7.widget.C0471ai, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int headersCount;
            C0404g c0404g;
            int iPointToPosition;
            int i;
            if (this.f3192i != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c0404g = (C0404g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    headersCount = 0;
                    c0404g = (C0404g) adapter;
                }
                C0407j item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c0404g.getCount()) ? null : c0404g.getItem(i);
                MenuItem menuItem = this.f3193j;
                if (menuItem != item) {
                    C0405h c0405hM3226a = c0404g.m3226a();
                    if (menuItem != null) {
                        this.f3192i.mo3217a(c0405hM3226a, menuItem);
                    }
                    this.f3193j = item;
                    if (item != null) {
                        this.f3192i.mo3218b(c0405hM3226a, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f3190g) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.f3191h) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ((C0404g) getAdapter()).m3226a().m3262b(false);
            return true;
        }

        public void setHoverListener(InterfaceC0480ar interfaceC0480ar) {
            this.f3192i = interfaceC0480ar;
        }
    }

    static {
        try {
            f3188a = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException e) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0481as(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // android.support.v7.widget.C0478ap
    /* JADX INFO: renamed from: a */
    C0471ai mo3952a(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    @Override // android.support.v7.widget.InterfaceC0480ar
    /* JADX INFO: renamed from: a */
    public void mo3217a(C0405h c0405h, MenuItem menuItem) {
        if (this.f3189b != null) {
            this.f3189b.mo3217a(c0405h, menuItem);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3986a(InterfaceC0480ar interfaceC0480ar) {
        this.f3189b = interfaceC0480ar;
    }

    /* JADX INFO: renamed from: a */
    public void m3987a(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f3152g.setEnterTransition((Transition) obj);
        }
    }

    @Override // android.support.v7.widget.InterfaceC0480ar
    /* JADX INFO: renamed from: b */
    public void mo3218b(C0405h c0405h, MenuItem menuItem) {
        if (this.f3189b != null) {
            this.f3189b.mo3218b(c0405h, menuItem);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3988b(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f3152g.setExitTransition((Transition) obj);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m3989c(boolean z) {
        if (f3188a != null) {
            try {
                f3188a.invoke(this.f3152g, Boolean.valueOf(z));
            } catch (Exception e) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }
}
