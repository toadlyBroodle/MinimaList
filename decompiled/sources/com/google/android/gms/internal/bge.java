package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bge {
    /* JADX INFO: renamed from: a */
    public static beo m9235a(beo beoVar, Map<String, Object> map) {
        beo beoVarM9094a = beo.m9094a();
        Iterator<Map.Entry<bfa, bln>> it = beoVar.iterator();
        while (true) {
            beo beoVar2 = beoVarM9094a;
            if (!it.hasNext()) {
                return beoVar2;
            }
            Map.Entry<bfa, bln> next = it.next();
            beoVarM9094a = beoVar2.m9100a(next.getKey(), m9236a(next.getValue(), map));
        }
    }

    /* JADX INFO: renamed from: a */
    public static bln m9236a(bln blnVar, Map<String, Object> map) {
        Object objMo9545a = blnVar.mo9573f().mo9545a();
        if (objMo9545a instanceof Map) {
            Map map2 = (Map) objMo9545a;
            if (map2.containsKey(".sv")) {
                objMo9545a = map.get((String) map2.get(".sv"));
            }
        }
        bln blnVarM9630a = blt.m9630a(null, objMo9545a);
        if (!blnVar.mo9572e()) {
            if (blnVar.mo9568b()) {
                return blnVar;
            }
            bkr bkrVar = (bkr) blnVar;
            bgi bgiVar = new bgi(bkrVar);
            bkrVar.m9564a((bku) new bgg(map, bgiVar), false);
            return !bgiVar.m9239a().mo9573f().equals(blnVarM9630a) ? bgiVar.m9239a().mo9544a(blnVarM9630a) : bgiVar.m9239a();
        }
        Object objMo9545a2 = blnVar.mo9545a();
        if (objMo9545a2 instanceof Map) {
            Map map3 = (Map) objMo9545a2;
            if (map3.containsKey(".sv")) {
                String str = (String) map3.get(".sv");
                if (map.containsKey(str)) {
                    objMo9545a2 = map.get(str);
                }
            }
        }
        return (objMo9545a2.equals(blnVar.mo9545a()) && blnVarM9630a.equals(blnVar.mo9573f())) ? blnVar : blq.m9628a(objMo9545a2, blnVarM9630a);
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m9237a(bmt bmtVar) {
        HashMap map = new HashMap();
        map.put("timestamp", Long.valueOf(bmtVar.mo9681a()));
        return map;
    }
}
