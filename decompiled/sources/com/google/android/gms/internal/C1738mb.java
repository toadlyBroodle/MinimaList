package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.mb */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1738mb {

    /* JADX INFO: renamed from: a */
    public final String f11016a;

    /* JADX INFO: renamed from: b */
    private boolean f11017b;

    /* JADX INFO: renamed from: c */
    private int f11018c;

    /* JADX INFO: renamed from: d */
    private int f11019d;

    /* JADX INFO: renamed from: e */
    private int f11020e;

    /* JADX INFO: renamed from: f */
    private int f11021f;

    /* JADX INFO: renamed from: g */
    private boolean f11022g;

    public C1738mb(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException e) {
            }
        } else {
            jSONObject = null;
        }
        jSONObject2 = jSONObject;
        this.f11017b = m11746a(jSONObject2, "aggressive_media_codec_release", can.f9672x);
        this.f11016a = m11748c(jSONObject2, "exo_player_version", can.f9654f);
        this.f11018c = m11747b(jSONObject2, "exo_cache_buffer_size", can.f9660l);
        this.f11019d = m11747b(jSONObject2, "exo_connect_timeout_millis", can.f9655g);
        this.f11020e = m11747b(jSONObject2, "exo_read_timeout_millis", can.f9656h);
        this.f11021f = m11747b(jSONObject2, "load_check_interval_bytes", can.f9657i);
        this.f11022g = m11746a(jSONObject2, "use_cache_data_source", can.f9577cr);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m11746a(JSONObject jSONObject, String str, cac<Boolean> cacVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException e) {
            }
        }
        return ((Boolean) bxm.m10409f().m10546a(cacVar)).booleanValue();
    }

    /* JADX INFO: renamed from: b */
    private static int m11747b(JSONObject jSONObject, String str, cac<Integer> cacVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException e) {
            }
        }
        return ((Integer) bxm.m10409f().m10546a(cacVar)).intValue();
    }

    /* JADX INFO: renamed from: c */
    private static String m11748c(JSONObject jSONObject, String str, cac<String> cacVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getString(str);
            } catch (JSONException e) {
            }
        }
        return (String) bxm.m10409f().m10546a(cacVar);
    }
}
