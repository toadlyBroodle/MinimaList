package com.google.android.gms.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class bdl implements bdo {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bdt f7867a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bdf f7868b;

    bdl(bdf bdfVar, bdt bdtVar) {
        this.f7868b = bdfVar;
        this.f7867a = bdtVar;
    }

    @Override // com.google.android.gms.internal.bdo
    /* JADX INFO: renamed from: a */
    public final void mo9024a(Map<String, Object> map) {
        String str = (String) map.get("s");
        if (str.equals("ok")) {
            if (((Map) map.get("d")).containsKey("w")) {
                this.f7868b.m8996a((List<String>) r1.get("w"), this.f7867a.f7885b);
            }
        }
        if (((bdt) this.f7868b.f7843o.get(this.f7867a.m9034a())) == this.f7867a) {
            if (str.equals("ok")) {
                this.f7867a.f7884a.mo9046a(null, null);
                return;
            }
            this.f7868b.m8984a(this.f7867a.m9034a());
            this.f7867a.f7884a.mo9046a(str, (String) map.get("d"));
        }
    }
}
