package com.google.android.gms.internal;

import com.google.android.gms.ads.p046c.C0677a;
import com.google.android.gms.common.C1205d;
import com.google.android.gms.common.C1206e;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class agh implements agj {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ agg f6714a;

    agh(agg aggVar) {
        this.f6714a = aggVar;
    }

    @Override // com.google.android.gms.internal.agj
    /* JADX INFO: renamed from: a */
    public final C0677a.a mo7851a() {
        try {
            return C0677a.m5396a(this.f6714a.f6709h);
        } catch (C1205d e) {
            agg.m7843a(this.f6714a, false);
            ahs.m7945b("GooglePlayServicesNotAvailableException getting Advertising Id Info", e);
            return null;
        } catch (C1206e e2) {
            ahs.m7945b("GooglePlayServicesRepairableException getting Advertising Id Info", e2);
            return null;
        } catch (IOException e3) {
            ahs.m7945b("IOException getting Ad Id Info", e3);
            return null;
        } catch (IllegalStateException e4) {
            ahs.m7945b("IllegalStateException getting Advertising Id Info", e4);
            return null;
        } catch (Exception e5) {
            ahs.m7945b("Unknown exception. Could not get the Advertising Id Info.", e5);
            return null;
        }
    }
}
