package com.google.android.gms.internal;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.C0651a;
import com.google.android.gms.ads.internal.C0710au;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cmi implements clx<cbq> {

    /* JADX INFO: renamed from: a */
    private final boolean f10355a;

    /* JADX INFO: renamed from: b */
    private final boolean f10356b;

    /* JADX INFO: renamed from: c */
    private final boolean f10357c;

    public cmi(boolean z, boolean z2, boolean z3) {
        this.f10355a = z;
        this.f10356b = z2;
        this.f10357c = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fb  */
    @Override // com.google.android.gms.internal.clx
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ ccb mo11114a(clr clrVar, JSONObject jSONObject) throws ExecutionException, JSONException, InterruptedException {
        String string;
        View view;
        List<InterfaceFutureC1689kg<cbp>> listM11108a = clrVar.m11108a(jSONObject, "images", false, this.f10355a, this.f10356b);
        InterfaceFutureC1689kg<cbp> interfaceFutureC1689kgM11107a = clrVar.m11107a(jSONObject, "app_icon", true, this.f10355a);
        InterfaceFutureC1689kg<InterfaceC1758mv> interfaceFutureC1689kgM11106a = clrVar.m11106a(jSONObject, "video");
        InterfaceFutureC1689kg<cbn> interfaceFutureC1689kgM11105a = clrVar.m11105a(jSONObject);
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceFutureC1689kg<cbp>> it = listM11108a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().get());
        }
        InterfaceC1758mv interfaceC1758mvM11095a = clr.m11095a(interfaceFutureC1689kgM11106a);
        String string2 = jSONObject.getString("headline");
        if (this.f10357c) {
            if (((Boolean) bxm.m10409f().m10546a(can.f9550cQ)).booleanValue()) {
                Resources resourcesM11320v = C0710au.m5573i().m11320v();
                string = resourcesM11320v != null ? resourcesM11320v.getString(C0651a.d.f4334s7) : "Test Ad";
                if (string2 != null) {
                    string = new StringBuilder(String.valueOf(string).length() + 3 + String.valueOf(string2).length()).append(string).append(" : ").append(string2).toString();
                }
            } else {
                string = string2;
            }
        }
        String string3 = jSONObject.getString("body");
        cbp cbpVar = interfaceFutureC1689kgM11107a.get();
        String string4 = jSONObject.getString("call_to_action");
        double dOptDouble = jSONObject.optDouble("rating", -1.0d);
        String strOptString = jSONObject.optString("store");
        String strOptString2 = jSONObject.optString("price");
        cbn cbnVar = interfaceFutureC1689kgM11105a.get();
        Bundle bundle = new Bundle();
        BinderC1779np binderC1779npMo11753b = interfaceC1758mvM11095a != 0 ? interfaceC1758mvM11095a.mo11753b() : null;
        if (interfaceC1758mvM11095a == 0) {
            view = null;
        } else {
            if (interfaceC1758mvM11095a == 0) {
                throw null;
            }
            view = (View) interfaceC1758mvM11095a;
        }
        return new cbq(string, arrayList, string3, cbpVar, string4, dOptDouble, strOptString, strOptString2, cbnVar, bundle, binderC1779npMo11753b, view, null, null);
    }
}
