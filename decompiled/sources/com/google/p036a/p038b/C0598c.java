package com.google.p036a.p038b;

import com.google.p036a.C0620k;
import com.google.p036a.InterfaceC0615f;
import com.google.p036a.p041c.C0608a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: renamed from: com.google.a.b.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0598c {

    /* JADX INFO: renamed from: a */
    private final Map<Type, InterfaceC0615f<?>> f4137a;

    public C0598c(Map<Type, InterfaceC0615f<?>> map) {
        this.f4137a = map;
    }

    /* JADX INFO: renamed from: a */
    private <T> InterfaceC0603h<T> m5157a(Class<? super T> cls) {
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return new InterfaceC0603h<T>() { // from class: com.google.a.b.c.8
                @Override // com.google.p036a.p038b.InterfaceC0603h
                /* JADX INFO: renamed from: a */
                public T mo5161a() {
                    try {
                        return (T) declaredConstructor.newInstance(null);
                    } catch (IllegalAccessException e) {
                        throw new AssertionError(e);
                    } catch (InstantiationException e2) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e2);
                    } catch (InvocationTargetException e3) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e3.getTargetException());
                    }
                }
            };
        } catch (NoSuchMethodException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private <T> InterfaceC0603h<T> m5158a(final Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new InterfaceC0603h<T>() { // from class: com.google.a.b.c.9
                @Override // com.google.p036a.p038b.InterfaceC0603h
                /* JADX INFO: renamed from: a */
                public T mo5161a() {
                    return (T) new TreeSet();
                }
            } : EnumSet.class.isAssignableFrom(cls) ? new InterfaceC0603h<T>() { // from class: com.google.a.b.c.10
                @Override // com.google.p036a.p038b.InterfaceC0603h
                /* JADX INFO: renamed from: a */
                public T mo5161a() {
                    if (!(type instanceof ParameterizedType)) {
                        throw new C0620k("Invalid EnumSet type: " + type.toString());
                    }
                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    if (type2 instanceof Class) {
                        return (T) EnumSet.noneOf((Class) type2);
                    }
                    throw new C0620k("Invalid EnumSet type: " + type.toString());
                }
            } : Set.class.isAssignableFrom(cls) ? new InterfaceC0603h<T>() { // from class: com.google.a.b.c.11
                @Override // com.google.p036a.p038b.InterfaceC0603h
                /* JADX INFO: renamed from: a */
                public T mo5161a() {
                    return (T) new LinkedHashSet();
                }
            } : Queue.class.isAssignableFrom(cls) ? new InterfaceC0603h<T>() { // from class: com.google.a.b.c.12
                @Override // com.google.p036a.p038b.InterfaceC0603h
                /* JADX INFO: renamed from: a */
                public T mo5161a() {
                    return (T) new ArrayDeque();
                }
            } : new InterfaceC0603h<T>() { // from class: com.google.a.b.c.13
                @Override // com.google.p036a.p038b.InterfaceC0603h
                /* JADX INFO: renamed from: a */
                public T mo5161a() {
                    return (T) new ArrayList();
                }
            };
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new InterfaceC0603h<T>() { // from class: com.google.a.b.c.14
                @Override // com.google.p036a.p038b.InterfaceC0603h
                /* JADX INFO: renamed from: a */
                public T mo5161a() {
                    return (T) new ConcurrentSkipListMap();
                }
            } : ConcurrentMap.class.isAssignableFrom(cls) ? new InterfaceC0603h<T>() { // from class: com.google.a.b.c.2
                @Override // com.google.p036a.p038b.InterfaceC0603h
                /* JADX INFO: renamed from: a */
                public T mo5161a() {
                    return (T) new ConcurrentHashMap();
                }
            } : SortedMap.class.isAssignableFrom(cls) ? new InterfaceC0603h<T>() { // from class: com.google.a.b.c.3
                @Override // com.google.p036a.p038b.InterfaceC0603h
                /* JADX INFO: renamed from: a */
                public T mo5161a() {
                    return (T) new TreeMap();
                }
            } : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C0608a.m5201a(((ParameterizedType) type).getActualTypeArguments()[0]).m5204a())) ? new InterfaceC0603h<T>() { // from class: com.google.a.b.c.5
                @Override // com.google.p036a.p038b.InterfaceC0603h
                /* JADX INFO: renamed from: a */
                public T mo5161a() {
                    return (T) new C0602g();
                }
            } : new InterfaceC0603h<T>() { // from class: com.google.a.b.c.4
                @Override // com.google.p036a.p038b.InterfaceC0603h
                /* JADX INFO: renamed from: a */
                public T mo5161a() {
                    return (T) new LinkedHashMap();
                }
            };
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private <T> InterfaceC0603h<T> m5159b(final Type type, final Class<? super T> cls) {
        return new InterfaceC0603h<T>() { // from class: com.google.a.b.c.6

            /* JADX INFO: renamed from: d */
            private final AbstractC0606k f4154d = AbstractC0606k.m5193a();

            @Override // com.google.p036a.p038b.InterfaceC0603h
            /* JADX INFO: renamed from: a */
            public T mo5161a() {
                try {
                    return (T) this.f4154d.mo5196a(cls);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to invoke no-args constructor for " + type + ". Register an InstanceCreator with Gson for this type may fix this problem.", e);
                }
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public <T> InterfaceC0603h<T> m5160a(C0608a<T> c0608a) {
        final Type typeM5205b = c0608a.m5205b();
        Class<? super T> clsM5204a = c0608a.m5204a();
        final InterfaceC0615f<?> interfaceC0615f = this.f4137a.get(typeM5205b);
        if (interfaceC0615f != null) {
            return new InterfaceC0603h<T>() { // from class: com.google.a.b.c.1
                @Override // com.google.p036a.p038b.InterfaceC0603h
                /* JADX INFO: renamed from: a */
                public T mo5161a() {
                    return (T) interfaceC0615f.m5272a(typeM5205b);
                }
            };
        }
        final InterfaceC0615f<?> interfaceC0615f2 = this.f4137a.get(clsM5204a);
        if (interfaceC0615f2 != null) {
            return new InterfaceC0603h<T>() { // from class: com.google.a.b.c.7
                @Override // com.google.p036a.p038b.InterfaceC0603h
                /* JADX INFO: renamed from: a */
                public T mo5161a() {
                    return (T) interfaceC0615f2.m5272a(typeM5205b);
                }
            };
        }
        InterfaceC0603h<T> interfaceC0603hM5157a = m5157a(clsM5204a);
        if (interfaceC0603hM5157a != null) {
            return interfaceC0603hM5157a;
        }
        InterfaceC0603h<T> interfaceC0603hM5158a = m5158a(typeM5205b, clsM5204a);
        return interfaceC0603hM5158a == null ? m5159b(typeM5205b, clsM5204a) : interfaceC0603hM5158a;
    }

    public String toString() {
        return this.f4137a.toString();
    }
}
