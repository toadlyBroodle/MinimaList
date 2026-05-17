package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.C0663b;
import com.google.android.gms.ads.C0684e;
import com.google.android.gms.ads.C0687h;
import com.google.android.gms.ads.p044a.C0661d;
import com.google.android.gms.ads.p044a.C0662e;
import com.google.android.gms.ads.p047d.C0683b;
import com.google.android.gms.common.C1283m;
import com.google.android.gms.common.util.C1310n;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;

/* JADX INFO: renamed from: com.google.android.gms.internal.jb */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1657jb {

    /* JADX INFO: renamed from: a */
    public static final Handler f10832a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    private static final String f10833b = C0684e.class.getName();

    /* JADX INFO: renamed from: c */
    private static final String f10834c = C0687h.class.getName();

    /* JADX INFO: renamed from: d */
    private static final String f10835d = C0661d.class.getName();

    /* JADX INFO: renamed from: e */
    private static final String f10836e = C0662e.class.getName();

    /* JADX INFO: renamed from: f */
    private static final String f10837f = C0683b.class.getName();

    /* JADX INFO: renamed from: g */
    private static final String f10838g = C0663b.class.getName();

    /* JADX INFO: renamed from: a */
    public static int m11560a(Context context, int i) {
        return m11561a(context.getResources().getDisplayMetrics(), i);
    }

    /* JADX INFO: renamed from: a */
    public static int m11561a(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, i, displayMetrics);
    }

    /* JADX INFO: renamed from: a */
    public static String m11562a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || m11569a()) {
            string = "emulator";
        }
        return m11563a(string);
    }

    /* JADX INFO: renamed from: a */
    public static String m11563a(String str) {
        String str2 = null;
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                str2 = String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
                break;
            } catch (ArithmeticException e) {
            } catch (NoSuchAlgorithmException e2) {
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: a */
    public static String m11564a(StackTraceElement[] stackTraceElementArr, String str) {
        String className;
        for (int i = 0; i + 1 < stackTraceElementArr.length; i++) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            String className2 = stackTraceElement.getClassName();
            if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (f10833b.equalsIgnoreCase(className2) || f10834c.equalsIgnoreCase(className2) || f10835d.equalsIgnoreCase(className2) || f10836e.equalsIgnoreCase(className2) || f10837f.equalsIgnoreCase(className2) || f10838g.equalsIgnoreCase(className2))) {
                className = stackTraceElementArr[i + 1].getClassName();
                break;
            }
        }
        className = null;
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            int i2 = 2;
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                while (true) {
                    int i3 = i2 - 1;
                    if (i2 <= 0 || !stringTokenizer.hasMoreElements()) {
                        break;
                    }
                    sb.append(".").append(stringTokenizer.nextToken());
                    i2 = i3;
                }
                str = sb.toString();
            }
            if (className != null && !className.contains(str)) {
                return className;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static Throwable m11565a(Throwable th) {
        Throwable th2;
        if (((Boolean) bxm.m10409f().m10546a(can.f9533c)).booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th3 = null;
        while (!linkedList.isEmpty()) {
            Throwable th4 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th4.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (m11574b(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                        arrayList.add(stackTraceElement);
                    } else {
                        arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                    }
                }
            }
            if (z) {
                th2 = th3 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th3);
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            } else {
                th2 = th3;
            }
            th3 = th2;
        }
        return th3;
    }

    /* JADX INFO: renamed from: a */
    public static void m11566a(Context context, String str, String str2, Bundle bundle, boolean z, InterfaceC1660je interfaceC1660je) {
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            bundle.putString("os", Build.VERSION.RELEASE);
            bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
            bundle.putString("appid", applicationContext.getPackageName());
            if (str == null) {
                C1283m.m7222b();
                str = new StringBuilder(23).append(C1283m.m7225d(context)).append(".11910000").toString();
            }
            bundle.putString("js", str);
        }
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str2);
        for (String str3 : bundle.keySet()) {
            builderAppendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        interfaceC1660je.mo11455a(builderAppendQueryParameter.toString());
    }

    /* JADX INFO: renamed from: a */
    private final void m11567a(ViewGroup viewGroup, bxb bxbVar, String str, int i, int i2) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i);
        textView.setBackgroundColor(i2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i);
        int iM11560a = m11560a(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(bxbVar.f9252f - iM11560a, bxbVar.f9249c - iM11560a, 17));
        viewGroup.addView(frameLayout, bxbVar.f9252f, bxbVar.f9249c);
    }

    /* JADX INFO: renamed from: a */
    public static void m11568a(boolean z, HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setReadTimeout(60000);
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setUseCaches(false);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11569a() {
        return Build.DEVICE.startsWith("generic");
    }

    /* JADX INFO: renamed from: b */
    public static int m11570b(Context context, int i) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return m11571b(displayMetrics, i);
    }

    /* JADX INFO: renamed from: b */
    public static int m11571b(DisplayMetrics displayMetrics, int i) {
        return Math.round(i / displayMetrics.density);
    }

    /* JADX INFO: renamed from: b */
    public static String m11572b(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            return null;
        }
        return Settings.Secure.getString(contentResolver, "android_id");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11573b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11574b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith((String) bxm.m10409f().m10546a(can.f9586d))) {
            return true;
        }
        try {
            return Class.forName(str).isAnnotationPresent(cnb.class);
        } catch (Exception e) {
            String strValueOf = String.valueOf(str);
            C1668jm.m11608a(strValueOf.length() != 0 ? "Fail to check class type for class ".concat(strValueOf) : new String("Fail to check class type for class "), e);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m11575c() {
        UUID uuidRandomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m11576c(Context context) {
        return C1283m.m7222b().mo7040a(context) == 0;
    }

    /* JADX INFO: renamed from: d */
    public static int m11577d(Context context) {
        return DynamiteModule.m7332b(context, ModuleDescriptor.MODULE_ID);
    }

    /* JADX INFO: renamed from: e */
    public static int m11578e(Context context) {
        return DynamiteModule.m7325a(context, ModuleDescriptor.MODULE_ID);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m11579f(Context context) {
        int iMo7040a = C1283m.m7222b().mo7040a(context);
        return iMo7040a == 0 || iMo7040a == 2;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m11580g(Context context) {
        if (context.getResources().getConfiguration().orientation != 2) {
            return false;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return ((int) (((float) displayMetrics.heightPixels) / displayMetrics.density)) < 600;
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: h */
    public static boolean m11581h(Context context) {
        int iIntValue;
        int iIntValue2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (C1310n.m7280c()) {
            defaultDisplay.getRealMetrics(displayMetrics);
            iIntValue = displayMetrics.heightPixels;
            iIntValue2 = displayMetrics.widthPixels;
        } else {
            try {
                iIntValue = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                iIntValue2 = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Exception e) {
                return false;
            }
        }
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.heightPixels == iIntValue && displayMetrics.widthPixels == iIntValue2;
    }

    /* JADX INFO: renamed from: i */
    public static int m11582i(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m11583a(Context context, String str, String str2, Bundle bundle, boolean z) {
        m11566a(context, null, str2, bundle, true, new C1658jc(this));
    }

    /* JADX INFO: renamed from: a */
    public final void m11584a(ViewGroup viewGroup, bxb bxbVar, String str) {
        m11567a(viewGroup, bxbVar, str, -16777216, -1);
    }

    /* JADX INFO: renamed from: a */
    public final void m11585a(ViewGroup viewGroup, bxb bxbVar, String str, String str2) {
        C1668jm.m11615e(str2);
        m11567a(viewGroup, bxbVar, str, -65536, -16777216);
    }
}
