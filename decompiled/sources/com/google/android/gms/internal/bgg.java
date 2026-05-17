package com.google.android.gms.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class bgg extends bku {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Map f8082a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bgi f8083b;

    bgg(Map map, bgi bgiVar) {
        this.f8082a = map;
        this.f8083b = bgiVar;
    }

    @Override // com.google.android.gms.internal.bku
    /* JADX INFO: renamed from: a */
    public final void mo8908a(bkp bkpVar, bln blnVar) {
        bln blnVarM9236a = bge.m9236a(blnVar, (Map<String, Object>) this.f8082a);
        if (blnVarM9236a != blnVar) {
            this.f8083b.m9241a(new bfa(bkpVar.m9554d()), blnVarM9236a);
        }
    }
}
