package com.google.android.gms.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class bdm implements bdo {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bdf f7869a;

    bdm(bdf bdfVar) {
        this.f7869a = bdfVar;
    }

    @Override // com.google.android.gms.internal.bdo
    /* JADX INFO: renamed from: a */
    public final void mo9024a(Map<String, Object> map) {
        String str = (String) map.get("s");
        if (str.equals("ok")) {
            return;
        }
        String str2 = (String) map.get("d");
        if (this.f7869a.f7849u.m9541a()) {
            this.f7869a.f7849u.m9540a(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length()).append("Failed to send stats: ").append(str).append(" (message: ").append(str2).append(")").toString(), null, new Object[0]);
        }
    }
}
