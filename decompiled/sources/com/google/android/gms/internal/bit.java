package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bit<T> implements Iterable<Map.Entry<bfa, T>> {

    /* JADX INFO: renamed from: c */
    private static final bbw f8232c = bbx.m8879a(bcr.m8925a(bkp.class));

    /* JADX INFO: renamed from: d */
    private static final bit f8233d = new bit(null, f8232c);

    /* JADX INFO: renamed from: a */
    private final T f8234a;

    /* JADX INFO: renamed from: b */
    private final bbw<bkp, bit<T>> f8235b;

    public bit(T t) {
        this(t, f8232c);
    }

    private bit(T t, bbw<bkp, bit<T>> bbwVar) {
        this.f8234a = t;
        this.f8235b = bbwVar;
    }

    /* JADX INFO: renamed from: a */
    public static <V> bit<V> m9405a() {
        return f8233d;
    }

    /* JADX INFO: renamed from: a */
    private final <R> R m9406a(bfa bfaVar, biw<? super T, R> biwVar, R r) {
        for (Map.Entry<bkp, bit<T>> entry : this.f8235b) {
            r = (R) entry.getValue().m9406a(bfaVar.m9153a(entry.getKey()), biwVar, r);
        }
        return this.f8234a != null ? biwVar.mo8856a(bfaVar, this.f8234a, r) : r;
    }

    /* JADX INFO: renamed from: a */
    public final bfa m9407a(bfa bfaVar) {
        return m9408a(bfaVar, (bix) bix.f8238a);
    }

    /* JADX INFO: renamed from: a */
    public final bfa m9408a(bfa bfaVar, bix<? super T> bixVar) {
        bkp bkpVarM9158d;
        bit<T> bitVarMo8872b;
        bfa bfaVarM9408a;
        if (this.f8234a != null && bixVar.mo9333a(this.f8234a)) {
            return bfa.m9147a();
        }
        if (!bfaVar.m9162h() && (bitVarMo8872b = this.f8235b.mo8872b((bkpVarM9158d = bfaVar.m9158d()))) != null && (bfaVarM9408a = bitVarMo8872b.m9408a(bfaVar.m9159e(), (bix) bixVar)) != null) {
            return new bfa(bkpVarM9158d).m9152a(bfaVarM9408a);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final bit<T> m9409a(bfa bfaVar, bit<T> bitVar) {
        if (bfaVar.m9162h()) {
            return bitVar;
        }
        bkp bkpVarM9158d = bfaVar.m9158d();
        bit<T> bitVarMo8872b = this.f8235b.mo8872b(bkpVarM9158d);
        if (bitVarMo8872b == null) {
            bitVarMo8872b = f8233d;
        }
        bit<T> bitVarM9409a = bitVarMo8872b.m9409a(bfaVar.m9159e(), (bit) bitVar);
        return new bit<>(this.f8234a, bitVarM9409a.m9421d() ? this.f8235b.mo8874c(bkpVarM9158d) : this.f8235b.mo8867a(bkpVarM9158d, bitVarM9409a));
    }

    /* JADX INFO: renamed from: a */
    public final bit<T> m9410a(bfa bfaVar, T t) {
        if (bfaVar.m9162h()) {
            return new bit<>(t, this.f8235b);
        }
        bkp bkpVarM9158d = bfaVar.m9158d();
        bit<T> bitVarMo8872b = this.f8235b.mo8872b(bkpVarM9158d);
        if (bitVarMo8872b == null) {
            bitVarMo8872b = f8233d;
        }
        return new bit<>(this.f8234a, this.f8235b.mo8867a(bkpVarM9158d, bitVarMo8872b.m9410a(bfaVar.m9159e(), t)));
    }

    /* JADX INFO: renamed from: a */
    public final bit<T> m9411a(bkp bkpVar) {
        bit<T> bitVarMo8872b = this.f8235b.mo8872b(bkpVar);
        return bitVarMo8872b != null ? bitVarMo8872b : f8233d;
    }

    /* JADX INFO: renamed from: a */
    public final <R> R m9412a(R r, biw<? super T, R> biwVar) {
        return (R) m9406a(bfa.m9147a(), biwVar, r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m9413a(biw<T, Void> biwVar) {
        m9406a(bfa.m9147a(), biwVar, null);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9414a(bix<? super T> bixVar) {
        if (this.f8234a != null && bixVar.mo9333a(this.f8234a)) {
            return true;
        }
        Iterator<Map.Entry<bkp, bit<T>>> it = this.f8235b.iterator();
        while (it.hasNext()) {
            if (it.next().getValue().m9414a(bixVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final T m9415b() {
        return this.f8234a;
    }

    /* JADX INFO: renamed from: b */
    public final T m9416b(bfa bfaVar) {
        bix<Object> bixVar = bix.f8238a;
        T t = (this.f8234a == null || !bixVar.mo9333a(this.f8234a)) ? null : this.f8234a;
        Iterator<bkp> it = bfaVar.iterator();
        T t2 = t;
        while (it.hasNext()) {
            bit<T> bitVarMo8872b = this.f8235b.mo8872b(it.next());
            if (bitVarMo8872b == null) {
                break;
            }
            if (bitVarMo8872b.f8234a != null && bixVar.mo9333a(bitVarMo8872b.f8234a)) {
                t2 = bitVarMo8872b.f8234a;
            }
            this = bitVarMo8872b;
        }
        return t2;
    }

    /* JADX INFO: renamed from: b */
    public final T m9417b(bfa bfaVar, bix<? super T> bixVar) {
        if (this.f8234a != null && bixVar.mo9333a(this.f8234a)) {
            return this.f8234a;
        }
        Iterator<bkp> it = bfaVar.iterator();
        while (it.hasNext()) {
            bit<T> bitVarMo8872b = this.f8235b.mo8872b(it.next());
            if (bitVarMo8872b == null) {
                return null;
            }
            if (bitVarMo8872b.f8234a != null && bixVar.mo9333a(bitVarMo8872b.f8234a)) {
                return bitVarMo8872b.f8234a;
            }
            this = bitVarMo8872b;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final bbw<bkp, bit<T>> m9418c() {
        return this.f8235b;
    }

    /* JADX INFO: renamed from: c */
    public final bit<T> m9419c(bfa bfaVar) {
        while (!bfaVar.m9162h()) {
            bit<T> bitVarMo8872b = this.f8235b.mo8872b(bfaVar.m9158d());
            if (bitVarMo8872b == null) {
                return f8233d;
            }
            bfaVar = bfaVar.m9159e();
            this = bitVarMo8872b;
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final bit<T> m9420d(bfa bfaVar) {
        if (bfaVar.m9162h()) {
            return this.f8235b.mo8876d() ? f8233d : new bit<>(null, this.f8235b);
        }
        bkp bkpVarM9158d = bfaVar.m9158d();
        bit<T> bitVarMo8872b = this.f8235b.mo8872b(bkpVarM9158d);
        if (bitVarMo8872b == null) {
            return this;
        }
        bit<T> bitVarM9420d = bitVarMo8872b.m9420d(bfaVar.m9159e());
        bbw<bkp, bit<T>> bbwVarMo8874c = bitVarM9420d.m9421d() ? this.f8235b.mo8874c(bkpVarM9158d) : this.f8235b.mo8867a(bkpVarM9158d, bitVarM9420d);
        return (this.f8234a == null && bbwVarMo8874c.mo8876d()) ? f8233d : new bit<>(this.f8234a, bbwVarMo8874c);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9421d() {
        return this.f8234a == null && this.f8235b.mo8876d();
    }

    /* JADX INFO: renamed from: e */
    public final T m9422e(bfa bfaVar) {
        while (!bfaVar.m9162h()) {
            bit<T> bitVarMo8872b = this.f8235b.mo8872b(bfaVar.m9158d());
            if (bitVarMo8872b == null) {
                return null;
            }
            bfaVar = bfaVar.m9159e();
            this = bitVarMo8872b;
        }
        return this.f8234a;
    }

    /* JADX INFO: renamed from: e */
    public final Collection<T> m9423e() {
        ArrayList arrayList = new ArrayList();
        m9413a(new biu(this, arrayList));
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bit bitVar = (bit) obj;
        if (this.f8235b == null ? bitVar.f8235b != null : !this.f8235b.equals(bitVar.f8235b)) {
            return false;
        }
        if (this.f8234a != null) {
            if (this.f8234a.equals(bitVar.f8234a)) {
                return true;
            }
        } else if (bitVar.f8234a == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8234a != null ? this.f8234a.hashCode() : 0) * 31) + (this.f8235b != null ? this.f8235b.hashCode() : 0);
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<bfa, T>> iterator() {
        ArrayList arrayList = new ArrayList();
        m9413a(new biv(this, arrayList));
        return arrayList.iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ImmutableTree { value=");
        sb.append(this.f8234a);
        sb.append(", children={");
        for (Map.Entry<bkp, bit<T>> entry : this.f8235b) {
            sb.append(entry.getKey().m9554d());
            sb.append("=");
            sb.append(entry.getValue());
        }
        sb.append("} }");
        return sb.toString();
    }
}
