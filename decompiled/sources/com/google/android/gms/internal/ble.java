package com.google.android.gms.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public abstract class ble implements Comparator<blm> {
    /* JADX INFO: renamed from: a */
    public final int m9606a(blm blmVar, blm blmVar2, boolean z) {
        return z ? compare(blmVar2, blmVar) : compare(blmVar, blmVar2);
    }

    /* JADX INFO: renamed from: a */
    public abstract blm mo9607a();

    /* JADX INFO: renamed from: a */
    public abstract blm mo9608a(bkp bkpVar, bln blnVar);

    /* JADX INFO: renamed from: a */
    public abstract boolean mo9609a(bln blnVar);

    /* JADX INFO: renamed from: b */
    public abstract String mo9610b();
}
