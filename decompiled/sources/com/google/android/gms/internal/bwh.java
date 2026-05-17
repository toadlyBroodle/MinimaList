package com.google.android.gms.internal;

import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class bwh {

    /* JADX INFO: renamed from: com.google.android.gms.internal.bwh$a */
    public static final class C1461a extends boz<C1461a, a> implements bqc {

        /* JADX INFO: renamed from: d */
        private static final C1461a f9156d;

        /* JADX INFO: renamed from: e */
        private static volatile bqg<C1461a> f9157e;

        /* JADX INFO: renamed from: com.google.android.gms.internal.bwh$a$a */
        public static final class a extends boz.AbstractC1441a<C1461a, a> implements bqc {
            private a() {
                super(C1461a.f9156d);
            }

            /* synthetic */ a(bwi bwiVar) {
                this();
            }
        }

        /* JADX INFO: renamed from: com.google.android.gms.internal.bwh$a$b */
        public enum b implements bpc {
            UNKNOWN_EVENT_TYPE(0),
            AD_REQUEST(1),
            AD_LOADED(2),
            AD_FAILED_TO_LOAD(3),
            AD_FAILED_TO_LOAD_NO_FILL(4),
            AD_IMPRESSION(5),
            AD_FIRST_CLICK(6),
            AD_SUBSEQUENT_CLICK(7),
            REQUEST_WILL_START(8),
            REQUEST_DID_END(9),
            REQUEST_WILL_UPDATE_SIGNALS(10),
            REQUEST_DID_UPDATE_SIGNALS(11),
            REQUEST_WILL_BUILD_URL(12),
            REQUEST_DID_BUILD_URL(13),
            REQUEST_WILL_MAKE_NETWORK_REQUEST(14),
            REQUEST_DID_RECEIVE_NETWORK_RESPONSE(15),
            REQUEST_WILL_PROCESS_RESPONSE(16),
            REQUEST_DID_PROCESS_RESPONSE(17),
            REQUEST_WILL_RENDER(18),
            REQUEST_DID_RENDER(19),
            REQUEST_WILL_UPDATE_GMS_SIGNALS(1000),
            REQUEST_DID_UPDATE_GMS_SIGNALS(1001),
            REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS(1002),
            REQUEST_FAILED_TO_BUILD_URL(1003),
            REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST(1004),
            REQUEST_FAILED_TO_PROCESS_RESPONSE(1005);


            /* JADX INFO: renamed from: A */
            private static final bpd<b> f9158A = new bwj();

            /* JADX INFO: renamed from: B */
            private final int f9186B;

            b(int i) {
                this.f9186B = i;
            }

            @Override // com.google.android.gms.internal.bpc
            /* JADX INFO: renamed from: a */
            public final int mo8430a() {
                return this.f9186B;
            }
        }

        static {
            C1461a c1461a = new C1461a();
            f9156d = c1461a;
            c1461a.mo8340a(boz.C1447g.f8576f, (Object) null, (Object) null);
            c1461a.f8560b.m10032c();
        }

        private C1461a() {
        }

        @Override // com.google.android.gms.internal.boz
        /* JADX INFO: renamed from: a */
        protected final Object mo8340a(int i, Object obj, Object obj2) {
            bwi bwiVar = null;
            switch (bwi.f9187a[i - 1]) {
                case 1:
                    return new C1461a();
                case 2:
                    return f9156d;
                case 3:
                    return null;
                case 4:
                    return new a(bwiVar);
                case 5:
                    return this;
                case 6:
                    bok bokVar = (bok) obj;
                    if (((bor) obj2) == null) {
                        throw new NullPointerException();
                    }
                    boolean z = false;
                    while (!z) {
                        try {
                            int iMo9781a = bokVar.mo9781a();
                            switch (iMo9781a) {
                                case 0:
                                    z = true;
                                    break;
                                default:
                                    if (!m9905a(iMo9781a, bokVar)) {
                                        z = true;
                                    }
                                    break;
                            }
                        } catch (bpf e) {
                            throw new RuntimeException(e.m9943a(this));
                        } catch (IOException e2) {
                            throw new RuntimeException(new bpf(e2.getMessage()).m9943a(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f9157e == null) {
                        synchronized (C1461a.class) {
                            if (f9157e == null) {
                                f9157e = new boz.C1442b(f9156d);
                            }
                            break;
                        }
                    }
                    return f9157e;
                case 9:
                    return (byte) 1;
                case 10:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
            return f9156d;
        }

        @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
        /* JADX INFO: renamed from: a */
        public final void mo8341a(bon bonVar) {
            this.f8560b.m10028a(bonVar);
        }

        @Override // com.google.android.gms.internal.boz, com.google.android.gms.internal.bqa
        /* JADX INFO: renamed from: d */
        public final int mo8344d() {
            int i = this.f8561c;
            if (i != -1) {
                return i;
            }
            int iM10034e = this.f8560b.m10034e() + 0;
            this.f8561c = iM10034e;
            return iM10034e;
        }
    }
}
