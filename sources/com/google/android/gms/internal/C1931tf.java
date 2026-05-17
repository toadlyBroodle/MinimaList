package com.google.android.gms.internal;

import android.app.Service;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.C1000b;
import com.google.android.gms.cast.framework.InterfaceC0995ab;
import com.google.android.gms.cast.framework.InterfaceC1009k;
import com.google.android.gms.cast.framework.InterfaceC1042r;
import com.google.android.gms.cast.framework.InterfaceC1044t;
import com.google.android.gms.cast.framework.InterfaceC1046v;
import com.google.android.gms.cast.framework.InterfaceC1050z;
import com.google.android.gms.cast.framework.media.C1012a;
import com.google.android.gms.cast.framework.media.InterfaceC1027p;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.tf */
/* JADX INFO: loaded from: classes.dex */
public final class C1931tf {

    /* JADX INFO: renamed from: a */
    private static final C1992vm f11541a = new C1992vm("CastDynamiteModule");

    /* JADX INFO: renamed from: a */
    public static InterfaceC0995ab m12311a(Context context, String str, String str2, InterfaceC1009k interfaceC1009k) {
        try {
            return m12316a(context).mo12318a(str, str2, interfaceC1009k);
        } catch (RemoteException e) {
            f11541a.m12446a(e, "Unable to call %s on %s.", "newSessionImpl", InterfaceC1934ti.class.getSimpleName());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC1027p m12312a(Service service, InterfaceC0652a interfaceC0652a, InterfaceC0652a interfaceC0652a2, C1012a c1012a) {
        try {
            return m12316a(service.getApplicationContext()).mo12319a(BinderC0654c.m5329a(service), interfaceC0652a, interfaceC0652a2, c1012a);
        } catch (RemoteException e) {
            f11541a.m12446a(e, "Unable to call %s on %s.", "newMediaNotificationServiceImpl", InterfaceC1934ti.class.getSimpleName());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC1044t m12313a(Context context, C1000b c1000b, InterfaceC1936tk interfaceC1936tk, Map<String, IBinder> map) {
        try {
            return m12316a(context).mo12320a(BinderC0654c.m5329a(context.getApplicationContext()), c1000b, interfaceC1936tk, map);
        } catch (RemoteException e) {
            f11541a.m12446a(e, "Unable to call %s on %s.", "newCastContextImpl", InterfaceC1934ti.class.getSimpleName());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC1046v m12314a(Context context, C1000b c1000b, InterfaceC0652a interfaceC0652a, InterfaceC1042r interfaceC1042r) {
        try {
            return m12316a(context).mo12321a(c1000b, interfaceC0652a, interfaceC1042r);
        } catch (RemoteException e) {
            f11541a.m12446a(e, "Unable to call %s on %s.", "newCastSessionImpl", InterfaceC1934ti.class.getSimpleName());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC1050z m12315a(Service service, InterfaceC0652a interfaceC0652a, InterfaceC0652a interfaceC0652a2) {
        try {
            return m12316a(service.getApplicationContext()).mo12322a(BinderC0654c.m5329a(service), interfaceC0652a, interfaceC0652a2);
        } catch (RemoteException e) {
            f11541a.m12446a(e, "Unable to call %s on %s.", "newReconnectionServiceImpl", InterfaceC1934ti.class.getSimpleName());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static InterfaceC1934ti m12316a(Context context) {
        try {
            IBinder iBinderM7339a = DynamiteModule.m7328a(context, DynamiteModule.f6063a, "com.google.android.gms.cast.framework.dynamite").m7339a("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (iBinderM7339a == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderM7339a.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return iInterfaceQueryLocalInterface instanceof InterfaceC1934ti ? (InterfaceC1934ti) iInterfaceQueryLocalInterface : new C1935tj(iBinderM7339a);
        } catch (DynamiteModule.C1323c e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC1950ty m12317a(Context context, AsyncTask<Uri, Long, Bitmap> asyncTask, InterfaceC1953ua interfaceC1953ua, int i, int i2, boolean z, long j, int i3, int i4, int i5) {
        try {
            return m12316a(context.getApplicationContext()).mo12323a(BinderC0654c.m5329a(asyncTask), interfaceC1953ua, i, i2, z, 2097152L, 5, 333, 10000);
        } catch (RemoteException e) {
            f11541a.m12446a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", InterfaceC1934ti.class.getSimpleName());
            return null;
        }
    }
}
