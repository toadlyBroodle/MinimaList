package com.google.android.gms.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class bdi implements bdo {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bdw f7859a;

    bdi(bdf bdfVar, bdw bdwVar) {
        this.f7859a = bdwVar;
    }

    @Override // com.google.android.gms.internal.bdo
    /* JADX INFO: renamed from: a */
    public final void mo9024a(Map<String, Object> map) {
        String str = null;
        String str2 = (String) map.get("s");
        if (str2.equals("ok")) {
            str2 = null;
        } else {
            str = (String) map.get("d");
        }
        if (this.f7859a != null) {
            this.f7859a.mo9046a(str2, str);
        }
    }
}
