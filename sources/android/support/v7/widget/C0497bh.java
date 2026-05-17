package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: android.support.v7.widget.bh */
/* JADX INFO: loaded from: classes.dex */
class C0497bh extends C0486ax {

    /* JADX INFO: renamed from: a */
    private final WeakReference<Context> f3471a;

    public C0497bh(Context context, Resources resources) {
        super(resources);
        this.f3471a = new WeakReference<>(context);
    }

    @Override // android.support.v7.widget.C0486ax, android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = this.f3471a.get();
        if (drawable != null && context != null) {
            C0517m.m4669a();
            C0517m.m4675a(context, i, drawable);
        }
        return drawable;
    }
}
