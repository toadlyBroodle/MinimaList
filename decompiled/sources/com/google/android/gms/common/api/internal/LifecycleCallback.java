package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class LifecycleCallback {

    /* JADX INFO: renamed from: a */
    protected final InterfaceC1117be f5519a;

    protected LifecycleCallback(InterfaceC1117be interfaceC1117be) {
        this.f5519a = interfaceC1117be;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC1117be m6714a(Activity activity) {
        return m6715a(new C1116bd(activity));
    }

    /* JADX INFO: renamed from: a */
    protected static InterfaceC1117be m6715a(C1116bd c1116bd) {
        if (c1116bd.m6878a()) {
            return C1135bw.m6903a(c1116bd.m6881d());
        }
        if (c1116bd.m6879b()) {
            return FragmentC1118bf.m6886a(c1116bd.m6880c());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static InterfaceC1117be getChimeraLifecycleFragmentImpl(C1116bd c1116bd) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* JADX INFO: renamed from: a */
    public final Activity m6716a() {
        return this.f5519a.mo6884k_();
    }

    /* JADX INFO: renamed from: a */
    public void mo6717a(int i, int i2, Intent intent) {
    }

    /* JADX INFO: renamed from: a */
    public void mo6718a(Bundle bundle) {
    }

    /* JADX INFO: renamed from: a */
    public void mo6719a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* JADX INFO: renamed from: b */
    public void mo6720b() {
    }

    /* JADX INFO: renamed from: b */
    public void mo6721b(Bundle bundle) {
    }

    /* JADX INFO: renamed from: c */
    public void mo6722c() {
    }

    /* JADX INFO: renamed from: d */
    public void mo6250d() {
    }

    /* JADX INFO: renamed from: e */
    public void m6723e() {
    }
}
