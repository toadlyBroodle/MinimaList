package com.google.android.gms.p043a;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.bns;

/* JADX INFO: renamed from: com.google.android.gms.a.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0652a extends IInterface {

    /* JADX INFO: renamed from: com.google.android.gms.a.a$a */
    public static abstract class a extends bns implements InterfaceC0652a {
        public a() {
            attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC0652a m5328a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof InterfaceC0652a ? (InterfaceC0652a) iInterfaceQueryLocalInterface : new C0653b(iBinder);
        }
    }
}
