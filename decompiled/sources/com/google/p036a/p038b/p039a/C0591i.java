package com.google.p036a.p038b.p039a;

import com.google.p036a.AbstractC0629t;
import com.google.p036a.C0614e;
import com.google.p036a.C0627r;
import com.google.p036a.InterfaceC0609d;
import com.google.p036a.InterfaceC0630u;
import com.google.p036a.p037a.InterfaceC0576b;
import com.google.p036a.p037a.InterfaceC0577c;
import com.google.p036a.p038b.C0597b;
import com.google.p036a.p038b.C0598c;
import com.google.p036a.p038b.C0599d;
import com.google.p036a.p038b.C0604i;
import com.google.p036a.p038b.InterfaceC0603h;
import com.google.p036a.p041c.C0608a;
import com.google.p036a.p042d.C0610a;
import com.google.p036a.p042d.C0612c;
import com.google.p036a.p042d.EnumC0611b;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.a.b.a.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0591i implements InterfaceC0630u {

    /* JADX INFO: renamed from: a */
    private final C0598c f4030a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0609d f4031b;

    /* JADX INFO: renamed from: c */
    private final C0599d f4032c;

    /* JADX INFO: renamed from: d */
    private final C0586d f4033d;

    /* JADX INFO: renamed from: com.google.a.b.a.i$a */
    public static final class a<T> extends AbstractC0629t<T> {

        /* JADX INFO: renamed from: a */
        private final InterfaceC0603h<T> f4041a;

        /* JADX INFO: renamed from: b */
        private final Map<String, b> f4042b;

        a(InterfaceC0603h<T> interfaceC0603h, Map<String, b> map) {
            this.f4041a = interfaceC0603h;
            this.f4042b = map;
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a */
        public void mo5039a(C0612c c0612c, T t) throws IOException {
            if (t == null) {
                c0612c.mo5085f();
                return;
            }
            c0612c.mo5083d();
            try {
                for (b bVar : this.f4042b.values()) {
                    if (bVar.mo5097a(t)) {
                        c0612c.mo5077a(bVar.f4043h);
                        bVar.mo5096a(c0612c, t);
                    }
                }
                c0612c.mo5084e();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: b */
        public T mo5040b(C0610a c0610a) throws IOException {
            if (c0610a.mo5061f() == EnumC0611b.NULL) {
                c0610a.mo5065j();
                return null;
            }
            T tMo5161a = this.f4041a.mo5161a();
            try {
                c0610a.mo5058c();
                while (c0610a.mo5060e()) {
                    b bVar = this.f4042b.get(c0610a.mo5062g());
                    if (bVar == null || !bVar.f4045j) {
                        c0610a.mo5069n();
                    } else {
                        bVar.mo5095a(c0610a, tMo5161a);
                    }
                }
                c0610a.mo5059d();
                return tMo5161a;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                throw new C0627r(e2);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.a.b.a.i$b */
    static abstract class b {

        /* JADX INFO: renamed from: h */
        final String f4043h;

        /* JADX INFO: renamed from: i */
        final boolean f4044i;

        /* JADX INFO: renamed from: j */
        final boolean f4045j;

        protected b(String str, boolean z, boolean z2) {
            this.f4043h = str;
            this.f4044i = z;
            this.f4045j = z2;
        }

        /* JADX INFO: renamed from: a */
        abstract void mo5095a(C0610a c0610a, Object obj);

        /* JADX INFO: renamed from: a */
        abstract void mo5096a(C0612c c0612c, Object obj);

        /* JADX INFO: renamed from: a */
        abstract boolean mo5097a(Object obj);
    }

    public C0591i(C0598c c0598c, InterfaceC0609d interfaceC0609d, C0599d c0599d, C0586d c0586d) {
        this.f4030a = c0598c;
        this.f4031b = interfaceC0609d;
        this.f4032c = c0599d;
        this.f4033d = c0586d;
    }

    /* JADX INFO: renamed from: a */
    private b m5090a(final C0614e c0614e, final Field field, String str, final C0608a<?> c0608a, boolean z, boolean z2) {
        final boolean zM5189a = C0604i.m5189a(c0608a.m5204a());
        InterfaceC0576b interfaceC0576b = (InterfaceC0576b) field.getAnnotation(InterfaceC0576b.class);
        final AbstractC0629t<?> abstractC0629tM5050a = interfaceC0576b != null ? this.f4033d.m5050a(this.f4030a, c0614e, c0608a, interfaceC0576b) : null;
        final boolean z3 = abstractC0629tM5050a != null;
        if (abstractC0629tM5050a == null) {
            abstractC0629tM5050a = c0614e.m5253a((C0608a) c0608a);
        }
        return new b(str, z, z2) { // from class: com.google.a.b.a.i.1
            @Override // com.google.p036a.p038b.p039a.C0591i.b
            /* JADX INFO: renamed from: a */
            void mo5095a(C0610a c0610a, Object obj) throws IllegalAccessException {
                Object objMo5040b = abstractC0629tM5050a.mo5040b(c0610a);
                if (objMo5040b == null && zM5189a) {
                    return;
                }
                field.set(obj, objMo5040b);
            }

            @Override // com.google.p036a.p038b.p039a.C0591i.b
            /* JADX INFO: renamed from: a */
            void mo5096a(C0612c c0612c, Object obj) throws IllegalAccessException {
                (z3 ? abstractC0629tM5050a : new C0595m(c0614e, abstractC0629tM5050a, c0608a.m5205b())).mo5039a(c0612c, field.get(obj));
            }

            @Override // com.google.p036a.p038b.p039a.C0591i.b
            /* JADX INFO: renamed from: a */
            public boolean mo5097a(Object obj) {
                return this.f4044i && field.get(obj) != obj;
            }
        };
    }

    /* JADX INFO: renamed from: a */
    private List<String> m5091a(Field field) {
        InterfaceC0577c interfaceC0577c = (InterfaceC0577c) field.getAnnotation(InterfaceC0577c.class);
        if (interfaceC0577c == null) {
            return Collections.singletonList(this.f4031b.mo5200a(field));
        }
        String strM5033a = interfaceC0577c.m5033a();
        String[] strArrM5034b = interfaceC0577c.m5034b();
        if (strArrM5034b.length == 0) {
            return Collections.singletonList(strM5033a);
        }
        ArrayList arrayList = new ArrayList(strArrM5034b.length + 1);
        arrayList.add(strM5033a);
        for (String str : strArrM5034b) {
            arrayList.add(str);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private Map<String, b> m5092a(C0614e c0614e, C0608a<?> c0608a, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type typeM5205b = c0608a.m5205b();
        while (cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                boolean zM5094a = m5094a(field, true);
                boolean zM5094a2 = m5094a(field, false);
                if (zM5094a || zM5094a2) {
                    field.setAccessible(true);
                    Type typeM5144a = C0597b.m5144a(c0608a.m5205b(), cls, field.getGenericType());
                    List<String> listM5091a = m5091a(field);
                    b bVar = null;
                    int i = 0;
                    while (i < listM5091a.size()) {
                        String str = listM5091a.get(i);
                        if (i != 0) {
                            zM5094a = false;
                        }
                        b bVar2 = (b) linkedHashMap.put(str, m5090a(c0614e, field, str, C0608a.m5201a(typeM5144a), zM5094a, zM5094a2));
                        if (bVar != null) {
                            bVar2 = bVar;
                        }
                        i++;
                        bVar = bVar2;
                    }
                    if (bVar != null) {
                        throw new IllegalArgumentException(typeM5205b + " declares multiple JSON fields named " + bVar.f4043h);
                    }
                }
            }
            c0608a = C0608a.m5201a(C0597b.m5144a(c0608a.m5205b(), cls, cls.getGenericSuperclass()));
            cls = c0608a.m5204a();
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    static boolean m5093a(Field field, boolean z, C0599d c0599d) {
        return (c0599d.m5169a(field.getType(), z) || c0599d.m5170a(field, z)) ? false : true;
    }

    @Override // com.google.p036a.InterfaceC0630u
    /* JADX INFO: renamed from: a */
    public <T> AbstractC0629t<T> mo5041a(C0614e c0614e, C0608a<T> c0608a) {
        Class<? super T> clsM5204a = c0608a.m5204a();
        if (Object.class.isAssignableFrom(clsM5204a)) {
            return new a(this.f4030a.m5160a(c0608a), m5092a(c0614e, (C0608a<?>) c0608a, (Class<?>) clsM5204a));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m5094a(Field field, boolean z) {
        return m5093a(field, z, this.f4032c);
    }
}
