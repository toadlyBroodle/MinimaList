package com.google.p036a;

import com.google.p036a.p038b.p039a.C0588f;
import com.google.p036a.p042d.C0610a;
import com.google.p036a.p042d.C0612c;
import com.google.p036a.p042d.EnumC0611b;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.a.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0629t<T> {
    /* JADX INFO: renamed from: a */
    public final AbstractC0619j m5298a(T t) {
        try {
            C0588f c0588f = new C0588f();
            mo5039a(c0588f, t);
            return c0588f.m5079a();
        } catch (IOException e) {
            throw new C0620k(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0629t<T> m5299a() {
        return new AbstractC0629t<T>() { // from class: com.google.a.t.1
            @Override // com.google.p036a.AbstractC0629t
            /* JADX INFO: renamed from: a */
            public void mo5039a(C0612c c0612c, T t) throws IOException {
                if (t == null) {
                    c0612c.mo5085f();
                } else {
                    AbstractC0629t.this.mo5039a(c0612c, t);
                }
            }

            @Override // com.google.p036a.AbstractC0629t
            /* JADX INFO: renamed from: b */
            public T mo5040b(C0610a c0610a) throws IOException {
                if (c0610a.mo5061f() != EnumC0611b.NULL) {
                    return (T) AbstractC0629t.this.mo5040b(c0610a);
                }
                c0610a.mo5065j();
                return null;
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo5039a(C0612c c0612c, T t);

    /* JADX INFO: renamed from: b */
    public abstract T mo5040b(C0610a c0610a);
}
