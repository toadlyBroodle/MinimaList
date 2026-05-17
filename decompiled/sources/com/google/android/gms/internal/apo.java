package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.analytics.C0890e;
import com.google.android.gms.analytics.C0893h;
import com.google.android.gms.analytics.p049a.C0884a;
import com.google.android.gms.analytics.p049a.C0886c;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.C1301e;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class apo extends akb {

    /* JADX INFO: renamed from: a */
    private static final String f7024a = EnumC2025ws.UNIVERSAL_ANALYTICS.toString();

    /* JADX INFO: renamed from: b */
    private static final List<String> f7025b = Arrays.asList("detail", "checkout", "checkout_option", "click", "add", "remove", "purchase", "refund");

    /* JADX INFO: renamed from: c */
    private static final Pattern f7026c = Pattern.compile("dimension(\\d+)");

    /* JADX INFO: renamed from: d */
    private static final Pattern f7027d = Pattern.compile("metric(\\d+)");

    /* JADX INFO: renamed from: e */
    private static final Set<String> f7028e = C1301e.m7258a("", "0", "false");

    /* JADX INFO: renamed from: f */
    private static final Map<String, String> f7029f = C1301e.m7256a("transactionId", "&ti", "transactionAffiliation", "&ta", "transactionTax", "&tt", "transactionShipping", "&ts", "transactionTotal", "&tr", "transactionCurrency", "&cu");

    /* JADX INFO: renamed from: g */
    private static final Map<String, String> f7030g = C1301e.m7256a("name", "&in", "sku", "&ic", "category", "&iv", "price", "&ip", "quantity", "&iq", "currency", "&cu");

    /* JADX INFO: renamed from: h */
    private final aju f7031h;

    /* JADX INFO: renamed from: i */
    private final aig f7032i;

    /* JADX INFO: renamed from: j */
    private Map<String, Object> f7033j;

    public apo(Context context, aig aigVar) {
        this(new aju(context), aigVar);
    }

    private apo(aju ajuVar, aig aigVar) {
        this.f7032i = aigVar;
        this.f7031h = ajuVar;
    }

    /* JADX INFO: renamed from: a */
    private static C0884a m8100a(Map<String, Object> map) {
        C0884a c0884a = new C0884a();
        Object obj = map.get("id");
        if (obj != null) {
            c0884a.m5937a(String.valueOf(obj));
        }
        Object obj2 = map.get("name");
        if (obj2 != null) {
            c0884a.m5939b(String.valueOf(obj2));
        }
        Object obj3 = map.get("brand");
        if (obj3 != null) {
            c0884a.m5940c(String.valueOf(obj3));
        }
        Object obj4 = map.get("category");
        if (obj4 != null) {
            c0884a.m5941d(String.valueOf(obj4));
        }
        Object obj5 = map.get("variant");
        if (obj5 != null) {
            c0884a.m5942e(String.valueOf(obj5));
        }
        Object obj6 = map.get("coupon");
        if (obj6 != null) {
            c0884a.m5943f(String.valueOf(obj6));
        }
        Object obj7 = map.get("position");
        if (obj7 != null) {
            c0884a.m5934a(m8105b(obj7).intValue());
        }
        Object obj8 = map.get("price");
        if (obj8 != null) {
            c0884a.m5933a(m8101a(obj8).doubleValue());
        }
        Object obj9 = map.get("quantity");
        if (obj9 != null) {
            c0884a.m5938b(m8105b(obj9).intValue());
        }
        for (String str : map.keySet()) {
            Matcher matcher = f7026c.matcher(str);
            if (matcher.matches()) {
                try {
                    c0884a.m5936a(Integer.parseInt(matcher.group(1)), String.valueOf(map.get(str)));
                } catch (NumberFormatException e) {
                    String strValueOf = String.valueOf(str);
                    ahs.m7944b(strValueOf.length() != 0 ? "illegal number in custom dimension value: ".concat(strValueOf) : new String("illegal number in custom dimension value: "));
                }
            } else {
                Matcher matcher2 = f7027d.matcher(str);
                if (matcher2.matches()) {
                    try {
                        c0884a.m5935a(Integer.parseInt(matcher2.group(1)), m8105b(map.get(str)).intValue());
                    } catch (NumberFormatException e2) {
                        String strValueOf2 = String.valueOf(str);
                        ahs.m7944b(strValueOf2.length() != 0 ? "illegal number in custom metric value: ".concat(strValueOf2) : new String("illegal number in custom metric value: "));
                    }
                }
            }
        }
        return c0884a;
    }

    /* JADX INFO: renamed from: a */
    private static Double m8101a(Object obj) {
        if (obj instanceof String) {
            try {
                return Double.valueOf((String) obj);
            } catch (NumberFormatException e) {
                String strValueOf = String.valueOf(e.getMessage());
                throw new RuntimeException(strValueOf.length() != 0 ? "Cannot convert the object to Double: ".concat(strValueOf) : new String("Cannot convert the object to Double: "));
            }
        }
        if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        }
        if (obj instanceof Double) {
            return (Double) obj;
        }
        String strValueOf2 = String.valueOf(obj.toString());
        throw new RuntimeException(strValueOf2.length() != 0 ? "Cannot convert the object to Double: ".concat(strValueOf2) : new String("Cannot convert the object to Double: "));
    }

    /* JADX INFO: renamed from: a */
    private final List<Map<String, Object>> m8102a(String str) {
        Object obj = this.f7033j.get(str);
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            throw new IllegalArgumentException("transactionProducts should be of type List.");
        }
        List<Map<String, Object>> list = (List) obj;
        Iterator<Map<String, Object>> it = list.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof Map)) {
                throw new IllegalArgumentException("Each element of transactionProducts should be of type Map.");
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: a */
    private static Map<String, String> m8103a(arh<?> arhVar) {
        C1221aj.m7065a(arhVar);
        C1221aj.m7074b(arhVar instanceof arr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object objM8229a = arv.m8229a((arh<?>) arv.m8232b(arhVar));
        C1221aj.m7070a(objM8229a instanceof Map);
        for (Map.Entry entry : ((Map) objM8229a).entrySet()) {
            linkedHashMap.put(entry.getKey().toString(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    private final void m8104a(C0893h c0893h, arh<?> arhVar, arh<?> arhVar2, arh<?> arhVar3) {
        String str = (String) this.f7033j.get("transactionId");
        if (str == null) {
            ahs.m7942a("Cannot find transactionId in data layer.");
            return;
        }
        LinkedList linkedList = new LinkedList();
        try {
            Map<String, String> mapM8106b = m8106b(arhVar);
            mapM8106b.put("&t", "transaction");
            for (Map.Entry<String, String> entry : (arhVar2 == arn.f7154e ? f7029f : m8103a(arhVar2)).entrySet()) {
                String str2 = (String) this.f7033j.get(entry.getKey());
                if (str2 != null) {
                    mapM8106b.put(entry.getValue(), str2);
                }
            }
            linkedList.add(mapM8106b);
            List<Map<String, Object>> listM8102a = m8102a("transactionProducts");
            if (listM8102a != null) {
                for (Map<String, Object> map : listM8102a) {
                    if (map.get("name") == null) {
                        ahs.m7942a("Unable to send transaction item hit due to missing 'name' field.");
                        return;
                    }
                    Map<String, String> mapM8106b2 = m8106b(arhVar);
                    mapM8106b2.put("&t", "item");
                    mapM8106b2.put("&ti", str);
                    for (Map.Entry<String, String> entry2 : (arhVar3 == arn.f7154e ? f7030g : m8103a(arhVar3)).entrySet()) {
                        Object obj = map.get(entry2.getKey());
                        if (obj != null) {
                            mapM8106b2.put(entry2.getValue(), obj.toString());
                        }
                    }
                    linkedList.add(mapM8106b2);
                }
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                c0893h.m6017a((Map<String, String>) it.next());
            }
        } catch (IllegalArgumentException e) {
            ahs.m7943a("Unable to send transaction", e);
        }
    }

    /* JADX INFO: renamed from: b */
    private static Integer m8105b(Object obj) {
        if (obj instanceof String) {
            try {
                return Integer.valueOf((String) obj);
            } catch (NumberFormatException e) {
                String strValueOf = String.valueOf(e.getMessage());
                throw new RuntimeException(strValueOf.length() != 0 ? "Cannot convert the object to Integer: ".concat(strValueOf) : new String("Cannot convert the object to Integer: "));
            }
        }
        if (obj instanceof Double) {
            return Integer.valueOf(((Double) obj).intValue());
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        String strValueOf2 = String.valueOf(obj.toString());
        throw new RuntimeException(strValueOf2.length() != 0 ? "Cannot convert the object to Integer: ".concat(strValueOf2) : new String("Cannot convert the object to Integer: "));
    }

    /* JADX INFO: renamed from: b */
    private static Map<String, String> m8106b(arh<?> arhVar) {
        Map<String, String> mapM8103a = m8103a(arhVar);
        String str = mapM8103a.get("&aip");
        if (str != null && f7028e.contains(str.toLowerCase())) {
            mapM8103a.remove("&aip");
        }
        return mapM8103a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0269, code lost:
    
        r0 = (java.util.Map) r0.get(r1);
        r2 = (java.util.List) r0.get("products");
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0277, code lost:
    
        if (r2 == null) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0279, code lost:
    
        r3 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0281, code lost:
    
        if (r3.hasNext() == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0289, code lost:
    
        r4.m5984a(m8100a((java.util.Map<java.lang.String, java.lang.Object>) r3.next()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0291, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0292, code lost:
    
        r2 = java.lang.String.valueOf(r2.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02a0, code lost:
    
        if (r2.length() != 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02a2, code lost:
    
        r2 = "Failed to extract a product from event data. ".concat(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02a6, code lost:
    
        com.google.android.gms.internal.ahs.m7942a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02b3, code lost:
    
        r2 = new java.lang.String("Failed to extract a product from event data. ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02bf, code lost:
    
        if (r0.containsKey("actionField") == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02c1, code lost:
    
        r0 = (java.util.Map) r0.get("actionField");
        r2 = new com.google.android.gms.analytics.p049a.C0885b(r1);
        r1 = r0.get("id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02d4, code lost:
    
        if (r1 == null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02d6, code lost:
    
        r2.m5948a(java.lang.String.valueOf(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02dd, code lost:
    
        r1 = r0.get("affiliation");
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02e3, code lost:
    
        if (r1 == null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02e5, code lost:
    
        r2.m5951b(java.lang.String.valueOf(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02ec, code lost:
    
        r1 = r0.get("coupon");
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02f2, code lost:
    
        if (r1 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02f4, code lost:
    
        r2.m5953c(java.lang.String.valueOf(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02fb, code lost:
    
        r1 = r0.get("list");
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0301, code lost:
    
        if (r1 == null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0303, code lost:
    
        r2.m5955e(java.lang.String.valueOf(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x030a, code lost:
    
        r1 = r0.get("option");
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0310, code lost:
    
        if (r1 == null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0312, code lost:
    
        r2.m5954d(java.lang.String.valueOf(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0319, code lost:
    
        r1 = r0.get("revenue");
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x031f, code lost:
    
        if (r1 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0321, code lost:
    
        r2.m5946a(m8101a(r1).doubleValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x032c, code lost:
    
        r1 = r0.get("tax");
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0332, code lost:
    
        if (r1 == null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0334, code lost:
    
        r2.m5950b(m8101a(r1).doubleValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x033f, code lost:
    
        r1 = r0.get("shipping");
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0345, code lost:
    
        if (r1 == null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0347, code lost:
    
        r2.m5952c(m8101a(r1).doubleValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0352, code lost:
    
        r0 = r0.get("step");
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0358, code lost:
    
        if (r0 == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x035a, code lost:
    
        r2.m5947a(m8105b(r0).intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0365, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0366, code lost:
    
        r4.m5986a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0376, code lost:
    
        r0 = new com.google.android.gms.analytics.p049a.C0885b(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x037c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x037d, code lost:
    
        r0 = java.lang.String.valueOf(r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x038b, code lost:
    
        if (r0.length() != 0) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x038d, code lost:
    
        r0 = "Failed to extract a product action from event data. ".concat(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0391, code lost:
    
        com.google.android.gms.internal.ahs.m7942a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0395, code lost:
    
        r0 = new java.lang.String("Failed to extract a product action from event data. ");
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0251 A[Catch: all -> 0x011c, TryCatch #3 {all -> 0x011c, blocks: (B:6:0x000b, B:8:0x0022, B:9:0x0026, B:11:0x002a, B:12:0x002e, B:14:0x0032, B:15:0x0036, B:17:0x003a, B:18:0x003e, B:20:0x0042, B:21:0x0046, B:23:0x004a, B:24:0x004e, B:26:0x0052, B:27:0x0056, B:29:0x005b, B:30:0x0060, B:32:0x0069, B:35:0x006e, B:37:0x0075, B:40:0x007a, B:42:0x0081, B:45:0x0086, B:47:0x009e, B:49:0x00b0, B:50:0x00b8, B:52:0x00bc, B:54:0x00c8, B:56:0x00d2, B:57:0x00d7, B:59:0x00e1, B:60:0x00e7, B:62:0x00ed, B:63:0x00f3, B:66:0x0104, B:68:0x0114, B:69:0x0118, B:87:0x0187, B:88:0x018d, B:90:0x0196, B:93:0x01a9, B:94:0x01ad, B:96:0x01b3, B:97:0x01b9, B:99:0x01c8, B:100:0x01cf, B:102:0x01d9, B:103:0x01e0, B:105:0x01ea, B:106:0x01f1, B:108:0x01fb, B:109:0x0202, B:112:0x0207, B:114:0x0217, B:115:0x021b, B:119:0x0239, B:120:0x023f, B:122:0x0247, B:124:0x0251, B:125:0x0257, B:127:0x025d, B:129:0x0269, B:131:0x0279, B:132:0x027d, B:134:0x0283, B:135:0x0289, B:138:0x0292, B:140:0x02a2, B:141:0x02a6, B:144:0x02b3, B:146:0x02b9, B:148:0x02c1, B:150:0x02d6, B:151:0x02dd, B:153:0x02e5, B:154:0x02ec, B:156:0x02f4, B:157:0x02fb, B:159:0x0303, B:160:0x030a, B:162:0x0312, B:163:0x0319, B:165:0x0321, B:166:0x032c, B:168:0x0334, B:169:0x033f, B:171:0x0347, B:172:0x0352, B:174:0x035a, B:176:0x0366, B:180:0x0376, B:183:0x037d, B:185:0x038d, B:186:0x0391, B:187:0x0395, B:142:0x02aa, B:116:0x021f, B:118:0x0227, B:177:0x0369, B:86:0x017d, B:188:0x039b, B:190:0x03a1, B:191:0x03a9, B:193:0x03af, B:194:0x03b3, B:82:0x0167, B:81:0x0162, B:80:0x0155, B:79:0x0148, B:78:0x0143, B:77:0x013e, B:76:0x0131, B:75:0x0124), top: B:202:0x000b, inners: #0, #1, #2, #4 }] */
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        boolean z;
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length > 0);
        try {
            this.f7033j = arv.m8231a(this.f7032i.mo7997a().m7906e());
            arh<?> arhVar = arhVarArr[0];
            arh<?> arkVar = arhVarArr.length > 1 ? arhVarArr[1] : new ark(true);
            arh<?> arkVar2 = arhVarArr.length > 2 ? arhVarArr[2] : new ark(false);
            arh<?> arhVar2 = arhVarArr.length > 3 ? arhVarArr[3] : arn.f7154e;
            arh<?> arhVar3 = arhVarArr.length > 4 ? arhVarArr[4] : arn.f7154e;
            arh<?> arkVar3 = arhVarArr.length > 5 ? arhVarArr[5] : new ark(false);
            arh<?> arkVar4 = arhVarArr.length > 6 ? arhVarArr[6] : new ark(false);
            arh<?> arhVar4 = arhVarArr.length > 7 ? arhVarArr[7] : arn.f7154e;
            arh<?> arkVar5 = arhVarArr.length > 8 ? arhVarArr[8] : new ark(false);
            C1221aj.m7074b(arhVar instanceof arr);
            C1221aj.m7074b(arhVar2 == arn.f7154e || (arhVar2 instanceof arr));
            C1221aj.m7074b(arhVar3 == arn.f7154e || (arhVar3 instanceof arr));
            C1221aj.m7074b(arhVar4 == arn.f7154e || (arhVar4 instanceof arr));
            C0893h c0893hM8066a = this.f7031h.m8066a("_GTM_DEFAULT_TRACKER_");
            c0893hM8066a.m6020c(aka.m8078a(arkVar5));
            if (aka.m8078a(arkVar3)) {
                C0890e.c cVar = new C0890e.c();
                Map<String, String> mapM8106b = m8106b(arhVar);
                cVar.m5989a(mapM8106b);
                Object objM8229a = aka.m8078a(arkVar4) ? this.f7033j.get("ecommerce") : arv.m8229a((arh<?>) arv.m8232b(arhVar4));
                if (objM8229a instanceof Map) {
                    Map map = (Map) objM8229a;
                    String str = mapM8106b.get("&cu");
                    if (str == null) {
                        str = (String) map.get("currencyCode");
                    }
                    if (str != null) {
                        cVar.m5988a("&cu", str);
                    }
                    Object obj = map.get("impressions");
                    if (obj instanceof List) {
                        for (Map map2 : (List) obj) {
                            try {
                                cVar.m5985a(m8100a((Map<String, Object>) map2), (String) map2.get("list"));
                            } catch (RuntimeException e) {
                                String strValueOf = String.valueOf(e.getMessage());
                                ahs.m7942a(strValueOf.length() != 0 ? "Failed to extract a product from event data. ".concat(strValueOf) : new String("Failed to extract a product from event data. "));
                            }
                        }
                    }
                    List<Map> list = null;
                    if (map.containsKey("promoClick")) {
                        list = (List) ((Map) map.get("promoClick")).get("promotions");
                    } else if (map.containsKey("promoView")) {
                        list = (List) ((Map) map.get("promoView")).get("promotions");
                    }
                    if (list != null) {
                        for (Map map3 : list) {
                            try {
                                C0886c c0886c = new C0886c();
                                String str2 = (String) map3.get("id");
                                if (str2 != null) {
                                    c0886c.m5957a(String.valueOf(str2));
                                }
                                String str3 = (String) map3.get("name");
                                if (str3 != null) {
                                    c0886c.m5958b(String.valueOf(str3));
                                }
                                String str4 = (String) map3.get("creative");
                                if (str4 != null) {
                                    c0886c.m5959c(String.valueOf(str4));
                                }
                                String str5 = (String) map3.get("position");
                                if (str5 != null) {
                                    c0886c.m5960d(String.valueOf(str5));
                                }
                                cVar.m5987a(c0886c);
                            } catch (RuntimeException e2) {
                                String strValueOf2 = String.valueOf(e2.getMessage());
                                ahs.m7942a(strValueOf2.length() != 0 ? "Failed to extract a promotion from event data. ".concat(strValueOf2) : new String("Failed to extract a promotion from event data. "));
                            }
                        }
                        if (map.containsKey("promoClick")) {
                            cVar.m5988a("&promoa", "click");
                            z = false;
                            if (z) {
                                Iterator<String> it = f7025b.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    String next = it.next();
                                    if (map.containsKey(next)) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            cVar.m5988a("&promoa", "view");
                            z = true;
                            if (z) {
                            }
                        }
                    } else {
                        z = true;
                        if (z) {
                        }
                    }
                }
                c0893hM8066a.m6017a(cVar.m5990a());
            } else if (aka.m8078a(arkVar)) {
                c0893hM8066a.m6017a(m8106b(arhVar));
            } else if (aka.m8078a(arkVar2)) {
                m8104a(c0893hM8066a, arhVar, arhVar2, arhVar3);
            } else {
                ahs.m7944b("Ignoring unknown tag.");
            }
            this.f7033j = null;
            return arn.f7154e;
        } catch (Throwable th) {
            this.f7033j = null;
            throw th;
        }
    }
}
