package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.C0710au;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.hb */
/* JADX INFO: loaded from: classes.dex */
@cnb
@TargetApi(8)
public class C1603hb {
    private C1603hb() {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11456a(InterfaceC1758mv interfaceC1758mv) {
        if (interfaceC1758mv == null) {
            return false;
        }
        interfaceC1758mv.onPause();
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11457b(InterfaceC1758mv interfaceC1758mv) {
        if (interfaceC1758mv == null) {
            return false;
        }
        interfaceC1758mv.onResume();
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m11458e() {
        int iMyUid = Process.myUid();
        return iMyUid == 0 || iMyUid == 1000;
    }

    /* JADX INFO: renamed from: a */
    public int mo11459a() {
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public Drawable mo11460a(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    /* JADX INFO: renamed from: a */
    public C1759mw mo11461a(InterfaceC1758mv interfaceC1758mv, boolean z) {
        return new C1759mw(interfaceC1758mv, z);
    }

    /* JADX INFO: renamed from: a */
    public String mo11462a(Context context) {
        return "";
    }

    /* JADX INFO: renamed from: a */
    public String mo11463a(SslError sslError) {
        return "";
    }

    /* JADX INFO: renamed from: a */
    public Set<String> mo11464a(Uri uri) {
        String encodedQuery;
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            do {
                int iIndexOf = encodedQuery.indexOf(38, i);
                if (iIndexOf == -1) {
                    iIndexOf = encodedQuery.length();
                }
                int iIndexOf2 = encodedQuery.indexOf(61, i);
                if (iIndexOf2 > iIndexOf || iIndexOf2 == -1) {
                    iIndexOf2 = iIndexOf;
                }
                linkedHashSet.add(Uri.decode(encodedQuery.substring(i, iIndexOf2)));
                i = iIndexOf + 1;
            } while (i < encodedQuery.length());
            return Collections.unmodifiableSet(linkedHashSet);
        }
        return Collections.emptySet();
    }

    /* JADX INFO: renamed from: a */
    public void mo11465a(Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        Window window = activity.getWindow();
        if (window == null || window.getDecorView() == null || window.getDecorView().getViewTreeObserver() == null) {
            return;
        }
        mo11467a(window.getDecorView().getViewTreeObserver(), onGlobalLayoutListener);
    }

    /* JADX INFO: renamed from: a */
    public void mo11466a(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: a */
    public void mo11467a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo11468a(DownloadManager.Request request) {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo11469a(Context context, WebSettings webSettings) {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo11470a(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo11471a(Window window) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public int mo11472b() {
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public void mo11473b(Context context) {
        C0710au.m5573i().m11321w();
    }

    /* JADX INFO: renamed from: b */
    public boolean mo11474b(View view) {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public int mo11475c() {
        return 5;
    }

    /* JADX INFO: renamed from: c */
    public CookieManager mo11476c(Context context) {
        if (m11458e()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            C1560fm.m11611b("Failed to obtain CookieManager.", th);
            C0710au.m5573i().m11292a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public WebChromeClient mo11477c(InterfaceC1758mv interfaceC1758mv) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo11478c(View view) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public ViewGroup.LayoutParams mo11479d() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    /* JADX INFO: renamed from: f */
    public int mo11480f() {
        return 0;
    }
}
