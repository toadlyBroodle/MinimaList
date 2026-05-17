package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseInstanceIdService extends AbstractServiceC2292d {
    @Override // com.google.firebase.iid.AbstractServiceC2292d
    /* JADX INFO: renamed from: a */
    protected final Intent mo13047a(Intent intent) {
        return C2314z.m13120a().f13057a.poll();
    }

    /* JADX INFO: renamed from: a */
    public void m13048a() {
    }

    @Override // com.google.firebase.iid.AbstractServiceC2292d
    /* JADX INFO: renamed from: b */
    public final void mo13049b(Intent intent) {
        if ("com.google.firebase.iid.TOKEN_REFRESH".equals(intent.getAction())) {
            m13048a();
            return;
        }
        String stringExtra = intent.getStringExtra("CMD");
        if (stringExtra != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(intent.getExtras());
                Log.d("FirebaseInstanceId", new StringBuilder(String.valueOf(stringExtra).length() + 21 + String.valueOf(strValueOf).length()).append("Received command: ").append(stringExtra).append(" - ").append(strValueOf).toString());
            }
            if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                FirebaseInstanceId.m13027a().m13043h();
            } else if ("SYNC".equals(stringExtra)) {
                FirebaseInstanceId.m13027a().m13044i();
            }
        }
    }
}
