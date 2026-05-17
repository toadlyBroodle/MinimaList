package com.google.android.gms.internal;

import com.google.android.gms.internal.boz;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
final class bqd {
    /* JADX INFO: renamed from: a */
    static String m9964a(bqa bqaVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ").append(str);
        m9966a(bqaVar, sb, 0);
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private static final String m9965a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private static void m9966a(bqa bqaVar, StringBuilder sb, int i) {
        boolean zBooleanValue;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : bqaVar.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String strReplaceFirst = ((String) it.next()).replaceFirst("get", "");
            if (strReplaceFirst.endsWith("List") && !strReplaceFirst.endsWith("OrBuilderList")) {
                String strValueOf = String.valueOf(strReplaceFirst.substring(0, 1).toLowerCase());
                String strValueOf2 = String.valueOf(strReplaceFirst.substring(1, strReplaceFirst.length() - 4));
                String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                String strValueOf3 = String.valueOf(strReplaceFirst);
                Method method2 = (Method) map.get(strValueOf3.length() != 0 ? "get".concat(strValueOf3) : new String("get"));
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m9967a(sb, i, m9965a(strConcat), boz.m9903a(method2, bqaVar, new Object[0]));
                }
            }
            String strValueOf4 = String.valueOf(strReplaceFirst);
            if (((Method) map2.get(strValueOf4.length() != 0 ? "set".concat(strValueOf4) : new String("set"))) != null) {
                if (strReplaceFirst.endsWith("Bytes")) {
                    String strValueOf5 = String.valueOf(strReplaceFirst.substring(0, strReplaceFirst.length() - 5));
                    if (!map.containsKey(strValueOf5.length() != 0 ? "get".concat(strValueOf5) : new String("get"))) {
                    }
                }
                String strValueOf6 = String.valueOf(strReplaceFirst.substring(0, 1).toLowerCase());
                String strValueOf7 = String.valueOf(strReplaceFirst.substring(1));
                String strConcat2 = strValueOf7.length() != 0 ? strValueOf6.concat(strValueOf7) : new String(strValueOf6);
                String strValueOf8 = String.valueOf(strReplaceFirst);
                Method method3 = (Method) map.get(strValueOf8.length() != 0 ? "get".concat(strValueOf8) : new String("get"));
                String strValueOf9 = String.valueOf(strReplaceFirst);
                Method method4 = (Method) map.get(strValueOf9.length() != 0 ? "has".concat(strValueOf9) : new String("has"));
                if (method3 != null) {
                    Object objM9903a = boz.m9903a(method3, bqaVar, new Object[0]);
                    if (method4 == null) {
                        boolean zEquals = objM9903a instanceof Boolean ? !((Boolean) objM9903a).booleanValue() : objM9903a instanceof Integer ? ((Integer) objM9903a).intValue() == 0 : objM9903a instanceof Float ? ((Float) objM9903a).floatValue() == 0.0f : objM9903a instanceof Double ? ((Double) objM9903a).doubleValue() == 0.0d : objM9903a instanceof String ? objM9903a.equals("") : objM9903a instanceof bob ? objM9903a.equals(bob.f8512a) : objM9903a instanceof bqa ? objM9903a == ((bqa) objM9903a).mo9907n() : (objM9903a instanceof Enum) && ((Enum) objM9903a).ordinal() == 0;
                        zBooleanValue = !zEquals;
                    } else {
                        zBooleanValue = ((Boolean) boz.m9903a(method4, bqaVar, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        m9967a(sb, i, m9965a(strConcat2), objM9903a);
                    }
                }
            }
        }
        if (bqaVar instanceof boz.AbstractC1444d) {
            Iterator<Map.Entry<FieldDescriptorType, Object>> itM9888b = ((boz.AbstractC1444d) bqaVar).f8568d.m9888b();
            if (itM9888b.hasNext()) {
                ((Map.Entry) itM9888b.next()).getKey();
                throw new NoSuchMethodError();
            }
        }
        if (((boz) bqaVar).f8560b != null) {
            ((boz) bqaVar).f8560b.m10030a(sb, i);
        }
    }

    /* JADX INFO: renamed from: a */
    static final void m9967a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m9967a(sb, i, str, it.next());
            }
            return;
        }
        sb.append('\n');
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"").append(bqx.m10003a(bob.m9756a((String) obj))).append('\"');
            return;
        }
        if (obj instanceof bob) {
            sb.append(": \"").append(bqx.m10003a((bob) obj)).append('\"');
            return;
        }
        if (!(obj instanceof boz)) {
            sb.append(": ").append(obj.toString());
            return;
        }
        sb.append(" {");
        m9966a((boz) obj, sb, i + 2);
        sb.append("\n");
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append("}");
    }
}
