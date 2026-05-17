package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.C1302f;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
public final class bay {

    /* JADX INFO: renamed from: a */
    private static bay f7704a;

    /* JADX INFO: renamed from: b */
    private Context f7705b;

    private bay() {
    }

    /* JADX INFO: renamed from: a */
    public static synchronized bay m8792a() {
        if (f7704a == null) {
            f7704a = new bay();
        }
        return f7704a;
    }

    /* JADX INFO: renamed from: a */
    public final void m8793a(Context context) {
        this.f7705b = context;
    }

    /* JADX INFO: renamed from: b */
    public final baw m8794b() {
        try {
            DynamiteModule dynamiteModuleM7328a = DynamiteModule.m7328a(this.f7705b, DynamiteModule.f6064b, "com.google.android.gms.crash");
            C1221aj.m7065a(dynamiteModuleM7328a);
            IBinder iBinderM7339a = dynamiteModuleM7328a.m7339a("com.google.firebase.crash.internal.api.FirebaseCrashApiImpl");
            if (iBinderM7339a == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderM7339a.queryLocalInterface("com.google.firebase.crash.internal.IFirebaseCrashApi");
            return iInterfaceQueryLocalInterface instanceof baw ? (baw) iInterfaceQueryLocalInterface : new bax(iBinderM7339a);
        } catch (DynamiteModule.C1323c e) {
            C1302f.m7261a(this.f7705b, e);
            throw new bba(e);
        }
    }
}
