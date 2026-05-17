package com.google.p036a.p038b.p039a;

import com.google.p036a.AbstractC0629t;
import com.google.p036a.C0614e;
import com.google.p036a.InterfaceC0630u;
import com.google.p036a.p038b.C0602g;
import com.google.p036a.p041c.C0608a;
import com.google.p036a.p042d.C0610a;
import com.google.p036a.p042d.C0612c;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.a.b.a.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0590h extends AbstractC0629t<Object> {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0630u f4027a = new InterfaceC0630u() { // from class: com.google.a.b.a.h.1
        @Override // com.google.p036a.InterfaceC0630u
        /* JADX INFO: renamed from: a */
        public <T> AbstractC0629t<T> mo5041a(C0614e c0614e, C0608a<T> c0608a) {
            if (c0608a.m5204a() == Object.class) {
                return new C0590h(c0614e);
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: b */
    private final C0614e f4028b;

    C0590h(C0614e c0614e) {
        this.f4028b = c0614e;
    }

    @Override // com.google.p036a.AbstractC0629t
    /* JADX INFO: renamed from: a */
    public void mo5039a(C0612c c0612c, Object obj) throws IOException {
        if (obj == null) {
            c0612c.mo5085f();
            return;
        }
        AbstractC0629t abstractC0629tM5255a = this.f4028b.m5255a((Class) obj.getClass());
        if (!(abstractC0629tM5255a instanceof C0590h)) {
            abstractC0629tM5255a.mo5039a(c0612c, obj);
        } else {
            c0612c.mo5083d();
            c0612c.mo5084e();
        }
    }

    @Override // com.google.p036a.AbstractC0629t
    /* JADX INFO: renamed from: b */
    public Object mo5040b(C0610a c0610a) throws IOException {
        switch (c0610a.mo5061f()) {
            case BEGIN_ARRAY:
                ArrayList arrayList = new ArrayList();
                c0610a.mo5056a();
                while (c0610a.mo5060e()) {
                    arrayList.add(mo5040b(c0610a));
                }
                c0610a.mo5057b();
                return arrayList;
            case BEGIN_OBJECT:
                C0602g c0602g = new C0602g();
                c0610a.mo5058c();
                while (c0610a.mo5060e()) {
                    c0602g.put(c0610a.mo5062g(), mo5040b(c0610a));
                }
                c0610a.mo5059d();
                return c0602g;
            case STRING:
                return c0610a.mo5063h();
            case NUMBER:
                return Double.valueOf(c0610a.mo5066k());
            case BOOLEAN:
                return Boolean.valueOf(c0610a.mo5064i());
            case NULL:
                c0610a.mo5065j();
                return null;
            default:
                throw new IllegalStateException();
        }
    }
}
