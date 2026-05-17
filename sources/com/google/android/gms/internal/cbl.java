package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsServiceConnection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cbl implements btd {

    /* JADX INFO: renamed from: a */
    private CustomTabsClient f9710a;

    /* JADX INFO: renamed from: b */
    private CustomTabsServiceConnection f9711b;

    /* JADX INFO: renamed from: c */
    private cbm f9712c;

    /* JADX INFO: renamed from: a */
    public static boolean m10592a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (listQueryIntentActivities == null || resolveInfoResolveActivity == null) {
            return false;
        }
        for (int i = 0; i < listQueryIntentActivities.size(); i++) {
            if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i).activityInfo.name)) {
                return resolveInfoResolveActivity.activityInfo.packageName.equals(btb.m10237a(context));
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m10593a(Activity activity) {
        String strM10237a;
        if (this.f9710a == null && (strM10237a = btb.m10237a(activity)) != null) {
            this.f9711b = new btc(this);
            CustomTabsClient.bindCustomTabsService(activity, strM10237a, this.f9711b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10594a(cbm cbmVar) {
        this.f9712c = cbmVar;
    }
}
