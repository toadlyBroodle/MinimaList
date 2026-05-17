package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class akv implements Comparator<arh<?>> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ arm f6966a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ aii f6967b;

    akv(akt aktVar, arm armVar, aii aiiVar) {
        this.f6966a = armVar;
        this.f6967b = aiiVar;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(arh<?> arhVar, arh<?> arhVar2) {
        arh<?> arhVar3 = arhVar;
        arh<?> arhVar4 = arhVar2;
        if (arhVar3 == null) {
            return arhVar4 != null ? 1 : 0;
        }
        if (arhVar4 == null) {
            return arhVar3 != null ? -1 : 0;
        }
        arh<?> arhVarMo8076b = this.f6966a.mo8208b().mo8076b(this.f6967b, arhVar3, arhVar4);
        C1221aj.m7070a(arhVarMo8076b instanceof arl);
        return (int) ((arl) arhVarMo8076b).mo8208b().doubleValue();
    }
}
