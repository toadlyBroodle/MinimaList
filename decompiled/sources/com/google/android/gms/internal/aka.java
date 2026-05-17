package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C1221aj;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class aka {
    /* JADX INFO: renamed from: a */
    public static double m8077a(arh<?> arhVar, arh<?> arhVar2) {
        C1221aj.m7074b(arhVar != null);
        C1221aj.m7074b(arhVar2 != null);
        double dM8079b = m8079b(arhVar);
        double dM8079b2 = m8079b(arhVar2);
        if (Double.isNaN(dM8079b) || Double.isNaN(dM8079b2)) {
            return Double.NaN;
        }
        if ((dM8079b == Double.POSITIVE_INFINITY && dM8079b2 == Double.NEGATIVE_INFINITY) || (dM8079b == Double.NEGATIVE_INFINITY && dM8079b2 == Double.POSITIVE_INFINITY)) {
            return Double.NaN;
        }
        return (!Double.isInfinite(dM8079b) || Double.isInfinite(dM8079b2)) ? (Double.isInfinite(dM8079b) || !Double.isInfinite(dM8079b2)) ? dM8079b + dM8079b2 : dM8079b2 : dM8079b;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m8078a(arh<?> arhVar) {
        C1221aj.m7074b(arhVar != null);
        if (arhVar == arn.f7154e || arhVar == arn.f7153d) {
            return false;
        }
        if (arhVar instanceof ark) {
            return ((ark) arhVar).mo8208b().booleanValue();
        }
        if (arhVar instanceof arl) {
            if (((arl) arhVar).mo8208b().doubleValue() == 0.0d || ((arl) arhVar).mo8208b().doubleValue() == -0.0d || Double.isNaN(((arl) arhVar).mo8208b().doubleValue())) {
                return false;
            }
        } else if (arhVar instanceof art) {
            if (((art) arhVar).mo8208b().isEmpty()) {
                return false;
            }
        } else if (m8086f(arhVar)) {
            String string = arhVar.toString();
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(string).length() + 33).append("Illegal type given to isTruthy: ").append(string).append(".").toString());
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static double m8079b(arh<?> arhVar) {
        arh<?> artVar = arhVar;
        while (true) {
            C1221aj.m7074b(artVar != null);
            if (artVar == arn.f7154e) {
                return Double.NaN;
            }
            if (artVar == arn.f7153d) {
                return 0.0d;
            }
            if (artVar instanceof ark) {
                return ((ark) artVar).mo8208b().booleanValue() ? 1.0d : 0.0d;
            }
            if (artVar instanceof arl) {
                return ((arl) artVar).mo8208b().doubleValue();
            }
            if (artVar instanceof aro) {
                aro aroVar = (aro) artVar;
                if (!aroVar.mo8208b().isEmpty()) {
                    if (aroVar.mo8208b().size() != 1) {
                        break;
                    }
                    artVar = new art(m8083d(aroVar.m8216b(0)));
                } else {
                    return 0.0d;
                }
            } else if (artVar instanceof art) {
                art artVar2 = (art) artVar;
                if (artVar2.mo8208b().isEmpty()) {
                    return 0.0d;
                }
                try {
                    return Double.parseDouble(artVar2.mo8208b());
                } catch (NumberFormatException e) {
                    return Double.NaN;
                }
            }
        }
        if (!m8086f(artVar)) {
            return Double.NaN;
        }
        String string = artVar.toString();
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(string).length() + 41).append("Illegal type given to numberEquivalent: ").append(string).append(".").toString());
    }

    /* JADX INFO: renamed from: b */
    public static boolean m8080b(arh<?> arhVar, arh<?> arhVar2) {
        C1221aj.m7074b(arhVar != null);
        C1221aj.m7074b(arhVar2 != null);
        if (m8086f(arhVar)) {
            String string = arhVar.toString();
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(string).length() + 50).append("Illegal type given to abstractRelationalCompare: ").append(string).append(".").toString());
        }
        if (m8086f(arhVar2)) {
            String string2 = arhVar2.toString();
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(string2).length() + 50).append("Illegal type given to abstractRelationalCompare: ").append(string2).append(".").toString());
        }
        arh<?> artVar = ((arhVar instanceof arr) || (arhVar instanceof aro) || (arhVar instanceof arm)) ? new art(m8083d(arhVar)) : arhVar;
        arh<?> artVar2 = ((arhVar2 instanceof arr) || (arhVar2 instanceof aro) || (arhVar2 instanceof arm)) ? new art(m8083d(arhVar2)) : arhVar2;
        if ((artVar instanceof art) && (artVar2 instanceof art)) {
            return ((art) artVar).mo8208b().compareTo(((art) artVar2).mo8208b()) < 0;
        }
        double dM8079b = m8079b(artVar);
        double dM8079b2 = m8079b(artVar2);
        if (Double.isNaN(dM8079b) || Double.isNaN(dM8079b2)) {
            return false;
        }
        if (dM8079b == 0.0d && dM8079b2 == -0.0d) {
            return false;
        }
        if ((dM8079b == -0.0d && dM8079b2 == 0.0d) || dM8079b == Double.POSITIVE_INFINITY) {
            return false;
        }
        if (dM8079b2 == Double.POSITIVE_INFINITY) {
            return true;
        }
        if (dM8079b2 != Double.NEGATIVE_INFINITY) {
            return dM8079b == Double.NEGATIVE_INFINITY || Double.compare(dM8079b, dM8079b2) < 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static double m8081c(arh<?> arhVar) {
        double dM8079b = m8079b(arhVar);
        if (Double.isNaN(dM8079b)) {
            return 0.0d;
        }
        return (dM8079b == 0.0d || dM8079b == -0.0d || Double.isInfinite(dM8079b)) ? dM8079b : Math.signum(dM8079b) * Math.floor(Math.abs(dM8079b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:?, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m8082c(arh<?> arhVar, arh<?> arhVar2) {
        arh<?> arlVar = arhVar2;
        arh<?> arlVar2 = arhVar;
        while (true) {
            C1221aj.m7074b(arlVar2 != null);
            C1221aj.m7074b(arlVar != null);
            if (m8086f(arlVar2)) {
                String string = arlVar2.toString();
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(string).length() + 48).append("Illegal type given to abstractEqualityCompare: ").append(string).append(".").toString());
            }
            if (m8086f(arlVar)) {
                String string2 = arlVar.toString();
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(string2).length() + 48).append("Illegal type given to abstractEqualityCompare: ").append(string2).append(".").toString());
            }
            String strM8085e = m8085e(arlVar2);
            String strM8085e2 = m8085e(arlVar);
            if (strM8085e.equals(strM8085e2)) {
                switch (strM8085e) {
                    case "Undefined":
                    case "Null":
                        return true;
                    case "Number":
                        double dDoubleValue = ((arl) arlVar2).mo8208b().doubleValue();
                        double dDoubleValue2 = ((arl) arlVar).mo8208b().doubleValue();
                        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || dDoubleValue != dDoubleValue2) ? false : true;
                    case "String":
                        return ((art) arlVar2).mo8208b().equals(((art) arlVar).mo8208b());
                    case "Boolean":
                        return ((ark) arlVar2).mo8208b() == ((ark) arlVar).mo8208b();
                    case "Object":
                        return arlVar2 == arlVar;
                    default:
                        return false;
                }
            }
            if ((arlVar2 == arn.f7154e || arlVar2 == arn.f7153d) && (arlVar == arn.f7154e || arlVar == arn.f7153d)) {
                break;
            }
            if (strM8085e.equals("Number") && strM8085e2.equals("String")) {
                arlVar = new arl(Double.valueOf(m8079b(arlVar)));
            } else if (strM8085e.equals("String") && strM8085e2.equals("Number")) {
                arlVar2 = new arl(Double.valueOf(m8079b(arlVar2)));
            } else if (strM8085e.equals("Boolean")) {
                arlVar2 = new arl(Double.valueOf(m8079b(arlVar2)));
            } else if (strM8085e2.equals("Boolean")) {
                arlVar = new arl(Double.valueOf(m8079b(arlVar)));
            } else if ((strM8085e.equals("String") || strM8085e.equals("Number")) && strM8085e2.equals("Object")) {
                arlVar = new art(m8083d(arlVar));
            } else {
                if (!strM8085e.equals("Object")) {
                    return false;
                }
                if (!strM8085e2.equals("String") && !strM8085e2.equals("Number")) {
                    return false;
                }
                arlVar2 = new art(m8083d(arlVar2));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m8083d(arh<?> arhVar) {
        String string;
        C1221aj.m7074b(arhVar != null);
        if (arhVar == arn.f7154e) {
            return "undefined";
        }
        if (arhVar == arn.f7153d) {
            return "null";
        }
        if (arhVar instanceof ark) {
            return ((ark) arhVar).mo8208b().booleanValue() ? "true" : "false";
        }
        if (!(arhVar instanceof arl)) {
            if (arhVar instanceof arm) {
                ajz ajzVarMo8208b = ((arm) arhVar).mo8208b();
                if (ajzVarMo8208b instanceof ajy) {
                    return ((ajy) ajzVarMo8208b).m8074a();
                }
            } else {
                if (arhVar instanceof aro) {
                    ArrayList arrayList = new ArrayList();
                    for (arh<?> arhVar2 : ((aro) arhVar).mo8208b()) {
                        if (arhVar2 == arn.f7153d || arhVar2 == arn.f7154e) {
                            arrayList.add("");
                        } else {
                            arrayList.add(m8083d(arhVar2));
                        }
                    }
                    return TextUtils.join(",", arrayList);
                }
                if (arhVar instanceof arr) {
                    return "[object Object]";
                }
                if (arhVar instanceof art) {
                    return ((art) arhVar).mo8208b();
                }
            }
            if (m8086f(arhVar)) {
                String string2 = arhVar.toString();
                string = new StringBuilder(String.valueOf(string2).length() + 41).append("Illegal type given to stringEquivalent: ").append(string2).append(".").toString();
            } else {
                string = "Unknown type in stringEquivalent.";
            }
            throw new IllegalArgumentException(string);
        }
        String string3 = Double.toString(((arl) arhVar).mo8208b().doubleValue());
        int iIndexOf = string3.indexOf("E");
        if (iIndexOf <= 0) {
            if (!string3.endsWith(".0")) {
                return string3;
            }
            String strSubstring = string3.substring(0, string3.length() - 2);
            return strSubstring.equals("-0") ? "0" : strSubstring;
        }
        int i = Integer.parseInt(string3.substring(iIndexOf + 1, string3.length()));
        if (i < 0) {
            if (i <= -7) {
                return string3.replace("E", "e");
            }
            String strReplace = string3.substring(0, iIndexOf).replace(".", "");
            StringBuilder sb = new StringBuilder();
            sb.append("0.");
            for (int i2 = i; i2 + 1 < 0; i2++) {
                sb.append("0");
            }
            sb.append(strReplace);
            return sb.toString();
        }
        if (i >= 21) {
            return string3.replace("E", "e+");
        }
        String strReplace2 = string3.substring(0, iIndexOf).replace(".", "");
        int length = (i + 1) - (strReplace2.length() - (strReplace2.startsWith("-") ? 1 : 0));
        StringBuilder sb2 = new StringBuilder();
        if (length < 0) {
            int length2 = length + strReplace2.length();
            sb2.append(strReplace2.substring(0, length2));
            sb2.append(".");
            sb2.append(strReplace2.substring(length2, strReplace2.length()));
        } else {
            sb2.append(strReplace2);
            while (length > 0) {
                sb2.append("0");
                length--;
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m8084d(arh<?> arhVar, arh<?> arhVar2) {
        C1221aj.m7074b(arhVar != null);
        C1221aj.m7074b(arhVar2 != null);
        if (m8086f(arhVar)) {
            String string = arhVar.toString();
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(string).length() + 46).append("Illegal type given to strictEqualityCompare: ").append(string).append(".").toString());
        }
        if (m8086f(arhVar2)) {
            String string2 = arhVar2.toString();
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(string2).length() + 46).append("Illegal type given to strictEqualityCompare: ").append(string2).append(".").toString());
        }
        String strM8085e = m8085e(arhVar);
        if (!strM8085e.equals(m8085e(arhVar2))) {
            return false;
        }
        switch (strM8085e) {
            case "Undefined":
            case "Null":
                return true;
            case "Number":
                double dDoubleValue = ((arl) arhVar).mo8208b().doubleValue();
                double dDoubleValue2 = ((arl) arhVar2).mo8208b().doubleValue();
                return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || dDoubleValue != dDoubleValue2) ? false : true;
            case "String":
                return ((art) arhVar).mo8208b().equals(((art) arhVar2).mo8208b());
            case "Boolean":
                return ((ark) arhVar).mo8208b() == ((ark) arhVar2).mo8208b();
            default:
                return arhVar == arhVar2;
        }
    }

    /* JADX INFO: renamed from: e */
    private static String m8085e(arh<?> arhVar) {
        return arhVar == arn.f7154e ? "Undefined" : arhVar == arn.f7153d ? "Null" : arhVar instanceof ark ? "Boolean" : arhVar instanceof arl ? "Number" : arhVar instanceof art ? "String" : "Object";
    }

    /* JADX INFO: renamed from: f */
    private static boolean m8086f(arh<?> arhVar) {
        return (arhVar instanceof ars) || !(!(arhVar instanceof arn) || arhVar == arn.f7154e || arhVar == arn.f7153d);
    }
}
