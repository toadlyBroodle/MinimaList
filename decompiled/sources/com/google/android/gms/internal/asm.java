package com.google.android.gms.internal;

import com.google.android.gms.internal.awa;
import com.google.android.gms.internal.awc;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class asm {

    /* JADX INFO: renamed from: a */
    private awa f7206a;

    private asm(awa awaVar) {
        this.f7206a = awaVar;
    }

    /* JADX INFO: renamed from: a */
    static final asm m8275a(awa awaVar) throws GeneralSecurityException {
        if (awaVar == null || awaVar.m8565c() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new asm(awaVar);
    }

    /* JADX INFO: renamed from: a */
    final awa m8276a() {
        return this.f7206a;
    }

    public final String toString() {
        awa awaVar = this.f7206a;
        awc.C1411a c1411aM8579a = awc.m8573a().m8579a(awaVar.m8563a());
        for (awa.C1410b c1410b : awaVar.m8564b()) {
            c1411aM8579a.m8580a(awc.C1412b.m8581a().m8595a(c1410b.m8569b().m8518a()).m8593a(c1410b.m8570c()).m8594a(c1410b.m8572f()).m8592a(c1410b.m8571e()).m9912d());
        }
        return c1411aM8579a.m9912d().toString();
    }
}
