package com.google.p036a.p038b.p039a;

import com.google.p036a.AbstractC0629t;
import com.google.p036a.C0614e;
import com.google.p036a.InterfaceC0630u;
import com.google.p036a.p038b.C0597b;
import com.google.p036a.p041c.C0608a;
import com.google.p036a.p042d.C0610a;
import com.google.p036a.p042d.C0612c;
import com.google.p036a.p042d.EnumC0611b;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.a.b.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0582a<E> extends AbstractC0629t<Object> {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0630u f3999a = new InterfaceC0630u() { // from class: com.google.a.b.a.a.1
        @Override // com.google.p036a.InterfaceC0630u
        /* JADX INFO: renamed from: a */
        public <T> AbstractC0629t<T> mo5041a(C0614e c0614e, C0608a<T> c0608a) {
            Type typeM5205b = c0608a.m5205b();
            if (!(typeM5205b instanceof GenericArrayType) && (!(typeM5205b instanceof Class) || !((Class) typeM5205b).isArray())) {
                return null;
            }
            Type typeM5155g = C0597b.m5155g(typeM5205b);
            return new C0582a(c0614e, c0614e.m5253a((C0608a) C0608a.m5201a(typeM5155g)), C0597b.m5153e(typeM5155g));
        }
    };

    /* JADX INFO: renamed from: b */
    private final Class<E> f4000b;

    /* JADX INFO: renamed from: c */
    private final AbstractC0629t<E> f4001c;

    public C0582a(C0614e c0614e, AbstractC0629t<E> abstractC0629t, Class<E> cls) {
        this.f4001c = new C0595m(c0614e, abstractC0629t, cls);
        this.f4000b = cls;
    }

    @Override // com.google.p036a.AbstractC0629t
    /* JADX INFO: renamed from: a */
    public void mo5039a(C0612c c0612c, Object obj) throws IOException {
        if (obj == null) {
            c0612c.mo5085f();
            return;
        }
        c0612c.mo5080b();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f4001c.mo5039a(c0612c, (E) Array.get(obj, i));
        }
        c0612c.mo5082c();
    }

    @Override // com.google.p036a.AbstractC0629t
    /* JADX INFO: renamed from: b */
    public Object mo5040b(C0610a c0610a) throws IOException {
        if (c0610a.mo5061f() == EnumC0611b.NULL) {
            c0610a.mo5065j();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c0610a.mo5056a();
        while (c0610a.mo5060e()) {
            arrayList.add(this.f4001c.mo5040b(c0610a));
        }
        c0610a.mo5057b();
        Object objNewInstance = Array.newInstance((Class<?>) this.f4000b, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }
}
