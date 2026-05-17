package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.C0651a;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.au */
/* JADX INFO: loaded from: classes.dex */
public final class C1232au {

    /* JADX INFO: renamed from: a */
    private final Resources f5859a;

    /* JADX INFO: renamed from: b */
    private final String f5860b;

    public C1232au(Context context) {
        C1221aj.m7065a(context);
        this.f5859a = context.getResources();
        this.f5860b = this.f5859a.getResourcePackageName(C0651a.d.common_google_play_services_unknown_issue);
    }

    /* JADX INFO: renamed from: a */
    public final String m7088a(String str) {
        int identifier = this.f5859a.getIdentifier(str, "string", this.f5860b);
        if (identifier == 0) {
            return null;
        }
        return this.f5859a.getString(identifier);
    }
}
