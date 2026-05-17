package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.p043a.BinderC0654c;

/* JADX INFO: renamed from: com.google.android.gms.internal.xx */
/* JADX INFO: loaded from: classes.dex */
public final class C2057xx {

    /* JADX INFO: renamed from: a */
    private boolean f12515a = false;

    /* JADX INFO: renamed from: b */
    private InterfaceC2058xy f12516b = null;

    /* JADX INFO: renamed from: a */
    public final <T> T m12591a(AbstractC2050xq<T> abstractC2050xq) {
        synchronized (this) {
            if (this.f12515a) {
                return abstractC2050xq.mo12582a(this.f12516b);
            }
            return abstractC2050xq.m12584b();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12592a(Context context) {
        synchronized (this) {
            if (this.f12515a) {
                return;
            }
            try {
                this.f12516b = AbstractBinderC2059xz.asInterface(DynamiteModule.m7328a(context, DynamiteModule.f6067e, ModuleDescriptor.MODULE_ID).m7339a("com.google.android.gms.flags.impl.FlagProviderImpl"));
                this.f12516b.init(BinderC0654c.m5329a(context));
                this.f12515a = true;
            } catch (RemoteException | DynamiteModule.C1323c e) {
                Log.w("FlagValueProvider", "Failed to initialize flags module.", e);
            }
        }
    }
}
