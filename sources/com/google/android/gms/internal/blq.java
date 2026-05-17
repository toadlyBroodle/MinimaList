package com.google.android.gms.internal;

import com.google.firebase.database.C2227c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class blq {
    /* JADX WARN: Removed duplicated region for block: B:69:0x015d A[PHI: r9
      0x015d: PHI (r9v1 com.google.android.gms.internal.bln) = (r9v0 com.google.android.gms.internal.bln), (r9v3 com.google.android.gms.internal.bln) binds: [B:3:0x0002, B:8:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bln m9628a(Object obj, bln blnVar) {
        Object obj2;
        HashMap map;
        try {
            if (obj instanceof Map) {
                Map map2 = (Map) obj;
                if (map2.containsKey(".priority")) {
                    blnVar = blt.m9630a(null, map2.get(".priority"));
                }
                obj2 = map2.containsKey(".value") ? map2.get(".value") : obj;
            }
            if (obj2 == null) {
                return bld.m9605j();
            }
            if (obj2 instanceof String) {
                return new blv((String) obj2, blnVar);
            }
            if (obj2 instanceof Long) {
                return new bll((Long) obj2, blnVar);
            }
            if (obj2 instanceof Integer) {
                return new bll(Long.valueOf(((Integer) obj2).intValue()), blnVar);
            }
            if (obj2 instanceof Double) {
                return new blc((Double) obj2, blnVar);
            }
            if (obj2 instanceof Boolean) {
                return new bko((Boolean) obj2, blnVar);
            }
            if (!(obj2 instanceof Map) && !(obj2 instanceof List)) {
                String strValueOf = String.valueOf(obj2.getClass().toString());
                throw new C2227c(strValueOf.length() != 0 ? "Failed to parse node with class ".concat(strValueOf) : new String("Failed to parse node with class "));
            }
            if (obj2 instanceof Map) {
                Map map3 = (Map) obj2;
                if (map3.containsKey(".sv")) {
                    return new blb(map3, blnVar);
                }
                HashMap map4 = new HashMap(map3.size());
                for (String str : map3.keySet()) {
                    if (!str.startsWith(".")) {
                        bln blnVarM9628a = m9628a(map3.get(str), bld.m9605j());
                        if (!blnVarM9628a.mo9568b()) {
                            map4.put(bkp.m9549a(str), blnVarM9628a);
                        }
                    }
                }
                map = map4;
            } else {
                List list = (List) obj2;
                HashMap map5 = new HashMap(list.size());
                for (int i = 0; i < list.size(); i++) {
                    String string = new StringBuilder(11).append(i).toString();
                    bln blnVarM9628a2 = m9628a(list.get(i), bld.m9605j());
                    if (!blnVarM9628a2.mo9568b()) {
                        map5.put(bkp.m9549a(string), blnVarM9628a2);
                    }
                }
                map = map5;
            }
            return map.isEmpty() ? bld.m9605j() : new bkr(bbx.m8881a(map, bkr.f8337a), blnVar);
        } catch (ClassCastException e) {
            throw new C2227c("Failed to parse node", e);
        }
    }
}
