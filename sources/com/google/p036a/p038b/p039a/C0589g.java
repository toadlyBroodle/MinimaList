package com.google.p036a.p038b.p039a;

import com.google.p036a.AbstractC0619j;
import com.google.p036a.AbstractC0629t;
import com.google.p036a.C0614e;
import com.google.p036a.C0624o;
import com.google.p036a.C0627r;
import com.google.p036a.InterfaceC0630u;
import com.google.p036a.p038b.AbstractC0600e;
import com.google.p036a.p038b.C0597b;
import com.google.p036a.p038b.C0598c;
import com.google.p036a.p038b.C0605j;
import com.google.p036a.p038b.InterfaceC0603h;
import com.google.p036a.p041c.C0608a;
import com.google.p036a.p042d.C0610a;
import com.google.p036a.p042d.C0612c;
import com.google.p036a.p042d.EnumC0611b;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: com.google.a.b.a.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0589g implements InterfaceC0630u {

    /* JADX INFO: renamed from: a */
    final boolean f4021a;

    /* JADX INFO: renamed from: b */
    private final C0598c f4022b;

    /* JADX INFO: renamed from: com.google.a.b.a.g$a */
    private final class a<K, V> extends AbstractC0629t<Map<K, V>> {

        /* JADX INFO: renamed from: b */
        private final AbstractC0629t<K> f4024b;

        /* JADX INFO: renamed from: c */
        private final AbstractC0629t<V> f4025c;

        /* JADX INFO: renamed from: d */
        private final InterfaceC0603h<? extends Map<K, V>> f4026d;

        public a(C0614e c0614e, Type type, AbstractC0629t<K> abstractC0629t, Type type2, AbstractC0629t<V> abstractC0629t2, InterfaceC0603h<? extends Map<K, V>> interfaceC0603h) {
            this.f4024b = new C0595m(c0614e, abstractC0629t, type);
            this.f4025c = new C0595m(c0614e, abstractC0629t2, type2);
            this.f4026d = interfaceC0603h;
        }

        /* JADX INFO: renamed from: a */
        private String m5087a(AbstractC0619j abstractC0619j) {
            if (!abstractC0619j.m5283i()) {
                if (abstractC0619j.m5284j()) {
                    return "null";
                }
                throw new AssertionError();
            }
            C0624o c0624oM5287m = abstractC0619j.m5287m();
            if (c0624oM5287m.m5295p()) {
                return String.valueOf(c0624oM5287m.mo5273a());
            }
            if (c0624oM5287m.m5294o()) {
                return Boolean.toString(c0624oM5287m.mo5279f());
            }
            if (c0624oM5287m.m5296q()) {
                return c0624oM5287m.mo5275b();
            }
            throw new AssertionError();
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<K, V> mo5040b(C0610a c0610a) throws IOException {
            EnumC0611b enumC0611bMo5061f = c0610a.mo5061f();
            if (enumC0611bMo5061f == EnumC0611b.NULL) {
                c0610a.mo5065j();
                return null;
            }
            Map<K, V> mapMo5161a = this.f4026d.mo5161a();
            if (enumC0611bMo5061f != EnumC0611b.BEGIN_ARRAY) {
                c0610a.mo5058c();
                while (c0610a.mo5060e()) {
                    AbstractC0600e.f4174a.mo5172a(c0610a);
                    K kMo5040b = this.f4024b.mo5040b(c0610a);
                    if (mapMo5161a.put(kMo5040b, this.f4025c.mo5040b(c0610a)) != null) {
                        throw new C0627r("duplicate key: " + kMo5040b);
                    }
                }
                c0610a.mo5059d();
                return mapMo5161a;
            }
            c0610a.mo5056a();
            while (c0610a.mo5060e()) {
                c0610a.mo5056a();
                K kMo5040b2 = this.f4024b.mo5040b(c0610a);
                if (mapMo5161a.put(kMo5040b2, this.f4025c.mo5040b(c0610a)) != null) {
                    throw new C0627r("duplicate key: " + kMo5040b2);
                }
                c0610a.mo5057b();
            }
            c0610a.mo5057b();
            return mapMo5161a;
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, Map<K, V> map) throws IOException {
            int i = 0;
            if (map == null) {
                c0612c.mo5085f();
                return;
            }
            if (!C0589g.this.f4021a) {
                c0612c.mo5083d();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    c0612c.mo5077a(String.valueOf(entry.getKey()));
                    this.f4025c.mo5039a(c0612c, entry.getValue());
                }
                c0612c.mo5084e();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            boolean z = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                AbstractC0619j abstractC0619jM5298a = this.f4024b.m5298a(entry2.getKey());
                arrayList.add(abstractC0619jM5298a);
                arrayList2.add(entry2.getValue());
                z = (abstractC0619jM5298a.m5281g() || abstractC0619jM5298a.m5282h()) | z;
            }
            if (!z) {
                c0612c.mo5083d();
                while (i < arrayList.size()) {
                    c0612c.mo5077a(m5087a((AbstractC0619j) arrayList.get(i)));
                    this.f4025c.mo5039a(c0612c, (V) arrayList2.get(i));
                    i++;
                }
                c0612c.mo5084e();
                return;
            }
            c0612c.mo5080b();
            while (i < arrayList.size()) {
                c0612c.mo5080b();
                C0605j.m5192a((AbstractC0619j) arrayList.get(i), c0612c);
                this.f4025c.mo5039a(c0612c, (V) arrayList2.get(i));
                c0612c.mo5082c();
                i++;
            }
            c0612c.mo5082c();
        }
    }

    public C0589g(C0598c c0598c, boolean z) {
        this.f4022b = c0598c;
        this.f4021a = z;
    }

    /* JADX INFO: renamed from: a */
    private AbstractC0629t<?> m5086a(C0614e c0614e, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? C0596n.f4092f : c0614e.m5253a((C0608a) C0608a.m5201a(type));
    }

    @Override // com.google.p036a.InterfaceC0630u
    /* JADX INFO: renamed from: a */
    public <T> AbstractC0629t<T> mo5041a(C0614e c0614e, C0608a<T> c0608a) {
        Type typeM5205b = c0608a.m5205b();
        if (!Map.class.isAssignableFrom(c0608a.m5204a())) {
            return null;
        }
        Type[] typeArrM5150b = C0597b.m5150b(typeM5205b, C0597b.m5153e(typeM5205b));
        return new a(c0614e, typeArrM5150b[0], m5086a(c0614e, typeArrM5150b[0]), typeArrM5150b[1], c0614e.m5253a((C0608a) C0608a.m5201a(typeArrM5150b[1])), this.f4022b.m5160a(c0608a));
    }
}
