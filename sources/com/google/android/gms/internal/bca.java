package com.google.android.gms.internal;

import java.util.AbstractMap;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Stack;

/* JADX INFO: loaded from: classes.dex */
public final class bca<K, V> implements Iterator<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: a */
    private final Stack<bcj<K, V>> f7773a = new Stack<>();

    /* JADX INFO: renamed from: b */
    private final boolean f7774b;

    bca(bcf<K, V> bcfVar, K k, Comparator<K> comparator, boolean z) {
        this.f7774b = z;
        bcf<K, V> bcfVarMo8905h = bcfVar;
        while (!bcfVarMo8905h.mo8901d()) {
            int iCompare = k != null ? z ? comparator.compare(k, bcfVarMo8905h.mo8902e()) : comparator.compare(bcfVarMo8905h.mo8902e(), k) : 1;
            if (iCompare < 0) {
                bcfVarMo8905h = !z ? bcfVarMo8905h.mo8905h() : bcfVarMo8905h.mo8904g();
            } else if (iCompare == 0) {
                this.f7773a.push((bcj) bcfVarMo8905h);
                return;
            } else {
                this.f7773a.push((bcj) bcfVarMo8905h);
                if (z) {
                    bcfVarMo8905h = bcfVarMo8905h.mo8905h();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map.Entry<K, V> next() {
        try {
            bcj<K, V> bcjVarPop = this.f7773a.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(bcjVarPop.mo8902e(), bcjVarPop.mo8903f());
            if (this.f7774b) {
                for (bcf<K, V> bcfVarMo8904g = bcjVarPop.mo8904g(); !bcfVarMo8904g.mo8901d(); bcfVarMo8904g = bcfVarMo8904g.mo8905h()) {
                    this.f7773a.push((bcj) bcfVarMo8904g);
                }
            } else {
                for (bcf<K, V> bcfVarMo8905h = bcjVarPop.mo8905h(); !bcfVarMo8905h.mo8901d(); bcfVarMo8905h = bcfVarMo8905h.mo8904g()) {
                    this.f7773a.push((bcj) bcfVarMo8905h);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException e) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7773a.size() > 0;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
