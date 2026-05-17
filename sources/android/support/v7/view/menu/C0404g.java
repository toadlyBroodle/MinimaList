package android.support.v7.view.menu;

import android.support.v7.p022a.C0333a;
import android.support.v7.view.menu.InterfaceC0413p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: renamed from: android.support.v7.view.menu.g */
/* JADX INFO: loaded from: classes.dex */
public class C0404g extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    static final int f2509a = C0333a.g.abc_popup_menu_item_layout;

    /* JADX INFO: renamed from: b */
    C0405h f2510b;

    /* JADX INFO: renamed from: c */
    private int f2511c = -1;

    /* JADX INFO: renamed from: d */
    private boolean f2512d;

    /* JADX INFO: renamed from: e */
    private final boolean f2513e;

    /* JADX INFO: renamed from: f */
    private final LayoutInflater f2514f;

    public C0404g(C0405h c0405h, LayoutInflater layoutInflater, boolean z) {
        this.f2513e = z;
        this.f2514f = layoutInflater;
        this.f2510b = c0405h;
        m3229b();
    }

    /* JADX INFO: renamed from: a */
    public C0405h m3226a() {
        return this.f2510b;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0407j getItem(int i) {
        ArrayList<C0407j> arrayListM3281l = this.f2513e ? this.f2510b.m3281l() : this.f2510b.m3278i();
        if (this.f2511c >= 0 && i >= this.f2511c) {
            i++;
        }
        return arrayListM3281l.get(i);
    }

    /* JADX INFO: renamed from: a */
    public void m3228a(boolean z) {
        this.f2512d = z;
    }

    /* JADX INFO: renamed from: b */
    void m3229b() {
        C0407j c0407jM3287r = this.f2510b.m3287r();
        if (c0407jM3287r != null) {
            ArrayList<C0407j> arrayListM3281l = this.f2510b.m3281l();
            int size = arrayListM3281l.size();
            for (int i = 0; i < size; i++) {
                if (arrayListM3281l.get(i) == c0407jM3287r) {
                    this.f2511c = i;
                    return;
                }
            }
        }
        this.f2511c = -1;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f2511c < 0 ? (this.f2513e ? this.f2510b.m3281l() : this.f2510b.m3278i()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate = view == null ? this.f2514f.inflate(f2509a, viewGroup, false) : view;
        InterfaceC0413p.a aVar = (InterfaceC0413p.a) viewInflate;
        if (this.f2512d) {
            ((ListMenuItemView) viewInflate).setForceShowIcon(true);
        }
        aVar.mo155a(getItem(i), 0);
        return viewInflate;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m3229b();
        super.notifyDataSetChanged();
    }
}
