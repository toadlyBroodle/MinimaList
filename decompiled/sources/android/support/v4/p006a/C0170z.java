package android.support.v4.p006a;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;

/* JADX INFO: renamed from: android.support.v4.a.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0170z {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.content.Intent] */
    /* JADX INFO: renamed from: a */
    public static Intent m1286a(Activity activity) {
        Intent parentActivityIntent;
        if (Build.VERSION.SDK_INT >= 16 && (parentActivityIntent = activity.getParentActivityIntent()) != null) {
            return parentActivityIntent;
        }
        String strM1289b = m1289b(activity);
        if (strM1289b == 0) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, (String) strM1289b);
        try {
            strM1289b = m1290b(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            return strM1289b;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strM1289b + "' in manifest");
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Intent m1287a(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM1290b = m1290b(context, componentName);
        if (strM1290b == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM1290b);
        return m1290b(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1288a(Activity activity, Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            return activity.shouldUpRecreateTask(intent);
        }
        String action = activity.getIntent().getAction();
        return (action == null || action.equals("android.intent.action.MAIN")) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static String m1289b(Activity activity) {
        try {
            return m1290b(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m1290b(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        String str;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 128);
        if (Build.VERSION.SDK_INT >= 16 && (str = activityInfo.parentActivityName) != null) {
            return str;
        }
        if (activityInfo.metaData != null && (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) != null) {
            return string.charAt(0) == '.' ? context.getPackageName() + string : string;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m1291b(Activity activity, Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.navigateUpTo(intent);
            return;
        }
        intent.addFlags(67108864);
        activity.startActivity(intent);
        activity.finish();
    }
}
