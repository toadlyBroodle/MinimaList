package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.C1134bv;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.common.api.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1081h {

    /* JADX INFO: renamed from: com.google.android.gms.common.api.h$a */
    static final class a<R extends InterfaceC1193k> extends BasePendingResult<R> {

        /* JADX INFO: renamed from: a */
        private final R f5501a;

        public a(AbstractC1079f abstractC1079f, R r) {
            super(abstractC1079f);
            this.f5501a = r;
        }

        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        /* JADX INFO: renamed from: a */
        protected final R mo6177a(Status status) {
            return this.f5501a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1080g<Status> m6700a(Status status, AbstractC1079f abstractC1079f) {
        C1221aj.m7066a(status, "Result must not be null");
        C1134bv c1134bv = new C1134bv(abstractC1079f);
        c1134bv.m6708a(status);
        return c1134bv;
    }

    /* JADX INFO: renamed from: a */
    public static <R extends InterfaceC1193k> AbstractC1080g<R> m6701a(R r, AbstractC1079f abstractC1079f) {
        C1221aj.m7066a(r, "Result must not be null");
        C1221aj.m7075b(!r.mo6094a().m6626d(), "Status code must not be SUCCESS");
        a aVar = new a(abstractC1079f, r);
        aVar.m6708a(r);
        return aVar;
    }
}
