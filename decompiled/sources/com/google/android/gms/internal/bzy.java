package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bzy {

    /* JADX INFO: renamed from: a */
    private final Context f9381a;

    public bzy(Context context) {
        C1221aj.m7066a(context, "Context can not be null");
        this.f9381a = context;
    }

    /* JADX INFO: renamed from: a */
    private final boolean m10519a(Intent intent) {
        C1221aj.m7066a(intent, "Intent can not be null");
        return !this.f9381a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10520a() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return m10519a(intent);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10521b() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return m10519a(intent);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10522c() {
        return ((Boolean) C1649iu.m11543a(this.f9381a, new bzz())).booleanValue() && C2040xg.m12562a(this.f9381a).m12554a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    @TargetApi(14)
    /* JADX INFO: renamed from: d */
    public final boolean m10523d() {
        return m10519a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }
}
