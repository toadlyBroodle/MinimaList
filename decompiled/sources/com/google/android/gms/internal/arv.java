package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C1221aj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class arv {
    /* JADX INFO: renamed from: a */
    public static Bundle m8224a(Map<String, arh<?>> map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle(map.size());
        for (Map.Entry<String, arh<?>> entry : map.entrySet()) {
            if (entry.getValue() instanceof art) {
                bundle.putString(entry.getKey(), ((art) entry.getValue()).mo8208b());
            } else if (entry.getValue() instanceof ark) {
                bundle.putBoolean(entry.getKey(), ((ark) entry.getValue()).mo8208b().booleanValue());
            } else if (entry.getValue() instanceof arl) {
                bundle.putDouble(entry.getKey(), ((arl) entry.getValue()).mo8208b().doubleValue());
            } else {
                if (!(entry.getValue() instanceof arr)) {
                    throw new IllegalArgumentException(String.format("Invalid param type for key '%s'. Only boolean, double and string types and maps of thereof are supported.", entry.getKey()));
                }
                bundle.putBundle(entry.getKey(), m8224a(((arr) entry.getValue()).mo8208b()));
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    public static arh m8225a(aii aiiVar, arh arhVar) {
        C1221aj.m7065a(arhVar);
        if (!m8233c(arhVar) && !(arhVar instanceof arm) && !(arhVar instanceof aro) && !(arhVar instanceof arr)) {
            if (!(arhVar instanceof ars)) {
                throw new UnsupportedOperationException("Attempting to evaluate unknown type");
            }
            arhVar = m8226a(aiiVar, (ars) arhVar);
        }
        if (arhVar == null) {
            throw new IllegalArgumentException("AbstractType evaluated to Java null");
        }
        if (arhVar instanceof ars) {
            throw new IllegalArgumentException("AbstractType evaluated to illegal type Statement.");
        }
        return arhVar;
    }

    /* JADX INFO: renamed from: a */
    public static arh m8226a(aii aiiVar, ars arsVar) {
        String strM8220d = arsVar.m8220d();
        List<arh<?>> listM8221e = arsVar.m8221e();
        arh<?> arhVarM8003b = aiiVar.m8003b(strM8220d);
        if (arhVarM8003b == null) {
            throw new UnsupportedOperationException(new StringBuilder(String.valueOf(strM8220d).length() + 28).append("Function '").append(strM8220d).append("' is not supported").toString());
        }
        if (arhVarM8003b instanceof arm) {
            return ((arm) arhVarM8003b).mo8208b().mo8076b(aiiVar, (arh[]) listM8221e.toArray(new arh[listM8221e.size()]));
        }
        throw new UnsupportedOperationException(new StringBuilder(String.valueOf(strM8220d).length() + 29).append("Function '").append(strM8220d).append("' is not a function").toString());
    }

    /* JADX INFO: renamed from: a */
    public static arh<?> m8227a(Object obj) {
        if (obj == null) {
            return arn.f7153d;
        }
        if (obj instanceof arh) {
            return (arh) obj;
        }
        if (obj instanceof Boolean) {
            return new ark((Boolean) obj);
        }
        if (obj instanceof Short) {
            return new arl(Double.valueOf(((Short) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new arl(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Long) {
            return new arl(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Float) {
            return new arl(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return new arl((Double) obj);
        }
        if (!(obj instanceof Byte) && !(obj instanceof Character)) {
            if (obj instanceof String) {
                return new art((String) obj);
            }
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(m8227a(it.next()));
                }
                return new aro(arrayList);
            }
            if (obj instanceof Map) {
                HashMap map = new HashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    C1221aj.m7074b(entry.getKey() instanceof String);
                    map.put((String) entry.getKey(), m8227a(entry.getValue()));
                }
                return new arr(map);
            }
            if (!(obj instanceof Bundle)) {
                String strValueOf = String.valueOf(obj.getClass());
                throw new UnsupportedOperationException(new StringBuilder(String.valueOf(strValueOf).length() + 20).append("Type not supported: ").append(strValueOf).toString());
            }
            HashMap map2 = new HashMap();
            for (String str : ((Bundle) obj).keySet()) {
                map2.put(str, m8227a(((Bundle) obj).get(str)));
            }
            return new arr(map2);
        }
        return new art(obj.toString());
    }

    /* JADX INFO: renamed from: a */
    public static arn m8228a(aii aiiVar, List<arh<?>> list) {
        for (arh<?> arhVar : list) {
            C1221aj.m7074b(arhVar instanceof ars);
            arh arhVarM8225a = m8225a(aiiVar, arhVar);
            if (m8234d(arhVarM8225a)) {
                return (arn) arhVarM8225a;
            }
        }
        return arn.f7154e;
    }

    /* JADX INFO: renamed from: a */
    public static Object m8229a(arh<?> arhVar) {
        if (arhVar != null && arhVar != arn.f7153d) {
            if (arhVar instanceof ark) {
                return ((ark) arhVar).mo8208b();
            }
            if (arhVar instanceof arl) {
                double dDoubleValue = ((arl) arhVar).mo8208b().doubleValue();
                return (Double.isInfinite(dDoubleValue) || dDoubleValue - Math.floor(dDoubleValue) >= 1.0E-5d) ? ((arl) arhVar).mo8208b().toString() : Integer.valueOf((int) dDoubleValue);
            }
            if (arhVar instanceof art) {
                return ((art) arhVar).mo8208b();
            }
            if (arhVar instanceof aro) {
                ArrayList arrayList = new ArrayList();
                for (arh<?> arhVar2 : ((aro) arhVar).mo8208b()) {
                    Object objM8229a = m8229a(arhVar2);
                    if (objM8229a == null) {
                        ahs.m7942a(String.format("Failure to convert a list element to object: %s (%s)", arhVar2, arhVar2.getClass().getCanonicalName()));
                        return null;
                    }
                    arrayList.add(objM8229a);
                }
                return arrayList;
            }
            if (!(arhVar instanceof arr)) {
                String strValueOf = String.valueOf(arhVar.getClass());
                ahs.m7942a(new StringBuilder(String.valueOf(strValueOf).length() + 49).append("Converting to Object from unknown abstract type: ").append(strValueOf).toString());
                return null;
            }
            HashMap map = new HashMap();
            for (Map.Entry<String, arh<?>> entry : ((arr) arhVar).mo8208b().entrySet()) {
                Object objM8229a2 = m8229a(entry.getValue());
                if (objM8229a2 == null) {
                    ahs.m7942a(String.format("Failure to convert a map's value to object: %s (%s)", entry.getValue(), entry.getValue().getClass().getCanonicalName()));
                    return null;
                }
                map.put(entry.getKey(), objM8229a2);
            }
            return map;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static List<Object> m8230a(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof Bundle) {
                arrayList.add(m8231a((Bundle) obj));
            } else if (obj instanceof List) {
                arrayList.add(m8230a((List<Object>) obj));
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m8231a(Bundle bundle) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                map.put(str, m8231a((Bundle) obj));
            } else if (obj instanceof List) {
                map.put(str, m8230a((List<Object>) obj));
            } else {
                map.put(str, obj);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    public static arh m8232b(arh<?> arhVar) {
        if (arhVar instanceof arr) {
            HashSet hashSet = new HashSet();
            Map<String, arh<?>> mapMo8208b = ((arr) arhVar).mo8208b();
            for (Map.Entry<String, arh<?>> entry : mapMo8208b.entrySet()) {
                if (entry.getValue() == arn.f7154e) {
                    hashSet.add(entry.getKey());
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                mapMo8208b.remove((String) it.next());
            }
        }
        return arhVar;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m8233c(arh arhVar) {
        return (arhVar instanceof ark) || (arhVar instanceof arl) || (arhVar instanceof art) || arhVar == arn.f7153d || arhVar == arn.f7154e;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m8234d(arh arhVar) {
        return arhVar == arn.f7152c || arhVar == arn.f7151b || ((arhVar instanceof arn) && ((arn) arhVar).m8212d());
    }
}
