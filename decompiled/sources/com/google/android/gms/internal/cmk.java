package com.google.android.gms.internal;

import android.support.v4.p018i.C0219m;
import android.view.View;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cmk implements clx<cbu> {

    /* JADX INFO: renamed from: a */
    private final boolean f10361a;

    public cmk(boolean z) {
        this.f10361a = z;
    }

    /* JADX INFO: renamed from: a */
    private static <K, V> C0219m<K, V> m11131a(C0219m<K, Future<V>> c0219m) {
        C0219m<K, V> c0219m2 = new C0219m<>();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= c0219m.size()) {
                return c0219m2;
            }
            c0219m2.put(c0219m.m1583b(i2), c0219m.m1584c(i2).get());
            i = i2 + 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.clx
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ccb mo11114a(clr clrVar, JSONObject jSONObject) throws ExecutionException, JSONException, InterruptedException {
        View view;
        C0219m c0219m = new C0219m();
        C0219m c0219m2 = new C0219m();
        InterfaceFutureC1689kg<cbn> interfaceFutureC1689kgM11105a = clrVar.m11105a(jSONObject);
        InterfaceFutureC1689kg<InterfaceC1758mv> interfaceFutureC1689kgM11106a = clrVar.m11106a(jSONObject, "video");
        JSONArray jSONArray = jSONObject.getJSONArray("custom_assets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("type");
            if ("string".equals(string)) {
                c0219m2.put(jSONObject2.getString("name"), jSONObject2.getString("string_value"));
            } else if ("image".equals(string)) {
                c0219m.put(jSONObject2.getString("name"), clrVar.m11109a(jSONObject2, "image_value", this.f10361a));
            } else {
                String strValueOf = String.valueOf(string);
                C1560fm.m11615e(strValueOf.length() != 0 ? "Unknown custom asset type: ".concat(strValueOf) : new String("Unknown custom asset type: "));
            }
        }
        InterfaceC1758mv interfaceC1758mvM11095a = clr.m11095a(interfaceFutureC1689kgM11106a);
        String string2 = jSONObject.getString("custom_template_id");
        C0219m c0219mM11131a = m11131a(c0219m);
        cbn cbnVar = interfaceFutureC1689kgM11105a.get();
        BinderC1779np binderC1779npMo11753b = interfaceC1758mvM11095a != 0 ? interfaceC1758mvM11095a.mo11753b() : null;
        if (interfaceC1758mvM11095a == 0) {
            view = null;
        } else {
            if (interfaceC1758mvM11095a == 0) {
                throw null;
            }
            view = (View) interfaceC1758mvM11095a;
        }
        return new cbu(string2, c0219mM11131a, c0219m2, cbnVar, binderC1779npMo11753b, view);
    }
}
