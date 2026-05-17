package com.google.android.gms.ads.mediation;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.ads.mediation.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0861b {

    /* JADX INFO: renamed from: com.google.android.gms.ads.mediation.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private int f4871a;

        /* JADX INFO: renamed from: a */
        public final Bundle m5840a() {
            Bundle bundle = new Bundle();
            bundle.putInt("capabilities", this.f4871a);
            return bundle;
        }

        /* JADX INFO: renamed from: a */
        public final a m5841a(int i) {
            this.f4871a = 1;
            return this;
        }
    }

    void onDestroy();

    void onPause();

    void onResume();
}
