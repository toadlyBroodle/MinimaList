package com.google.android.gms.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class bdk implements bdo {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f7862a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ long f7863b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ bdu f7864c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ bdw f7865d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ bdf f7866e;

    bdk(bdf bdfVar, String str, long j, bdu bduVar, bdw bdwVar) {
        this.f7866e = bdfVar;
        this.f7862a = str;
        this.f7863b = j;
        this.f7864c = bduVar;
        this.f7865d = bdwVar;
    }

    @Override // com.google.android.gms.internal.bdo
    /* JADX INFO: renamed from: a */
    public final void mo9024a(Map<String, Object> map) {
        if (this.f7866e.f7849u.m9541a()) {
            bkl bklVar = this.f7866e.f7849u;
            String str = this.f7862a;
            String strValueOf = String.valueOf(map);
            bklVar.m9540a(new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(strValueOf).length()).append(str).append(" response: ").append(strValueOf).toString(), null, new Object[0]);
        }
        if (((bdu) this.f7866e.f7842n.get(Long.valueOf(this.f7863b))) == this.f7864c) {
            this.f7866e.f7842n.remove(Long.valueOf(this.f7863b));
            if (this.f7865d != null) {
                String str2 = (String) map.get("s");
                if (str2.equals("ok")) {
                    this.f7865d.mo9046a(null, null);
                } else {
                    this.f7865d.mo9046a(str2, (String) map.get("d"));
                }
            }
        } else if (this.f7866e.f7849u.m9541a()) {
            this.f7866e.f7849u.m9540a(new StringBuilder(81).append("Ignoring on complete for put ").append(this.f7863b).append(" because it was removed already.").toString(), null, new Object[0]);
        }
        this.f7866e.m9015k();
    }
}
