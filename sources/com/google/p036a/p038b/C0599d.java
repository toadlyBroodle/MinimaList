package com.google.p036a.p038b;

import com.google.p036a.AbstractC0629t;
import com.google.p036a.C0580b;
import com.google.p036a.C0614e;
import com.google.p036a.InterfaceC0574a;
import com.google.p036a.InterfaceC0630u;
import com.google.p036a.p037a.InterfaceC0575a;
import com.google.p036a.p037a.InterfaceC0578d;
import com.google.p036a.p037a.InterfaceC0579e;
import com.google.p036a.p041c.C0608a;
import com.google.p036a.p042d.C0610a;
import com.google.p036a.p042d.C0612c;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.a.b.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0599d implements InterfaceC0630u, Cloneable {

    /* JADX INFO: renamed from: a */
    public static final C0599d f4161a = new C0599d();

    /* JADX INFO: renamed from: e */
    private boolean f4165e;

    /* JADX INFO: renamed from: b */
    private double f4162b = -1.0d;

    /* JADX INFO: renamed from: c */
    private int f4163c = 136;

    /* JADX INFO: renamed from: d */
    private boolean f4164d = true;

    /* JADX INFO: renamed from: f */
    private List<InterfaceC0574a> f4166f = Collections.emptyList();

    /* JADX INFO: renamed from: g */
    private List<InterfaceC0574a> f4167g = Collections.emptyList();

    /* JADX INFO: renamed from: a */
    private boolean m5162a(InterfaceC0578d interfaceC0578d) {
        return interfaceC0578d == null || interfaceC0578d.m5035a() <= this.f4162b;
    }

    /* JADX INFO: renamed from: a */
    private boolean m5163a(InterfaceC0578d interfaceC0578d, InterfaceC0579e interfaceC0579e) {
        return m5162a(interfaceC0578d) && m5164a(interfaceC0579e);
    }

    /* JADX INFO: renamed from: a */
    private boolean m5164a(InterfaceC0579e interfaceC0579e) {
        return interfaceC0579e == null || interfaceC0579e.m5036a() > this.f4162b;
    }

    /* JADX INFO: renamed from: a */
    private boolean m5165a(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* JADX INFO: renamed from: b */
    private boolean m5166b(Class<?> cls) {
        return cls.isMemberClass() && !m5167c(cls);
    }

    /* JADX INFO: renamed from: c */
    private boolean m5167c(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0599d clone() {
        try {
            return (C0599d) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.google.p036a.InterfaceC0630u
    /* JADX INFO: renamed from: a */
    public <T> AbstractC0629t<T> mo5041a(final C0614e c0614e, final C0608a<T> c0608a) {
        Class<? super T> clsM5204a = c0608a.m5204a();
        final boolean zM5169a = m5169a((Class<?>) clsM5204a, true);
        final boolean zM5169a2 = m5169a((Class<?>) clsM5204a, false);
        if (zM5169a || zM5169a2) {
            return new AbstractC0629t<T>() { // from class: com.google.a.b.d.1

                /* JADX INFO: renamed from: f */
                private AbstractC0629t<T> f4173f;

                /* JADX INFO: renamed from: b */
                private AbstractC0629t<T> m5171b() {
                    AbstractC0629t<T> abstractC0629t = this.f4173f;
                    if (abstractC0629t != null) {
                        return abstractC0629t;
                    }
                    AbstractC0629t<T> abstractC0629tM5254a = c0614e.m5254a(C0599d.this, c0608a);
                    this.f4173f = abstractC0629tM5254a;
                    return abstractC0629tM5254a;
                }

                @Override // com.google.p036a.AbstractC0629t
                /* JADX INFO: renamed from: a */
                public void mo5039a(C0612c c0612c, T t) throws IOException {
                    if (zM5169a) {
                        c0612c.mo5085f();
                    } else {
                        m5171b().mo5039a(c0612c, t);
                    }
                }

                @Override // com.google.p036a.AbstractC0629t
                /* JADX INFO: renamed from: b */
                public T mo5040b(C0610a c0610a) throws IOException {
                    if (!zM5169a2) {
                        return m5171b().mo5040b(c0610a);
                    }
                    c0610a.mo5069n();
                    return null;
                }
            };
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m5169a(Class<?> cls, boolean z) {
        if (this.f4162b != -1.0d && !m5163a((InterfaceC0578d) cls.getAnnotation(InterfaceC0578d.class), (InterfaceC0579e) cls.getAnnotation(InterfaceC0579e.class))) {
            return true;
        }
        if ((this.f4164d || !m5166b(cls)) && !m5165a(cls)) {
            Iterator<InterfaceC0574a> it = (z ? this.f4166f : this.f4167g).iterator();
            while (it.hasNext()) {
                if (it.next().m5028a(cls)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m5170a(Field field, boolean z) {
        InterfaceC0575a interfaceC0575a;
        if ((this.f4163c & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f4162b == -1.0d || m5163a((InterfaceC0578d) field.getAnnotation(InterfaceC0578d.class), (InterfaceC0579e) field.getAnnotation(InterfaceC0579e.class))) && !field.isSynthetic()) {
            if (this.f4165e && ((interfaceC0575a = (InterfaceC0575a) field.getAnnotation(InterfaceC0575a.class)) == null || (!z ? interfaceC0575a.m5030b() : interfaceC0575a.m5029a()))) {
                return true;
            }
            if ((this.f4164d || !m5166b(field.getType())) && !m5165a(field.getType())) {
                List<InterfaceC0574a> list = z ? this.f4166f : this.f4167g;
                if (!list.isEmpty()) {
                    C0580b c0580b = new C0580b(field);
                    Iterator<InterfaceC0574a> it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next().m5027a(c0580b)) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }
        return true;
    }
}
