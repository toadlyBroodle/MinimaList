package android.support.v7.app;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: android.support.v7.app.c */
/* JADX INFO: loaded from: classes.dex */
class C0346c {

    /* JADX INFO: renamed from: a */
    private static final int[] f1919a = {R.attr.homeAsUpIndicator};

    /* JADX INFO: renamed from: android.support.v7.app.c$a */
    static class a {

        /* JADX INFO: renamed from: a */
        public Method f1920a;

        /* JADX INFO: renamed from: b */
        public Method f1921b;

        /* JADX INFO: renamed from: c */
        public ImageView f1922c;

        a(Activity activity) {
            try {
                this.f1920a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.f1921b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException e) {
                View viewFindViewById = activity.findViewById(R.id.home);
                if (viewFindViewById != null) {
                    ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
                    if (viewGroup.getChildCount() == 2) {
                        View childAt = viewGroup.getChildAt(0);
                        View childAt2 = childAt.getId() != 16908332 ? childAt : viewGroup.getChildAt(1);
                        if (childAt2 instanceof ImageView) {
                            this.f1922c = (ImageView) childAt2;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static Drawable m2586a(Activity activity) {
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(f1919a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    /* JADX INFO: renamed from: a */
    public static a m2587a(a aVar, Activity activity, int i) {
        if (aVar == null) {
            aVar = new a(activity);
        }
        if (aVar.f1920a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.f1921b.invoke(actionBar, Integer.valueOf(i));
                if (Build.VERSION.SDK_INT <= 19) {
                    actionBar.setSubtitle(actionBar.getSubtitle());
                }
            } catch (Exception e) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set content description via JB-MR2 API", e);
            }
        }
        return aVar;
    }

    /* JADX INFO: renamed from: a */
    public static a m2588a(a aVar, Activity activity, Drawable drawable, int i) {
        a aVar2 = new a(activity);
        if (aVar2.f1920a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar2.f1920a.invoke(actionBar, drawable);
                aVar2.f1921b.invoke(actionBar, Integer.valueOf(i));
            } catch (Exception e) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator via JB-MR2 API", e);
            }
        } else if (aVar2.f1922c != null) {
            aVar2.f1922c.setImageDrawable(drawable);
        } else {
            Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator");
        }
        return aVar2;
    }
}
