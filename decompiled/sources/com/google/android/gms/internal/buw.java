package com.google.android.gms.internal;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.common.util.C1310n;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@cnb
@TargetApi(14)
public final class buw extends Thread {

    /* JADX INFO: renamed from: e */
    private final bur f9079e;

    /* JADX INFO: renamed from: f */
    private final cmz f9080f;

    /* JADX INFO: renamed from: a */
    private boolean f9075a = false;

    /* JADX INFO: renamed from: b */
    private boolean f9076b = false;

    /* JADX INFO: renamed from: c */
    private boolean f9077c = false;

    /* JADX INFO: renamed from: d */
    private final Object f9078d = new Object();

    /* JADX INFO: renamed from: h */
    private final int f9082h = ((Integer) bxm.m10409f().m10546a(can.f9412L)).intValue();

    /* JADX INFO: renamed from: i */
    private final int f9083i = ((Integer) bxm.m10409f().m10546a(can.f9413M)).intValue();

    /* JADX INFO: renamed from: j */
    private final int f9084j = ((Integer) bxm.m10409f().m10546a(can.f9414N)).intValue();

    /* JADX INFO: renamed from: k */
    private final int f9085k = ((Integer) bxm.m10409f().m10546a(can.f9415O)).intValue();

    /* JADX INFO: renamed from: l */
    private final int f9086l = ((Integer) bxm.m10409f().m10546a(can.f9418R)).intValue();

    /* JADX INFO: renamed from: m */
    private final int f9087m = ((Integer) bxm.m10409f().m10546a(can.f9420T)).intValue();

    /* JADX INFO: renamed from: n */
    private final int f9088n = ((Integer) bxm.m10409f().m10546a(can.f9421U)).intValue();

    /* JADX INFO: renamed from: g */
    private final int f9081g = ((Integer) bxm.m10409f().m10546a(can.f9416P)).intValue();

    /* JADX INFO: renamed from: o */
    private final String f9089o = (String) bxm.m10409f().m10546a(can.f9423W);

    /* JADX INFO: renamed from: p */
    private final boolean f9090p = ((Boolean) bxm.m10409f().m10546a(can.f9425Y)).booleanValue();

    public buw(bur burVar, cmz cmzVar) {
        this.f9079e = burVar;
        this.f9080f = cmzVar;
        setName("ContentFetchTask");
    }

    /* JADX INFO: renamed from: a */
    private final bva m10301a(View view, buq buqVar) {
        boolean z;
        int i = 0;
        if (view == null) {
            return new bva(this, 0, 0);
        }
        Context contextM10289b = C0710au.m5572h().m10289b();
        if (contextM10289b != null) {
            String str = (String) view.getTag(contextM10289b.getResources().getIdentifier((String) bxm.m10409f().m10546a(can.f9422V), "id", contextM10289b.getPackageName()));
            if (!TextUtils.isEmpty(this.f9089o) && str != null && str.equals(this.f9089o)) {
                return new bva(this, 0, 0);
            }
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new bva(this, 0, 0);
            }
            buqVar.m10273b(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new bva(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof InterfaceC1758mv)) {
            buqVar.m10278g();
            WebView webView = (WebView) view;
            if (C1310n.m7282e()) {
                buqVar.m10278g();
                webView.post(new buy(this, buqVar, webView, globalVisibleRect));
                z = true;
            } else {
                z = false;
            }
            return z ? new bva(this, 0, 1) : new bva(this, 0, 0);
        }
        if (!(view instanceof ViewGroup)) {
            return new bva(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i2 = 0;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            bva bvaVarM10301a = m10301a(viewGroup.getChildAt(i3), buqVar);
            i2 += bvaVarM10301a.f9101a;
            i += bvaVarM10301a.f9102b;
        }
        return new bva(this, i2, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r0.importance != 100) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        if (r1.inKeyguardRestrictedInputMode() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        r0 = (android.os.PowerManager) r3.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r0 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r0 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        r0 = r0.isScreenOn();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m10302e() {
        try {
            Context contextM10289b = C0710au.m5572h().m10289b();
            if (contextM10289b == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) contextM10289b.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) contextM10289b.getSystemService("keyguard");
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
            C0710au.m5573i().m11292a(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m10303f() {
        synchronized (this.f9078d) {
            this.f9076b = true;
            C1560fm.m11610b(new StringBuilder(42).append("ContentFetchThread: paused, mPause = ").append(this.f9076b).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10304a() {
        synchronized (this.f9078d) {
            if (this.f9075a) {
                C1560fm.m11610b("Content hash thread already started, quiting...");
            } else {
                this.f9075a = true;
                start();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m10305a(View view) {
        try {
            buq buqVar = new buq(this.f9082h, this.f9083i, this.f9084j, this.f9085k, this.f9086l, this.f9087m, this.f9088n);
            bva bvaVarM10301a = m10301a(view, buqVar);
            buqVar.m10279h();
            if (bvaVarM10301a.f9101a == 0 && bvaVarM10301a.f9102b == 0) {
                return;
            }
            if (bvaVarM10301a.f9102b == 0 && buqVar.m10281j() == 0) {
                return;
            }
            if (bvaVarM10301a.f9102b == 0 && this.f9079e.m10283a(buqVar)) {
                return;
            }
            this.f9079e.m10285c(buqVar);
        } catch (Exception e) {
            C1560fm.m11611b("Exception in fetchContentOnUIThread", e);
            this.f9080f.mo11143a(e, "ContentFetchTask.fetchContent");
        }
    }

    /* JADX INFO: renamed from: a */
    final void m10306a(buq buqVar, WebView webView, String str, boolean z) {
        buqVar.m10277f();
        try {
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString("text");
                if (this.f9090p || TextUtils.isEmpty(webView.getTitle())) {
                    buqVar.m10270a(strOptString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    buqVar.m10270a(new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(strOptString).length()).append(title).append("\n").append(strOptString).toString(), z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (buqVar.m10271a()) {
                this.f9079e.m10284b(buqVar);
            }
        } catch (JSONException e) {
            C1560fm.m11610b("Json string may be malformed.");
        } catch (Throwable th) {
            C1560fm.m11608a("Failed to get webview content.", th);
            this.f9080f.mo11143a(th, "ContentFetchTask.processWebViewContent");
        }
    }

    /* JADX INFO: renamed from: b */
    public final buq m10307b() {
        return this.f9079e.m10282a();
    }

    /* JADX INFO: renamed from: c */
    public final void m10308c() {
        synchronized (this.f9078d) {
            this.f9076b = false;
            this.f9078d.notifyAll();
            C1560fm.m11610b("ContentFetchThread: wakeup");
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10309d() {
        return this.f9076b;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                try {
                    if (m10302e()) {
                        Activity activityM10286a = C0710au.m5572h().m10286a();
                        if (activityM10286a == null) {
                            C1560fm.m11610b("ContentFetchThread: no activity. Sleeping.");
                            m10303f();
                        } else if (activityM10286a != null) {
                            View viewFindViewById = null;
                            try {
                                if (activityM10286a.getWindow() != null && activityM10286a.getWindow().getDecorView() != null) {
                                    viewFindViewById = activityM10286a.getWindow().getDecorView().findViewById(R.id.content);
                                }
                            } catch (Exception e) {
                                C0710au.m5573i().m11292a(e, "ContentFetchTask.extractContent");
                                C1560fm.m11610b("Failed getting root view of activity. Content not extracted.");
                            }
                            if (viewFindViewById != null && viewFindViewById != null) {
                                viewFindViewById.post(new bux(this, viewFindViewById));
                            }
                        }
                    } else {
                        C1560fm.m11610b("ContentFetchTask: sleeping");
                        m10303f();
                    }
                    Thread.sleep(this.f9081g * 1000);
                } catch (InterruptedException e2) {
                    C1560fm.m11611b("Error in ContentFetchTask", e2);
                }
            } catch (Exception e3) {
                C1560fm.m11611b("Error in ContentFetchTask", e3);
                this.f9080f.mo11143a(e3, "ContentFetchTask.run");
            }
            synchronized (this.f9078d) {
                while (this.f9076b) {
                    try {
                        C1560fm.m11610b("ContentFetchTask: waiting");
                        this.f9078d.wait();
                    } catch (InterruptedException e4) {
                    }
                }
            }
        }
    }
}
