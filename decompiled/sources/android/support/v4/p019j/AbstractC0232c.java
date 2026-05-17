package android.support.v4.p019j;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: android.support.v4.j.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0232c {

    /* JADX INFO: renamed from: a */
    private final Context f1333a;

    /* JADX INFO: renamed from: b */
    private a f1334b;

    /* JADX INFO: renamed from: c */
    private b f1335c;

    /* JADX INFO: renamed from: android.support.v4.j.c$a */
    public interface a {
        /* JADX INFO: renamed from: b */
        void mo1690b(boolean z);
    }

    /* JADX INFO: renamed from: android.support.v4.j.c$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo1691a(boolean z);
    }

    public AbstractC0232c(Context context) {
        this.f1333a = context;
    }

    /* JADX INFO: renamed from: a */
    public abstract View mo1679a();

    /* JADX INFO: renamed from: a */
    public View mo1680a(MenuItem menuItem) {
        return mo1679a();
    }

    /* JADX INFO: renamed from: a */
    public void m1681a(a aVar) {
        this.f1334b = aVar;
    }

    /* JADX INFO: renamed from: a */
    public void mo1682a(b bVar) {
        if (this.f1335c != null && bVar != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f1335c = bVar;
    }

    /* JADX INFO: renamed from: a */
    public void mo1683a(SubMenu subMenu) {
    }

    /* JADX INFO: renamed from: a */
    public void m1684a(boolean z) {
        if (this.f1334b != null) {
            this.f1334b.mo1690b(z);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean mo1685b() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo1686c() {
        return true;
    }

    /* JADX INFO: renamed from: d */
    public boolean mo1687d() {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo1688e() {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m1689f() {
        this.f1335c = null;
        this.f1334b = null;
    }
}
