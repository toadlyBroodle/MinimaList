package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.InterfaceC1758mv;
import com.google.android.gms.internal.InterfaceC1764na;
import com.google.android.gms.internal.cbs;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.t */
/* JADX INFO: loaded from: classes.dex */
final class C0850t implements InterfaceC1764na {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ cbs f4851a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f4852b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ InterfaceC1758mv f4853c;

    C0850t(cbs cbsVar, String str, InterfaceC1758mv interfaceC1758mv) {
        this.f4851a = cbsVar;
        this.f4852b = str;
        this.f4853c = interfaceC1758mv;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.InterfaceC1764na
    /* JADX INFO: renamed from: a */
    public final void mo5739a(InterfaceC1758mv interfaceC1758mv, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", this.f4851a.mo10634a());
            jSONObject.put("body", this.f4851a.mo10640e());
            jSONObject.put("call_to_action", this.f4851a.mo10642g());
            jSONObject.put("advertiser", this.f4851a.mo10643h());
            jSONObject.put("logo", C0848r.m5810a(this.f4851a.mo10641f()));
            JSONArray jSONArray = new JSONArray();
            List listMo10612b = this.f4851a.mo10612b();
            if (listMo10612b != null) {
                Iterator it = listMo10612b.iterator();
                while (it.hasNext()) {
                    jSONArray.put(C0848r.m5810a(C0848r.m5814b(it.next())));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", C0848r.m5816b(this.f4851a.mo10646n(), this.f4852b));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "1");
            this.f4853c.mo5728b("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException e) {
            C1560fm.m11613c("Exception occurred when loading assets", e);
        }
    }
}
