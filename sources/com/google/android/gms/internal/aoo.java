package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class aoo extends akb {
    /* JADX INFO: renamed from: a */
    private static String m8095a(String str, int i, Set<Character> set) {
        switch (i) {
            case 1:
                try {
                    return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
                } catch (UnsupportedEncodingException e) {
                    return str;
                }
            case 2:
                String strReplace = str.replace("\\", "\\\\");
                Iterator<Character> it = set.iterator();
                while (true) {
                    String str2 = strReplace;
                    if (!it.hasNext()) {
                        return str2;
                    }
                    String string = it.next().toString();
                    String strValueOf = String.valueOf(string);
                    strReplace = str2.replace(string, strValueOf.length() != 0 ? "\\".concat(strValueOf) : new String("\\"));
                }
                break;
            default:
                return str;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m8096a(StringBuilder sb, String str, int i, Set<Character> set) {
        sb.append(m8095a(str, i, set));
    }

    /* JADX INFO: renamed from: a */
    private static void m8097a(Set<Character> set, String str) {
        for (int i = 0; i < str.length(); i++) {
            set.add(Character.valueOf(str.charAt(i)));
        }
    }

    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        int i = 2;
        boolean z = true;
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length > 0);
        arh<?> arhVar = arhVarArr[0];
        arh<?> arhVar2 = arhVarArr.length > 1 ? arhVarArr[1] : arn.f7154e;
        String strM8083d = arhVarArr.length > 2 ? arhVarArr[2] == arn.f7154e ? "" : aka.m8083d(arhVarArr[2]) : "";
        String strM8083d2 = arhVarArr.length > 3 ? arhVarArr[3] == arn.f7154e ? "=" : aka.m8083d(arhVarArr[3]) : "=";
        HashSet hashSet = null;
        if (arhVar2 != arn.f7154e) {
            C1221aj.m7074b(arhVar2 instanceof art);
            if ("url".equals(arhVar2.mo8208b())) {
                i = 1;
            } else {
                if (!"backslash".equals(arhVar2.mo8208b())) {
                    return new art("");
                }
                HashSet hashSet2 = new HashSet();
                m8097a(hashSet2, strM8083d);
                m8097a(hashSet2, strM8083d2);
                hashSet2.remove('\\');
                hashSet = hashSet2;
            }
        } else {
            i = 0;
        }
        StringBuilder sb = new StringBuilder();
        if (arhVar instanceof aro) {
            for (arh<?> arhVar3 : ((aro) arhVar).mo8208b()) {
                if (!z) {
                    sb.append(strM8083d);
                }
                m8096a(sb, aka.m8083d(arhVar3), i, hashSet);
                z = false;
            }
        } else if (arhVar instanceof arr) {
            Map<String, arh<?>> mapMo8208b = ((arr) arhVar).mo8208b();
            boolean z2 = true;
            for (String str : mapMo8208b.keySet()) {
                if (!z2) {
                    sb.append(strM8083d);
                }
                String strM8083d3 = aka.m8083d(mapMo8208b.get(str));
                m8096a(sb, str, i, hashSet);
                sb.append(strM8083d2);
                m8096a(sb, strM8083d3, i, hashSet);
                z2 = false;
            }
        } else {
            m8096a(sb, aka.m8083d(arhVar), i, hashSet);
        }
        return new art(sb.toString());
    }
}
