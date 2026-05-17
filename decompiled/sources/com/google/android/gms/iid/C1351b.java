package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import com.google.android.gms.internal.bnr;
import com.google.android.gms.internal.bnt;

/* JADX INFO: renamed from: com.google.android.gms.iid.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1351b extends bnr implements InterfaceC1350a {
    C1351b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.iid.IMessengerCompat");
    }

    @Override // com.google.android.gms.iid.InterfaceC1350a
    /* JADX INFO: renamed from: a */
    public final void mo7353a(Message message) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, message);
        m9732c(1, parcelM9733o_);
    }
}
