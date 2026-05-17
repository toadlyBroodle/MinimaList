package com.google.android.gms.cast.framework.media;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.bnr;
import com.google.android.gms.internal.bnt;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1028q extends bnr implements InterfaceC1027p {
    C1028q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.IMediaNotificationService");
    }

    @Override // com.google.android.gms.cast.framework.media.InterfaceC1027p
    /* JADX INFO: renamed from: a */
    public final int mo6514a(Intent intent, int i, int i2) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, intent);
        parcelM9733o_.writeInt(i);
        parcelM9733o_.writeInt(i2);
        Parcel parcelM9730a = m9730a(2, parcelM9733o_);
        int i3 = parcelM9730a.readInt();
        parcelM9730a.recycle();
        return i3;
    }

    @Override // com.google.android.gms.cast.framework.media.InterfaceC1027p
    /* JADX INFO: renamed from: a */
    public final IBinder mo6515a(Intent intent) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, intent);
        Parcel parcelM9730a = m9730a(3, parcelM9733o_);
        IBinder strongBinder = parcelM9730a.readStrongBinder();
        parcelM9730a.recycle();
        return strongBinder;
    }

    @Override // com.google.android.gms.cast.framework.media.InterfaceC1027p
    /* JADX INFO: renamed from: a */
    public final void mo6516a() {
        m9731b(1, m9733o_());
    }

    @Override // com.google.android.gms.cast.framework.media.InterfaceC1027p
    /* JADX INFO: renamed from: b */
    public final void mo6517b() {
        m9731b(4, m9733o_());
    }
}
