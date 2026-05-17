package com.google.android.gms.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public abstract class bcj<K, V> implements bcf<K, V> {

    /* JADX INFO: renamed from: a */
    private final K f7782a;

    /* JADX INFO: renamed from: b */
    private final V f7783b;

    /* JADX INFO: renamed from: c */
    private bcf<K, V> f7784c;

    /* JADX INFO: renamed from: d */
    private final bcf<K, V> f7785d;

    bcj(K k, V v, bcf<K, V> bcfVar, bcf<K, V> bcfVar2) {
        this.f7782a = k;
        this.f7783b = v;
        this.f7784c = bcfVar == null ? bce.m8896a() : bcfVar;
        this.f7785d = bcfVar2 == null ? bce.m8896a() : bcfVar2;
    }

    /* JADX INFO: renamed from: b */
    private static int m8909b(bcf bcfVar) {
        return bcfVar.mo8894b() ? bcg.f7780b : bcg.f7779a;
    }

    /* JADX WARN: Incorrect types in method signature: (TK;TV;Ljava/lang/Integer;Lcom/google/android/gms/internal/bcf<TK;TV;>;Lcom/google/android/gms/internal/bcf<TK;TV;>;)Lcom/google/android/gms/internal/bcj<TK;TV;>; */
    /* JADX INFO: renamed from: b */
    private final bcj m8910b(Object obj, Object obj2, int i, bcf bcfVar, bcf bcfVar2) {
        K k = this.f7782a;
        V v = this.f7783b;
        if (bcfVar == null) {
            bcfVar = this.f7784c;
        }
        if (bcfVar2 == null) {
            bcfVar2 = this.f7785d;
        }
        return i == bcg.f7779a ? new bci(k, v, bcfVar, bcfVar2) : new bcd(k, v, bcfVar, bcfVar2);
    }

    /* JADX INFO: renamed from: k */
    private final bcf<K, V> m8911k() {
        if (this.f7784c.mo8901d()) {
            return bce.m8896a();
        }
        if (!this.f7784c.mo8894b() && !this.f7784c.mo8904g().mo8894b()) {
            this = m8912l();
        }
        return this.mo8892a(null, null, ((bcj) this.f7784c).m8911k(), null).m8913m();
    }

    /* JADX INFO: renamed from: l */
    private final bcj<K, V> m8912l() {
        bcj<K, V> bcjVarM8916p = m8916p();
        return bcjVarM8916p.f7785d.mo8904g().mo8894b() ? bcjVarM8916p.mo8892a(null, null, null, ((bcj) bcjVarM8916p.f7785d).m8915o()).m8914n().m8916p() : bcjVarM8916p;
    }

    /* JADX INFO: renamed from: m */
    private final bcj<K, V> m8913m() {
        if (this.f7785d.mo8894b() && !this.f7784c.mo8894b()) {
            this = m8914n();
        }
        if (this.f7784c.mo8894b() && ((bcj) this.f7784c).f7784c.mo8894b()) {
            this = this.m8915o();
        }
        return (this.f7784c.mo8894b() && this.f7785d.mo8894b()) ? this.m8916p() : this;
    }

    /* JADX INFO: renamed from: n */
    private final bcj<K, V> m8914n() {
        return (bcj) this.f7785d.mo8897a(null, null, mo8891a(), m8910b(null, null, bcg.f7779a, null, ((bcj) this.f7785d).f7784c), null);
    }

    /* JADX INFO: renamed from: o */
    private final bcj<K, V> m8915o() {
        return (bcj) this.f7784c.mo8897a(null, null, mo8891a(), null, m8910b(null, null, bcg.f7779a, ((bcj) this.f7784c).f7785d, null));
    }

    /* JADX INFO: renamed from: p */
    private final bcj<K, V> m8916p() {
        return m8910b(null, null, m8909b(this), this.f7784c.mo8897a(null, null, m8909b(this.f7784c), null, null), this.f7785d.mo8897a(null, null, m8909b(this.f7785d), null, null));
    }

    /* JADX INFO: renamed from: a */
    protected abstract int mo8891a();

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bcf mo8897a(Object obj, Object obj2, int i, bcf bcfVar, bcf bcfVar2) {
        return m8910b(null, null, i, bcfVar, bcfVar2);
    }

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: a */
    public final bcf<K, V> mo8898a(K k, V v, Comparator<K> comparator) {
        int iCompare = comparator.compare(k, this.f7782a);
        return (iCompare < 0 ? mo8892a(null, null, this.f7784c.mo8898a(k, v, comparator), null) : iCompare == 0 ? mo8892a(k, v, null, null) : mo8892a(null, null, null, this.f7785d.mo8898a(k, v, comparator))).m8913m();
    }

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: a */
    public final bcf<K, V> mo8899a(K k, Comparator<K> comparator) {
        bcj<K, V> bcjVarMo8892a;
        if (comparator.compare(k, this.f7782a) < 0) {
            if (!this.f7784c.mo8901d() && !this.f7784c.mo8894b() && !((bcj) this.f7784c).f7784c.mo8894b()) {
                this = m8912l();
            }
            bcjVarMo8892a = this.mo8892a(null, null, this.f7784c.mo8899a(k, comparator), null);
        } else {
            if (this.f7784c.mo8894b()) {
                this = m8915o();
            }
            if (!this.f7785d.mo8901d() && !this.f7785d.mo8894b() && !((bcj) this.f7785d).f7784c.mo8894b()) {
                bcj<K, V> bcjVarM8916p = this.m8916p();
                if (bcjVarM8916p.f7784c.mo8904g().mo8894b()) {
                    bcjVarM8916p = bcjVarM8916p.m8915o().m8916p();
                }
                this = bcjVarM8916p;
            }
            if (comparator.compare(k, this.f7782a) == 0) {
                if (this.f7785d.mo8901d()) {
                    return bce.m8896a();
                }
                bcf<K, V> bcfVarMo8906i = this.f7785d.mo8906i();
                this = this.mo8892a(bcfVarMo8906i.mo8902e(), bcfVarMo8906i.mo8903f(), null, ((bcj) this.f7785d).m8911k());
            }
            bcjVarMo8892a = this.mo8892a(null, null, null, this.f7785d.mo8899a(k, comparator));
        }
        return bcjVarMo8892a.m8913m();
    }

    /* JADX INFO: renamed from: a */
    protected abstract bcj<K, V> mo8892a(K k, V v, bcf<K, V> bcfVar, bcf<K, V> bcfVar2);

    /* JADX INFO: renamed from: a */
    void mo8893a(bcf<K, V> bcfVar) {
        this.f7784c = bcfVar;
    }

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: a */
    public final void mo8900a(bch<K, V> bchVar) {
        this.f7784c.mo8900a(bchVar);
        bchVar.mo8908a(this.f7782a, this.f7783b);
        this.f7785d.mo8900a(bchVar);
    }

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: d */
    public final boolean mo8901d() {
        return false;
    }

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: e */
    public final K mo8902e() {
        return this.f7782a;
    }

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: f */
    public final V mo8903f() {
        return this.f7783b;
    }

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: g */
    public final bcf<K, V> mo8904g() {
        return this.f7784c;
    }

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: h */
    public final bcf<K, V> mo8905h() {
        return this.f7785d;
    }

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: i */
    public final bcf<K, V> mo8906i() {
        return this.f7784c.mo8901d() ? this : this.f7784c.mo8906i();
    }

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: j */
    public final bcf<K, V> mo8907j() {
        return this.f7785d.mo8901d() ? this : this.f7785d.mo8907j();
    }
}
