package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.AbstractBinderC0689a;
import com.google.android.gms.ads.internal.BinderC0692ac;
import com.google.android.gms.common.util.C1310n;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class clf {
    /* JADX INFO: renamed from: a */
    public static InterfaceC1616ho m11081a(Context context, AbstractBinderC0689a abstractBinderC0689a, C1542ev c1542ev, afk afkVar, InterfaceC1758mv interfaceC1758mv, cii ciiVar, clg clgVar, cba cbaVar) {
        InterfaceC1616ho clnVar;
        C2087z c2087z = c1542ev.f10561b;
        if (c2087z.f12615g) {
            clnVar = new cll(context, c1542ev, ciiVar, clgVar, cbaVar, interfaceC1758mv);
        } else if (c2087z.f12627s || (abstractBinderC0689a instanceof BinderC0692ac)) {
            clnVar = (c2087z.f12627s && (abstractBinderC0689a instanceof BinderC0692ac)) ? new cln(context, (BinderC0692ac) abstractBinderC0689a, c1542ev, afkVar, clgVar, cbaVar) : new cli(c1542ev, clgVar);
        } else {
            clnVar = (((Boolean) bxm.m10409f().m10546a(can.f9455ab)).booleanValue() && C1310n.m7282e() && !C1310n.m7284g() && interfaceC1758mv != null && interfaceC1758mv.mo11831u().m11930d()) ? new clk(context, c1542ev, interfaceC1758mv, clgVar) : new clh(context, c1542ev, interfaceC1758mv, clgVar);
        }
        String strValueOf = String.valueOf(clnVar.getClass().getName());
        C1560fm.m11610b(strValueOf.length() != 0 ? "AdRenderer: ".concat(strValueOf) : new String("AdRenderer: "));
        clnVar.mo11076d();
        return clnVar;
    }
}
