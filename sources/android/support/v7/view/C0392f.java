package android.support.v7.view;

import android.content.Context;
import android.support.v4.p013e.p014a.InterfaceMenuC0195a;
import android.support.v4.p013e.p014a.InterfaceMenuItemC0196b;
import android.support.v4.p018i.C0219m;
import android.support.v7.view.AbstractC0388b;
import android.support.v7.view.menu.C0414q;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: android.support.v7.view.f */
/* JADX INFO: loaded from: classes.dex */
public class C0392f extends ActionMode {

    /* JADX INFO: renamed from: a */
    final Context f2338a;

    /* JADX INFO: renamed from: b */
    final AbstractC0388b f2339b;

    /* JADX INFO: renamed from: android.support.v7.view.f$a */
    public static class a implements AbstractC0388b.a {

        /* JADX INFO: renamed from: a */
        final ActionMode.Callback f2340a;

        /* JADX INFO: renamed from: b */
        final Context f2341b;

        /* JADX INFO: renamed from: c */
        final ArrayList<C0392f> f2342c = new ArrayList<>();

        /* JADX INFO: renamed from: d */
        final C0219m<Menu, Menu> f2343d = new C0219m<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f2341b = context;
            this.f2340a = callback;
        }

        /* JADX INFO: renamed from: a */
        private Menu m3140a(Menu menu) {
            Menu menu2 = this.f2343d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            Menu menuM3337a = C0414q.m3337a(this.f2341b, (InterfaceMenuC0195a) menu);
            this.f2343d.put(menu, menuM3337a);
            return menuM3337a;
        }

        @Override // android.support.v7.view.AbstractC0388b.a
        /* JADX INFO: renamed from: a */
        public void mo2708a(AbstractC0388b abstractC0388b) {
            this.f2340a.onDestroyActionMode(m3141b(abstractC0388b));
        }

        @Override // android.support.v7.view.AbstractC0388b.a
        /* JADX INFO: renamed from: a */
        public boolean mo2709a(AbstractC0388b abstractC0388b, Menu menu) {
            return this.f2340a.onCreateActionMode(m3141b(abstractC0388b), m3140a(menu));
        }

        @Override // android.support.v7.view.AbstractC0388b.a
        /* JADX INFO: renamed from: a */
        public boolean mo2710a(AbstractC0388b abstractC0388b, MenuItem menuItem) {
            return this.f2340a.onActionItemClicked(m3141b(abstractC0388b), C0414q.m3338a(this.f2341b, (InterfaceMenuItemC0196b) menuItem));
        }

        /* JADX INFO: renamed from: b */
        public ActionMode m3141b(AbstractC0388b abstractC0388b) {
            int size = this.f2342c.size();
            for (int i = 0; i < size; i++) {
                C0392f c0392f = this.f2342c.get(i);
                if (c0392f != null && c0392f.f2339b == abstractC0388b) {
                    return c0392f;
                }
            }
            C0392f c0392f2 = new C0392f(this.f2341b, abstractC0388b);
            this.f2342c.add(c0392f2);
            return c0392f2;
        }

        @Override // android.support.v7.view.AbstractC0388b.a
        /* JADX INFO: renamed from: b */
        public boolean mo2711b(AbstractC0388b abstractC0388b, Menu menu) {
            return this.f2340a.onPrepareActionMode(m3141b(abstractC0388b), m3140a(menu));
        }
    }

    public C0392f(Context context, AbstractC0388b abstractC0388b) {
        this.f2338a = context;
        this.f2339b = abstractC0388b;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f2339b.mo2775c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f2339b.mo2781i();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return C0414q.m3337a(this.f2338a, (InterfaceMenuC0195a) this.f2339b.mo2772b());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f2339b.mo2767a();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f2339b.mo2779g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f2339b.m3132j();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f2339b.mo2778f();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f2339b.m3133k();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f2339b.mo2776d();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f2339b.mo2780h();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f2339b.mo2769a(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f2339b.mo2773b(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f2339b.mo2770a(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f2339b.m3131a(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f2339b.mo2768a(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f2339b.mo2774b(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f2339b.mo2771a(z);
    }
}
