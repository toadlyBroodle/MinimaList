package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.C0345b;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: renamed from: android.support.v7.app.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0350g {

    /* JADX INFO: renamed from: a */
    private static int f1929a = -1;

    /* JADX INFO: renamed from: b */
    private static boolean f1930b = false;

    AbstractC0350g() {
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0350g m2617a(Activity activity, InterfaceC0349f interfaceC0349f) {
        return m2619a(activity, activity.getWindow(), interfaceC0349f);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0350g m2618a(Dialog dialog, InterfaceC0349f interfaceC0349f) {
        return m2619a(dialog.getContext(), dialog.getWindow(), interfaceC0349f);
    }

    /* JADX INFO: renamed from: a */
    private static AbstractC0350g m2619a(Context context, Window window, InterfaceC0349f interfaceC0349f) {
        return Build.VERSION.SDK_INT >= 24 ? new C0352i(context, window, interfaceC0349f) : Build.VERSION.SDK_INT >= 23 ? new C0355l(context, window, interfaceC0349f) : Build.VERSION.SDK_INT >= 14 ? new C0354k(context, window, interfaceC0349f) : Build.VERSION.SDK_INT >= 11 ? new C0353j(context, window, interfaceC0349f) : new LayoutInflaterFactory2C0356m(context, window, interfaceC0349f);
    }

    /* JADX INFO: renamed from: k */
    public static int m2620k() {
        return f1929a;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m2621l() {
        return f1930b;
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC0344a mo2622a();

    /* JADX INFO: renamed from: a */
    public abstract <T extends View> T mo2623a(int i);

    /* JADX INFO: renamed from: a */
    public abstract void mo2624a(Configuration configuration);

    /* JADX INFO: renamed from: a */
    public abstract void mo2625a(Bundle bundle);

    /* JADX INFO: renamed from: a */
    public abstract void mo2626a(Toolbar toolbar);

    /* JADX INFO: renamed from: a */
    public abstract void mo2627a(View view);

    /* JADX INFO: renamed from: a */
    public abstract void mo2628a(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: a */
    public abstract void mo2629a(CharSequence charSequence);

    /* JADX INFO: renamed from: b */
    public abstract MenuInflater mo2630b();

    /* JADX INFO: renamed from: b */
    public abstract void mo2631b(int i);

    /* JADX INFO: renamed from: b */
    public abstract void mo2632b(Bundle bundle);

    /* JADX INFO: renamed from: b */
    public abstract void mo2633b(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: c */
    public abstract void mo2634c();

    /* JADX INFO: renamed from: c */
    public abstract void mo2635c(Bundle bundle);

    /* JADX INFO: renamed from: c */
    public abstract boolean mo2636c(int i);

    /* JADX INFO: renamed from: d */
    public abstract void mo2637d();

    /* JADX INFO: renamed from: e */
    public abstract void mo2638e();

    /* JADX INFO: renamed from: f */
    public abstract void mo2639f();

    /* JADX INFO: renamed from: g */
    public abstract void mo2640g();

    /* JADX INFO: renamed from: h */
    public abstract C0345b.a mo2641h();

    /* JADX INFO: renamed from: i */
    public abstract void mo2642i();

    /* JADX INFO: renamed from: j */
    public abstract boolean mo2643j();
}
