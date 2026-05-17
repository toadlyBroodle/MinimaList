package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cio extends bnr implements cim {
    cio(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final InterfaceC0652a mo10941a() {
        Parcel parcelM9730a = m9730a(2, m9733o_());
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0652aM5328a;
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10942a(InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        m9731b(21, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10943a(InterfaceC0652a interfaceC0652a, bwx bwxVar, String str, cip cipVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9736a(parcelM9733o_, bwxVar);
        parcelM9733o_.writeString(str);
        bnt.m9735a(parcelM9733o_, cipVar);
        m9731b(3, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10944a(InterfaceC0652a interfaceC0652a, bwx bwxVar, String str, InterfaceC1511dr interfaceC1511dr, String str2) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9736a(parcelM9733o_, bwxVar);
        parcelM9733o_.writeString(str);
        bnt.m9735a(parcelM9733o_, interfaceC1511dr);
        parcelM9733o_.writeString(str2);
        m9731b(10, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10945a(InterfaceC0652a interfaceC0652a, bwx bwxVar, String str, String str2, cip cipVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9736a(parcelM9733o_, bwxVar);
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeString(str2);
        bnt.m9735a(parcelM9733o_, cipVar);
        m9731b(7, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10946a(InterfaceC0652a interfaceC0652a, bwx bwxVar, String str, String str2, cip cipVar, ccm ccmVar, List<String> list) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9736a(parcelM9733o_, bwxVar);
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeString(str2);
        bnt.m9735a(parcelM9733o_, cipVar);
        bnt.m9736a(parcelM9733o_, ccmVar);
        parcelM9733o_.writeStringList(list);
        m9731b(14, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10947a(InterfaceC0652a interfaceC0652a, bxb bxbVar, bwx bwxVar, String str, cip cipVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9736a(parcelM9733o_, bxbVar);
        bnt.m9736a(parcelM9733o_, bwxVar);
        parcelM9733o_.writeString(str);
        bnt.m9735a(parcelM9733o_, cipVar);
        m9731b(1, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10948a(InterfaceC0652a interfaceC0652a, bxb bxbVar, bwx bwxVar, String str, String str2, cip cipVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9736a(parcelM9733o_, bxbVar);
        bnt.m9736a(parcelM9733o_, bwxVar);
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeString(str2);
        bnt.m9735a(parcelM9733o_, cipVar);
        m9731b(6, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10949a(InterfaceC0652a interfaceC0652a, InterfaceC1511dr interfaceC1511dr, List<String> list) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9735a(parcelM9733o_, interfaceC1511dr);
        parcelM9733o_.writeStringList(list);
        m9731b(23, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10950a(bwx bwxVar, String str) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, bwxVar);
        parcelM9733o_.writeString(str);
        m9731b(11, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10951a(bwx bwxVar, String str, String str2) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, bwxVar);
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeString(str2);
        m9731b(20, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: a */
    public final void mo10952a(boolean z) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9737a(parcelM9733o_, z);
        m9731b(25, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: b */
    public final void mo10953b() {
        m9731b(4, m9733o_());
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: c */
    public final void mo10954c() {
        m9731b(5, m9733o_());
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: d */
    public final void mo10955d() {
        m9731b(8, m9733o_());
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: e */
    public final void mo10956e() {
        m9731b(9, m9733o_());
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: f */
    public final void mo10957f() {
        m9731b(12, m9733o_());
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: g */
    public final boolean mo10958g() {
        Parcel parcelM9730a = m9730a(13, m9733o_());
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: h */
    public final civ mo10959h() {
        civ cixVar;
        Parcel parcelM9730a = m9730a(15, m9733o_());
        IBinder strongBinder = parcelM9730a.readStrongBinder();
        if (strongBinder == null) {
            cixVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            cixVar = iInterfaceQueryLocalInterface instanceof civ ? (civ) iInterfaceQueryLocalInterface : new cix(strongBinder);
        }
        parcelM9730a.recycle();
        return cixVar;
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: i */
    public final ciy mo10960i() {
        ciy cjaVar;
        Parcel parcelM9730a = m9730a(16, m9733o_());
        IBinder strongBinder = parcelM9730a.readStrongBinder();
        if (strongBinder == null) {
            cjaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            cjaVar = iInterfaceQueryLocalInterface instanceof ciy ? (ciy) iInterfaceQueryLocalInterface : new cja(strongBinder);
        }
        parcelM9730a.recycle();
        return cjaVar;
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: j */
    public final Bundle mo10961j() {
        Parcel parcelM9730a = m9730a(17, m9733o_());
        Bundle bundle = (Bundle) bnt.m9734a(parcelM9730a, Bundle.CREATOR);
        parcelM9730a.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: k */
    public final Bundle mo10962k() {
        Parcel parcelM9730a = m9730a(18, m9733o_());
        Bundle bundle = (Bundle) bnt.m9734a(parcelM9730a, Bundle.CREATOR);
        parcelM9730a.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: l */
    public final Bundle mo10963l() {
        Parcel parcelM9730a = m9730a(19, m9733o_());
        Bundle bundle = (Bundle) bnt.m9734a(parcelM9730a, Bundle.CREATOR);
        parcelM9730a.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: m */
    public final boolean mo10964m() {
        Parcel parcelM9730a = m9730a(22, m9733o_());
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: n */
    public final cdv mo10965n() {
        Parcel parcelM9730a = m9730a(24, m9733o_());
        cdv cdvVarM10743a = cdw.m10743a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return cdvVarM10743a;
    }

    @Override // com.google.android.gms.internal.cim
    /* JADX INFO: renamed from: o */
    public final byx mo10966o() {
        Parcel parcelM9730a = m9730a(26, m9733o_());
        byx byxVarM10432a = byy.m10432a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return byxVarM10432a;
    }
}
