package com.google.android.gms.internal;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class cai extends cac<String> {
    cai(int i, String str, String str2) {
        super(i, str, str2, null);
    }

    @Override // com.google.android.gms.internal.cac
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String mo10532a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(m10534a(), m10536b());
    }

    @Override // com.google.android.gms.internal.cac
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String mo10533a(JSONObject jSONObject) {
        return jSONObject.optString(m10534a(), m10536b());
    }

    @Override // com.google.android.gms.internal.cac
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo10535a(SharedPreferences.Editor editor, String str) {
        editor.putString(m10534a(), str);
    }
}
