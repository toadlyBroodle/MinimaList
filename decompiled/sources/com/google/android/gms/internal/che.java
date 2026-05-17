package com.google.android.gms.internal;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class che {

    /* JADX INFO: renamed from: b */
    private static final Charset f9991b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static final chd<JSONObject> f9990a = new chg();

    /* JADX INFO: renamed from: c */
    private static chb<InputStream> f9992c = chf.f9993a;

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ InputStream m10856a(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f9991b));
    }
}
