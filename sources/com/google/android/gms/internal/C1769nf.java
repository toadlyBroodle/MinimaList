package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.ads.internal.C0733bq;
import com.google.android.gms.ads.internal.InterfaceC0703an;

/* JADX INFO: renamed from: com.google.android.gms.internal.nf */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1769nf {
    /* JADX INFO: renamed from: a */
    public static InterfaceFutureC1689kg<InterfaceC1758mv> m11877a(final Context context, final C1670jo c1670jo, final String str, final afk afkVar, final C0733bq c0733bq) {
        return C1678jw.m11620a(C1678jw.m11618a(null), new InterfaceC1673jr(context, afkVar, c1670jo, c0733bq, str) { // from class: com.google.android.gms.internal.ng

            /* JADX INFO: renamed from: a */
            private final Context f11118a;

            /* JADX INFO: renamed from: b */
            private final afk f11119b;

            /* JADX INFO: renamed from: c */
            private final C1670jo f11120c;

            /* JADX INFO: renamed from: d */
            private final C0733bq f11121d;

            /* JADX INFO: renamed from: e */
            private final String f11122e;

            {
                this.f11118a = context;
                this.f11119b = afkVar;
                this.f11120c = c1670jo;
                this.f11121d = c0733bq;
                this.f11122e = str;
            }

            @Override // com.google.android.gms.internal.InterfaceC1673jr
            /* JADX INFO: renamed from: a */
            public final InterfaceFutureC1689kg mo5652a(Object obj) {
                Context context2 = this.f11118a;
                afk afkVar2 = this.f11119b;
                C1670jo c1670jo2 = this.f11120c;
                C0733bq c0733bq2 = this.f11121d;
                String str2 = this.f11122e;
                InterfaceC1758mv interfaceC1758mvM11878a = C0710au.m5570f().m11878a(context2, C1807oq.m11925a(), "", false, false, afkVar2, c1670jo2, null, null, c0733bq2, bwf.m10352a());
                final C1699kq c1699kqM11653a = C1699kq.m11653a(interfaceC1758mvM11878a);
                interfaceC1758mvM11878a.mo11833w().m11853a(new InterfaceC1764na(c1699kqM11653a) { // from class: com.google.android.gms.internal.nh

                    /* JADX INFO: renamed from: a */
                    private final C1699kq f11123a;

                    {
                        this.f11123a = c1699kqM11653a;
                    }

                    @Override // com.google.android.gms.internal.InterfaceC1764na
                    /* JADX INFO: renamed from: a */
                    public final void mo5739a(InterfaceC1758mv interfaceC1758mv, boolean z) {
                        this.f11123a.m11654a();
                    }
                });
                interfaceC1758mvM11878a.loadUrl(str2);
                return c1699kqM11653a;
            }
        }, C1695km.f10893a);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC1758mv m11878a(Context context, C1807oq c1807oq, String str, boolean z, boolean z2, afk afkVar, C1670jo c1670jo, cba cbaVar, InterfaceC0703an interfaceC0703an, C0733bq c0733bq, bwf bwfVar) {
        try {
            return (InterfaceC1758mv) C1649iu.m11544b(context, new CallableC1772ni(this, context, c1807oq, str, z, z2, afkVar, c1670jo, cbaVar, interfaceC0703an, c0733bq, bwfVar));
        } catch (Throwable th) {
            throw new C1773nj(this, "Webview initialization failed.", th);
        }
    }
}
