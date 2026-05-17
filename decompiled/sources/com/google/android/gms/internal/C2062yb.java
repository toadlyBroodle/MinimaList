package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.internal.yb */
/* JADX INFO: loaded from: classes.dex */
public final class C2062yb extends bnr implements InterfaceC2058xy {
    C2062yb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.flags.IFlagProvider");
    }

    @Override // com.google.android.gms.internal.InterfaceC2058xy
    public final boolean getBooleanFlagValue(String str, boolean z, int i) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        bnt.m9737a(parcelM9733o_, z);
        parcelM9733o_.writeInt(i);
        Parcel parcelM9730a = m9730a(2, parcelM9733o_);
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }

    @Override // com.google.android.gms.internal.InterfaceC2058xy
    public final int getIntFlagValue(String str, int i, int i2) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeInt(i);
        parcelM9733o_.writeInt(i2);
        Parcel parcelM9730a = m9730a(3, parcelM9733o_);
        int i3 = parcelM9730a.readInt();
        parcelM9730a.recycle();
        return i3;
    }

    @Override // com.google.android.gms.internal.InterfaceC2058xy
    public final long getLongFlagValue(String str, long j, int i) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeLong(j);
        parcelM9733o_.writeInt(i);
        Parcel parcelM9730a = m9730a(4, parcelM9733o_);
        long j2 = parcelM9730a.readLong();
        parcelM9730a.recycle();
        return j2;
    }

    @Override // com.google.android.gms.internal.InterfaceC2058xy
    public final String getStringFlagValue(String str, String str2, int i) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeString(str2);
        parcelM9733o_.writeInt(i);
        Parcel parcelM9730a = m9730a(5, parcelM9733o_);
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.InterfaceC2058xy
    public final void init(InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        m9731b(1, parcelM9733o_);
    }
}
