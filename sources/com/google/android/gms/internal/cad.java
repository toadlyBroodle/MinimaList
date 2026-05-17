package com.google.android.gms.internal;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class cad extends cac<Boolean> {
    cad(int i, String str, Boolean bool) {
        super(i, str, bool, null);
    }

    @Override // com.google.android.gms.internal.cac
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Boolean mo10532a(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(m10534a(), m10536b().booleanValue()));
    }

    @Override // com.google.android.gms.internal.cac
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Boolean mo10533a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(m10534a(), m10536b().booleanValue()));
    }

    @Override // com.google.android.gms.internal.cac
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo10535a(SharedPreferences.Editor editor, Boolean bool) {
        editor.putBoolean(m10534a(), bool.booleanValue());
    }
}
