package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.can;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.ap */
/* JADX INFO: loaded from: classes.dex */
final class C0705ap extends WebViewClient {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ BinderC0704ao f4459a;

    C0705ap(BinderC0704ao binderC0704ao) {
        this.f4459a = binderC0704ao;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.f4459a.f4456g != null) {
            try {
                this.f4459a.f4456g.mo10365a(0);
            } catch (RemoteException e) {
                C1560fm.m11613c("Could not call AdListener.onAdFailedToLoad().", e);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f4459a.m5553d())) {
            return false;
        }
        if (str.startsWith((String) bxm.m10409f().m10546a(can.f9564ce))) {
            if (this.f4459a.f4456g != null) {
                try {
                    this.f4459a.f4456g.mo10365a(3);
                } catch (RemoteException e) {
                    C1560fm.m11613c("Could not call AdListener.onAdFailedToLoad().", e);
                }
            }
            this.f4459a.m5550a(0);
            return true;
        }
        if (str.startsWith((String) bxm.m10409f().m10546a(can.f9565cf))) {
            if (this.f4459a.f4456g != null) {
                try {
                    this.f4459a.f4456g.mo10365a(0);
                } catch (RemoteException e2) {
                    C1560fm.m11613c("Could not call AdListener.onAdFailedToLoad().", e2);
                }
            }
            this.f4459a.m5550a(0);
            return true;
        }
        if (str.startsWith((String) bxm.m10409f().m10546a(can.f9566cg))) {
            if (this.f4459a.f4456g != null) {
                try {
                    this.f4459a.f4456g.mo10367c();
                } catch (RemoteException e3) {
                    C1560fm.m11613c("Could not call AdListener.onAdLoaded().", e3);
                }
            }
            this.f4459a.m5550a(this.f4459a.m5551b(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        if (this.f4459a.f4456g != null) {
            try {
                this.f4459a.f4456g.mo10366b();
            } catch (RemoteException e4) {
                C1560fm.m11613c("Could not call AdListener.onAdLeftApplication().", e4);
            }
        }
        this.f4459a.m5546d(this.f4459a.m5544c(str));
        return true;
    }
}
