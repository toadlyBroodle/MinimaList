package com.google.android.gms.internal;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class cae extends cac<Integer> {
    cae(int i, String str, Integer num) {
        super(i, str, num, null);
    }

    @Override // com.google.android.gms.internal.cac
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Integer mo10532a(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(m10534a(), m10536b().intValue()));
    }

    @Override // com.google.android.gms.internal.cac
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Integer mo10533a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(m10534a(), m10536b().intValue()));
    }

    @Override // com.google.android.gms.internal.cac
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo10535a(SharedPreferences.Editor editor, Integer num) {
        editor.putInt(m10534a(), num.intValue());
    }
}
