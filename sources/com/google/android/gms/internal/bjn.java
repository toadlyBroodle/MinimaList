package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bjn {

    /* JADX INFO: renamed from: a */
    private final bez f8270a;

    /* JADX INFO: renamed from: b */
    private final bkl f8271b;

    public bjn(bet betVar) {
        this.f8270a = betVar.m9125g();
        this.f8271b = betVar.m9117a("EventRaiser");
    }

    /* JADX INFO: renamed from: a */
    public final void m9462a(List<? extends bjj> list) {
        if (this.f8271b.m9541a()) {
            this.f8271b.m9540a(new StringBuilder(28).append("Raising ").append(list.size()).append(" event(s)").toString(), null, new Object[0]);
        }
        this.f8270a.mo8804a(new bjo(this, new ArrayList(list)));
    }
}
