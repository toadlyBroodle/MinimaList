package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class atq {

    /* JADX INFO: renamed from: a */
    private static final char[] f7252a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: a */
    public static long m8321a(double d, int i, DisplayMetrics displayMetrics) {
        return Math.round((((double) i) * d) / ((double) displayMetrics.density));
    }

    /* JADX INFO: renamed from: a */
    public static Activity m8322a(View view) {
        View rootView = view.getRootView();
        if (rootView != null) {
            view = rootView;
        }
        Context context = view.getContext();
        for (int i = 0; (context instanceof ContextWrapper) && i < 10; i++) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static Long m8323a() {
        return Long.valueOf(Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles")).getTime().getTime());
    }

    /* JADX INFO: renamed from: a */
    public static String m8324a(String str) {
        if (str == null || !str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            return str;
        }
        UUID uuidFromString = UUID.fromString(str);
        byte[] bArr = new byte[16];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
        byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
        return C2042xi.m12565a(bArr, true);
    }

    /* JADX INFO: renamed from: a */
    public static String m8325a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        ayg.m8688a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m8326a(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m8327b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m8328b(String str) {
        return str == null || str.isEmpty();
    }
}
