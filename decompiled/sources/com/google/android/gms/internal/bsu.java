package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
public final class bsu extends bnr implements bss {
    bsu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.bss
    /* JADX INFO: renamed from: a */
    public final void mo10180a() {
        m9731b(3, m9733o_());
    }

    @Override // com.google.android.gms.internal.bss
    /* JADX INFO: renamed from: a */
    public final void mo10181a(int i) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeInt(i);
        m9731b(6, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.bss
    /* JADX INFO: renamed from: a */
    public final void mo10182a(InterfaceC0652a interfaceC0652a, String str) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        parcelM9733o_.writeString(str);
        m9731b(2, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.bss
    /* JADX INFO: renamed from: a */
    public final void mo10183a(InterfaceC0652a interfaceC0652a, String str, String str2) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeString(null);
        m9731b(8, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.bss
    /* JADX INFO: renamed from: a */
    public final void mo10184a(byte[] bArr) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeByteArray(bArr);
        m9731b(5, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.bss
    /* JADX INFO: renamed from: a */
    public final void mo10185a(int[] iArr) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeIntArray(null);
        m9731b(4, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.bss
    /* JADX INFO: renamed from: b */
    public final void mo10186b(int i) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeInt(i);
        m9731b(7, parcelM9733o_);
    }
}
