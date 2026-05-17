package com.google.android.gms.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.support.v4.p018i.C0207a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1221aj;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: com.google.android.gms.internal.yz */
/* JADX INFO: loaded from: classes.dex */
final class C2086yz extends acd {
    C2086yz(abd abdVar) {
        super(abdVar);
    }

    /* JADX INFO: renamed from: a */
    private final Boolean m12669a(double d, aeo aeoVar) {
        try {
            return m12676a(new BigDecimal(d), aeoVar, Math.ulp(d));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private final Boolean m12670a(long j, aeo aeoVar) {
        try {
            return m12676a(new BigDecimal(j), aeoVar, 0.0d);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private final Boolean m12671a(aem aemVar, aew aewVar, long j) {
        Boolean boolM12674a;
        if (aemVar.f6513d != null) {
            Boolean boolM12670a = m12670a(j, aemVar.f6513d);
            if (boolM12670a == null) {
                return null;
            }
            if (!boolM12670a.booleanValue()) {
                return false;
            }
        }
        HashSet hashSet = new HashSet();
        for (aen aenVar : aemVar.f6512c) {
            if (TextUtils.isEmpty(aenVar.f6519d)) {
                mo7393t().m7401A().m7413a("null or empty param name in filter. event", mo7388o().m7371a(aewVar.f6555b));
                return null;
            }
            hashSet.add(aenVar.f6519d);
        }
        C0207a c0207a = new C0207a();
        for (aex aexVar : aewVar.f6554a) {
            if (hashSet.contains(aexVar.f6560a)) {
                if (aexVar.f6562c != null) {
                    c0207a.put(aexVar.f6560a, aexVar.f6562c);
                } else if (aexVar.f6563d != null) {
                    c0207a.put(aexVar.f6560a, aexVar.f6563d);
                } else {
                    if (aexVar.f6561b == null) {
                        mo7393t().m7401A().m7414a("Unknown value for param. event, param", mo7388o().m7371a(aewVar.f6555b), mo7388o().m7373b(aexVar.f6560a));
                        return null;
                    }
                    c0207a.put(aexVar.f6560a, aexVar.f6561b);
                }
            }
        }
        for (aen aenVar2 : aemVar.f6512c) {
            boolean zEquals = Boolean.TRUE.equals(aenVar2.f6518c);
            String str = aenVar2.f6519d;
            if (TextUtils.isEmpty(str)) {
                mo7393t().m7401A().m7413a("Event has empty param name. event", mo7388o().m7371a(aewVar.f6555b));
                return null;
            }
            V v = c0207a.get(str);
            if (v instanceof Long) {
                if (aenVar2.f6517b == null) {
                    mo7393t().m7401A().m7414a("No number filter for long param. event, param", mo7388o().m7371a(aewVar.f6555b), mo7388o().m7373b(str));
                    return null;
                }
                Boolean boolM12670a2 = m12670a(((Long) v).longValue(), aenVar2.f6517b);
                if (boolM12670a2 == null) {
                    return null;
                }
                if ((!boolM12670a2.booleanValue()) ^ zEquals) {
                    return false;
                }
            } else if (v instanceof Double) {
                if (aenVar2.f6517b == null) {
                    mo7393t().m7401A().m7414a("No number filter for double param. event, param", mo7388o().m7371a(aewVar.f6555b), mo7388o().m7373b(str));
                    return null;
                }
                Boolean boolM12669a = m12669a(((Double) v).doubleValue(), aenVar2.f6517b);
                if (boolM12669a == null) {
                    return null;
                }
                if ((!boolM12669a.booleanValue()) ^ zEquals) {
                    return false;
                }
            } else {
                if (!(v instanceof String)) {
                    if (v == 0) {
                        mo7393t().m7405E().m7414a("Missing param for filter. event, param", mo7388o().m7371a(aewVar.f6555b), mo7388o().m7373b(str));
                        return false;
                    }
                    mo7393t().m7401A().m7414a("Unknown param type. event, param", mo7388o().m7371a(aewVar.f6555b), mo7388o().m7373b(str));
                    return null;
                }
                if (aenVar2.f6516a != null) {
                    boolM12674a = m12675a((String) v, aenVar2.f6516a);
                } else {
                    if (aenVar2.f6517b == null) {
                        mo7393t().m7401A().m7414a("No filter for String param. event, param", mo7388o().m7371a(aewVar.f6555b), mo7388o().m7373b(str));
                        return null;
                    }
                    if (!aek.m7740k((String) v)) {
                        mo7393t().m7401A().m7414a("Invalid param value for number filter. event, param", mo7388o().m7371a(aewVar.f6555b), mo7388o().m7373b(str));
                        return null;
                    }
                    boolM12674a = m12674a((String) v, aenVar2.f6517b);
                }
                if (boolM12674a == null) {
                    return null;
                }
                if ((!boolM12674a.booleanValue()) ^ zEquals) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static Boolean m12672a(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() ^ z);
    }

    /* JADX INFO: renamed from: a */
    private final Boolean m12673a(String str, int i, boolean z, String str2, List<String> list, String str3) {
        if (str == null) {
            return null;
        }
        if (i == 6) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 1) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i) {
            case 1:
                try {
                } catch (PatternSyntaxException e) {
                    mo7393t().m7401A().m7413a("Invalid regular expression in REGEXP audience filter. expression", str3);
                    return null;
                }
                break;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private final Boolean m12674a(String str, aeo aeoVar) {
        if (!aek.m7740k(str)) {
            return null;
        }
        try {
            return m12676a(new BigDecimal(str), aeoVar, 0.0d);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private final Boolean m12675a(String str, aeq aeqVar) {
        List<String> arrayList;
        C1221aj.m7065a(aeqVar);
        if (str == null || aeqVar.f6529a == null || aeqVar.f6529a.intValue() == 0) {
            return null;
        }
        if (aeqVar.f6529a.intValue() == 6) {
            if (aeqVar.f6532d == null || aeqVar.f6532d.length == 0) {
                return null;
            }
        } else if (aeqVar.f6530b == null) {
            return null;
        }
        int iIntValue = aeqVar.f6529a.intValue();
        boolean z = aeqVar.f6531c != null && aeqVar.f6531c.booleanValue();
        String upperCase = (z || iIntValue == 1 || iIntValue == 6) ? aeqVar.f6530b : aeqVar.f6530b.toUpperCase(Locale.ENGLISH);
        if (aeqVar.f6532d == null) {
            arrayList = null;
        } else {
            String[] strArr = aeqVar.f6532d;
            if (z) {
                arrayList = Arrays.asList(strArr);
            } else {
                arrayList = new ArrayList<>();
                for (String str2 : strArr) {
                    arrayList.add(str2.toUpperCase(Locale.ENGLISH));
                }
            }
        }
        return m12673a(str, iIntValue, z, upperCase, arrayList, iIntValue == 1 ? upperCase : null);
    }

    /* JADX INFO: renamed from: a */
    private static Boolean m12676a(BigDecimal bigDecimal, aeo aeoVar, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        C1221aj.m7065a(aeoVar);
        if (aeoVar.f6520a == null || aeoVar.f6520a.intValue() == 0) {
            return null;
        }
        if (aeoVar.f6520a.intValue() == 4) {
            if (aeoVar.f6523d == null || aeoVar.f6524e == null) {
                return null;
            }
        } else if (aeoVar.f6522c == null) {
            return null;
        }
        int iIntValue = aeoVar.f6520a.intValue();
        if (aeoVar.f6520a.intValue() == 4) {
            if (!aek.m7740k(aeoVar.f6523d) || !aek.m7740k(aeoVar.f6524e)) {
                return null;
            }
            try {
                bigDecimal2 = new BigDecimal(aeoVar.f6523d);
                bigDecimal4 = new BigDecimal(aeoVar.f6524e);
                bigDecimal3 = null;
            } catch (NumberFormatException e) {
                return null;
            }
        } else {
            if (!aek.m7740k(aeoVar.f6522c)) {
                return null;
            }
            try {
                bigDecimal2 = null;
                bigDecimal3 = new BigDecimal(aeoVar.f6522c);
                bigDecimal4 = null;
            } catch (NumberFormatException e2) {
                return null;
            }
        }
        if (iIntValue != 4) {
            if (bigDecimal3 != null) {
            }
            return null;
        }
        if (bigDecimal2 == null) {
            return null;
        }
        switch (iIntValue) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                if (d == 0.0d) {
                }
                break;
            case 4:
                break;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    final aev[] m12677a(String str, aew[] aewVarArr, afb[] afbVarArr) {
        Map<Integer, List<aep>> map;
        Boolean boolM12672a;
        C2099zl c2099zlM12762a;
        Map<Integer, List<aem>> map2;
        C1221aj.m7067a(str);
        HashSet hashSet = new HashSet();
        C0207a c0207a = new C0207a();
        C0207a c0207a2 = new C0207a();
        C0207a c0207a3 = new C0207a();
        Map<Integer, afa> mapM12742e = mo7387n().m12742e(str);
        if (mapM12742e != null) {
            Iterator<Integer> it = mapM12742e.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                afa afaVar = mapM12742e.get(Integer.valueOf(iIntValue));
                BitSet bitSet = (BitSet) c0207a2.get(Integer.valueOf(iIntValue));
                BitSet bitSet2 = (BitSet) c0207a3.get(Integer.valueOf(iIntValue));
                if (bitSet == null) {
                    bitSet = new BitSet();
                    c0207a2.put(Integer.valueOf(iIntValue), bitSet);
                    bitSet2 = new BitSet();
                    c0207a3.put(Integer.valueOf(iIntValue), bitSet2);
                }
                for (int i = 0; i < (afaVar.f6602a.length << 6); i++) {
                    if (aek.m7728a(afaVar.f6602a, i)) {
                        mo7393t().m7405E().m7414a("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i));
                        bitSet2.set(i);
                        if (aek.m7728a(afaVar.f6603b, i)) {
                            bitSet.set(i);
                        }
                    }
                }
                aev aevVar = new aev();
                c0207a.put(Integer.valueOf(iIntValue), aevVar);
                aevVar.f6552d = false;
                aevVar.f6551c = afaVar;
                aevVar.f6550b = new afa();
                aevVar.f6550b.f6603b = aek.m7730a(bitSet);
                aevVar.f6550b.f6602a = aek.m7730a(bitSet2);
            }
        }
        if (aewVarArr != null) {
            C0207a c0207a4 = new C0207a();
            int length = aewVarArr.length;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= length) {
                    break;
                }
                aew aewVar = aewVarArr[i3];
                C2099zl c2099zlM12720a = mo7387n().m12720a(str, aewVar.f6555b);
                if (c2099zlM12720a == null) {
                    mo7393t().m7401A().m7414a("Event aggregate wasn't created during raw event logging. appId, event", aac.m7397a(str), mo7388o().m7371a(aewVar.f6555b));
                    c2099zlM12762a = new C2099zl(str, aewVar.f6555b, 1L, 1L, aewVar.f6556c.longValue(), 0L, null, null, null);
                } else {
                    c2099zlM12762a = c2099zlM12720a.m12762a();
                }
                mo7387n().m12727a(c2099zlM12762a);
                long j = c2099zlM12762a.f12679c;
                Map<Integer, List<aem>> map3 = (Map) c0207a4.get(aewVar.f6555b);
                if (map3 == null) {
                    Map<Integer, List<aem>> mapM12744f = mo7387n().m12744f(str, aewVar.f6555b);
                    if (mapM12744f == null) {
                        mapM12744f = new C0207a<>();
                    }
                    c0207a4.put(aewVar.f6555b, mapM12744f);
                    map2 = mapM12744f;
                } else {
                    map2 = map3;
                }
                Iterator<Integer> it2 = map2.keySet().iterator();
                while (it2.hasNext()) {
                    int iIntValue2 = it2.next().intValue();
                    if (hashSet.contains(Integer.valueOf(iIntValue2))) {
                        mo7393t().m7405E().m7413a("Skipping failed audience ID", Integer.valueOf(iIntValue2));
                    } else {
                        aev aevVar2 = (aev) c0207a.get(Integer.valueOf(iIntValue2));
                        BitSet bitSet3 = (BitSet) c0207a2.get(Integer.valueOf(iIntValue2));
                        BitSet bitSet4 = (BitSet) c0207a3.get(Integer.valueOf(iIntValue2));
                        if (aevVar2 == null) {
                            aev aevVar3 = new aev();
                            c0207a.put(Integer.valueOf(iIntValue2), aevVar3);
                            aevVar3.f6552d = true;
                            bitSet3 = new BitSet();
                            c0207a2.put(Integer.valueOf(iIntValue2), bitSet3);
                            bitSet4 = new BitSet();
                            c0207a3.put(Integer.valueOf(iIntValue2), bitSet4);
                        }
                        for (aem aemVar : map2.get(Integer.valueOf(iIntValue2))) {
                            if (mo7393t().m7409a(2)) {
                                mo7393t().m7405E().m7415a("Evaluating filter. audience, filter, event", Integer.valueOf(iIntValue2), aemVar.f6510a, mo7388o().m7371a(aemVar.f6511b));
                                mo7393t().m7405E().m7413a("Filter definition", mo7388o().m7366a(aemVar));
                            }
                            if (aemVar.f6510a == null || aemVar.f6510a.intValue() > 256) {
                                mo7393t().m7401A().m7414a("Invalid event filter ID. appId, id", aac.m7397a(str), String.valueOf(aemVar.f6510a));
                            } else if (bitSet3.get(aemVar.f6510a.intValue())) {
                                mo7393t().m7405E().m7414a("Event filter already evaluated true. audience ID, filter ID", Integer.valueOf(iIntValue2), aemVar.f6510a);
                            } else {
                                Boolean boolM12671a = m12671a(aemVar, aewVar, j);
                                mo7393t().m7405E().m7413a("Event filter result", boolM12671a == null ? "null" : boolM12671a);
                                if (boolM12671a == null) {
                                    hashSet.add(Integer.valueOf(iIntValue2));
                                } else {
                                    bitSet4.set(aemVar.f6510a.intValue());
                                    if (boolM12671a.booleanValue()) {
                                        bitSet3.set(aemVar.f6510a.intValue());
                                    }
                                }
                            }
                        }
                    }
                }
                i2 = i3 + 1;
            }
        }
        if (afbVarArr != null) {
            C0207a c0207a5 = new C0207a();
            for (afb afbVar : afbVarArr) {
                Map<Integer, List<aep>> map4 = (Map) c0207a5.get(afbVar.f6606b);
                if (map4 == null) {
                    Map<Integer, List<aep>> mapM12745g = mo7387n().m12745g(str, afbVar.f6606b);
                    if (mapM12745g == null) {
                        mapM12745g = new C0207a<>();
                    }
                    c0207a5.put(afbVar.f6606b, mapM12745g);
                    map = mapM12745g;
                } else {
                    map = map4;
                }
                Iterator<Integer> it3 = map.keySet().iterator();
                while (it3.hasNext()) {
                    int iIntValue3 = it3.next().intValue();
                    if (hashSet.contains(Integer.valueOf(iIntValue3))) {
                        mo7393t().m7405E().m7413a("Skipping failed audience ID", Integer.valueOf(iIntValue3));
                    } else {
                        aev aevVar4 = (aev) c0207a.get(Integer.valueOf(iIntValue3));
                        BitSet bitSet5 = (BitSet) c0207a2.get(Integer.valueOf(iIntValue3));
                        BitSet bitSet6 = (BitSet) c0207a3.get(Integer.valueOf(iIntValue3));
                        if (aevVar4 == null) {
                            aev aevVar5 = new aev();
                            c0207a.put(Integer.valueOf(iIntValue3), aevVar5);
                            aevVar5.f6552d = true;
                            bitSet5 = new BitSet();
                            c0207a2.put(Integer.valueOf(iIntValue3), bitSet5);
                            bitSet6 = new BitSet();
                            c0207a3.put(Integer.valueOf(iIntValue3), bitSet6);
                        }
                        for (aep aepVar : map.get(Integer.valueOf(iIntValue3))) {
                            if (mo7393t().m7409a(2)) {
                                mo7393t().m7405E().m7415a("Evaluating filter. audience, filter, property", Integer.valueOf(iIntValue3), aepVar.f6526a, mo7388o().m7375c(aepVar.f6527b));
                                mo7393t().m7405E().m7413a("Filter definition", mo7388o().m7367a(aepVar));
                            }
                            if (aepVar.f6526a == null || aepVar.f6526a.intValue() > 256) {
                                mo7393t().m7401A().m7414a("Invalid property filter ID. appId, id", aac.m7397a(str), String.valueOf(aepVar.f6526a));
                                hashSet.add(Integer.valueOf(iIntValue3));
                                break;
                            }
                            if (bitSet5.get(aepVar.f6526a.intValue())) {
                                mo7393t().m7405E().m7414a("Property filter already evaluated true. audience ID, filter ID", Integer.valueOf(iIntValue3), aepVar.f6526a);
                            } else {
                                aen aenVar = aepVar.f6528c;
                                if (aenVar == null) {
                                    mo7393t().m7401A().m7413a("Missing property filter. property", mo7388o().m7375c(afbVar.f6606b));
                                    boolM12672a = null;
                                } else {
                                    boolean zEquals = Boolean.TRUE.equals(aenVar.f6518c);
                                    if (afbVar.f6608d != null) {
                                        if (aenVar.f6517b == null) {
                                            mo7393t().m7401A().m7413a("No number filter for long property. property", mo7388o().m7375c(afbVar.f6606b));
                                            boolM12672a = null;
                                        } else {
                                            boolM12672a = m12672a(m12670a(afbVar.f6608d.longValue(), aenVar.f6517b), zEquals);
                                        }
                                    } else if (afbVar.f6609e != null) {
                                        if (aenVar.f6517b == null) {
                                            mo7393t().m7401A().m7413a("No number filter for double property. property", mo7388o().m7375c(afbVar.f6606b));
                                            boolM12672a = null;
                                        } else {
                                            boolM12672a = m12672a(m12669a(afbVar.f6609e.doubleValue(), aenVar.f6517b), zEquals);
                                        }
                                    } else if (afbVar.f6607c == null) {
                                        mo7393t().m7401A().m7413a("User property has no value, property", mo7388o().m7375c(afbVar.f6606b));
                                        boolM12672a = null;
                                    } else if (aenVar.f6516a == null) {
                                        if (aenVar.f6517b == null) {
                                            mo7393t().m7401A().m7413a("No string or number filter defined. property", mo7388o().m7375c(afbVar.f6606b));
                                        } else if (aek.m7740k(afbVar.f6607c)) {
                                            boolM12672a = m12672a(m12674a(afbVar.f6607c, aenVar.f6517b), zEquals);
                                        } else {
                                            mo7393t().m7401A().m7414a("Invalid user property value for Numeric number filter. property, value", mo7388o().m7375c(afbVar.f6606b), afbVar.f6607c);
                                        }
                                        boolM12672a = null;
                                    } else {
                                        boolM12672a = m12672a(m12675a(afbVar.f6607c, aenVar.f6516a), zEquals);
                                    }
                                }
                                mo7393t().m7405E().m7413a("Property filter result", boolM12672a == null ? "null" : boolM12672a);
                                if (boolM12672a == null) {
                                    hashSet.add(Integer.valueOf(iIntValue3));
                                } else {
                                    bitSet6.set(aepVar.f6526a.intValue());
                                    if (boolM12672a.booleanValue()) {
                                        bitSet5.set(aepVar.f6526a.intValue());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        aev[] aevVarArr = new aev[c0207a2.size()];
        Iterator it4 = c0207a2.keySet().iterator();
        int i4 = 0;
        while (it4.hasNext()) {
            int iIntValue4 = ((Integer) it4.next()).intValue();
            if (!hashSet.contains(Integer.valueOf(iIntValue4))) {
                aev aevVar6 = (aev) c0207a.get(Integer.valueOf(iIntValue4));
                aev aevVar7 = aevVar6 == null ? new aev() : aevVar6;
                int i5 = i4 + 1;
                aevVarArr[i4] = aevVar7;
                aevVar7.f6549a = Integer.valueOf(iIntValue4);
                aevVar7.f6550b = new afa();
                aevVar7.f6550b.f6603b = aek.m7730a((BitSet) c0207a2.get(Integer.valueOf(iIntValue4)));
                aevVar7.f6550b.f6602a = aek.m7730a((BitSet) c0207a3.get(Integer.valueOf(iIntValue4)));
                C2091zd c2091zdMo7387n = mo7387n();
                afa afaVar2 = aevVar7.f6550b;
                c2091zdMo7387n.m7584Q();
                c2091zdMo7387n.mo7376c();
                C1221aj.m7067a(str);
                C1221aj.m7065a(afaVar2);
                try {
                    byte[] bArr = new byte[afaVar2.m10166f()];
                    bru bruVarM10108a = bru.m10108a(bArr, 0, bArr.length);
                    afaVar2.mo7777a(bruVarM10108a);
                    bruVarM10108a.m10122a();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("audience_id", Integer.valueOf(iIntValue4));
                    contentValues.put("current_results", bArr);
                    try {
                        if (c2091zdMo7387n.m12709A().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                            c2091zdMo7387n.mo7393t().m7410y().m7413a("Failed to insert filter results (got -1). appId", aac.m7397a(str));
                        }
                        i4 = i5;
                    } catch (SQLiteException e) {
                        c2091zdMo7387n.mo7393t().m7410y().m7414a("Error storing filter results. appId", aac.m7397a(str), e);
                        i4 = i5;
                    }
                } catch (IOException e2) {
                    c2091zdMo7387n.mo7393t().m7410y().m7414a("Configuration loss. Failed to serialize filter results. appId", aac.m7397a(str), e2);
                    i4 = i5;
                }
            }
        }
        return (aev[]) Arrays.copyOf(aevVarArr, i4);
    }

    @Override // com.google.android.gms.internal.acd
    /* JADX INFO: renamed from: w */
    protected final boolean mo7396w() {
        return false;
    }
}
