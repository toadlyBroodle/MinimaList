package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.C2032wz;
import com.google.android.gms.internal.aym;
import com.google.android.gms.internal.bae;
import com.google.firebase.C2213b;
import com.google.firebase.auth.AbstractC2198l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.firebase.auth.internal.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2191n {

    /* JADX INFO: renamed from: a */
    private Context f12840a;

    /* JADX INFO: renamed from: b */
    private String f12841b;

    /* JADX INFO: renamed from: c */
    private SharedPreferences f12842c;

    /* JADX INFO: renamed from: d */
    private C2032wz f12843d;

    public C2191n(Context context, String str) {
        C1221aj.m7065a(context);
        this.f12841b = C1221aj.m7067a(str);
        this.f12840a = context.getApplicationContext();
        this.f12842c = this.f12840a.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", this.f12841b), 0);
        this.f12843d = new C2032wz("StorageHelpers", new String[0]);
    }

    /* JADX INFO: renamed from: a */
    private final C2184g m12887a(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString("version");
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray = jSONObject.getJSONArray("userInfos");
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(C2182e.m12856a(jSONArray.getString(i)));
            }
            C2184g c2184g = new C2184g(C2213b.m12919a(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                c2184g.mo12867a(bae.m8765b(string));
            }
            ((C2184g) c2184g.mo12865a(z)).m12863a(str);
            return c2184g;
        } catch (aym | ArrayIndexOutOfBoundsException | IllegalArgumentException | JSONException e) {
            this.f12843d.m12549a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private final String m12888c(AbstractC2198l abstractC2198l) {
        JSONObject jSONObject = new JSONObject();
        if (!C2184g.class.isAssignableFrom(abstractC2198l.getClass())) {
            return null;
        }
        C2184g c2184g = (C2184g) abstractC2198l;
        try {
            jSONObject.put("cachedTokenState", c2184g.mo12876h());
            jSONObject.put("applicationName", c2184g.mo12872d().m12936b());
            jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
            if (c2184g.m12878k() != null) {
                JSONArray jSONArray = new JSONArray();
                List<C2182e> listM12878k = c2184g.m12878k();
                for (int i = 0; i < listM12878k.size(); i++) {
                    jSONArray.put(listM12878k.get(i).m12861e());
                }
                jSONObject.put("userInfos", jSONArray);
            }
            jSONObject.put("anonymous", c2184g.mo12870b());
            jSONObject.put("version", "2");
            return jSONObject.toString();
        } catch (Exception e) {
            this.f12843d.m12547a("Failed to turn object into JSON", e, new Object[0]);
            throw new aym(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC2198l m12889a() {
        String string = this.f12842c.getString("com.google.firebase.auth.FIREBASE_USER", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return m12887a(jSONObject);
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12890a(AbstractC2198l abstractC2198l) {
        C1221aj.m7065a(abstractC2198l);
        String strM12888c = m12888c(abstractC2198l);
        if (TextUtils.isEmpty(strM12888c)) {
            return;
        }
        this.f12842c.edit().putString("com.google.firebase.auth.FIREBASE_USER", strM12888c).apply();
    }

    /* JADX INFO: renamed from: a */
    public final void m12891a(AbstractC2198l abstractC2198l, bae baeVar) {
        C1221aj.m7065a(abstractC2198l);
        C1221aj.m7065a(baeVar);
        this.f12842c.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC2198l.mo12866a()), baeVar.m8772f()).apply();
    }

    /* JADX INFO: renamed from: a */
    public final void m12892a(String str) {
        this.f12842c.edit().remove(str).apply();
    }

    /* JADX INFO: renamed from: b */
    public final bae m12893b(AbstractC2198l abstractC2198l) {
        C1221aj.m7065a(abstractC2198l);
        String string = this.f12842c.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC2198l.mo12866a()), null);
        if (string != null) {
            return bae.m8765b(string);
        }
        return null;
    }
}
