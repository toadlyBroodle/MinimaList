package android.arch.lifecycle;

import android.arch.lifecycle.AbstractC0005b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements InterfaceC0004a {

    /* JADX INFO: renamed from: a */
    static final Map<Class, C0002a> f14a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Object f15b;

    /* JADX INFO: renamed from: c */
    private final C0002a f16c;

    /* JADX INFO: renamed from: android.arch.lifecycle.ReflectiveGenericLifecycleObserver$a */
    static class C0002a {

        /* JADX INFO: renamed from: a */
        final Map<AbstractC0005b.a, List<C0003b>> f17a = new HashMap();

        /* JADX INFO: renamed from: b */
        final Map<C0003b, AbstractC0005b.a> f18b;

        C0002a(Map<C0003b, AbstractC0005b.a> map) {
            this.f18b = map;
            for (Map.Entry<C0003b, AbstractC0005b.a> entry : map.entrySet()) {
                AbstractC0005b.a value = entry.getValue();
                List<C0003b> arrayList = this.f17a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f17a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }
    }

    /* JADX INFO: renamed from: android.arch.lifecycle.ReflectiveGenericLifecycleObserver$b */
    static class C0003b {

        /* JADX INFO: renamed from: a */
        final int f19a;

        /* JADX INFO: renamed from: b */
        final Method f20b;

        C0003b(int i, Method method) {
            this.f19a = i;
            this.f20b = method;
            this.f20b.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0003b c0003b = (C0003b) obj;
            return this.f19a == c0003b.f19a && this.f20b.getName().equals(c0003b.f20b.getName());
        }

        public int hashCode() {
            return (this.f19a * 31) + this.f20b.getName().hashCode();
        }
    }

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f15b = obj;
        this.f16c = m11a(this.f15b.getClass());
    }

    /* JADX INFO: renamed from: a */
    private static C0002a m11a(Class cls) {
        C0002a c0002a = f14a.get(cls);
        return c0002a != null ? c0002a : m16b(cls);
    }

    /* JADX INFO: renamed from: a */
    private void m12a(C0002a c0002a, InterfaceC0006c interfaceC0006c, AbstractC0005b.a aVar) {
        m14a(c0002a.f17a.get(aVar), interfaceC0006c, aVar);
        m14a(c0002a.f17a.get(AbstractC0005b.a.ON_ANY), interfaceC0006c, aVar);
    }

    /* JADX INFO: renamed from: a */
    private void m13a(C0003b c0003b, InterfaceC0006c interfaceC0006c, AbstractC0005b.a aVar) {
        try {
            switch (c0003b.f19a) {
                case 0:
                    c0003b.f20b.invoke(this.f15b, new Object[0]);
                    return;
                case 1:
                    c0003b.f20b.invoke(this.f15b, interfaceC0006c);
                    return;
                case 2:
                    c0003b.f20b.invoke(this.f15b, interfaceC0006c, aVar);
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException("Failed to call observer method", e2.getCause());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m14a(List<C0003b> list, InterfaceC0006c interfaceC0006c, AbstractC0005b.a aVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                m13a(list.get(size), interfaceC0006c, aVar);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m15a(Map<C0003b, AbstractC0005b.a> map, C0003b c0003b, AbstractC0005b.a aVar, Class cls) {
        AbstractC0005b.a aVar2 = map.get(c0003b);
        if (aVar2 != null && aVar != aVar2) {
            throw new IllegalArgumentException("Method " + c0003b.f20b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        }
        if (aVar2 == null) {
            map.put(c0003b, aVar);
        }
    }

    /* JADX INFO: renamed from: b */
    private static C0002a m16b(Class cls) {
        int i;
        C0002a c0002aM11a;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (c0002aM11a = m11a(superclass)) != null) {
            map.putAll(c0002aM11a.f18b);
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0003b, AbstractC0005b.a> entry : m11a(cls2).f18b.entrySet()) {
                m15a(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        for (Method method : declaredMethods) {
            InterfaceC0009f interfaceC0009f = (InterfaceC0009f) method.getAnnotation(InterfaceC0009f.class);
            if (interfaceC0009f != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(InterfaceC0006c.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                AbstractC0005b.a aVarM33a = interfaceC0009f.m33a();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(AbstractC0005b.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarM33a != AbstractC0005b.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m15a(map, new C0003b(i, method), aVarM33a, cls);
            }
        }
        C0002a c0002a = new C0002a(map);
        f14a.put(cls, c0002a);
        return c0002a;
    }

    @Override // android.arch.lifecycle.InterfaceC0004a
    /* JADX INFO: renamed from: a */
    public void mo17a(InterfaceC0006c interfaceC0006c, AbstractC0005b.a aVar) {
        m12a(this.f16c, interfaceC0006c, aVar);
    }
}
