package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.rh */
/* JADX INFO: loaded from: classes.dex */
public final class C1879rh extends bnr implements InterfaceC1878rg {
    C1879rh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.analytics.internal.IAnalyticsService");
    }

    @Override // com.google.android.gms.internal.InterfaceC1878rg
    /* JADX INFO: renamed from: a */
    public final void mo12218a(Map map, long j, String str, List<C1856ql> list) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeMap(map);
        parcelM9733o_.writeLong(j);
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeTypedList(list);
        m9731b(1, parcelM9733o_);
    }
}
