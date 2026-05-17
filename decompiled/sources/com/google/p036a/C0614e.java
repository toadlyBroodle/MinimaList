package com.google.p036a;

import com.google.p036a.p038b.C0598c;
import com.google.p036a.p038b.C0599d;
import com.google.p036a.p038b.C0605j;
import com.google.p036a.p038b.p039a.C0582a;
import com.google.p036a.p038b.p039a.C0584b;
import com.google.p036a.p038b.p039a.C0585c;
import com.google.p036a.p038b.p039a.C0586d;
import com.google.p036a.p038b.p039a.C0589g;
import com.google.p036a.p038b.p039a.C0590h;
import com.google.p036a.p038b.p039a.C0591i;
import com.google.p036a.p038b.p039a.C0592j;
import com.google.p036a.p038b.p039a.C0593k;
import com.google.p036a.p038b.p039a.C0596n;
import com.google.p036a.p041c.C0608a;
import com.google.p036a.p042d.C0610a;
import com.google.p036a.p042d.C0612c;
import com.google.p036a.p042d.C0613d;
import com.google.p036a.p042d.EnumC0611b;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: renamed from: com.google.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0614e {

    /* JADX INFO: renamed from: a */
    private static final C0608a<?> f4258a = new C0608a<Object>() { // from class: com.google.a.e.1
    };

    /* JADX INFO: renamed from: b */
    private final ThreadLocal<Map<C0608a<?>, a<?>>> f4259b;

    /* JADX INFO: renamed from: c */
    private final Map<C0608a<?>, AbstractC0629t<?>> f4260c;

    /* JADX INFO: renamed from: d */
    private final List<InterfaceC0630u> f4261d;

    /* JADX INFO: renamed from: e */
    private final C0598c f4262e;

    /* JADX INFO: renamed from: f */
    private final C0599d f4263f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC0609d f4264g;

    /* JADX INFO: renamed from: h */
    private final boolean f4265h;

    /* JADX INFO: renamed from: i */
    private final boolean f4266i;

    /* JADX INFO: renamed from: j */
    private final boolean f4267j;

    /* JADX INFO: renamed from: k */
    private final boolean f4268k;

    /* JADX INFO: renamed from: l */
    private final boolean f4269l;

    /* JADX INFO: renamed from: m */
    private final C0586d f4270m;

    /* JADX INFO: renamed from: com.google.a.e$a */
    static class a<T> extends AbstractC0629t<T> {

        /* JADX INFO: renamed from: a */
        private AbstractC0629t<T> f4275a;

        a() {
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a */
        public void mo5039a(C0612c c0612c, T t) {
            if (this.f4275a == null) {
                throw new IllegalStateException();
            }
            this.f4275a.mo5039a(c0612c, t);
        }

        /* JADX INFO: renamed from: a */
        public void m5271a(AbstractC0629t<T> abstractC0629t) {
            if (this.f4275a != null) {
                throw new AssertionError();
            }
            this.f4275a = abstractC0629t;
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: b */
        public T mo5040b(C0610a c0610a) {
            if (this.f4275a == null) {
                throw new IllegalStateException();
            }
            return this.f4275a.mo5040b(c0610a);
        }
    }

    public C0614e() {
        this(C0599d.f4161a, EnumC0607c.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, EnumC0628s.DEFAULT, Collections.emptyList());
    }

    C0614e(C0599d c0599d, InterfaceC0609d interfaceC0609d, Map<Type, InterfaceC0615f<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, EnumC0628s enumC0628s, List<InterfaceC0630u> list) {
        this.f4259b = new ThreadLocal<>();
        this.f4260c = new ConcurrentHashMap();
        this.f4262e = new C0598c(map);
        this.f4263f = c0599d;
        this.f4264g = interfaceC0609d;
        this.f4265h = z;
        this.f4267j = z3;
        this.f4266i = z4;
        this.f4268k = z5;
        this.f4269l = z6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C0596n.f4085Y);
        arrayList.add(C0590h.f4027a);
        arrayList.add(c0599d);
        arrayList.addAll(list);
        arrayList.add(C0596n.f4064D);
        arrayList.add(C0596n.f4099m);
        arrayList.add(C0596n.f4093g);
        arrayList.add(C0596n.f4095i);
        arrayList.add(C0596n.f4097k);
        AbstractC0629t<Number> abstractC0629tM5244a = m5244a(enumC0628s);
        arrayList.add(C0596n.m5103a(Long.TYPE, Long.class, abstractC0629tM5244a));
        arrayList.add(C0596n.m5103a(Double.TYPE, Double.class, m5246a(z7)));
        arrayList.add(C0596n.m5103a(Float.TYPE, Float.class, m5250b(z7)));
        arrayList.add(C0596n.f4110x);
        arrayList.add(C0596n.f4101o);
        arrayList.add(C0596n.f4103q);
        arrayList.add(C0596n.m5102a(AtomicLong.class, m5245a(abstractC0629tM5244a)));
        arrayList.add(C0596n.m5102a(AtomicLongArray.class, m5249b(abstractC0629tM5244a)));
        arrayList.add(C0596n.f4105s);
        arrayList.add(C0596n.f4112z);
        arrayList.add(C0596n.f4066F);
        arrayList.add(C0596n.f4068H);
        arrayList.add(C0596n.m5102a(BigDecimal.class, C0596n.f4062B));
        arrayList.add(C0596n.m5102a(BigInteger.class, C0596n.f4063C));
        arrayList.add(C0596n.f4070J);
        arrayList.add(C0596n.f4072L);
        arrayList.add(C0596n.f4076P);
        arrayList.add(C0596n.f4078R);
        arrayList.add(C0596n.f4083W);
        arrayList.add(C0596n.f4074N);
        arrayList.add(C0596n.f4090d);
        arrayList.add(C0585c.f4006a);
        arrayList.add(C0596n.f4081U);
        arrayList.add(C0593k.f4048a);
        arrayList.add(C0592j.f4046a);
        arrayList.add(C0596n.f4079S);
        arrayList.add(C0582a.f3999a);
        arrayList.add(C0596n.f4088b);
        arrayList.add(new C0584b(this.f4262e));
        arrayList.add(new C0589g(this.f4262e, z2));
        this.f4270m = new C0586d(this.f4262e);
        arrayList.add(this.f4270m);
        arrayList.add(C0596n.f4086Z);
        arrayList.add(new C0591i(this.f4262e, interfaceC0609d, c0599d, this.f4270m));
        this.f4261d = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: a */
    private static AbstractC0629t<Number> m5244a(EnumC0628s enumC0628s) {
        return enumC0628s == EnumC0628s.DEFAULT ? C0596n.f4106t : new AbstractC0629t<Number>() { // from class: com.google.a.e.4
            @Override // com.google.p036a.AbstractC0629t
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Number mo5040b(C0610a c0610a) throws IOException {
                if (c0610a.mo5061f() != EnumC0611b.NULL) {
                    return Long.valueOf(c0610a.mo5067l());
                }
                c0610a.mo5065j();
                return null;
            }

            @Override // com.google.p036a.AbstractC0629t
            /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo5039a(C0612c c0612c, Number number) throws IOException {
                if (number == null) {
                    c0612c.mo5085f();
                } else {
                    c0612c.mo5081b(number.toString());
                }
            }
        };
    }

    /* JADX INFO: renamed from: a */
    private static AbstractC0629t<AtomicLong> m5245a(final AbstractC0629t<Number> abstractC0629t) {
        return new AbstractC0629t<AtomicLong>() { // from class: com.google.a.e.5
            @Override // com.google.p036a.AbstractC0629t
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public AtomicLong mo5040b(C0610a c0610a) {
                return new AtomicLong(((Number) abstractC0629t.mo5040b(c0610a)).longValue());
            }

            @Override // com.google.p036a.AbstractC0629t
            /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo5039a(C0612c c0612c, AtomicLong atomicLong) {
                abstractC0629t.mo5039a(c0612c, Long.valueOf(atomicLong.get()));
            }
        }.m5299a();
    }

    /* JADX INFO: renamed from: a */
    private AbstractC0629t<Number> m5246a(boolean z) {
        return z ? C0596n.f4108v : new AbstractC0629t<Number>() { // from class: com.google.a.e.2
            @Override // com.google.p036a.AbstractC0629t
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Double mo5040b(C0610a c0610a) throws IOException {
                if (c0610a.mo5061f() != EnumC0611b.NULL) {
                    return Double.valueOf(c0610a.mo5066k());
                }
                c0610a.mo5065j();
                return null;
            }

            @Override // com.google.p036a.AbstractC0629t
            /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo5039a(C0612c c0612c, Number number) throws IOException {
                if (number == null) {
                    c0612c.mo5085f();
                } else {
                    C0614e.m5247a(number.doubleValue());
                    c0612c.mo5076a(number);
                }
            }
        };
    }

    /* JADX INFO: renamed from: a */
    static void m5247a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m5248a(Object obj, C0610a c0610a) {
        if (obj != null) {
            try {
                if (c0610a.mo5061f() != EnumC0611b.END_DOCUMENT) {
                    throw new C0620k("JSON document was not fully consumed.");
                }
            } catch (C0613d e) {
                throw new C0627r(e);
            } catch (IOException e2) {
                throw new C0620k(e2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static AbstractC0629t<AtomicLongArray> m5249b(final AbstractC0629t<Number> abstractC0629t) {
        return new AbstractC0629t<AtomicLongArray>() { // from class: com.google.a.e.6
            @Override // com.google.p036a.AbstractC0629t
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public AtomicLongArray mo5040b(C0610a c0610a) throws IOException {
                ArrayList arrayList = new ArrayList();
                c0610a.mo5056a();
                while (c0610a.mo5060e()) {
                    arrayList.add(Long.valueOf(((Number) abstractC0629t.mo5040b(c0610a)).longValue()));
                }
                c0610a.mo5057b();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.p036a.AbstractC0629t
            /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo5039a(C0612c c0612c, AtomicLongArray atomicLongArray) throws IOException {
                c0612c.mo5080b();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    abstractC0629t.mo5039a(c0612c, Long.valueOf(atomicLongArray.get(i)));
                }
                c0612c.mo5082c();
            }
        }.m5299a();
    }

    /* JADX INFO: renamed from: b */
    private AbstractC0629t<Number> m5250b(boolean z) {
        return z ? C0596n.f4107u : new AbstractC0629t<Number>() { // from class: com.google.a.e.3
            @Override // com.google.p036a.AbstractC0629t
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Float mo5040b(C0610a c0610a) throws IOException {
                if (c0610a.mo5061f() != EnumC0611b.NULL) {
                    return Float.valueOf((float) c0610a.mo5066k());
                }
                c0610a.mo5065j();
                return null;
            }

            @Override // com.google.p036a.AbstractC0629t
            /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo5039a(C0612c c0612c, Number number) throws IOException {
                if (number == null) {
                    c0612c.mo5085f();
                } else {
                    C0614e.m5247a(number.floatValue());
                    c0612c.mo5076a(number);
                }
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public C0610a m5251a(Reader reader) {
        C0610a c0610a = new C0610a(reader);
        c0610a.m5224a(this.f4269l);
        return c0610a;
    }

    /* JADX INFO: renamed from: a */
    public C0612c m5252a(Writer writer) throws IOException {
        if (this.f4267j) {
            writer.write(")]}'\n");
        }
        C0612c c0612c = new C0612c(writer);
        if (this.f4268k) {
            c0612c.m5238c("  ");
        }
        c0612c.m5240d(this.f4265h);
        return c0612c;
    }

    /* JADX INFO: renamed from: a */
    public <T> AbstractC0629t<T> m5253a(C0608a<T> c0608a) {
        Map map;
        AbstractC0629t<T> abstractC0629tMo5041a = (AbstractC0629t) this.f4260c.get(c0608a == null ? f4258a : c0608a);
        if (abstractC0629tMo5041a == null) {
            Map<C0608a<?>, a<?>> map2 = this.f4259b.get();
            boolean z = false;
            if (map2 == null) {
                HashMap map3 = new HashMap();
                this.f4259b.set(map3);
                map = map3;
                z = true;
            } else {
                map = map2;
            }
            abstractC0629tMo5041a = (a) map.get(c0608a);
            if (abstractC0629tMo5041a == null) {
                try {
                    a aVar = new a();
                    map.put(c0608a, aVar);
                    Iterator<InterfaceC0630u> it = this.f4261d.iterator();
                    while (it.hasNext()) {
                        abstractC0629tMo5041a = it.next().mo5041a(this, c0608a);
                        if (abstractC0629tMo5041a != null) {
                            aVar.m5271a((AbstractC0629t) abstractC0629tMo5041a);
                            this.f4260c.put(c0608a, abstractC0629tMo5041a);
                            map.remove(c0608a);
                            if (z) {
                                this.f4259b.remove();
                            }
                        }
                    }
                    throw new IllegalArgumentException("GSON cannot handle " + c0608a);
                } catch (Throwable th) {
                    map.remove(c0608a);
                    if (z) {
                        this.f4259b.remove();
                    }
                    throw th;
                }
            }
        }
        return abstractC0629tMo5041a;
    }

    /* JADX INFO: renamed from: a */
    public <T> AbstractC0629t<T> m5254a(InterfaceC0630u interfaceC0630u, C0608a<T> c0608a) {
        if (!this.f4261d.contains(interfaceC0630u)) {
            interfaceC0630u = this.f4270m;
        }
        boolean z = false;
        for (InterfaceC0630u interfaceC0630u2 : this.f4261d) {
            if (z) {
                AbstractC0629t<T> abstractC0629tMo5041a = interfaceC0630u2.mo5041a(this, c0608a);
                if (abstractC0629tMo5041a != null) {
                    return abstractC0629tMo5041a;
                }
            } else if (interfaceC0630u2 == interfaceC0630u) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + c0608a);
    }

    /* JADX INFO: renamed from: a */
    public <T> AbstractC0629t<T> m5255a(Class<T> cls) {
        return m5253a((C0608a) C0608a.m5203b(cls));
    }

    /* JADX INFO: renamed from: a */
    public <T> T m5256a(C0610a c0610a, Type type) {
        boolean z = true;
        boolean zM5225q = c0610a.m5225q();
        c0610a.m5224a(true);
        try {
            try {
                c0610a.mo5061f();
                z = false;
                T tMo5040b = m5253a((C0608a) C0608a.m5201a(type)).mo5040b(c0610a);
                c0610a.m5224a(zM5225q);
                return tMo5040b;
            } catch (EOFException e) {
                if (!z) {
                    throw new C0627r(e);
                }
                c0610a.m5224a(zM5225q);
                return null;
            } catch (IOException e2) {
                throw new C0627r(e2);
            } catch (IllegalStateException e3) {
                throw new C0627r(e3);
            }
        } catch (Throwable th) {
            c0610a.m5224a(zM5225q);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public <T> T m5257a(Reader reader, Type type) {
        C0610a c0610aM5251a = m5251a(reader);
        T t = (T) m5256a(c0610aM5251a, type);
        m5248a(t, c0610aM5251a);
        return t;
    }

    /* JADX INFO: renamed from: a */
    public <T> T m5258a(String str, Type type) {
        if (str == null) {
            return null;
        }
        return (T) m5257a((Reader) new StringReader(str), type);
    }

    /* JADX INFO: renamed from: a */
    public String m5259a(AbstractC0619j abstractC0619j) {
        StringWriter stringWriter = new StringWriter();
        m5263a(abstractC0619j, stringWriter);
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: a */
    public String m5260a(Object obj) {
        return obj == null ? m5259a((AbstractC0619j) C0621l.f4277a) : m5261a(obj, obj.getClass());
    }

    /* JADX INFO: renamed from: a */
    public String m5261a(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        m5265a(obj, type, stringWriter);
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: a */
    public void m5262a(AbstractC0619j abstractC0619j, C0612c c0612c) {
        boolean zM5241g = c0612c.m5241g();
        c0612c.m5237b(true);
        boolean zM5242h = c0612c.m5242h();
        c0612c.m5239c(this.f4266i);
        boolean zM5243i = c0612c.m5243i();
        c0612c.m5240d(this.f4265h);
        try {
            try {
                C0605j.m5192a(abstractC0619j, c0612c);
            } catch (IOException e) {
                throw new C0620k(e);
            }
        } finally {
            c0612c.m5237b(zM5241g);
            c0612c.m5239c(zM5242h);
            c0612c.m5240d(zM5243i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m5263a(AbstractC0619j abstractC0619j, Appendable appendable) {
        try {
            m5262a(abstractC0619j, m5252a(C0605j.m5191a(appendable)));
        } catch (IOException e) {
            throw new C0620k(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m5264a(Object obj, Type type, C0612c c0612c) {
        AbstractC0629t abstractC0629tM5253a = m5253a((C0608a) C0608a.m5201a(type));
        boolean zM5241g = c0612c.m5241g();
        c0612c.m5237b(true);
        boolean zM5242h = c0612c.m5242h();
        c0612c.m5239c(this.f4266i);
        boolean zM5243i = c0612c.m5243i();
        c0612c.m5240d(this.f4265h);
        try {
            try {
                abstractC0629tM5253a.mo5039a(c0612c, obj);
            } catch (IOException e) {
                throw new C0620k(e);
            }
        } finally {
            c0612c.m5237b(zM5241g);
            c0612c.m5239c(zM5242h);
            c0612c.m5240d(zM5243i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m5265a(Object obj, Type type, Appendable appendable) {
        try {
            m5264a(obj, type, m5252a(C0605j.m5191a(appendable)));
        } catch (IOException e) {
            throw new C0620k(e);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f4265h + "factories:" + this.f4261d + ",instanceCreators:" + this.f4262e + "}";
    }
}
