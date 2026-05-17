package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.p043a.BinderC0654c;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.tagmanager.c */
/* JADX INFO: loaded from: classes.dex */
final class C2123c {

    /* JADX INFO: renamed from: a */
    private static volatile DynamiteModule f12768a;

    /* JADX INFO: renamed from: b */
    private static volatile InterfaceC2140t f12769b;

    /* JADX INFO: renamed from: c */
    private static final Map<String, InterfaceC2121a> f12770c = new HashMap();

    /* JADX INFO: renamed from: d */
    private static final Map<String, InterfaceC2122b> f12771d = new HashMap();

    private C2123c() {
    }

    /* JADX INFO: renamed from: a */
    static IBinder m12805a(Context context) {
        try {
            try {
                return AbstractBinderC2144x.asInterface(m12813d(context).m7339a("com.google.android.gms.tagmanager.TagManagerServiceProviderImpl")).getService(BinderC0654c.m5329a(context), m12814e(context), new BinderC2127g()).asBinder();
            } catch (RemoteException e) {
                throw new IllegalStateException(e);
            }
        } catch (DynamiteModule.C1323c e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: a */
    static void m12808a(Intent intent, Context context) {
        InterfaceC2140t interfaceC2140tM12812c = m12812c(context);
        synchronized (C2123c.class) {
            try {
                interfaceC2140tM12812c.previewIntent(intent, BinderC0654c.m5329a(context), BinderC0654c.m5329a(f12768a.m7338a()), m12814e(context), new BinderC2127g());
            } catch (RemoteException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static Object m12809b(String str, Class<?> cls) {
        boolean z = false;
        try {
            Class<?> cls2 = Class.forName(str);
            Class<?>[] interfaces = cls2.getInterfaces();
            int length = interfaces.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (interfaces[i].equals(cls)) {
                    z = true;
                    break;
                }
                i++;
            }
            if (!z) {
                String canonicalName = cls.getCanonicalName();
                Log.e("GoogleTagManagerAPI", new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(canonicalName).length()).append(str).append(" doesn't implement ").append(canonicalName).append(" interface.").toString());
                return null;
            }
            try {
                try {
                    try {
                        try {
                            try {
                                return cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
                            } catch (SecurityException e) {
                                Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" doesn't have an accessible no-arg constructor"));
                                return null;
                            }
                        } catch (NoSuchMethodException e2) {
                            Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" doesn't have a valid no-arg constructor"));
                            return null;
                        }
                    } catch (InstantiationException e3) {
                        Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" is an abstract class."));
                        return null;
                    }
                } catch (InvocationTargetException e4) {
                    Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" construction threw an exception."));
                    return null;
                }
            } catch (IllegalAccessException e5) {
                Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" doesn't have an accessible no-arg constructor"));
                return null;
            }
        } catch (ClassNotFoundException e6) {
            Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" can't be found in the application."));
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    static void m12811b(Context context) {
        InterfaceC2140t interfaceC2140tM12812c = m12812c(context);
        synchronized (C2123c.class) {
            try {
                interfaceC2140tM12812c.initialize(BinderC0654c.m5329a(context), m12814e(context), new BinderC2127g());
            } catch (RemoteException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static InterfaceC2140t m12812c(Context context) {
        InterfaceC2140t interfaceC2140tAsInterface = f12769b;
        if (interfaceC2140tAsInterface == null) {
            synchronized (C2123c.class) {
                interfaceC2140tAsInterface = f12769b;
                if (interfaceC2140tAsInterface == null) {
                    try {
                        interfaceC2140tAsInterface = AbstractBinderC2141u.asInterface(m12813d(context).m7339a("com.google.android.gms.tagmanager.TagManagerApiImpl"));
                        f12769b = interfaceC2140tAsInterface;
                    } catch (DynamiteModule.C1323c e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return interfaceC2140tAsInterface;
    }

    /* JADX INFO: renamed from: d */
    private static DynamiteModule m12813d(Context context) {
        DynamiteModule dynamiteModuleM7328a = f12768a;
        if (dynamiteModuleM7328a == null) {
            synchronized (C2123c.class) {
                dynamiteModuleM7328a = f12768a;
                if (f12768a == null) {
                    dynamiteModuleM7328a = DynamiteModule.m7328a(context, DynamiteModule.f6066d, ModuleDescriptor.MODULE_ID);
                    f12768a = dynamiteModuleM7328a;
                }
            }
        }
        return dynamiteModuleM7328a;
    }

    /* JADX INFO: renamed from: e */
    private static InterfaceC2137q m12814e(Context context) {
        return new BinderC2124d(AppMeasurement.getInstance(context));
    }
}
