package com.google.firebase.database;

import android.support.design.C0025a;
import android.text.TextUtils;
import com.google.android.gms.internal.bew;
import com.google.android.gms.internal.bfa;
import com.google.android.gms.internal.bfd;
import com.google.android.gms.internal.bgb;
import com.google.android.gms.internal.bgc;
import com.google.android.gms.internal.bnc;
import com.google.android.gms.internal.bne;
import com.google.firebase.C2213b;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.firebase.database.f */
/* JADX INFO: loaded from: classes.dex */
public class C2268f {

    /* JADX INFO: renamed from: a */
    private static final Map<String, Map<bgb, C2268f>> f12944a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final C2213b f12945b;

    /* JADX INFO: renamed from: c */
    private final bgb f12946c;

    /* JADX INFO: renamed from: d */
    private final bew f12947d;

    /* JADX INFO: renamed from: e */
    private bfd f12948e;

    private C2268f(C2213b c2213b, bgb bgbVar, bew bewVar) {
        this.f12945b = c2213b;
        this.f12946c = bgbVar;
        this.f12947d = bewVar;
    }

    /* JADX INFO: renamed from: a */
    public static C2268f m13000a() {
        C2213b c2213bM12924d = C2213b.m12924d();
        if (c2213bM12924d == null) {
            throw new C2227c("You must call FirebaseApp.initialize() first.");
        }
        return m13001a(c2213bM12924d, c2213bM12924d.m12937c().m13025c());
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C2268f m13001a(C2213b c2213b, String str) {
        Map<bgb, C2268f> map;
        C2268f c2268f;
        if (TextUtils.isEmpty(str)) {
            throw new C2227c("Failed to get FirebaseDatabase instance: Specify DatabaseURL within FirebaseApp or from your getInstance() call.");
        }
        Map<bgb, C2268f> map2 = f12944a.get(c2213b.m12936b());
        if (map2 == null) {
            HashMap map3 = new HashMap();
            f12944a.put(c2213b.m12936b(), map3);
            map = map3;
        } else {
            map = map2;
        }
        bnc bncVarM9694a = bne.m9694a(str);
        if (!bncVarM9694a.f8461b.m9162h()) {
            String string = bncVarM9694a.f8461b.toString();
            throw new C2227c(new StringBuilder(String.valueOf(str).length() + C0025a.j.AppCompatTheme_windowFixedHeightMinor + String.valueOf(string).length()).append("Specified Database URL '").append(str).append("' is invalid. It should point to the root of a Firebase Database but it includes a path: ").append(string).toString());
        }
        c2268f = map.get(bncVarM9694a.f8460a);
        if (c2268f == null) {
            bew bewVar = new bew();
            if (!c2213b.m12938e()) {
                bewVar.m9129c(c2213b.m12936b());
            }
            bewVar.m9128a(c2213b);
            c2268f = new C2268f(c2213b, bncVarM9694a.f8460a, bewVar);
            map.put(bncVarM9694a.f8460a, c2268f);
        }
        return c2268f;
    }

    /* JADX INFO: renamed from: c */
    public static String m13002c() {
        return "3.0.0";
    }

    /* JADX INFO: renamed from: d */
    private final synchronized void m13003d() {
        if (this.f12948e == null) {
            this.f12948e = bgc.m9231a(this.f12947d, this.f12946c, this);
        }
    }

    /* JADX INFO: renamed from: b */
    public C2266d m13004b() {
        m13003d();
        return new C2266d(this.f12948e, bfa.m9147a());
    }
}
