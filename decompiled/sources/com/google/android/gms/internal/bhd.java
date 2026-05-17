package com.google.android.gms.internal;

import com.google.firebase.database.C2226b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class bhd implements bdc, bhc {

    /* JADX INFO: renamed from: a */
    private final bjt f8153a;

    /* JADX INFO: renamed from: b */
    private final bhg f8154b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ bgo f8155c;

    public bhd(bgo bgoVar, bjt bjtVar) {
        this.f8155c = bgoVar;
        this.f8153a = bjtVar;
        this.f8154b = bgoVar.m9275b(bjtVar.m9488a());
    }

    @Override // com.google.android.gms.internal.bdc
    /* JADX INFO: renamed from: a */
    public final String mo8956a() {
        return this.f8153a.m9493b().mo9571d();
    }

    @Override // com.google.android.gms.internal.bhc
    /* JADX INFO: renamed from: a */
    public final List<? extends bjj> mo9302a(C2226b c2226b) {
        if (c2226b == null) {
            return this.f8154b != null ? this.f8155c.m9298a(this.f8154b) : this.f8155c.m9289a(this.f8153a.m9488a().m9482a());
        }
        bkl bklVar = this.f8155c.f8100h;
        String strValueOf = String.valueOf(this.f8153a.m9488a().m9482a());
        String string = c2226b.toString();
        bklVar.m9542b(new StringBuilder(String.valueOf(strValueOf).length() + 19 + String.valueOf(string).length()).append("Listen at ").append(strValueOf).append(" failed: ").append(string).toString(), null);
        return this.f8155c.m9299a(this.f8153a.m9488a(), c2226b);
    }

    @Override // com.google.android.gms.internal.bdc
    /* JADX INFO: renamed from: b */
    public final boolean mo8957b() {
        return bmz.m9684a(this.f8153a.m9493b()) > 1024;
    }

    @Override // com.google.android.gms.internal.bdc
    /* JADX INFO: renamed from: c */
    public final bcs mo8958c() {
        bkw bkwVarM9577a = bkw.m9577a(this.f8153a.m9493b());
        List<bfa> listM9580a = bkwVarM9577a.m9580a();
        ArrayList arrayList = new ArrayList(listM9580a.size());
        Iterator<bfa> it = listM9580a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m9157c());
        }
        return new bcs(arrayList, bkwVarM9577a.m9581b());
    }
}
