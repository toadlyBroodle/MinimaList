package com.google.ads;

/* JADX INFO: renamed from: com.google.ads.a */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C0631a {

    /* JADX INFO: renamed from: com.google.ads.a$a */
    public enum a {
        INVALID_REQUEST("Invalid Ad request."),
        NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
        NETWORK_ERROR("A network error occurred."),
        INTERNAL_ERROR("There was an internal error.");


        /* JADX INFO: renamed from: e */
        private final String f4290e;

        a(String str) {
            this.f4290e = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.f4290e;
        }
    }

    /* JADX INFO: renamed from: com.google.ads.a$b */
    public enum b {
        UNKNOWN,
        MALE,
        FEMALE
    }
}
