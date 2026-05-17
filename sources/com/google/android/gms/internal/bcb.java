package com.google.android.gms.internal;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bcb<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a */
    private final bbw<T, Void> f7775a;

    private bcb(bbw<T, Void> bbwVar) {
        this.f7775a = bbwVar;
    }

    public bcb(List<T> list, Comparator<T> comparator) {
        this.f7775a = bbx.m8880a(list, Collections.emptyMap(), bbx.m8882a(), comparator);
    }

    /* JADX INFO: renamed from: a */
    public final bcb<T> m8885a(T t) {
        bbw<T, Void> bbwVarMo8874c = this.f7775a.mo8874c(t);
        return bbwVarMo8874c == this.f7775a ? this : new bcb<>(bbwVarMo8874c);
    }

    /* JADX INFO: renamed from: a */
    public final T m8886a() {
        return this.f7775a.mo8868a();
    }

    /* JADX INFO: renamed from: b */
    public final bcb<T> m8887b(T t) {
        return new bcb<>(this.f7775a.mo8867a(t, null));
    }

    /* JADX INFO: renamed from: b */
    public final T m8888b() {
        return this.f7775a.mo8871b();
    }

    /* JADX INFO: renamed from: c */
    public final T m8889c(T t) {
        return this.f7775a.mo8875d(t);
    }

    /* JADX INFO: renamed from: c */
    public final Iterator<T> m8890c() {
        return new bcc(this.f7775a.mo8877e());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bcb) {
            return this.f7775a.equals(((bcb) obj).f7775a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7775a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return new bcc(this.f7775a.iterator());
    }
}
