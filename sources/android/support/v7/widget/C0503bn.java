package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.app.AbstractC0350g;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: android.support.v7.widget.bn */
/* JADX INFO: loaded from: classes.dex */
public class C0503bn extends Resources {

    /* JADX INFO: renamed from: a */
    private final WeakReference<Context> f3516a;

    public C0503bn(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f3516a = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4552a() {
        return AbstractC0350g.m2621l() && Build.VERSION.SDK_INT <= 20;
    }

    /* JADX INFO: renamed from: a */
    final Drawable m4553a(int i) {
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Context context = this.f3516a.get();
        return context != null ? C0517m.m4669a().m4690a(context, this, i) : super.getDrawable(i);
    }
}
