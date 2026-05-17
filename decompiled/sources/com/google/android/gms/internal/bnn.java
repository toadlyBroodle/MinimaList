package com.google.android.gms.internal;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class bnn extends bnq {

    /* JADX INFO: renamed from: d */
    private final View f8481d;

    public bnn(arz arzVar, String str, String str2, C1937tl c1937tl, int i, int i2, View view) {
        super(arzVar, str, str2, c1937tl, i, 57);
        this.f8481d = view;
    }

    @Override // com.google.android.gms.internal.bnq
    /* JADX INFO: renamed from: a */
    protected final void mo8698a() {
        if (this.f8481d != null) {
            aur aurVar = new aur((String) this.f8493c.invoke(null, this.f8481d, this.f8491a.m8247a().getResources().getDisplayMetrics()));
            C1961ui c1961ui = new C1961ui();
            c1961ui.f11662a = aurVar.f7315a;
            c1961ui.f11663b = aurVar.f7316b;
            c1961ui.f11664c = aurVar.f7317c;
            this.f8492b.f11556M = c1961ui;
        }
    }
}
