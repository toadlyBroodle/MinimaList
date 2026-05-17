package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class afk {

    /* JADX INFO: renamed from: e */
    private static final String[] f6648e = {"/aclk", "/pcs/click"};

    /* JADX INFO: renamed from: a */
    private String f6649a = "googleads.g.doubleclick.net";

    /* JADX INFO: renamed from: b */
    private String f6650b = "/pagead/ads";

    /* JADX INFO: renamed from: c */
    private String f6651c = "ad.doubleclick.net";

    /* JADX INFO: renamed from: d */
    private String[] f6652d = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* JADX INFO: renamed from: f */
    private afg f6653f;

    public afk(afg afgVar) {
        this.f6653f = afgVar;
    }

    /* JADX INFO: renamed from: a */
    private final Uri m7806a(Uri uri, Context context, String str, boolean z, View view, Activity activity) throws afl {
        try {
            boolean zM7807c = m7807c(uri);
            if (zM7807c) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new afl("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new afl("Query parameter already exists: ms");
            }
            String strMo5658a = z ? this.f6653f.mo5658a(context, str, view, activity) : this.f6653f.mo5656a(context);
            if (!zM7807c) {
                String string = uri.toString();
                int iIndexOf = string.indexOf("&adurl");
                if (iIndexOf == -1) {
                    iIndexOf = string.indexOf("?adurl");
                }
                return iIndexOf != -1 ? Uri.parse(string.substring(0, iIndexOf + 1) + "ms=" + strMo5658a + "&" + string.substring(iIndexOf + 1)) : uri.buildUpon().appendQueryParameter("ms", strMo5658a).build();
            }
            String string2 = uri.toString();
            int iIndexOf2 = string2.indexOf(";adurl");
            if (iIndexOf2 != -1) {
                return Uri.parse(string2.substring(0, iIndexOf2 + 1) + "dc_ms=" + strMo5658a + ";" + string2.substring(iIndexOf2 + 1));
            }
            String encodedPath = uri.getEncodedPath();
            int iIndexOf3 = string2.indexOf(encodedPath);
            return Uri.parse(string2.substring(0, encodedPath.length() + iIndexOf3) + ";dc_ms=" + strMo5658a + ";" + string2.substring(encodedPath.length() + iIndexOf3));
        } catch (UnsupportedOperationException e) {
            throw new afl("Provided Uri is not in a valid state");
        }
    }

    /* JADX INFO: renamed from: c */
    private final boolean m7807c(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            return uri.getHost().equals(this.f6651c);
        } catch (NullPointerException e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Uri m7808a(Uri uri, Context context) {
        return m7806a(uri, context, null, false, null, null);
    }

    /* JADX INFO: renamed from: a */
    public final Uri m7809a(Uri uri, Context context, View view, Activity activity) throws afl {
        try {
            return m7806a(uri, context, uri.getQueryParameter("ai"), true, view, activity);
        } catch (UnsupportedOperationException e) {
            throw new afl("Provided Uri is not in a valid state");
        }
    }

    /* JADX INFO: renamed from: a */
    public final afg m7810a() {
        return this.f6653f;
    }

    /* JADX INFO: renamed from: a */
    public final void m7811a(MotionEvent motionEvent) {
        this.f6653f.mo5660a(motionEvent);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7812a(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            String host = uri.getHost();
            for (String str : this.f6652d) {
                if (host.endsWith(str)) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7813b(Uri uri) {
        if (!m7812a(uri)) {
            return false;
        }
        for (String str : f6648e) {
            if (uri.getPath().endsWith(str)) {
                return true;
            }
        }
        return false;
    }
}
