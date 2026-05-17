package com.google.android.gms.internal;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class cah extends cac<Float> {
    cah(int i, String str, Float f) {
        super(i, str, f, null);
    }

    @Override // com.google.android.gms.internal.cac
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Float mo10532a(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(m10534a(), m10536b().floatValue()));
    }

    @Override // com.google.android.gms.internal.cac
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Float mo10533a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(m10534a(), m10536b().floatValue()));
    }

    @Override // com.google.android.gms.internal.cac
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo10535a(SharedPreferences.Editor editor, Float f) {
        editor.putFloat(m10534a(), f.floatValue());
    }
}
