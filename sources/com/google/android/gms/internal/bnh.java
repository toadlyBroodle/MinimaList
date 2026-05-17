package com.google.android.gms.internal;

import com.google.firebase.database.C2227c;
import com.google.firebase.database.C2269g;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class bnh {

    /* JADX INFO: renamed from: a */
    private static final ConcurrentMap<Class<?>, bni<?>> f8469a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    private static <T> bni<T> m9706a(Class<T> cls) {
        bni<T> bniVar = (bni) f8469a.get(cls);
        if (bniVar != null) {
            return bniVar;
        }
        bni<T> bniVar2 = new bni<>(cls);
        f8469a.put(cls, bniVar2);
        return bniVar2;
    }

    /* JADX INFO: renamed from: a */
    public static Object m9707a(Object obj) {
        return m9714c(obj);
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m9708a(Object obj, C2269g<T> c2269g) {
        Type genericSuperclass = c2269g.getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType)) {
            String strValueOf = String.valueOf(genericSuperclass);
            throw new C2227c(new StringBuilder(String.valueOf(strValueOf).length() + 47).append("Not a direct subclass of GenericTypeIndicator: ").append(strValueOf).toString());
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        if (parameterizedType.getRawType().equals(C2269g.class)) {
            return (T) m9713b(obj, parameterizedType.getActualTypeArguments()[0]);
        }
        String strValueOf2 = String.valueOf(genericSuperclass);
        throw new C2227c(new StringBuilder(String.valueOf(strValueOf2).length() + 47).append("Not a direct subclass of GenericTypeIndicator: ").append(strValueOf2).toString());
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m9709a(Object obj, Class<T> cls) {
        return (T) m9712b(obj, (Class) cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    private static <T> T m9712b(Object obj, Class<T> cls) {
        if (obj == 0) {
            return null;
        }
        if (!cls.isPrimitive() && !Number.class.isAssignableFrom(cls) && !Boolean.class.isAssignableFrom(cls) && !Character.class.isAssignableFrom(cls)) {
            if (String.class.isAssignableFrom(cls)) {
                if (obj instanceof String) {
                    return (T) ((String) obj);
                }
                String name = obj.getClass().getName();
                throw new C2227c(new StringBuilder(String.valueOf(name).length() + 42).append("Failed to convert value of type ").append(name).append(" to String").toString());
            }
            if (cls.isArray()) {
                throw new C2227c("Converting to Arrays is not supported, please use Listsinstead");
            }
            if (cls.getTypeParameters().length > 0) {
                String name2 = cls.getName();
                throw new C2227c(new StringBuilder(String.valueOf(name2).length() + 75).append("Class ").append(name2).append(" has generic type parameters, please use GenericTypeIndicator instead").toString());
            }
            if (cls.equals(Object.class)) {
                return obj;
            }
            if (cls.isEnum()) {
                return (T) m9715c(obj, cls);
            }
            bni bniVarM9706a = m9706a((Class) cls);
            if (obj instanceof Map) {
                return (T) bniVarM9706a.m9724a(m9716d(obj), Collections.emptyMap());
            }
            String name3 = obj.getClass().getName();
            String name4 = cls.getName();
            throw new C2227c(new StringBuilder(String.valueOf(name3).length() + 38 + String.valueOf(name4).length()).append("Can't convert object of type ").append(name3).append(" to type ").append(name4).toString());
        }
        if (Integer.class.isAssignableFrom(cls) || Integer.TYPE.isAssignableFrom(cls)) {
            if (obj instanceof Integer) {
                return (T) ((Integer) obj);
            }
            if (!(obj instanceof Long) && !(obj instanceof Double)) {
                String name5 = obj.getClass().getName();
                throw new C2227c(new StringBuilder(String.valueOf(name5).length() + 41).append("Failed to convert a value of type ").append(name5).append(" to int").toString());
            }
            double dDoubleValue = ((Number) obj).doubleValue();
            if (dDoubleValue < -2.147483648E9d || dDoubleValue > 2.147483647E9d) {
                throw new C2227c(new StringBuilder(124).append("Numeric value out of 32-bit integer range: ").append(dDoubleValue).append(". Did you mean to use a long or double instead of an int?").toString());
            }
            return (T) Integer.valueOf(((Number) obj).intValue());
        }
        if (Boolean.class.isAssignableFrom(cls) || Boolean.TYPE.isAssignableFrom(cls)) {
            if (obj instanceof Boolean) {
                return (T) ((Boolean) obj);
            }
            String name6 = obj.getClass().getName();
            throw new C2227c(new StringBuilder(String.valueOf(name6).length() + 43).append("Failed to convert value of type ").append(name6).append(" to boolean").toString());
        }
        if (Double.class.isAssignableFrom(cls) || Double.TYPE.isAssignableFrom(cls)) {
            return (T) m9717e(obj);
        }
        if (Long.class.isAssignableFrom(cls) || Long.TYPE.isAssignableFrom(cls)) {
            if (obj instanceof Integer) {
                return (T) Long.valueOf(((Integer) obj).longValue());
            }
            if (obj instanceof Long) {
                return (T) ((Long) obj);
            }
            if (!(obj instanceof Double)) {
                String name7 = obj.getClass().getName();
                throw new C2227c(new StringBuilder(String.valueOf(name7).length() + 42).append("Failed to convert a value of type ").append(name7).append(" to long").toString());
            }
            Double d = (Double) obj;
            if (d.doubleValue() >= -9.223372036854776E18d && d.doubleValue() <= 9.223372036854776E18d) {
                return (T) Long.valueOf(d.longValue());
            }
            String strValueOf = String.valueOf(d);
            throw new C2227c(new StringBuilder(String.valueOf(strValueOf).length() + 89).append("Numeric value out of 64-bit long range: ").append(strValueOf).append(". Did you mean to use a double instead of a long?").toString());
        }
        if (Float.class.isAssignableFrom(cls) || Float.TYPE.isAssignableFrom(cls)) {
            return (T) Float.valueOf(m9717e(obj).floatValue());
        }
        if (Short.class.isAssignableFrom(cls) || Short.TYPE.isAssignableFrom(cls)) {
            throw new C2227c("Deserializing to shorts is not supported");
        }
        if (Byte.class.isAssignableFrom(cls) || Byte.TYPE.isAssignableFrom(cls)) {
            throw new C2227c("Deserializing to bytes is not supported");
        }
        if (Character.class.isAssignableFrom(cls) || Character.TYPE.isAssignableFrom(cls)) {
            throw new C2227c("Deserializing to char is not supported");
        }
        String strValueOf2 = String.valueOf(cls);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(strValueOf2).length() + 24).append("Unknown primitive type: ").append(strValueOf2).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v34, types: [T, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v13, types: [T, java.util.HashMap] */
    /* JADX INFO: renamed from: b */
    public static <T> T m9713b(Object obj, Type type) {
        if (obj == null) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof Class) {
                return (T) m9712b(obj, (Class) type);
            }
            if (type instanceof WildcardType) {
                throw new C2227c("Generic wildcard types are not supported");
            }
            if (type instanceof GenericArrayType) {
                throw new C2227c("Generic Arrays are not supported, please use Lists instead");
            }
            String strValueOf = String.valueOf(type);
            throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf).length() + 26).append("Unknown type encountered: ").append(strValueOf).toString());
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Class cls = (Class) parameterizedType.getRawType();
        if (List.class.isAssignableFrom(cls)) {
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            if (!(obj instanceof List)) {
                String strValueOf2 = String.valueOf(obj.getClass());
                throw new C2227c(new StringBuilder(String.valueOf(strValueOf2).length() + 47).append("Expected a List while deserializing, but got a ").append(strValueOf2).toString());
            }
            List list = (List) obj;
            ?? r0 = (T) new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r0.add(m9713b(it.next(), type2));
            }
            return r0;
        }
        if (Map.class.isAssignableFrom(cls)) {
            Type type3 = parameterizedType.getActualTypeArguments()[0];
            Type type4 = parameterizedType.getActualTypeArguments()[1];
            if (!type3.equals(String.class)) {
                String strValueOf3 = String.valueOf(type3);
                throw new C2227c(new StringBuilder(String.valueOf(strValueOf3).length() + 70).append("Only Maps with string keys are supported, but found Map with key type ").append(strValueOf3).toString());
            }
            Map<String, Object> mapM9716d = m9716d(obj);
            ?? r2 = (T) new HashMap();
            for (Map.Entry<String, Object> entry : mapM9716d.entrySet()) {
                r2.put(entry.getKey(), m9713b(entry.getValue(), type4));
            }
            return r2;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            throw new C2227c("Collections are not supported, please use Lists instead");
        }
        Map<String, Object> mapM9716d2 = m9716d(obj);
        bni bniVarM9706a = m9706a(cls);
        HashMap map = new HashMap();
        TypeVariable<Class<T>>[] typeParameters = bniVarM9706a.f8470a.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments.length != typeParameters.length) {
            throw new IllegalStateException("Mismatched lengths for type variables and actual types");
        }
        for (int i = 0; i < typeParameters.length; i++) {
            map.put(typeParameters[i], actualTypeArguments[i]);
        }
        return (T) bniVarM9706a.m9724a(mapM9716d2, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static <T> Object m9714c(T t) {
        if (t == 0) {
            return null;
        }
        if (t instanceof Number) {
            if ((t instanceof Float) || (t instanceof Double)) {
                double dDoubleValue = ((Number) t).doubleValue();
                return (dDoubleValue > 9.223372036854776E18d || dDoubleValue < -9.223372036854776E18d || Math.floor(dDoubleValue) != dDoubleValue) ? Double.valueOf(dDoubleValue) : Long.valueOf(((Number) t).longValue());
            }
            if (t instanceof Short) {
                throw new C2227c("Shorts are not supported, please use int or long");
            }
            if (t instanceof Byte) {
                throw new C2227c("Bytes are not supported, please use int or long");
            }
            return t;
        }
        if ((t instanceof String) || (t instanceof Boolean)) {
            return t;
        }
        if (t instanceof Character) {
            throw new C2227c("Characters are not supported, please use Strings");
        }
        if (t instanceof Map) {
            HashMap map = new HashMap();
            for (Map.Entry entry : ((Map) t).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw new C2227c("Maps with non-string keys are not supported");
                }
                map.put((String) key, m9714c(entry.getValue()));
            }
            return map;
        }
        if (!(t instanceof Collection)) {
            if (t.getClass().isArray()) {
                throw new C2227c("Serializing Arrays is not supported, please use Lists instead");
            }
            return t instanceof Enum ? ((Enum) t).name() : m9706a((Class) t.getClass()).m9725a(t);
        }
        if (!(t instanceof List)) {
            throw new C2227c("Serializing Collections is not supported, please use Lists instead");
        }
        List list = (List) t;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m9714c(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private static <T> T m9715c(Object obj, Class<T> cls) {
        if (!(obj instanceof String)) {
            String strValueOf = String.valueOf(cls);
            String strValueOf2 = String.valueOf(obj.getClass());
            throw new C2227c(new StringBuilder(String.valueOf(strValueOf).length() + 57 + String.valueOf(strValueOf2).length()).append("Expected a String while deserializing to enum ").append(strValueOf).append(" but got a ").append(strValueOf2).toString());
        }
        String str = (String) obj;
        try {
            return (T) Enum.valueOf(cls, str);
        } catch (IllegalArgumentException e) {
            String name = cls.getName();
            throw new C2227c(new StringBuilder(String.valueOf(name).length() + 42 + String.valueOf(str).length()).append("Could not find enum value of ").append(name).append(" for value \"").append(str).append("\"").toString());
        }
    }

    /* JADX INFO: renamed from: d */
    private static Map<String, Object> m9716d(Object obj) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        String strValueOf = String.valueOf(obj.getClass());
        throw new C2227c(new StringBuilder(String.valueOf(strValueOf).length() + 46).append("Expected a Map while deserializing, but got a ").append(strValueOf).toString());
    }

    /* JADX INFO: renamed from: e */
    private static Double m9717e(Object obj) {
        if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        }
        if (!(obj instanceof Long)) {
            if (obj instanceof Double) {
                return (Double) obj;
            }
            String name = obj.getClass().getName();
            throw new C2227c(new StringBuilder(String.valueOf(name).length() + 44).append("Failed to convert a value of type ").append(name).append(" to double").toString());
        }
        Double dValueOf = Double.valueOf(((Long) obj).doubleValue());
        if (dValueOf.longValue() == ((Long) obj).longValue()) {
            return dValueOf;
        }
        String strValueOf = String.valueOf(obj);
        throw new C2227c(new StringBuilder(String.valueOf(strValueOf).length() + 97).append("Loss of precision while converting number to double: ").append(strValueOf).append(". Did you mean to use a 64-bit long instead?").toString());
    }
}
