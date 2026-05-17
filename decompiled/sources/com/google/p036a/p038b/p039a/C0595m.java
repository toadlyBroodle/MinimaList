package com.google.p036a.p038b.p039a;

import com.google.p036a.AbstractC0629t;
import com.google.p036a.C0614e;
import com.google.p036a.p038b.p039a.C0591i;
import com.google.p036a.p041c.C0608a;
import com.google.p036a.p042d.C0610a;
import com.google.p036a.p042d.C0612c;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: renamed from: com.google.a.b.a.m */
/* JADX INFO: loaded from: classes.dex */
final class C0595m<T> extends AbstractC0629t<T> {

    /* JADX INFO: renamed from: a */
    private final C0614e f4058a;

    /* JADX INFO: renamed from: b */
    private final AbstractC0629t<T> f4059b;

    /* JADX INFO: renamed from: c */
    private final Type f4060c;

    C0595m(C0614e c0614e, AbstractC0629t<T> abstractC0629t, Type type) {
        this.f4058a = c0614e;
        this.f4059b = abstractC0629t;
        this.f4060c = type;
    }

    /* JADX INFO: renamed from: a */
    private Type m5101a(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // com.google.p036a.AbstractC0629t
    /* JADX INFO: renamed from: a */
    public void mo5039a(C0612c c0612c, T t) {
        AbstractC0629t<T> abstractC0629tM5253a = this.f4059b;
        Type typeM5101a = m5101a(this.f4060c, t);
        if (typeM5101a != this.f4060c) {
            abstractC0629tM5253a = this.f4058a.m5253a((C0608a) C0608a.m5201a(typeM5101a));
            if ((abstractC0629tM5253a instanceof C0591i.a) && !(this.f4059b instanceof C0591i.a)) {
                abstractC0629tM5253a = this.f4059b;
            }
        }
        abstractC0629tM5253a.mo5039a(c0612c, t);
    }

    @Override // com.google.p036a.AbstractC0629t
    /* JADX INFO: renamed from: b */
    public T mo5040b(C0610a c0610a) {
        return this.f4059b.mo5040b(c0610a);
    }
}
