package com.google.p036a.p038b;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: com.google.a.b.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0606k {
    /* JADX INFO: renamed from: a */
    public static AbstractC0606k m5193a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            final Object obj = declaredField.get(null);
            final Method method = cls.getMethod("allocateInstance", Class.class);
            return new AbstractC0606k() { // from class: com.google.a.b.k.1
                @Override // com.google.p036a.p038b.AbstractC0606k
                /* JADX INFO: renamed from: a */
                public <T> T mo5196a(Class<T> cls2) {
                    AbstractC0606k.m5195c(cls2);
                    return (T) method.invoke(obj, cls2);
                }
            };
        } catch (Exception e) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                final int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new AbstractC0606k() { // from class: com.google.a.b.k.2
                    @Override // com.google.p036a.p038b.AbstractC0606k
                    /* JADX INFO: renamed from: a */
                    public <T> T mo5196a(Class<T> cls2) {
                        AbstractC0606k.m5195c(cls2);
                        return (T) declaredMethod2.invoke(null, cls2, Integer.valueOf(iIntValue));
                    }
                };
            } catch (Exception e2) {
                try {
                    final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new AbstractC0606k() { // from class: com.google.a.b.k.3
                        @Override // com.google.p036a.p038b.AbstractC0606k
                        /* JADX INFO: renamed from: a */
                        public <T> T mo5196a(Class<T> cls2) {
                            AbstractC0606k.m5195c(cls2);
                            return (T) declaredMethod3.invoke(null, cls2, Object.class);
                        }
                    };
                } catch (Exception e3) {
                    return new AbstractC0606k() { // from class: com.google.a.b.k.4
                        @Override // com.google.p036a.p038b.AbstractC0606k
                        /* JADX INFO: renamed from: a */
                        public <T> T mo5196a(Class<T> cls2) {
                            throw new UnsupportedOperationException("Cannot allocate " + cls2);
                        }
                    };
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static void m5195c(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract <T> T mo5196a(Class<T> cls);
}
