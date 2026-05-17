package com.google.firebase.database;

import com.google.android.gms.internal.bln;

/* JADX INFO: renamed from: com.google.firebase.database.m */
/* JADX INFO: loaded from: classes.dex */
public class C2275m {

    /* JADX INFO: renamed from: com.google.firebase.database.m$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        b m13015a(C2271i c2271i);

        /* JADX INFO: renamed from: a */
        void m13016a(C2226b c2226b, boolean z, C2225a c2225a);
    }

    /* JADX INFO: renamed from: com.google.firebase.database.m$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private boolean f12955a;

        /* JADX INFO: renamed from: b */
        private bln f12956b;

        private b(boolean z, bln blnVar) {
            this.f12955a = z;
            this.f12956b = blnVar;
        }

        /* JADX INFO: renamed from: a */
        public boolean m13017a() {
            return this.f12955a;
        }

        /* JADX INFO: renamed from: b */
        public final bln m13018b() {
            return this.f12956b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static b m13014a() {
        return new b(false, null);
    }
}
