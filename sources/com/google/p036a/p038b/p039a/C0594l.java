package com.google.p036a.p038b.p039a;

import com.google.p036a.AbstractC0619j;
import com.google.p036a.AbstractC0629t;
import com.google.p036a.C0614e;
import com.google.p036a.InterfaceC0617h;
import com.google.p036a.InterfaceC0618i;
import com.google.p036a.InterfaceC0625p;
import com.google.p036a.InterfaceC0626q;
import com.google.p036a.InterfaceC0630u;
import com.google.p036a.p038b.C0605j;
import com.google.p036a.p041c.C0608a;
import com.google.p036a.p042d.C0610a;
import com.google.p036a.p042d.C0612c;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.a.b.a.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0594l<T> extends AbstractC0629t<T> {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0626q<T> f4050a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0618i<T> f4051b;

    /* JADX INFO: renamed from: c */
    private final C0614e f4052c;

    /* JADX INFO: renamed from: d */
    private final C0608a<T> f4053d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC0630u f4054e;

    /* JADX INFO: renamed from: f */
    private final C0594l<T>.a f4055f = new a();

    /* JADX INFO: renamed from: g */
    private AbstractC0629t<T> f4056g;

    /* JADX INFO: renamed from: com.google.a.b.a.l$a */
    private final class a implements InterfaceC0617h, InterfaceC0625p {
        private a() {
        }
    }

    public C0594l(InterfaceC0626q<T> interfaceC0626q, InterfaceC0618i<T> interfaceC0618i, C0614e c0614e, C0608a<T> c0608a, InterfaceC0630u interfaceC0630u) {
        this.f4050a = interfaceC0626q;
        this.f4051b = interfaceC0618i;
        this.f4052c = c0614e;
        this.f4053d = c0608a;
        this.f4054e = interfaceC0630u;
    }

    /* JADX INFO: renamed from: b */
    private AbstractC0629t<T> m5100b() {
        AbstractC0629t<T> abstractC0629t = this.f4056g;
        if (abstractC0629t != null) {
            return abstractC0629t;
        }
        AbstractC0629t<T> abstractC0629tM5254a = this.f4052c.m5254a(this.f4054e, this.f4053d);
        this.f4056g = abstractC0629tM5254a;
        return abstractC0629tM5254a;
    }

    @Override // com.google.p036a.AbstractC0629t
    /* JADX INFO: renamed from: a */
    public void mo5039a(C0612c c0612c, T t) throws IOException {
        if (this.f4050a == null) {
            m5100b().mo5039a(c0612c, t);
        } else if (t == null) {
            c0612c.mo5085f();
        } else {
            C0605j.m5192a(this.f4050a.m5297a(t, this.f4053d.m5205b(), this.f4055f), c0612c);
        }
    }

    @Override // com.google.p036a.AbstractC0629t
    /* JADX INFO: renamed from: b */
    public T mo5040b(C0610a c0610a) {
        if (this.f4051b == null) {
            return m5100b().mo5040b(c0610a);
        }
        AbstractC0619j abstractC0619jM5190a = C0605j.m5190a(c0610a);
        if (abstractC0619jM5190a.m5284j()) {
            return null;
        }
        return this.f4051b.m5280a(abstractC0619jM5190a, this.f4053d.m5205b(), this.f4055f);
    }
}
