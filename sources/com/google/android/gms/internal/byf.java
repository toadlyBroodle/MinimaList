package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
public final class byf extends bnr implements byd {
    byf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: A */
    public final String mo5443A() {
        Parcel parcelM9730a = m9730a(31, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: B */
    public final byi mo5444B() {
        byi bykVar;
        Parcel parcelM9730a = m9730a(32, m9733o_());
        IBinder strongBinder = parcelM9730a.readStrongBinder();
        if (strongBinder == null) {
            bykVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            bykVar = iInterfaceQueryLocalInterface instanceof byi ? (byi) iInterfaceQueryLocalInterface : new byk(strongBinder);
        }
        parcelM9730a.recycle();
        return bykVar;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: C */
    public final bxs mo5445C() {
        bxs bxuVar;
        Parcel parcelM9730a = m9730a(33, m9733o_());
        IBinder strongBinder = parcelM9730a.readStrongBinder();
        if (strongBinder == null) {
            bxuVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            bxuVar = iInterfaceQueryLocalInterface instanceof bxs ? (bxs) iInterfaceQueryLocalInterface : new bxu(strongBinder);
        }
        parcelM9730a.recycle();
        return bxuVar;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: D */
    public final void mo5503D() {
        m9731b(9, m9733o_());
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final String mo5549a() {
        Parcel parcelM9730a = m9730a(18, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5450a(bxb bxbVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, bxbVar);
        m9731b(13, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5451a(bxp bxpVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, bxpVar);
        m9731b(20, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5452a(bxs bxsVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, bxsVar);
        m9731b(7, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5453a(byi byiVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, byiVar);
        m9731b(8, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5454a(byp bypVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, bypVar);
        m9731b(21, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5455a(bzd bzdVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, bzdVar);
        m9731b(30, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5456a(bzw bzwVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, bzwVar);
        m9731b(29, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5458a(cbh cbhVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, cbhVar);
        m9731b(19, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5459a(ckp ckpVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, ckpVar);
        m9731b(14, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5460a(ckv ckvVar, String str) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, ckvVar);
        parcelM9733o_.writeString(str);
        m9731b(15, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5461a(InterfaceC1487cu interfaceC1487cu) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC1487cu);
        m9731b(24, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5464a(String str) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        m9731b(25, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: b */
    public final void mo5472b(boolean z) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9737a(parcelM9733o_, z);
        m9731b(22, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: b */
    public final boolean mo5473b(bwx bwxVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, bwxVar);
        Parcel parcelM9730a = m9730a(4, parcelM9733o_);
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: c */
    public final void mo5474c(boolean z) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9737a(parcelM9733o_, z);
        m9731b(34, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: f_ */
    public final String mo5554f_() {
        Parcel parcelM9730a = m9730a(35, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: i */
    public final void mo5479i() {
        m9731b(2, m9733o_());
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: j */
    public final InterfaceC0652a mo5480j() {
        Parcel parcelM9730a = m9730a(1, m9733o_());
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0652aM5328a;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: k */
    public final bxb mo5481k() {
        Parcel parcelM9730a = m9730a(12, m9733o_());
        bxb bxbVar = (bxb) bnt.m9734a(parcelM9730a, bxb.CREATOR);
        parcelM9730a.recycle();
        return bxbVar;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: l */
    public final boolean mo5482l() {
        Parcel parcelM9730a = m9730a(3, m9733o_());
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: m */
    public final void mo5483m() {
        m9731b(11, m9733o_());
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: n */
    public final void mo5484n() {
        m9731b(5, m9733o_());
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: o */
    public final void mo5485o() {
        m9731b(6, m9733o_());
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: p */
    public final void mo5486p() {
        m9731b(10, m9733o_());
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: q */
    public final boolean mo5487q() {
        Parcel parcelM9730a = m9730a(23, m9733o_());
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: r */
    public final byx mo5488r() {
        byx byzVar;
        Parcel parcelM9730a = m9730a(26, m9733o_());
        IBinder strongBinder = parcelM9730a.readStrongBinder();
        if (strongBinder == null) {
            byzVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            byzVar = iInterfaceQueryLocalInterface instanceof byx ? (byx) iInterfaceQueryLocalInterface : new byz(strongBinder);
        }
        parcelM9730a.recycle();
        return byzVar;
    }
}
