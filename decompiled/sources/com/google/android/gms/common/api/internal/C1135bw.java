package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.p006a.ActivityC0155k;
import android.support.v4.p006a.ComponentCallbacksC0154j;
import android.support.v4.p018i.C0207a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.bw */
/* JADX INFO: loaded from: classes.dex */
public final class C1135bw extends ComponentCallbacksC0154j implements InterfaceC1117be {

    /* JADX INFO: renamed from: a */
    private static WeakHashMap<ActivityC0155k, WeakReference<C1135bw>> f5678a = new WeakHashMap<>();

    /* JADX INFO: renamed from: b */
    private Map<String, LifecycleCallback> f5679b = new C0207a();

    /* JADX INFO: renamed from: c */
    private int f5680c = 0;

    /* JADX INFO: renamed from: d */
    private Bundle f5681d;

    /* JADX INFO: renamed from: a */
    public static C1135bw m6903a(ActivityC0155k activityC0155k) {
        C1135bw c1135bw;
        WeakReference<C1135bw> weakReference = f5678a.get(activityC0155k);
        if (weakReference == null || (c1135bw = weakReference.get()) == null) {
            try {
                c1135bw = (C1135bw) activityC0155k.m1012f().mo1072a("SupportLifecycleFragmentImpl");
                if (c1135bw == null || c1135bw.m979q()) {
                    c1135bw = new C1135bw();
                    activityC0155k.m1012f().mo1073a().mo838a(c1135bw, "SupportLifecycleFragmentImpl").mo852c();
                }
                f5678a.put(activityC0155k, new WeakReference<>(c1135bw));
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
            }
        }
        return c1135bw;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1117be
    /* JADX INFO: renamed from: a */
    public final <T extends LifecycleCallback> T mo6882a(String str, Class<T> cls) {
        return cls.cast(this.f5679b.get(str));
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: a */
    public final void mo919a(int i, int i2, Intent intent) {
        super.mo919a(i, i2, intent);
        Iterator<LifecycleCallback> it = this.f5679b.values().iterator();
        while (it.hasNext()) {
            it.next().mo6717a(i, i2, intent);
        }
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: a */
    public final void mo869a(Bundle bundle) {
        super.mo869a(bundle);
        this.f5680c = 1;
        this.f5681d = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f5679b.entrySet()) {
            entry.getValue().mo6718a(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1117be
    /* JADX INFO: renamed from: a */
    public final void mo6883a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f5679b.containsKey(str)) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 59).append("LifecycleCallback with tag ").append(str).append(" already added to this fragment.").toString());
        }
        this.f5679b.put(str, lifecycleCallback);
        if (this.f5680c > 0) {
            new Handler(Looper.getMainLooper()).post(new RunnableC1136bx(this, lifecycleCallback, str));
        }
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: a */
    public final void mo936a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo936a(str, fileDescriptor, printWriter, strArr);
        Iterator<LifecycleCallback> it = this.f5679b.values().iterator();
        while (it.hasNext()) {
            it.next().mo6719a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: d */
    public final void mo877d() {
        super.mo877d();
        this.f5680c = 2;
        Iterator<LifecycleCallback> it = this.f5679b.values().iterator();
        while (it.hasNext()) {
            it.next().mo6720b();
        }
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: e */
    public final void mo879e() {
        super.mo879e();
        this.f5680c = 4;
        Iterator<LifecycleCallback> it = this.f5679b.values().iterator();
        while (it.hasNext()) {
            it.next().mo6250d();
        }
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: e */
    public final void mo880e(Bundle bundle) {
        super.mo880e(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f5679b.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().mo6721b(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1117be
    /* JADX INFO: renamed from: k_ */
    public final /* synthetic */ Activity mo6884k_() {
        return m969k();
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: t */
    public final void mo982t() {
        super.mo982t();
        this.f5680c = 3;
        Iterator<LifecycleCallback> it = this.f5679b.values().iterator();
        while (it.hasNext()) {
            it.next().mo6722c();
        }
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: v */
    public final void mo984v() {
        super.mo984v();
        this.f5680c = 5;
        Iterator<LifecycleCallback> it = this.f5679b.values().iterator();
        while (it.hasNext()) {
            it.next().m6723e();
        }
    }
}
