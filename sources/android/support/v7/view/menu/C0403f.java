package android.support.v7.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.v7.p022a.C0333a;
import android.support.v7.view.menu.InterfaceC0412o;
import android.support.v7.view.menu.InterfaceC0413p;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* JADX INFO: renamed from: android.support.v7.view.menu.f */
/* JADX INFO: loaded from: classes.dex */
public class C0403f implements InterfaceC0412o, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    Context f2497a;

    /* JADX INFO: renamed from: b */
    LayoutInflater f2498b;

    /* JADX INFO: renamed from: c */
    C0405h f2499c;

    /* JADX INFO: renamed from: d */
    ExpandedMenuView f2500d;

    /* JADX INFO: renamed from: e */
    int f2501e;

    /* JADX INFO: renamed from: f */
    int f2502f;

    /* JADX INFO: renamed from: g */
    int f2503g;

    /* JADX INFO: renamed from: h */
    a f2504h;

    /* JADX INFO: renamed from: i */
    private InterfaceC0412o.a f2505i;

    /* JADX INFO: renamed from: j */
    private int f2506j;

    /* JADX INFO: renamed from: android.support.v7.view.menu.f$a */
    private class a extends BaseAdapter {

        /* JADX INFO: renamed from: b */
        private int f2508b = -1;

        public a() {
            m3225a();
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0407j getItem(int i) {
            ArrayList<C0407j> arrayListM3281l = C0403f.this.f2499c.m3281l();
            int i2 = C0403f.this.f2501e + i;
            if (this.f2508b >= 0 && i2 >= this.f2508b) {
                i2++;
            }
            return arrayListM3281l.get(i2);
        }

        /* JADX INFO: renamed from: a */
        void m3225a() {
            C0407j c0407jM3287r = C0403f.this.f2499c.m3287r();
            if (c0407jM3287r != null) {
                ArrayList<C0407j> arrayListM3281l = C0403f.this.f2499c.m3281l();
                int size = arrayListM3281l.size();
                for (int i = 0; i < size; i++) {
                    if (arrayListM3281l.get(i) == c0407jM3287r) {
                        this.f2508b = i;
                        return;
                    }
                }
            }
            this.f2508b = -1;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C0403f.this.f2499c.m3281l().size() - C0403f.this.f2501e;
            return this.f2508b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View viewInflate = view == null ? C0403f.this.f2498b.inflate(C0403f.this.f2503g, viewGroup, false) : view;
            ((InterfaceC0413p.a) viewInflate).mo155a(getItem(i), 0);
            return viewInflate;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m3225a();
            super.notifyDataSetChanged();
        }
    }

    public C0403f(int i, int i2) {
        this.f2503g = i;
        this.f2502f = i2;
    }

    public C0403f(Context context, int i) {
        this(i, 0);
        this.f2497a = context;
        this.f2498b = LayoutInflater.from(this.f2497a);
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC0413p m3220a(ViewGroup viewGroup) {
        if (this.f2500d == null) {
            this.f2500d = (ExpandedMenuView) this.f2498b.inflate(C0333a.g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f2504h == null) {
                this.f2504h = new a();
            }
            this.f2500d.setAdapter((ListAdapter) this.f2504h);
            this.f2500d.setOnItemClickListener(this);
        }
        return this.f2500d;
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo165a(Context context, C0405h c0405h) {
        if (this.f2502f != 0) {
            this.f2497a = new ContextThemeWrapper(context, this.f2502f);
            this.f2498b = LayoutInflater.from(this.f2497a);
        } else if (this.f2497a != null) {
            this.f2497a = context;
            if (this.f2498b == null) {
                this.f2498b = LayoutInflater.from(this.f2497a);
            }
        }
        this.f2499c = c0405h;
        if (this.f2504h != null) {
            this.f2504h.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3221a(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        if (this.f2500d != null) {
            this.f2500d.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo168a(Parcelable parcelable) {
        m3222b((Bundle) parcelable);
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo170a(C0405h c0405h, boolean z) {
        if (this.f2505i != null) {
            this.f2505i.mo2706a(c0405h, z);
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo172a(InterfaceC0412o.a aVar) {
        this.f2505i = aVar;
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo174a(boolean z) {
        if (this.f2504h != null) {
            this.f2504h.notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public boolean mo175a() {
        return false;
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public boolean mo176a(C0405h c0405h, C0407j c0407j) {
        return false;
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public boolean mo177a(SubMenuC0418u subMenuC0418u) {
        if (!subMenuC0418u.hasVisibleItems()) {
            return false;
        }
        new DialogInterfaceOnClickListenerC0406i(subMenuC0418u).m3289a((IBinder) null);
        if (this.f2505i != null) {
            this.f2505i.mo2707a(subMenuC0418u);
        }
        return true;
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: b */
    public int mo178b() {
        return this.f2506j;
    }

    /* JADX INFO: renamed from: b */
    public void m3222b(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f2500d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: b */
    public boolean mo182b(C0405h c0405h, C0407j c0407j) {
        return false;
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: c */
    public Parcelable mo183c() {
        if (this.f2500d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        m3221a(bundle);
        return bundle;
    }

    /* JADX INFO: renamed from: d */
    public ListAdapter m3223d() {
        if (this.f2504h == null) {
            this.f2504h = new a();
        }
        return this.f2504h;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f2499c.m3257a(this.f2504h.getItem(i), this, 0);
    }
}
