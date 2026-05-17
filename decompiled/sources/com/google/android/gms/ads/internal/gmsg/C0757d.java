package com.google.android.gms.ads.internal.gmsg;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.afk;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.can;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.gmsg.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0757d {

    /* JADX INFO: renamed from: a */
    private final Context f4634a;

    /* JADX INFO: renamed from: b */
    private final afk f4635b;

    /* JADX INFO: renamed from: c */
    private final View f4636c;

    public C0757d(Context context, afk afkVar, View view) {
        this.f4634a = context;
        this.f4635b = afkVar;
        this.f4636c = view;
    }

    /* JADX INFO: renamed from: a */
    private static Intent m5682a(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        intent2.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        return intent2;
    }

    /* JADX INFO: renamed from: a */
    private static Intent m5683a(Uri uri) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    /* JADX INFO: renamed from: a */
    private final ResolveInfo m5684a(Intent intent) {
        return m5685a(intent, new ArrayList<>());
    }

    /* JADX INFO: renamed from: a */
    private final ResolveInfo m5685a(Intent intent, ArrayList<ResolveInfo> arrayList) {
        ResolveInfo resolveInfo;
        Throwable th;
        try {
            PackageManager packageManager = this.f4634a.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= listQueryIntentActivities.size()) {
                        break;
                    }
                    ResolveInfo resolveInfo2 = listQueryIntentActivities.get(i2);
                    if (resolveInfoResolveActivity != null && resolveInfoResolveActivity.activityInfo.name.equals(resolveInfo2.activityInfo.name)) {
                        resolveInfo = resolveInfoResolveActivity;
                        break;
                    }
                    i = i2 + 1;
                }
                resolveInfo = null;
                arrayList.addAll(listQueryIntentActivities);
                return resolveInfo;
            }
            resolveInfo = null;
            try {
                arrayList.addAll(listQueryIntentActivities);
                return resolveInfo;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            resolveInfo = null;
            th = th3;
        }
        C0710au.m5573i().m11292a(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        return resolveInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0064  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Intent m5686a(Map<String, String> map) {
        boolean z;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo resolveInfoM5684a;
        Uri uriBuild = null;
        ActivityManager activityManager = (ActivityManager) this.f4634a.getSystemService("activity");
        String str = map.get("u");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C0710au.m5569e();
        Uri uri = Uri.parse(C1596gv.m11381a(this.f4634a, this.f4635b, str, this.f4636c, (Activity) null));
        boolean z2 = Boolean.parseBoolean(map.get("use_first_package"));
        boolean z3 = Boolean.parseBoolean(map.get("use_running_process"));
        if (!Boolean.parseBoolean(map.get("use_custom_tabs"))) {
            z = ((Boolean) bxm.m10409f().m10546a(can.f9582cw)).booleanValue();
        }
        if ("http".equalsIgnoreCase(uri.getScheme())) {
            uriBuild = uri.buildUpon().scheme("https").build();
        } else if ("https".equalsIgnoreCase(uri.getScheme())) {
            uriBuild = uri.buildUpon().scheme("http").build();
        }
        ArrayList<ResolveInfo> arrayList = new ArrayList<>();
        Intent intentM5683a = m5683a(uri);
        Intent intentM5683a2 = m5683a(uriBuild);
        if (z) {
            C0710au.m5569e();
            C1596gv.m11410b(this.f4634a, intentM5683a);
            C0710au.m5569e();
            C1596gv.m11410b(this.f4634a, intentM5683a2);
        }
        ResolveInfo resolveInfoM5685a = m5685a(intentM5683a, arrayList);
        if (resolveInfoM5685a != null) {
            return m5682a(intentM5683a, resolveInfoM5685a);
        }
        if (intentM5683a2 != null && (resolveInfoM5684a = m5684a(intentM5683a2)) != null) {
            Intent intentM5682a = m5682a(intentM5683a, resolveInfoM5684a);
            if (m5684a(intentM5682a) != null) {
                return intentM5682a;
            }
        }
        if (arrayList.size() == 0) {
            return intentM5683a;
        }
        if (z3 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            ArrayList<ResolveInfo> arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                ResolveInfo resolveInfo = arrayList2.get(i);
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (it.hasNext()) {
                    if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                        return m5682a(intentM5683a, resolveInfo);
                    }
                }
                i = i2;
            }
        }
        return z2 ? m5682a(intentM5683a, arrayList.get(0)) : intentM5683a;
    }
}
