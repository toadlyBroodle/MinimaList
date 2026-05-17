package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1218ag;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.internal.C1232au;
import com.google.android.gms.common.util.C1313q;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.firebase.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2283e {

    /* JADX INFO: renamed from: a */
    private final String f12966a;

    /* JADX INFO: renamed from: b */
    private final String f12967b;

    /* JADX INFO: renamed from: c */
    private final String f12968c;

    /* JADX INFO: renamed from: d */
    private final String f12969d;

    /* JADX INFO: renamed from: e */
    private final String f12970e;

    /* JADX INFO: renamed from: f */
    private final String f12971f;

    /* JADX INFO: renamed from: g */
    private final String f12972g;

    private C2283e(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C1221aj.m7071a(!C1313q.m7289a(str), "ApplicationId must be set.");
        this.f12967b = str;
        this.f12966a = str2;
        this.f12968c = str3;
        this.f12969d = str4;
        this.f12970e = str5;
        this.f12971f = str6;
        this.f12972g = str7;
    }

    /* JADX INFO: renamed from: a */
    public static C2283e m13022a(Context context) {
        C1232au c1232au = new C1232au(context);
        String strM7088a = c1232au.m7088a("google_app_id");
        if (TextUtils.isEmpty(strM7088a)) {
            return null;
        }
        return new C2283e(strM7088a, c1232au.m7088a("google_api_key"), c1232au.m7088a("firebase_database_url"), c1232au.m7088a("ga_trackingId"), c1232au.m7088a("gcm_defaultSenderId"), c1232au.m7088a("google_storage_bucket"), c1232au.m7088a("project_id"));
    }

    /* JADX INFO: renamed from: a */
    public final String m13023a() {
        return this.f12966a;
    }

    /* JADX INFO: renamed from: b */
    public final String m13024b() {
        return this.f12967b;
    }

    /* JADX INFO: renamed from: c */
    public final String m13025c() {
        return this.f12968c;
    }

    /* JADX INFO: renamed from: d */
    public final String m13026d() {
        return this.f12970e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2283e)) {
            return false;
        }
        C2283e c2283e = (C2283e) obj;
        return C1218ag.m7063a(this.f12967b, c2283e.f12967b) && C1218ag.m7063a(this.f12966a, c2283e.f12966a) && C1218ag.m7063a(this.f12968c, c2283e.f12968c) && C1218ag.m7063a(this.f12969d, c2283e.f12969d) && C1218ag.m7063a(this.f12970e, c2283e.f12970e) && C1218ag.m7063a(this.f12971f, c2283e.f12971f) && C1218ag.m7063a(this.f12972g, c2283e.f12972g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12967b, this.f12966a, this.f12968c, this.f12969d, this.f12970e, this.f12971f, this.f12972g});
    }

    public final String toString() {
        return C1218ag.m7062a(this).m7064a("applicationId", this.f12967b).m7064a("apiKey", this.f12966a).m7064a("databaseUrl", this.f12968c).m7064a("gcmSenderId", this.f12970e).m7064a("storageBucket", this.f12971f).m7064a("projectId", this.f12972g).toString();
    }
}
