package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.bnr;
import com.google.android.gms.internal.bnt;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.ac */
/* JADX INFO: loaded from: classes.dex */
public final class C0996ac extends bnr implements InterfaceC0995ab {
    C0996ac(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISession");
    }

    @Override // com.google.android.gms.cast.framework.InterfaceC0995ab
    /* JADX INFO: renamed from: a */
    public final InterfaceC0652a mo6341a() {
        Parcel parcelM9730a = m9730a(1, m9733o_());
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0652aM5328a;
    }

    @Override // com.google.android.gms.cast.framework.InterfaceC0995ab
    /* JADX INFO: renamed from: a */
    public final void mo6342a(int i) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeInt(i);
        m9731b(12, parcelM9733o_);
    }

    @Override // com.google.android.gms.cast.framework.InterfaceC0995ab
    /* JADX INFO: renamed from: b */
    public final void mo6343b(int i) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeInt(i);
        m9731b(13, parcelM9733o_);
    }

    @Override // com.google.android.gms.cast.framework.InterfaceC0995ab
    /* JADX INFO: renamed from: b */
    public final boolean mo6344b() {
        Parcel parcelM9730a = m9730a(5, m9733o_());
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }

    @Override // com.google.android.gms.cast.framework.InterfaceC0995ab
    /* JADX INFO: renamed from: c */
    public final void mo6345c(int i) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeInt(i);
        m9731b(15, parcelM9733o_);
    }

    @Override // com.google.android.gms.cast.framework.InterfaceC0995ab
    /* JADX INFO: renamed from: c */
    public final boolean mo6346c() {
        Parcel parcelM9730a = m9730a(9, m9733o_());
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }
}
