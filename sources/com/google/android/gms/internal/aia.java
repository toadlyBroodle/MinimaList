package com.google.android.gms.internal;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes.dex */
public class aia {

    /* JADX INFO: renamed from: a */
    private static aia f6815a;

    /* JADX INFO: renamed from: b */
    private volatile int f6816b = C1364a.f6819a;

    /* JADX INFO: renamed from: d */
    private volatile String f6818d = null;

    /* JADX INFO: renamed from: c */
    private volatile String f6817c = null;

    /* JADX INFO: renamed from: com.google.android.gms.internal.aia$a */
    enum C1364a {

        /* JADX INFO: renamed from: a */
        public static final int f6819a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f6820b = 2;

        /* JADX INFO: renamed from: c */
        private static final /* synthetic */ int[] f6821c = {1, 2};
    }

    aia() {
    }

    /* JADX INFO: renamed from: a */
    public static aia m7973a() {
        aia aiaVar;
        synchronized (aia.class) {
            if (f6815a == null) {
                f6815a = new aia();
            }
            aiaVar = f6815a;
        }
        return aiaVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7974a(String str) {
        return m7976b() && this.f6817c.equals(str);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m7975a(String str, Uri uri) {
        boolean z = false;
        synchronized (this) {
            try {
                String strDecode = URLDecoder.decode(uri.toString(), "UTF-8");
                if (strDecode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\S+")) {
                    String queryParameter = uri.getQueryParameter("id");
                    String queryParameter2 = uri.getQueryParameter("gtm_auth");
                    String queryParameter3 = uri.getQueryParameter("gtm_preview");
                    if (!str.equals(queryParameter)) {
                        ahs.m7944b("Preview fails (container doesn't match the container specified by the asset)");
                    } else if (queryParameter == null || queryParameter.length() <= 0) {
                        String strValueOf = String.valueOf(strDecode);
                        ahs.m7944b(strValueOf.length() != 0 ? "Bad preview url: ".concat(strValueOf) : new String("Bad preview url: "));
                    } else if (queryParameter3 == null || queryParameter3.length() != 0) {
                        if (queryParameter3 == null || queryParameter3.length() <= 0 || queryParameter2 == null || queryParameter2.length() <= 0) {
                            String strValueOf2 = String.valueOf(strDecode);
                            ahs.m7944b(strValueOf2.length() != 0 ? "Bad preview url: ".concat(strValueOf2) : new String("Bad preview url: "));
                        } else {
                            this.f6816b = C1364a.f6820b;
                            this.f6818d = uri.getQuery();
                            this.f6817c = queryParameter;
                            z = true;
                        }
                    } else if (!queryParameter.equals(this.f6817c) || this.f6816b == C1364a.f6819a) {
                        ahs.m7944b("Error in exiting preview mode. The container is not in preview.");
                    } else {
                        String strValueOf3 = String.valueOf(this.f6817c);
                        ahs.m7947d(strValueOf3.length() != 0 ? "Exit preview mode for container: ".concat(strValueOf3) : new String("Exit preview mode for container: "));
                        this.f6816b = C1364a.f6819a;
                        this.f6817c = null;
                        this.f6818d = null;
                        z = true;
                    }
                } else {
                    String strValueOf4 = String.valueOf(strDecode);
                    ahs.m7944b(strValueOf4.length() != 0 ? "Bad preview url: ".concat(strValueOf4) : new String("Bad preview url: "));
                }
            } catch (UnsupportedEncodingException e) {
                String strValueOf5 = String.valueOf(e);
                ahs.m7944b(new StringBuilder(String.valueOf(strValueOf5).length() + 32).append("Error decoding the preview url: ").append(strValueOf5).toString());
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7976b() {
        return this.f6816b == C1364a.f6820b;
    }

    /* JADX INFO: renamed from: c */
    public final String m7977c() {
        return this.f6818d;
    }

    /* JADX INFO: renamed from: d */
    public final String m7978d() {
        return this.f6817c;
    }
}
