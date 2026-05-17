package android.support.v4.p009c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.v4.p007b.p008a.C0172a;
import android.support.v4.p017h.C0205b;
import android.support.v4.p018i.C0219m;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: renamed from: android.support.v4.c.e */
/* JADX INFO: loaded from: classes.dex */
class C0190e extends C0192g {

    /* JADX INFO: renamed from: a */
    private static final Class f1143a;

    /* JADX INFO: renamed from: b */
    private static final Constructor f1144b;

    /* JADX INFO: renamed from: c */
    private static final Method f1145c;

    /* JADX INFO: renamed from: d */
    private static final Method f1146d;

    static {
        Method method;
        Constructor<?> constructor;
        Class<?> cls;
        Method method2 = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls2.getConstructor(new Class[0]);
            Method method3 = cls2.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls2, 1).getClass());
            method2 = method3;
            constructor = constructor2;
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            method = null;
            constructor = null;
            cls = null;
        }
        f1144b = constructor;
        f1143a = cls;
        f1145c = method2;
        f1146d = method;
    }

    C0190e() {
    }

    /* JADX INFO: renamed from: a */
    private static Typeface m1435a(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f1143a, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f1146d.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1436a() {
        if (f1145c == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f1145c != null;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1437a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f1145c.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    private static Object m1438b() {
        try {
            return f1144b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.support.v4.p009c.C0192g, android.support.v4.p009c.C0188c.a
    /* JADX INFO: renamed from: a */
    public Typeface mo1432a(Context context, CancellationSignal cancellationSignal, C0205b.b[] bVarArr, int i) throws Throwable {
        Object objM1438b = m1438b();
        C0219m c0219m = new C0219m();
        for (C0205b.b bVar : bVarArr) {
            Uri uriM1497a = bVar.m1497a();
            ByteBuffer byteBufferM1454a = (ByteBuffer) c0219m.get(uriM1497a);
            if (byteBufferM1454a == null) {
                byteBufferM1454a = C0193h.m1454a(context, cancellationSignal, uriM1497a);
                c0219m.put(uriM1497a, byteBufferM1454a);
            }
            if (!m1437a(objM1438b, byteBufferM1454a, bVar.m1498b(), bVar.m1499c(), bVar.m1500d())) {
                return null;
            }
        }
        return Typeface.create(m1435a(objM1438b), i);
    }

    @Override // android.support.v4.p009c.C0192g, android.support.v4.p009c.C0188c.a
    /* JADX INFO: renamed from: a */
    public Typeface mo1433a(Context context, C0172a.b bVar, Resources resources, int i) {
        Object objM1438b = m1438b();
        for (C0172a.c cVar : bVar.m1312a()) {
            ByteBuffer byteBufferM1453a = C0193h.m1453a(context, resources, cVar.m1316d());
            if (byteBufferM1453a == null || !m1437a(objM1438b, byteBufferM1453a, 0, cVar.m1314b(), cVar.m1315c())) {
                return null;
            }
        }
        return m1435a(objM1438b);
    }
}
