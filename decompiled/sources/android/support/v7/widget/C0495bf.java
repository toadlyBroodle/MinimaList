package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: android.support.v7.widget.bf */
/* JADX INFO: loaded from: classes.dex */
public class C0495bf extends ContextWrapper {

    /* JADX INFO: renamed from: a */
    private static final Object f3463a = new Object();

    /* JADX INFO: renamed from: b */
    private static ArrayList<WeakReference<C0495bf>> f3464b;

    /* JADX INFO: renamed from: c */
    private final Resources f3465c;

    /* JADX INFO: renamed from: d */
    private final Resources.Theme f3466d;

    private C0495bf(Context context) {
        super(context);
        if (!C0503bn.m4552a()) {
            this.f3465c = new C0497bh(this, context.getResources());
            this.f3466d = null;
        } else {
            this.f3465c = new C0503bn(this, context.getResources());
            this.f3466d = this.f3465c.newTheme();
            this.f3466d.setTo(context.getTheme());
        }
    }

    /* JADX INFO: renamed from: a */
    public static Context m4505a(Context context) {
        if (!m4506b(context)) {
            return context;
        }
        synchronized (f3463a) {
            if (f3464b == null) {
                f3464b = new ArrayList<>();
            } else {
                for (int size = f3464b.size() - 1; size >= 0; size--) {
                    WeakReference<C0495bf> weakReference = f3464b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f3464b.remove(size);
                    }
                }
                for (int size2 = f3464b.size() - 1; size2 >= 0; size2--) {
                    WeakReference<C0495bf> weakReference2 = f3464b.get(size2);
                    C0495bf c0495bf = weakReference2 != null ? weakReference2.get() : null;
                    if (c0495bf != null && c0495bf.getBaseContext() == context) {
                        return c0495bf;
                    }
                }
            }
            C0495bf c0495bf2 = new C0495bf(context);
            f3464b.add(new WeakReference<>(c0495bf2));
            return c0495bf2;
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m4506b(Context context) {
        if ((context instanceof C0495bf) || (context.getResources() instanceof C0497bh) || (context.getResources() instanceof C0503bn)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || C0503bn.m4552a();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f3465c.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f3465c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        return this.f3466d == null ? super.getTheme() : this.f3466d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f3466d == null) {
            super.setTheme(i);
        } else {
            this.f3466d.applyStyle(i, true);
        }
    }
}
