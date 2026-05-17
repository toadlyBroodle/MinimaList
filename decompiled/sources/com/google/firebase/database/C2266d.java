package com.google.firebase.database;

import com.google.android.gms.internal.bfa;
import com.google.android.gms.internal.bfd;
import com.google.android.gms.internal.bhk;
import com.google.android.gms.internal.bkp;
import com.google.android.gms.internal.bln;
import com.google.android.gms.internal.blq;
import com.google.android.gms.internal.blt;
import com.google.android.gms.internal.bnb;
import com.google.android.gms.internal.bnd;
import com.google.android.gms.internal.bne;
import com.google.android.gms.internal.bng;
import com.google.android.gms.internal.bnh;
import com.google.android.gms.p051b.AbstractC0964e;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: renamed from: com.google.firebase.database.d */
/* JADX INFO: loaded from: classes.dex */
public class C2266d extends C2273k {

    /* JADX INFO: renamed from: com.google.firebase.database.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo9701a(C2226b c2226b, C2266d c2266d);
    }

    C2266d(bfd bfdVar, bfa bfaVar) {
        super(bfdVar, bfaVar);
    }

    /* JADX INFO: renamed from: a */
    private final AbstractC0964e<Void> m12993a(Object obj, bln blnVar, a aVar) {
        bng.m9702a(this.f12952b);
        bhk.m9317a(this.f12952b, obj);
        Object objM9707a = bnh.m9707a(obj);
        bng.m9703a(objM9707a);
        bln blnVarM9628a = blq.m9628a(objM9707a, blnVar);
        bnb<AbstractC0964e<Void>, a> bnbVarM9693a = bne.m9693a(aVar);
        this.f12951a.m9203a(new RunnableC2277o(this, blnVarM9628a, bnbVarM9693a));
        return bnbVarM9693a.m9687a();
    }

    /* JADX INFO: renamed from: a */
    public AbstractC0964e<Void> m12994a(Object obj) {
        return m12993a(obj, blt.m9630a(this.f12952b, null), null);
    }

    /* JADX INFO: renamed from: a */
    public C2266d m12995a() {
        return new C2266d(this.f12951a, this.f12952b.m9153a(bkp.m9549a(bnd.m9689a(this.f12951a.m9206c()))));
    }

    /* JADX INFO: renamed from: a */
    public C2266d m12996a(String str) {
        if (str == null) {
            throw new NullPointerException("Can't pass null for argument 'pathString' in child()");
        }
        if (this.f12952b.m9162h()) {
            bng.m9705b(str);
        } else {
            bng.m9704a(str);
        }
        return new C2266d(this.f12951a, this.f12952b.m9152a(new bfa(str)));
    }

    /* JADX INFO: renamed from: b */
    public AbstractC0964e<Void> m12997b() {
        return m12994a((Object) null);
    }

    /* JADX INFO: renamed from: c */
    public C2266d m12998c() {
        bfa bfaVarM9160f = this.f12952b.m9160f();
        if (bfaVarM9160f != null) {
            return new C2266d(this.f12951a, bfaVarM9160f);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public String m12999d() {
        if (this.f12952b.m9162h()) {
            return null;
        }
        return this.f12952b.m9161g().m9554d();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2266d) && toString().equals(obj.toString());
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        C2266d c2266dM12998c = m12998c();
        if (c2266dM12998c == null) {
            return this.f12951a.toString();
        }
        try {
            String string = c2266dM12998c.toString();
            String strReplace = URLEncoder.encode(m12999d(), "UTF-8").replace("+", "%20");
            return new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(strReplace).length()).append(string).append("/").append(strReplace).toString();
        } catch (UnsupportedEncodingException e) {
            String strValueOf = String.valueOf(m12999d());
            throw new C2227c(strValueOf.length() != 0 ? "Failed to URLEncode key: ".concat(strValueOf) : new String("Failed to URLEncode key: "), e);
        }
    }
}
