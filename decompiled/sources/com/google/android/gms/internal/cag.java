package com.google.android.gms.internal;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class cag extends cac<Long> {
    cag(int i, String str, Long l) {
        super(i, str, l, null);
    }

    @Override // com.google.android.gms.internal.cac
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Long mo10532a(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(m10534a(), m10536b().longValue()));
    }

    @Override // com.google.android.gms.internal.cac
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Long mo10533a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(m10534a(), m10536b().longValue()));
    }

    @Override // com.google.android.gms.internal.cac
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo10535a(SharedPreferences.Editor editor, Long l) {
        editor.putLong(m10534a(), l.longValue());
    }
}
