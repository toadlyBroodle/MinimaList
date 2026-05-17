package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.InterfaceC1300d;
import com.google.android.gms.measurement.AppMeasurement;

/* JADX INFO: loaded from: classes.dex */
public final class aaa extends acd {

    /* JADX INFO: renamed from: a */
    private static String[] f6100a = new String[AppMeasurement.C2114a.f12753a.length];

    /* JADX INFO: renamed from: b */
    private static String[] f6101b = new String[AppMeasurement.C2117d.f12755a.length];

    /* JADX INFO: renamed from: c */
    private static String[] f6102c = new String[AppMeasurement.C2118e.f12757a.length];

    aaa(abd abdVar) {
        super(abdVar);
    }

    /* JADX INFO: renamed from: a */
    private final String m7354a(C2100zm c2100zm) {
        if (c2100zm == null) {
            return null;
        }
        return !m7364y() ? c2100zm.toString() : m7365a(c2100zm.m12769b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        return r4;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String m7355a(String str, String[] strArr, String[] strArr2, String[] strArr3) {
        int i = 0;
        C1221aj.m7065a(strArr);
        C1221aj.m7065a(strArr2);
        C1221aj.m7065a(strArr3);
        C1221aj.m7074b(strArr.length == strArr2.length);
        C1221aj.m7074b(strArr.length == strArr3.length);
        while (true) {
            if (i >= strArr.length) {
                break;
            }
            if (aek.m7725a(str, strArr[i])) {
                synchronized (strArr3) {
                    if (strArr3[i] == null) {
                        strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                    }
                    str = strArr3[i];
                }
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m7356a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m7357a(StringBuilder sb, int i, aen aenVar) {
        if (aenVar == null) {
            return;
        }
        m7356a(sb, i);
        sb.append("filter {\n");
        m7360a(sb, i, "complement", aenVar.f6518c);
        m7360a(sb, i, "param_name", m7373b(aenVar.f6519d));
        int i2 = i + 1;
        aeq aeqVar = aenVar.f6516a;
        if (aeqVar != null) {
            m7356a(sb, i2);
            sb.append("string_filter");
            sb.append(" {\n");
            if (aeqVar.f6529a != null) {
                String str = "UNKNOWN_MATCH_TYPE";
                switch (aeqVar.f6529a.intValue()) {
                    case 1:
                        str = "REGEXP";
                        break;
                    case 2:
                        str = "BEGINS_WITH";
                        break;
                    case 3:
                        str = "ENDS_WITH";
                        break;
                    case 4:
                        str = "PARTIAL";
                        break;
                    case 5:
                        str = "EXACT";
                        break;
                    case 6:
                        str = "IN_LIST";
                        break;
                }
                m7360a(sb, i2, "match_type", str);
            }
            m7360a(sb, i2, "expression", aeqVar.f6530b);
            m7360a(sb, i2, "case_sensitive", aeqVar.f6531c);
            if (aeqVar.f6532d.length > 0) {
                m7356a(sb, i2 + 1);
                sb.append("expression_list {\n");
                for (String str2 : aeqVar.f6532d) {
                    m7356a(sb, i2 + 2);
                    sb.append(str2);
                    sb.append("\n");
                }
                sb.append("}\n");
            }
            m7356a(sb, i2);
            sb.append("}\n");
        }
        m7358a(sb, i + 1, "number_filter", aenVar.f6517b);
        m7356a(sb, i);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: a */
    private final void m7358a(StringBuilder sb, int i, String str, aeo aeoVar) {
        if (aeoVar == null) {
            return;
        }
        m7356a(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (aeoVar.f6520a != null) {
            String str2 = "UNKNOWN_COMPARISON_TYPE";
            switch (aeoVar.f6520a.intValue()) {
                case 1:
                    str2 = "LESS_THAN";
                    break;
                case 2:
                    str2 = "GREATER_THAN";
                    break;
                case 3:
                    str2 = "EQUAL";
                    break;
                case 4:
                    str2 = "BETWEEN";
                    break;
            }
            m7360a(sb, i, "comparison_type", str2);
        }
        m7360a(sb, i, "match_as_float", aeoVar.f6521b);
        m7360a(sb, i, "comparison_value", aeoVar.f6522c);
        m7360a(sb, i, "min_comparison_value", aeoVar.f6523d);
        m7360a(sb, i, "max_comparison_value", aeoVar.f6524e);
        m7356a(sb, i);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: a */
    private static void m7359a(StringBuilder sb, int i, String str, afa afaVar) {
        int i2 = 0;
        if (afaVar == null) {
            return;
        }
        int i3 = i + 1;
        m7356a(sb, i3);
        sb.append(str);
        sb.append(" {\n");
        if (afaVar.f6603b != null) {
            m7356a(sb, i3 + 1);
            sb.append("results: ");
            long[] jArr = afaVar.f6603b;
            int length = jArr.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                Long lValueOf = Long.valueOf(jArr[i4]);
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(lValueOf);
                i4++;
                i5 = i6;
            }
            sb.append('\n');
        }
        if (afaVar.f6602a != null) {
            m7356a(sb, i3 + 1);
            sb.append("status: ");
            long[] jArr2 = afaVar.f6602a;
            int length2 = jArr2.length;
            int i7 = 0;
            while (i2 < length2) {
                Long lValueOf2 = Long.valueOf(jArr2[i2]);
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(lValueOf2);
                i2++;
                i7 = i8;
            }
            sb.append('\n');
        }
        m7356a(sb, i3);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: a */
    private static void m7360a(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m7356a(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    /* JADX INFO: renamed from: a */
    private final void m7361a(StringBuilder sb, int i, aev[] aevVarArr) {
        if (aevVarArr == null) {
            return;
        }
        for (aev aevVar : aevVarArr) {
            if (aevVar != null) {
                m7356a(sb, 2);
                sb.append("audience_membership {\n");
                m7360a(sb, 2, "audience_id", aevVar.f6549a);
                m7360a(sb, 2, "new_audience", aevVar.f6552d);
                m7359a(sb, 2, "current_data", aevVar.f6550b);
                m7359a(sb, 2, "previous_data", aevVar.f6551c);
                m7356a(sb, 2);
                sb.append("}\n");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m7362a(StringBuilder sb, int i, aew[] aewVarArr) {
        if (aewVarArr == null) {
            return;
        }
        for (aew aewVar : aewVarArr) {
            if (aewVar != null) {
                m7356a(sb, 2);
                sb.append("event {\n");
                m7360a(sb, 2, "name", m7371a(aewVar.f6555b));
                m7360a(sb, 2, "timestamp_millis", aewVar.f6556c);
                m7360a(sb, 2, "previous_timestamp_millis", aewVar.f6557d);
                m7360a(sb, 2, "count", aewVar.f6558e);
                aex[] aexVarArr = aewVar.f6554a;
                if (aexVarArr != null) {
                    for (aex aexVar : aexVarArr) {
                        if (aexVar != null) {
                            m7356a(sb, 3);
                            sb.append("param {\n");
                            m7360a(sb, 3, "name", m7373b(aexVar.f6560a));
                            m7360a(sb, 3, "string_value", aexVar.f6561b);
                            m7360a(sb, 3, "int_value", aexVar.f6562c);
                            m7360a(sb, 3, "double_value", aexVar.f6563d);
                            m7356a(sb, 3);
                            sb.append("}\n");
                        }
                    }
                }
                m7356a(sb, 2);
                sb.append("}\n");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m7363a(StringBuilder sb, int i, afb[] afbVarArr) {
        if (afbVarArr == null) {
            return;
        }
        for (afb afbVar : afbVarArr) {
            if (afbVar != null) {
                m7356a(sb, 2);
                sb.append("user_property {\n");
                m7360a(sb, 2, "set_timestamp_millis", afbVar.f6605a);
                m7360a(sb, 2, "name", m7375c(afbVar.f6606b));
                m7360a(sb, 2, "string_value", afbVar.f6607c);
                m7360a(sb, 2, "int_value", afbVar.f6608d);
                m7360a(sb, 2, "double_value", afbVar.f6609e);
                m7356a(sb, 2);
                sb.append("}\n");
            }
        }
    }

    /* JADX INFO: renamed from: y */
    private final boolean m7364y() {
        return this.f6329p.m7540f().m7409a(3);
    }

    /* JADX INFO: renamed from: a */
    protected final String m7365a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!m7364y()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        for (String str : bundle.keySet()) {
            if (sb.length() != 0) {
                sb.append(", ");
            } else {
                sb.append("Bundle[{");
            }
            sb.append(m7373b(str));
            sb.append("=");
            sb.append(bundle.get(str));
        }
        sb.append("}]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    protected final String m7366a(aem aemVar) {
        if (aemVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        m7360a(sb, 0, "filter_id", aemVar.f6510a);
        m7360a(sb, 0, "event_name", m7371a(aemVar.f6511b));
        m7358a(sb, 1, "event_count_filter", aemVar.f6513d);
        sb.append("  filters {\n");
        for (aen aenVar : aemVar.f6512c) {
            m7357a(sb, 2, aenVar);
        }
        m7356a(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    protected final String m7367a(aep aepVar) {
        if (aepVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        m7360a(sb, 0, "filter_id", aepVar.f6526a);
        m7360a(sb, 0, "property_name", m7375c(aepVar.f6527b));
        m7357a(sb, 1, aepVar.f6528c);
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    protected final String m7368a(aey aeyVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (aeyVar.f6565a != null) {
            for (aez aezVar : aeyVar.f6565a) {
                if (aezVar != null && aezVar != null) {
                    m7356a(sb, 1);
                    sb.append("bundle {\n");
                    m7360a(sb, 1, "protocol_version", aezVar.f6576a);
                    m7360a(sb, 1, "platform", aezVar.f6584i);
                    m7360a(sb, 1, "gmp_version", aezVar.f6592q);
                    m7360a(sb, 1, "uploading_gmp_version", aezVar.f6593r);
                    m7360a(sb, 1, "config_version", aezVar.f6571E);
                    m7360a(sb, 1, "gmp_app_id", aezVar.f6600y);
                    m7360a(sb, 1, "app_id", aezVar.f6590o);
                    m7360a(sb, 1, "app_version", aezVar.f6591p);
                    m7360a(sb, 1, "app_version_major", aezVar.f6569C);
                    m7360a(sb, 1, "firebase_instance_id", aezVar.f6568B);
                    m7360a(sb, 1, "dev_cert_hash", aezVar.f6597v);
                    m7360a(sb, 1, "app_store", aezVar.f6589n);
                    m7360a(sb, 1, "upload_timestamp_millis", aezVar.f6579d);
                    m7360a(sb, 1, "start_timestamp_millis", aezVar.f6580e);
                    m7360a(sb, 1, "end_timestamp_millis", aezVar.f6581f);
                    m7360a(sb, 1, "previous_bundle_start_timestamp_millis", aezVar.f6582g);
                    m7360a(sb, 1, "previous_bundle_end_timestamp_millis", aezVar.f6583h);
                    m7360a(sb, 1, "app_instance_id", aezVar.f6596u);
                    m7360a(sb, 1, "resettable_device_id", aezVar.f6594s);
                    m7360a(sb, 1, "device_id", aezVar.f6570D);
                    m7360a(sb, 1, "limited_ad_tracking", aezVar.f6595t);
                    m7360a(sb, 1, "os_version", aezVar.f6585j);
                    m7360a(sb, 1, "device_model", aezVar.f6586k);
                    m7360a(sb, 1, "user_default_language", aezVar.f6587l);
                    m7360a(sb, 1, "time_zone_offset_minutes", aezVar.f6588m);
                    m7360a(sb, 1, "bundle_sequential_index", aezVar.f6598w);
                    m7360a(sb, 1, "service_upload", aezVar.f6601z);
                    m7360a(sb, 1, "health_monitor", aezVar.f6599x);
                    if (aezVar.f6572F.longValue() != 0) {
                        m7360a(sb, 1, "android_id", aezVar.f6572F);
                    }
                    m7363a(sb, 1, aezVar.f6578c);
                    m7361a(sb, 1, aezVar.f6567A);
                    m7362a(sb, 1, aezVar.f6577b);
                    m7356a(sb, 1);
                    sb.append("}\n");
                }
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    protected final String m7369a(C2098zk c2098zk) {
        if (c2098zk == null) {
            return null;
        }
        if (!m7364y()) {
            return c2098zk.toString();
        }
        return "Event{appId='" + c2098zk.f12671a + "', name='" + m7371a(c2098zk.f12672b) + "', params=" + m7354a(c2098zk.f12675e) + "}";
    }

    /* JADX INFO: renamed from: a */
    protected final String m7370a(C2104zq c2104zq) {
        if (c2104zq == null) {
            return null;
        }
        if (!m7364y()) {
            return c2104zq.toString();
        }
        return "origin=" + c2104zq.f12692c + ",name=" + m7371a(c2104zq.f12690a) + ",params=" + m7354a(c2104zq.f12691b);
    }

    /* JADX INFO: renamed from: a */
    protected final String m7371a(String str) {
        if (str == null) {
            return null;
        }
        return m7364y() ? m7355a(str, AppMeasurement.C2114a.f12754b, AppMeasurement.C2114a.f12753a, f6100a) : str;
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7372a() {
        super.mo7372a();
    }

    /* JADX INFO: renamed from: b */
    protected final String m7373b(String str) {
        if (str == null) {
            return null;
        }
        return m7364y() ? m7355a(str, AppMeasurement.C2117d.f12756b, AppMeasurement.C2117d.f12755a, f6101b) : str;
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo7374b() {
        super.mo7374b();
    }

    /* JADX INFO: renamed from: c */
    protected final String m7375c(String str) {
        if (str == null) {
            return null;
        }
        if (!m7364y()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m7355a(str, AppMeasurement.C2118e.f12758b, AppMeasurement.C2118e.f12757a, f6102c);
        }
        return "experiment_id(" + str + ")";
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo7376c() {
        super.mo7376c();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ C2079ys mo7377d() {
        return super.mo7377d();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ C2086yz mo7378e() {
        return super.mo7378e();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ acf mo7379f() {
        return super.mo7379f();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ C2111zx mo7380g() {
        return super.mo7380g();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ C2097zj mo7381h() {
        return super.mo7381h();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ acz mo7382i() {
        return super.mo7382i();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ acv mo7383j() {
        return super.mo7383j();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ InterfaceC1300d mo7384k() {
        return super.mo7384k();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ Context mo7385l() {
        return super.mo7385l();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ C2112zy mo7386m() {
        return super.mo7386m();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ C2091zd mo7387n() {
        return super.mo7387n();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: o */
    public final /* bridge */ /* synthetic */ aaa mo7388o() {
        return super.mo7388o();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: p */
    public final /* bridge */ /* synthetic */ aek mo7389p() {
        return super.mo7389p();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: q */
    public final /* bridge */ /* synthetic */ aax mo7390q() {
        return super.mo7390q();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: r */
    public final /* bridge */ /* synthetic */ adz mo7391r() {
        return super.mo7391r();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: s */
    public final /* bridge */ /* synthetic */ aay mo7392s() {
        return super.mo7392s();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: t */
    public final /* bridge */ /* synthetic */ aac mo7393t() {
        return super.mo7393t();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: u */
    public final /* bridge */ /* synthetic */ aan mo7394u() {
        return super.mo7394u();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: v */
    public final /* bridge */ /* synthetic */ C2090zc mo7395v() {
        return super.mo7395v();
    }

    @Override // com.google.android.gms.internal.acd
    /* JADX INFO: renamed from: w */
    protected final boolean mo7396w() {
        return false;
    }
}
