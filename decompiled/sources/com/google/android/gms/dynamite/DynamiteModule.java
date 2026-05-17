package com.google.android.gms.dynamite;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C1283m;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class DynamiteModule {

    /* JADX INFO: renamed from: f */
    private static Boolean f6068f;

    /* JADX INFO: renamed from: g */
    private static InterfaceC1335k f6069g;

    /* JADX INFO: renamed from: h */
    private static InterfaceC1337m f6070h;

    /* JADX INFO: renamed from: i */
    private static String f6071i;

    /* JADX INFO: renamed from: m */
    private final Context f6075m;

    /* JADX INFO: renamed from: j */
    private static final ThreadLocal<C1321a> f6072j = new ThreadLocal<>();

    /* JADX INFO: renamed from: k */
    private static final InterfaceC1333i f6073k = new C1325a();

    /* JADX INFO: renamed from: a */
    public static final InterfaceC1324d f6063a = new C1326b();

    /* JADX INFO: renamed from: l */
    private static InterfaceC1324d f6074l = new C1327c();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC1324d f6064b = new C1328d();

    /* JADX INFO: renamed from: c */
    public static final InterfaceC1324d f6065c = new C1329e();

    /* JADX INFO: renamed from: d */
    public static final InterfaceC1324d f6066d = new C1330f();

    /* JADX INFO: renamed from: e */
    public static final InterfaceC1324d f6067e = new C1331g();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    static class C1321a {

        /* JADX INFO: renamed from: a */
        public Cursor f6076a;

        private C1321a() {
        }

        /* synthetic */ C1321a(C1325a c1325a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    static class C1322b implements InterfaceC1333i {

        /* JADX INFO: renamed from: a */
        private final int f6077a;

        /* JADX INFO: renamed from: b */
        private final int f6078b = 0;

        public C1322b(int i, int i2) {
            this.f6077a = i;
        }

        @Override // com.google.android.gms.dynamite.InterfaceC1333i
        /* JADX INFO: renamed from: a */
        public final int mo7340a(Context context, String str) {
            return this.f6077a;
        }

        @Override // com.google.android.gms.dynamite.InterfaceC1333i
        /* JADX INFO: renamed from: a */
        public final int mo7341a(Context context, String str, boolean z) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$c */
    public static class C1323c extends Exception {
        private C1323c(String str) {
            super(str);
        }

        /* synthetic */ C1323c(String str, C1325a c1325a) {
            this(str);
        }

        private C1323c(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ C1323c(String str, Throwable th, C1325a c1325a) {
            this(str, th);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$d */
    public interface InterfaceC1324d {
        /* JADX INFO: renamed from: a */
        C1334j mo7342a(Context context, String str, InterfaceC1333i interfaceC1333i);
    }

    private DynamiteModule(Context context) {
        this.f6075m = (Context) C1221aj.m7065a(context);
    }

    /* JADX INFO: renamed from: a */
    public static int m7325a(Context context, String str) {
        int i;
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass(new StringBuilder(String.valueOf("com.google.android.gms.dynamite.descriptors.").length() + 1 + String.valueOf(str).length() + String.valueOf("ModuleDescriptor").length()).append("com.google.android.gms.dynamite.descriptors.").append(str).append(".").append("ModuleDescriptor").toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                i = declaredField2.getInt(null);
            } else {
                String strValueOf = String.valueOf(declaredField.get(null));
                Log.e("DynamiteModule", new StringBuilder(String.valueOf(strValueOf).length() + 51 + String.valueOf(str).length()).append("Module descriptor id '").append(strValueOf).append("' didn't match expected id '").append(str).append("'").toString());
                i = 0;
            }
            return i;
        } catch (ClassNotFoundException e) {
            Log.w("DynamiteModule", new StringBuilder(String.valueOf(str).length() + 45).append("Local module descriptor class for ").append(str).append(" not found.").toString());
            return 0;
        } catch (Exception e2) {
            String strValueOf2 = String.valueOf(e2.getMessage());
            Log.e("DynamiteModule", strValueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(strValueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m7326a(Context context, String str, boolean z) {
        Class<?> clsLoadClass;
        Field declaredField;
        synchronized (DynamiteModule.class) {
            Boolean bool = f6068f;
            if (bool == null) {
                try {
                    clsLoadClass = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName());
                    declaredField = clsLoadClass.getDeclaredField("sClassLoader");
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
                    String strValueOf = String.valueOf(e);
                    Log.w("DynamiteModule", new StringBuilder(String.valueOf(strValueOf).length() + 30).append("Failed to load module via V2: ").append(strValueOf).toString());
                    bool = Boolean.FALSE;
                }
                synchronized (clsLoadClass) {
                    ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                    if (classLoader != null) {
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else {
                            try {
                                m7331a(classLoader);
                            } catch (C1323c e2) {
                            }
                            bool = Boolean.TRUE;
                        }
                    } else if ("com.google.android.gms".equals(context.getApplicationContext().getPackageName())) {
                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                        bool = Boolean.FALSE;
                    } else {
                        try {
                            int iM7335c = m7335c(context, str, z);
                            if (f6071i == null || f6071i.isEmpty()) {
                                return iM7335c;
                            }
                            C1332h c1332h = new C1332h(f6071i, ClassLoader.getSystemClassLoader());
                            m7331a(c1332h);
                            declaredField.set(null, c1332h);
                            f6068f = Boolean.TRUE;
                            return iM7335c;
                        } catch (C1323c e3) {
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                    }
                    f6068f = bool;
                }
            }
            if (!bool.booleanValue()) {
                return m7333b(context, str, z);
            }
            try {
                return m7335c(context, str, z);
            } catch (C1323c e4) {
                String strValueOf2 = String.valueOf(e4.getMessage());
                Log.w("DynamiteModule", strValueOf2.length() != 0 ? "Failed to retrieve remote module version: ".concat(strValueOf2) : new String("Failed to retrieve remote module version: "));
                return 0;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static Context m7327a(Context context, String str, int i, Cursor cursor, InterfaceC1337m interfaceC1337m) {
        try {
            return (Context) BinderC0654c.m5330a(interfaceC1337m.mo7345a(BinderC0654c.m5329a(context), str, i, BinderC0654c.m5329a(cursor)));
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.toString());
            Log.e("DynamiteModule", strValueOf.length() != 0 ? "Failed to load DynamiteLoader: ".concat(strValueOf) : new String("Failed to load DynamiteLoader: "));
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static DynamiteModule m7328a(Context context, InterfaceC1324d interfaceC1324d, String str) {
        C1321a c1321a = f6072j.get();
        C1321a c1321a2 = new C1321a(null);
        f6072j.set(c1321a2);
        try {
            C1334j c1334jMo7342a = interfaceC1324d.mo7342a(context, str, f6073k);
            Log.i("DynamiteModule", new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length()).append("Considering local module ").append(str).append(":").append(c1334jMo7342a.f6079a).append(" and remote module ").append(str).append(":").append(c1334jMo7342a.f6080b).toString());
            if (c1334jMo7342a.f6081c == 0 || ((c1334jMo7342a.f6081c == -1 && c1334jMo7342a.f6079a == 0) || (c1334jMo7342a.f6081c == 1 && c1334jMo7342a.f6080b == 0))) {
                throw new C1323c(new StringBuilder(91).append("No acceptable module found. Local version is ").append(c1334jMo7342a.f6079a).append(" and remote version is ").append(c1334jMo7342a.f6080b).append(".").toString(), (C1325a) null);
            }
            if (c1334jMo7342a.f6081c == -1) {
                DynamiteModule dynamiteModuleM7336c = m7336c(context, str);
                if (c1321a2.f6076a != null) {
                    c1321a2.f6076a.close();
                }
                f6072j.set(c1321a);
                return dynamiteModuleM7336c;
            }
            if (c1334jMo7342a.f6081c != 1) {
                throw new C1323c(new StringBuilder(47).append("VersionPolicy returned invalid code:").append(c1334jMo7342a.f6081c).toString(), (C1325a) null);
            }
            try {
                DynamiteModule dynamiteModuleM7329a = m7329a(context, str, c1334jMo7342a.f6080b);
                if (c1321a2.f6076a != null) {
                    c1321a2.f6076a.close();
                }
                f6072j.set(c1321a);
                return dynamiteModuleM7329a;
            } catch (C1323c e) {
                String strValueOf = String.valueOf(e.getMessage());
                Log.w("DynamiteModule", strValueOf.length() != 0 ? "Failed to load remote module: ".concat(strValueOf) : new String("Failed to load remote module: "));
                if (c1334jMo7342a.f6079a == 0 || interfaceC1324d.mo7342a(context, str, new C1322b(c1334jMo7342a.f6079a, 0)).f6081c != -1) {
                    throw new C1323c("Remote load failed. No local fallback found.", e, null);
                }
                DynamiteModule dynamiteModuleM7336c2 = m7336c(context, str);
                if (c1321a2.f6076a != null) {
                    c1321a2.f6076a.close();
                }
                f6072j.set(c1321a);
                return dynamiteModuleM7336c2;
            }
        } catch (Throwable th) {
            if (c1321a2.f6076a != null) {
                c1321a2.f6076a.close();
            }
            f6072j.set(c1321a);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private static DynamiteModule m7329a(Context context, String str, int i) throws C1323c {
        Boolean bool;
        synchronized (DynamiteModule.class) {
            bool = f6068f;
        }
        if (bool == null) {
            throw new C1323c("Failed to determine which loading route to use.", (C1325a) null);
        }
        return bool.booleanValue() ? m7337c(context, str, i) : m7334b(context, str, i);
    }

    /* JADX INFO: renamed from: a */
    private static InterfaceC1335k m7330a(Context context) {
        InterfaceC1335k c1336l;
        synchronized (DynamiteModule.class) {
            if (f6069g != null) {
                return f6069g;
            }
            if (C1283m.m7222b().mo7040a(context) != 0) {
                return null;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c1336l = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    c1336l = iInterfaceQueryLocalInterface instanceof InterfaceC1335k ? (InterfaceC1335k) iInterfaceQueryLocalInterface : new C1336l(iBinder);
                }
                if (c1336l != null) {
                    f6069g = c1336l;
                    return c1336l;
                }
            } catch (Exception e) {
                String strValueOf = String.valueOf(e.getMessage());
                Log.e("DynamiteModule", strValueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(strValueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m7331a(ClassLoader classLoader) throws C1323c {
        InterfaceC1337m c1338n;
        C1325a c1325a = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                c1338n = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                c1338n = iInterfaceQueryLocalInterface instanceof InterfaceC1337m ? (InterfaceC1337m) iInterfaceQueryLocalInterface : new C1338n(iBinder);
            }
            f6070h = c1338n;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C1323c("Failed to instantiate dynamite loader", e, c1325a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m7332b(Context context, String str) {
        return m7326a(context, str, false);
    }

    /* JADX INFO: renamed from: b */
    private static int m7333b(Context context, String str, boolean z) {
        InterfaceC1335k interfaceC1335kM7330a = m7330a(context);
        if (interfaceC1335kM7330a == null) {
            return 0;
        }
        try {
            return interfaceC1335kM7330a.mo7343a(BinderC0654c.m5329a(context), str, z);
        } catch (RemoteException e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.w("DynamiteModule", strValueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(strValueOf) : new String("Failed to retrieve remote module version: "));
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    private static DynamiteModule m7334b(Context context, String str, int i) throws C1323c {
        C1325a c1325a = null;
        Log.i("DynamiteModule", new StringBuilder(String.valueOf(str).length() + 51).append("Selected remote version of ").append(str).append(", version >= ").append(i).toString());
        InterfaceC1335k interfaceC1335kM7330a = m7330a(context);
        if (interfaceC1335kM7330a == null) {
            throw new C1323c("Failed to create IDynamiteLoader.", c1325a);
        }
        try {
            InterfaceC0652a interfaceC0652aMo7344a = interfaceC1335kM7330a.mo7344a(BinderC0654c.m5329a(context), str, i);
            if (BinderC0654c.m5330a(interfaceC0652aMo7344a) == null) {
                throw new C1323c("Failed to load remote module.", c1325a);
            }
            return new DynamiteModule((Context) BinderC0654c.m5330a(interfaceC0652aMo7344a));
        } catch (RemoteException e) {
            throw new C1323c("Failed to load remote module.", e, c1325a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int m7335c(Context context, String str, boolean z) throws Throwable {
        Cursor cursor = null;
        try {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                String str2 = z ? "api_force_staging" : "api";
                Cursor cursorQuery = contentResolver.query(Uri.parse(new StringBuilder(String.valueOf("content://com.google.android.gms.chimera/").length() + 1 + String.valueOf(str2).length() + String.valueOf(str).length()).append("content://com.google.android.gms.chimera/").append(str2).append("/").append(str).toString()), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            int i = cursorQuery.getInt(0);
                            if (i > 0) {
                                synchronized (DynamiteModule.class) {
                                    f6071i = cursorQuery.getString(2);
                                }
                                C1321a c1321a = f6072j.get();
                                if (c1321a != null && c1321a.f6076a == null) {
                                    c1321a.f6076a = cursorQuery;
                                    cursorQuery = null;
                                }
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return i;
                        }
                    } catch (Exception e) {
                        e = e;
                        if (e instanceof C1323c) {
                            throw e;
                        }
                        throw new C1323c("V2 version check failed", e, null);
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new C1323c("Failed to connect to dynamite module ContentResolver.", (C1325a) null);
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    private static DynamiteModule m7336c(Context context, String str) {
        String strValueOf = String.valueOf(str);
        Log.i("DynamiteModule", strValueOf.length() != 0 ? "Selected local version of ".concat(strValueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    /* JADX INFO: renamed from: c */
    private static DynamiteModule m7337c(Context context, String str, int i) throws C1323c {
        InterfaceC1337m interfaceC1337m;
        C1325a c1325a = null;
        Log.i("DynamiteModule", new StringBuilder(String.valueOf(str).length() + 51).append("Selected remote version of ").append(str).append(", version >= ").append(i).toString());
        synchronized (DynamiteModule.class) {
            interfaceC1337m = f6070h;
        }
        if (interfaceC1337m == null) {
            throw new C1323c("DynamiteLoaderV2 was not cached.", c1325a);
        }
        C1321a c1321a = f6072j.get();
        if (c1321a == null || c1321a.f6076a == null) {
            throw new C1323c("No result cursor", c1325a);
        }
        Context contextM7327a = m7327a(context.getApplicationContext(), str, i, c1321a.f6076a, interfaceC1337m);
        if (contextM7327a == null) {
            throw new C1323c("Failed to get module context", c1325a);
        }
        return new DynamiteModule(contextM7327a);
    }

    /* JADX INFO: renamed from: a */
    public final Context m7338a() {
        return this.f6075m;
    }

    /* JADX INFO: renamed from: a */
    public final IBinder m7339a(String str) throws C1323c {
        try {
            return (IBinder) this.f6075m.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String strValueOf = String.valueOf(str);
            throw new C1323c(strValueOf.length() != 0 ? "Failed to instantiate module class: ".concat(strValueOf) : new String("Failed to instantiate module class: "), e, null);
        }
    }
}
