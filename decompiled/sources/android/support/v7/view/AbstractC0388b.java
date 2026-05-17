package android.support.v7.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: renamed from: android.support.v7.view.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0388b {

    /* JADX INFO: renamed from: a */
    private Object f2324a;

    /* JADX INFO: renamed from: b */
    private boolean f2325b;

    /* JADX INFO: renamed from: android.support.v7.view.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2708a(AbstractC0388b abstractC0388b);

        /* JADX INFO: renamed from: a */
        boolean mo2709a(AbstractC0388b abstractC0388b, Menu menu);

        /* JADX INFO: renamed from: a */
        boolean mo2710a(AbstractC0388b abstractC0388b, MenuItem menuItem);

        /* JADX INFO: renamed from: b */
        boolean mo2711b(AbstractC0388b abstractC0388b, Menu menu);
    }

    /* JADX INFO: renamed from: a */
    public abstract MenuInflater mo2767a();

    /* JADX INFO: renamed from: a */
    public abstract void mo2768a(int i);

    /* JADX INFO: renamed from: a */
    public abstract void mo2769a(View view);

    /* JADX INFO: renamed from: a */
    public abstract void mo2770a(CharSequence charSequence);

    /* JADX INFO: renamed from: a */
    public void m3131a(Object obj) {
        this.f2324a = obj;
    }

    /* JADX INFO: renamed from: a */
    public void mo2771a(boolean z) {
        this.f2325b = z;
    }

    /* JADX INFO: renamed from: b */
    public abstract Menu mo2772b();

    /* JADX INFO: renamed from: b */
    public abstract void mo2773b(int i);

    /* JADX INFO: renamed from: b */
    public abstract void mo2774b(CharSequence charSequence);

    /* JADX INFO: renamed from: c */
    public abstract void mo2775c();

    /* JADX INFO: renamed from: d */
    public abstract void mo2776d();

    /* JADX INFO: renamed from: f */
    public abstract CharSequence mo2778f();

    /* JADX INFO: renamed from: g */
    public abstract CharSequence mo2779g();

    /* JADX INFO: renamed from: h */
    public boolean mo2780h() {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public abstract View mo2781i();

    /* JADX INFO: renamed from: j */
    public Object m3132j() {
        return this.f2324a;
    }

    /* JADX INFO: renamed from: k */
    public boolean m3133k() {
        return this.f2325b;
    }
}
