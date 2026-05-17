package android.support.v4.widget;

import android.widget.ListView;

/* JADX INFO: renamed from: android.support.v4.widget.i */
/* JADX INFO: loaded from: classes.dex */
public class C0325i extends AbstractViewOnTouchListenerC0317a {

    /* JADX INFO: renamed from: f */
    private final ListView f1733f;

    public C0325i(ListView listView) {
        super(listView);
        this.f1733f = listView;
    }

    @Override // android.support.v4.widget.AbstractViewOnTouchListenerC0317a
    /* JADX INFO: renamed from: a */
    public void mo2347a(int i, int i2) {
        C0326j.m2460a(this.f1733f, i2);
    }

    @Override // android.support.v4.widget.AbstractViewOnTouchListenerC0317a
    /* JADX INFO: renamed from: e */
    public boolean mo2357e(int i) {
        return false;
    }

    @Override // android.support.v4.widget.AbstractViewOnTouchListenerC0317a
    /* JADX INFO: renamed from: f */
    public boolean mo2358f(int i) {
        ListView listView = this.f1733f;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }
}
