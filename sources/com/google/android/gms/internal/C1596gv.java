package com.google.android.gms.internal;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.common.util.C1308l;
import com.google.android.gms.common.util.C1310n;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.gv */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1596gv {

    /* JADX INFO: renamed from: a */
    public static final Handler f10711a = new HandlerC1561fn(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    private String f10714d;

    /* JADX INFO: renamed from: g */
    private Pattern f10717g;

    /* JADX INFO: renamed from: h */
    private Pattern f10718h;

    /* JADX INFO: renamed from: b */
    private final Object f10712b = new Object();

    /* JADX INFO: renamed from: c */
    private boolean f10713c = true;

    /* JADX INFO: renamed from: e */
    private boolean f10715e = false;

    /* JADX INFO: renamed from: f */
    private boolean f10716f = false;

    /* JADX INFO: renamed from: a */
    public static Bitmap m11373a(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: a */
    public static Uri m11374a(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        return iIndexOf != -1 ? Uri.parse(str.substring(0, iIndexOf + 1) + str2 + "=" + str3 + "&" + str.substring(iIndexOf + 1)) : Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m11375a(buw buwVar) {
        String str;
        String strM11305g;
        String strM11306h;
        if (buwVar == null) {
            return null;
        }
        if (!((Boolean) bxm.m10409f().m10546a(can.f9417Q)).booleanValue()) {
            if (!((Boolean) bxm.m10409f().m10546a(can.f9419S)).booleanValue()) {
                return null;
            }
        }
        if (C0710au.m5573i().m11295a() && C0710au.m5573i().m11299b()) {
            return null;
        }
        if (buwVar.m10309d()) {
            buwVar.m10308c();
        }
        buq buqVarM10307b = buwVar.m10307b();
        if (buqVarM10307b != null) {
            String strM10272b = buqVarM10307b.m10272b();
            String strM10274c = buqVarM10307b.m10274c();
            String strM10275d = buqVarM10307b.m10275d();
            if (strM10272b != null) {
                C0710au.m5573i().m11286a(strM10272b);
            }
            if (strM10275d != null) {
                C0710au.m5573i().m11297b(strM10275d);
                strM11305g = strM10272b;
                str = strM10274c;
                strM11306h = strM10275d;
            } else {
                strM11305g = strM10272b;
                str = strM10274c;
                strM11306h = strM10275d;
            }
        } else {
            str = null;
            strM11305g = C0710au.m5573i().m11305g();
            strM11306h = C0710au.m5573i().m11306h();
        }
        Bundle bundle = new Bundle(1);
        if (strM11306h != null) {
            if (((Boolean) bxm.m10409f().m10546a(can.f9419S)).booleanValue() && !C0710au.m5573i().m11299b()) {
                bundle.putString("v_fp_vertical", strM11306h);
            }
        }
        if (strM11305g != null) {
            if (((Boolean) bxm.m10409f().m10546a(can.f9417Q)).booleanValue() && !C0710au.m5573i().m11295a()) {
                bundle.putString("fingerprint", strM11305g);
                if (!strM11305g.equals(str)) {
                    bundle.putString("v_fp", str);
                }
            }
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    public static DisplayMetrics m11376a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* JADX INFO: renamed from: a */
    public static PopupWindow m11377a(View view, int i, int i2, boolean z) {
        return new PopupWindow(view, i, i2, false);
    }

    /* JADX INFO: renamed from: a */
    public static String m11379a() {
        return UUID.randomUUID().toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m11380a(Context context, View view, bxb bxbVar) {
        if (!((Boolean) bxm.m10409f().m10546a(can.f9458ae)).booleanValue()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", bxbVar.f9251e);
            jSONObject2.put("height", bxbVar.f9248b);
            jSONObject.put("size", jSONObject2);
            jSONObject.put("activity", m11438p(context));
            if (!bxbVar.f9250d) {
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    Object parent = view.getParent();
                    if (parent != null) {
                        int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("type", parent.getClass().getName());
                        jSONObject3.put("index_of_child", iIndexOfChild);
                        jSONArray.put(jSONObject3);
                    }
                    view = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("parents", jSONArray);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            C1560fm.m11613c("Fail to get view hierarchy json", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m11381a(Context context, afk afkVar, String str, View view, Activity activity) {
        if (afkVar == null) {
            return str;
        }
        try {
            Uri uriM7809a = Uri.parse(str);
            if (afkVar.m7813b(uriM7809a)) {
                uriM7809a = afkVar.m7809a(uriM7809a, context, view, activity);
            }
            return uriM7809a.toString();
        } catch (Exception e) {
            return str;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m11383a(InputStreamReader inputStreamReader) {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int i = inputStreamReader.read(cArr);
            if (i == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m11384a(String str) {
        return Uri.parse(str).buildUpon().query(null).build().toString();
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, String> m11385a(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str : C0710au.m5571g().mo11464a(uri)) {
            map.put(str, uri.getQueryParameter(str));
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    private final JSONArray m11386a(Collection<?> collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            m11395a(jSONArray, it.next());
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: a */
    private final JSONObject m11387a(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m11396a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static void m11388a(Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        Window window = activity.getWindow();
        if (window == null || window.getDecorView() == null || window.getDecorView().getViewTreeObserver() == null) {
            return;
        }
        window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /* JADX INFO: renamed from: a */
    public static void m11389a(Activity activity, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        Window window = activity.getWindow();
        if (window == null || window.getDecorView() == null || window.getDecorView().getViewTreeObserver() == null) {
            return;
        }
        window.getDecorView().getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
    }

    /* JADX INFO: renamed from: a */
    public static void m11390a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable th) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    @TargetApi(18)
    /* JADX INFO: renamed from: a */
    public static void m11391a(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            if (((Boolean) bxm.m10409f().m10546a(can.f9581cv)).booleanValue()) {
                m11410b(context, intent);
            }
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String string = uri.toString();
            C1560fm.m11610b(new StringBuilder(String.valueOf(string).length() + 26).append("Opening ").append(string).append(" in a new browser.").toString());
        } catch (ActivityNotFoundException e) {
            C1560fm.m11611b("No browser is found.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m11392a(Context context, String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            new C1646ir(context, str, it.next()).mo11076d();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m11393a(bwx bwxVar, boolean z) {
        Bundle bundle;
        Bundle bundle2 = bwxVar.f9219m != null ? bwxVar.f9219m : new Bundle();
        if (bundle2.getBundle(AdMobAdapter.class.getName()) != null) {
            bundle = bundle2.getBundle(AdMobAdapter.class.getName());
        } else {
            Bundle bundle3 = new Bundle();
            bundle2.putBundle(AdMobAdapter.class.getName(), bundle3);
            bundle = bundle3;
        }
        bundle.putBoolean("render_test_label", true);
    }

    /* JADX INFO: renamed from: a */
    public static void m11394a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            f10711a.post(runnable);
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m11395a(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(m11387a((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(m11442a((Map<String, ?>) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(m11386a((Collection<?>) obj));
            return;
        }
        if (!(obj instanceof Object[])) {
            jSONArray.put(obj);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (Object obj2 : (Object[]) obj) {
            m11395a(jSONArray2, obj2);
        }
        jSONArray.put(jSONArray2);
    }

    /* JADX INFO: renamed from: a */
    private final void m11396a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONObject.put(str, m11387a((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, m11442a((Map<String, ?>) obj));
            return;
        }
        if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, m11386a((Collection<?>) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, m11386a(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m11397a(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @TargetApi(24)
    /* JADX INFO: renamed from: a */
    public static boolean m11398a(Activity activity, Configuration configuration) {
        bxm.m10404a();
        int iM11560a = C1657jb.m11560a(activity, configuration.screenHeightDp);
        int iM11560a2 = C1657jb.m11560a(activity, configuration.screenWidthDp);
        DisplayMetrics displayMetricsM11376a = m11376a((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = displayMetricsM11376a.heightPixels;
        int i2 = displayMetricsM11376a.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int iIntValue = ((Integer) bxm.m10409f().m10546a(can.f9539cF)).intValue() * ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d));
        return m11397a(i, dimensionPixelSize + iM11560a, iIntValue) && m11397a(i2, iM11560a2, iIntValue);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11399a(Context context) {
        boolean z;
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity == null || resolveInfoResolveActivity.activityInfo == null) {
            C1560fm.m11615e("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
            return false;
        }
        if ((resolveInfoResolveActivity.activityInfo.configChanges & 16) == 0) {
            C1560fm.m11615e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "keyboard"));
            z = false;
        } else {
            z = true;
        }
        if ((resolveInfoResolveActivity.activityInfo.configChanges & 32) == 0) {
            C1560fm.m11615e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "keyboardHidden"));
            z = false;
        }
        if ((resolveInfoResolveActivity.activityInfo.configChanges & 128) == 0) {
            C1560fm.m11615e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "orientation"));
            z = false;
        }
        if ((resolveInfoResolveActivity.activityInfo.configChanges & 256) == 0) {
            C1560fm.m11615e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "screenLayout"));
            z = false;
        }
        if ((resolveInfoResolveActivity.activityInfo.configChanges & 512) == 0) {
            C1560fm.m11615e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "uiMode"));
            z = false;
        }
        if ((resolveInfoResolveActivity.activityInfo.configChanges & 1024) == 0) {
            C1560fm.m11615e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "screenSize"));
            z = false;
        }
        if ((resolveInfoResolveActivity.activityInfo.configChanges & 2048) != 0) {
            return z;
        }
        C1560fm.m11615e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "smallestScreenSize"));
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11400a(Context context, String str, String str2) {
        return C2040xg.m12562a(context).m12555a(str2, str) == 0;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11401a(bwx bwxVar) {
        Bundle bundle = bwxVar.f9219m != null ? bwxVar.f9219m : new Bundle();
        return (bundle.getBundle(AdMobAdapter.class.getName()) != null ? bundle.getBundle(AdMobAdapter.class.getName()) : new Bundle()).getBoolean("render_test_label", false);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11403a(ClassLoader classLoader, Class<?> cls, String str) {
        try {
            return cls.isAssignableFrom(Class.forName(str, false, classLoader));
        } catch (Throwable th) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int[] m11404a(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? m11429g() : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    /* JADX INFO: renamed from: b */
    public static int m11405b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String strValueOf = String.valueOf(e);
            C1560fm.m11615e(new StringBuilder(String.valueOf(strValueOf).length() + 22).append("Could not parse value:").append(strValueOf).toString());
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m11406b(View view) {
        if (view == null) {
            return null;
        }
        Bitmap bitmapM11423f = m11423f(view);
        return bitmapM11423f == null ? m11421e(view) : bitmapM11423f;
    }

    /* JADX INFO: renamed from: b */
    public static String m11407b() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length()).append(str).append(" ").append(str2).toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m11408b(Context context, String str) {
        try {
            return new String(C1308l.m7276a(context.openFileInput(str), true), "UTF-8");
        } catch (IOException e) {
            C1560fm.m11610b("Error reading from internal storage.");
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m11409b(Activity activity, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        Window window = activity.getWindow();
        if (window == null || window.getDecorView() == null || window.getDecorView().getViewTreeObserver() == null) {
            return;
        }
        window.getDecorView().getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
    }

    @TargetApi(18)
    /* JADX INFO: renamed from: b */
    public static void m11410b(Context context, Intent intent) {
        if (intent != null && C1310n.m7281d()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m11411b(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        m11392a(context, str, arrayList);
    }

    /* JADX INFO: renamed from: b */
    public static void m11412b(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            C1590gp.m11370a(runnable);
        }
    }

    /* JADX INFO: renamed from: c */
    public static float m11413c() {
        return C0710au.m5562B().m11485a();
    }

    /* JADX INFO: renamed from: c */
    public static void m11414c(Context context, String str, String str2) {
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(str, 0);
            fileOutputStreamOpenFileOutput.write(str2.getBytes("UTF-8"));
            fileOutputStreamOpenFileOutput.close();
        } catch (Exception e) {
            C1560fm.m11611b("Error writing to file in internal storage.", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m11415c(View view) {
        Activity activity;
        View rootView = view.getRootView();
        if (rootView != null) {
            Context context = rootView.getContext();
            activity = context instanceof Activity ? (Activity) context : null;
        }
        if (activity == null) {
            return false;
        }
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window == null ? null : window.getAttributes();
        return (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m11416c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    /* JADX INFO: renamed from: d */
    public static int m11417d(View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return -1;
        }
        return ((AdapterView) parent).getPositionForView(view);
    }

    /* JADX INFO: renamed from: d */
    protected static String m11418d(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable th) {
            return m11425f();
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m11419d() {
        return C0710au.m5562B().m11488b();
    }

    /* JADX INFO: renamed from: e */
    public static AlertDialog.Builder m11420e(Context context) {
        return new AlertDialog.Builder(context);
    }

    /* JADX INFO: renamed from: e */
    private static Bitmap m11421e(View view) {
        Bitmap bitmapCreateBitmap;
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width == 0 || height == 0) {
                C1560fm.m11615e("Width or height of view is zero");
                bitmapCreateBitmap = null;
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                view.layout(0, 0, width, height);
                view.draw(canvas);
            }
            return bitmapCreateBitmap;
        } catch (RuntimeException e) {
            C1560fm.m11611b("Fail to capture the webview", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static Bundle m11422e() {
        Bundle bundle = new Bundle();
        try {
            if (((Boolean) bxm.m10409f().m10546a(can.f9673y)).booleanValue()) {
                Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
                bundle.putParcelable("debug_memory_info", memoryInfo);
            }
            if (((Boolean) bxm.m10409f().m10546a(can.f9674z)).booleanValue()) {
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free_memory", runtime.freeMemory());
                bundle.putLong("runtime_max_memory", runtime.maxMemory());
                bundle.putLong("runtime_total_memory", runtime.totalMemory());
            }
            bundle.putInt("web_view_count", C0710au.m5573i().m11323y());
        } catch (Exception e) {
            C1560fm.m11613c("Unable to gather memory stats", e);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: f */
    private static Bitmap m11423f(View view) {
        Bitmap bitmapCreateBitmap;
        RuntimeException e;
        boolean zIsDrawingCacheEnabled;
        try {
            zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
        } catch (RuntimeException e2) {
            bitmapCreateBitmap = null;
            e = e2;
        }
        try {
            view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
        } catch (RuntimeException e3) {
            e = e3;
            C1560fm.m11611b("Fail to capture the web view", e);
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: f */
    public static bzy m11424f(Context context) {
        return new bzy(context);
    }

    /* JADX INFO: renamed from: f */
    private static String m11425f() {
        StringBuffer stringBuffer = new StringBuffer(256);
        stringBuffer.append("Mozilla/5.0 (Linux; U; Android");
        if (Build.VERSION.RELEASE != null) {
            stringBuffer.append(" ").append(Build.VERSION.RELEASE);
        }
        stringBuffer.append("; ").append(Locale.getDefault());
        if (Build.DEVICE != null) {
            stringBuffer.append("; ").append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                stringBuffer.append(" Build/").append(Build.DISPLAY);
            }
        }
        stringBuffer.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: f */
    public static String m11426f(String str) {
        return TextUtils.isEmpty(str) ? "" : str.split(";")[0].trim();
    }

    /* JADX INFO: renamed from: g */
    public static String m11427g(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.split(";");
        if (strArrSplit.length == 1) {
            return "";
        }
        for (int i = 1; i < strArrSplit.length; i++) {
            if (strArrSplit[i].trim().startsWith("charset")) {
                String[] strArrSplit2 = strArrSplit[i].trim().split("=");
                if (strArrSplit2.length > 1) {
                    return strArrSplit2[1].trim();
                }
            }
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r0.importance != 100) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r1.inKeyguardRestrictedInputMode() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r0 = (android.os.PowerManager) r6.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r0 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        r0 = r0.isScreenOn();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m11428g(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null) {
                return false;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (Process.myPid() == next.pid) {
                    break;
                }
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    private static int[] m11429g() {
        return new int[]{0, 0};
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        r0 = null;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap m11430h(Context context) {
        Bitmap bitmapM11421e;
        Bitmap bitmap = null;
        if (!(context instanceof Activity)) {
            return null;
        }
        try {
        } catch (RuntimeException e) {
            C1560fm.m11611b("Fail to capture screen shot", e);
        }
        if (((Boolean) bxm.m10409f().m10546a(can.f9486bF)).booleanValue()) {
            Window window = ((Activity) context).getWindow();
            bitmapM11421e = window != null ? m11423f(window.getDecorView().getRootView()) : bitmap;
        } else {
            bitmapM11421e = m11421e(((Activity) context).getWindow().getDecorView());
        }
        bitmap = bitmapM11421e;
        return bitmap;
    }

    /* JADX INFO: renamed from: i */
    public static AudioManager m11431i(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    /* JADX INFO: renamed from: j */
    public static float m11432j(Context context) {
        AudioManager audioManagerM11431i = m11431i(context);
        if (audioManagerM11431i == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManagerM11431i.getStreamMaxVolume(3);
        int streamVolume = audioManagerM11431i.getStreamVolume(3);
        if (streamMaxVolume != 0) {
            return streamVolume / streamMaxVolume;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: k */
    public static int m11433k(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return 0;
        }
        return applicationInfo.targetSdkVersion;
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: l */
    public static boolean m11434l(Context context) {
        KeyguardManager keyguardManagerM11439q;
        return context != null && C1310n.m7279b() && (keyguardManagerM11439q = m11439q(context)) != null && keyguardManagerM11439q.isKeyguardLocked();
    }

    /* JADX INFO: renamed from: m */
    public static boolean m11435m(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException e) {
            return true;
        } catch (Throwable th) {
            C1560fm.m11611b("Error loading class.", th);
            C0710au.m5573i().m11292a(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m11436n(Context context) {
        return DynamiteModule.m7332b(context, ModuleDescriptor.MODULE_ID);
    }

    /* JADX INFO: renamed from: o */
    public static int m11437o(Context context) {
        return DynamiteModule.m7325a(context, ModuleDescriptor.MODULE_ID);
    }

    /* JADX INFO: renamed from: p */
    private static String m11438p(Context context) {
        ActivityManager.RunningTaskInfo runningTaskInfo;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return null;
            }
            List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
            if (runningTasks != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                return runningTaskInfo.topActivity.getClassName();
            }
        } catch (Exception e) {
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    private static KeyguardManager m11439q(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    /* JADX INFO: renamed from: a */
    public final String m11440a(Context context, String str) {
        String strM11425f;
        synchronized (this.f10712b) {
            if (this.f10714d != null) {
                strM11425f = this.f10714d;
            } else if (str == null) {
                strM11425f = m11425f();
            } else {
                try {
                    this.f10714d = C0710au.m5571g().mo11462a(context);
                } catch (Exception e) {
                }
                if (TextUtils.isEmpty(this.f10714d)) {
                    bxm.m10404a();
                    if (C1657jb.m11573b()) {
                        this.f10714d = m11418d(context);
                    } else {
                        this.f10714d = null;
                        f10711a.post(new RunnableC1598gx(this, context));
                        while (this.f10714d == null) {
                            try {
                                this.f10712b.wait();
                            } catch (InterruptedException e2) {
                                this.f10714d = m11425f();
                                String strValueOf = String.valueOf(this.f10714d);
                                C1560fm.m11615e(strValueOf.length() != 0 ? "Interrupted, use default user agent: ".concat(strValueOf) : new String("Interrupted, use default user agent: "));
                            }
                        }
                    }
                }
                String strValueOf2 = String.valueOf(this.f10714d);
                this.f10714d = new StringBuilder(String.valueOf(strValueOf2).length() + 10 + String.valueOf(str).length()).append(strValueOf2).append(" (Mobile; ").append(str).toString();
                try {
                    if (C2040xg.m12562a(context).m12557a()) {
                        this.f10714d = String.valueOf(this.f10714d).concat(";aia");
                    }
                } catch (Exception e3) {
                    C0710au.m5573i().m11292a(e3, "AdUtil.getUserAgent");
                }
                this.f10714d = String.valueOf(this.f10714d).concat(")");
                strM11425f = this.f10714d;
            }
        }
        return strM11425f;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m11441a(Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return m11387a(bundle);
        } catch (JSONException e) {
            C1560fm.m11611b("Error converting Bundle to JSON", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m11442a(Map<String, ?> map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                m11396a(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            String strValueOf = String.valueOf(e.getMessage());
            throw new JSONException(strValueOf.length() != 0 ? "Could not convert map to JSON: ".concat(strValueOf) : new String("Could not convert map to JSON: "));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11443a(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (z) {
            C0710au.m5569e();
            bundle.putString("device", m11407b());
            bundle.putString("eids", TextUtils.join(",", can.m10548a()));
        }
        bxm.m10404a();
        C1657jb.m11566a(context, str, str2, bundle, z, new C1599gy(this, context, str));
    }

    /* JADX INFO: renamed from: a */
    public final void m11444a(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", m11440a(context, str));
        httpURLConnection.setUseCaches(false);
    }

    /* JADX INFO: renamed from: a */
    public final void m11445a(Context context, List<String> list) {
        if ((context instanceof Activity) && !TextUtils.isEmpty(btb.m10237a((Activity) context))) {
            if (list == null) {
                C1560fm.m11343a("Cannot ping urls: empty list.");
            } else {
                if (!cbl.m10592a(context)) {
                    C1560fm.m11343a("Cannot ping url because custom tabs is not supported");
                    return;
                }
                cbl cblVar = new cbl();
                cblVar.m10594a(new C1597gw(this, list, cblVar, context));
                cblVar.m10593a((Activity) context);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11446a(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return m11447a(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, m11439q(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m11447a(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z;
        if (C0710au.m5569e().f10713c) {
            z = true;
        } else {
            if (keyguardManager == null ? false : keyguardManager.inKeyguardRestrictedInputMode()) {
                if (!((Boolean) bxm.m10409f().m10546a(can.f9507ba)).booleanValue() || !m11415c(view)) {
                    z = false;
                }
            }
        }
        if (view.getVisibility() == 0 && view.isShown()) {
            if ((powerManager == null || powerManager.isScreenOn()) && z) {
                if (!((Boolean) bxm.m10409f().m10546a(can.f9452aY)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m11448b(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (((Boolean) bxm.m10409f().m10546a(can.f9510bd)).booleanValue()) {
            m11443a(context, str, str2, bundle, z);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11449b(Context context) {
        if (this.f10715e) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new C1602ha(this, null), intentFilter);
        this.f10715e = true;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final int[] m11450b(Activity activity) {
        int[] iArrM11404a = m11404a(activity);
        bxm.m10404a();
        bxm.m10404a();
        return new int[]{C1657jb.m11570b(activity, iArrM11404a[0]), C1657jb.m11570b(activity, iArrM11404a[1])};
    }

    /* JADX INFO: renamed from: c */
    public final boolean m11451c(Context context) {
        if (this.f10716f) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new C1600gz(this, null), intentFilter);
        this.f10716f = true;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final int[] m11452c(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArrM11429g = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? m11429g() : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        bxm.m10404a();
        bxm.m10404a();
        return new int[]{C1657jb.m11570b(activity, iArrM11429g[0]), C1657jb.m11570b(activity, iArrM11429g[1])};
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026 A[Catch: all -> 0x0044, TryCatch #0 {, blocks: (B:7:0x000a, B:9:0x000e, B:12:0x0038, B:13:0x0042, B:11:0x0026), top: B:20:0x000a, outer: #1 }] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m11453d(String str) {
        boolean zMatches;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            synchronized (this) {
                if (this.f10717g != null) {
                    if (!((String) bxm.m10409f().m10546a(can.f9464ak)).equals(this.f10717g.pattern())) {
                        this.f10717g = Pattern.compile((String) bxm.m10409f().m10546a(can.f9464ak));
                    }
                    zMatches = this.f10717g.matcher(str).matches();
                }
            }
            return zMatches;
        } catch (PatternSyntaxException e) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026 A[Catch: all -> 0x0044, TryCatch #0 {, blocks: (B:7:0x000a, B:9:0x000e, B:12:0x0038, B:13:0x0042, B:11:0x0026), top: B:20:0x000a, outer: #1 }] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m11454e(String str) {
        boolean zMatches;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            synchronized (this) {
                if (this.f10718h != null) {
                    if (!((String) bxm.m10409f().m10546a(can.f9465al)).equals(this.f10718h.pattern())) {
                        this.f10718h = Pattern.compile((String) bxm.m10409f().m10546a(can.f9465al));
                    }
                    zMatches = this.f10718h.matcher(str).matches();
                }
            }
            return zMatches;
        } catch (PatternSyntaxException e) {
            return false;
        }
    }
}
