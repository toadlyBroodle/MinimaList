package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.C1078e;
import com.google.android.gms.common.api.internal.InterfaceC1133bu;

/* JADX INFO: loaded from: classes.dex */
final class ayq {

    /* JADX INFO: renamed from: a */
    private Context f7591a;

    /* JADX INFO: renamed from: b */
    private C1074a f7592b;

    /* JADX INFO: renamed from: c */
    private InterfaceC1133bu f7593c;

    ayq(ayn aynVar, Context context, C1074a c1074a, InterfaceC1133bu interfaceC1133bu) {
        this.f7591a = context;
        this.f7592b = c1074a;
        this.f7593c = interfaceC1133bu;
    }

    /* JADX INFO: renamed from: a */
    final C1078e<O> m8697a(ayo ayoVar) {
        return new ayr(this.f7591a, this.f7592b, ayoVar, this.f7593c);
    }
}
