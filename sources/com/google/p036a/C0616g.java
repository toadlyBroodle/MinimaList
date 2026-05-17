package com.google.p036a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.a.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0616g extends AbstractC0619j implements Iterable<AbstractC0619j> {

    /* JADX INFO: renamed from: a */
    private final List<AbstractC0619j> f4276a = new ArrayList();

    @Override // com.google.p036a.AbstractC0619j
    /* JADX INFO: renamed from: a */
    public Number mo5273a() {
        if (this.f4276a.size() == 1) {
            return this.f4276a.get(0).mo5273a();
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: a */
    public void m5274a(AbstractC0619j abstractC0619j) {
        if (abstractC0619j == null) {
            abstractC0619j = C0621l.f4277a;
        }
        this.f4276a.add(abstractC0619j);
    }

    @Override // com.google.p036a.AbstractC0619j
    /* JADX INFO: renamed from: b */
    public String mo5275b() {
        if (this.f4276a.size() == 1) {
            return this.f4276a.get(0).mo5275b();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.p036a.AbstractC0619j
    /* JADX INFO: renamed from: c */
    public double mo5276c() {
        if (this.f4276a.size() == 1) {
            return this.f4276a.get(0).mo5276c();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.p036a.AbstractC0619j
    /* JADX INFO: renamed from: d */
    public long mo5277d() {
        if (this.f4276a.size() == 1) {
            return this.f4276a.get(0).mo5277d();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.p036a.AbstractC0619j
    /* JADX INFO: renamed from: e */
    public int mo5278e() {
        if (this.f4276a.size() == 1) {
            return this.f4276a.get(0).mo5278e();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C0616g) && ((C0616g) obj).f4276a.equals(this.f4276a));
    }

    @Override // com.google.p036a.AbstractC0619j
    /* JADX INFO: renamed from: f */
    public boolean mo5279f() {
        if (this.f4276a.size() == 1) {
            return this.f4276a.get(0).mo5279f();
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return this.f4276a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractC0619j> iterator() {
        return this.f4276a.iterator();
    }
}
