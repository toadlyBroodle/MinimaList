package android.support.v4.p009c;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.support.v4.p007b.p008a.C0172a;
import android.support.v4.p017h.C0205b;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: renamed from: android.support.v4.c.f */
/* JADX INFO: loaded from: classes.dex */
public class C0191f extends C0189d {

    /* JADX INFO: renamed from: a */
    private static final Class f1147a;

    /* JADX INFO: renamed from: b */
    private static final Constructor f1148b;

    /* JADX INFO: renamed from: c */
    private static final Method f1149c;

    /* JADX INFO: renamed from: d */
    private static final Method f1150d;

    /* JADX INFO: renamed from: e */
    private static final Method f1151e;

    /* JADX INFO: renamed from: f */
    private static final Method f1152f;

    /* JADX INFO: renamed from: g */
    private static final Method f1153g;

    static {
        Method declaredMethod;
        Method method;
        Method method2;
        Method method3;
        Constructor<?> constructor;
        Class<?> cls;
        Method method4 = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls2.getConstructor(new Class[0]);
            Method method5 = cls2.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class);
            Method method6 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE);
            Method method7 = cls2.getMethod("freeze", new Class[0]);
            Method method8 = cls2.getMethod("abortCreation", new Class[0]);
            declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls2, 1).getClass(), Integer.TYPE, Integer.TYPE);
            declaredMethod.setAccessible(true);
            method4 = method8;
            method = method7;
            method2 = method6;
            method3 = method5;
            constructor = constructor2;
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            declaredMethod = null;
            method = null;
            method2 = null;
            method3 = null;
            constructor = null;
            cls = null;
        }
        f1148b = constructor;
        f1147a = cls;
        f1149c = method3;
        f1150d = method2;
        f1151e = method;
        f1152f = method4;
        f1153g = declaredMethod;
    }

    /* JADX INFO: renamed from: a */
    private static Typeface m1439a(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f1147a, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f1153g.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1440a() {
        if (f1149c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return f1149c != null;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1441a(Context context, Object obj, String str, int i, int i2, int i3) {
        try {
            return ((Boolean) f1149c.invoke(obj, context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1442a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) f1150d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    private static Object m1443b() {
        try {
            return f1148b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m1444b(Object obj) {
        try {
            return ((Boolean) f1151e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: c */
    private static boolean m1445c(Object obj) {
        try {
            return ((Boolean) f1152f.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.support.v4.p009c.C0192g, android.support.v4.p009c.C0188c.a
    /* JADX INFO: renamed from: a */
    public Typeface mo1431a(Context context, Resources resources, int i, String str, int i2) {
        if (!m1440a()) {
            return super.mo1431a(context, resources, i, str, i2);
        }
        Object objM1443b = m1443b();
        if (!m1441a(context, objM1443b, str, 0, -1, -1)) {
            m1445c(objM1443b);
            return null;
        }
        if (m1444b(objM1443b)) {
            return m1439a(objM1443b);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    @Override // android.support.v4.p009c.C0189d, android.support.v4.p009c.C0192g, android.support.v4.p009c.C0188c.a
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface mo1432a(Context context, CancellationSignal cancellationSignal, C0205b.b[] bVarArr, int i) throws Throwable {
        boolean z;
        Throwable th;
        if (bVarArr.length < 1) {
            return null;
        }
        if (m1440a()) {
            Map<Uri, ByteBuffer> mapM1486a = C0205b.m1486a(context, bVarArr, cancellationSignal);
            Object objM1443b = m1443b();
            boolean z2 = false;
            int length = bVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                C0205b.b bVar = bVarArr[i2];
                ByteBuffer byteBuffer = mapM1486a.get(bVar.m1497a());
                if (byteBuffer == null) {
                    z = z2;
                } else {
                    if (!m1442a(objM1443b, byteBuffer, bVar.m1498b(), bVar.m1499c(), bVar.m1500d() ? 1 : 0)) {
                        m1445c(objM1443b);
                        return null;
                    }
                    z = true;
                }
                i2++;
                z2 = z;
            }
            if (!z2) {
                m1445c(objM1443b);
                return null;
            }
            if (m1444b(objM1443b)) {
                return Typeface.create(m1439a(objM1443b), i);
            }
            return null;
        }
        C0205b.b bVarA = m1449a(bVarArr, i);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarA.m1497a(), "r", cancellationSignal);
            Throwable th2 = null;
            try {
                Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(bVarA.m1499c()).setItalic(bVarA.m1500d()).build();
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    return typefaceBuild;
                }
                if (0 == 0) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                }
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    return typefaceBuild;
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    th2 = th4;
                    th = th5;
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        if (th2 != null) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th6) {
                                th2.addSuppressed(th6);
                            }
                        } else {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                    }
                    throw th;
                }
            }
        } catch (IOException e) {
            return null;
        }
    }

    @Override // android.support.v4.p009c.C0192g, android.support.v4.p009c.C0188c.a
    /* JADX INFO: renamed from: a */
    public Typeface mo1433a(Context context, C0172a.b bVar, Resources resources, int i) {
        if (!m1440a()) {
            return super.mo1433a(context, bVar, resources, i);
        }
        Object objM1443b = m1443b();
        for (C0172a.c cVar : bVar.m1312a()) {
            if (!m1441a(context, objM1443b, cVar.m1313a(), 0, cVar.m1314b(), cVar.m1315c() ? 1 : 0)) {
                m1445c(objM1443b);
                return null;
            }
        }
        if (m1444b(objM1443b)) {
            return m1439a(objM1443b);
        }
        return null;
    }
}
