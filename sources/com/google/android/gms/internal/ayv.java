package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.p051b.AbstractC0964e;
import com.google.firebase.C2213b;
import com.google.firebase.C2286h;
import com.google.firebase.auth.AbstractC2158a;
import com.google.firebase.auth.AbstractC2198l;
import com.google.firebase.auth.C2200n;
import com.google.firebase.auth.C2204r;
import com.google.firebase.auth.internal.C2182e;
import com.google.firebase.auth.internal.C2184g;
import com.google.firebase.auth.internal.C2185h;
import com.google.firebase.auth.internal.InterfaceC2178a;
import com.google.firebase.auth.internal.InterfaceC2189l;
import com.google.firebase.auth.internal.InterfaceC2195r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ayv extends ayn<azl> {
    ayv(Context context, azl azlVar) {
        super(context, azj.f7608a, azlVar, new C2286h(), DynamiteModule.m7332b(context, "com.google.android.gms.firebase_auth"), DynamiteModule.m7325a(context, "com.google.firebase.auth"), Collections.EMPTY_MAP);
    }

    /* JADX INFO: renamed from: a */
    private static <ResultT, CallbackT> ayx<ResultT, CallbackT> m8700a(azo<ResultT, CallbackT> azoVar, String str) {
        return new ayx<>(azoVar, str);
    }

    /* JADX INFO: renamed from: a */
    private static C2184g m8702a(C2213b c2213b, bac bacVar, boolean z) {
        C1221aj.m7065a(c2213b);
        C1221aj.m7065a(bacVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2182e(bacVar, "firebase"));
        List<bag> listM8764j = bacVar.m8764j();
        if (listM8764j != null && !listM8764j.isEmpty()) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= listM8764j.size()) {
                    break;
                }
                arrayList.add(new C2182e(listM8764j.get(i2)));
                i = i2 + 1;
            }
        }
        C2184g c2184g = new C2184g(c2213b, arrayList);
        c2184g.mo12865a(z);
        c2184g.m12868a(new C2185h(bacVar.m8762h(), bacVar.m8761g()));
        c2184g.m12869b(bacVar.m8763i());
        return c2184g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static C2184g m8703b(C2213b c2213b, bac bacVar) {
        return m8702a(c2213b, bacVar, false);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0964e<Object> m8704a(C2213b c2213b, AbstractC2158a abstractC2158a, InterfaceC2178a interfaceC2178a) {
        return m8694b(m8700a(new ayy(abstractC2158a).m8744a(c2213b).m8745a(interfaceC2178a), "signInWithCredential"));
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0964e<C2200n> m8705a(C2213b c2213b, AbstractC2198l abstractC2198l, String str, InterfaceC2195r interfaceC2195r) {
        return m8693a(m8700a(new ayw(str).m8744a(c2213b).m8743a(abstractC2198l).m8745a(interfaceC2195r).m8742a((InterfaceC2189l) interfaceC2195r), "getAccessToken"));
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0964e<Object> m8706a(C2213b c2213b, C2204r c2204r, InterfaceC2178a interfaceC2178a) {
        return m8694b(m8700a(new azb(c2204r).m8744a(c2213b).m8745a(interfaceC2178a), "signInWithPhoneNumber"));
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0964e<Object> m8707a(C2213b c2213b, String str, String str2, InterfaceC2178a interfaceC2178a) {
        return m8694b(m8700a(new aza(str, str2).m8744a(c2213b).m8745a(interfaceC2178a), "signInWithEmailAndPassword"));
    }
}
