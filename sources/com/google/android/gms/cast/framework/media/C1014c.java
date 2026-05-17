package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.C1052h;
import com.google.android.gms.cast.framework.media.InterfaceC1025n;
import com.google.android.gms.common.p052a.C1072a;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.c */
/* JADX INFO: loaded from: classes.dex */
public class C1014c {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1025n f5295a = new a();

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.c$a */
    class a extends InterfaceC1025n.a {
        private a() {
        }

        @Override // com.google.android.gms.cast.framework.media.InterfaceC1025n
        /* JADX INFO: renamed from: a */
        public final int mo6430a() {
            return 11910208;
        }

        @Override // com.google.android.gms.cast.framework.media.InterfaceC1025n
        /* JADX INFO: renamed from: a */
        public final C1072a mo6431a(C1052h c1052h, int i) {
            return C1014c.this.m6428a(c1052h, i);
        }

        @Override // com.google.android.gms.cast.framework.media.InterfaceC1025n
        /* JADX INFO: renamed from: a */
        public final C1072a mo6432a(C1052h c1052h, C1013b c1013b) {
            return C1014c.this.m6429a(c1052h, c1013b);
        }

        @Override // com.google.android.gms.cast.framework.media.InterfaceC1025n
        /* JADX INFO: renamed from: b */
        public final InterfaceC0652a mo6433b() {
            return BinderC0654c.m5329a(C1014c.this);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public C1072a m6428a(C1052h c1052h, int i) {
        if (c1052h == null || !c1052h.m6551e()) {
            return null;
        }
        return c1052h.m6550d().get(0);
    }

    /* JADX INFO: renamed from: a */
    public C1072a m6429a(C1052h c1052h, C1013b c1013b) {
        return m6428a(c1052h, c1013b.m6425a());
    }
}
