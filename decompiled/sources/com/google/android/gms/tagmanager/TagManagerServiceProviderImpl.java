package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.aho;
import com.google.android.gms.internal.ajk;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
@DynamiteApi
public class TagManagerServiceProviderImpl extends AbstractBinderC2144x {

    /* JADX INFO: renamed from: a */
    private static volatile ajk f12767a;

    @Override // com.google.android.gms.tagmanager.InterfaceC2143w
    public aho getService(InterfaceC0652a interfaceC0652a, InterfaceC2137q interfaceC2137q, InterfaceC2128h interfaceC2128h) {
        ajk ajkVar = f12767a;
        if (ajkVar == null) {
            synchronized (TagManagerServiceProviderImpl.class) {
                ajkVar = f12767a;
                if (ajkVar == null) {
                    ajk ajkVar2 = new ajk((Context) BinderC0654c.m5330a(interfaceC0652a), interfaceC2137q, interfaceC2128h);
                    f12767a = ajkVar2;
                    ajkVar = ajkVar2;
                }
            }
        }
        return ajkVar;
    }
}
