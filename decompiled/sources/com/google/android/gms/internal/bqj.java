package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class bqj<E> extends bnz<E> {

    /* JADX INFO: renamed from: a */
    private static final bqj<Object> f8657a;

    /* JADX INFO: renamed from: b */
    private final List<E> f8658b;

    static {
        bqj<Object> bqjVar = new bqj<>();
        f8657a = bqjVar;
        bqjVar.mo9753b();
    }

    bqj() {
        this(new ArrayList(10));
    }

    private bqj(List<E> list) {
        this.f8658b = list;
    }

    /* JADX INFO: renamed from: d */
    public static <E> bqj<E> m9976d() {
        return (bqj<E>) f8657a;
    }

    @Override // com.google.android.gms.internal.bpe
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bpe mo9934a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f8658b);
        return new bqj(arrayList);
    }

    @Override // com.google.android.gms.internal.bnz, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        m9754c();
        this.f8658b.add(i, e);
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        return this.f8658b.get(i);
    }

    @Override // com.google.android.gms.internal.bnz, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        m9754c();
        E eRemove = this.f8658b.remove(i);
        this.modCount++;
        return eRemove;
    }

    @Override // com.google.android.gms.internal.bnz, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        m9754c();
        E e2 = this.f8658b.set(i, e);
        this.modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8658b.size();
    }
}
