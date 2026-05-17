package com.google.android.gms.ads.p045b;

import com.google.android.gms.ads.C0857j;
import com.google.android.gms.internal.cnb;

/* JADX INFO: renamed from: com.google.android.gms.ads.b.d */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0667d {

    /* JADX INFO: renamed from: a */
    private final boolean f4345a;

    /* JADX INFO: renamed from: b */
    private final int f4346b;

    /* JADX INFO: renamed from: c */
    private final boolean f4347c;

    /* JADX INFO: renamed from: d */
    private final int f4348d;

    /* JADX INFO: renamed from: e */
    private final C0857j f4349e;

    /* JADX INFO: renamed from: com.google.android.gms.ads.b.d$a */
    public static final class a {

        /* JADX INFO: renamed from: d */
        private C0857j f4353d;

        /* JADX INFO: renamed from: a */
        private boolean f4350a = false;

        /* JADX INFO: renamed from: b */
        private int f4351b = -1;

        /* JADX INFO: renamed from: c */
        private boolean f4352c = false;

        /* JADX INFO: renamed from: e */
        private int f4354e = 1;

        /* JADX INFO: renamed from: a */
        public final a m5357a(int i) {
            this.f4351b = i;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m5358a(C0857j c0857j) {
            this.f4353d = c0857j;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m5359a(boolean z) {
            this.f4350a = z;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C0667d m5360a() {
            return new C0667d(this);
        }

        /* JADX INFO: renamed from: b */
        public final a m5361b(int i) {
            this.f4354e = i;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final a m5362b(boolean z) {
            this.f4352c = z;
            return this;
        }
    }

    private C0667d(a aVar) {
        this.f4345a = aVar.f4350a;
        this.f4346b = aVar.f4351b;
        this.f4347c = aVar.f4352c;
        this.f4348d = aVar.f4354e;
        this.f4349e = aVar.f4353d;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5347a() {
        return this.f4345a;
    }

    /* JADX INFO: renamed from: b */
    public final int m5348b() {
        return this.f4346b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m5349c() {
        return this.f4347c;
    }

    /* JADX INFO: renamed from: d */
    public final int m5350d() {
        return this.f4348d;
    }

    /* JADX INFO: renamed from: e */
    public final C0857j m5351e() {
        return this.f4349e;
    }
}
