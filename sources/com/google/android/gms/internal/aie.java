package com.google.android.gms.internal;

import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class aie implements ano {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ aic f6836a;

    private aie(aic aicVar) {
        this.f6836a = aicVar;
    }

    /* synthetic */ aie(aic aicVar, aid aidVar) {
        this(aicVar);
    }

    @Override // com.google.android.gms.internal.ano
    /* JADX INFO: renamed from: a */
    public final Object mo7998a(String str, Map<String, Object> map) {
        try {
            this.f6836a.f6826e.mo12819a(str, map);
            return null;
        } catch (RemoteException e) {
            String strValueOf = String.valueOf(e.getMessage());
            ahs.m7942a(strValueOf.length() != 0 ? "Error calling customEvaluator proxy:".concat(strValueOf) : new String("Error calling customEvaluator proxy:"));
            return null;
        }
    }
}
