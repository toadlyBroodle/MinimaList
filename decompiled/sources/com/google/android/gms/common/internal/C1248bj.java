package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.afr;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.bj */
/* JADX INFO: loaded from: classes.dex */
public final class C1248bj {

    /* JADX INFO: renamed from: a */
    private final Account f5903a;

    /* JADX INFO: renamed from: b */
    private final Set<Scope> f5904b;

    /* JADX INFO: renamed from: c */
    private final Set<Scope> f5905c;

    /* JADX INFO: renamed from: d */
    private final Map<C1074a<?>, C1250bl> f5906d;

    /* JADX INFO: renamed from: e */
    private final int f5907e;

    /* JADX INFO: renamed from: f */
    private final View f5908f;

    /* JADX INFO: renamed from: g */
    private final String f5909g;

    /* JADX INFO: renamed from: h */
    private final String f5910h;

    /* JADX INFO: renamed from: i */
    private final afr f5911i;

    /* JADX INFO: renamed from: j */
    private Integer f5912j;

    public C1248bj(Account account, Set<Scope> set, Map<C1074a<?>, C1250bl> map, int i, View view, String str, String str2, afr afrVar) {
        this.f5903a = account;
        this.f5904b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f5906d = map == null ? Collections.EMPTY_MAP : map;
        this.f5908f = view;
        this.f5907e = i;
        this.f5909g = str;
        this.f5910h = str2;
        this.f5911i = afrVar;
        HashSet hashSet = new HashSet(this.f5904b);
        Iterator<C1250bl> it = this.f5906d.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().f5919a);
        }
        this.f5905c = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public final String m7146a() {
        if (this.f5903a != null) {
            return this.f5903a.name;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final Set<Scope> m7147a(C1074a<?> c1074a) {
        C1250bl c1250bl = this.f5906d.get(c1074a);
        if (c1250bl == null || c1250bl.f5919a.isEmpty()) {
            return this.f5904b;
        }
        HashSet hashSet = new HashSet(this.f5904b);
        hashSet.addAll(c1250bl.f5919a);
        return hashSet;
    }

    /* JADX INFO: renamed from: a */
    public final void m7148a(Integer num) {
        this.f5912j = num;
    }

    /* JADX INFO: renamed from: b */
    public final Account m7149b() {
        return this.f5903a;
    }

    /* JADX INFO: renamed from: c */
    public final Account m7150c() {
        return this.f5903a != null ? this.f5903a : new Account("<<default account>>", "com.google");
    }

    /* JADX INFO: renamed from: d */
    public final Set<Scope> m7151d() {
        return this.f5904b;
    }

    /* JADX INFO: renamed from: e */
    public final Set<Scope> m7152e() {
        return this.f5905c;
    }

    /* JADX INFO: renamed from: f */
    public final Map<C1074a<?>, C1250bl> m7153f() {
        return this.f5906d;
    }

    /* JADX INFO: renamed from: g */
    public final String m7154g() {
        return this.f5909g;
    }

    /* JADX INFO: renamed from: h */
    public final String m7155h() {
        return this.f5910h;
    }

    /* JADX INFO: renamed from: i */
    public final afr m7156i() {
        return this.f5911i;
    }

    /* JADX INFO: renamed from: j */
    public final Integer m7157j() {
        return this.f5912j;
    }
}
