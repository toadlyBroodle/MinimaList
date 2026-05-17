package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cka {

    /* JADX INFO: renamed from: a */
    private final boolean f10223a;

    /* JADX INFO: renamed from: b */
    private final boolean f10224b;

    /* JADX INFO: renamed from: c */
    private final boolean f10225c;

    /* JADX INFO: renamed from: d */
    private final boolean f10226d;

    /* JADX INFO: renamed from: e */
    private final boolean f10227e;

    private cka(ckc ckcVar) {
        this.f10223a = ckcVar.f10228a;
        this.f10224b = ckcVar.f10229b;
        this.f10225c = ckcVar.f10230c;
        this.f10226d = ckcVar.f10231d;
        this.f10227e = ckcVar.f10232e;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m11046a() {
        try {
            return new JSONObject().put("sms", this.f10223a).put("tel", this.f10224b).put("calendar", this.f10225c).put("storePicture", this.f10226d).put("inlineVideo", this.f10227e);
        } catch (JSONException e) {
            C1560fm.m11611b("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}
