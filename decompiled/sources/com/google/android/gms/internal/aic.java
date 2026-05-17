package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.tagmanager.InterfaceC2128h;
import com.google.android.gms.tagmanager.InterfaceC2137q;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class aic {

    /* JADX INFO: renamed from: a */
    private final Context f6822a;

    /* JADX INFO: renamed from: b */
    private final String f6823b;

    /* JADX INFO: renamed from: c */
    private final aqs f6824c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC2137q f6825d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC2128h f6826e;

    /* JADX INFO: renamed from: j */
    private int f6831j;

    /* JADX INFO: renamed from: k */
    private aod f6832k;

    /* JADX INFO: renamed from: l */
    private aha f6833l;

    /* JADX INFO: renamed from: f */
    private final aii f6827f = new aii();

    /* JADX INFO: renamed from: g */
    private final arr f6828g = new arr(new HashMap(50));

    /* JADX INFO: renamed from: h */
    private final arr f6829h = new arr(new HashMap(10));

    /* JADX INFO: renamed from: i */
    private final Set<String> f6830i = new HashSet();

    /* JADX INFO: renamed from: m */
    private final aig f6834m = new aid(this);

    public aic(Context context, String str, aqs aqsVar, arb arbVar, InterfaceC2137q interfaceC2137q, InterfaceC2128h interfaceC2128h) {
        aid aidVar = null;
        C1221aj.m7066a(aqsVar, "Internal Error: Container resource cannot be null");
        C1221aj.m7066a(arbVar, "Internal Error: Runtime resource cannot be null");
        C1221aj.m7068a(str, (Object) "Internal Error: ContainerId cannot be empty");
        C1221aj.m7065a(interfaceC2137q);
        C1221aj.m7065a(interfaceC2128h);
        this.f6822a = context;
        this.f6823b = str;
        this.f6824c = aqsVar;
        this.f6825d = interfaceC2137q;
        this.f6826e = interfaceC2128h;
        this.f6827f.m8001a("1", new arm(new akz()));
        this.f6827f.m8001a("12", new arm(new ala()));
        this.f6827f.m8001a("18", new arm(new alb()));
        this.f6827f.m8001a("19", new arm(new alc()));
        this.f6827f.m8001a("20", new arm(new ald()));
        this.f6827f.m8001a("21", new arm(new ale()));
        this.f6827f.m8001a("23", new arm(new alf()));
        this.f6827f.m8001a("24", new arm(new alg()));
        this.f6827f.m8001a("27", new arm(new alh()));
        this.f6827f.m8001a("28", new arm(new ali()));
        this.f6827f.m8001a("29", new arm(new alj()));
        this.f6827f.m8001a("30", new arm(new alk()));
        this.f6827f.m8001a("32", new arm(new all()));
        this.f6827f.m8001a("33", new arm(new all()));
        this.f6827f.m8001a("34", new arm(new alm()));
        this.f6827f.m8001a("35", new arm(new alm()));
        this.f6827f.m8001a("39", new arm(new aln()));
        this.f6827f.m8001a("40", new arm(new alo()));
        this.f6827f.m8001a("0", new arm(new amm()));
        this.f6827f.m8001a("10", new arm(new amn()));
        this.f6827f.m8001a("25", new arm(new amo()));
        this.f6827f.m8001a("26", new arm(new amp()));
        this.f6827f.m8001a("37", new arm(new amq()));
        this.f6827f.m8001a("2", new arm(new alp()));
        this.f6827f.m8001a("3", new arm(new alq()));
        this.f6827f.m8001a("4", new arm(new alr()));
        this.f6827f.m8001a("5", new arm(new alt()));
        this.f6827f.m8001a("6", new arm(new alu()));
        this.f6827f.m8001a("7", new arm(new alv()));
        this.f6827f.m8001a("8", new arm(new alw()));
        this.f6827f.m8001a("9", new arm(new alt()));
        this.f6827f.m8001a("13", new arm(new alx()));
        this.f6827f.m8001a("47", new arm(new aly()));
        this.f6827f.m8001a("15", new arm(new alz()));
        this.f6827f.m8001a("48", new arm(new ama(this)));
        amb ambVar = new amb();
        this.f6827f.m8001a("16", new arm(ambVar));
        this.f6827f.m8001a("17", new arm(ambVar));
        this.f6827f.m8001a("22", new arm(new amd()));
        this.f6827f.m8001a("45", new arm(new ame()));
        this.f6827f.m8001a("46", new arm(new amf()));
        this.f6827f.m8001a("36", new arm(new amg()));
        this.f6827f.m8001a("43", new arm(new amh()));
        this.f6827f.m8001a("38", new arm(new ami()));
        this.f6827f.m8001a("44", new arm(new amj()));
        this.f6827f.m8001a("41", new arm(new amk()));
        this.f6827f.m8001a("42", new arm(new aml()));
        m7988a(EnumC2025ws.CONTAINS, new apb());
        m7988a(EnumC2025ws.ENDS_WITH, new apc());
        m7988a(EnumC2025ws.EQUALS, new apd());
        m7988a(EnumC2025ws.GREATER_EQUALS, new ape());
        m7988a(EnumC2025ws.GREATER_THAN, new apf());
        m7988a(EnumC2025ws.LESS_EQUALS, new apg());
        m7988a(EnumC2025ws.LESS_THAN, new aph());
        m7988a(EnumC2025ws.REGEX, new apj());
        m7988a(EnumC2025ws.STARTS_WITH, new apk());
        this.f6828g.m8205a("advertiserId", new arm(new ans(this.f6822a)));
        this.f6828g.m8205a("advertiserTrackingEnabled", new arm(new ant(this.f6822a)));
        this.f6828g.m8205a("adwordsClickReferrer", new arm(new anv(this.f6822a, this.f6834m)));
        this.f6828g.m8205a("applicationId", new arm(new anw(this.f6822a)));
        this.f6828g.m8205a("applicationName", new arm(new anx(this.f6822a)));
        this.f6828g.m8205a("applicationVersion", new arm(new any(this.f6822a)));
        this.f6828g.m8205a("applicationVersionName", new arm(new anz(this.f6822a)));
        this.f6828g.m8205a("arbitraryPixieMacro", new arm(new anp(1, this.f6827f)));
        this.f6828g.m8205a("carrier", new arm(new aoa(this.f6822a)));
        this.f6828g.m8205a("constant", new arm(new amg()));
        this.f6828g.m8205a("containerId", new arm(new aob(new art(this.f6823b))));
        this.f6828g.m8205a("containerVersion", new arm(new aob(new art(this.f6824c.m8167b()))));
        this.f6828g.m8205a("customMacro", new arm(new ann(new aif(this, aidVar))));
        this.f6828g.m8205a("deviceBrand", new arm(new aoe()));
        this.f6828g.m8205a("deviceId", new arm(new aof(this.f6822a)));
        this.f6828g.m8205a("deviceModel", new arm(new aog()));
        this.f6828g.m8205a("deviceName", new arm(new aoh()));
        this.f6828g.m8205a("encode", new arm(new aoi()));
        this.f6828g.m8205a("encrypt", new arm(new aoj()));
        this.f6828g.m8205a("event", new arm(new aoc()));
        this.f6828g.m8205a("eventParameters", new arm(new aok(this.f6834m)));
        this.f6828g.m8205a("version", new arm(new aol()));
        this.f6828g.m8205a("hashcode", new arm(new aom()));
        this.f6828g.m8205a("installReferrer", new arm(new aon(this.f6822a)));
        this.f6828g.m8205a("join", new arm(new aoo()));
        this.f6828g.m8205a("language", new arm(new aop()));
        this.f6828g.m8205a("locale", new arm(new aoq()));
        this.f6828g.m8205a("adWordsUniqueId", new arm(new aos(this.f6822a)));
        this.f6828g.m8205a("osVersion", new arm(new aot()));
        this.f6828g.m8205a("platform", new arm(new aou()));
        this.f6828g.m8205a("random", new arm(new aow()));
        this.f6828g.m8205a("regexGroup", new arm(new aox()));
        this.f6828g.m8205a("resolution", new arm(new aoz(this.f6822a)));
        this.f6828g.m8205a("runtimeVersion", new arm(new aoy()));
        this.f6828g.m8205a("sdkVersion", new arm(new apa()));
        this.f6832k = new aod();
        this.f6828g.m8205a("currentTime", new arm(this.f6832k));
        this.f6828g.m8205a("userProperty", new arm(new aor(this.f6822a, this.f6834m)));
        this.f6828g.m8205a("arbitraryPixel", new arm(new apn(agy.m7896a(this.f6822a))));
        this.f6828g.m8205a("customTag", new arm(new ann(new aie(this, aidVar))));
        this.f6828g.m8205a("universalAnalytics", new arm(new apo(this.f6822a, this.f6834m)));
        this.f6828g.m8205a("queueRequest", new arm(new apl(agy.m7896a(this.f6822a))));
        this.f6828g.m8205a("sendMeasurement", new arm(new apm(this.f6825d, this.f6834m)));
        this.f6828g.m8205a("arbitraryPixieTag", new arm(new anp(0, this.f6827f)));
        this.f6828g.m8205a("suppressPassthrough", new arm(new anr(this.f6822a, this.f6834m)));
        this.f6829h.m8205a("decodeURI", new arm(new ani()));
        this.f6829h.m8205a("decodeURIComponent", new arm(new anj()));
        this.f6829h.m8205a("encodeURI", new arm(new ank()));
        this.f6829h.m8205a("encodeURIComponent", new arm(new anl()));
        this.f6829h.m8205a("log", new arm(new anq()));
        this.f6829h.m8205a("isArray", new arm(new anm()));
        m7987a(arbVar);
        arr arrVar = new arr(new HashMap(1));
        arrVar.m8205a("mobile", this.f6828g);
        arrVar.m8205a("common", this.f6829h);
        this.f6827f.m8001a("gtmUtils", arrVar);
        arr arrVar2 = new arr(new HashMap(this.f6828g.mo8208b()));
        arrVar2.m8218d();
        arr arrVar3 = new arr(new HashMap(this.f6829h.mo8208b()));
        arrVar3.m8218d();
        if (this.f6827f.m8002a("main") && (this.f6827f.m8003b("main") instanceof arm)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(arrVar);
            arv.m8226a(this.f6827f, new ars("main", arrayList));
        }
        this.f6828g.m8205a("base", arrVar2);
        this.f6829h.m8205a("base", arrVar3);
        arrVar.m8218d();
        this.f6828g.m8218d();
        this.f6829h.m8218d();
    }

    /* JADX INFO: renamed from: a */
    private final arh<?> m7981a(aqu aquVar) {
        this.f6830i.clear();
        try {
            arh<?> arhVarM7990b = m7990b(m7986a(aquVar.m8172a()));
            if (arhVarM7990b instanceof ark) {
                return arhVarM7990b;
            }
            agw.m7886a("Predicate must return a boolean value", this.f6822a);
            return new ark(false);
        } catch (IllegalStateException e) {
            ahs.m7942a("Error evaluating predicate.");
            return arn.f7153d;
        }
    }

    /* JADX INFO: renamed from: a */
    private final arh<?> m7982a(aqy aqyVar, Map<aqu, arh<?>> map) {
        String strValueOf = String.valueOf(aqyVar);
        ahs.m7947d(new StringBuilder(String.valueOf(strValueOf).length() + 19).append("Evaluating trigger ").append(strValueOf).toString());
        for (aqu aquVar : aqyVar.m8177b()) {
            arh<?> arhVarM7981a = map.get(aquVar);
            if (arhVarM7981a == null) {
                arhVarM7981a = m7981a(aquVar);
                map.put(aquVar, arhVarM7981a);
            }
            arh<?> arhVar = arhVarM7981a;
            if (arhVar == arn.f7153d) {
                return arn.f7153d;
            }
            if (((ark) arhVar).mo8208b().booleanValue()) {
                return new ark(false);
            }
        }
        for (aqu aquVar2 : aqyVar.m8176a()) {
            arh<?> arhVarM7981a2 = map.get(aquVar2);
            if (arhVarM7981a2 == null) {
                arhVarM7981a2 = m7981a(aquVar2);
                map.put(aquVar2, arhVarM7981a2);
            }
            arh<?> arhVar2 = arhVarM7981a2;
            if (arhVar2 == arn.f7153d) {
                return arn.f7153d;
            }
            if (!((ark) arhVar2).mo8208b().booleanValue()) {
                return new ark(false);
            }
        }
        return new ark(true);
    }

    /* JADX INFO: renamed from: a */
    private final arh<?> m7983a(are areVar) {
        switch (areVar.m8198a()) {
            case 1:
                try {
                    return new arl(Double.valueOf(Double.parseDouble((String) areVar.m8199b())));
                } catch (NumberFormatException e) {
                    return new art((String) areVar.m8199b());
                }
            case 2:
                List list = (List) areVar.m8199b();
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(m7983a((are) it.next()));
                }
                return new aro(arrayList);
            case 3:
                Map map = (Map) areVar.m8199b();
                HashMap map2 = new HashMap(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    map2.put(aka.m8083d(m7983a((are) entry.getKey())), m7983a((are) entry.getValue()));
                }
                return new arr(map2);
            case 4:
                arh<?> arhVarM7989b = m7989b((String) areVar.m8199b());
                return (!(arhVarM7989b instanceof art) || areVar.m8200c().isEmpty()) ? arhVarM7989b : new art(m7985a(((art) arhVarM7989b).mo8208b(), areVar.m8200c()));
            case 5:
                return new art((String) areVar.m8199b());
            case 6:
                return new arl(Double.valueOf(((Integer) areVar.m8199b()).doubleValue()));
            case 7:
                StringBuilder sb = new StringBuilder();
                Iterator it2 = ((List) areVar.m8199b()).iterator();
                while (it2.hasNext()) {
                    sb.append(aka.m8083d(m7983a((are) it2.next())));
                }
                return new art(sb.toString());
            case 8:
                return new ark((Boolean) areVar.m8199b());
            default:
                throw new IllegalStateException(new StringBuilder(52).append("Attempting to expand unknown Value type ").append(areVar.m8198a()).append(".").toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private final ars m7984a(String str, Map<String, arh<?>> map) {
        try {
            return ajw.m8067a(str, map, this.f6827f);
        } catch (RuntimeException e) {
            String message = e.getMessage();
            ahs.m7942a(new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(message).length()).append("Incorrect keys for function ").append(str).append(". ").append(message).toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private final String m7985a(String str, List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            switch (iIntValue) {
                case 12:
                    str = m7993c(str);
                    break;
                default:
                    ahs.m7942a(new StringBuilder(39).append("Unsupported Value Escaping: ").append(iIntValue).toString());
                    break;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    private final Map<String, arh<?>> m7986a(Map<String, are> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, are> entry : map.entrySet()) {
            map2.put(entry.getKey(), m7983a(entry.getValue()));
        }
        return map2;
    }

    /* JADX INFO: renamed from: a */
    private final void m7987a(arb arbVar) {
        for (ajy ajyVar : arbVar.m8194a()) {
            ajyVar.m8075a(this.f6827f);
            this.f6827f.m8001a(ajyVar.m8074a(), new arm(ajyVar));
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m7988a(EnumC2025ws enumC2025ws, ajz ajzVar) {
        this.f6828g.m8205a(ajw.m8068a(enumC2025ws), new arm(ajzVar));
    }

    /* JADX INFO: renamed from: b */
    private final arh<?> m7989b(String str) {
        this.f6831j++;
        String strM7992b = m7992b();
        ahs.m7947d(new StringBuilder(String.valueOf(strM7992b).length() + 31 + String.valueOf(str).length()).append(strM7992b).append("Beginning to evaluate variable ").append(str).toString());
        if (this.f6830i.contains(str)) {
            this.f6831j--;
            String string = this.f6830i.toString();
            throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 77 + String.valueOf(string).length()).append("Macro cycle detected.  Current macro reference: ").append(str).append(". Previous macro references: ").append(string).toString());
        }
        this.f6830i.add(str);
        aqu aquVarM8165a = this.f6824c.m8165a(str);
        if (aquVarM8165a == null) {
            this.f6831j--;
            this.f6830i.remove(str);
            String strM7992b2 = m7992b();
            throw new IllegalStateException(new StringBuilder(String.valueOf(strM7992b2).length() + 36 + String.valueOf(str).length()).append(strM7992b2).append("Attempting to resolve unknown macro ").append(str).toString());
        }
        arh<?> arhVarM7990b = m7990b(m7986a(aquVarM8165a.m8172a()));
        String strM7992b3 = m7992b();
        ahs.m7947d(new StringBuilder(String.valueOf(strM7992b3).length() + 25 + String.valueOf(str).length()).append(strM7992b3).append("Done evaluating variable ").append(str).toString());
        this.f6831j--;
        this.f6830i.remove(str);
        return arhVarM7990b;
    }

    /* JADX INFO: renamed from: b */
    private final arh m7990b(Map<String, arh<?>> map) {
        ars arsVarM7984a;
        if (map == null) {
            agw.m7886a("executeFunctionCall: cannot access the function parameters.", this.f6822a);
            return arn.f7154e;
        }
        arh<?> arhVar = map.get(EnumC2034xa.FUNCTION.toString());
        if (!(arhVar instanceof art)) {
            agw.m7886a("No function id in properties", this.f6822a);
            return arn.f7154e;
        }
        String strMo8208b = ((art) arhVar).mo8208b();
        if (this.f6827f.m8002a(strMo8208b)) {
            HashMap map2 = new HashMap();
            for (Map.Entry<String, arh<?>> entry : map.entrySet()) {
                if (entry.getKey().startsWith("vtp_")) {
                    map2.put(entry.getKey().substring(4), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new arr(map2));
            arsVarM7984a = new ars(strMo8208b, arrayList);
        } else {
            String strM8069a = ajw.m8069a(strMo8208b);
            if (!(strM8069a != null && this.f6828g.m8206a(strM8069a))) {
                agw.m7886a(new StringBuilder(String.valueOf(strMo8208b).length() + 30).append("functionId '").append(strMo8208b).append("' is not supported").toString(), this.f6822a);
                return arn.f7154e;
            }
            arsVarM7984a = m7984a(strMo8208b, map);
        }
        if (arsVarM7984a == null) {
            agw.m7886a("Internal error: failed to convert function to a valid statement", this.f6822a);
            return arn.f7154e;
        }
        String strValueOf = String.valueOf(arsVarM7984a.m8220d());
        ahs.m7947d(strValueOf.length() != 0 ? "Executing: ".concat(strValueOf) : new String("Executing: "));
        arh arhVarM8226a = arv.m8226a(this.f6827f, arsVarM7984a);
        return ((arhVarM8226a instanceof arn) && ((arn) arhVarM8226a).m8212d()) ? ((arn) arhVarM8226a).mo8208b() : arhVarM8226a;
    }

    /* JADX INFO: renamed from: b */
    private final String m7992b() {
        if (this.f6831j <= 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(this.f6831j));
        for (int i = 2; i < this.f6831j; i++) {
            sb.append(' ');
        }
        sb.append(": ");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    private static String m7993c(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            ahs.m7943a("Escape URI: unsupported encoding", e);
            return str;
        }
    }

    /* JADX INFO: renamed from: a */
    public final arh<?> m7994a(String str) {
        if (this.f6830i.contains(str)) {
            String string = this.f6830i.toString();
            throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 77 + String.valueOf(string).length()).append("Macro cycle detected.  Current macro reference: ").append(str).append(". Previous macro references: ").append(string).toString());
        }
        this.f6831j = 0;
        return m7989b(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m7995a() {
        agy.m7896a(this.f6822a).mo7897a();
    }

    /* JADX INFO: renamed from: a */
    public final void m7996a(aha ahaVar) {
        IllegalStateException illegalStateException;
        boolean z;
        boolean z2;
        this.f6827f.m8001a("gtm.globals.eventName", new art(ahaVar.m7905d()));
        this.f6832k.m8093a(ahaVar);
        this.f6833l = ahaVar;
        HashSet<aqu> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap map = new HashMap();
        for (aqy aqyVar : this.f6824c.m8166a()) {
            if (aqyVar.m8178c().isEmpty() && aqyVar.m8179d().isEmpty()) {
                String strValueOf = String.valueOf(aqyVar);
                ahs.m7947d(new StringBuilder(String.valueOf(strValueOf).length() + 64).append("Trigger is not being evaluated since it has no associated tags: ").append(strValueOf).toString());
            } else {
                arh<?> arhVarM7982a = m7982a(aqyVar, map);
                if (arhVarM7982a == arn.f7153d) {
                    String strValueOf2 = String.valueOf(aqyVar);
                    agw.m7888b(new StringBuilder(String.valueOf(strValueOf2).length() + 41).append("Error encounted while evaluating trigger ").append(strValueOf2).toString(), this.f6822a);
                    if (!aqyVar.m8179d().isEmpty()) {
                        String strValueOf3 = String.valueOf(aqyVar.m8179d());
                        ahs.m7947d(new StringBuilder(String.valueOf(strValueOf3).length() + 15).append("Blocking tags: ").append(strValueOf3).toString());
                        hashSet2.addAll(aqyVar.m8179d());
                    }
                } else if (((ark) arhVarM7982a).mo8208b().booleanValue()) {
                    String strValueOf4 = String.valueOf(aqyVar);
                    ahs.m7947d(new StringBuilder(String.valueOf(strValueOf4).length() + 19).append("Trigger is firing: ").append(strValueOf4).toString());
                    if (!aqyVar.m8178c().isEmpty()) {
                        String strValueOf5 = String.valueOf(aqyVar.m8178c());
                        ahs.m7947d(new StringBuilder(String.valueOf(strValueOf5).length() + 34).append("Adding tags to firing candidates: ").append(strValueOf5).toString());
                        hashSet.addAll(aqyVar.m8178c());
                    }
                    if (!aqyVar.m8179d().isEmpty()) {
                        String strValueOf6 = String.valueOf(aqyVar.m8179d());
                        ahs.m7947d(new StringBuilder(String.valueOf(strValueOf6).length() + 24).append("Blocking disabled tags: ").append(strValueOf6).toString());
                        hashSet2.addAll(aqyVar.m8179d());
                    }
                }
            }
        }
        hashSet.removeAll(hashSet2);
        boolean z3 = false;
        for (aqu aquVar : hashSet) {
            this.f6830i.clear();
            String strValueOf7 = String.valueOf(aquVar);
            ahs.m7947d(new StringBuilder(String.valueOf(strValueOf7).length() + 21).append("Executing firing tag ").append(strValueOf7).toString());
            try {
                m7990b(m7986a(aquVar.m8172a()));
                are areVar = aquVar.m8172a().get(EnumC2034xa.DISPATCH_ON_FIRE.toString());
                if (areVar != null && areVar.m8198a() == 8 && ((Boolean) areVar.m8199b()).booleanValue()) {
                    try {
                        String strValueOf8 = String.valueOf(aquVar);
                        ahs.m7947d(new StringBuilder(String.valueOf(strValueOf8).length() + 36).append("Tag configured to dispatch on fire: ").append(strValueOf8).toString());
                        z2 = true;
                    } catch (IllegalStateException e) {
                        illegalStateException = e;
                        z = true;
                        String strValueOf9 = String.valueOf(aquVar);
                        agw.m7887a(new StringBuilder(String.valueOf(strValueOf9).length() + 19).append("Error firing tag ").append(strValueOf9).append(": ").toString(), illegalStateException, this.f6822a);
                        z3 = z;
                    }
                } else {
                    z2 = z3;
                }
                z3 = z2;
            } catch (IllegalStateException e2) {
                illegalStateException = e2;
                z = z3;
            }
        }
        this.f6827f.m8005c("gtm.globals.eventName");
        if (ahaVar.m7909h()) {
            String strM7905d = ahaVar.m7905d();
            ahs.m7947d(new StringBuilder(String.valueOf(strM7905d).length() + 35).append("Log passthrough event ").append(strM7905d).append(" to Firebase.").toString());
            try {
                this.f6825d.mo12818a(ahaVar.m7907f(), ahaVar.m7905d(), ahaVar.m7906e(), ahaVar.mo7252a());
            } catch (RemoteException e3) {
                agw.m7887a("Error calling measurement proxy: ", e3, this.f6822a);
            }
        } else {
            String strM7905d2 = ahaVar.m7905d();
            ahs.m7947d(new StringBuilder(String.valueOf(strM7905d2).length() + 63).append("Non-passthrough event ").append(strM7905d2).append(" doesn't get logged to Firebase directly.").toString());
        }
        if (z3) {
            ahs.m7947d("Dispatch called for dispatchOnFire tags.");
            m7995a();
        }
    }
}
