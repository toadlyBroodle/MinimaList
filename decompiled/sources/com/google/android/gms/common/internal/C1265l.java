package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1265l {

    /* JADX INFO: renamed from: a */
    private static final Uri f5969a;

    /* JADX INFO: renamed from: b */
    private static final Uri f5970b;

    static {
        Uri uri = Uri.parse("https://plus.google.com/");
        f5969a = uri;
        f5970b = uri.buildUpon().appendPath("circles").appendPath("find").build();
    }

    /* JADX INFO: renamed from: a */
    public static Intent m7208a() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    /* JADX INFO: renamed from: a */
    public static Intent m7209a(String str) {
        Uri uriFromParts = Uri.fromParts("package", str, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(uriFromParts);
        return intent;
    }

    /* JADX INFO: renamed from: a */
    public static Intent m7210a(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", str);
        if (!TextUtils.isEmpty(str2)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", str2);
        }
        intent.setData(builderAppendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }
}
