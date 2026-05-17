package com.google.android.gms.cast.framework;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.bnr;
import com.google.android.gms.internal.bnt;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.aa */
/* JADX INFO: loaded from: classes.dex */
public final class C0994aa extends bnr implements InterfaceC1050z {
    C0994aa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IReconnectionService");
    }

    @Override // com.google.android.gms.cast.framework.InterfaceC1050z
    /* JADX INFO: renamed from: a */
    public final int mo6337a(Intent intent, int i, int i2) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, intent);
        parcelM9733o_.writeInt(i);
        parcelM9733o_.writeInt(i2);
        Parcel parcelM9730a = m9730a(2, parcelM9733o_);
        int i3 = parcelM9730a.readInt();
        parcelM9730a.recycle();
        return i3;
    }

    @Override // com.google.android.gms.cast.framework.InterfaceC1050z
    /* JADX INFO: renamed from: a */
    public final IBinder mo6338a(Intent intent) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, intent);
        Parcel parcelM9730a = m9730a(3, parcelM9733o_);
        IBinder strongBinder = parcelM9730a.readStrongBinder();
        parcelM9730a.recycle();
        return strongBinder;
    }

    @Override // com.google.android.gms.cast.framework.InterfaceC1050z
    /* JADX INFO: renamed from: a */
    public final void mo6339a() {
        m9731b(1, m9733o_());
    }

    @Override // com.google.android.gms.cast.framework.InterfaceC1050z
    /* JADX INFO: renamed from: b */
    public final void mo6340b() {
        m9731b(4, m9733o_());
    }
}
