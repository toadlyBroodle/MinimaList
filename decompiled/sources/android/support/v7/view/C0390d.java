package android.support.v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.support.v7.p022a.C0333a;
import android.view.LayoutInflater;

/* JADX INFO: renamed from: android.support.v7.view.d */
/* JADX INFO: loaded from: classes.dex */
public class C0390d extends ContextWrapper {

    /* JADX INFO: renamed from: a */
    private int f2326a;

    /* JADX INFO: renamed from: b */
    private Resources.Theme f2327b;

    /* JADX INFO: renamed from: c */
    private LayoutInflater f2328c;

    /* JADX INFO: renamed from: d */
    private Configuration f2329d;

    /* JADX INFO: renamed from: e */
    private Resources f2330e;

    public C0390d() {
        super(null);
    }

    public C0390d(Context context, int i) {
        super(context);
        this.f2326a = i;
    }

    public C0390d(Context context, Resources.Theme theme) {
        super(context);
        this.f2327b = theme;
    }

    /* JADX INFO: renamed from: b */
    private Resources m3136b() {
        if (this.f2330e == null) {
            if (this.f2329d == null) {
                this.f2330e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.f2330e = createConfigurationContext(this.f2329d).getResources();
            }
        }
        return this.f2330e;
    }

    /* JADX INFO: renamed from: c */
    private void m3137c() {
        boolean z = this.f2327b == null;
        if (z) {
            this.f2327b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2327b.setTo(theme);
            }
        }
        m3139a(this.f2327b, this.f2326a, z);
    }

    /* JADX INFO: renamed from: a */
    public int m3138a() {
        return this.f2326a;
    }

    /* JADX INFO: renamed from: a */
    protected void m3139a(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m3136b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2328c == null) {
            this.f2328c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2328c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        if (this.f2327b != null) {
            return this.f2327b;
        }
        if (this.f2326a == 0) {
            this.f2326a = C0333a.i.Theme_AppCompat_Light;
        }
        m3137c();
        return this.f2327b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f2326a != i) {
            this.f2326a = i;
            m3137c();
        }
    }
}
