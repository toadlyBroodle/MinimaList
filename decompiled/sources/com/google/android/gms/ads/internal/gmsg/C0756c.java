package com.google.android.gms.ads.internal.gmsg;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.ads.internal.C0734br;
import com.google.android.gms.ads.internal.overlay.C0828c;
import com.google.android.gms.ads.internal.overlay.InterfaceC0839n;
import com.google.android.gms.ads.internal.overlay.InterfaceC0842q;
import com.google.android.gms.internal.C1535eo;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.C1670jo;
import com.google.android.gms.internal.InterfaceC1758mv;
import com.google.android.gms.internal.InterfaceC1785nv;
import com.google.android.gms.internal.InterfaceC1786nw;
import com.google.android.gms.internal.InterfaceC1800oj;
import com.google.android.gms.internal.InterfaceC1802ol;
import com.google.android.gms.internal.InterfaceC1804on;
import com.google.android.gms.internal.afk;
import com.google.android.gms.internal.bws;
import com.google.android.gms.internal.cju;
import com.google.android.gms.internal.cnb;
import java.net.URISyntaxException;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.gmsg.c */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0756c<T extends InterfaceC1785nv & InterfaceC1786nw & InterfaceC1800oj & InterfaceC1802ol & InterfaceC1804on> implements InterfaceC0748aa<T> {

    /* JADX INFO: renamed from: a */
    private final Context f4624a;

    /* JADX INFO: renamed from: b */
    private final afk f4625b;

    /* JADX INFO: renamed from: c */
    private C1670jo f4626c;

    /* JADX INFO: renamed from: d */
    private InterfaceC0842q f4627d;

    /* JADX INFO: renamed from: e */
    private bws f4628e;

    /* JADX INFO: renamed from: f */
    private InterfaceC0839n f4629f;

    /* JADX INFO: renamed from: g */
    private InterfaceC0762i f4630g;

    /* JADX INFO: renamed from: h */
    private C0734br f4631h;

    /* JADX INFO: renamed from: i */
    private cju f4632i;

    /* JADX INFO: renamed from: j */
    private InterfaceC1758mv f4633j = null;

    public C0756c(Context context, C1670jo c1670jo, afk afkVar, InterfaceC0842q interfaceC0842q, bws bwsVar, InterfaceC0762i interfaceC0762i, InterfaceC0839n interfaceC0839n, C0734br c0734br, cju cjuVar) {
        this.f4624a = context;
        this.f4626c = c1670jo;
        this.f4625b = afkVar;
        this.f4627d = interfaceC0842q;
        this.f4628e = bwsVar;
        this.f4630g = interfaceC0762i;
        this.f4631h = c0734br;
        this.f4632i = cjuVar;
        this.f4629f = interfaceC0839n;
    }

    /* JADX INFO: renamed from: a */
    private final void m5679a(boolean z) {
        if (this.f4632i != null) {
            this.f4632i.m11041a(z);
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m5680a(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX INFO: renamed from: b */
    private static int m5681b(Map<String, String> map) {
        String str = map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return C0710au.m5571g().mo11472b();
            }
            if ("l".equalsIgnoreCase(str)) {
                return C0710au.m5571g().mo11459a();
            }
            if ("c".equalsIgnoreCase(str)) {
                return C0710au.m5571g().mo11475c();
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final /* synthetic */ void zza(Object obj, Map map) throws URISyntaxException {
        Intent uri;
        String strM11381a;
        Uri uri2;
        Context context;
        afk afkVarMo11835y;
        Object obj2;
        InterfaceC1785nv interfaceC1785nv = (InterfaceC1785nv) obj;
        String strM11251a = C1535eo.m11251a((String) map.get("u"), interfaceC1785nv.getContext());
        String str = (String) map.get("a");
        if (str == null) {
            C1560fm.m11615e("Action missing from an open GMSG.");
            return;
        }
        if (this.f4631h != null && !this.f4631h.m5645b()) {
            this.f4631h.m5644a(strM11251a);
            return;
        }
        if ("expand".equalsIgnoreCase(str)) {
            if (((InterfaceC1786nw) interfaceC1785nv).mo11836z()) {
                C1560fm.m11615e("Cannot expand WebView that is already expanded.");
                return;
            } else {
                m5679a(false);
                ((InterfaceC1800oj) interfaceC1785nv).mo11880a(m5680a((Map<String, String>) map), m5681b(map));
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str)) {
            m5679a(false);
            if (strM11251a != null) {
                ((InterfaceC1800oj) interfaceC1785nv).mo11881a(m5680a((Map<String, String>) map), m5681b(map), strM11251a);
                return;
            } else {
                ((InterfaceC1800oj) interfaceC1785nv).mo11882a(m5680a((Map<String, String>) map), m5681b(map), (String) map.get("html"), (String) map.get("baseurl"));
                return;
            }
        }
        if ("app".equalsIgnoreCase(str) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            m5679a(true);
            interfaceC1785nv.getContext();
            if (TextUtils.isEmpty(strM11251a)) {
                C1560fm.m11615e("Destination url cannot be empty.");
                return;
            }
            Context context2 = interfaceC1785nv.getContext();
            afk afkVarMo11835y2 = ((InterfaceC1802ol) interfaceC1785nv).mo11835y();
            Object obj3 = (InterfaceC1804on) interfaceC1785nv;
            if (obj3 == null) {
                throw null;
            }
            try {
                ((InterfaceC1800oj) interfaceC1785nv).mo11879a(new C0828c(new C0757d(context2, afkVarMo11835y2, (View) obj3).m5686a((Map<String, String>) map)));
                return;
            } catch (ActivityNotFoundException e) {
                C1560fm.m11615e(e.getMessage());
                return;
            }
        }
        m5679a(true);
        String str2 = (String) map.get("intent_url");
        if (TextUtils.isEmpty(str2)) {
            uri = null;
        } else {
            try {
                uri = Intent.parseUri(str2, 0);
            } catch (URISyntaxException e2) {
                String strValueOf = String.valueOf(str2);
                C1560fm.m11611b(strValueOf.length() != 0 ? "Error parsing the url: ".concat(strValueOf) : new String("Error parsing the url: "), e2);
                uri = null;
            }
        }
        if (uri != null && uri.getData() != null) {
            Uri data = uri.getData();
            String string = data.toString();
            if (TextUtils.isEmpty(string)) {
                uri2 = data;
                uri.setData(uri2);
            } else {
                try {
                    C0710au.m5569e();
                    context = interfaceC1785nv.getContext();
                    afkVarMo11835y = ((InterfaceC1802ol) interfaceC1785nv).mo11835y();
                    obj2 = (InterfaceC1804on) interfaceC1785nv;
                } catch (Exception e3) {
                    C1560fm.m11611b("Error occurred while adding signals.", e3);
                    C0710au.m5573i().m11292a(e3, "OpenGmsgHandler.onGmsg");
                    strM11381a = string;
                }
                if (obj2 == null) {
                    throw null;
                }
                strM11381a = C1596gv.m11381a(context, afkVarMo11835y, string, (View) obj2, interfaceC1785nv.mo11755d());
                try {
                    uri2 = Uri.parse(strM11381a);
                } catch (Exception e4) {
                    String strValueOf2 = String.valueOf(strM11381a);
                    C1560fm.m11611b(strValueOf2.length() != 0 ? "Error parsing the uri: ".concat(strValueOf2) : new String("Error parsing the uri: "), e4);
                    C0710au.m5573i().m11292a(e4, "OpenGmsgHandler.onGmsg");
                    uri2 = data;
                }
                uri.setData(uri2);
            }
        }
        if (uri != null) {
            ((InterfaceC1800oj) interfaceC1785nv).mo11879a(new C0828c(uri));
            return;
        }
        if (!TextUtils.isEmpty(strM11251a)) {
            C0710au.m5569e();
            Context context3 = interfaceC1785nv.getContext();
            afk afkVarMo11835y3 = ((InterfaceC1802ol) interfaceC1785nv).mo11835y();
            Object obj4 = (InterfaceC1804on) interfaceC1785nv;
            if (obj4 == null) {
                throw null;
            }
            strM11251a = C1596gv.m11381a(context3, afkVarMo11835y3, strM11251a, (View) obj4, interfaceC1785nv.mo11755d());
        }
        ((InterfaceC1800oj) interfaceC1785nv).mo11879a(new C0828c((String) map.get("i"), strM11251a, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
    }
}
