package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.C0710au;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.google.android.gms.internal.oh */
/* JADX INFO: loaded from: classes.dex */
@cnb
@TargetApi(11)
public class C1798oh extends C1759mw {
    public C1798oh(InterfaceC1758mv interfaceC1758mv, boolean z) {
        super(interfaceC1758mv, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    protected final WebResourceResponse m11918a(WebView webView, String str, Map<String, String> map) {
        if (!(webView instanceof InterfaceC1758mv)) {
            C1560fm.m11615e("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        InterfaceC1758mv interfaceC1758mv = (InterfaceC1758mv) webView;
        if (this.f11086b != null) {
            this.f11086b.mo11210a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            return super.shouldInterceptRequest(webView, str);
        }
        if (interfaceC1758mv.mo11833w() != null) {
            interfaceC1758mv.mo11833w().m11876n();
        }
        String str2 = interfaceC1758mv.mo11831u().m11930d() ? (String) bxm.m10409f().m10546a(can.f9407G) : interfaceC1758mv.mo11836z() ? (String) bxm.m10409f().m10546a(can.f9406F) : (String) bxm.m10409f().m10546a(can.f9405E);
        try {
            Context context = interfaceC1758mv.getContext();
            String str3 = interfaceC1758mv.mo11760k().f10855a;
            HashMap map2 = new HashMap();
            map2.put("User-Agent", C0710au.m5569e().m11440a(context, str3));
            map2.put("Cache-Control", "max-stale=3600");
            String str4 = new C1633ie(context).m11531a(str2, map2).get(60L, TimeUnit.SECONDS);
            if (str4 == null) {
                return null;
            }
            return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str4.getBytes("UTF-8")));
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            String strValueOf = String.valueOf(e.getMessage());
            C1560fm.m11615e(strValueOf.length() != 0 ? "Could not fetch MRAID JS. ".concat(strValueOf) : new String("Could not fetch MRAID JS. "));
            return null;
        }
    }
}
