package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.support.v4.p018i.C0219m;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.C0651a;
import com.google.android.gms.common.C1207f;
import com.google.android.gms.common.util.C1304h;
import com.google.android.gms.internal.C2040xg;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.bm */
/* JADX INFO: loaded from: classes.dex */
public final class C1251bm {

    /* JADX INFO: renamed from: a */
    private static final C0219m<String, String> f5920a = new C0219m<>();

    /* JADX INFO: renamed from: a */
    public static String m7163a(Context context) {
        return context.getResources().getString(C0651a.d.common_google_play_services_notification_channel_name);
    }

    /* JADX INFO: renamed from: a */
    public static String m7164a(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
            case 6:
            case 18:
                break;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                break;
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                break;
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                break;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                break;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                break;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", new StringBuilder(33).append("Unexpected error code ").append(i).toString());
                break;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                break;
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                break;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static String m7165a(Context context, String str) {
        synchronized (f5920a) {
            String str2 = f5920a.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources resourcesM7051a = C1207f.m7051a(context);
            if (resourcesM7051a == null) {
                return null;
            }
            int identifier = resourcesM7051a.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String strValueOf = String.valueOf(str);
                Log.w("GoogleApiAvailability", strValueOf.length() != 0 ? "Missing resource: ".concat(strValueOf) : new String("Missing resource: "));
                return null;
            }
            String string = resourcesM7051a.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                f5920a.put(str, string);
                return string;
            }
            String strValueOf2 = String.valueOf(str);
            Log.w("GoogleApiAvailability", strValueOf2.length() != 0 ? "Got empty resource: ".concat(strValueOf2) : new String("Got empty resource: "));
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m7166a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strM7165a = m7165a(context, str);
        if (strM7165a == null) {
            strM7165a = resources.getString(C0651a.d.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strM7165a, str2);
    }

    /* JADX INFO: renamed from: b */
    private static String m7167b(Context context) {
        String packageName = context.getPackageName();
        try {
            return C2040xg.m12562a(context).m12561b(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            String str = context.getApplicationInfo().name;
            return !TextUtils.isEmpty(str) ? str : packageName;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m7168b(Context context, int i) {
        String strM7165a = i == 6 ? m7165a(context, "common_google_play_services_resolution_required_title") : m7164a(context, i);
        return strM7165a == null ? context.getResources().getString(C0651a.d.common_google_play_services_notification_ticker) : strM7165a;
    }

    /* JADX INFO: renamed from: c */
    public static String m7169c(Context context, int i) {
        Resources resources = context.getResources();
        String strM7167b = m7167b(context);
        switch (i) {
            case 1:
                return resources.getString(C0651a.d.common_google_play_services_install_text, strM7167b);
            case 2:
                return C1304h.m7265b(context) ? resources.getString(C0651a.d.common_google_play_services_wear_update_text) : resources.getString(C0651a.d.common_google_play_services_update_text, strM7167b);
            case 3:
                return resources.getString(C0651a.d.common_google_play_services_enable_text, strM7167b);
            case 4:
            case 6:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                return resources.getString(C0651a.d.common_google_play_services_unknown_issue, strM7167b);
            case 5:
                return m7166a(context, "common_google_play_services_invalid_account_text", strM7167b);
            case 7:
                return m7166a(context, "common_google_play_services_network_error_text", strM7167b);
            case 9:
                return resources.getString(C0651a.d.common_google_play_services_unsupported_text, strM7167b);
            case 16:
                return m7166a(context, "common_google_play_services_api_unavailable_text", strM7167b);
            case 17:
                return m7166a(context, "common_google_play_services_sign_in_failed_text", strM7167b);
            case 18:
                return resources.getString(C0651a.d.common_google_play_services_updating_text, strM7167b);
            case 20:
                return m7166a(context, "common_google_play_services_restricted_profile_text", strM7167b);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m7170d(Context context, int i) {
        return i == 6 ? m7166a(context, "common_google_play_services_resolution_required_text", m7167b(context)) : m7169c(context, i);
    }

    /* JADX INFO: renamed from: e */
    public static String m7171e(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C0651a.d.common_google_play_services_install_button);
            case 2:
                return resources.getString(C0651a.d.common_google_play_services_update_button);
            case 3:
                return resources.getString(C0651a.d.common_google_play_services_enable_button);
            default:
                return resources.getString(R.string.ok);
        }
    }
}
