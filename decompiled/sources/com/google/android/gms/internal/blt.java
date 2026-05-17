package com.google.android.gms.internal;

import com.google.firebase.database.C2227c;

/* JADX INFO: loaded from: classes.dex */
public final class blt {
    /* JADX INFO: renamed from: a */
    public static bln m9630a(bfa bfaVar, Object obj) {
        String string;
        bln blnVarM9628a = blq.m9628a(obj, bld.m9605j());
        if (blnVarM9628a instanceof bll) {
            blnVarM9628a = new blc(Double.valueOf(((Long) blnVarM9628a.mo9545a()).longValue()), bld.m9605j());
        }
        if (m9631a(blnVarM9628a)) {
            return blnVarM9628a;
        }
        if (bfaVar != null) {
            String strValueOf = String.valueOf(bfaVar);
            string = new StringBuilder(String.valueOf(strValueOf).length() + 7).append("Path '").append(strValueOf).append("'").toString();
        } else {
            string = "Node";
        }
        throw new C2227c(String.valueOf(string).concat(" contains invalid priority: Must be a string, double, ServerValue, or null"));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m9631a(bln blnVar) {
        return blnVar.mo9573f().mo9568b() && (blnVar.mo9568b() || (blnVar instanceof blc) || (blnVar instanceof blv) || (blnVar instanceof blb));
    }
}
