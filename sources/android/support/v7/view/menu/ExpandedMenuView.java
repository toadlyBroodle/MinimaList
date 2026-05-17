package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.support.v7.view.menu.C0405h;
import android.support.v7.widget.C0498bi;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C0405h.b, InterfaceC0413p, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    private static final int[] f2407a = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: b */
    private C0405h f2408b;

    /* JADX INFO: renamed from: c */
    private int f2409c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0498bi c0498biM4510a = C0498bi.m4510a(context, attributeSet, f2407a, i, 0);
        if (c0498biM4510a.m4528g(0)) {
            setBackgroundDrawable(c0498biM4510a.m4514a(0));
        }
        if (c0498biM4510a.m4528g(1)) {
            setDivider(c0498biM4510a.m4514a(1));
        }
        c0498biM4510a.m4515a();
    }

    @Override // android.support.v7.view.menu.InterfaceC0413p
    /* JADX INFO: renamed from: a */
    public void mo158a(C0405h c0405h) {
        this.f2408b = c0405h;
    }

    @Override // android.support.v7.view.menu.C0405h.b
    /* JADX INFO: renamed from: a */
    public boolean mo3171a(C0407j c0407j) {
        return this.f2408b.m3256a(c0407j, 0);
    }

    public int getWindowAnimations() {
        return this.f2409c;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo3171a((C0407j) getAdapter().getItem(i));
    }
}
