package android.support.v7.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v7.p022a.C0333a;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: android.support.v7.view.a */
/* JADX INFO: loaded from: classes.dex */
public class C0387a {

    /* JADX INFO: renamed from: a */
    private Context f2323a;

    private C0387a(Context context) {
        this.f2323a = context;
    }

    /* JADX INFO: renamed from: a */
    public static C0387a m3123a(Context context) {
        return new C0387a(context);
    }

    /* JADX INFO: renamed from: a */
    public int m3124a() {
        Configuration configuration = this.f2323a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600 || ((i > 960 && i2 > 720) || (i > 720 && i2 > 960))) {
            return 5;
        }
        if (i >= 500 || ((i > 640 && i2 > 480) || (i > 480 && i2 > 640))) {
            return 4;
        }
        return i >= 360 ? 3 : 2;
    }

    /* JADX INFO: renamed from: b */
    public boolean m3125b() {
        return Build.VERSION.SDK_INT >= 19 || !ViewConfiguration.get(this.f2323a).hasPermanentMenuKey();
    }

    /* JADX INFO: renamed from: c */
    public int m3126c() {
        return this.f2323a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* JADX INFO: renamed from: d */
    public boolean m3127d() {
        return this.f2323a.getResources().getBoolean(C0333a.b.abc_action_bar_embed_tabs);
    }

    /* JADX INFO: renamed from: e */
    public int m3128e() {
        TypedArray typedArrayObtainStyledAttributes = this.f2323a.obtainStyledAttributes(null, C0333a.j.ActionBar, C0333a.a.actionBarStyle, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(C0333a.j.ActionBar_height, 0);
        Resources resources = this.f2323a.getResources();
        if (!m3127d()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0333a.d.abc_action_bar_stacked_max_height));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* JADX INFO: renamed from: f */
    public boolean m3129f() {
        return this.f2323a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* JADX INFO: renamed from: g */
    public int m3130g() {
        return this.f2323a.getResources().getDimensionPixelSize(C0333a.d.abc_action_bar_stacked_tab_max_width);
    }
}
