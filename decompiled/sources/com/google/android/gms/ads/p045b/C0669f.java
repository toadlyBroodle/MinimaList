package com.google.android.gms.ads.p045b;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.C1668jm;
import com.google.android.gms.internal.cdh;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.google.android.gms.ads.b.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0669f {

    /* JADX INFO: renamed from: a */
    public static WeakHashMap<View, C0669f> f4357a = new WeakHashMap<>();

    /* JADX INFO: renamed from: b */
    private cdh f4358b;

    /* JADX INFO: renamed from: c */
    private WeakReference<View> f4359c;

    /* JADX INFO: renamed from: a */
    public final void m5365a(AbstractC0666c abstractC0666c) {
        View view = this.f4359c != null ? this.f4359c.get() : null;
        if (view == null) {
            C1668jm.m11615e("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!f4357a.containsKey(view)) {
            f4357a.put(view, this);
        }
        if (this.f4358b != null) {
            try {
                this.f4358b.mo10736a((InterfaceC0652a) abstractC0666c.mo5343a());
            } catch (RemoteException e) {
                C1668jm.m11611b("Unable to call setNativeAd on delegate", e);
            }
        }
    }
}
