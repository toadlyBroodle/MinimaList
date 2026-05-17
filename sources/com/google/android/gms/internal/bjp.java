package com.google.android.gms.internal;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bjp {

    /* JADX INFO: renamed from: a */
    public static final bjp f8274a = new bjp();

    /* JADX INFO: renamed from: b */
    private Integer f8275b;

    /* JADX INFO: renamed from: c */
    private int f8276c;

    /* JADX INFO: renamed from: d */
    private bln f8277d = null;

    /* JADX INFO: renamed from: e */
    private bkp f8278e = null;

    /* JADX INFO: renamed from: f */
    private bln f8279f = null;

    /* JADX INFO: renamed from: g */
    private bkp f8280g = null;

    /* JADX INFO: renamed from: h */
    private ble f8281h = bls.m9629c();

    /* JADX INFO: renamed from: i */
    private String f8282i = null;

    /* JADX INFO: renamed from: a */
    public static bjp m9463a(Map<String, Object> map) {
        ble blrVar;
        bjp bjpVar = new bjp();
        bjpVar.f8275b = (Integer) map.get("l");
        if (map.containsKey("sp")) {
            bjpVar.f8277d = m9464a(blq.m9628a(map.get("sp"), bld.m9605j()));
            String str = (String) map.get("sn");
            if (str != null) {
                bjpVar.f8278e = bkp.m9549a(str);
            }
        }
        if (map.containsKey("ep")) {
            bjpVar.f8279f = m9464a(blq.m9628a(map.get("ep"), bld.m9605j()));
            String str2 = (String) map.get("en");
            if (str2 != null) {
                bjpVar.f8280g = bkp.m9549a(str2);
            }
        }
        String str3 = (String) map.get("vf");
        if (str3 != null) {
            bjpVar.f8276c = str3.equals("l") ? bjr.f8284a : bjr.f8285b;
        }
        String str4 = (String) map.get("i");
        if (str4 != null) {
            if (str4.equals(".value")) {
                blrVar = blx.m9634c();
            } else if (str4.equals(".key")) {
                blrVar = blg.m9621c();
            } else {
                if (str4.equals(".priority")) {
                    throw new IllegalStateException("queryDefinition shouldn't ever be .priority since it's the default");
                }
                blrVar = new blr(new bfa(str4));
            }
            bjpVar.f8281h = blrVar;
        }
        return bjpVar;
    }

    /* JADX INFO: renamed from: a */
    private static bln m9464a(bln blnVar) {
        if ((blnVar instanceof blv) || (blnVar instanceof bko) || (blnVar instanceof blc) || (blnVar instanceof bld)) {
            return blnVar;
        }
        if (blnVar instanceof bll) {
            return new blc(Double.valueOf(((Long) blnVar.mo9545a()).doubleValue()), bld.m9605j());
        }
        String strValueOf = String.valueOf(blnVar.mo9545a());
        throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf).length() + 43).append("Unexpected value passed to normalizeValue: ").append(strValueOf).toString());
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9465a() {
        return this.f8277d != null;
    }

    /* JADX INFO: renamed from: b */
    public final bln m9466b() {
        if (m9465a()) {
            return this.f8277d;
        }
        throw new IllegalArgumentException("Cannot get index start value if start has not been set");
    }

    /* JADX INFO: renamed from: c */
    public final bkp m9467c() {
        if (m9465a()) {
            return this.f8278e != null ? this.f8278e : bkp.m9548a();
        }
        throw new IllegalArgumentException("Cannot get index start name if start has not been set");
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9468d() {
        return this.f8279f != null;
    }

    /* JADX INFO: renamed from: e */
    public final bln m9469e() {
        if (m9468d()) {
            return this.f8279f;
        }
        throw new IllegalArgumentException("Cannot get index end value if start has not been set");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bjp bjpVar = (bjp) obj;
        if (this.f8275b == null ? bjpVar.f8275b != null : !this.f8275b.equals(bjpVar.f8275b)) {
            return false;
        }
        if (this.f8281h == null ? bjpVar.f8281h != null : !this.f8281h.equals(bjpVar.f8281h)) {
            return false;
        }
        if (this.f8280g == null ? bjpVar.f8280g != null : !this.f8280g.equals(bjpVar.f8280g)) {
            return false;
        }
        if (this.f8279f == null ? bjpVar.f8279f != null : !this.f8279f.equals(bjpVar.f8279f)) {
            return false;
        }
        if (this.f8278e == null ? bjpVar.f8278e != null : !this.f8278e.equals(bjpVar.f8278e)) {
            return false;
        }
        if (this.f8277d == null ? bjpVar.f8277d != null : !this.f8277d.equals(bjpVar.f8277d)) {
            return false;
        }
        return m9474j() == bjpVar.m9474j();
    }

    /* JADX INFO: renamed from: f */
    public final bkp m9470f() {
        if (m9468d()) {
            return this.f8280g != null ? this.f8280g : bkp.m9550b();
        }
        throw new IllegalArgumentException("Cannot get index end name if start has not been set");
    }

    /* JADX INFO: renamed from: g */
    public final boolean m9471g() {
        return this.f8275b != null;
    }

    /* JADX INFO: renamed from: h */
    public final int m9472h() {
        if (m9471g()) {
            return this.f8275b.intValue();
        }
        throw new IllegalArgumentException("Cannot get limit if limit has not been set");
    }

    public final int hashCode() {
        return (((this.f8280g != null ? this.f8280g.hashCode() : 0) + (((this.f8279f != null ? this.f8279f.hashCode() : 0) + (((this.f8278e != null ? this.f8278e.hashCode() : 0) + (((this.f8277d != null ? this.f8277d.hashCode() : 0) + (((m9474j() ? 1231 : 1237) + ((this.f8275b != null ? this.f8275b.intValue() : 0) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.f8281h != null ? this.f8281h.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final ble m9473i() {
        return this.f8281h;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m9474j() {
        return this.f8276c != 0 ? this.f8276c == bjr.f8284a : m9465a();
    }

    /* JADX INFO: renamed from: k */
    public final Map<String, Object> m9475k() {
        HashMap map = new HashMap();
        if (m9465a()) {
            map.put("sp", this.f8277d.mo9545a());
            if (this.f8278e != null) {
                map.put("sn", this.f8278e.m9554d());
            }
        }
        if (m9468d()) {
            map.put("ep", this.f8279f.mo9545a());
            if (this.f8280g != null) {
                map.put("en", this.f8280g.m9554d());
            }
        }
        if (this.f8275b != null) {
            map.put("l", this.f8275b);
            int i = this.f8276c;
            if (i == 0) {
                i = m9465a() ? bjr.f8284a : bjr.f8285b;
            }
            switch (bjq.f8283a[i - 1]) {
                case 1:
                    map.put("vf", "l");
                    break;
                case 2:
                    map.put("vf", "r");
                    break;
            }
        }
        if (!this.f8281h.equals(bls.m9629c())) {
            map.put("i", this.f8281h.mo9610b());
        }
        return map;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m9476l() {
        return (m9465a() || m9468d() || m9471g()) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m9477m() {
        return m9476l() && this.f8281h.equals(bls.m9629c());
    }

    /* JADX INFO: renamed from: n */
    public final String m9478n() {
        if (this.f8282i == null) {
            try {
                this.f8282i = bms.m9675a(m9475k());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return this.f8282i;
    }

    /* JADX INFO: renamed from: o */
    public final bke m9479o() {
        return m9476l() ? new bkc(this.f8281h) : m9471g() ? new bkd(this) : new bkg(this);
    }

    public final String toString() {
        return m9475k().toString();
    }
}
