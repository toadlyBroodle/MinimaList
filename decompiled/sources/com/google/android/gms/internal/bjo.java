package com.google.android.gms.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class bjo implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ArrayList f8272a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bjn f8273b;

    bjo(bjn bjnVar, ArrayList arrayList) {
        this.f8273b = bjnVar;
        this.f8272a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f8272a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            bjj bjjVar = (bjj) arrayList.get(i);
            if (this.f8273b.f8271b.m9541a()) {
                bkl bklVar = this.f8273b.f8271b;
                String strValueOf = String.valueOf(bjjVar.toString());
                bklVar.m9540a(strValueOf.length() != 0 ? "Raising ".concat(strValueOf) : new String("Raising "), null, new Object[0]);
            }
            bjjVar.mo9442a();
            i = i2;
        }
    }
}
