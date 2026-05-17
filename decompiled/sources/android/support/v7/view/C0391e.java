package android.support.v7.view;

import android.content.Context;
import android.support.v7.view.AbstractC0388b;
import android.support.v7.view.menu.C0405h;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: android.support.v7.view.e */
/* JADX INFO: loaded from: classes.dex */
public class C0391e extends AbstractC0388b implements C0405h.a {

    /* JADX INFO: renamed from: a */
    private Context f2331a;

    /* JADX INFO: renamed from: b */
    private ActionBarContextView f2332b;

    /* JADX INFO: renamed from: c */
    private AbstractC0388b.a f2333c;

    /* JADX INFO: renamed from: d */
    private WeakReference<View> f2334d;

    /* JADX INFO: renamed from: e */
    private boolean f2335e;

    /* JADX INFO: renamed from: f */
    private boolean f2336f;

    /* JADX INFO: renamed from: g */
    private C0405h f2337g;

    public C0391e(Context context, ActionBarContextView actionBarContextView, AbstractC0388b.a aVar, boolean z) {
        this.f2331a = context;
        this.f2332b = actionBarContextView;
        this.f2333c = aVar;
        this.f2337g = new C0405h(actionBarContextView.getContext()).m3241a(1);
        this.f2337g.mo3249a(this);
        this.f2336f = z;
    }

    @Override // android.support.v7.view.AbstractC0388b
    /* JADX INFO: renamed from: a */
    public MenuInflater mo2767a() {
        return new C0393g(this.f2332b.getContext());
    }

    @Override // android.support.v7.view.AbstractC0388b
    /* JADX INFO: renamed from: a */
    public void mo2768a(int i) {
        mo2774b(this.f2331a.getString(i));
    }

    @Override // android.support.v7.view.menu.C0405h.a
    /* JADX INFO: renamed from: a */
    public void mo424a(C0405h c0405h) {
        mo2776d();
        this.f2332b.mo3351a();
    }

    @Override // android.support.v7.view.AbstractC0388b
    /* JADX INFO: renamed from: a */
    public void mo2769a(View view) {
        this.f2332b.setCustomView(view);
        this.f2334d = view != null ? new WeakReference<>(view) : null;
    }

    @Override // android.support.v7.view.AbstractC0388b
    /* JADX INFO: renamed from: a */
    public void mo2770a(CharSequence charSequence) {
        this.f2332b.setSubtitle(charSequence);
    }

    @Override // android.support.v7.view.AbstractC0388b
    /* JADX INFO: renamed from: a */
    public void mo2771a(boolean z) {
        super.mo2771a(z);
        this.f2332b.setTitleOptional(z);
    }

    @Override // android.support.v7.view.menu.C0405h.a
    /* JADX INFO: renamed from: a */
    public boolean mo425a(C0405h c0405h, MenuItem menuItem) {
        return this.f2333c.mo2710a(this, menuItem);
    }

    @Override // android.support.v7.view.AbstractC0388b
    /* JADX INFO: renamed from: b */
    public Menu mo2772b() {
        return this.f2337g;
    }

    @Override // android.support.v7.view.AbstractC0388b
    /* JADX INFO: renamed from: b */
    public void mo2773b(int i) {
        mo2770a((CharSequence) this.f2331a.getString(i));
    }

    @Override // android.support.v7.view.AbstractC0388b
    /* JADX INFO: renamed from: b */
    public void mo2774b(CharSequence charSequence) {
        this.f2332b.setTitle(charSequence);
    }

    @Override // android.support.v7.view.AbstractC0388b
    /* JADX INFO: renamed from: c */
    public void mo2775c() {
        if (this.f2335e) {
            return;
        }
        this.f2335e = true;
        this.f2332b.sendAccessibilityEvent(32);
        this.f2333c.mo2708a(this);
    }

    @Override // android.support.v7.view.AbstractC0388b
    /* JADX INFO: renamed from: d */
    public void mo2776d() {
        this.f2333c.mo2711b(this, this.f2337g);
    }

    @Override // android.support.v7.view.AbstractC0388b
    /* JADX INFO: renamed from: f */
    public CharSequence mo2778f() {
        return this.f2332b.getTitle();
    }

    @Override // android.support.v7.view.AbstractC0388b
    /* JADX INFO: renamed from: g */
    public CharSequence mo2779g() {
        return this.f2332b.getSubtitle();
    }

    @Override // android.support.v7.view.AbstractC0388b
    /* JADX INFO: renamed from: h */
    public boolean mo2780h() {
        return this.f2332b.m3354d();
    }

    @Override // android.support.v7.view.AbstractC0388b
    /* JADX INFO: renamed from: i */
    public View mo2781i() {
        if (this.f2334d != null) {
            return this.f2334d.get();
        }
        return null;
    }
}
