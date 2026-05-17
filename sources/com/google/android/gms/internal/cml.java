package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.BinderC0692ac;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.ads.internal.C0734br;
import com.google.android.gms.ads.internal.gmsg.C0754ag;
import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import com.google.android.gms.ads.internal.p048js.C0820z;
import com.google.android.gms.ads.internal.p048js.JavascriptEngineFactory;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cml extends clp<cml> {

    /* JADX INFO: renamed from: c */
    private static final long f10362c = TimeUnit.SECONDS.toMillis(60);

    /* JADX INFO: renamed from: d */
    private static final Object f10363d = new Object();

    /* JADX INFO: renamed from: e */
    private static boolean f10364e = false;

    /* JADX INFO: renamed from: f */
    private static C0820z f10365f = null;

    /* JADX INFO: renamed from: a */
    private JavascriptEngineFactory f10366a;

    /* JADX INFO: renamed from: b */
    private InterfaceFutureC1689kg<InterfaceC1758mv> f10367b;

    /* JADX INFO: renamed from: g */
    private final C0754ag f10368g;

    /* JADX INFO: renamed from: h */
    private final cce f10369h;

    /* JADX INFO: renamed from: i */
    private final Context f10370i;

    /* JADX INFO: renamed from: j */
    private final C1670jo f10371j;

    /* JADX INFO: renamed from: k */
    private final BinderC0692ac f10372k;

    /* JADX INFO: renamed from: l */
    private final afk f10373l;

    /* JADX INFO: renamed from: m */
    private final Object f10374m = new Object();

    /* JADX INFO: renamed from: n */
    private String f10375n;

    public cml(Context context, BinderC0692ac binderC0692ac, String str, afk afkVar, C1670jo c1670jo) {
        C1560fm.m11614d("Webview loading for native ads.");
        this.f10370i = context;
        this.f10372k = binderC0692ac;
        this.f10373l = afkVar;
        this.f10371j = c1670jo;
        this.f10375n = str;
        this.f10366a = new JavascriptEngineFactory();
        C0710au.m5570f();
        InterfaceFutureC1689kg<InterfaceC1758mv> interfaceFutureC1689kgM11877a = C1769nf.m11877a(this.f10370i, this.f10371j, (String) bxm.m10409f().m10546a(can.f9491bK), this.f10373l, this.f10372k.m5478h());
        this.f10368g = new C0754ag(this.f10370i);
        this.f10369h = new cce(binderC0692ac, str);
        this.f10367b = C1678jw.m11620a(interfaceFutureC1689kgM11877a, new InterfaceC1673jr(this) { // from class: com.google.android.gms.internal.cmm

            /* JADX INFO: renamed from: a */
            private final cml f10376a;

            {
                this.f10376a = this;
            }

            @Override // com.google.android.gms.internal.InterfaceC1673jr
            /* JADX INFO: renamed from: a */
            public final InterfaceFutureC1689kg mo5652a(Object obj) {
                return this.f10376a.m11132a((InterfaceC1758mv) obj);
            }
        }, C1695km.f10894b);
        C1676ju.m11617a(this.f10367b, "WebViewNativeAdsUtil.constructor");
    }

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceFutureC1689kg m11132a(InterfaceC1758mv interfaceC1758mv) {
        C1560fm.m11614d("Javascript has loaded for native ads.");
        interfaceC1758mv.mo11833w().m11852a(this.f10372k, this.f10372k, this.f10372k, this.f10372k, false, null, new C0734br(this.f10370i, null, null), null, null);
        interfaceC1758mv.mo11833w().m11857a("/logScionEvent", this.f10368g);
        interfaceC1758mv.mo11833w().m11857a("/logScionEvent", this.f10369h);
        return C1678jw.m11618a(interfaceC1758mv);
    }

    @Override // com.google.android.gms.internal.cmh
    /* JADX INFO: renamed from: a */
    public final InterfaceFutureC1689kg<JSONObject> mo11126a(final JSONObject jSONObject) {
        return C1678jw.m11620a(this.f10367b, new InterfaceC1673jr(this, jSONObject) { // from class: com.google.android.gms.internal.cmn

            /* JADX INFO: renamed from: a */
            private final cml f10377a;

            /* JADX INFO: renamed from: b */
            private final JSONObject f10378b;

            {
                this.f10377a = this;
                this.f10378b = jSONObject;
            }

            @Override // com.google.android.gms.internal.InterfaceC1673jr
            /* JADX INFO: renamed from: a */
            public final InterfaceFutureC1689kg mo5652a(Object obj) {
                return this.f10377a.m11136c(this.f10378b, (InterfaceC1758mv) obj);
            }
        }, C1695km.f10893a);
    }

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceFutureC1689kg m11133a(JSONObject jSONObject, InterfaceC1758mv interfaceC1758mv) throws JSONException {
        jSONObject.put("ads_id", this.f10375n);
        interfaceC1758mv.mo5728b("google.afma.nativeAds.handleImpressionPing", jSONObject);
        return C1678jw.m11618a(new JSONObject());
    }

    @Override // com.google.android.gms.internal.cmh
    /* JADX INFO: renamed from: a */
    public final void mo11127a() {
        C1678jw.m11625a(this.f10367b, new cmu(this), C1695km.f10893a);
    }

    /* JADX INFO: renamed from: a */
    final /* synthetic */ void m11134a(InterfaceC1758mv interfaceC1758mv, clq clqVar, C1700kr c1700kr, InterfaceC1758mv interfaceC1758mv2, Map map) {
        JSONObject jSONObject;
        boolean z;
        try {
            String str = (String) map.get("success");
            String str2 = (String) map.get("failure");
            if (TextUtils.isEmpty(str2)) {
                jSONObject = new JSONObject(str);
                z = true;
            } else {
                z = false;
                jSONObject = new JSONObject(str2);
            }
            if (this.f10375n.equals(jSONObject.optString("ads_id", ""))) {
                interfaceC1758mv.mo11819b("/nativeAdPreProcess", clqVar.f10295a);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("success", z);
                jSONObject2.put("json", jSONObject);
                c1700kr.m11657b(jSONObject2);
            }
        } catch (Throwable th) {
            C1560fm.m11611b("Error while preprocessing json.", th);
            c1700kr.m11656a(th);
        }
    }

    @Override // com.google.android.gms.internal.clp, com.google.android.gms.internal.cmh
    /* JADX INFO: renamed from: a */
    public final void mo11089a(String str, InterfaceC0748aa interfaceC0748aa) {
        C1678jw.m11625a(this.f10367b, new cmr(this, str, interfaceC0748aa), C1695km.f10893a);
    }

    @Override // com.google.android.gms.internal.cmh
    /* JADX INFO: renamed from: a */
    public final void mo11128a(String str, JSONObject jSONObject) {
        C1678jw.m11625a(this.f10367b, new cmt(this, str, jSONObject), C1695km.f10893a);
    }

    @Override // com.google.android.gms.internal.cmh
    /* JADX INFO: renamed from: b */
    public final InterfaceFutureC1689kg<JSONObject> mo11129b(final JSONObject jSONObject) {
        return C1678jw.m11620a(this.f10367b, new InterfaceC1673jr(this, jSONObject) { // from class: com.google.android.gms.internal.cmo

            /* JADX INFO: renamed from: a */
            private final cml f10379a;

            /* JADX INFO: renamed from: b */
            private final JSONObject f10380b;

            {
                this.f10379a = this;
                this.f10380b = jSONObject;
            }

            @Override // com.google.android.gms.internal.InterfaceC1673jr
            /* JADX INFO: renamed from: a */
            public final InterfaceFutureC1689kg mo5652a(Object obj) {
                return this.f10379a.m11135b(this.f10380b, (InterfaceC1758mv) obj);
            }
        }, C1695km.f10893a);
    }

    /* JADX INFO: renamed from: b */
    final /* synthetic */ InterfaceFutureC1689kg m11135b(JSONObject jSONObject, InterfaceC1758mv interfaceC1758mv) throws JSONException {
        jSONObject.put("ads_id", this.f10375n);
        interfaceC1758mv.mo5728b("google.afma.nativeAds.handleClickGmsg", jSONObject);
        return C1678jw.m11618a(new JSONObject());
    }

    @Override // com.google.android.gms.internal.clp, com.google.android.gms.internal.cmh
    /* JADX INFO: renamed from: b */
    public final void mo11090b(String str, InterfaceC0748aa interfaceC0748aa) {
        C1678jw.m11625a(this.f10367b, new cms(this, str, interfaceC0748aa), C1695km.f10893a);
    }

    @Override // com.google.android.gms.internal.cmh
    /* JADX INFO: renamed from: c */
    public final InterfaceFutureC1689kg<JSONObject> mo11130c(final JSONObject jSONObject) {
        return C1678jw.m11620a(this.f10367b, new InterfaceC1673jr(this, jSONObject) { // from class: com.google.android.gms.internal.cmp

            /* JADX INFO: renamed from: a */
            private final cml f10381a;

            /* JADX INFO: renamed from: b */
            private final JSONObject f10382b;

            {
                this.f10381a = this;
                this.f10382b = jSONObject;
            }

            @Override // com.google.android.gms.internal.InterfaceC1673jr
            /* JADX INFO: renamed from: a */
            public final InterfaceFutureC1689kg mo5652a(Object obj) {
                return this.f10381a.m11133a(this.f10382b, (InterfaceC1758mv) obj);
            }
        }, C1695km.f10893a);
    }

    /* JADX INFO: renamed from: c */
    final /* synthetic */ InterfaceFutureC1689kg m11136c(JSONObject jSONObject, final InterfaceC1758mv interfaceC1758mv) throws JSONException {
        jSONObject.put("ads_id", this.f10375n);
        final C1700kr c1700kr = new C1700kr();
        final clq clqVar = new clq();
        InterfaceC0748aa<? super InterfaceC1758mv> interfaceC0748aa = new InterfaceC0748aa(this, interfaceC1758mv, clqVar, c1700kr) { // from class: com.google.android.gms.internal.cmq

            /* JADX INFO: renamed from: a */
            private final cml f10383a;

            /* JADX INFO: renamed from: b */
            private final InterfaceC1758mv f10384b;

            /* JADX INFO: renamed from: c */
            private final clq f10385c;

            /* JADX INFO: renamed from: d */
            private final C1700kr f10386d;

            {
                this.f10383a = this;
                this.f10384b = interfaceC1758mv;
                this.f10385c = clqVar;
                this.f10386d = c1700kr;
            }

            @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
            public final void zza(Object obj, Map map) {
                this.f10383a.m11134a(this.f10384b, this.f10385c, this.f10386d, (InterfaceC1758mv) obj, map);
            }
        };
        clqVar.f10295a = interfaceC0748aa;
        interfaceC1758mv.mo11815a("/nativeAdPreProcess", interfaceC0748aa);
        interfaceC1758mv.mo5728b("google.afma.nativeAds.preProcessJsonGmsg", jSONObject);
        return c1700kr;
    }
}
