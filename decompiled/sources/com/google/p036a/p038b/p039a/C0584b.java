package com.google.p036a.p038b.p039a;

import com.google.p036a.AbstractC0629t;
import com.google.p036a.C0614e;
import com.google.p036a.InterfaceC0630u;
import com.google.p036a.p038b.C0597b;
import com.google.p036a.p038b.C0598c;
import com.google.p036a.p038b.InterfaceC0603h;
import com.google.p036a.p041c.C0608a;
import com.google.p036a.p042d.C0610a;
import com.google.p036a.p042d.C0612c;
import com.google.p036a.p042d.EnumC0611b;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.a.b.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0584b implements InterfaceC0630u {

    /* JADX INFO: renamed from: a */
    private final C0598c f4003a;

    /* JADX INFO: renamed from: com.google.a.b.a.b$a */
    private static final class a<E> extends AbstractC0629t<Collection<E>> {

        /* JADX INFO: renamed from: a */
        private final AbstractC0629t<E> f4004a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC0603h<? extends Collection<E>> f4005b;

        public a(C0614e c0614e, Type type, AbstractC0629t<E> abstractC0629t, InterfaceC0603h<? extends Collection<E>> interfaceC0603h) {
            this.f4004a = new C0595m(c0614e, abstractC0629t, type);
            this.f4005b = interfaceC0603h;
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<E> mo5040b(C0610a c0610a) throws IOException {
            if (c0610a.mo5061f() == EnumC0611b.NULL) {
                c0610a.mo5065j();
                return null;
            }
            Collection<E> collectionMo5161a = this.f4005b.mo5161a();
            c0610a.mo5056a();
            while (c0610a.mo5060e()) {
                collectionMo5161a.add(this.f4004a.mo5040b(c0610a));
            }
            c0610a.mo5057b();
            return collectionMo5161a;
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, Collection<E> collection) throws IOException {
            if (collection == null) {
                c0612c.mo5085f();
                return;
            }
            c0612c.mo5080b();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f4004a.mo5039a(c0612c, it.next());
            }
            c0612c.mo5082c();
        }
    }

    public C0584b(C0598c c0598c) {
        this.f4003a = c0598c;
    }

    @Override // com.google.p036a.InterfaceC0630u
    /* JADX INFO: renamed from: a */
    public <T> AbstractC0629t<T> mo5041a(C0614e c0614e, C0608a<T> c0608a) {
        Type typeM5205b = c0608a.m5205b();
        Class<? super T> clsM5204a = c0608a.m5204a();
        if (!Collection.class.isAssignableFrom(clsM5204a)) {
            return null;
        }
        Type typeM5142a = C0597b.m5142a(typeM5205b, (Class<?>) clsM5204a);
        return new a(c0614e, typeM5142a, c0614e.m5253a((C0608a) C0608a.m5201a(typeM5142a)), this.f4003a.m5160a(c0608a));
    }
}
