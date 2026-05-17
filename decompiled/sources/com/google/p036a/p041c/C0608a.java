package com.google.p036a.p041c;

import com.google.p036a.p038b.C0581a;
import com.google.p036a.p038b.C0597b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.google.a.c.a */
/* JADX INFO: loaded from: classes.dex */
public class C0608a<T> {

    /* JADX INFO: renamed from: b */
    final Class<? super T> f4217b;

    /* JADX INFO: renamed from: c */
    final Type f4218c;

    /* JADX INFO: renamed from: d */
    final int f4219d;

    protected C0608a() {
        this.f4218c = m5202a(getClass());
        this.f4217b = (Class<? super T>) C0597b.m5153e(this.f4218c);
        this.f4219d = this.f4218c.hashCode();
    }

    C0608a(Type type) {
        this.f4218c = C0597b.m5152d((Type) C0581a.m5037a(type));
        this.f4217b = (Class<? super T>) C0597b.m5153e(this.f4218c);
        this.f4219d = this.f4218c.hashCode();
    }

    /* JADX INFO: renamed from: a */
    public static C0608a<?> m5201a(Type type) {
        return new C0608a<>(type);
    }

    /* JADX INFO: renamed from: a */
    static Type m5202a(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        return C0597b.m5152d(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
    }

    /* JADX INFO: renamed from: b */
    public static <T> C0608a<T> m5203b(Class<T> cls) {
        return new C0608a<>(cls);
    }

    /* JADX INFO: renamed from: a */
    public final Class<? super T> m5204a() {
        return this.f4217b;
    }

    /* JADX INFO: renamed from: b */
    public final Type m5205b() {
        return this.f4218c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0608a) && C0597b.m5147a(this.f4218c, ((C0608a) obj).f4218c);
    }

    public final int hashCode() {
        return this.f4219d;
    }

    public final String toString() {
        return C0597b.m5154f(this.f4218c);
    }
}
