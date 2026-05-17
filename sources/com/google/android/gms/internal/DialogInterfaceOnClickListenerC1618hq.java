package com.google.android.gms.internal;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.google.android.gms.internal.hq */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1618hq implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ int f10746a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ int f10747b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ int f10748c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ C1617hp f10749d;

    DialogInterfaceOnClickListenerC1618hq(C1617hp c1617hp, int i, int i2, int i3) {
        this.f10749d = c1617hp;
        this.f10746a = i;
        this.f10747b = i2;
        this.f10748c = i3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == this.f10746a) {
            this.f10749d.m11492b();
            return;
        }
        if (i == this.f10747b) {
            if (((Boolean) bxm.m10409f().m10546a(can.f9584cy)).booleanValue()) {
                this.f10749d.m11494c();
                return;
            }
        }
        if (i == this.f10748c) {
            if (((Boolean) bxm.m10409f().m10546a(can.f9585cz)).booleanValue()) {
                this.f10749d.m11497d();
            }
        }
    }
}
