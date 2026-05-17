package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.p043a.BinderC0654c;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bwk {

    /* JADX INFO: renamed from: a */
    bss f9188a;

    /* JADX INFO: renamed from: b */
    boolean f9189b;

    public bwk() {
    }

    public bwk(Context context) {
        can.m10549a(context);
        if (((Boolean) bxm.m10409f().m10546a(can.f9543cJ)).booleanValue()) {
            try {
                this.f9188a = bst.m10187a(DynamiteModule.m7328a(context, DynamiteModule.f6063a, ModuleDescriptor.MODULE_ID).m7339a("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
                BinderC0654c.m5329a(context);
                this.f9188a.mo10182a(BinderC0654c.m5329a(context), "GMA_SDK");
                this.f9189b = true;
            } catch (RemoteException | DynamiteModule.C1323c | NullPointerException e) {
                C1668jm.m11610b("Cannot dynamite load clearcut");
            }
        }
    }

    public bwk(Context context, String str, String str2) {
        can.m10549a(context);
        try {
            this.f9188a = bst.m10187a(DynamiteModule.m7328a(context, DynamiteModule.f6063a, ModuleDescriptor.MODULE_ID).m7339a("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
            BinderC0654c.m5329a(context);
            this.f9188a.mo10183a(BinderC0654c.m5329a(context), str, null);
            this.f9189b = true;
        } catch (RemoteException | DynamiteModule.C1323c | NullPointerException e) {
            C1668jm.m11610b("Cannot dynamite load clearcut");
        }
    }

    /* JADX INFO: renamed from: a */
    public final bwm m10358a(byte[] bArr) {
        return new bwm(this, bArr);
    }
}
