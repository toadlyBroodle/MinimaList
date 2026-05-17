package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.ahs;
import com.google.android.gms.internal.ahy;
import com.google.android.gms.internal.aix;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
@DynamiteApi
public class TagManagerApiImpl extends AbstractBinderC2141u {

    /* JADX INFO: renamed from: a */
    private aix f12766a;

    @Override // com.google.android.gms.tagmanager.InterfaceC2140t
    public void initialize(InterfaceC0652a interfaceC0652a, InterfaceC2137q interfaceC2137q, InterfaceC2128h interfaceC2128h) {
        this.f12766a = aix.m8034a((Context) BinderC0654c.m5330a(interfaceC0652a), interfaceC2137q, interfaceC2128h);
        this.f12766a.m8048a((String[]) null);
    }

    @Override // com.google.android.gms.tagmanager.InterfaceC2140t
    @Deprecated
    public void preview(Intent intent, InterfaceC0652a interfaceC0652a) {
        ahs.m7944b("Deprecated. Please use previewIntent instead.");
    }

    @Override // com.google.android.gms.tagmanager.InterfaceC2140t
    public void previewIntent(Intent intent, InterfaceC0652a interfaceC0652a, InterfaceC0652a interfaceC0652a2, InterfaceC2137q interfaceC2137q, InterfaceC2128h interfaceC2128h) {
        Context context = (Context) BinderC0654c.m5330a(interfaceC0652a);
        Context context2 = (Context) BinderC0654c.m5330a(interfaceC0652a2);
        this.f12766a = aix.m8034a(context, interfaceC2137q, interfaceC2128h);
        new ahy(intent, context, context2, this.f12766a).m7972a();
    }
}
