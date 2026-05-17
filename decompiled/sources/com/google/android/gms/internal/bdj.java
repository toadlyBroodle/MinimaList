package com.google.android.gms.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class bdj implements bdo {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ boolean f7860a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bdf f7861b;

    bdj(bdf bdfVar, boolean z) {
        this.f7861b = bdfVar;
        this.f7860a = z;
    }

    @Override // com.google.android.gms.internal.bdo
    /* JADX INFO: renamed from: a */
    public final void mo9024a(Map<String, Object> map) {
        this.f7861b.f7837i = bdp.Connected;
        String str = (String) map.get("s");
        if (str.equals("ok")) {
            bdf.m8981a(this.f7861b, 0);
            this.f7861b.f7830b.mo8979a(true);
            if (this.f7860a) {
                this.f7861b.m9013j();
                return;
            }
            return;
        }
        bdf.m8986a(this.f7861b, (String) null);
        bdf.m8998a(this.f7861b, true);
        this.f7861b.f7830b.mo8979a(false);
        String str2 = (String) map.get("d");
        this.f7861b.f7849u.m9540a(new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(str2).length()).append("Authentication failed: ").append(str).append(" (").append(str2).append(")").toString(), null, new Object[0]);
        this.f7861b.f7836h.m8933b();
        if (str.equals("invalid_token")) {
            bdf.m9012j(this.f7861b);
            if (this.f7861b.f7853y >= 3) {
                this.f7861b.f7850v.m9078b();
                this.f7861b.f7849u.m9542b("Provided authentication credentials are invalid. This usually indicates your FirebaseApp instance was not initialized correctly. Make sure your google-services.json file has the correct firebase_url and api_key. You can re-download google-services.json from https://console.firebase.google.com/.", null);
            }
        }
    }
}
