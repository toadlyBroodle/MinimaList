package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.support.design.C0025a;
import com.google.android.gms.common.internal.AbstractC1233av;
import com.google.android.gms.common.internal.InterfaceC1235ax;
import com.google.android.gms.common.internal.InterfaceC1236ay;

/* JADX INFO: renamed from: com.google.android.gms.internal.yg */
/* JADX INFO: loaded from: classes.dex */
public final class C2067yg extends AbstractC1233av<InterfaceC2072yl> {
    public C2067yg(Context context, Looper looper, InterfaceC1235ax interfaceC1235ax, InterfaceC1236ay interfaceC1236ay) {
        super(context, looper, C0025a.j.AppCompatTheme_windowMinWidthMajor, interfaceC1235ax, interfaceC1236ay, null);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ IInterface mo6166a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2072yl ? (InterfaceC2072yl) iInterfaceQueryLocalInterface : new C2073ym(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: b */
    protected final String mo6167b() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC2072yl m12602e() {
        return (InterfaceC2072yl) super.m7131w();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: j_ */
    protected final String mo6171j_() {
        return "com.google.android.gms.gass.START";
    }
}
