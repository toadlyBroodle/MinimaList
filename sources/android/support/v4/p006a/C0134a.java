package android.support.v4.p006a;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.p007b.C0175b;

/* JADX INFO: renamed from: android.support.v4.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0134a extends C0175b {

    /* JADX INFO: renamed from: a */
    private static b f665a;

    /* JADX INFO: renamed from: android.support.v4.a.a$a */
    public interface a {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* JADX INFO: renamed from: android.support.v4.a.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        boolean m761a(Activity activity, int i, int i2, Intent intent);

        /* JADX INFO: renamed from: a */
        boolean m762a(Activity activity, String[] strArr, int i);
    }

    /* JADX INFO: renamed from: android.support.v4.a.a$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo763a(int i);
    }

    /* JADX INFO: renamed from: a */
    public static b m757a() {
        return f665a;
    }

    /* JADX INFO: renamed from: a */
    public static void m758a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m759a(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m760a(final Activity activity, final String[] strArr, final int i) {
        if (f665a == null || !f665a.m762a(activity, strArr, i)) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof c) {
                    ((c) activity).mo763a(i);
                }
                activity.requestPermissions(strArr, i);
            } else if (activity instanceof a) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: android.support.v4.a.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        int[] iArr = new int[strArr.length];
                        PackageManager packageManager = activity.getPackageManager();
                        String packageName = activity.getPackageName();
                        int length = strArr.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            iArr[i2] = packageManager.checkPermission(strArr[i2], packageName);
                        }
                        ((a) activity).onRequestPermissionsResult(i, strArr, iArr);
                    }
                });
            }
        }
    }
}
