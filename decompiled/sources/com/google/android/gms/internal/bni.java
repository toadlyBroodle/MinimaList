package com.google.android.gms.internal;

import android.util.Log;
import com.google.firebase.database.C2227c;
import com.google.firebase.database.InterfaceC2267e;
import com.google.firebase.database.InterfaceC2270h;
import com.google.firebase.database.InterfaceC2272j;
import com.google.firebase.database.InterfaceC2274l;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class bni<T> {

    /* JADX INFO: renamed from: a */
    private final Class<T> f8470a;

    /* JADX INFO: renamed from: b */
    private final Constructor<T> f8471b;

    /* JADX INFO: renamed from: c */
    private final boolean f8472c;

    /* JADX INFO: renamed from: d */
    private final boolean f8473d;

    /* JADX INFO: renamed from: e */
    private final Map<String, String> f8474e;

    /* JADX INFO: renamed from: f */
    private final Map<String, Method> f8475f;

    /* JADX INFO: renamed from: g */
    private final Map<String, Method> f8476g;

    /* JADX INFO: renamed from: h */
    private final Map<String, Field> f8477h;

    /* JADX WARN: Code restructure failed: missing block: B:135:0x02f8, code lost:
    
        if (r12.f8474e.isEmpty() == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02fa, code lost:
    
        r0 = java.lang.String.valueOf(r13.getName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x030a, code lost:
    
        if (r0.length() == 0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x030c, code lost:
    
        r0 = "No properties to serialize found on class ".concat(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0313, code lost:
    
        throw new com.google.firebase.database.C2227c(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0314, code lost:
    
        r0 = new java.lang.String("No properties to serialize found on class ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x031a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bni(Class<T> cls) {
        Constructor<T> declaredConstructor;
        this.f8470a = cls;
        this.f8472c = cls.isAnnotationPresent(InterfaceC2274l.class);
        this.f8473d = !cls.isAnnotationPresent(InterfaceC2270h.class);
        this.f8474e = new HashMap();
        this.f8476g = new HashMap();
        this.f8475f = new HashMap();
        this.f8477h = new HashMap();
        try {
            declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
        } catch (NoSuchMethodException e) {
            declaredConstructor = null;
        }
        this.f8471b = declaredConstructor;
        for (Method method : cls.getMethods()) {
            boolean z = ((!method.getName().startsWith("get") && !method.getName().startsWith("is")) || method.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(method.getModifiers()) || Modifier.isStatic(method.getModifiers()) || method.getReturnType().equals(Void.TYPE) || method.getParameterTypes().length != 0 || method.isAnnotationPresent(InterfaceC2267e.class)) ? false : true;
            if (z) {
                String strM9721a = m9721a(method);
                m9723a(strM9721a);
                method.setAccessible(true);
                if (this.f8475f.containsKey(strM9721a)) {
                    String strValueOf = String.valueOf(method.getName());
                    throw new C2227c(strValueOf.length() != 0 ? "Found conflicting getters for name: ".concat(strValueOf) : new String("Found conflicting getters for name: "));
                }
                this.f8475f.put(strM9721a, method);
            }
        }
        for (Field field : cls.getFields()) {
            boolean z2 = (field.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(field.getModifiers()) || Modifier.isStatic(field.getModifiers()) || Modifier.isTransient(field.getModifiers()) || field.isAnnotationPresent(InterfaceC2267e.class)) ? false : true;
            if (z2) {
                m9723a(m9720a(field));
            }
        }
        Class<T> cls2 = cls;
        while (true) {
            for (Method method2 : cls2.getDeclaredMethods()) {
                boolean z3 = method2.getName().startsWith("set") && !method2.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method2.getModifiers()) && method2.getReturnType().equals(Void.TYPE) && method2.getParameterTypes().length == 1 && !method2.isAnnotationPresent(InterfaceC2267e.class);
                if (z3) {
                    String strM9721a2 = m9721a(method2);
                    String str = this.f8474e.get(strM9721a2.toLowerCase());
                    if (str == null) {
                        continue;
                    } else {
                        if (!str.equals(strM9721a2)) {
                            String strValueOf2 = String.valueOf(method2.getName());
                            throw new C2227c(strValueOf2.length() != 0 ? "Found setter with invalid case-sensitive name: ".concat(strValueOf2) : new String("Found setter with invalid case-sensitive name: "));
                        }
                        Method method3 = this.f8476g.get(strM9721a2);
                        if (method3 == null) {
                            method2.setAccessible(true);
                            this.f8476g.put(strM9721a2, method2);
                        } else {
                            bne.m9697a(method2.getDeclaringClass().isAssignableFrom(method3.getDeclaringClass()), "Expected override from a base class");
                            bne.m9697a(method2.getReturnType().equals(Void.TYPE), "Expected void return type");
                            bne.m9697a(method3.getReturnType().equals(Void.TYPE), "Expected void return type");
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            Class<?>[] parameterTypes2 = method3.getParameterTypes();
                            bne.m9697a(parameterTypes.length == 1, "Expected exactly one parameter");
                            bne.m9697a(parameterTypes2.length == 1, "Expected exactly one parameter");
                            if (!(method2.getName().equals(method3.getName()) && parameterTypes[0].equals(parameterTypes2[0]))) {
                                String name = method2.getName();
                                String name2 = method3.getName();
                                String name3 = method3.getDeclaringClass().getName();
                                throw new C2227c(new StringBuilder(String.valueOf(name).length() + 69 + String.valueOf(name2).length() + String.valueOf(name3).length()).append("Found a conflicting setters with name: ").append(name).append(" (conflicts with ").append(name2).append(" defined on ").append(name3).append(")").toString());
                            }
                        }
                    }
                }
            }
            for (Field field2 : cls2.getDeclaredFields()) {
                String strM9720a = m9720a(field2);
                if (this.f8474e.containsKey(strM9720a.toLowerCase()) && !this.f8477h.containsKey(strM9720a)) {
                    field2.setAccessible(true);
                    this.f8477h.put(strM9720a, field2);
                }
            }
            Class<T> superclass = cls2.getSuperclass();
            if (superclass == null || superclass.equals(Object.class)) {
                break;
            } else {
                cls2 = superclass;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m9719a(AccessibleObject accessibleObject) {
        if (accessibleObject.isAnnotationPresent(InterfaceC2272j.class)) {
            return ((InterfaceC2272j) accessibleObject.getAnnotation(InterfaceC2272j.class)).m13007a();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static String m9720a(Field field) {
        String strM9719a = m9719a((AccessibleObject) field);
        return strM9719a != null ? strM9719a : field.getName();
    }

    /* JADX INFO: renamed from: a */
    private static String m9721a(Method method) {
        String strM9719a = m9719a((AccessibleObject) method);
        if (strM9719a != null) {
            return strM9719a;
        }
        String name = method.getName();
        String[] strArr = {"get", "set", "is"};
        String str = null;
        int i = 0;
        while (i < 3) {
            String str2 = strArr[i];
            if (!name.startsWith(str2)) {
                str2 = str;
            }
            i++;
            str = str2;
        }
        if (str == null) {
            String strValueOf = String.valueOf(name);
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unknown Bean prefix for method: ".concat(strValueOf) : new String("Unknown Bean prefix for method: "));
        }
        char[] charArray = name.substring(str.length()).toCharArray();
        for (int i2 = 0; i2 < charArray.length && Character.isUpperCase(charArray[i2]); i2++) {
            charArray[i2] = Character.toLowerCase(charArray[i2]);
        }
        return new String(charArray);
    }

    /* JADX INFO: renamed from: a */
    private static Type m9722a(Type type, Map<TypeVariable<Class<T>>, Type> map) {
        if (!(type instanceof TypeVariable)) {
            return type;
        }
        Type type2 = map.get(type);
        if (type2 != null) {
            return type2;
        }
        String strValueOf = String.valueOf(type);
        throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf).length() + 23).append("Could not resolve type ").append(strValueOf).toString());
    }

    /* JADX INFO: renamed from: a */
    private final void m9723a(String str) {
        String strPut = this.f8474e.put(str.toLowerCase(), str);
        if (strPut == null || str.equals(strPut)) {
            return;
        }
        String strValueOf = String.valueOf(str.toLowerCase());
        throw new C2227c(strValueOf.length() != 0 ? "Found two getters or fields with conflicting case sensitivity for property: ".concat(strValueOf) : new String("Found two getters or fields with conflicting case sensitivity for property: "));
    }

    /* JADX INFO: renamed from: a */
    public final T m9724a(Map<String, Object> map, Map<TypeVariable<Class<T>>, Type> map2) {
        if (this.f8471b == null) {
            String name = this.f8470a.getName();
            throw new C2227c(new StringBuilder(String.valueOf(name).length() + 123).append("Class ").append(name).append(" does not define a no-argument constructor. If you are using ProGuard, make sure these constructors are not stripped.").toString());
        }
        try {
            T tNewInstance = this.f8471b.newInstance(new Object[0]);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                if (this.f8476g.containsKey(key)) {
                    Method method = this.f8476g.get(key);
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    if (genericParameterTypes.length != 1) {
                        throw new IllegalStateException("Setter does not have exactly one parameter");
                    }
                    try {
                        method.invoke(tNewInstance, bnh.m9713b(entry.getValue(), m9722a(genericParameterTypes[0], map2)));
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException(e2);
                    }
                } else if (this.f8477h.containsKey(key)) {
                    Field field = this.f8477h.get(key);
                    try {
                        field.set(tNewInstance, bnh.m9713b(entry.getValue(), m9722a(field.getGenericType(), map2)));
                    } catch (IllegalAccessException e3) {
                        throw new RuntimeException(e3);
                    }
                } else {
                    String name2 = this.f8470a.getName();
                    String string = new StringBuilder(String.valueOf(key).length() + 36 + String.valueOf(name2).length()).append("No setter/field for ").append(key).append(" found on class ").append(name2).toString();
                    if (this.f8474e.containsKey(key.toLowerCase())) {
                        string = String.valueOf(string).concat(" (fields/setters are case sensitive!)");
                    }
                    if (this.f8472c) {
                        throw new C2227c(string);
                    }
                    if (this.f8473d) {
                        Log.w("ClassMapper", string);
                    }
                }
            }
            return tNewInstance;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, Object> m9725a(T t) {
        Object objInvoke;
        if (!this.f8470a.isAssignableFrom(t.getClass())) {
            String strValueOf = String.valueOf(t.getClass());
            String strValueOf2 = String.valueOf(this.f8470a);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(strValueOf).length() + 59 + String.valueOf(strValueOf2).length()).append("Can't serialize object of class ").append(strValueOf).append(" with BeanMapper for class ").append(strValueOf2).toString());
        }
        HashMap map = new HashMap();
        for (String str : this.f8474e.values()) {
            if (this.f8475f.containsKey(str)) {
                try {
                    objInvoke = this.f8475f.get(str).invoke(t, new Object[0]);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException(e2);
                }
            } else {
                Field field = this.f8477h.get(str);
                if (field == null) {
                    String strValueOf3 = String.valueOf(str);
                    throw new IllegalStateException(strValueOf3.length() != 0 ? "Bean property without field or getter:".concat(strValueOf3) : new String("Bean property without field or getter:"));
                }
                try {
                    objInvoke = field.get(t);
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException(e3);
                }
            }
            map.put(str, bnh.m9714c(objInvoke));
        }
        return map;
    }
}
