package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.common.api.InterfaceC1082i;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.mo */
/* JADX INFO: loaded from: classes.dex */
@cnb
public abstract class AbstractC1751mo implements InterfaceC1082i {

    /* JADX INFO: renamed from: a */
    protected Context f11056a;

    /* JADX INFO: renamed from: b */
    private String f11057b;

    /* JADX INFO: renamed from: c */
    private WeakReference<InterfaceC1739mc> f11058c;

    public AbstractC1751mo(InterfaceC1739mc interfaceC1739mc) {
        this.f11056a = interfaceC1739mc.getContext();
        this.f11057b = C0710au.m5569e().m11440a(this.f11056a, interfaceC1739mc.mo11760k().f10855a);
        this.f11058c = new WeakReference<>(interfaceC1739mc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m11789a(String str, Map<String, String> map) {
        InterfaceC1739mc interfaceC1739mc = this.f11058c.get();
        if (interfaceC1739mc != null) {
            interfaceC1739mc.m11751a(str, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static String m11790b(String str) {
        switch (str) {
        }
        return "internal";
    }

    @Override // com.google.android.gms.common.api.InterfaceC1082i
    /* JADX INFO: renamed from: a */
    public void mo6702a() {
    }

    /* JADX INFO: renamed from: a */
    protected final void m11791a(String str, String str2, int i) {
        C1657jb.f10832a.post(new RunnableC1753mq(this, str, str2, i));
    }

    /* JADX INFO: renamed from: a */
    public final void m11792a(String str, String str2, String str3, String str4) {
        C1657jb.f10832a.post(new RunnableC1754mr(this, str, str2, str3, str4));
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo11793a(String str);

    /* JADX INFO: renamed from: b */
    public abstract void mo11794b();
}
