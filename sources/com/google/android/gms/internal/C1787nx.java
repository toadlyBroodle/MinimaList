package com.google.android.gms.internal;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.ads.internal.C0734br;
import com.google.android.gms.ads.internal.overlay.BinderC0829d;

/* JADX INFO: renamed from: com.google.android.gms.internal.nx */
/* JADX INFO: loaded from: classes.dex */
@cnb
@TargetApi(11)
public class C1787nx extends WebChromeClient {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1758mv f11204a;

    public C1787nx(InterfaceC1758mv interfaceC1758mv) {
        this.f11204a = interfaceC1758mv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private static Context m11915a(WebView webView) {
        if (!(webView instanceof InterfaceC1758mv)) {
            return webView.getContext();
        }
        InterfaceC1758mv interfaceC1758mv = (InterfaceC1758mv) webView;
        Activity activityMo11755d = interfaceC1758mv.mo11755d();
        return activityMo11755d == null ? interfaceC1758mv.getContext() : activityMo11755d;
    }

    /* JADX INFO: renamed from: a */
    private final boolean m11916a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        C0734br c0734brM11847a;
        boolean z2 = true;
        try {
            if (this.f11204a == null || this.f11204a.mo11833w() == null || this.f11204a.mo11833w().m11847a() == null || (c0734brM11847a = this.f11204a.mo11833w().m11847a()) == null || c0734brM11847a.m5645b()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(str2);
                if (z) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(context);
                    textView.setText(str3);
                    EditText editText = new EditText(context);
                    editText.setText(str4);
                    linearLayout.addView(textView);
                    linearLayout.addView(editText);
                    builder.setView(linearLayout).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC1794od(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC1793oc(jsPromptResult)).setOnCancelListener(new DialogInterfaceOnCancelListenerC1792ob(jsPromptResult)).create().show();
                } else {
                    builder.setMessage(str3).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC1791oa(jsResult)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC1789nz(jsResult)).setOnCancelListener(new DialogInterfaceOnCancelListenerC1788ny(jsResult)).create().show();
                }
            } else {
                c0734brM11847a.m5644a(new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str3).length()).append("window.").append(str).append("('").append(str3).append("')").toString());
                z2 = false;
            }
        } catch (WindowManager.BadTokenException e) {
            C1560fm.m11613c("Fail to display Dialog.", e);
        }
        return z2;
    }

    /* JADX INFO: renamed from: a */
    protected final void m11917a(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        BinderC0829d binderC0829dMo11829s = this.f11204a.mo11829s();
        if (binderC0829dMo11829s == null) {
            C1560fm.m11615e("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            binderC0829dMo11829s.m5784a(view, customViewCallback);
            binderC0829dMo11829s.m5781a(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof InterfaceC1758mv)) {
            C1560fm.m11615e("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        BinderC0829d binderC0829dMo11829s = ((InterfaceC1758mv) webView).mo11829s();
        if (binderC0829dMo11829s == null) {
            C1560fm.m11615e("Tried to close an AdWebView not associated with an overlay.");
        } else {
            binderC0829dMo11829s.m5780a();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage.message();
        String strSourceId = consoleMessage.sourceId();
        String string = new StringBuilder(String.valueOf(strMessage).length() + 19 + String.valueOf(strSourceId).length()).append("JS: ").append(strMessage).append(" (").append(strSourceId).append(":").append(consoleMessage.lineNumber()).append(")").toString();
        if (string.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        switch (C1795oe.f11212a[consoleMessage.messageLevel().ordinal()]) {
            case 1:
                C1560fm.m11612c(string);
                break;
            case 2:
                C1560fm.m11615e(string);
                break;
            case 3:
            case 4:
                C1560fm.m11614d(string);
                break;
            case 5:
                C1560fm.m11610b(string);
                break;
            default:
                C1560fm.m11614d(string);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(this.f11204a.mo11833w());
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(Math.min(131072L, j4) + j, 1048576L);
            } else if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        } else if (j2 > j4 || j2 > 1048576) {
            j2 = 0;
        }
        quotaUpdater.updateQuota(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            C0710au.m5569e();
            if (!C1596gv.m11400a(this.f11204a.getContext(), this.f11204a.getContext().getPackageName(), "android.permission.ACCESS_FINE_LOCATION")) {
                C0710au.m5569e();
                z = C1596gv.m11400a(this.f11204a.getContext(), this.f11204a.getContext().getPackageName(), "android.permission.ACCESS_COARSE_LOCATION");
            }
            callback.invoke(str, z, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        BinderC0829d binderC0829dMo11829s = this.f11204a.mo11829s();
        if (binderC0829dMo11829s == null) {
            C1560fm.m11615e("Could not get ad overlay when hiding custom view.");
        } else {
            binderC0829dMo11829s.m5787b();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return m11916a(m11915a(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return m11916a(m11915a(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return m11916a(m11915a(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return m11916a(m11915a(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        long j3 = 131072 + j;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0L);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        m11917a(view, -1, customViewCallback);
    }
}
