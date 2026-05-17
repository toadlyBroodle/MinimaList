package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class bir implements biw<Map<bjp, bil>, Void> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bim f8231a;

    bir(bim bimVar) {
        this.f8231a = bimVar;
    }

    @Override // com.google.android.gms.internal.biw
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Void mo8856a(bfa bfaVar, Map<bjp, bil> map, Void r6) {
        Iterator<Map.Entry<bjp, bil>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            bil value = it.next().getValue();
            if (!value.f8220d) {
                this.f8231a.m9390b(value.m9384a());
            }
        }
        return null;
    }
}
