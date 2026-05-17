package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.tagmanager.InterfaceC2128h;
import com.google.android.gms.tagmanager.InterfaceC2137q;

/* JADX INFO: loaded from: classes.dex */
public final class aih {

    /* JADX INFO: renamed from: a */
    private final Context f6838a;

    /* JADX INFO: renamed from: b */
    private final String f6839b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC2137q f6840c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC2128h f6841d;

    public aih(Context context, InterfaceC2137q interfaceC2137q, InterfaceC2128h interfaceC2128h, String str) {
        this.f6838a = context.getApplicationContext();
        this.f6840c = interfaceC2137q;
        this.f6841d = interfaceC2128h;
        this.f6839b = str;
    }

    /* JADX INFO: renamed from: a */
    public final aic m7999a(aqs aqsVar, arb arbVar) {
        return new aic(this.f6838a, this.f6839b, aqsVar, arbVar, this.f6840c, this.f6841d);
    }
}
