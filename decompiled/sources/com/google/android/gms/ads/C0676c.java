package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.InterfaceC0861b;
import com.google.android.gms.internal.bzf;
import com.google.android.gms.internal.bzg;
import java.util.Date;

/* JADX INFO: renamed from: com.google.android.gms.ads.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0676c {

    /* JADX INFO: renamed from: a */
    private final bzf f4362a;

    /* JADX INFO: renamed from: com.google.android.gms.ads.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final bzg f4363a = new bzg();

        public a() {
            this.f4363a.m10476b("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        /* JADX INFO: renamed from: a */
        public final a m5387a(int i) {
            this.f4363a.m10470a(i);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m5388a(Location location) {
            this.f4363a.m10471a(location);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m5389a(Class<? extends InterfaceC0861b> cls, Bundle bundle) {
            this.f4363a.m10472a(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.f4363a.m10478c("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m5390a(String str) {
            this.f4363a.m10473a(str);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m5391a(Date date) {
            this.f4363a.m10474a(date);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m5392a(boolean z) {
            this.f4363a.m10475a(z);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C0676c m5393a() {
            return new C0676c(this);
        }

        /* JADX INFO: renamed from: b */
        public final a m5394b(String str) {
            this.f4363a.m10476b(str);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final a m5395b(boolean z) {
            this.f4363a.m10477b(z);
            return this;
        }
    }

    private C0676c(a aVar) {
        this.f4362a = new bzf(aVar.f4363a);
    }

    /* JADX INFO: renamed from: a */
    public final bzf m5385a() {
        return this.f4362a;
    }
}
