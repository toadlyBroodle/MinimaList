package com.google.p036a.p038b;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* JADX INFO: renamed from: com.google.a.b.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0597b {

    /* JADX INFO: renamed from: a */
    static final Type[] f4130a = new Type[0];

    /* JADX INFO: renamed from: com.google.a.b.b$a */
    private static final class a implements Serializable, GenericArrayType {

        /* JADX INFO: renamed from: a */
        private final Type f4131a;

        public a(Type type) {
            this.f4131a = C0597b.m5152d(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C0597b.m5147a((Type) this, (Type) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f4131a;
        }

        public int hashCode() {
            return this.f4131a.hashCode();
        }

        public String toString() {
            return C0597b.m5154f(this.f4131a) + "[]";
        }
    }

    /* JADX INFO: renamed from: com.google.a.b.b$b */
    private static final class b implements Serializable, ParameterizedType {

        /* JADX INFO: renamed from: a */
        private final Type f4132a;

        /* JADX INFO: renamed from: b */
        private final Type f4133b;

        /* JADX INFO: renamed from: c */
        private final Type[] f4134c;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                C0581a.m5038a(type != null || (Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null));
            }
            this.f4132a = type == null ? null : C0597b.m5152d(type);
            this.f4133b = C0597b.m5152d(type2);
            this.f4134c = (Type[]) typeArr.clone();
            for (int i = 0; i < this.f4134c.length; i++) {
                C0581a.m5037a(this.f4134c[i]);
                C0597b.m5156h(this.f4134c[i]);
                this.f4134c[i] = C0597b.m5152d(this.f4134c[i]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C0597b.m5147a((Type) this, (Type) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f4134c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f4132a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f4133b;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f4134c) ^ this.f4133b.hashCode()) ^ C0597b.m5137a((Object) this.f4132a);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((this.f4134c.length + 1) * 30);
            sb.append(C0597b.m5154f(this.f4133b));
            if (this.f4134c.length == 0) {
                return sb.toString();
            }
            sb.append("<").append(C0597b.m5154f(this.f4134c[0]));
            for (int i = 1; i < this.f4134c.length; i++) {
                sb.append(", ").append(C0597b.m5154f(this.f4134c[i]));
            }
            return sb.append(">").toString();
        }
    }

    /* JADX INFO: renamed from: com.google.a.b.b$c */
    private static final class c implements Serializable, WildcardType {

        /* JADX INFO: renamed from: a */
        private final Type f4135a;

        /* JADX INFO: renamed from: b */
        private final Type f4136b;

        public c(Type[] typeArr, Type[] typeArr2) {
            C0581a.m5038a(typeArr2.length <= 1);
            C0581a.m5038a(typeArr.length == 1);
            if (typeArr2.length != 1) {
                C0581a.m5037a(typeArr[0]);
                C0597b.m5156h(typeArr[0]);
                this.f4136b = null;
                this.f4135a = C0597b.m5152d(typeArr[0]);
                return;
            }
            C0581a.m5037a(typeArr2[0]);
            C0597b.m5156h(typeArr2[0]);
            C0581a.m5038a(typeArr[0] == Object.class);
            this.f4136b = C0597b.m5152d(typeArr2[0]);
            this.f4135a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C0597b.m5147a((Type) this, (Type) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return this.f4136b != null ? new Type[]{this.f4136b} : C0597b.f4130a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f4135a};
        }

        public int hashCode() {
            return (this.f4136b != null ? this.f4136b.hashCode() + 31 : 1) ^ (this.f4135a.hashCode() + 31);
        }

        public String toString() {
            return this.f4136b != null ? "? super " + C0597b.m5154f(this.f4136b) : this.f4135a == Object.class ? "?" : "? extends " + C0597b.m5154f(this.f4135a);
        }
    }

    /* JADX INFO: renamed from: a */
    static int m5137a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private static int m5138a(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: a */
    private static Class<?> m5139a(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static GenericArrayType m5140a(Type type) {
        return new a(type);
    }

    /* JADX INFO: renamed from: a */
    public static ParameterizedType m5141a(Type type, Type type2, Type... typeArr) {
        return new b(type, type2, typeArr);
    }

    /* JADX INFO: renamed from: a */
    public static Type m5142a(Type type, Class<?> cls) {
        Type typeM5148b = m5148b(type, cls, Collection.class);
        if (typeM5148b instanceof WildcardType) {
            typeM5148b = ((WildcardType) typeM5148b).getUpperBounds()[0];
        }
        return typeM5148b instanceof ParameterizedType ? ((ParameterizedType) typeM5148b).getActualTypeArguments()[0] : Object.class;
    }

    /* JADX INFO: renamed from: a */
    static Type m5143a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return m5143a(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m5143a(cls.getGenericSuperclass(), (Class<?>) superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: a */
    public static Type m5144a(Type type, Class<?> cls, Type type2) {
        Type typeM5144a;
        TypeVariable typeVariable;
        do {
            Type type3 = type2;
            if (!(type3 instanceof TypeVariable)) {
                if ((type3 instanceof Class) && ((Class) type3).isArray()) {
                    Class cls2 = (Class) type3;
                    Class<?> componentType = cls2.getComponentType();
                    Type typeM5144a2 = m5144a(type, cls, (Type) componentType);
                    return componentType != typeM5144a2 ? m5140a(typeM5144a2) : cls2;
                }
                if (type3 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type3;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeM5144a3 = m5144a(type, cls, genericComponentType);
                    return genericComponentType != typeM5144a3 ? m5140a(typeM5144a3) : genericArrayType;
                }
                if (!(type3 instanceof ParameterizedType)) {
                    if (!(type3 instanceof WildcardType)) {
                        return type3;
                    }
                    WildcardType wildcardType = (WildcardType) type3;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length != 1) {
                        return (upperBounds.length != 1 || (typeM5144a = m5144a(type, cls, upperBounds[0])) == upperBounds[0]) ? wildcardType : m5149b(typeM5144a);
                    }
                    Type typeM5144a4 = m5144a(type, cls, lowerBounds[0]);
                    return typeM5144a4 != lowerBounds[0] ? m5151c(typeM5144a4) : wildcardType;
                }
                ParameterizedType parameterizedType = (ParameterizedType) type3;
                Type ownerType = parameterizedType.getOwnerType();
                Type typeM5144a5 = m5144a(type, cls, ownerType);
                boolean z = typeM5144a5 != ownerType;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                int length = actualTypeArguments.length;
                boolean z2 = z;
                Type[] typeArr = actualTypeArguments;
                for (int i = 0; i < length; i++) {
                    Type typeM5144a6 = m5144a(type, cls, typeArr[i]);
                    if (typeM5144a6 != typeArr[i]) {
                        if (!z2) {
                            typeArr = (Type[]) typeArr.clone();
                            z2 = true;
                        }
                        typeArr[i] = typeM5144a6;
                    }
                }
                return z2 ? m5141a(typeM5144a5, parameterizedType.getRawType(), typeArr) : parameterizedType;
            }
            typeVariable = (TypeVariable) type3;
            type2 = m5145a(type, cls, (TypeVariable<?>) typeVariable);
        } while (type2 != typeVariable);
        return type2;
    }

    /* JADX INFO: renamed from: a */
    static Type m5145a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsM5139a = m5139a(typeVariable);
        if (clsM5139a == null) {
            return typeVariable;
        }
        Type typeM5143a = m5143a(type, cls, clsM5139a);
        if (!(typeM5143a instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) typeM5143a).getActualTypeArguments()[m5138a((Object[]) clsM5139a.getTypeParameters(), (Object) typeVariable)];
    }

    /* JADX INFO: renamed from: a */
    static boolean m5146a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5147a(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return m5146a((Object) parameterizedType.getOwnerType(), (Object) parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m5147a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX INFO: renamed from: b */
    static Type m5148b(Type type, Class<?> cls, Class<?> cls2) {
        C0581a.m5038a(cls2.isAssignableFrom(cls));
        return m5144a(type, cls, m5143a(type, cls, cls2));
    }

    /* JADX INFO: renamed from: b */
    public static WildcardType m5149b(Type type) {
        return new c(new Type[]{type}, f4130a);
    }

    /* JADX INFO: renamed from: b */
    public static Type[] m5150b(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type typeM5148b = m5148b(type, cls, Map.class);
        return typeM5148b instanceof ParameterizedType ? ((ParameterizedType) typeM5148b).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    /* JADX INFO: renamed from: c */
    public static WildcardType m5151c(Type type) {
        return new c(new Type[]{Object.class}, new Type[]{type});
    }

    /* JADX INFO: renamed from: d */
    public static Type m5152d(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(m5152d(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* JADX INFO: renamed from: e */
    public static Class<?> m5153e(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C0581a.m5038a(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m5153e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m5153e(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* JADX INFO: renamed from: f */
    public static String m5154f(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX INFO: renamed from: g */
    public static Type m5155g(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    /* JADX INFO: renamed from: h */
    static void m5156h(Type type) {
        C0581a.m5038a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }
}
